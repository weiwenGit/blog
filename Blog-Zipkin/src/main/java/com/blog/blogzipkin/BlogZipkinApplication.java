package com.blog.blogzipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin.server.EnableZipkinServer;


@EnableZipkinServer
@SpringBootApplication
public class BlogZipkinApplication {

	public static void main(String[] args) {
		SpringApplication.run(BlogZipkinApplication.class, args);
	}
}
