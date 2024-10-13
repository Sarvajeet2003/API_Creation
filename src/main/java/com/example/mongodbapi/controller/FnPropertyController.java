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
}
