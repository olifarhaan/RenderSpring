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
