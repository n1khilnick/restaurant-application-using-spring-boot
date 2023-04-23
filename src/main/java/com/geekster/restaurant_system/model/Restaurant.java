package com.geekster.restaurant_system.model;

public class Restaurant {
     private String id;
     private String name;
     private String address;
     private String number;
     private String speciality;
     private int totalStaff;

    public Restaurant(String id, String name, String address, String number, String spciality, int totalStaff) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.number = number;
        this.speciality = spciality;
        this.totalStaff = totalStaff;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public int getTotalStaff() {
        return totalStaff;
    }

    public void setTotalStaff(int totalStaff) {
        this.totalStaff = totalStaff;
    }
}
