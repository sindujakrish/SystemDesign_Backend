package ie.wellbeing.service;

import com.stripe.model.Charge;
import ie.wellbeing.service.impl.PaymentStripeServiceImpl;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;
import org.mockito.Mockito;

import static org.assertj.core.api.Assertions.assertThat;


public class PaymentStripeServiceImplTest {


    PaymentStripeServiceImpl paymentStripeServiceImpl = new PaymentStripeServiceImpl();

    @Test
    public void shouldCreateCharge_SuccessCase() {
        try (MockedStatic<Charge> charge = Mockito.mockStatic(Charge.class)) {
            Charge mockCharge = new Charge();
            mockCharge.setId("123");
            charge.when(() -> Charge.create(Mockito.anyMap()))
                    .thenReturn(mockCharge);
            String actualChargeId = paymentStripeServiceImpl.createCharge("testMail", "testToken", 123);
            assertThat(actualChargeId).isEqualTo("123");
        }
    }

}
