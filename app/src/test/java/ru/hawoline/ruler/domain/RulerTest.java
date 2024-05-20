package ru.hawoline.ruler.domain;

import java.util.ArrayList;
import java.util.List;
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RulerTest {
  private Ruler ruler;

  @Before
  public void initRuler() {
    ruler = Ruler.create(3, 5, 60, UnitName.MM);
  }

  @Test
  public void changeDistanceBetweenDivisions() {
    ruler.changeDistanceBetweenDivisions(-90);
    TestCase.assertEquals(3, ruler.getDistanceBetweenDivisions());
    TestCase.assertEquals(20, ruler.getDivisions().size());
    ruler.changeDistanceBetweenDivisions(-1);
    TestCase.assertEquals(2, ruler.getDistanceBetweenDivisions());
    TestCase.assertEquals(30, ruler.getDivisions().size());
  }
}