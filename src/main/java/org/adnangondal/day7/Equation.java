package org.adnangondal.day7;

import java.util.List;

public class Equation {
  long testValue;
  List<Long> operands;

  public Equation(long testValue, List<Long> operands) {
    this.testValue = testValue;
    this.operands = operands;
  }

  public long getTestValue() {
    return testValue;
  }

  public List<Long> getOperands() {
    return operands;
  }

  public void setTestValue(long testValue) {
    this.testValue = testValue;
  }

  public void setOperands(List<Long> operands) {
    this.operands = operands;
  }
}
