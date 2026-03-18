package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class ShprCarrXrefPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "TYP_CD")
    private Character typCd;
    @Basic(optional = false)
    @Column(name = "SRV_PRVDR_ACCT_ABBREV")
    private String srvPrvdrAcctAbbrev;
    @Basic(optional = false)
    @Column(name = "SVR_ACCT_NBR")
    private String svrAcctNbr;

    public ShprCarrXrefPK() {
    }

    public ShprCarrXrefPK(Character typCd, String srvPrvdrAcctAbbrev, String svrAcctNbr) {
        this.typCd = typCd;
        this.srvPrvdrAcctAbbrev = srvPrvdrAcctAbbrev;
        this.svrAcctNbr = svrAcctNbr;
    }

    public Character getTypCd() {
        return typCd;
    }

    public void setTypCd(Character typCd) {
        this.typCd = typCd;
    }

    public String getSrvPrvdrAcctAbbrev() {
        return srvPrvdrAcctAbbrev;
    }

    public void setSrvPrvdrAcctAbbrev(String srvPrvdrAcctAbbrev) {
        this.srvPrvdrAcctAbbrev = srvPrvdrAcctAbbrev;
    }

    public String getSvrAcctNbr() {
        return svrAcctNbr;
    }

    public void setSvrAcctNbr(String svrAcctNbr) {
        this.svrAcctNbr = svrAcctNbr;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (typCd != null ? typCd.hashCode() : 0);
        hash += (srvPrvdrAcctAbbrev != null ? srvPrvdrAcctAbbrev.hashCode() : 0);
        hash += (svrAcctNbr != null ? svrAcctNbr.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof ShprCarrXrefPK)) {
            return false;
        }
        ShprCarrXrefPK other = (ShprCarrXrefPK) object;
        if ((this.typCd == null && other.typCd != null) || (this.typCd != null && !this.typCd.equals(other.typCd))) {
            return false;
        }
        if ((this.srvPrvdrAcctAbbrev == null && other.srvPrvdrAcctAbbrev != null) || (this.srvPrvdrAcctAbbrev != null && !this.srvPrvdrAcctAbbrev.equals(other.srvPrvdrAcctAbbrev))) {
            return false;
        }
        if ((this.svrAcctNbr == null && other.svrAcctNbr != null) || (this.svrAcctNbr != null && !this.svrAcctNbr.equals(other.svrAcctNbr))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.ShprCarrXrefPK[ typCd=" + typCd + ", srvPrvdrAcctAbbrev=" + srvPrvdrAcctAbbrev + ", svrAcctNbr=" + svrAcctNbr + " ]";
    }

}
