package ru.hawoline.ruler.domain;

public interface View {
  void showLeftRuler(Ruler ruler);
  void hideLeftRuler();
  void showRightRuler(Ruler ruler);
  void hideRightRuler();
  void showSettings();
  void hideSettings();
}
