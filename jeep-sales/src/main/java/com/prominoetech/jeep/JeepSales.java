/**
 * 
 */
package com.prominoetech.jeep;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author ghide
 *
 */
@EnableAutoConfiguration
@SpringBootApplication
public class JeepSales {

  /**
   * @param args
   */
  public static void main(String[] args) {
    
    SpringApplication.run(JeepSales.class, args);
    
    
  }

}
