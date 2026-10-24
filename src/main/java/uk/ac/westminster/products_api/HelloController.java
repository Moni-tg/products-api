package uk.ac.westminster.products_api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

/**
 * Tutorial 1 controller.
 *   GET /hello    -> a simple greeting
 *   GET /goodbye  -> a simple farewell (Activity 3)
 *   GET /status   -> status message including today's date (Activity 5 stretch)
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello from Spring Boot!";
    }

    @GetMapping("/goodbye")
    public String goodbye() {
        return "Goodbye from Spring Boot!";
    }

    @GetMapping("/status")
    public String status() {
        return "API is running — Tutorial 1 — " + LocalDate.now();
    }
}
