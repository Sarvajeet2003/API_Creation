package com.example.mongodbapi.repository;

import com.example.mongodbapi.model.FnProperty;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FnPropertyRepository extends MongoRepository<FnProperty, String> {

    // Find properties by CoE_No
    List<FnProperty> findByCoeNo(String coeNo);

    // Find properties by FemaNo
    List<FnProperty> findByFemaNo(Double femaNo);
}
