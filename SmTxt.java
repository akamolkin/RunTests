package org.example.entity;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class SmTxt {
    String str = "Hello world";
    public SmTxt() {
        System.out.println(str);
    }
}
