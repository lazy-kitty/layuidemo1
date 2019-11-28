package com.aaa.layuidemo1.entity;

public class catagory {
    private Integer catagoryid;
    private String catagoryname;

    public Integer getCatagoryid() {
        return catagoryid;
    }

    public void setCatagoryid(Integer catagoryid) {
        this.catagoryid = catagoryid;
    }

    public String getCatagoryname() {
        return catagoryname;
    }

    public void setCatagoryname(String catagoryname) {
        this.catagoryname = catagoryname;
    }

    @Override
    public String toString() {
        return "catagory{" +
                "catagoryid=" + catagoryid +
                ", catagoryname='" + catagoryname + '\'' +
                '}';
    }
}
