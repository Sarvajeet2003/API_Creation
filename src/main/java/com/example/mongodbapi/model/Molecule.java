package com.example.mongodbapi.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "molecules_data")
public class Molecule {

    @Id
    private String id;

    @Field("pubchem_id")
    private int pubchemId;

    @Field("iupac_name")
    private String iupacName;

    @Field("common_name")
    private String commonName;

    @Field("smile")
    private String smile;

    @Field("molecular_weight")
    private double molecularWeight;

    @Field("hbd_count")
    private int hbdCount;

    @Field("hba_count")
    private int hbaCount;

    @Field("num_rotatablebonds")
    private int numRotatableBonds;

    @Field("complexity")
    private double complexity;

    @Field("topological_polor_surfacearea")
    private double topologicalPolarSurfaceArea;

    @Field("monoisotopic_mass")
    private double monoisotopicMass;

    @Field("exact_mass")
    private double exactMass;

    @Field("xlogp")
    private double xlogp;

    @Field("charge")
    private int charge;

    @Field("heavy_atom_count")
    private int heavyAtomCount;

    @Field("atom_stereo_count")
    private int atomStereoCount;

    @Field("defined_atom_stereocenter_count")
    private int definedAtomStereoCenterCount;

    @Field("undefined_atom_stereocenter_count")
    private int undefinedAtomStereoCenterCount;

    @Field("bond_stereo_count")
    private int bondStereoCount;

    @Field("defined_bond_stereocenter_count")
    private int definedBondStereoCenterCount;

    @Field("undefined_bond_stereocenter_count")
    private int undefinedBondStereoCenterCount;

    @Field("isotope_atom_count")
    private int isotopeAtomCount;

    @Field("covalently_bonded_unit_count")
    private int covalentlyBondedUnitCount;

    @Field("cas_id")
    private String casId;

    @Field("fema_number")
    private String femaNumber;

    @Field("fema_flavor_profile")
    private String femaFlavorProfile;

    @Field("odor")
    private String odor;

    @Field("taste")
    private String taste;

    @Field("functional_groups")
    private String functionalGroups;

    @Field("inchi")
    private String inchi;

    @Field("volume3d")
    private double volume3d;

    @Field("fooddb_flavor_profile")
    private String foodDbFlavorProfile;

    @Field("super_sweet")
    private double superSweet;

    @Field("bitter")
    private double bitter;

    @Field("supersweetdb_id")
    private double superSweetDbId;

    @Field("bitterdb_id")
    private double bitterDbId;

    @Field("fooddb_id")
    private String foodDbId;

    @Field("flavornet_id")
    private int flavorNetId;

    @Field("fenoroli_and_os")
    private int fenoroliAndOs;

    @Field("natural")
    private int natural;

    @Field("unknown_natural")
    private int unknownNatural;

    @Field("synthetic")
    private int synthetic;

    @Field("flavor_profile")
    private String flavorProfile;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getPubchemId() {
        return pubchemId;
    }

    public void setPubchemId(int pubchemId) {
        this.pubchemId = pubchemId;
    }

    public String getIupacName() {
        return iupacName;
    }

    public void setIupacName(String iupacName) {
        this.iupacName = iupacName;
    }

    public String getCommonName() {
        return commonName;
    }

    public void setCommonName(String commonName) {
        this.commonName = commonName;
    }

    public String getSmile() {
        return smile;
    }

    public void setSmile(String smile) {
        this.smile = smile;
    }

    public double getMolecularWeight() {
        return molecularWeight;
    }

    public void setMolecularWeight(double molecularWeight) {
        this.molecularWeight = molecularWeight;
    }

    public int getHbdCount() {
        return hbdCount;
    }

    public void setHbdCount(int hbdCount) {
        this.hbdCount = hbdCount;
    }

    public int getHbaCount() {
        return hbaCount;
    }

    public void setHbaCount(int hbaCount) {
        this.hbaCount = hbaCount;
    }

    public int getNumRotatableBonds() {
        return numRotatableBonds;
    }

    public void setNumRotatableBonds(int numRotatableBonds) {
        this.numRotatableBonds = numRotatableBonds;
    }

    public double getComplexity() {
        return complexity;
    }

    public void setComplexity(double complexity) {
        this.complexity = complexity;
    }

    public double getTopologicalPolarSurfaceArea() {
        return topologicalPolarSurfaceArea;
    }

    public void setTopologicalPolarSurfaceArea(double topologicalPolarSurfaceArea) {
        this.topologicalPolarSurfaceArea = topologicalPolarSurfaceArea;
    }

    public double getMonoisotopicMass() {
        return monoisotopicMass;
    }

    public void setMonoisotopicMass(double monoisotopicMass) {
        this.monoisotopicMass = monoisotopicMass;
    }

    public double getExactMass() {
        return exactMass;
    }

    public void setExactMass(double exactMass) {
        this.exactMass = exactMass;
    }

    public double getXlogp() {
        return xlogp;
    }

    public void setXlogp(double xlogp) {
        this.xlogp = xlogp;
    }

    public int getCharge() {
        return charge;
    }

    public void setCharge(int charge) {
        this.charge = charge;
    }

    public int getHeavyAtomCount() {
        return heavyAtomCount;
    }

