/**
 * 
 */
package com.jgroup.jpay.api.swagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.jgroup.jpay.api.controller.TransController;

import springfox.bean.validators.configuration.BeanValidatorPluginsConfiguration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author dockerking
 *
 */
@Configuration
@EnableSwagger2
@ComponentScan(basePackageClasses = { TransController.class })
@Import(BeanValidatorPluginsConfiguration.class)
public class ApiSwaggerConfig {

	@Bean
	public Docket createRestApi() {
		return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo()).select()
				.apis(RequestHandlerSelectors.basePackage("com.jgroup.jpay.api.controller")).paths(PathSelectors.any()).build();
	}

	private ApiInfo apiInfo() {
		ApiInfo apiInfo = new ApiInfoBuilder().title("Spring Boot Sample REST APIs")
				.description("The APIs here demonstrate creating a service built with Spring Boot").license("MIT")
				.licenseUrl("http://opensource.org/licenses/MIT")
				.contact(new Contact("GuangLin", "OuYang", "93775988@qq.com")).version("1.0").build();

		return apiInfo;
	}
}
