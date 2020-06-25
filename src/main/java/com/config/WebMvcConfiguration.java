package com.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * <p> The describe </p>
 *
 * @author Li Xingping
 */
@Configuration
@EnableConfigurationProperties(AppCorsProperties.class)
public class WebMvcConfiguration {

    private final AppCorsProperties properties;

    @Autowired
    public WebMvcConfiguration(AppCorsProperties properties) {
        this.properties = properties;
    }

    @Bean
    public SimpleCORSFilter simpleCORSFilter() {
        return new SimpleCORSFilter(properties);
    }
}
