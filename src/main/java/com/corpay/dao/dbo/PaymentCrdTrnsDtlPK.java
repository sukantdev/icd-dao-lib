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
public class PaymentCrdTrnsDtlPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "TRNS_ID")
    private String trnsId;
    @Basic(optional = false)
    @Column(name = "TRNS_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date trnsTs;

    public PaymentCrdTrnsDtlPK() {
    }

    public PaymentCrdTrnsDtlPK(String trnsId, Date trnsTs) {
        this.trnsId = trnsId;
        this.trnsTs = trnsTs;
    }

    public String getTrnsId() {
        return trnsId;
    }

    public void setTrnsId(String trnsId) {
        this.trnsId = trnsId;
    }

    public Date getTrnsTs() {
        return trnsTs;
    }

    public void setTrnsTs(Date trnsTs) {
        this.trnsTs = trnsTs;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (trnsId != null ? trnsId.hashCode() : 0);
        hash += (trnsTs != null ? trnsTs.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PaymentCrdTrnsDtlPK)) {
            return false;
        }
        PaymentCrdTrnsDtlPK other = (PaymentCrdTrnsDtlPK) object;
        if ((this.trnsId == null && other.trnsId != null) || (this.trnsId != null && !this.trnsId.equals(other.trnsId))) {
            return false;
        }
        if ((this.trnsTs == null && other.trnsTs != null) || (this.trnsTs != null && !this.trnsTs.equals(other.trnsTs))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.PaymentCrdTrnsDtlPK[ trnsId=" + trnsId + ", trnsTs=" + trnsTs + " ]";
    }
    
}
