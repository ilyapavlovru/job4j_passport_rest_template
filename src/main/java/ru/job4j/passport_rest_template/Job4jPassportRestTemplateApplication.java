package ru.job4j.passport_rest_template;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class Job4jPassportRestTemplateApplication {

    public static void main(String[] args) {
        SpringApplication.run(Job4jPassportRestTemplateApplication.class, args);
    }

    @Bean
    public RestTemplate getTemplate() {
        return new RestTemplate();
    }
}
