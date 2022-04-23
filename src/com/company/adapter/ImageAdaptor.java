package com.company.adapter;

public class ImageAdaptor implements Player{
  ImageDisplay imageDisplay;
  public ImageAdaptor(ImageDisplay imageDisplay){
    this.imageDisplay = imageDisplay;
  }

  @Override
  public void play(String fileName) {
    imageDisplay.show(fileName);
  }
}
