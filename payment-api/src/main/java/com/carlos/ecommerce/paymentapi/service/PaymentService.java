package com.carlos.ecommerce.paymentapi.service;

import com.carlos.ecommerce.paymentapi.entity.PaymentEntity;
import com.carlos.ecommerce.paymentapi.listener.CheckoutCreatedEvent;

import java.util.Optional;

public interface PaymentService {
Optional<PaymentEntity> create(CheckoutCreatedEvent checkoutCreatedEvent);

    Optional<PaymentEntity> create(CheckoutCreatedEvent checkoutCreatedEvent);
}
