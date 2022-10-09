package com.example.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.models.Publisher;

public interface PublisherRepository extends MongoRepository<Publisher, String> {

}
