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
public class CrdOrdDtlPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "CUST_ID")
    private String custId;
    @Basic(optional = false)
    @Column(name = "CRD_TYP_CD")
    private String crdTypCd;
    @Basic(optional = false)
    @Column(name = "CRD_STYLE_CD")
    private String crdStyleCd;
    @Basic(optional = false)
    @Column(name = "CRD_REQ_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date crdReqTs;
    @Basic(optional = false)
    @Column(name = "CRD_NBR")
    private String crdNbr;

    public CrdOrdDtlPK() {
    }

    public CrdOrdDtlPK(String custId, String crdTypCd, String crdStyleCd, Date crdReqTs, String crdNbr) {
        this.custId = custId;
        this.crdTypCd = crdTypCd;
        this.crdStyleCd = crdStyleCd;
        this.crdReqTs = crdReqTs;
        this.crdNbr = crdNbr;
    }

    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId;
    }

    public String getCrdTypCd() {
        return crdTypCd;
    }

    public void setCrdTypCd(String crdTypCd) {
        this.crdTypCd = crdTypCd;
    }

    public String getCrdStyleCd() {
        return crdStyleCd;
    }

    public void setCrdStyleCd(String crdStyleCd) {
        this.crdStyleCd = crdStyleCd;
    }

    public Date getCrdReqTs() {
        return crdReqTs;
    }

    public void setCrdReqTs(Date crdReqTs) {
        this.crdReqTs = crdReqTs;
    }

    public String getCrdNbr() {
        return crdNbr;
    }

    public void setCrdNbr(String crdNbr) {
        this.crdNbr = crdNbr;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (custId != null ? custId.hashCode() : 0);
        hash += (crdTypCd != null ? crdTypCd.hashCode() : 0);
        hash += (crdStyleCd != null ? crdStyleCd.hashCode() : 0);
        hash += (crdReqTs != null ? crdReqTs.hashCode() : 0);
        hash += (crdNbr != null ? crdNbr.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CrdOrdDtlPK)) {
            return false;
        }
        CrdOrdDtlPK other = (CrdOrdDtlPK) object;
        if ((this.custId == null && other.custId != null) || (this.custId != null && !this.custId.equals(other.custId))) {
            return false;
        }
        if ((this.crdTypCd == null && other.crdTypCd != null) || (this.crdTypCd != null && !this.crdTypCd.equals(other.crdTypCd))) {
            return false;
        }
        if ((this.crdStyleCd == null && other.crdStyleCd != null) || (this.crdStyleCd != null && !this.crdStyleCd.equals(other.crdStyleCd))) {
            return false;
        }
        if ((this.crdReqTs == null && other.crdReqTs != null) || (this.crdReqTs != null && !this.crdReqTs.equals(other.crdReqTs))) {
            return false;
        }
        if ((this.crdNbr == null && other.crdNbr != null) || (this.crdNbr != null && !this.crdNbr.equals(other.crdNbr))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.CrdOrdDtlPK[ custId=" + custId + ", crdTypCd=" + crdTypCd + ", crdStyleCd=" + crdStyleCd + ", crdReqTs=" + crdReqTs + ", crdNbr=" + crdNbr + " ]";
    }
    
}
