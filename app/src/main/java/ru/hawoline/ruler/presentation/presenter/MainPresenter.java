package ru.hawoline.ruler.presentation.presenter;

import ru.hawoline.ruler.domain.Presenter;
import ru.hawoline.ruler.domain.View;

public class MainPresenter implements Presenter {
  private View mainView;

  @Override public void attachView(View view) {
    this.mainView = view;
  }

  @Override public void detachView() {
    this.mainView = null;
  }
}
