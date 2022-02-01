package com.architecture.calculatorspringboot.config;

import io.corp.calculator.TracerImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * The Init bean.
 */
@Configuration
public class InitBean {

  /**
   * Tracer api tracer.
   *
   * @return the tracer
   */
  @Bean
  public TracerImpl tracerAPI() {
    return new TracerImpl();
  }
}
