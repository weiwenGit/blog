package com.blog.bloguser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@EnableDiscoveryClient
@SpringBootApplication
public class BlogUserApplication {



	public static void main(String[] args) {
		SpringApplication.run(BlogUserApplication.class, args);
	}
}
