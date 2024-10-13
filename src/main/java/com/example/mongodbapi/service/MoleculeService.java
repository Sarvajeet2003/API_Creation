package com.example.mongodbapi.service;

import com.example.mongodbapi.model.Molecule;
import com.example.mongodbapi.repository.MoleculeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MoleculeService {

    @Autowired
    private MoleculeRepository moleculeRepository;

    // Fetch all molecules that match the provided common name
    public List<Molecule> getMoleculesByCommonName(String common_name) {
        return moleculeRepository.findByCommonName(common_name);
    }

    // Fetch all molecules that match the provided functional groups
    public List<Molecule> getMoleculesByFunctionalGroups(String functional_groups) {
        return moleculeRepository.findByFunctionalGroups(functional_groups);
    }

    public List<Molecule> getMoleculesByFlavorProfile(String flavorProfile) {
        return moleculeRepository.findByFlavorProfile(flavorProfile);
    }

    public List<Molecule> getMoleculesByFemaFlavorProfile(String femaFlavorProfile) {
        return moleculeRepository.findByFemaFlavorProfile(femaFlavorProfile);
    }
    public List<Molecule> getMoleculesByPubchemId(int pubchem_id) {
        return moleculeRepository.findByPubchemId(pubchem_id);
    }
    public List<Molecule> getMoleculesByMonoisotopicMass(double monoisotopicMass) {
        System.out.println("Querying for Monoisotopic Mass: " + monoisotopicMass);
        return moleculeRepository.findByMonoisotopicMass(monoisotopicMass);
    }
    public List<Molecule> getMoleculesByTopologicalPolarSurfaceArea(double topologicalPolarSurfaceArea) {
        // Log the input to verify the query
        System.out.println("Querying for Topological Polar Surface Area: " + topologicalPolarSurfaceArea);
        return moleculeRepository.findByTopologicalPolarSurfaceArea(topologicalPolarSurfaceArea);
    }
    public List<Molecule> getMoleculesByHeavyAtomCount(int heavyAtomCount) {
        // Log the input to verify the query
        System.out.println("Querying for Heavy Atom Count: " + heavyAtomCount);
        return moleculeRepository.findByHeavyAtomCount(heavyAtomCount);
    }
}
