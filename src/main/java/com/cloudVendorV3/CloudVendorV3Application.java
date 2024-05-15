package com.cloudVendorV3;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CloudVendorV3Application {
	final Logger logger = LogManager.getLogger(CloudVendorV3Application.class.getName());

	public static void main(String[] args) {
		SpringApplication.run(CloudVendorV3Application.class, args);
	}
}
