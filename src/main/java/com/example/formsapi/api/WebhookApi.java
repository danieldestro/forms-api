package com.example.formsapi.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@ResponseBody
@RestController
@RequestMapping("webhook/forms")
public class WebhookApi {

    @PostMapping
    public ResponseEntity<?> update(@RequestBody String data) {
        log.info("webhook called with data: {}", data);
        return ResponseEntity.ok().build();
    }
}
