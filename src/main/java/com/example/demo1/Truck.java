package com.example.demo1;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
class Truck {

    private @Id String locationId;
    private String Applicant;
    private String FacilityType;
    //    private String LocationDescription;
    private String Address;
    private String blocklot;
    private String block;
    private String lot;
//    private String FoodItems;
    private String  ZipCodes;

    public Truck() {}

    public String getLocationId() {
        return locationId;
    }

    public void setLocationId(String locationId) {
        this.locationId = locationId;
    }

    public String getApplicant() {
        return Applicant;
    }

    public void setApplicant(String applicant) {
        Applicant = applicant;
    }

    public String getFacilityType() {
        return FacilityType;
    }

    public void setFacilityType(String facilityType) {
        FacilityType = facilityType;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getBlocklot() {
        return blocklot;
    }

    public void setBlocklot(String blocklot) {
        this.blocklot = blocklot;
    }

    public String getBlock() {
        return block;
    }

    public void setBlock(String block) {
        this.block = block;
    }

    public String getLot() {
        return lot;
    }

    public void setLot(String lot) {
        this.lot = lot;
    }

//    public String getFoodItems() {
//        return FoodItems;
//    }
//
//    public void setFoodItems(String foodItems) {
//        FoodItems = foodItems;
//    }

    public String getZipCodes() {
        return ZipCodes;
    }

    public void setZipCodes(String zipCodes) {
        ZipCodes = zipCodes;
    }






}
