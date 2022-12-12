package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import com.example.demo.config.RsaKeyProperties;

@EnableConfigurationProperties(RsaKeyProperties.class)
@SpringBootApplication
public class CmsRestAPIApplication {

	public static void main(String[] args) {
		SpringApplication.run(CmsRestAPIApplication.class, args);
	}

	
	
		
	}


