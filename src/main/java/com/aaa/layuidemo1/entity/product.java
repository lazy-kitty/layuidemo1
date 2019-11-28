package com.aaa.layuidemo1.entity;

import java.util.Date;

public class product {
    private Integer productid;
    private String productname;
    private Double productprice;
    private Date producttime;
    private Date   buytime;
    private Integer catagoryid;
    private String  catagoryname;

    public Integer getProductid() {

        return productid;
    }

    public void setProductid(
            Integer productid) {
        this.productid = productid;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {

        this.productname = productname;
    }

    public Double getProductprice() {
        return productprice;
    }

    public void setProductprice(Double productprice) {
        this.productprice = productprice;
    }

    public Date getProducttime() {
        return producttime;
    }

    public void setProducttime(Date producttime) {
        this.producttime = producttime;
    }

    public Date getBuytime() {
        return buytime;
    }

    public void setBuytime(Date buytime) {
        this.buytime = buytime;
    }

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
        return "product{" +
                "productid=" + productid +
                ", productname='" + productname + '\'' +
                ", productprice=" + productprice +
                ", producttime=" + producttime +
                ", buytime=" + buytime +
                ", catagoryid=" + catagoryid +
                ", catagoryname='" + catagoryname + '\'' +
                '}';
    }

}
