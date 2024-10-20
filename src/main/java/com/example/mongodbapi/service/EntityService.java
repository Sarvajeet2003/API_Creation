package com.example.mongodbapi.service;

import com.example.mongodbapi.model.Entity;
import com.example.mongodbapi.repository.EntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EntityService {

    @Autowired
    private EntityRepository entityRepository;

    // Service method to find entities by alias and category
    public List<Entity> getEntitiesByAliasAndCategory(String entityAlias, String category) {
        return entityRepository.findByEntityAliasContainingIgnoreCaseAndCategoryContainingIgnoreCase(entityAlias, category);
    }
    public List<Entity> getEntitiesByNaturalSourceName(String naturalSourceName) {
        return entityRepository.findByNaturalSourceNameContainingIgnoreCase(naturalSourceName);
    }
    public List<Entity> getEntitiesByEntityAliasReadable(String entityAliasReadable) {
        return entityRepository.findByEntityAliasReadableContainingIgnoreCase(entityAliasReadable);
    }
}
