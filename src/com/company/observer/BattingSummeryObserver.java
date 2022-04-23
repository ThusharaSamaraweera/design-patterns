package com.company.observer;

public class BattingSummeryObserver implements Observer {
  @Override
  public void notifyObserver(MatchStatus status) {
    System.out.println(status.bat1Name + " score: " + status.bat1Score);
    System.out.println(status.bat2Name + " score: " + status.bat2Score);

  }
}
