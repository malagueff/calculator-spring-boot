package com.acme.calculator.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

import com.acme.calculator.service.CalculatorService;
import com.acme.calculator.utils.OperationEnum;
import io.corp.calculator.TracerImpl;
import java.math.BigDecimal;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@ExtendWith(MockitoExtension.class)
class CalculatorControllerTest {

  public static final BigDecimal NUM1 = BigDecimal.ONE;
  public static final BigDecimal NUM2 = BigDecimal.TEN;

  @InjectMocks
  private CalculatorController calculatorController;

  @Mock
  private CalculatorService calculatorService;

  @Mock
  private TracerImpl tracer;

  @Test
  void givenNum1AndNum2AndOperationAdd_whenCalculate_thenResponseOk() {
    Double numResult = 11.0;
    when(this.calculatorService.calculate(NUM1, NUM2, OperationEnum.ADD)).thenReturn(numResult);
    ResponseEntity<Double> result = calculatorController.calculate(BigDecimal.ONE, BigDecimal.TEN,
        OperationEnum.ADD);
    assertNotNull(result);
    assertEquals(HttpStatus.OK, result.getStatusCode());
    assertEquals(numResult, result.getBody());
  }

  @Test
  void givenNum1AndNum2AndOperationSubtract_whenCalculate_thenResponseOk() {
    Double numResult = -9.0;
    when(this.calculatorService.calculate(NUM1, NUM2, OperationEnum.SUBTRACT)).thenReturn(
        numResult);
    ResponseEntity<Double> result = calculatorController.calculate(BigDecimal.ONE, BigDecimal.TEN,
        OperationEnum.SUBTRACT);
    assertNotNull(result);
    assertEquals(HttpStatus.OK, result.getStatusCode());
    assertEquals(numResult, result.getBody());
  }
}