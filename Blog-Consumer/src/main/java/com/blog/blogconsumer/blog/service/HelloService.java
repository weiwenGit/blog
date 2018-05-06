package com.blog.blogconsumer.blog.service;

import com.blog.blogconsumer.blog.POJO.Product;
import com.blog.blogconsumer.blog.hystrixservice.HelloHystrixService;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(value = "PRODUCT-SERVICE",fallback = HelloHystrixService.class)
public interface HelloService {

    @RequestMapping(value = "/products", method = RequestMethod.GET)
    List<Product> findAll();

    @RequestMapping(value = "/products/{id}", method = RequestMethod.GET)
    Product loadByItemCode(@PathVariable("id") String itemCode);


}
