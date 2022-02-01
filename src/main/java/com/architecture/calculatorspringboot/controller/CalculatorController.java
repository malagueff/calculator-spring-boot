package com.architecture.calculatorspringboot.controller;

import com.architecture.calculatorspringboot.service.CalculatorService;
import com.architecture.calculatorspringboot.utils.Operation;
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
      @RequestParam(name = "operation") Operation operation) {

    double result = this.calculatorService.calculate(num1, num2, operation);
    return ResponseEntity.ok(result);
  }
}
