package com.example.mongodbapi.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "molecules_data")
public class Molecule {

    @Id
    private String id;
    private int pubchem_id;
    private String iupac_name;

    @Field("common_name")
    private String commonName;

    @Field("functional_groups")
    private String functionalGroups;  // Correct naming convention (camelCase)
    private String smile;
    private double molecular_weight;
    private int hbd_count;
    private int hba_count;
    private int num_rotatablebonds;
    private double complexity;
    private double topological_polor_surfacearea;

    @Field("flavor_profile")
    private String flavorProfile;

    @Field("fema_flavor_profile")
    private String femaFlavorProfile;

    public String getFemaFlavorProfile() {
        return femaFlavorProfile;
    }

    public void setFemaFlavorProfile(String femaFlavorProfile) {
        this.femaFlavorProfile = femaFlavorProfile;
    }
// Add other fields as per the CSV if necessary

    // Constructors, Getters, and Setters
    public Molecule() {}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getPubchem_id() {
        return pubchem_id;
    }

    public void setPubchem_id(int pubchem_id) {
        this.pubchem_id = pubchem_id;
    }

    public String getIupac_name() {
        return iupac_name;
    }

    public void setIupac_name(String iupac_name) {
        this.iupac_name = iupac_name;
    }

    public String getCommonName() {
        return commonName;
    }

    public void setCommonName(String commonName) {
        this.commonName = commonName;
    }

    public String getFunctional_groups() {
        return functionalGroups;
    }

    public void setFunctional_groups(String functiona_groups) {
        this.functionalGroups = functiona_groups;
    }

    public String getSmile() {
        return smile;
    }

    public void setSmile(String smile) {
        this.smile = smile;
    }

    public double getMolecular_weight() {
        return molecular_weight;
    }

    public void setMolecular_weight(double molecular_weight) {
        this.molecular_weight = molecular_weight;
    }

    public int getHbd_count() {
        return hbd_count;
    }

    public void setHbd_count(int hbd_count) {
        this.hbd_count = hbd_count;
    }

    public int getHba_count() {
        return hba_count;
    }

    public void setHba_count(int hba_count) {
        this.hba_count = hba_count;
    }

    public int getNum_rotatablebonds() {
        return num_rotatablebonds;
    }

    public void setNum_rotatablebonds(int num_rotatablebonds) {
        this.num_rotatablebonds = num_rotatablebonds;
    }

    public double getComplexity() {
        return complexity;
    }

    public void setComplexity(double complexity) {
        this.complexity = complexity;
    }

    public double getTopological_polor_surfacearea() {
        return topological_polor_surfacearea;
    }

    public void setTopological_polor_surfacearea(double topological_polor_surfacearea) {
        this.topological_polor_surfacearea = topological_polor_surfacearea;
    }

    public String getFlavor_profile() {
        return flavorProfile;
    }

    public void setFlavor_profile(String flavor_profile) {
        this.flavorProfile = flavor_profile;
    }
}
