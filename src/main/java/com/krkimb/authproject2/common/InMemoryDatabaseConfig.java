package com.krkimb.authproject2.common;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import javax.servlet.annotation.WebServlet;

@Configuration
public class InMemoryDatabaseConfig {
    @Bean
    public ServletRegistrationBean h2servletRegistration() {
        //new WebServlet()
        ServletRegistrationBean registration = new ServletRegistrationBean();
        registration.addUrlMappings("/console/*");
        return registration;
    }
}
