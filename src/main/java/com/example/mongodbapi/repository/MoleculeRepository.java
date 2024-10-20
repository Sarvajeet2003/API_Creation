package com.example.mongodbapi.repository;

import com.example.mongodbapi.model.Molecule;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
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
    @Query("{ 'pubchem_id': ?0 }")
    List<Molecule> findByPubchemId(int pubchem_id);
    @Query("{ 'monoisotopic_mass': ?0 }")
    List<Molecule> findByMonoisotopicMass(double monoisotopicMass);
    @Query("{ 'topological_polor_surfacearea': ?0 }")
    List<Molecule> findByTopologicalPolarSurfaceArea(double topologicalPolarSurfaceArea);
    @Query(value = "{ 'heavy_atom_count': ?0 }", fields = "{ 'id': 1, 'iupac_name': 1, 'common_name': 1, 'molecular_weight': 1, 'heavy_atom_count': 1 }")
    List<Molecule> findByHeavyAtomCount(int heavyAtomCount);
    @Query("{ 'molecular_weight' : { $gte: ?0 } }")
    List<Molecule> findByMolecularWeightGreaterThanEqual(double molecularWeight);


    @Query("{ 'molecular_weight' : { $gte: ?0, $lte: ?1 } }")
    List<Molecule> findByExactMassBetween(double from, double to);

    @Query("{ 'hbd_count' : ?0 }")
    List<Molecule> findByHbdCount(int hbd_count);

    @Query("{ 'hba_count' : ?0 }")
    List<Molecule> findByHbaCount(int hba_count);

}
