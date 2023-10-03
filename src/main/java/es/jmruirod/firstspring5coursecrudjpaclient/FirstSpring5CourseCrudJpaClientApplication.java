package es.jmruirod.firstspring5coursecrudjpaclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class FirstSpring5CourseCrudJpaClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstSpring5CourseCrudJpaClientApplication.class, args);
	}

	@Bean
	public RestTemplate template()
	{
		return new RestTemplate();
	}
}
