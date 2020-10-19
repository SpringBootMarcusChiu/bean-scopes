package com.marcushciu.bean.scope.example.bean.method.controller;

import com.marcushciu.bean.scope.example.bean.method.beans.Pojo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bean/2")
public class DefaultBeanController2 {

    @Autowired
    private Pojo singletonPojoBean;

    @Autowired
    private Pojo prototypePojoBean;

    @Autowired
    private Pojo requestPojoBean;

    @Autowired
    private Pojo sessionPojoBean;

    @Autowired
    private Pojo applicationPojoBean;

    @Autowired
    private Pojo websocketPojoBean;

    @GetMapping("/singleton")
    public String singletonBean() {
        return singletonPojoBean.getDateTimeCreated();
    }

    @GetMapping("/prototype")
    public String prototypeBean() {
        return prototypePojoBean.getDateTimeCreated();
    }

    @GetMapping("/request")
    public String requestBean() {
        return requestPojoBean.getDateTimeCreated();
    }

    @GetMapping("/session")
    public String sessionBean() {
        return sessionPojoBean.getDateTimeCreated();
    }

    @GetMapping("/application")
    public String applicationBean() {
        return applicationPojoBean.getDateTimeCreated();
    }

    @GetMapping("/websocket")
    public String websocketBean() {
        return websocketPojoBean.getDateTimeCreated();
    }
}