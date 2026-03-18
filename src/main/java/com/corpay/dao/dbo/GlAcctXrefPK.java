package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class GlAcctXrefPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "ACCT_NBR")
    private String acctNbr;
    @Basic(optional = false)
    @Column(name = "GL_CD")
    private String glCd;

    public GlAcctXrefPK() {
    }

    public GlAcctXrefPK(String acctNbr, String glCd) {
        this.acctNbr = acctNbr;
        this.glCd = glCd;
    }

    public String getAcctNbr() {
        return acctNbr;
    }

    public void setAcctNbr(String acctNbr) {
        this.acctNbr = acctNbr;
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
        hash += (glCd != null ? glCd.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof GlAcctXrefPK)) {
            return false;
        }
        GlAcctXrefPK other = (GlAcctXrefPK) object;
        if ((this.acctNbr == null && other.acctNbr != null) || (this.acctNbr != null && !this.acctNbr.equals(other.acctNbr))) {
            return false;
        }
        if ((this.glCd == null && other.glCd != null) || (this.glCd != null && !this.glCd.equals(other.glCd))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.GlAcctXrefPK[ acctNbr=" + acctNbr + ", glCd=" + glCd + " ]";
    }

}
