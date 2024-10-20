package com.example.mongodbapi.repository;

import com.example.mongodbapi.model.Entity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EntityRepository extends MongoRepository<Entity, String> {

    List<Entity> findByEntityAliasContainingIgnoreCaseAndCategoryContainingIgnoreCase(String entityAlias, String category);
    List<Entity> findByNaturalSourceNameContainingIgnoreCase(String naturalSourceName);
    List<Entity> findByEntityAliasReadableContainingIgnoreCase(String entityAliasReadable);
}