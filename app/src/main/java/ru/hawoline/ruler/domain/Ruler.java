package ru.hawoline.ruler.domain;

import java.util.ArrayList;
import java.util.List;

public final class Ruler {
  private final List<Division> divisions;
  private int distanceBetweenDivisions;
  private UnitName unit;
  private int indexOfBigDivision;

  private static final int DIVISION_WIDTH = 5;
  private static final int BIG_DIVISION_WIDTH = 10;

  private Ruler(List<Division> divisions, int distanceBetweenDivisions, UnitName unit,
      int indexOfBigDivision) {
    this.divisions = divisions;
    this.distanceBetweenDivisions = distanceBetweenDivisions;
    this.unit = unit;
    this.indexOfBigDivision = indexOfBigDivision;
  }

  public static Ruler create(int distanceBetweenDivisions,
      int indexOfBigDivision, int height, UnitName unit) {

    if (distanceBetweenDivisions < 1) {
      distanceBetweenDivisions = 1;
    }
    if (indexOfBigDivision < 1) {
      indexOfBigDivision = 1;
    }
    if (height < 2) {
      height = 2;
    }
    List<Division> divisions = new ArrayList<>();
    int divisionsSize = height / distanceBetweenDivisions;
    for (int i = 0; i < divisionsSize; i++) {
      int divisionWidth = i % indexOfBigDivision == 0 ? BIG_DIVISION_WIDTH : DIVISION_WIDTH;
      divisions.add(Division.create(divisionWidth));
    }

    return new Ruler(divisions, distanceBetweenDivisions, unit, indexOfBigDivision);
  }

  public void changeDistanceBetweenDivisions(int distance) {
    if (distance == 0 || distanceBetweenDivisions + distance < 1) {
      return;
    }

    int rulerHeight = distanceBetweenDivisions * divisions.size();
    int newDivisionsSize = rulerHeight / (distanceBetweenDivisions + distance);
    if (distance > 0) {
      removeDivisions(newDivisionsSize);
    } else {
      addDivisions(newDivisionsSize);
    }
    distanceBetweenDivisions += distance;
  }

  private void removeDivisions(int newDivisionsSize) {
    for (int i = 0; i < divisions.size() - newDivisionsSize; i++) {
      divisions.remove(divisions.size() - 1);
    }
  }

  private void addDivisions(int newDivisionsSize) {
    int newDivisionsCount = newDivisionsSize - divisions.size();
    for (int i = 0; i < newDivisionsCount; i++) {
      int divisionWidth = i % indexOfBigDivision == 0 ? BIG_DIVISION_WIDTH : DIVISION_WIDTH;
      divisions.add(Division.create(divisionWidth));
    }
  }

  public List<Division> getDivisions() {
    return divisions;
  }

  public int getDistanceBetweenDivisions() {
    return distanceBetweenDivisions;
  }

  public UnitName getUnit() {
    return unit;
  }

  public int getIndexOfBigDivision() {
    return indexOfBigDivision;
  }
}
