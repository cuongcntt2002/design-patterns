package com.designpatterns.creational.abstractfactory;

import com.designpatterns.creational.common.XMLParser;

public class TWParserFactory implements AbstractParserFactory {
  @Override
  public XMLParser getParser(String parserType) {
    switch (parserType) {
      case "TWRESPONSEXML": return new TWResponseXMLParser();
      case "TWERRORXML": return new TWErrorXMLParser();
    }
    return null;
  }
}
