package com.marcushciu.bean.scope.example.component.method.components;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.time.LocalDateTime;

@Component
@SessionScope
public class SessionPojoComponent {

    private String dateTimeCreated;

    public SessionPojoComponent() {
        dateTimeCreated = "SessionPojoComponent - constructor called at: " + LocalDateTime.now();
    }

    public String getDateTimeCreated() {
        return dateTimeCreated;
    }
}