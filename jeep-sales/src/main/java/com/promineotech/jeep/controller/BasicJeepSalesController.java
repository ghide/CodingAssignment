/**
 * 
 */
package com.promineotech.jeep.controller;

import java.util.List;
import org.springframework.stereotype.Controller;
import com.promineotech.jeep.entity.Jeep;
import com.promineotech.jeep.entity.JeepModel;

/**
 * @author ghide
 *
 */
@Controller
public class BasicJeepSalesController implements JeepSalesController{

  @Override
  public List<Jeep> fetchJeeps(JeepModel model, String trim) {
  
    return null;
  }

}
