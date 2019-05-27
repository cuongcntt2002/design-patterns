package com.designpatterns.behavioral.strategy.order;

public interface PricingStrategy {
  long calculate(Order order);
}
