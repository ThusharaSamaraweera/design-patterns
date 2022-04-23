package com.company.observer;

public class BallingSummeryObserver implements Observer {
  @Override
  public void notifyObserver(MatchStatus status) {
    System.out.println("Current bowler name: " + status.currentBowlerName);

  }
}
