package com.designpatterns.behavioral.strategy.order;

import com.designpatterns.common.domain.order.Product;

public interface Order {
  long getPrice();
  long getNetPrice();
  long getNetPrice(PricingStrategy strategy);
  void createOrderLine(Product product, int quantity);
}
