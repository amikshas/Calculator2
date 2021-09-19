package com.simplilearn.Calc2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class Calc2Application {

	public static void main(String[] args) {
		SpringApplication.run(Calc2Application.class, args);
	}
	
	@RequestMapping(value = "/")
   public String hello() {
      return "Hello World from Tomcat";
   }

}
