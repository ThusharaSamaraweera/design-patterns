package com.company.singleton;

public class Clipboard {
  private String content;

  private static Clipboard instance = null;

  private Clipboard(){

  }

  // only one object will create
  public static Clipboard getInstance(){
    if(instance == null){
      instance = new Clipboard();
    }

    return instance;
  }

  public void copy(String c){
    this.content = c;
  }

  public void paste(){
    System.out.println(this.content);
  }

}
