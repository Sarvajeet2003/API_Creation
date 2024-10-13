package com.example.mongodbapi.controller;

import com.example.mongodbapi.model.Molecule;
import com.example.mongodbapi.service.MoleculeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/molecules_data")
public class MoleculeController {

    @Autowired
    private MoleculeService moleculeService;

    // API endpoint: /api/molecules_data/by-commonName?common_name=SomeName
    @GetMapping("/by-commonName")
    public List<Molecule> getMolecules(@RequestParam("common_name") String common_name) {
        return moleculeService.getMoleculesByCommonName(common_name);
    }

    // API endpoint: /api/molecules_data/by-functionalGroups?functional_groups=SomeGroup
    @GetMapping("/by-functionalGroups")
    public List<Molecule> getMoleculesByFunctionalGroups(@RequestParam("functional_groups") String functional_groups) {
        return moleculeService.getMoleculesByFunctionalGroups(functional_groups);
    }

    @GetMapping("/by-flavorProfile")
    public List<Molecule> getMoleculesByFlavorProfile(@RequestParam("flavor_profile") String flavorProfile) {
        return moleculeService.getMoleculesByFlavorProfile(flavorProfile);
    }
    @GetMapping("/by-femaFlavorProfile")
    public List<Molecule> getMoleculesByFemaFlavorProfile(@RequestParam("fema_flavor_profile") String femaFlavorProfile) {
        return moleculeService.getMoleculesByFemaFlavorProfile(femaFlavorProfile);
    }
    @GetMapping("/by-pubchemId")
    public List<Molecule> getMoleculesByPubchemId(@RequestParam("pubchem_id") int pubchem_id) {
        return moleculeService.getMoleculesByPubchemId(pubchem_id);
    }
    @GetMapping("/by-monoisotopicMass")
    public List<Molecule> getMoleculesByMonoisotopicMass(@RequestParam("monoisotopic_mass") double monoisotopicMass) {
        return moleculeService.getMoleculesByMonoisotopicMass(monoisotopicMass);
    }
    @GetMapping("/by-topologicalPolarSurfaceArea")
    public List<Molecule> getMoleculesByTopologicalPolarSurfaceArea(
            @RequestParam("topological_polar_surface_area") double topologicalPolarSurfaceArea) {
        return moleculeService.getMoleculesByTopologicalPolarSurfaceArea(topologicalPolarSurfaceArea);
    }
    @GetMapping("/by-heavyAtomCount")
    public List<Molecule> getMoleculesByHeavyAtomCount(@RequestParam("heavy_atom_count") int heavyAtomCount) {
        return moleculeService.getMoleculesByHeavyAtomCount(heavyAtomCount);
    }
}
