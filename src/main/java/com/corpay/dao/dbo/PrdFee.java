/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 *
 * @author Sukant.Tiwari
 */
@Entity
@Table(name = "PRD_FEE", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "PrdFee.findAll", query = "SELECT p FROM PrdFee p")})
public class PrdFee implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PrdFeePK prdFeePK;
    @Basic(optional = false)
    @Column(name = "PRD_DESC")
    private String prdDesc;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "PRD_FEE")
    private BigDecimal prdFee;

    public PrdFee() {
    }

    public PrdFee(PrdFeePK prdFeePK) {
        this.prdFeePK = prdFeePK;
    }

    public PrdFee(PrdFeePK prdFeePK, String prdDesc, BigDecimal prdFee) {
        this.prdFeePK = prdFeePK;
        this.prdDesc = prdDesc;
        this.prdFee = prdFee;
    }

    public PrdFee(String prdGrpId, String prdFeeTyp) {
        this.prdFeePK = new PrdFeePK(prdGrpId, prdFeeTyp);
    }

    public PrdFeePK getPrdFeePK() {
        return prdFeePK;
    }

    public void setPrdFeePK(PrdFeePK prdFeePK) {
        this.prdFeePK = prdFeePK;
    }

    public String getPrdDesc() {
        return prdDesc;
    }

    public void setPrdDesc(String prdDesc) {
        this.prdDesc = prdDesc;
    }

    public BigDecimal getPrdFee() {
        return prdFee;
    }

    public void setPrdFee(BigDecimal prdFee) {
        this.prdFee = prdFee;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (prdFeePK != null ? prdFeePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PrdFee)) {
            return false;
        }
        PrdFee other = (PrdFee) object;
        if ((this.prdFeePK == null && other.prdFeePK != null) || (this.prdFeePK != null && !this.prdFeePK.equals(other.prdFeePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.PrdFee[ prdFeePK=" + prdFeePK + " ]";
    }
    
}
