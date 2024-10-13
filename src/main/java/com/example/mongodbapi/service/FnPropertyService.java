package com.example.mongodbapi.service;

import com.example.mongodbapi.model.FnProperty;
import com.example.mongodbapi.repository.FnPropertyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

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


    // Existing method for "Taste_threshold_values"
    public List<FnProperty> getPropertiesByTasteThreshold(String values) {
        return buildQueryForField(values, "Taste_threshold_values");
    }

    // New method for "Synthesis" field
    public List<FnProperty> getPropertiesBySynthesis(String values) {
        return buildQueryForField(values, "Synthesis");
    }

    // Helper method to avoid duplication of logic
    private List<FnProperty> buildQueryForField(String values, String fieldName) {
        values = values.trim();
        List<String> andValues = new ArrayList<>();
        List<String> orValues = new ArrayList<>();

        // Check if the string contains '@' (AND condition)
        if (values.contains("@")) {
            andValues.addAll(Arrays.asList(values.split("@")));
        }
        // Check if the string contains '!' (OR condition)
        else if (values.contains("!")) {
            orValues.addAll(Arrays.asList(values.split("!")));
        }
        // If neither '@' nor '!' is present, treat as a single value
        else {
            andValues.add(values);
        }

        // Generate a list of Mongo regex patterns for AND values
        List<Pattern> andPatterns = new ArrayList<>();
        for (String value : andValues) {
            andPatterns.add(Pattern.compile(".*" + Pattern.quote(value.trim()) + ".*", Pattern.CASE_INSENSITIVE));
        }

        // Generate a list of Mongo regex patterns for OR values
        List<Pattern> orPatterns = new ArrayList<>();
        for (String value : orValues) {
            orPatterns.add(Pattern.compile(".*" + Pattern.quote(value.trim()) + ".*", Pattern.CASE_INSENSITIVE));
        }

        // Return the filtered results based on AND and OR conditions
        return fnPropertyRepository.findByField(andPatterns, orPatterns, fieldName);
    }

//not working will remove it
    public List<FnProperty> getPropertiesByFoodCategory(String values) {
        values = values.trim();
        List<String> andValues = new ArrayList<>();
        List<String> orValues = new ArrayList<>();

        // Check if the string contains '@' (AND condition)
        if (values.contains("@")) {
            andValues.addAll(Arrays.asList(values.split("@")));
        }
        // Check if the string contains '!' (OR condition)
        else if (values.contains("!")) {
            orValues.addAll(Arrays.asList(values.split("!")));
        }
        // If neither '@' nor '!' is present, treat as a single value
        else {
            andValues.add(values);
        }

        // Generate a list of Mongo regex patterns for AND values as strings
        List<String> andRegexStrings = new ArrayList<>();
        for (String value : andValues) {
            andRegexStrings.add(".*" + Pattern.quote(value.trim()) + ".*");
        }

        // Generate a list of Mongo regex patterns for OR values as strings
        List<String> orRegexStrings = new ArrayList<>();
        for (String value : orValues) {
            orRegexStrings.add(".*" + Pattern.quote(value.trim()) + ".*");
        }

        // Return the filtered results based on AND and OR conditions
        return fnPropertyRepository.findByFoodCategory(andRegexStrings, orRegexStrings);
    }

}
