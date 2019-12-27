package com.fullstack.devops;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class DevopsApplication extends SpringBootServletInitializer {


	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(DevopsApplication.class);
    }
	public static void main(String[] args) {
		SpringApplication.run(DevopsApplication.class, args);
	}

}
