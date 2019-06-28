package com.designpatterns.creational.factorymethod;

import com.designpatterns.creational.common.XMLParser;

public class ResponseXMLParser implements XMLParser {
  @Override
  public String parse() {
    System.out.println("Parsing response XML...");
    return "Response XML Message";
  }
}
