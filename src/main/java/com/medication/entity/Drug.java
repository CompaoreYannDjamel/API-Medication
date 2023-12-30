package com.medication.entity;

import jakarta.persistence.*;
//Bara Diop

@Entity
@Table(name = "drug")
public class Drug {
    @Column(name = "catnumber")
    private int catNumber;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "drugnumber")
    private int drugNumber;

    @Column(name = "dci")
    private String dci;

    @Column(name = "dosage")
    private String dosage;

    @Column(name = "form")
    private String form;

    @Column(name = "reference")
    private String reference;

    @Column(name = "cases")
    private int cases;

    @Column(name = "posts")
    private int posts;

    @Column(name = "centers")
    private int centers;

    @Column(name = "eps1")
    private int eps1;

    @Column(name = "eps2")
    private int eps2;

    @Column(name = "eps3")
    private int eps3;

    @Column(name = "createdBy")
    private String createdBy;

    @Column(name = "lastUpdatedBy")
    private String lastUpdatedBy;

    @Column(name = "status")
    private int status;

    public Drug() {
    }

    public int getCatNumber() {
        return catNumber;
    }

    public void setCatNumber(int catNumber) {
        this.catNumber = catNumber;
    }

    public int getDrugNumber() {
        return drugNumber;
    }

    public void setDrugNumber(int drugNumber) {
        this.drugNumber = drugNumber;
    }

    public String getDci() {
        return dci;
    }

    public void setDci(String dci) {
        this.dci = dci;
    }

    public String getDosage() {
        return dosage;
    }

    public void setDosage(String dosage) {
        this.dosage = dosage;
    }

    public String getForm() {
        return form;
    }

    public void setForm(String form) {
        this.form = form;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public int getCases() {
        return cases;
    }

    public void setCases(int cases) {
        this.cases = cases;
    }

    public int getPosts() {
        return posts;
    }

    public void setPosts(int posts) {
        this.posts = posts;
    }

    public int getCenters() {
        return centers;
    }

    public void setCenters(int centers) {
        this.centers = centers;
    }

    public int getEps1() {
        return eps1;
    }

    public void setEps1(int eps1) {
        this.eps1 = eps1;
    }

    public int getEps2() {
        return eps2;
    }

    public void setEps2(int eps2) {
        this.eps2 = eps2;
    }

    public int getEps3() {
        return eps3;
    }

    public void setEps3(int eps3) {
        this.eps3 = eps3;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    public void setLastUpdatedBy(String lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

}
