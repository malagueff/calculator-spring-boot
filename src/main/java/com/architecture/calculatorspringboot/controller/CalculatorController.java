package com.architecture.calculatorspringboot.controller;

import java.math.BigDecimal;
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
public class CalculatorController {

  /**
   * Calculate response entity.
   *
   * @param num1 the num 1
   * @param num2 the num 2
   * @return the response entity
   */
  @GetMapping(value = "/calculate")
  public ResponseEntity<Double> calculate(@RequestParam(name = "num1") BigDecimal num1,
      @RequestParam(name = "num2") BigDecimal num2) {

    double result = 1;
    return ResponseEntity.ok(result);
  }
}
