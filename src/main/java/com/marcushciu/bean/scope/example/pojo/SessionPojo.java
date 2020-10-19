package com.marcushciu.bean.scope.example.pojo;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.time.LocalDateTime;

@Component
@SessionScope
public class SessionPojo {

    private String dateTimeCreated;

    public SessionPojo() {
        dateTimeCreated = "SessionPojo - constructor called at: " + LocalDateTime.now();
    }

    public String getDateTimeCreated() {
        return dateTimeCreated;
    }
}