package patterns.behavioral.strategy.managers;


import patterns.behavioral.strategy.domain.Order;
import patterns.behavioral.strategy.strategies.OrderStrategy;

import java.util.List;
import java.util.function.Supplier;

public class OrderManager<OS extends OrderStrategy> {

    private OS orderStrategy;

    public OrderManager(Supplier<? extends OS> orderStrategy) {
        this.orderStrategy = orderStrategy.get();
    }

    public void placeOrder(List<String> productList, Order order, String address) {
        order.setAddress(address);
        orderStrategy.approveShopCart(productList, order);
        orderStrategy.approveDeliveryInformation(address, order);
        orderStrategy.order(order);
    }
}
