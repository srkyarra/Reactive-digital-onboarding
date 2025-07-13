package org.example.Onboarding;

import org.springframework.kafka.core.reactive.ReactiveKafkaProducerTemplate;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class OnboardService {

    private final Repository customerRepository;
    private final ReactiveKafkaProducerTemplate<String, Model> kafkaProducer;

    public OnboardService(Repository customerRepository, ReactiveKafkaProducerTemplate<String, Model> kafkaProducer) {
        this.customerRepository = customerRepository;
        this.kafkaProducer = kafkaProducer;
    }

    public Mono<Model> registerCustomer(Model customer) {
        customer.setKycStatus("PENDING");
        return customerRepository.save(customer)
                .flatMap(saved -> kafkaProducer.send("kyc-initiation-topic", saved.getId(), saved).thenReturn(saved));
    }
}
