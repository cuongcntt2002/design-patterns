package com.designpatterns.behavioral.strategy.order;

public class PercentagePricingStrategy implements PricingStrategy {
  @Override
  public long calculate(Order order) {
    int percentage = 10;
    long amount = order.getPrice();
    return amount - amount / 100 * percentage;
  }
}
