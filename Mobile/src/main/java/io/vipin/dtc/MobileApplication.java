package io.vipin.dtc;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class MobileApplication {

	public static void main(String[] args) {
		SpringApplication.run(MobileApplication.class, args);
	}
	
	@RequestMapping("/favourite/{name}")
	public String MobileName(@PathVariable String name) {
		return "You liked  <strong style=\"color: green;\">" + name + " </strong> Responsed on : " + new Date();
	}
	
}
