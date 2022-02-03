package com.acme.calculator.controller;

import com.acme.calculator.service.CalculatorService;
import com.acme.calculator.utils.OperationEnum;
import io.corp.calculator.TracerImpl;
import java.math.BigDecimal;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * The Calculator controller.
 */
@RestController
@RequestMapping(value = "/api")
@RequiredArgsConstructor
public class CalculatorController {

  private final CalculatorService calculatorService;
  private final TracerImpl tracer;

  /**
   * Calculate response entity.
   *
   * @param num1      the num 1
   * @param num2      the num 2
   * @param operation the operation
   * @return the response entity
   */
  @GetMapping(value = "/calculate")
  public ResponseEntity<Double> calculate(@RequestParam(name = "num1") BigDecimal num1,
      @RequestParam(name = "num2") BigDecimal num2,
      @RequestParam(name = "operation") OperationEnum operation) {

    double result = this.calculatorService.calculate(num1, num2, operation);
    tracer.trace(result);
    return ResponseEntity.ok(result);
  }
}
