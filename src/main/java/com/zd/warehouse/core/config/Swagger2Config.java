package com.zd.warehouse.core.config;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.ParameterBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.Parameter;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import com.zd.warehouse.account.security.StatelessToken;

/**
 * @author kuangstar:
 * @version 2018年6月9日 下午4:42:56
 * 
 */

@Configuration
@EnableSwagger2
@ComponentScan(basePackages = { "com.zd.warehouse.*.controller" })
public class Swagger2Config {

	@Bean
	public Docket user() {
		return new Docket(DocumentationType.SWAGGER_2)
				.apiInfo(apiInfo())
				.groupName("user")
				.globalOperationParameters(setHeaderToken())
				.select()
				.apis(RequestHandlerSelectors.withClassAnnotation(Api.class))
				.apis(RequestHandlerSelectors
						.withMethodAnnotation(ApiOperation.class))
				.paths(PathSelectors.any()).build();
	}

	@Bean
	public Docket data() {
		return new Docket(DocumentationType.SWAGGER_2)
				.apiInfo(apiInfo())
				.groupName("data")
				.globalOperationParameters(setHeaderToken())
				.select()
				.apis(RequestHandlerSelectors.withClassAnnotation(Api.class))
				.apis(RequestHandlerSelectors
						.withMethodAnnotation(ApiOperation.class))
				.paths(PathSelectors.ant("/**")).build();
	}

	private ApiInfo apiInfo() {
		return new ApiInfoBuilder()
				.title("中大仓库管理rest api接口")
				.contact(
						new Contact("中大", "http://localhost:8090",
								"1250368725@qq.com"))
				.description("HTTP对外开放rest接口").version("2.7.0").build();
	}

	private List<Parameter> setHeaderToken() {
		ParameterBuilder tokenParam = new ParameterBuilder();
		List<Parameter> paramList = new ArrayList<Parameter>();
		tokenParam
				.name("Authorization")
				.defaultValue(
						StatelessToken.TOKEN_HEADER_PREFIX
								+ " eyJhbGciOiJIUzI1NiJ9.eyJpYXQiOjE1MjYyODU5MzAsImV4cCI6MTUyNjg5MDczMCwidXNlck5hbWUiOiJBMDIiLCJ1c2VySWQiOjd9.8VuE8BXHBJvzMJK6VxARzsyN_OQ3HXgH4Azgnwv-8II")
				.description(
						"Token令牌( " + StatelessToken.TOKEN_HEADER_PREFIX
								+ " 开头)").modelRef(new ModelRef("string"))
				.parameterType("header").required(false).build();
		paramList.add(tokenParam.build());
		return paramList;
	}
}