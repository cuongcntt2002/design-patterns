package com.designpatterns.creational.abstractfactory;

import com.designpatterns.creational.common.XMLParser;

public class NYErrorXMLParser implements XMLParser {
  @Override
  public String parse() {
    System.out.println("Parsing NY Error XML...");
    return "NY Error XML Message";
  }
}
