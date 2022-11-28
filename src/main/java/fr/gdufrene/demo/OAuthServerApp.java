package fr.gdufrene.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableMethodSecurity(prePostEnabled = true)
public class OAuthServerApp {

	public static void main(String[] args) {
		SpringApplication.run(OAuthServerApp.class, args);
	}
}

@PreAuthorize("hasAuthority('SCOPE_message.read')")
@RestController
class TestController {
	
	@GetMapping("/test")
	public String test() {
		return "Hello";
	}
	
}