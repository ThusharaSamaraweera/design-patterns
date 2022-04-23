package com.company.adapter.players;

import com.company.adapter.Player;

public class MP4Player implements Player {
  @Override
  public void play(String fileName) {
    System.out.println("Playing mp4 file: "+ fileName);
  }
}
