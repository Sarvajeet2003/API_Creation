package com.example.mongodbapi.controller;

import com.example.mongodbapi.model.Molecule;
import com.example.mongodbapi.service.MoleculeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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

    @GetMapping("/filter-by-weight-from")
    public List<Molecule> getMoleculesByWeightFrom(@RequestParam double from) {
        return moleculeService.findMoleculesByWeightFrom(from);
    }

    @GetMapping("/filter-by-weight-range")
    public List<Molecule> getMoleculesByWeightRange(@RequestParam double from, @RequestParam double to) {
        return moleculeService.findMoleculesByWeightRange(from, to);
    }

    @GetMapping("/filter-by-hbd-count")
    public List<Molecule> filterByHbdCount(@RequestParam int hbdCount) {
        return moleculeService.findByHbdCount(hbdCount);
    }

    @GetMapping("/filter-by-hba-count")
    public List<Molecule> filterByHbaCount(@RequestParam int hbaCount) {
        return moleculeService.findByHbaCount(hbaCount);
    }

    @GetMapping("/filter-by-type")
    public ResponseEntity<List<Molecule>> getMoleculesByType(@RequestParam String type) {
        List<Molecule> molecules = moleculeService.findByType(type);
        return ResponseEntity.ok(molecules);
    }
}
