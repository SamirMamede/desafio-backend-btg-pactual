package desafio.btgpactual.orderms.service;

import desafio.btgpactual.orderms.entity.OrderEntity;
import desafio.btgpactual.orderms.entity.OrderItem;
import desafio.btgpactual.orderms.listener.dto.OrderCreatedEvent;
import desafio.btgpactual.orderms.repository.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public void save(OrderCreatedEvent event) {

        var entity = new OrderEntity();
        entity.setOrderId(event.codigoPedido());
        entity.setCustomerId(event.codigoCliente());
//      entity.setTotal();
        entity.setItems(getOrderItems(event));
    }

    private static List<OrderItem> getOrderItems(OrderCreatedEvent event) {
        return event.itens().stream()
                .map(i -> new OrderItem(i.produto(), i.quantidade(), i.preco()))
                .toList();
    }
}
