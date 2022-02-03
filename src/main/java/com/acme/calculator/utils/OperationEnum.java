package com.acme.calculator.utils;

import java.math.BigDecimal;

/**
 * The enum Operation.
 */
public enum OperationEnum implements Operation {
  /**
   * Add operation.
   */
  ADD("+") {
    @Override
    public Double calculate(BigDecimal num1, BigDecimal num2) {
      return num1.add(num2).doubleValue();
    }
  },
  /**
   * Subtract operation.
   */
  SUBTRACT("-") {
    @Override
    public Double calculate(BigDecimal num1, BigDecimal num2) {
      return num1.subtract(num2).doubleValue();
    }
  };

  String symbol;

  OperationEnum(String symbol) {
    this.symbol = symbol;
  }

  @Override
  public String toString() {
    return symbol;
  }
}
