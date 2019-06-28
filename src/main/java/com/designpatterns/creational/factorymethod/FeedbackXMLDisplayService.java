package com.designpatterns.creational.factorymethod;

import com.designpatterns.creational.common.XMLParser;

public class FeedbackXMLDisplayService extends DisplayService {
  @Override
  public XMLParser getParser() {
    return new FeedbackXMLParser();
  }
}
