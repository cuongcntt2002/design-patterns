package com.designpatterns.common.domain.order;

public class SalesOrderLine implements OrderLine {
  private final Product product;
  private final int quantity;

  public SalesOrderLine(Product product, int quantity) {
    this.product = product;
    this.quantity = quantity;
  }

  @Override
  public Product getProduct() {
    return product;
  }

  @Override
  public int getQuantity() {
    return quantity;
  }

  @Override
  public long getPrice() {
    return product.getPrice() * quantity;
  }
}
