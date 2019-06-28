package com.designpatterns.creational.abstractfactory;

import com.designpatterns.creational.common.XMLParser;

public class TestAbstractFactory {
  public static void main(String[] args) {
    XMLParser parser = ParserFactoryProducer.getFactory("NY").getParser("NYRESPONSEXML");
    System.out.println(parser.parse());

    System.out.println("************************************");

    parser = ParserFactoryProducer.getFactory("TW").getParser("TWERRORXML");
    System.out.println(parser.parse());
  }
}
