package com.designpatterns.creational.abstractfactory;

import com.designpatterns.creational.common.XMLParser;

public class TWErrorXMLParser implements XMLParser {
  @Override
  public String parse() {
    System.out.println("Parsing TW Error XML...");
    return "TW Error XML Message";
  }
}
