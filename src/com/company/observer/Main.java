package com.company.observer;

public class Main {
  public static void main(String[] args) {

    Subject subject = new Subject();
    Observer battingSummery = new BattingSummeryObserver();
    Observer ballingSummery = new BallingSummeryObserver();
    Observer matchSummery = new MatchSummeryObserver();

    subject.subscribe(ballingSummery);
    subject.subscribe(battingSummery);
    subject.subscribe(matchSummery);

    MatchStatus status = new MatchStatus();
    status.bat1Name = "Mahela jayawarghane";
    status.bat2Name = "Kumara sangakkara";
    status.bat1Score = 34;
    status.bat2Score = 22;
    status.currentBowlerName = "Shane warne";
    status.team1Score = 102;
    status.team2Score = 0;

    subject.notifyAllObservers(status);



  }
}
