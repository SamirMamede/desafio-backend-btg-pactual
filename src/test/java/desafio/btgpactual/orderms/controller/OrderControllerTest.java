package desafio.btgpactual.orderms.controller;

import desafio.btgpactual.orderms.service.OrderService;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class OrderControllerTest {

    @Mock
    OrderService orderService;

    @InjectMocks
    OrderController orderController;

    @Nested
    class ListOrders {

        @Test
        void shouldReturnHttpOk() {

        }

        @Test
        void shouldCorrectParamtersToService() {

        }

        @Test
        void shouldReturnResponseBodyCorrect() {

        }
    }

}