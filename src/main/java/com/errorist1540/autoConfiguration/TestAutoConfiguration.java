package com.errorist1540.autoConfiguration;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(value = {TestProperties.class})
public class TestAutoConfiguration {
}
