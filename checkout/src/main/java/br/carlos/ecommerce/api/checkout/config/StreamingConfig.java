package br.carlos.ecommerce.api.checkout.config;
import br.carlos.ecommerce.api.checkout.streaming.CheckoutCreatedSource;
import br.carlos.ecommerce.api.checkout.streaming.PaymentPaidSink;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableBinding(value = {
        CheckoutCreatedSource.class,
        PaymentPaidSink.class
})
public class StreamingConfig {
}
