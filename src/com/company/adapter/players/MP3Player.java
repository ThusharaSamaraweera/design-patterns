package com.company.adapter.players;

import com.company.adapter.Player;

public class MP3Player implements Player {
  @Override
  public void play(String fileName) {
    System.out.println("Playing mp3 file: "+ fileName);
  }
}
