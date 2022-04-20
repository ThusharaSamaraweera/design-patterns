package com.company.singleton;

public class Main {
  public static void main(String[] args) {
    Clipboard clipboard1 = Clipboard.getInstance();
    Clipboard clipboard2 = Clipboard.getInstance();

    clipboard1.copy("abc");
    clipboard1.paste();     // abc
    clipboard2.paste();     // abc

    clipboard2.copy("pqr");

    clipboard1.paste();     // pqr
    clipboard2.paste();     // pqr
  }
}
