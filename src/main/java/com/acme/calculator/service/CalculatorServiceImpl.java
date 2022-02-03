package com.acme.calculator.service;

import com.acme.calculator.utils.OperationEnum;

import java.math.BigDecimal;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * The Calculator service.
 */
@Slf4j
@Service
public class CalculatorServiceImpl implements CalculatorService {

  @Override
  public Double calculate(BigDecimal num1, BigDecimal num2, OperationEnum operation) {
    Double result = operation.calculate(num1, num2);
    log.debug("Calculate {} {} {} = {}", num1, operation, num2, result);
    return result;
  }
}
