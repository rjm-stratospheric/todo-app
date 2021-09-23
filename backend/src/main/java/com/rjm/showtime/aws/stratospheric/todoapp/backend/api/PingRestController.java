package com.rjm.showtime.aws.stratospheric.todoapp.backend.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PingRestController {

    @GetMapping(path = "/ping")
    public ResponseEntity<String> ping(){
        return ResponseEntity.ok("pong");
    }
}
