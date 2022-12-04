package com.brzzznko.apigateway.gateway.service;

import com.brzzznko.apigateway.customer.api.dto.CustomerDTO;
import com.brzzznko.apigateway.gateway.clients.CustomerClient;
import com.brzzznko.apigateway.gateway.clients.OrderClient;
import com.brzzznko.apigateway.gateway.clients.ProductClient;
import com.brzzznko.apigateway.gateway.model.OrderInfo;
import com.brzzznko.apigateway.gateway.model.OrdersDTO;
import com.brzzznko.apigateway.order.api.model.OrderDTO;
import com.brzzznko.apigateway.product.api.ProductDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class OrdersRequestAggregator {

    private final ExecutorService executor = Executors.newCachedThreadPool();

    private final OrderClient orderClient;
    private final ProductClient productClient;
    private final CustomerClient customerClient;

    public OrdersDTO getOrders(Long id) {
        Future<CustomerDTO> customerTask = executor.submit(() -> customerClient.getCustomerInfo(id));
        Future<List<OrderInfo>> ordersTask = executor.submit(() -> getOrdersInfo(id));

        CustomerDTO customer;
        List<OrderInfo> orders;
        try {
            customer = customerTask.get();
            orders = ordersTask.get();
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }

        return OrdersDTO.builder().customerName(customer.getName()).orders(orders).build();
    }

    private List<OrderInfo> getOrdersInfo(Long id) {
        List<OrderDTO> orders = orderClient.getOrders(id);
        return orders.stream().map(this::getOrderInfo).collect(Collectors.toList());
    }

    private OrderInfo getOrderInfo(OrderDTO order) {
        ProductDTO product = productClient.getProductInfo(order.getProductId());
        return OrderInfo.builder()
                        .id(order.getId())
                        .productId(product.getId())
                        .productTitle(product.getTitle())
                        .build();
    }

}
