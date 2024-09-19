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
}
