package com.designpatterns.behavioral.mediator;

public class CottonMediator implements MachineMediator {
  private final Machine machine;
  private final Heater heater;
  private final Valve valve;
  private final Motor motor;
  private final Sensor sensor;
  private final SoilRemoval soilRemoval;

  public CottonMediator(Machine machine, Heater heater, Motor motor, Sensor sensor, Valve valve, SoilRemoval soilRemoval) {
    this.machine = machine;
    this.heater = heater;
    this.valve = valve;
    this.motor = motor;
    this.sensor = sensor;
    this.soilRemoval = soilRemoval;
    System.out.println("Setting up for Cotton program...");
  }

  @Override
  public void start() {
    machine.start();
  }

  @Override
  public void wash() {
    motor.startMotor();
    motor.rotateDrum(700);
    System.out.println("Adding detergent");
    soilRemoval.low();
    System.out.println("Adding softener");
  }

  @Override
  public void open() {
    valve.open();
  }

  @Override
  public void closed() {
    valve.closed();
  }

  @Override
  public void on() {
    heater.on(40);
  }

  @Override
  public void off() {
    heater.off();
  }

  @Override
  public boolean checkTemperature(int temp) {
    return sensor.checkTemperature(temp);
  }
}
