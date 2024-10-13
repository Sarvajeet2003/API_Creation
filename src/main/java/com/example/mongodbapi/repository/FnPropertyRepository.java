package com.example.mongodbapi.repository;

import com.example.mongodbapi.model.FnProperty;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.regex.Pattern;

@Repository
public interface FnPropertyRepository extends MongoRepository<FnProperty, String> {

    // Find properties by CoE_No
    List<FnProperty> findByCoeNo(String coeNo);

    // Find properties by FemaNo
    List<FnProperty> findByFemaNo(Double femaNo);

    @Query("{ $or: [ " +
            "  { $and: [ " +
            "    { $expr: { $eq: [ { $size: { $ifNull: [?0, []] } }, 0 ] } }, " +
            "    { $expr: { $gt: [ { $size: { $ifNull: [?1, []] } }, 0 ] } }, " +
            "    { '?2': { $in: ?1 } } " +
            "  ]}, " +
            "  { $and: [ " +
            "    { $expr: { $gt: [ { $size: { $ifNull: [?0, []] } }, 0 ] } }, " +
            "    { $expr: { $eq: [ { $size: { $ifNull: [?1, []] } }, 0 ] } }, " +
            "    { '?2': { $all: ?0 } } " +
            "  ]}, " +
            "  { $and: [ " +
            "    { $expr: { $gt: [ { $size: { $ifNull: [?0, []] } }, 0 ] } }, " +
            "    { $expr: { $gt: [ { $size: { $ifNull: [?1, []] } }, 0 ] } }, " +
            "    { '?2': { $all: ?0 } }, " +
            "    { '?2': { $in: ?1 } } " +
            "  ]} " +
            "] }")
    List<FnProperty> findByField(List<Pattern> andPatterns, List<Pattern> orPatterns, String fieldName);


    @Query("{ $or: [ " +
            "  { $and: [ " +
            "    { $expr: { $eq: [ { $size: { $ifNull: [?0, []] } }, 0 ] } }, " +  // If andPatterns is empty, OR logic is applied
            "    { $expr: { $gt: [ { $size: { $ifNull: [?1, []] } }, 0 ] } }, " +  // If orPatterns has values
            "    { 'Food_Category_Usual_Max': { $regex: ?1 } } " +  // Regex for orPatterns
            "  ]}, " +
            "  { $and: [ " +
            "    { $expr: { $gt: [ { $size: { $ifNull: [?0, []] } }, 0 ] } }, " +  // If andPatterns has values
            "    { $expr: { $eq: [ { $size: { $ifNull: [?1, []] } }, 0 ] } }, " +  // If orPatterns is empty
            "    { 'Food_Category_Usual_Max': { $regex: ?0 } } " +  // Regex for andPatterns
            "  ]}, " +
            "  { $and: [ " +
            "    { $expr: { $gt: [ { $size: { $ifNull: [?0, []] } }, 0 ] } }, " +  // If both andPatterns and orPatterns have values
            "    { $expr: { $gt: [ { $size: { $ifNull: [?1, []] } }, 0 ] } }, " +
            "    { 'Food_Category_Usual_Max': { $regex: ?0 } }, " +  // Regex for andPatterns
            "    { 'Food_Category_Usual_Max': { $regex: ?1 } } " +  // Regex for orPatterns
            "  ]} " +
            "] }")
    List<FnProperty> findByFoodCategory(List<String> andRegexStrings, List<String> orRegexStrings);


}
