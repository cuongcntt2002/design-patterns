package com.designpatterns.common.domain.order;

public interface Product {
  void operation();
  String getId();
  String getGroup();
  String getDescription();
  long getPrice();
}
