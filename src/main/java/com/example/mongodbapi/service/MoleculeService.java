package com.example.mongodbapi.service;

import com.example.mongodbapi.model.Molecule;
import com.example.mongodbapi.repository.MoleculeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

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
    // Service method for 'from' only
    public List<Molecule> findMoleculesByWeightFrom(double from) {
        return moleculeRepository.findByMolecularWeightGreaterThanEqual(from);
    }

    // Service method for 'from' and 'to'
    public List<Molecule> findMoleculesByWeightRange(double from, double to) {
        return moleculeRepository.findByExactMassBetween(from, to);
    }

    public List<Molecule> findByHbdCount(int hbdCount) {
        return moleculeRepository.findByHbdCount(hbdCount);
    }

    public List<Molecule> findByHbaCount(int hbaCount) {
        return moleculeRepository.findByHbaCount(hbaCount);
    }

    public List<Molecule> findByType(String type) {
        List<Molecule> molecules = moleculeRepository.findAll();
        return molecules.stream()
                .filter(molecule -> {
                    if (type.equalsIgnoreCase("natural") && molecule.getNatural() == 1) {
                        return true;
                    }
                    if (type.equalsIgnoreCase("synthetic") && molecule.getSynthetic() == 1) {
                        return true;
                    }
                    return type.equalsIgnoreCase("unknown") && molecule.getUnknownNatural() == 1;
                })
                .collect(Collectors.toList());
    }
    public MoleculeRepository getMoleculeRepository() {
        return moleculeRepository;
    }

    public void setMoleculeRepository(MoleculeRepository moleculeRepository) {
        this.moleculeRepository = moleculeRepository;
    }
}
