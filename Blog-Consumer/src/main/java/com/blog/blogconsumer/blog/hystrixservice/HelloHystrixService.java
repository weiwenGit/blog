package com.blog.blogconsumer.blog.hystrixservice;

import com.blog.blogconsumer.blog.POJO.Product;
import com.blog.blogconsumer.blog.service.HelloService;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;

@Component
public class HelloHystrixService implements HelloService{
    @Override
    public List<Product> findAll() {
        return Collections.emptyList();
    }

    @Override
    public Product loadByItemCode(String itemCode) {
        return new Product("error","未知","TwoStepsFromJava-Fallback",0);
    }
}
