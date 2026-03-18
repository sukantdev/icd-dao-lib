package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class CrdWalletEmailsPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "CRD_TKN_NBR")
    private String crdTknNbr;
    @Basic(optional = false)
    @Column(name = "EMAIL_ADDR")
    private String emailAddr;

    public CrdWalletEmailsPK() {
    }

    public CrdWalletEmailsPK(String crdTknNbr, String emailAddr) {
        this.crdTknNbr = crdTknNbr;
        this.emailAddr = emailAddr;
    }

    public String getCrdTknNbr() {
        return crdTknNbr;
    }

    public void setCrdTknNbr(String crdTknNbr) {
        this.crdTknNbr = crdTknNbr;
    }

    public String getEmailAddr() {
        return emailAddr;
    }

    public void setEmailAddr(String emailAddr) {
        this.emailAddr = emailAddr;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (crdTknNbr != null ? crdTknNbr.hashCode() : 0);
        hash += (emailAddr != null ? emailAddr.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof CrdWalletEmailsPK)) {
            return false;
        }
        CrdWalletEmailsPK other = (CrdWalletEmailsPK) object;
        if ((this.crdTknNbr == null && other.crdTknNbr != null) || (this.crdTknNbr != null && !this.crdTknNbr.equals(other.crdTknNbr))) {
            return false;
        }
        if ((this.emailAddr == null && other.emailAddr != null) || (this.emailAddr != null && !this.emailAddr.equals(other.emailAddr))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.CrdWalletEmailsPK[ crdTknNbr=" + crdTknNbr + ", emailAddr=" + emailAddr + " ]";
    }

}
