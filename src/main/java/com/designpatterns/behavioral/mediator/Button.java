package com.designpatterns.behavioral.mediator;

public class Button implements Colleague {
  private MachineMediator mediator = null;

  @Override
  public void setMediator(MachineMediator mediator) {
    this.mediator = mediator;
  }

  public void press() {
    System.out.println("Button pressed.");
    mediator.start();
  }
}
