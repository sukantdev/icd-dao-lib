package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

@Embeddable
public class GlCdAsmtPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "ACCT_NBR")
    private String acctNbr;
    @Basic(optional = false)
    @Column(name = "ASMT_TYP")
    private String asmtTyp;
    @Basic(optional = false)
    @Column(name = "PRF_ID")
    @Temporal(TemporalType.TIMESTAMP)
    private Date prfId;
    @Basic(optional = false)
    @Column(name = "ASMT_VAL")
    private String asmtVal;
    @Basic(optional = false)
    @Column(name = "GL_CD")
    private String glCd;

    public GlCdAsmtPK() {
    }

    public GlCdAsmtPK(String acctNbr, String asmtTyp, Date prfId, String asmtVal, String glCd) {
        this.acctNbr = acctNbr;
        this.asmtTyp = asmtTyp;
        this.prfId = prfId;
        this.asmtVal = asmtVal;
        this.glCd = glCd;
    }

    public String getAcctNbr() {
        return acctNbr;
    }

    public void setAcctNbr(String acctNbr) {
        this.acctNbr = acctNbr;
    }

    public String getAsmtTyp() {
        return asmtTyp;
    }

    public void setAsmtTyp(String asmtTyp) {
        this.asmtTyp = asmtTyp;
    }

    public Date getPrfId() {
        return prfId;
    }

    public void setPrfId(Date prfId) {
        this.prfId = prfId;
    }

    public String getAsmtVal() {
        return asmtVal;
    }

    public void setAsmtVal(String asmtVal) {
        this.asmtVal = asmtVal;
    }

    public String getGlCd() {
        return glCd;
    }

    public void setGlCd(String glCd) {
        this.glCd = glCd;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (acctNbr != null ? acctNbr.hashCode() : 0);
        hash += (asmtTyp != null ? asmtTyp.hashCode() : 0);
        hash += (prfId != null ? prfId.hashCode() : 0);
        hash += (asmtVal != null ? asmtVal.hashCode() : 0);
        hash += (glCd != null ? glCd.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof GlCdAsmtPK)) {
            return false;
        }
        GlCdAsmtPK other = (GlCdAsmtPK) object;
        if ((this.acctNbr == null && other.acctNbr != null) || (this.acctNbr != null && !this.acctNbr.equals(other.acctNbr))) {
            return false;
        }
        if ((this.asmtTyp == null && other.asmtTyp != null) || (this.asmtTyp != null && !this.asmtTyp.equals(other.asmtTyp))) {
            return false;
        }
        if ((this.prfId == null && other.prfId != null) || (this.prfId != null && !this.prfId.equals(other.prfId))) {
            return false;
        }
        if ((this.asmtVal == null && other.asmtVal != null) || (this.asmtVal != null && !this.asmtVal.equals(other.asmtVal))) {
            return false;
        }
        if ((this.glCd == null && other.glCd != null) || (this.glCd != null && !this.glCd.equals(other.glCd))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.GlCdAsmtPK[ acctNbr=" + acctNbr + ", asmtTyp=" + asmtTyp + ", prfId=" + prfId + ", asmtVal=" + asmtVal + ", glCd=" + glCd + " ]";
    }

}
