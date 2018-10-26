package io.vipin.dtc;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ZuulController {

	@GetMapping("/hello")
	public String hello() {
		System.out.println("Hello");
		return "Hello Vipin Khandelwal";
	}
	
}
