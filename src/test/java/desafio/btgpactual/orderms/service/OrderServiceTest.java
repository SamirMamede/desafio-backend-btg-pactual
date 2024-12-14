package desafio.btgpactual.orderms.service;

import desafio.btgpactual.orderms.factory.OrderCreatedEventFactory;
import desafio.btgpactual.orderms.repository.OrderRepository;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.data.mongodb.core.MongoTemplate;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

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

            var event = OrderCreatedEventFactory.build();

            orderService.save(event);

            verify(orderRepository, times(1)).save(any());

        }

        @Test
        void shouldMapEventToEntityWithSuccess() {

        }

        @Test
        void shouldCalculateOrderTotalWithSuccess() {

        }
    }

}