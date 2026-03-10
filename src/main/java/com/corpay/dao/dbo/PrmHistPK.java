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
public class PrmHistPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "CUST_ID")
    private String custId;
    @Basic(optional = false)
    @Column(name = "CRD_NBR")
    private String crdNbr;
    @Basic(optional = false)
    @Column(name = "PRM_HIST_DT")
    @Temporal(TemporalType.DATE)
    private Date prmHistDt;
    @Basic(optional = false)
    @Column(name = "PRM_HIST_TM")
    @Temporal(TemporalType.TIME)
    private Date prmHistTm;
    @Basic(optional = false)
    @Column(name = "REF_NBR")
    private int refNbr;
    @Basic(optional = false)
    @Column(name = "RCD_ID")
    private Character rcdId;

    public PrmHistPK() {
    }

    public PrmHistPK(String custId, String crdNbr, Date prmHistDt, Date prmHistTm, int refNbr, Character rcdId) {
        this.custId = custId;
        this.crdNbr = crdNbr;
        this.prmHistDt = prmHistDt;
        this.prmHistTm = prmHistTm;
        this.refNbr = refNbr;
        this.rcdId = rcdId;
    }

    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId;
    }

    public String getCrdNbr() {
        return crdNbr;
    }

    public void setCrdNbr(String crdNbr) {
        this.crdNbr = crdNbr;
    }

    public Date getPrmHistDt() {
        return prmHistDt;
    }

    public void setPrmHistDt(Date prmHistDt) {
        this.prmHistDt = prmHistDt;
    }

    public Date getPrmHistTm() {
        return prmHistTm;
    }

    public void setPrmHistTm(Date prmHistTm) {
        this.prmHistTm = prmHistTm;
    }

    public int getRefNbr() {
        return refNbr;
    }

    public void setRefNbr(int refNbr) {
        this.refNbr = refNbr;
    }

    public Character getRcdId() {
        return rcdId;
    }

    public void setRcdId(Character rcdId) {
        this.rcdId = rcdId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (custId != null ? custId.hashCode() : 0);
        hash += (crdNbr != null ? crdNbr.hashCode() : 0);
        hash += (prmHistDt != null ? prmHistDt.hashCode() : 0);
        hash += (prmHistTm != null ? prmHistTm.hashCode() : 0);
        hash += (int) refNbr;
        hash += (rcdId != null ? rcdId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PrmHistPK)) {
            return false;
        }
        PrmHistPK other = (PrmHistPK) object;
        if ((this.custId == null && other.custId != null) || (this.custId != null && !this.custId.equals(other.custId))) {
            return false;
        }
        if ((this.crdNbr == null && other.crdNbr != null) || (this.crdNbr != null && !this.crdNbr.equals(other.crdNbr))) {
            return false;
        }
        if ((this.prmHistDt == null && other.prmHistDt != null) || (this.prmHistDt != null && !this.prmHistDt.equals(other.prmHistDt))) {
            return false;
        }
        if ((this.prmHistTm == null && other.prmHistTm != null) || (this.prmHistTm != null && !this.prmHistTm.equals(other.prmHistTm))) {
            return false;
        }
        if (this.refNbr != other.refNbr) {
            return false;
        }
        if ((this.rcdId == null && other.rcdId != null) || (this.rcdId != null && !this.rcdId.equals(other.rcdId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.PrmHistPK[ custId=" + custId + ", crdNbr=" + crdNbr + ", prmHistDt=" + prmHistDt + ", prmHistTm=" + prmHistTm + ", refNbr=" + refNbr + ", rcdId=" + rcdId + " ]";
    }
    
}
