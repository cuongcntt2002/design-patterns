package com.designpatterns.behavioral.mediator;

public class Machine implements Colleague {
  private MachineMediator mediator = null;

  @Override
  public void setMediator(MachineMediator mediator) {
    this.mediator = mediator;
  }

  public void start() {
    mediator.open();
  }

}
