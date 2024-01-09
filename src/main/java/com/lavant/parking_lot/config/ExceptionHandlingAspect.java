package com.lavant.parking_lot.config;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.read.ListAppender;
import jakarta.annotation.PostConstruct;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ExceptionHandlingAspect {
    @Bean
    public ListAppender<ILoggingEvent> listAppender() {
        return new ListAppender<>();
    }

    @PostConstruct
    public void setup() {
        LoggerContext context = (LoggerContext) LoggerFactory.getILoggerFactory();
        context.getLogger(ExceptionHandlingAspect.class.getName()).addAppender(listAppender());
    }
}