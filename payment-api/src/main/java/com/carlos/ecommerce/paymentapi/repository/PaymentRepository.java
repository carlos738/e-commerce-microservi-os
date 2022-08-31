package com.carlos.ecommerce.paymentapi.repository;

import com.carlos.ecommerce.paymentapi.entity.PaymentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<PaymentEntity, Long> {
}
