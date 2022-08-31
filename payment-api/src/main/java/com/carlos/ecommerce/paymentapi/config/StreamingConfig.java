package com.carlos.ecommerce.paymentapi.config;

import com.carlos.ecommerce.paymentapi.streaming.CheckoutProcessor;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.context.annotation.Configuration;
@EnableBinding(CheckoutProcessor.class)
@Configuration
public class StreamingConfig {
}
