package com.acme.calculator.service;

import com.acme.calculator.utils.OperationEnum;
import java.math.BigDecimal;

/**
 * The interface Calculator service.
 */
public interface CalculatorService {

  /**
   * Calculate double.
   *
   * @param num1      the num 1
   * @param num2      the num 2
   * @param operation the operation
   * @return the double
   */
  Double calculate(BigDecimal num1, BigDecimal num2, OperationEnum operation);
}
