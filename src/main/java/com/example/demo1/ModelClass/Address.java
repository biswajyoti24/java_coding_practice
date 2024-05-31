package com.example.demo1.ModelClass;

public class Address {
    private String placename;
    private String district;
    private String state;
    private Integer pinno;

    private Integer empid;
    public Address(){

    }

    public String getPlacename() {
        return placename;
    }

    public void setPlacename(String placename) {
        this.placename = placename;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Integer getPinno() {
        return pinno;
    }

    public void setPinno(Integer pinno) {
        this.pinno = pinno;
    }

    public Integer getEmpid() {
        return empid;
    }

    public void setEmpid(Integer empid) {
        this.empid = empid;
    }
}
