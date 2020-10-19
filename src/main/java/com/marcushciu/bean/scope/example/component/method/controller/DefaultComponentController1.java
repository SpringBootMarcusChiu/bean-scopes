package com.marcushciu.bean.scope.example.component.method.controller;

import com.marcushciu.bean.scope.example.component.method.components.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/component/1")
public class DefaultComponentController1 {

    @Autowired
    private SingletonPojoComponent singletonPojoComponent;

    @Autowired
    private PrototypePojoComponent prototypePojoComponent;

    @Autowired
    private RequestPojoComponent requestPojoComponent;

    @Autowired
    private SessionPojoComponent sessionPojoComponent;

    @Autowired
    private ApplicationPojoComponent applicationPojoComponent;

    @Autowired
    private WebSocketPojoComponent webSocketPojoComponent;


    @GetMapping("/singleton")
    public String singletonBean() {
        return singletonPojoComponent.getDateTimeCreated();
    }

    @GetMapping("/prototype")
    public String prototypeBean() {
        return prototypePojoComponent.getDateTimeCreated();
    }

    @GetMapping("/request")
    public String request() {
        return requestPojoComponent.getDateTimeCreated();
    }

    @GetMapping("/session")
    public String session() {
        return sessionPojoComponent.getDateTimeCreated();
    }

    @GetMapping("/application")
    public String applicationBean() {
        return applicationPojoComponent.getDateTimeCreated();
    }

    @GetMapping("/websocket")
    public String websocketBean() {
        return webSocketPojoComponent.getDateTimeCreated();
    }
}