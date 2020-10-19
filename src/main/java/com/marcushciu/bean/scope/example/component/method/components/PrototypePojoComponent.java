package com.marcushciu.bean.scope.example.component.method.components;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
@Scope("prototype")
public class PrototypePojoComponent {

    private String dateTimeCreated;

    public PrototypePojoComponent() {
        dateTimeCreated = "PrototypePojoComponent - constructor called at: " + LocalDateTime.now();
    }

    public String getDateTimeCreated() {
        return dateTimeCreated;
    }
}
