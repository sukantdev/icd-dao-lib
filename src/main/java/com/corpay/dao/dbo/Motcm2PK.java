package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class Motcm2PK implements Serializable {

    @Basic(optional = false)
    @Column(name = "ACCOUNT_CODE")
    private String accountCode;
    @Basic(optional = false)
    @Column(name = "SYSTEM")
    private String system;
    @Basic(optional = false)
    @Column(name = "RPTNO")
    private String rptno;

    public Motcm2PK() {
    }

    public Motcm2PK(String accountCode, String system, String rptno) {
        this.accountCode = accountCode;
        this.system = system;
        this.rptno = rptno;
    }

    public String getAccountCode() {
        return accountCode;
    }

    public void setAccountCode(String accountCode) {
        this.accountCode = accountCode;
    }

    public String getSystem() {
        return system;
    }

    public void setSystem(String system) {
        this.system = system;
    }

    public String getRptno() {
        return rptno;
    }

    public void setRptno(String rptno) {
        this.rptno = rptno;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (accountCode != null ? accountCode.hashCode() : 0);
        hash += (system != null ? system.hashCode() : 0);
        hash += (rptno != null ? rptno.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof Motcm2PK)) {
            return false;
        }
        Motcm2PK other = (Motcm2PK) object;
        if ((this.accountCode == null && other.accountCode != null) || (this.accountCode != null && !this.accountCode.equals(other.accountCode))) {
            return false;
        }
        if ((this.system == null && other.system != null) || (this.system != null && !this.system.equals(other.system))) {
            return false;
        }
        if ((this.rptno == null && other.rptno != null) || (this.rptno != null && !this.rptno.equals(other.rptno))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.Motcm2PK[ accountCode=" + accountCode + ", system=" + system + ", rptno=" + rptno + " ]";
    }

}
