package com.blog.bloguser.blog.conroller;


import com.blog.bloguser.blog.pojo.UserEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/users")
public class UserConroller {
    protected Logger logger = LoggerFactory.getLogger(UserConroller.class);

    @Value("${server.port}")
    private int serverPort = 2200;

    @RequestMapping(value = "/{loginName}", method = RequestMethod.GET)
    public UserEntity detail(@PathVariable String loginName) {
        String remarks = "I come form " + this.serverPort;
        String email = "6******@qq.com";
        String phone = "176********";
        return new UserEntity(loginName, loginName,remarks,email,phone);
    }




}
