/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.corpay.dao.cxxcow;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;
import java.io.Serializable;

/**
 *
 * @author Sukant.Tiwari
 */
@Entity
@Table(name = "PRODUCT_CONTROL", catalog = "", schema = "CXXCOW")
@NamedQueries({
    @NamedQuery(name = "ProductControl.findAll", query = "SELECT p FROM ProductControl p"),
    @NamedQuery(name = "ProductControl.findByProdcId", query = "SELECT p FROM ProductControl p WHERE p.prodcId = :prodcId"),
    @NamedQuery(name = "ProductControl.findByProdcDesc", query = "SELECT p FROM ProductControl p WHERE p.prodcDesc = :prodcDesc"),
    @NamedQuery(name = "ProductControl.findByMrchGrp", query = "SELECT p FROM ProductControl p WHERE p.mrchGrp = :mrchGrp")})
public class ProductControl implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PRODC_ID")
    private Integer prodcId;
    @Basic(optional = false)
    @Column(name = "PRODC_DESC")
    private String prodcDesc;
    @Basic(optional = false)
    @Column(name = "MRCH_GRP")
    private String mrchGrp;

    public ProductControl() {
    }

    public ProductControl(Integer prodcId) {
        this.prodcId = prodcId;
    }

    public ProductControl(Integer prodcId, String prodcDesc, String mrchGrp) {
        this.prodcId = prodcId;
        this.prodcDesc = prodcDesc;
        this.mrchGrp = mrchGrp;
    }

    public Integer getProdcId() {
        return prodcId;
    }

    public void setProdcId(Integer prodcId) {
        this.prodcId = prodcId;
    }

    public String getProdcDesc() {
        return prodcDesc;
    }

    public void setProdcDesc(String prodcDesc) {
        this.prodcDesc = prodcDesc;
    }

    public String getMrchGrp() {
        return mrchGrp;
    }

    public void setMrchGrp(String mrchGrp) {
        this.mrchGrp = mrchGrp;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (prodcId != null ? prodcId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductControl)) {
            return false;
        }
        ProductControl other = (ProductControl) object;
        if ((this.prodcId == null && other.prodcId != null) || (this.prodcId != null && !this.prodcId.equals(other.prodcId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.cxxcow.ProductControl[ prodcId=" + prodcId + " ]";
    }
    
}
