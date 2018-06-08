package com.zd.testing;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@MapperScan(basePackages = "com.zd.testing.*.mapper")
@ServletComponentScan
public class TestingApplication  {

	public static void main(String[] args) {
		SpringApplication.run(TestingApplication.class, args);
	}

}
