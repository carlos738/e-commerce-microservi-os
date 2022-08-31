package br.carlos.ecommerce.api.checkout.service;
import br.carlos.ecommerce.api.checkout.entity.CheckoutEntity;
import br.carlos.ecommerce.api.checkout.resource.CheckoutRequest;

import java.util.Optional;

public interface CheckoutService {

    Optional<CheckoutEntity> create(CheckoutRequest checkoutRequest);

    Optional<CheckoutEntity> updateStatus(String checkoutCode, CheckoutEntity.Status status);
}
