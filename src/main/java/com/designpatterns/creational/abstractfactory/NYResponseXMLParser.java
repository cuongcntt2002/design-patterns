package com.designpatterns.creational.abstractfactory;

import com.designpatterns.creational.common.XMLParser;

public class NYResponseXMLParser implements XMLParser {
  @Override
  public String parse() {
    System.out.println("Parsing NY Response XML...");
    return "NY Response XML Message";
  }
}
