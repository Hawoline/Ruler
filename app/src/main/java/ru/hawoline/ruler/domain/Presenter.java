package ru.hawoline.ruler.domain;

public interface Presenter {
  void attachView(View view);
  void detachView();
}
