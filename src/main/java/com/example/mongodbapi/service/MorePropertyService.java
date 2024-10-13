package com.example.mongodbapi.service;

import com.example.mongodbapi.model.MoreProperty;
import com.example.mongodbapi.repository.MorePropertyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MorePropertyService {

    @Autowired
    private MorePropertyRepository morePropertyRepository;

    public List<MoreProperty> getPropertiesByNumberOfAromaticRings(int numberOfAromaticRings) {
        System.out.println("Querying for Number of Aromatic Rings: " + numberOfAromaticRings);
        return morePropertyRepository.findByNumberOfAromaticRings(numberOfAromaticRings);
    }
    // Fetch properties that match the provided number of aromatic bonds
    public List<MoreProperty> getPropertiesByNumberOfAromaticBonds(int numberOfAromaticBonds) {
        System.out.println("Querying for Number of Aromatic Bonds: " + numberOfAromaticBonds);
        return morePropertyRepository.findByNumberOfAromaticBonds(numberOfAromaticBonds);
    }
    // Fetch properties that match the provided number of rings
    public List<MoreProperty> getPropertiesByNumRings(int numRings) {
        System.out.println("Querying for Number of Rings: " + numRings);
        return morePropertyRepository.findByNumRings(numRings);
    }
    public List<MoreProperty> getPropertiesByNumRotatableBonds(int numRotatableBonds) {
        System.out.println("Querying for Number of Rotatable Bonds: " + numRotatableBonds);
        return morePropertyRepository.findByNumRotatableBonds(numRotatableBonds);
    }
    public List<MoreProperty> getPropertiesBySurfaceArea(double surfaceArea) {
        System.out.println("Querying for Surface Area: " + surfaceArea);
        return morePropertyRepository.findBySurfaceArea(surfaceArea);
    }
    public List<MoreProperty> getPropertiesByAlogp(double alogp) {
        System.out.println("Querying for ALogP: " + alogp);
        return morePropertyRepository.findByAlogp(alogp);
    }
    public List<MoreProperty> getPropertiesByNumberOfAtoms(int numberOfAtoms) {
        System.out.println("Querying for Number of Atoms: " + numberOfAtoms);
        return morePropertyRepository.findByNumberOfAtoms(numberOfAtoms);
    }
    public List<MoreProperty> getPropertiesByEnergy(double energy) {
        System.out.println("Querying for Energy: " + energy);
        return morePropertyRepository.findByEnergy(energy);
    }
}
