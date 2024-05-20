package ru.hawoline.ruler.presentation.view;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import ru.hawoline.ruler.R;
import ru.hawoline.ruler.domain.Ruler;
import ru.hawoline.ruler.domain.View;

public class MainActivity extends AppCompatActivity implements View {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
  }

  @Override public void showLeftRuler(Ruler ruler) {

  }

  @Override public void hideLeftRuler() {

  }

  @Override public void showRightRuler(Ruler ruler) {

  }

  @Override public void hideRightRuler() {

  }

  @Override public void showSettings() {

  }

  @Override public void hideSettings() {

  }
}