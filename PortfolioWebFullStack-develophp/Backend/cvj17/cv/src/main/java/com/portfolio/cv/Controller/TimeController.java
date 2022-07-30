package com.portfolio.cv.Controller;

import java.time.Instant;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin(origins="http://localhost:4200")

@RequestMapping("/api/v1.0")
public class TimeController {

    @GetMapping("/time")
    @ResponseStatus(HttpStatus.OK)
    public String getCurrentTime() {

        return Instant.now().toString();
    }
}