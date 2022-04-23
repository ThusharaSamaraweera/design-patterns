package com.company.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
  List<Observer> observerList = new ArrayList<>();

  public  void subscribe(Observer o){
    observerList.add(o);
  }

  public void unSubscribe(Observer o){
    observerList.remove(o);
  }

  public void notifyAllObservers(MatchStatus status){
    for ( Observer o: observerList){
      o.notifyObserver(status);
    }
  }

}
