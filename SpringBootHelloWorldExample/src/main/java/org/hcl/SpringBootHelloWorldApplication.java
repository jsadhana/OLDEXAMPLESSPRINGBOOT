package org.hcl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootHelloWorldApplication {

	public static void main(String[] args) 
	{
		System.out.println("Hi Springboot");
		SpringApplication.run(SpringBootHelloWorldApplication.class, args);   
	}
}