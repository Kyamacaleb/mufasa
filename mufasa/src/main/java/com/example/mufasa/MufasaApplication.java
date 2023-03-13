package com.example.mufasa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
@ComponentScan({"com.example.mufasa.appuser"})
public class MufasaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MufasaApplication.class, args);
	}

}
