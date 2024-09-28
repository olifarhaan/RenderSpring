package com.olifarhaan;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.olifarhaan.model.Employee;
import com.olifarhaan.repository.EmployeeRepository;

@SpringBootApplication
public class RenderSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(RenderSpringApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(EmployeeRepository repository) {
		return args -> {
			Employee employee = Employee.builder()
			.name("John Doe")
			.position("Software Engineer")
			.build();
			repository.save(employee);
		};
	}


}

/*
 * Connect a container with another container
 * Lets say we have a postgres sql container running and we want to connect our spring boot application container to it.
 * We can do this by using the concept of networks in docker.
 * Both containers need to be connected to the same docker network and then we can connect our spring boot application container to the postgres sql container.
 * 
 * 
 */
