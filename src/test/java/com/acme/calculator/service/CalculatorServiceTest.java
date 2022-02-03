package com.acme.calculator.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.acme.calculator.utils.OperationEnum;
import java.math.BigDecimal;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class CalculatorServiceTest {

  @InjectMocks
  private CalculatorServiceImpl calculatorService;

  @Test
  void givenNum1AndNum2AndOperationAdd_whenCalculate_thenResponseOk() {
    double result = calculatorService.calculate(BigDecimal.ONE, BigDecimal.TEN, OperationEnum.ADD);
    assertEquals(11, result);
  }

  @Test
  void givenNum1AndNum2AndOperationSubtract_whenCalculate_thenResponseOk() {
    double result = calculatorService.calculate(BigDecimal.ONE, BigDecimal.TEN,
        OperationEnum.SUBTRACT);
    assertEquals(-9, result);
  }
}