package com.marcushciu.bean.scope.example;

import com.marcushciu.bean.scope.example.pojo.Pojo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.web.context.annotation.RequestScope;

@SpringBootApplication
public class BeanScopeExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(BeanScopeExampleApplication.class, args);
	}

	public static Integer count = 0;

	@Bean
	@Scope("singleton")
	public Pojo singletonPojoBean() {
		return new Pojo();
	}

	@Bean
	@Scope("prototype")
	public Pojo prototypePojoBean() {
		return new Pojo();
	}

	@Bean
	@RequestScope
	public Pojo requestPojoBean() {
		return new Pojo();
	}
}
