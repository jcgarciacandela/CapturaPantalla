package com.jcgarciacandela.captura;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class CapturaApplication {

    public static void main(String[] args) {

        System.setProperty("java.awt.headless", "false");
        SpringApplication.run(CapturaApplication.class, args);

    }

}
