package com.errorist1540.autoConfiguration.repo;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Description;

@Data
@Configuration
@ConfigurationProperties(prefix = "errorist")
// properties, yaml에서 사용할 값들에 대해서 정의를 내린다.
// ConfigurationProperties를 통해 prefix를 자유롭게 설정할 수 있다.
// ex) errorist.key1
public class TestProperties {
    /**
     * test key1 by errorist
     */
    private String key1;
    /**
     * test key2 by errorist
     */
    private String key2;
    /**
     * test key3 by errorist
     */
    private String key3;
}
