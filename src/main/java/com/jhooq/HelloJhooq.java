package com.jhooq;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * @Author : rahul.wagh@jhooq.com
 * Description : Getting started with Quarkus application
 *
 * **/
@Path("/hello")
public class HelloJhooq {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "hello world ! From Jhooq";
    }
}