package com.architecture.calculatorspringboot.service;

import com.architecture.calculatorspringboot.utils.Operation;
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
  public Double calculate(BigDecimal num1, BigDecimal num2, Operation operation) {

    log.debug("Calculate {} {} {}", num1, operation, num2);

    switch (operation) {
      case ADD:
        return num1.add(num2).doubleValue();
      case SUBTRACT:
        return num1.subtract(num2).doubleValue();
      default:
        // Aunque nunca entra por aqui porque corta el enumerado en el param de la request, se deja por si
        // en algun momento cambia otra persona en el controller
        String stringError = new StringBuilder("Operation ").append(operation)
            .append(" not supported").toString();
        log.error(stringError);
        throw new RuntimeException(stringError);
    }
  }
}
