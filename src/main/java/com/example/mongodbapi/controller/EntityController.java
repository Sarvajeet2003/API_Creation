package com.example.mongodbapi.controller;

import com.example.mongodbapi.model.Entity;
import com.example.mongodbapi.service.EntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/entities")
public class EntityController {

    @Autowired
    private EntityService entityService;

    // API to get entities by category and entity alias
    @GetMapping("/by-name-and-category")
    public List<Entity> getEntitiesByNameAndCategory(@RequestParam("entity_alias") String entityAlias,
                                                     @RequestParam("category") String category) {
        return entityService.getEntitiesByAliasAndCategory(entityAlias, category);
    }
    @GetMapping("/by-natural-source")
    public List<Entity> getEntitiesByNaturalSourceName(@RequestParam("natural_source_name") String naturalSourceName) {
        return entityService.getEntitiesByNaturalSourceName(naturalSourceName);
    }
    @GetMapping("/by-entity-alias-readable")
    public List<Entity> getEntitiesByEntityAliasReadable(@RequestParam("entity_alias_readable") String entityAliasReadable) {
        return entityService.getEntitiesByEntityAliasReadable(entityAliasReadable);
    }
}
