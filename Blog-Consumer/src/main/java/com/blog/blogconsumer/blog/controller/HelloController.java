package com.blog.blogconsumer.blog.controller;

import com.blog.blogconsumer.blog.POJO.Product;
import com.blog.blogconsumer.blog.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/products")
public class HelloController {

    @Autowired
    private HelloService helloService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Product> list() {
        return this.helloService.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Product detail(@PathVariable String id) {
        return this.helloService.loadByItemCode(id);
    }

}
