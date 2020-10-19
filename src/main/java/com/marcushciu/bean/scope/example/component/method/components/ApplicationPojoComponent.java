package com.marcushciu.bean.scope.example.component.method.components;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.ApplicationScope;

import java.time.LocalDateTime;

@Component
@ApplicationScope
public class ApplicationPojoComponent {

    private String dateTimeCreated;

    public ApplicationPojoComponent() {
        dateTimeCreated = "ApplicationPojoComponent - constructor called at: " + LocalDateTime.now();
    }

    public String getDateTimeCreated() {
        return dateTimeCreated;
    }
}