    public void setHeavyAtomCount(int heavyAtomCount) {
        this.heavyAtomCount = heavyAtomCount;
    }

    public int getAtomStereoCount() {
        return atomStereoCount;
    }

    public void setAtomStereoCount(int atomStereoCount) {
        this.atomStereoCount = atomStereoCount;
    }

    public int getDefinedAtomStereoCenterCount() {
        return definedAtomStereoCenterCount;
    }

    public void setDefinedAtomStereoCenterCount(int definedAtomStereoCenterCount) {
        this.definedAtomStereoCenterCount = definedAtomStereoCenterCount;
    }

    public int getUndefinedAtomStereoCenterCount() {
        return undefinedAtomStereoCenterCount;
    }

    public void setUndefinedAtomStereoCenterCount(int undefinedAtomStereoCenterCount) {
        this.undefinedAtomStereoCenterCount = undefinedAtomStereoCenterCount;
    }

    public int getBondStereoCount() {
        return bondStereoCount;
    }

    public void setBondStereoCount(int bondStereoCount) {
        this.bondStereoCount = bondStereoCount;
    }

    public int getDefinedBondStereoCenterCount() {
        return definedBondStereoCenterCount;
    }

    public void setDefinedBondStereoCenterCount(int definedBondStereoCenterCount) {
        this.definedBondStereoCenterCount = definedBondStereoCenterCount;
    }

    public int getUndefinedBondStereoCenterCount() {
        return undefinedBondStereoCenterCount;
    }

    public void setUndefinedBondStereoCenterCount(int undefinedBondStereoCenterCount) {
        this.undefinedBondStereoCenterCount = undefinedBondStereoCenterCount;
    }

    public int getIsotopeAtomCount() {
        return isotopeAtomCount;
    }

    public void setIsotopeAtomCount(int isotopeAtomCount) {
        this.isotopeAtomCount = isotopeAtomCount;
    }

    public int getCovalentlyBondedUnitCount() {
        return covalentlyBondedUnitCount;
    }

    public void setCovalentlyBondedUnitCount(int covalentlyBondedUnitCount) {
        this.covalentlyBondedUnitCount = covalentlyBondedUnitCount;
    }

    public String getCasId() {
        return casId;
    }

    public void setCasId(String casId) {
        this.casId = casId;
    }

    public String getFemaNumber() {
        return femaNumber;
    }

    public void setFemaNumber(String femaNumber) {
        this.femaNumber = femaNumber;
    }

    public String getFemaFlavorProfile() {
        return femaFlavorProfile;
    }

    public void setFemaFlavorProfile(String femaFlavorProfile) {
        this.femaFlavorProfile = femaFlavorProfile;
    }

    public String getOdor() {
        return odor;
    }

    public void setOdor(String odor) {
        this.odor = odor;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    public String getFunctionalGroups() {
        return functionalGroups;
    }

    public void setFunctionalGroups(String functionalGroups) {
        this.functionalGroups = functionalGroups;
    }

    public String getInchi() {
        return inchi;
    }

    public void setInchi(String inchi) {
        this.inchi = inchi;
    }

    public double getVolume3d() {
        return volume3d;
    }

    public void setVolume3d(double volume3d) {
        this.volume3d = volume3d;
    }

    public String getFoodDbFlavorProfile() {
        return foodDbFlavorProfile;
    }

    public void setFoodDbFlavorProfile(String foodDbFlavorProfile) {
        this.foodDbFlavorProfile = foodDbFlavorProfile;
    }

    public double getSuperSweet() {
        return superSweet;
    }

    public void setSuperSweet(double superSweet) {
        this.superSweet = superSweet;
    }

    public double getBitter() {
        return bitter;
    }

    public void setBitter(double bitter) {
        this.bitter = bitter;
    }

    public double getSuperSweetDbId() {
        return superSweetDbId;
    }

    public void setSuperSweetDbId(double superSweetDbId) {
        this.superSweetDbId = superSweetDbId;
    }

    public double getBitterDbId() {
        return bitterDbId;
    }

    public void setBitterDbId(double bitterDbId) {
        this.bitterDbId = bitterDbId;
    }

    public String getFoodDbId() {
        return foodDbId;
    }

    public void setFoodDbId(String foodDbId) {
        this.foodDbId = foodDbId;
    }

    public int getFlavorNetId() {
        return flavorNetId;
    }

    public void setFlavorNetId(int flavorNetId) {
        this.flavorNetId = flavorNetId;
    }

    public int getFenoroliAndOs() {
        return fenoroliAndOs;
    }

    public void setFenoroliAndOs(int fenoroliAndOs) {
        this.fenoroliAndOs = fenoroliAndOs;
    }

    public int getNatural() {
        return natural;
    }

    public void setNatural(int natural) {
        this.natural = natural;
    }

    public int getUnknownNatural() {
        return unknownNatural;
    }

    public void setUnknownNatural(int unknownNatural) {
        this.unknownNatural = unknownNatural;
    }

    public int getSynthetic() {
        return synthetic;
    }

    public void setSynthetic(int synthetic) {
        this.synthetic = synthetic;
    }

    public String getFlavorProfile() {
        return flavorProfile;
    }

    public void setFlavorProfile(String flavorProfile) {
        this.flavorProfile = flavorProfile;
    }
// Constructors, Getters, and Setters

    public Molecule() {
    }
}