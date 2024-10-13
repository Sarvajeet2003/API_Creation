package com.example.mongodbapi.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "molecules_data")
public class Molecule {

    @Id
    private String id;

    @Field("pubchem_id")
    private int pubchem_id;

    @Field("iupac_name")
    private String iupac_name;

    @Field("common_name")
    private String commonName;

    @Field("functional_groups")
    private String functionalGroups;  // Correct naming convention (camelCase)

    @Field("smile")
    private String smile;

    @Field("molecular_weight")
    private double molecular_weight;

    @Field("hbd_count")
    private int hbd_count;

    @Field("hba_count")
    private int hba_count;

    @Field("num_rotatablebonds")
    private int num_rotatablebonds;

    @Field("complexity")
    private double complexity;

    @Field("topological_polor_surfacearea")
    private double topological_polor_surfacearea;

    @Field("flavor_profile")
    private String flavorProfile;

    @Field("fema_flavor_profile")
    private String femaFlavorProfile;

    @Field("natural")
    private int natural;

    @Field("synthetic")
    private int synthetic;

    @Field("unknown_natural")
    private int unknown_natural;

    public int getNatural() {
        return natural;
    }

    public void setNatural(int natural) {
        this.natural = natural;
    }

    public int getSynthetic() {
        return synthetic;
    }

    public void setSynthetic(int synthetic) {
        this.synthetic = synthetic;
    }

    public int getUnknownNatural() {
        return unknown_natural;
    }

    public void setUnknownNatural(int unknown_natural) {
        this.unknown_natural = unknown_natural;
    }

    public String getFunctionalGroups() {
        return functionalGroups;
    }

    public void setFunctionalGroups(String functionalGroups) {
        this.functionalGroups = functionalGroups;
    }

    public String getFlavorProfile() {
        return flavorProfile;
    }

    public void setFlavorProfile(String flavorProfile) {
        this.flavorProfile = flavorProfile;
    }

    public String getFemaFlavorProfile() {
        return femaFlavorProfile;
    }

    public void setFemaFlavorProfile(String femaFlavorProfile) {
        this.femaFlavorProfile = femaFlavorProfile;
    }


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
