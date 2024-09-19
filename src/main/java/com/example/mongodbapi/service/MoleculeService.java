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
}
