package com.designpatterns.creational.factorymethod;

import com.designpatterns.creational.common.XMLParser;

public class OrderXMLParser implements XMLParser {
  @Override
  public String parse() {
    System.out.println("Parsing order XML...");
    return "Order XML Message";
  }
}
