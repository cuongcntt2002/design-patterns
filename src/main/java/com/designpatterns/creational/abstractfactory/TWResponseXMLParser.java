package com.designpatterns.creational.abstractfactory;

import com.designpatterns.creational.common.XMLParser;

public class TWResponseXMLParser implements XMLParser {
  @Override
  public String parse() {
    System.out.println("Parsing TW Response XML...");
    return "TW Response XML Message";
  }
}
