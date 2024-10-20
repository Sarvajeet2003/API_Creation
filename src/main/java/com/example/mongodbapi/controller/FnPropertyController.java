package com.example.mongodbapi.controller;

import com.example.mongodbapi.model.FnProperty;
import com.example.mongodbapi.service.FnPropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/properties")
public class FnPropertyController {

    @Autowired
    private FnPropertyService fnPropertyService;

    // API endpoint to filter properties by CoE_No
    @GetMapping("/by-coe")
    public List<FnProperty> getPropertiesByCoeNo(@RequestParam("coe_no") String coeNo) {
        return fnPropertyService.getPropertiesByCoeNo(coeNo);
    }

    // API endpoint to filter properties by FemaNo
    @GetMapping("/by-fema")
    public List<FnProperty> getPropertiesByFemaNo(@RequestParam("fema_no") Double femaNo) {
        return fnPropertyService.getPropertiesByFemaNo(femaNo);
    }
    @GetMapping("/by-flNo")
    public List<FnProperty> getFnPropertiesByFlNo(@RequestParam("fl_no") String fl_no) {
        return fnPropertyService.getFnPropertiesByFlNo(fl_no);
    }
    // API endpoint to filter properties by NAS_No
    @GetMapping("/by-nas")
    public List<FnProperty> getPropertiesByNasNo(@RequestParam("nas_no") String nasNo) {
        return fnPropertyService.getPropertiesByNasNo(nasNo);
    }
    // API endpoint to filter properties by EINECS_No
    @GetMapping("/by-einecs")
    public List<FnProperty> getPropertiesByEinecsNo(@RequestParam("einecs_no") String einecsNo) {
        return fnPropertyService.getPropertiesByEinecsNo(einecsNo);
    }
    // API endpoint to filter properties by JECFA_No
    @GetMapping("/by-jecfa")
    public List<FnProperty> getPropertiesByJecfaNo(@RequestParam("jecfa_no") String jecfaNo) {
        return fnPropertyService.getPropertiesByJecfaNo(jecfaNo);
    }

    @GetMapping("/taste-threshold")
    public List<FnProperty> getPropertiesByTasteThreshold(@RequestParam("values") String values) {
        return fnPropertyService.getPropertiesByTasteThreshold(values);
    }

    @GetMapping("/synthesis")
    public List<FnProperty> getPropertiesBySynthesis(@RequestParam("values") String values) {
        return fnPropertyService.getPropertiesBySynthesis(values);
    }

    @GetMapping("/food-category")
    public List<FnProperty> getPropertiesByFoodCategory(@RequestParam("values") String values) {
        return fnPropertyService.getPropertiesByFoodCategory(values);
    }
    @GetMapping("/by-tradeAssociationGuidelines")
    public List<FnProperty> getPropertiesByTradeAssociationGuidelines(@RequestParam("guideline") String tradeAssociationGuidelines) {
        return fnPropertyService.getPropertiesByTradeAssociationGuidelines(tradeAssociationGuidelines);
    }
    @GetMapping("/by-naturalOccurrence")
    public List<FnProperty> getPropertiesByNaturalOccurrence(@RequestParam("occurrence") String naturalOccurrence) {
        return fnPropertyService.getPropertiesByNaturalOccurrence(naturalOccurrence);
    }
    @GetMapping("/by-aromaThresholdValues")
    public List<FnProperty> getPropertiesByAromaThresholdValues(@RequestParam("threshold") String aromaThresholdValues) {
        return fnPropertyService.getPropertiesByAromaThresholdValues(aromaThresholdValues);
    }
    @GetMapping("/by-description")
    public List<FnProperty> getPropertiesByDescription(@RequestParam("desc") String description) {
        return fnPropertyService.getPropertiesByDescription(description);
    }
    @GetMapping("/by-iofi-categorisation")
    public List<FnProperty> getPropertiesByIofiCategorisation(@RequestParam("category") String iofiCategorisation) {
        return fnPropertyService.getPropertiesByIofiCategorisation(iofiCategorisation);
    }
    @GetMapping("/by-coe-approval")
    public List<FnProperty> getPropertiesByCoeApproval(@RequestParam("coe_approval") String coeApproval) {
        return fnPropertyService.getPropertiesByCoeApproval(coeApproval);
    }
}
