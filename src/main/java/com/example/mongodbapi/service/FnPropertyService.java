package com.example.mongodbapi.service;

import com.example.mongodbapi.model.FnProperty;
import com.example.mongodbapi.repository.FnPropertyRepository;
import org.springframework.beans.factory.annotation.Autowired;
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
    public List<FnProperty> getPropertiesByTradeAssociationGuidelines(String tradeAssociationGuidelines) {
        System.out.println("Querying for Trade Association Guidelines: '" + tradeAssociationGuidelines + "'");
        return fnPropertyRepository.findByTradeAssociationGuidelines(tradeAssociationGuidelines.trim());
    }
    public List<FnProperty> getPropertiesByNaturalOccurrence(String naturalOccurrence) {
        System.out.println("Querying for Natural Occurrence: '" + naturalOccurrence + "'");
        return fnPropertyRepository.findByNaturalOccurrence(naturalOccurrence.trim());
    }
    public List<FnProperty> getPropertiesByAromaThresholdValues(String aromaThresholdValues) {
        System.out.println("Querying for Aroma Threshold Values: '" + aromaThresholdValues + "'");
        return fnPropertyRepository.findByAromaThresholdValues(aromaThresholdValues.trim());
    }
    public List<FnProperty> getPropertiesByDescription(String description) {
        System.out.println("Querying for Description: '" + description + "'");
        return fnPropertyRepository.findByDescriptionContainingIgnoreCase(description.trim());
    }
    public List<FnProperty> getPropertiesByIofiCategorisation(String iofiCategorisation) {
        System.out.println("Querying for IOFI Categorisation: '" + iofiCategorisation + "'");
        return fnPropertyRepository.findByIofiCategorisationContainingIgnoreCase(iofiCategorisation.trim());
    }
    public List<FnProperty> getPropertiesByCoeApproval(String coeApproval) {
        System.out.println("Querying for CoE Approval: '" + coeApproval + "'");
        return fnPropertyRepository.findByCoeApprovalContainingIgnoreCase(coeApproval.trim());
    }
}
