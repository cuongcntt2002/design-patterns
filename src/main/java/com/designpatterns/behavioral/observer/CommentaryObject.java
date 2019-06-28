package com.designpatterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class CommentaryObject implements Subject, Commentary {
  private final List<Observer> observers;
  private final String subjectDetails;
  private String desc;

  public CommentaryObject(List<Observer> observers, String subjectDetails) {
    this.observers = observers;
    this.subjectDetails = subjectDetails;
  }

  @Override
  public void addObserver(Observer observer) {
    observers.add(observer);
  }

  @Override
  public void removeObserver(Observer observer) {
    observers.remove(observer);
  }

  @Override
  public void notifyObservers() {
    System.out.println();
    for (Observer observer : observers) {
      observer.update(this.desc);
    }
  }

  @Override
  public String subjectDetails() {
    return subjectDetails;
  }

  @Override
  public void setDesc(String desc) {
    this.desc = desc;
    notifyObservers();
  }
}
