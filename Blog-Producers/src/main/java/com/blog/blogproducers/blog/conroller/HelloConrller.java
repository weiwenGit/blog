package com.blog.blogproducers.blog.conroller;

import com.blog.blogproducers.blog.POJO.Product;
import com.netflix.appinfo.EurekaInstanceConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/products")
public class HelloConrller {
    protected Logger logger = LoggerFactory.getLogger(HelloConrller.class);

  @RequestMapping(method = RequestMethod.GET)
    public List<Product> list(){
      return this.buildProducts();
  }

  @RequestMapping(value = "{id}",method = RequestMethod.GET)
  public Product detail(@PathVariable String id){
      List<Product> list = this.buildProducts();
      for(Product product:list){
          if(product.getItemCode().equals(id)){
              return product;
          }
      }
      return null;
  }

  protected List<Product> buildProducts() {
      List<Product> list = new ArrayList<>();
      list.add(new Product("item-1", "测试商品-1", "TwoStepsFromJava", 100));
      list.add(new Product("item-2", "测试商品-2", "TwoStepsFromJava", 200));
      list.add(new Product("item-3", "测试商品-3", "TwoStepsFromJava", 300));
      list.add(new Product("item-4", "测试商品-4", "TwoStepsFromJava", 400));
      list.add(new Product("item-5", "测试商品-5", "TwoStepsFromJava", 500));
      list.add(new Product("item-6", "测试商品-6", "TwoStepsFromJava", 600));
      return list;
  }
}
