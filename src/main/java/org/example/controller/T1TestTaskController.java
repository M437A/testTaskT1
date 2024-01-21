package org.example.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.entity.Request;
import org.example.entity.Response;
import org.example.service.T1TestTaskService;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@Validated
@RequiredArgsConstructor
@RequestMapping(value = T1TestTaskController.URL)
public class T1TestTaskController {

    public static final String URL = "/t1";

    private final T1TestTaskService t1TestTaskService;

    @PostMapping
    public ResponseEntity<Response> symbolCounter(@RequestBody final Request request) {
        log.info("Get request for count character");
        final Response response = t1TestTaskService.count(request);
        log.info("Count characters success");
        return ResponseEntity.ok(response);
    }
}
