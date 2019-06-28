package com.designpatterns.creational.factorymethod;

import com.designpatterns.creational.common.XMLParser;

public class ErrorXMLDisplayService extends DisplayService {
  @Override
  public XMLParser getParser() {
    return new ErrorsXMLParser();
  }
}
