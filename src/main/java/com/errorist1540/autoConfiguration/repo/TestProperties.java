package com.errorist1540.autoConfiguration.repo;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
@ConfigurationProperties(prefix = "errorist")
// properties, yaml에서 사용할 값들에 대해서 정의를 내린다.
// ConfigurationProperties를 통해 prefix를 자유롭게 설정할 수 있다.
// ex) errorist.key1
public class TestProperties {
    private String key1;
    private String key2;
    private String ket3;
}
