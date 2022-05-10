package patterns.behavioral.strategy.strategies;


import patterns.behavioral.strategy.domain.Order;

import java.util.List;

public interface OrderStrategy {

    void approveShopCart(List<String> shoppingList, Order order);

    void approveDeliveryInformation(String address, Order order);

    void order(Order order);
}
