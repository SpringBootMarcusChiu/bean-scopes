package com.marcushciu.bean.scope.example.controller;

import com.marcushciu.bean.scope.example.pojo.Pojo;
import com.marcushciu.bean.scope.example.pojo.RequestPojo;
import com.marcushciu.bean.scope.example.pojo.SessionPojo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/1")
public class Default1Controller {

    @Autowired
    private Pojo singletonPojoBean;

    @Autowired
    private Pojo prototypePojoBean;

    @Autowired
    private Pojo requestPojoBean;

    @GetMapping("/singleton-bean")
    public String singletonBean() {
        return singletonPojoBean.getDateTimeCreated();
    }

    @GetMapping("/prototype-bean")
    public String prototypeBean() {
        return prototypePojoBean.getDateTimeCreated();
    }

    @GetMapping("/request-bean")
    public String requestBean() {
        return requestPojoBean.getDateTimeCreated();
    }


    @Autowired
    private RequestPojo requestPojo;

    @Autowired
    private SessionPojo sessionPojo;

    @GetMapping("/request")
    public String request() {
        return requestPojo.getDateTimeCreated();
    }

    @GetMapping("/session")
    public String session() {
        return sessionPojo.getDateTimeCreated();
    }
}