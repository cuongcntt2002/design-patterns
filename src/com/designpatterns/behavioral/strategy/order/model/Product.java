package com.designpatterns.behavioral.strategy.order.model;

public interface Product {
  void operation();
  String getId();
  String getGroup();
  String getDescription();
  long getPrice();
}
