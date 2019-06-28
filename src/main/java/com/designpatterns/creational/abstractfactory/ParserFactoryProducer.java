package com.designpatterns.creational.abstractfactory;

import java.util.HashMap;
import java.util.Map;

public final class ParserFactoryProducer {
  private static Map<String, AbstractParserFactory> factories = new HashMap<>();

  private ParserFactoryProducer() {
    throw new AssertionError();
  }

  public static AbstractParserFactory getFactory(String factoryType) {
    AbstractParserFactory factory = factories.get(factoryType);
    if (factory == null) {
      switch (factoryType) {
        case "NY": factory = new NYParserFactory(); break;
        case "TW": factory = new TWParserFactory(); break;
      }
      if (factory != null) {
        factories.put(factoryType, factory);
      }
    }
    return factory;
  }
}
