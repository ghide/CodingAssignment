package com.promineotech.jeep.controller;

//import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.jdbc.SqlConfig;
import com.promineotech.jeep.entity.Jeep;
import com.promineotech.jeep.entity.JeepModel;
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@ActiveProfiles("test")
@Sql(scripts = {
    "classpath:flyway/migrations/V1.0__Jeep_Schema.sql",
    "classpath:flyway/migrations/V1.1__Jeep_Data.sql"}, 
    config = @SqlConfig(encoding = "utf-8"))
class FetchJeepTest/*<testThatJeepsAreReturnedWhenAValidModelAndTrimAreSupplied>*/ {
  @Autowired
  private TestRestTemplate restTemplate;
  @LocalServerPort
  private int serverPort;
  JeepModel model = JeepModel.WRANGLER;
  String trim = "Sport";
  String uri = String.format("https://localhost:%d/jeeps?model=%s&trim=%s", serverPort, model, trim);
  void testThatJeepsAreReturnedWhenAValidModelAndTrimAreSupplied() {
      ResponseEntity<List<Jeep>> response = restTemplate.exchange(uri,
HttpMethod.GET, null, new ParameterizedTypeReference<>() {});
      assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);  
  }
}
