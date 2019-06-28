package com.designpatterns.creational.factorymethod;

import com.designpatterns.creational.common.XMLParser;

public class ResponseXMLDisplayService extends DisplayService {
  @Override
  public XMLParser getParser() {
    return new ResponseXMLParser();
  }
}
