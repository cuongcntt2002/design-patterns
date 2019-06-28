package com.designpatterns.creational.abstractfactory;

import com.designpatterns.creational.common.XMLParser;

public class NYParserFactory implements AbstractParserFactory {
  @Override
  public XMLParser getParser(String parserType) {
    switch (parserType) {
      case "NYRESPONSEXML": return new NYResponseXMLParser();
      case "NYERRORXML": return new NYErrorXMLParser();
    }
    return null;
  }
}
