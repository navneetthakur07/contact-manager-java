package com.learning.contact_manager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.learning.contact_manager.repository")
public class ContactManagerApplication {
//	@Autowired
//	private static ContactService contactService;
	public static void main(String[] args) {

		SpringApplication.run(ContactManagerApplication.class, args);

//      ContactService contactService = new ContactService();
//		contactService.displayContact(); // problem is found in this file
	}
	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}

}
