package com.acme.calculator.utils;

import java.math.BigDecimal;

public interface Operation {
    public Double calculate(BigDecimal num1, BigDecimal num2);
}
