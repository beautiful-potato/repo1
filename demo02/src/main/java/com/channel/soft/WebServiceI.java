package com.channel.soft;
import javax.jws.WebService;
import javax.jws.WebMethod;

@WebService
public interface WebServiceI {
    @WebMethod
    String sayHello(String name);

    @WebMethod
    String save(String name,String pwd);
}
