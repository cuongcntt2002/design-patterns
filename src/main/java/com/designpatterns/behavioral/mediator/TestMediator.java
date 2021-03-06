package com.designpatterns.behavioral.mediator;

public class TestMediator {
  public static void main(String[] args) {
    Sensor sensor = new Sensor();
    SoilRemoval soilRemoval = new SoilRemoval();
    Motor motor = new Motor();
    Machine machine = new Machine();
    Heater heater = new Heater();
    Valve valve = new Valve();
    Button button = new Button();

    MachineMediator mediator = new CottonMediator(machine, heater, motor, sensor, valve, soilRemoval);

    button.setMediator(mediator);
    machine.setMediator(mediator);
    heater.setMediator(mediator);
    valve.setMediator(mediator);

    button.press();

//    System.out.println("******************************************************************************");
//    mediator = new DenimMediator(machine, heater, motor, sensor, soilRemoval, valve);
//
//    button.setMediator(mediator);
//    machine.setMediator(mediator);
//    heater.setMediator(mediator);
//    valve.setMediator(mediator);
//
//    button.press();
  }
}
