package com.errorist1540.autoConfiguration.repo;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(value = {TestProperties.class})
public class TestAutoConfiguration {

    @Bean
    @ConditionalOnMissingBean
    public TestMethod testMethod(TestProperties testProperties) {
        return new TestMethod(testProperties);
    }
}
