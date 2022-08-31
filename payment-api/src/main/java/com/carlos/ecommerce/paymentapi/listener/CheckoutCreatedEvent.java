package com.carlos.ecommerce.paymentapi.listener;

public class CheckoutCreatedEvent {
    public Object getCheckoutCode() {
        return checkoutCode;
    }

    public void setCheckoutCode(Object checkoutCode) {
        this.checkoutCode = checkoutCode;
    }
}
