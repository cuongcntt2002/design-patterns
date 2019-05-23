package com.designpatterns.behavioral.strategy.order;

import com.designpatterns.behavioral.strategy.order.model.OrderLine;
import com.designpatterns.behavioral.strategy.order.model.Product;
import com.designpatterns.behavioral.strategy.order.model.SalesOrderLine;

import java.util.ArrayList;
import java.util.List;

public class SalesOrder implements Order {
  private PricingStrategy strategy;
  private List<OrderLine> orderLines = new ArrayList<>();

  public SalesOrder(PricingStrategy strategy) {
    this.strategy = strategy;
  }

  @Override
  public long getPrice() {
    long total = 0;
    for (OrderLine orderLine: orderLines) {
      total += orderLine.getPrice();
    }
    return total;
  }

  @Override
  public long getNetPrice() {
    // delegate the calculation to the default strategy,
    // pass a reference to itself so that the strategy can act (call back) through the Order interface
    return strategy.calculate(this);
  }

  @Override
  public long getNetPrice(PricingStrategy strategy) {
    return strategy.calculate(this);
  }

  @Override
  public void createOrderLine(Product product, int quantity) {
    orderLines.add(new SalesOrderLine(product, quantity));
  }
}
