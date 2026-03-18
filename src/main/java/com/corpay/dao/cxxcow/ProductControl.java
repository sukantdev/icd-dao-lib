package com.corpay.dao.cxxcow;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "PRODUCT_CONTROL", catalog = "", schema = "CXXCOW")
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
