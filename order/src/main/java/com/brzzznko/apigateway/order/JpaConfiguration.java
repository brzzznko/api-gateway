package com.brzzznko.apigateway.order;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EntityScan("com.brzzznko.apigateway")
@EnableJpaRepositories("com.brzzznko.apigateway")
public class JpaConfiguration {

}

