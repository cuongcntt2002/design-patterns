package com.designpatterns.behavioral.observer;

public class SMSUsers implements Observer {
  private final Subject subject;
  private final String userInfo;
  private String desc;

  public SMSUsers(Subject subject, String userInfo) {
    if (subject == null) {
      throw new IllegalArgumentException("No Publisher found");
    }
    this.subject = subject;
    this.userInfo = userInfo;
  }

  private void display() {
    System.out.println("[" + userInfo + "]: " + desc);
  }

  @Override
  public void update(String desc) {
    this.desc = desc;
    display();
  }

  @Override
  public void subscribe() {
    System.out.println("Subscribing " + userInfo + " to " + subject.subjectDetails() + " ...");
    subject.addObserver(this);
    System.out.println("Subscribed successfully.");
  }

  @Override
  public void unSubscribe() {
    System.out.println("Un-subscribing " + userInfo + " from " + subject.subjectDetails() + " ...");
    subject.removeObserver(this);
    System.out.println("Un-subscribed successfully.");
  }
}
