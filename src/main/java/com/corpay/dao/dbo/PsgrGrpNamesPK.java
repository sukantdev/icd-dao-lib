package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class PsgrGrpNamesPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "ACCT_NBR")
    private String acctNbr;
    @Basic(optional = false)
    @Column(name = "PSGR_NM")
    private String psgrNm;

    public PsgrGrpNamesPK() {
    }

    public PsgrGrpNamesPK(String acctNbr, String psgrNm) {
        this.acctNbr = acctNbr;
        this.psgrNm = psgrNm;
    }

    public String getAcctNbr() {
        return acctNbr;
    }

    public void setAcctNbr(String acctNbr) {
        this.acctNbr = acctNbr;
    }

    public String getPsgrNm() {
        return psgrNm;
    }

    public void setPsgrNm(String psgrNm) {
        this.psgrNm = psgrNm;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (acctNbr != null ? acctNbr.hashCode() : 0);
        hash += (psgrNm != null ? psgrNm.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof PsgrGrpNamesPK)) {
            return false;
        }
        PsgrGrpNamesPK other = (PsgrGrpNamesPK) object;
        if ((this.acctNbr == null && other.acctNbr != null) || (this.acctNbr != null && !this.acctNbr.equals(other.acctNbr))) {
            return false;
        }
        if ((this.psgrNm == null && other.psgrNm != null) || (this.psgrNm != null && !this.psgrNm.equals(other.psgrNm))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.PsgrGrpNamesPK[ acctNbr=" + acctNbr + ", psgrNm=" + psgrNm + " ]";
    }

}
