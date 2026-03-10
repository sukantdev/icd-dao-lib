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
public class GenCvcPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "CRD_BIN")
    private int crdBin;
    @Basic(optional = false)
    @Column(name = "CRD_STA")
    private long crdSta;

    public GenCvcPK() {
    }

    public GenCvcPK(int crdBin, long crdSta) {
        this.crdBin = crdBin;
        this.crdSta = crdSta;
    }

    public int getCrdBin() {
        return crdBin;
    }

    public void setCrdBin(int crdBin) {
        this.crdBin = crdBin;
    }

    public long getCrdSta() {
        return crdSta;
    }

    public void setCrdSta(long crdSta) {
        this.crdSta = crdSta;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) crdBin;
        hash += (int) crdSta;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GenCvcPK)) {
            return false;
        }
        GenCvcPK other = (GenCvcPK) object;
        if (this.crdBin != other.crdBin) {
            return false;
        }
        if (this.crdSta != other.crdSta) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.GenCvcPK[ crdBin=" + crdBin + ", crdSta=" + crdSta + " ]";
    }
    
}
