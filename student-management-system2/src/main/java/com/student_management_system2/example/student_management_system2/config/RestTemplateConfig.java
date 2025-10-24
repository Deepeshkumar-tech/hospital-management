package com.student_management_system2.example.student_management_system2.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateConfig
{
    @Bean
    RestTemplate restTemplate()
    {
        return new RestTemplate();
    }

}
