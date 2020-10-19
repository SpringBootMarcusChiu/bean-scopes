package com.marcushciu.bean.scope.example.pojo;

import java.time.LocalDateTime;

public class Pojo {
    private String dateTimeCreated;

    public Pojo() {
        this.dateTimeCreated = "Pojo - constructor called at: " + LocalDateTime.now();
    }

    public String getDateTimeCreated() {
        return dateTimeCreated;
    }
}
