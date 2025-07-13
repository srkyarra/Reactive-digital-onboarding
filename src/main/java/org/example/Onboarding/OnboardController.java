package org.example.Onboarding;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class OnboardController {

    private final OnboardService customerService;

    public OnboardController(OnboardService customerService) {
        this.customerService = customerService;
    }

    @PostMapping("/register")
    public Mono<Model> register(@RequestBody Model customer) {
        return customerService.registerCustomer(customer);
    }
}
