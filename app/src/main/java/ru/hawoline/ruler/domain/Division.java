package ru.hawoline.ruler.domain;

public class Division {
  private int width;

  private Division(int width) {
    this.width = width;
  }

  public static Division create(int width) {
    if (width < 1) {
      width = 1;
    }

    return new Division(width);
  }
  public int getWidth() {
    return width;
  }
}
