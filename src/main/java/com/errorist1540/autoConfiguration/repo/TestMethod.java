package com.errorist1540.autoConfiguration.repo;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Getter @Setter
@ToString
@RequiredArgsConstructor
@Slf4j
public class TestMethod {

    private final TestProperties testProperties;

    public void getProperties() {
        log.info("get properties: {}", testProperties.toString());
    }
}