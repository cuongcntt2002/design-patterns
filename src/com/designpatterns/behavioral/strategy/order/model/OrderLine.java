package com.designpatterns.behavioral.strategy.order.model;

public interface OrderLine {
  Product getProduct();
  int getQuantity();
  long getPrice();
}
