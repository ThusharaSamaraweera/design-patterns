package com.company.adapter;

import com.company.adapter.players.MP3Player;
import com.company.adapter.players.MP4Player;

public class MediaPlayer {
  public static void main(String[] args) {
    String filename = "c://documents/my-song.mp3";
//    String filename = "c://documents/my-song.jpg";

    Player player = null;
    if(filename.endsWith("mp3")){
      player = new MP3Player();

    } else if(filename.endsWith("mp4")){
      player = new MP4Player();

    } else if(filename.endsWith("jpg")){
      ImageDisplay imageDisplay = new ImageDisplay();
      player = new ImageAdaptor(imageDisplay);
    }

    player.play(filename);
  }
}
