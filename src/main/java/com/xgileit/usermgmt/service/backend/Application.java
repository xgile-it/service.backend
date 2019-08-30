package com.xgileit.usermgmt.service.backend;

import com.xgileit.usermgmt.service.backend.com.xgileit.usermgmt.service.backend.entities.User;
import com.xgileit.usermgmt.service.backend.com.xgileit.usermgmt.service.backend.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import java.util.stream.Stream;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}


	@Bean
	CommandLineRunner init(UserRepository userRepository) {

		return args -> {
			Stream.of("John","Rachel").forEach(name -> {
				User user = new User(name, "0744828778", name.toLowerCase() + "@xgile-it.com");
				userRepository.save(user);
			});
			userRepository.findAll().forEach(System.out::println);
		};
	}
}
