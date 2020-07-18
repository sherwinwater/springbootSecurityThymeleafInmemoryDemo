package com.sherwin.springsecuritydemo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer {

	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/admin/index.html").setViewName("admin/index");
		registry.addViewController("/shared/index.html").setViewName("shared/index");
		registry.addViewController("/user/index.html").setViewName("user/index");
		registry.addViewController("/").setViewName("index");
		registry.addViewController("/index").setViewName("index");
		registry.addViewController("/index.html").setViewName("index");
		registry.addViewController("/error.html").setViewName("error");
		registry.addViewController("/login.html").setViewName("login");
		registry.addViewController("/403.html").setViewName("403");
	}

}
