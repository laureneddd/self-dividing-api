package com.example;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class SelfDividingNumberController {

    @GetMapping("/self-dividing/{number}")
    public ResponseEntity<Map<String, Object>> selfDividingNumber(@PathVariable("number") int number) {
        Map<String, Object> response = new HashMap<>();

        response.put("number", number);
        response.put("self-dividing", isSelfDividingNumber(number));

        return ResponseEntity.ok(response);
    }

    static boolean isSelfDividingNumber(@RequestParam int number) {
        if(number <= 0) {
            return false;
        }

        while (number > 0) {
            int digit = number % 10;
            if(digit == 0 || digit == 1) {
                return true;
            }
            number /= 10;

        }
        return false;
    }

    @GetMapping("/health")
    public ResponseEntity<Map<String, Object>> health() {
        Map<String, Object> response = new HashMap<>();
        try {
            response.put("messgae", "this application is healthy");
            return ResponseEntity.ok(response);
        }
        catch (Exception e) {
            response.put("messgae", "this application is unhealthy");
            response.put("error", e.getMessage());
            return ResponseEntity.status(HttpStatus.SERVICE_UNAVAILABLE)
                    .body(response);
        }


    }
}
