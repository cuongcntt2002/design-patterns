package com.designpatterns.common.domain.order;

public interface OrderLine {
  Product getProduct();
  int getQuantity();
  long getPrice();
}