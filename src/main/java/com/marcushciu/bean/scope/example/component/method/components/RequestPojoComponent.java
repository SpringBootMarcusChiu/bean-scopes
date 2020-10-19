package com.marcushciu.bean.scope.example.component.method.components;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

import java.time.LocalDateTime;

@Component
@RequestScope
public class RequestPojoComponent {

    private String dateTimeCreated;

    public RequestPojoComponent() {
        dateTimeCreated = "RequestPojoComponent - constructor called at: " + LocalDateTime.now();
    }

    public String getDateTimeCreated() {
        return dateTimeCreated;
    }
}
