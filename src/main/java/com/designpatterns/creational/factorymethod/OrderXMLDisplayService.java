package com.designpatterns.creational.factorymethod;

import com.designpatterns.creational.common.XMLParser;

public class OrderXMLDisplayService extends DisplayService {
  @Override
  public XMLParser getParser() {
    return new OrderXMLParser();
  }
}
