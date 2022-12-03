package com.brzzznko.apigateway.order.service;

import com.brzzznko.apigateway.order.model.OrderDTO;
import com.brzzznko.apigateway.order.model.entity.Order;
import com.brzzznko.apigateway.order.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final OrderRepository repository;

    public List<OrderDTO> getOrders(Long clientId) {
        return repository.findAllByClientId(clientId)
                         .stream()
                         .map(this::buildResponseDto)
                         .collect(Collectors.toList());
    }

    private OrderDTO buildResponseDto(Order order) {
        return OrderDTO.builder().id(order.getId()).productId(order.getProductId()).build();
    }

}
