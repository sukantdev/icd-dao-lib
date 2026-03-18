package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

@Embeddable
public class PrpPreAuthPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "CRD_NBR")
    private String crdNbr;
    @Basic(optional = false)
    @Column(name = "MRCH_NBR")
    private String mrchNbr;
    @Basic(optional = false)
    @Column(name = "PRE_AUTH_DT")
    @Temporal(TemporalType.DATE)
    private Date preAuthDt;
    @Basic(optional = false)
    @Column(name = "PRE_AUTH_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date preAuthTs;
    @Basic(optional = false)
    @Column(name = "POST_FLG")
    private Character postFlg;

    public PrpPreAuthPK() {
    }

    public PrpPreAuthPK(String crdNbr, String mrchNbr, Date preAuthDt, Date preAuthTs, Character postFlg) {
        this.crdNbr = crdNbr;
        this.mrchNbr = mrchNbr;
        this.preAuthDt = preAuthDt;
        this.preAuthTs = preAuthTs;
        this.postFlg = postFlg;
    }

    public String getCrdNbr() {
        return crdNbr;
    }

    public void setCrdNbr(String crdNbr) {
        this.crdNbr = crdNbr;
    }

    public String getMrchNbr() {
        return mrchNbr;
    }

    public void setMrchNbr(String mrchNbr) {
        this.mrchNbr = mrchNbr;
    }

    public Date getPreAuthDt() {
        return preAuthDt;
    }

    public void setPreAuthDt(Date preAuthDt) {
        this.preAuthDt = preAuthDt;
    }

    public Date getPreAuthTs() {
        return preAuthTs;
    }

    public void setPreAuthTs(Date preAuthTs) {
        this.preAuthTs = preAuthTs;
    }

    public Character getPostFlg() {
        return postFlg;
    }

    public void setPostFlg(Character postFlg) {
        this.postFlg = postFlg;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (crdNbr != null ? crdNbr.hashCode() : 0);
        hash += (mrchNbr != null ? mrchNbr.hashCode() : 0);
        hash += (preAuthDt != null ? preAuthDt.hashCode() : 0);
        hash += (preAuthTs != null ? preAuthTs.hashCode() : 0);
        hash += (postFlg != null ? postFlg.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof PrpPreAuthPK)) {
            return false;
        }
        PrpPreAuthPK other = (PrpPreAuthPK) object;
        if ((this.crdNbr == null && other.crdNbr != null) || (this.crdNbr != null && !this.crdNbr.equals(other.crdNbr))) {
            return false;
        }
        if ((this.mrchNbr == null && other.mrchNbr != null) || (this.mrchNbr != null && !this.mrchNbr.equals(other.mrchNbr))) {
            return false;
        }
        if ((this.preAuthDt == null && other.preAuthDt != null) || (this.preAuthDt != null && !this.preAuthDt.equals(other.preAuthDt))) {
            return false;
        }
        if ((this.preAuthTs == null && other.preAuthTs != null) || (this.preAuthTs != null && !this.preAuthTs.equals(other.preAuthTs))) {
            return false;
        }
        if ((this.postFlg == null && other.postFlg != null) || (this.postFlg != null && !this.postFlg.equals(other.postFlg))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.PrpPreAuthPK[ crdNbr=" + crdNbr + ", mrchNbr=" + mrchNbr + ", preAuthDt=" + preAuthDt + ", preAuthTs=" + preAuthTs + ", postFlg=" + postFlg + " ]";
    }

}
