package com.company.observer;

public class MatchSummeryObserver implements Observer {
  @Override
  public void notifyObserver(MatchStatus status) {
    System.out.println("Team 1 score: " + status.team1Score);
    System.out.println("Team 2 score: " + status.team2Score);
  }
}
