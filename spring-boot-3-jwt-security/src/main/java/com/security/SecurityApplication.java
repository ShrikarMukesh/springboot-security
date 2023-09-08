package com.security;

import com.security.auth.AuthenticationService;
import com.security.auth.RegisterRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import static com.security.user.Role.ADMIN;
import static com.security.user.Role.MANAGER;

@SpringBootApplication
@Slf4j
public class SecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecurityApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(
			AuthenticationService service
	)
	{
		return args -> {
			var admin = RegisterRequest.builder()
					.firstname("Admin")
					.lastname("Admin")
					.email("admin@mail.com")
					.password("password")
					.role(ADMIN)
					.build();
			log.info("Admin token: " + service.register(admin).getAccessToken());

			var manager = RegisterRequest.builder()
					.firstname("Admin")
					.lastname("Admin")
					.email("manager@mail.com")
					.password("password")
					.role(MANAGER)
					.build();
			log.info("Manager token: " + service.register(manager).getAccessToken());

			var admin1 = RegisterRequest.builder()
					.firstname("shrikar")
					.lastname("mukesh")
					.email("shrikar@mail.com")
					.password("password")
					.role(ADMIN)
					.build();
			log.info("Admin token: " + service.register(admin1).getAccessToken());

			var manager2 = RegisterRequest.builder()
					.firstname("Dinesh")
					.lastname("Kumar")
					.email("Dinesh@mail.com")
					.password("password")
					.role(MANAGER)
					.build();
			log.info("Manager token: " + service.register(manager2).getAccessToken());
		};
	}
}
