package com.example.mongodbapi.service;

import com.example.mongodbapi.model.FnProperty;
import com.example.mongodbapi.repository.FnPropertyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FnPropertyService {

    @Autowired
    private FnPropertyRepository fnPropertyRepository;

    // Fetch all properties that match the provided CoE_No
    public List<FnProperty> getPropertiesByCoeNo(String coeNo) {
        return fnPropertyRepository.findByCoeNo(coeNo);
    }

    // Fetch all properties that match the provided FemaNo
    public List<FnProperty> getPropertiesByFemaNo(Double femaNo) {
        return fnPropertyRepository.findByFemaNo(femaNo);
    }
    public List<FnProperty> getFnPropertiesByFlNo(String fl_no) {
        // Log the input to verify it matches the stored value
        System.out.println("Querying for FL No.: '" + fl_no + "'");

        // Trim and query the repository
        return fnPropertyRepository.findByFlNo(fl_no.trim());
    }

    // Fetch all properties that match the provided NAS_No
    public List<FnProperty> getPropertiesByNasNo(String nasNo) {
        // Log the input for debugging
        System.out.println("Querying for NAS No.: '" + nasNo + "'");

        // Trim and query the repository
        return fnPropertyRepository.findByNasNo(nasNo.trim());
    }
    // Fetch all properties that match the provided EINECS_No
    public List<FnProperty> getPropertiesByEinecsNo(String einecsNo) {
        // Log the input for debugging
        System.out.println("Querying for EINECS No.: '" + einecsNo + "'");

        // Trim and query the repository to avoid any whitespace issues
        return fnPropertyRepository.findByEinecsNo(einecsNo.trim());
    }
    // Fetch all properties that match the provided JECFA_No
    public List<FnProperty> getPropertiesByJecfaNo(String jecfaNo) {
        // Log the input for debugging
        System.out.println("Querying for JECFA No.: '" + jecfaNo + "'");

        // Trim and query the repository to avoid any whitespace issues
        return fnPropertyRepository.findByJecfaNo(jecfaNo.trim());
    }

}
