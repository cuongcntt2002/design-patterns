package com.designpatterns.creational.factorymethod;

import com.designpatterns.creational.common.XMLParser;

public class FeedbackXMLParser implements XMLParser {
  @Override
  public String parse() {
    System.out.println("Parsing feedback XML...");
    return "Feedback XML Message";
  }
}
