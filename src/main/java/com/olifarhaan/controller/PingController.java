package com.olifarhaan.controller;

import java.lang.management.ManagementFactory;
import java.time.Duration;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ping")
public class PingController {

    @Value("${spring.application.name}")
    private String applicationName;
    
    @GetMapping
    public ResponseEntity<Map<String, String>> ping() {        
        Duration duration = Duration.ofMillis(ManagementFactory.getRuntimeMXBean().getUptime());
        String formattedUptime = String.format("%d days, %d hours, %d minutes, %d seconds",
            duration.toDays(),
            duration.toHoursPart(),
            duration.toMinutesPart(),
            duration.toSecondsPart());
        
        String uptimeMessage = String.format("%s server is up and running for %s", applicationName, formattedUptime);
        return ResponseEntity.ok(Map.of("message", uptimeMessage));
    }
}
