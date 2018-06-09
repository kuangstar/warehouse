package com.zd.warehouse;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@MapperScan(basePackages = "com.zd.warehouse.*.mapper")
@ServletComponentScan
public class WarehouseApplication  {

	public static void main(String[] args) {
		SpringApplication.run(WarehouseApplication.class, args);
	}

}
