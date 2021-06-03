package com.createwar;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
 
@SpringBootApplication
public class SpringMain {
	public static void main(final String[] args) {
		final ConfigurableApplicationContext configurableApplicationContext = SpringApplication
				.run(SpringMain.class, args);
		
		 
	}
	
 
}
