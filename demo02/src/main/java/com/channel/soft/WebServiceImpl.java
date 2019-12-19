package com.channel.soft;

import org.springframework.stereotype.Service;

import javax.jws.WebService;

@WebService
@Service
public class WebServiceImpl implements WebServiceI {
    @Override
    public String sayHello(String name) {
        System.out.println("WebService sayHello "+name);
        return "sayHello "+name;
    }

    @Override
    public String save(String name, String pwd) {
        System.out.println("WebService save "+name+"， "+pwd);
        return "save Success";
    }
}
