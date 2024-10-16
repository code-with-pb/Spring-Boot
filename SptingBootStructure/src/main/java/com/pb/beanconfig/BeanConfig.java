package com.pb.beanconfig;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.pb.model.Department;

@Configuration
public class BeanConfig {
	
	@Bean
	public static List<Department> list(){
		return new ArrayList<>();
	}
}
