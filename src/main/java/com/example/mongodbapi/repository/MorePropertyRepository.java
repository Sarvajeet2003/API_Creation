package com.example.mongodbapi.repository;

import com.example.mongodbapi.model.MoreProperty;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MorePropertyRepository extends MongoRepository<MoreProperty, String> {

    @Query("{ 'number_of_aromatic_rings': ?0 }")
    List<MoreProperty> findByNumberOfAromaticRings(int numberOfAromaticRings);
    @Query("{ 'number_of_aromatic_bonds': ?0 }")
    List<MoreProperty> findByNumberOfAromaticBonds(int numberOfAromaticBonds);
    // Query to find properties by num_rings
    @Query("{ 'num_rings': ?0 }")
    List<MoreProperty> findByNumRings(int numRings);
    @Query("{ 'num_rotatablebonds': ?0 }")
    List<MoreProperty> findByNumRotatableBonds(int numRotatableBonds);
    @Query("{ 'surface_area': ?0 }")
    List<MoreProperty> findBySurfaceArea(double surfaceArea);
    @Query("{ 'alogp': ?0 }")
    List<MoreProperty> findByAlogp(double alogp);
    @Query("{ 'number_of_atoms': ?0 }")
    List<MoreProperty> findByNumberOfAtoms(int numberOfAtoms);
    @Query("{ 'energy': ?0 }")
    List<MoreProperty> findByEnergy(double energy);
}
