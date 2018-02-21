package com.platform.swagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.request.async.DeferredResult;

import com.google.common.base.Predicates;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
	
	@SuppressWarnings("unchecked")
	@Bean
	public Docket userApi() {
		Docket docket = new Docket(DocumentationType.SWAGGER_2).groupName("xyl-api")
				.genericModelSubstitutes(DeferredResult.class).useDefaultResponseMessages(false).forCodeGeneration(true)
				.pathMapping("/")// 
				.select().paths(Predicates.or(PathSelectors.regex("/api/.*")))// 过滤接口
				.build().apiInfo(userApiInfo());
		;
		return docket;
	}
	@SuppressWarnings("unchecked")
	@Bean
	public Docket articleApi() {
		return new Docket(DocumentationType.SWAGGER_2).groupName("article")
				.genericModelSubstitutes(DeferredResult.class).useDefaultResponseMessages(false).forCodeGeneration(true)
				.pathMapping("/").select().paths(Predicates.or(PathSelectors.regex("/article/.*")))//过滤的接口
				.build().apiInfo(articleApiInfo());
	}
	private ApiInfo userApiInfo() {
		ApiInfo apiInfo = new ApiInfo("校友录接口", // 大标题
				"用戶相关接口，主要用于用戶操作相關.", // 小标题
				"1.0", // 版本
				"http://hujao.com/", "jiangning", // 作者
				"http://hujao.com/", // 链接显示文字
				"http://hujao.com/"// 网站链接
		);
		return apiInfo;
	}
	private ApiInfo articleApiInfo() {
		ApiInfo apiInfo = new ApiInfo("其他相关接口", // 大标题
				"文章相关接口，获取个数，获取列表，注意：", // 小标题
				"1.0", // 版本
				"http://hujao.com/", "Ace", // 作者
				"http://hujao.com/", // 链接显示文字
				"http://hujao.com/"// 网站链接
		);
		return apiInfo;
	}
}