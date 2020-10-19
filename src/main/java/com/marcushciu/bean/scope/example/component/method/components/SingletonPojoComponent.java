package com.marcushciu.bean.scope.example.component.method.components;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
@Scope("singleton")
public class SingletonPojoComponent {

    private String dateTimeCreated;

    public SingletonPojoComponent() {
        dateTimeCreated = "SingletonPojoComponent - constructor called at: " + LocalDateTime.now();
    }

    public String getDateTimeCreated() {
        return dateTimeCreated;
    }
}
