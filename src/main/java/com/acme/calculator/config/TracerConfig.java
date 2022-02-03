package com.acme.calculator.config;

import io.corp.calculator.TracerImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * The Init bean.
 */
@Configuration
public class TracerConfig {

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
