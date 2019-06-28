package com.designpatterns.creational.abstractfactory;

import com.designpatterns.creational.common.XMLParser;

public interface AbstractParserFactory {
  XMLParser getParser(String parserType);
}
