/**
 * 
 */
package com.jgroup.jpay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * @author dockerking
 *
 */
@SpringBootApplication
@ServletComponentScan(basePackages = "com.jgroup.jpay.api.web")
public class ApiApplicationStarter {

	public static void main(String[] args) {
		SpringApplication.run(ApiApplicationStarter.class, args);
	}
}
