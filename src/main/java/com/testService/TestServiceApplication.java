package com.testService;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/***
 * Classe do Controller da Aplicação.
 */
@SpringBootApplication
@ComponentScan(basePackageClasses = { TestController.class })
@EnableAutoConfiguration
public class TestServiceApplication {

/***
* Classe do Controller da Aplicação.
*/
	public static void main(String[] args) {
		SpringApplication.run(TestServiceApplication.class, args);
		System.exit(0);
	}

}
