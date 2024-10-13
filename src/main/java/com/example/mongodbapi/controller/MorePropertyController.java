package com.example.mongodbapi.controller;

import com.example.mongodbapi.model.MoreProperty;
import com.example.mongodbapi.service.MorePropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/more_properties")
public class MorePropertyController {

    @Autowired
    private MorePropertyService morePropertyService;

    @GetMapping("/by-aromaticRings")
    public List<MoreProperty> getPropertiesByNumberOfAromaticRings(@RequestParam("aromatic_rings") int aromaticRings) {
        return morePropertyService.getPropertiesByNumberOfAromaticRings(aromaticRings);
    }

    @GetMapping("/by-aromaticBonds")
    public List<MoreProperty> getPropertiesByNumberOfAromaticBonds(@RequestParam("aromatic_bonds") int aromaticBonds) {
        return morePropertyService.getPropertiesByNumberOfAromaticBonds(aromaticBonds);
    }
    @GetMapping("/by-numRings")
    public List<MoreProperty> getPropertiesByNumRings(@RequestParam("num_rings") int numRings) {
        return morePropertyService.getPropertiesByNumRings(numRings);
    }
    @GetMapping("/by-rotatableBonds")
    public List<MoreProperty> getPropertiesByNumRotatableBonds(@RequestParam("rotatable_bonds") int numRotatableBonds) {
        return morePropertyService.getPropertiesByNumRotatableBonds(numRotatableBonds);
    }
    @GetMapping("/by-surfaceArea")
    public List<MoreProperty> getPropertiesBySurfaceArea(@RequestParam("surface_area") double surfaceArea) {
        return morePropertyService.getPropertiesBySurfaceArea(surfaceArea);
    }
    @GetMapping("/by-alogp")
    public List<MoreProperty> getPropertiesByAlogp(@RequestParam("alogp") double alogp) {
        return morePropertyService.getPropertiesByAlogp(alogp);
    }
    @GetMapping("/by-numberOfAtoms")
    public List<MoreProperty> getPropertiesByNumberOfAtoms(@RequestParam("number_of_atoms") int numberOfAtoms) {
        return morePropertyService.getPropertiesByNumberOfAtoms(numberOfAtoms);
    }
    @GetMapping("/by-energy")
    public List<MoreProperty> getPropertiesByEnergy(@RequestParam("energy") double energy) {
        return morePropertyService.getPropertiesByEnergy(energy);
    }
}
