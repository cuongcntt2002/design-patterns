package com.designpatterns.behavioral.strategy.order;

import com.designpatterns.behavioral.strategy.order.model.Product;
import com.designpatterns.behavioral.strategy.order.model.SalesProduct;

public class ProductOrderingApp {
  public static void main(String[] args) {
    Order order = new SalesOrder(new PercentagePricingStrategy());
    Product product1A = new SalesProduct("1A", "01", "Product 1A", 100);
    Product product1B = new SalesProduct("1B", "01", "Product 1B", 200);
    order.createOrderLine(product1A, 1);
    order.createOrderLine(product1B, 1);

    System.out.println("(1) Total order brutto price ...................................: " + order.getPrice());
    System.out.println("(2) using the default percentage pricing strategy (10%) ........: " + order.getNetPrice());
    System.out.println("(3) changing to threshold pricing strategy (10%; above 200: 20%): " + order.getNetPrice(new ThresholdPricingStrategy()));
  }
}
