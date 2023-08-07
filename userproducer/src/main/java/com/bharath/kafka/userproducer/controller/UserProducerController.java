package com.bharath.kafka.userproducer.controller;

import com.bharath.kafka.userproducer.service.UserProducerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("userapi")
public class UserProducerController {
    private final UserProducerService userProducerSrv;

    public UserProducerController(UserProducerService userProducerSrv) {
        this.userProducerSrv = userProducerSrv;
    }

    @PostMapping("publishuserdata/{name}/{age}")
    public void sendUserData(@PathVariable String name,@PathVariable int age) {
        userProducerSrv.sendUserData(name,age);
        log.info("#######  send name:{},age:{} #####",name,age);
    }
}
