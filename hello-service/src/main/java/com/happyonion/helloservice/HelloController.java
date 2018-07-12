package com.happyonion.helloservice;



import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {

    private final  Logger logger = Logger.getLogger(HelloController.class);

    @Autowired
    private DiscoveryClient client;

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String index(){
        List<ServiceInstance> instances = client.getInstances("hello-service");
        for(ServiceInstance instance :instances ){
            logger.info("/hello Host:"+instance.getHost()+",SeriviceId:"+instance.getServiceId());
        }
        return "hello-service";
    }
}
