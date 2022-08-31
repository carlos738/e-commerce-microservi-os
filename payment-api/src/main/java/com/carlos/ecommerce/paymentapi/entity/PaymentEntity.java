package com.carlos.ecommerce.paymentapi.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@EnableJpaAuditing
@EntityListeners(AuditingEntityListener.class)
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaymentEntity {
@Id
    @GeneratedValue
    private Long id;

@Column
    private String code;

@Column
    private String checkoutcode;

@CreatedDate
    private LocalDateTime createdAt;

@LastModifiedDate
    private LocalDateTime updateAt;
    private Object checkoutCode;

    public Object getCheckoutCode() {
        return checkoutCode;
    }

    public void setCheckoutCode(Object checkoutCode) {
        this.checkoutCode = checkoutCode;
    }
}
