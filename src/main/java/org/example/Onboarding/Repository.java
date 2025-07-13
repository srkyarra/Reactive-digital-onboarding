package org.example.Onboarding;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
@org.springframework.stereotype.Repository
public interface Repository extends ReactiveMongoRepository<Model,String> {



}
