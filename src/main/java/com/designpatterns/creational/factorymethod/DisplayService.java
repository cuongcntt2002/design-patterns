package com.designpatterns.creational.factorymethod;

import com.designpatterns.creational.common.XMLParser;

public abstract class DisplayService {
  public void display() {
    XMLParser parser = getParser();
    System.out.println(parser.parse());
  }
  public abstract XMLParser getParser();
}
