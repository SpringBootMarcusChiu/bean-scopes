package com.marcushciu.bean.scope.example.pojo;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

import java.time.LocalDateTime;

@Component
@RequestScope
public class RequestPojo {

    private String dateTimeCreated;

    public RequestPojo() {
        dateTimeCreated = "RequestPojo - constructor called at: " + LocalDateTime.now();
    }

    public String getDateTimeCreated() {
        return dateTimeCreated;
    }
}
