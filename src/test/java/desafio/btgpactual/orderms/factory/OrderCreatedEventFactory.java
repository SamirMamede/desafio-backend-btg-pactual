package desafio.btgpactual.orderms.factory;

import desafio.btgpactual.orderms.listener.dto.OrderCreatedEvent;
import desafio.btgpactual.orderms.listener.dto.OrderItemEvent;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class OrderCreatedEventFactory {

    public static OrderCreatedEvent build() {

        var items = new OrderItemEvent("notebook", 1, BigDecimal.valueOf(20.50));
        var event = new OrderCreatedEvent(1L, 2L, List.of(items));

        return event;
    }
}
