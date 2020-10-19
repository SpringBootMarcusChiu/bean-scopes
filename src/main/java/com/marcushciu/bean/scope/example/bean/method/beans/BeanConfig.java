package com.marcushciu.bean.scope.example.bean.method.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.web.context.annotation.ApplicationScope;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.context.annotation.SessionScope;

@Configuration
public class BeanConfig {

    @Bean
    @Scope("singleton")
    public Pojo singletonPojoBean() {
        return new Pojo();
    }

    @Bean
    @Scope("prototype")
    public Pojo prototypePojoBean() {
        return new Pojo();
    }

    @Bean
    @RequestScope
    public Pojo requestPojoBean() {
        return new Pojo();
    }

    @Bean
    @SessionScope
    public Pojo sessionPojoBean() {
        return new Pojo();
    }

    @Bean
    @ApplicationScope
    public Pojo applicationPojoBean() {
        return new Pojo();
    }

    @Bean
    @Scope(scopeName = "websocket", proxyMode = ScopedProxyMode.TARGET_CLASS)
    public Pojo websocketPojoBean() {
        return new Pojo();
    }
}
