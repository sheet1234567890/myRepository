package com.adda.app;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
@ConfigurationProperties("my.db")
public class Student {
         private String s_name;
         private Integer s_id;
}
