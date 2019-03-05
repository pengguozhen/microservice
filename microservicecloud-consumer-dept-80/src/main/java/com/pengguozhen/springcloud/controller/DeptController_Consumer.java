package com.pengguozhen.springcloud.controller;

import com.pengguozhen.springcloud.entities.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class DeptController_Consumer {
    private static final String url_prefix="http://localhost:8001";
    @Autowired
    RestTemplate restTemplate;

    @RequestMapping(value = "/consumer/add",method =RequestMethod.POST )
    public boolean add(Dept dept){
        return restTemplate.postForObject(url_prefix+"/dept/add", dept, Boolean.class);
    }

    @RequestMapping(value = "/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id)
    {
        return restTemplate.getForObject(url_prefix + "/dept/get/" + id, Dept.class);
    }

    @SuppressWarnings("unchecked")
    @RequestMapping(value = "/consumer/dept/list")
    public List<Dept> list()
    {
        return restTemplate.getForObject(url_prefix + "/dept/list", List.class);
    }

}
