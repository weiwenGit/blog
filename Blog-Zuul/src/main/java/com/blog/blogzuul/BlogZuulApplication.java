package com.blog.blogzuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
public class BlogZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(BlogZuulApplication.class, args);
	}
}
