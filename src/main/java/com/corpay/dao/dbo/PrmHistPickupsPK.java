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
public class PrmHistPickupsPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "PERM_HIST_CRT_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date permHistCrtTs;
    @Basic(optional = false)
    @Column(name = "REF_NBR")
    private int refNbr;

    public PrmHistPickupsPK() {
    }

    public PrmHistPickupsPK(Date permHistCrtTs, int refNbr) {
        this.permHistCrtTs = permHistCrtTs;
        this.refNbr = refNbr;
    }

    public Date getPermHistCrtTs() {
        return permHistCrtTs;
    }

    public void setPermHistCrtTs(Date permHistCrtTs) {
        this.permHistCrtTs = permHistCrtTs;
    }

    public int getRefNbr() {
        return refNbr;
    }

    public void setRefNbr(int refNbr) {
        this.refNbr = refNbr;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (permHistCrtTs != null ? permHistCrtTs.hashCode() : 0);
        hash += (int) refNbr;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PrmHistPickupsPK)) {
            return false;
        }
        PrmHistPickupsPK other = (PrmHistPickupsPK) object;
        if ((this.permHistCrtTs == null && other.permHistCrtTs != null) || (this.permHistCrtTs != null && !this.permHistCrtTs.equals(other.permHistCrtTs))) {
            return false;
        }
        if (this.refNbr != other.refNbr) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.PrmHistPickupsPK[ permHistCrtTs=" + permHistCrtTs + ", refNbr=" + refNbr + " ]";
    }
    
}
