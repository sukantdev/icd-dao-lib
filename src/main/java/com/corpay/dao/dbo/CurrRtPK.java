/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Sukant.Tiwari
 */
@Embeddable
public class CurrRtPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "CURR_RT_EFF_DT")
    @Temporal(TemporalType.DATE)
    private Date currRtEffDt;
    @Basic(optional = false)
    @Column(name = "CURR_RT_BASE_ALPH")
    private String currRtBaseAlph;
    @Basic(optional = false)
    @Column(name = "CURR_RT_CNV_TO_ALPH")
    private String currRtCnvToAlph;

    public CurrRtPK() {
    }

    public CurrRtPK(Date currRtEffDt, String currRtBaseAlph, String currRtCnvToAlph) {
        this.currRtEffDt = currRtEffDt;
        this.currRtBaseAlph = currRtBaseAlph;
        this.currRtCnvToAlph = currRtCnvToAlph;
    }

    public Date getCurrRtEffDt() {
        return currRtEffDt;
    }

    public void setCurrRtEffDt(Date currRtEffDt) {
        this.currRtEffDt = currRtEffDt;
    }

    public String getCurrRtBaseAlph() {
        return currRtBaseAlph;
    }

    public void setCurrRtBaseAlph(String currRtBaseAlph) {
        this.currRtBaseAlph = currRtBaseAlph;
    }

    public String getCurrRtCnvToAlph() {
        return currRtCnvToAlph;
    }

    public void setCurrRtCnvToAlph(String currRtCnvToAlph) {
        this.currRtCnvToAlph = currRtCnvToAlph;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (currRtEffDt != null ? currRtEffDt.hashCode() : 0);
        hash += (currRtBaseAlph != null ? currRtBaseAlph.hashCode() : 0);
        hash += (currRtCnvToAlph != null ? currRtCnvToAlph.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CurrRtPK)) {
            return false;
        }
        CurrRtPK other = (CurrRtPK) object;
        if ((this.currRtEffDt == null && other.currRtEffDt != null) || (this.currRtEffDt != null && !this.currRtEffDt.equals(other.currRtEffDt))) {
            return false;
        }
        if ((this.currRtBaseAlph == null && other.currRtBaseAlph != null) || (this.currRtBaseAlph != null && !this.currRtBaseAlph.equals(other.currRtBaseAlph))) {
            return false;
        }
        if ((this.currRtCnvToAlph == null && other.currRtCnvToAlph != null) || (this.currRtCnvToAlph != null && !this.currRtCnvToAlph.equals(other.currRtCnvToAlph))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.CurrRtPK[ currRtEffDt=" + currRtEffDt + ", currRtBaseAlph=" + currRtBaseAlph + ", currRtCnvToAlph=" + currRtCnvToAlph + " ]";
    }
    
}
