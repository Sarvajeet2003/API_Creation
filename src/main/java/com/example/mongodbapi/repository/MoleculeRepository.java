package com.example.mongodbapi.repository;

import com.example.mongodbapi.model.Molecule;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MoleculeRepository extends MongoRepository<Molecule, String> {

    // Query to find all molecules by their common name
    List<Molecule> findByCommonName(String common_name);

    // Query to find all molecules by functional groups
    List<Molecule> findByFunctionalGroups(String functional_groups);  // Correct field name
    List<Molecule> findByFlavorProfile(String flavorProfile);
    List<Molecule> findByFemaFlavorProfile(String femaFlavorProfile);

}
