/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;

/**
 *
 * @author Sukant.Tiwari
 */
@Embeddable
public class StateTblPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "ST_CD")
    private String stCd;
    @Basic(optional = false)
    @Column(name = "ST_X_CRTY_CD_3")
    private String stXCrtyCd3;

    public StateTblPK() {
    }

    public StateTblPK(String stCd, String stXCrtyCd3) {
        this.stCd = stCd;
        this.stXCrtyCd3 = stXCrtyCd3;
    }

    public String getStCd() {
        return stCd;
    }

    public void setStCd(String stCd) {
        this.stCd = stCd;
    }

    public String getStXCrtyCd3() {
        return stXCrtyCd3;
    }

    public void setStXCrtyCd3(String stXCrtyCd3) {
        this.stXCrtyCd3 = stXCrtyCd3;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (stCd != null ? stCd.hashCode() : 0);
        hash += (stXCrtyCd3 != null ? stXCrtyCd3.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof StateTblPK)) {
            return false;
        }
        StateTblPK other = (StateTblPK) object;
        if ((this.stCd == null && other.stCd != null) || (this.stCd != null && !this.stCd.equals(other.stCd))) {
            return false;
        }
        if ((this.stXCrtyCd3 == null && other.stXCrtyCd3 != null) || (this.stXCrtyCd3 != null && !this.stXCrtyCd3.equals(other.stXCrtyCd3))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.StateTblPK[ stCd=" + stCd + ", stXCrtyCd3=" + stXCrtyCd3 + " ]";
    }
    
}
