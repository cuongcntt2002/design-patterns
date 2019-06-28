package com.designpatterns.creational.factorymethod;

import com.designpatterns.creational.common.XMLParser;

public class ErrorsXMLParser implements XMLParser {
  @Override
  public String parse() {
    System.out.println("Parsing error XML...");
    return "Error XML Message";
  }
}
