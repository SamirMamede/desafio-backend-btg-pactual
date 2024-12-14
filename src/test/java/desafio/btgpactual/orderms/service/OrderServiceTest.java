package desafio.btgpactual.orderms.service;

import desafio.btgpactual.orderms.repository.OrderRepository;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.data.mongodb.core.MongoTemplate;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class OrderServiceTest {

    @Mock
    OrderRepository orderRepository;

    @Mock
    MongoTemplate mongoTemplate;

    @InjectMocks
    OrderService orderService;

    @Nested
    class Save {

        @Test
        void shouldCallRepositorySave() {

        }

        @Test
        void shouldMapEventToEntityWithSuccess() {

        }

        @Test
        void shouldCalculateOrderTotalWithSuccess() {

        }
    }

}