package com.example.mongodbapi.repository;

import com.example.mongodbapi.model.FnProperty;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FnPropertyRepository extends MongoRepository<FnProperty, String> {

    // Find properties by CoE_No
    List<FnProperty> findByCoeNo(String coeNo);

    // Find properties by FemaNo
    List<FnProperty> findByFemaNo(Double femaNo);
    // Query with exact string match for FL No.
    @Query("{ 'FL_No': ?0 }")
    List<FnProperty> findByFlNo(String fl_no);
    // Find properties by NAS_No
    @Query("{ 'NAS_No': ?0 }")
    List<FnProperty> findByNasNo(String nasNo);
    // Query to find properties by EINECS_No
    @Query("{ 'EINECS_No': ?0 }")
    List<FnProperty> findByEinecsNo(String einecsNo);
    // Query to find properties by JECFA_No
    @Query("{ 'JECFA_No': ?0 }")
    List<FnProperty> findByJecfaNo(String jecfaNo);
}
