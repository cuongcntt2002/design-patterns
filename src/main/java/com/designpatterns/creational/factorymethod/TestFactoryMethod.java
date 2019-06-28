package com.designpatterns.creational.factorymethod;

public class TestFactoryMethod {
  public static void main(String[] args) {
    DisplayService service = new FeedbackXMLDisplayService();
    service.display();

    service = new ErrorXMLDisplayService();
    service.display();

    service = new OrderXMLDisplayService();
    service.display();

    service = new ResponseXMLDisplayService();
    service.display();
  }
}