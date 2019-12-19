package com.channel.soft.listener;

import com.channel.soft.WebServiceImpl;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import javax.xml.ws.Endpoint;

@WebListener
public class WebServicePublishListener  implements ServletContextListener {
    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        //WebService的发布地址
        String address = "localhost:8001/WS_Server/WebService";
        //发布WebService，WebServiceImpl类是WebServie接口的具体实现类
        Endpoint.publish(address , new WebServiceImpl());
        System.out.println("使用WebServicePublishListener发布webservice成功!");
    }
}
