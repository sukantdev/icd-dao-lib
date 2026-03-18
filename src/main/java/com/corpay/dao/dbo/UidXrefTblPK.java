package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class UidXrefTblPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "UID")
    private String uid;
    @Basic(optional = false)
    @Column(name = "ACCT")
    private String acct;
    @Basic(optional = false)
    @Column(name = "CUST")
    private String cust;
    @Basic(optional = false)
    @Column(name = "SYS")
    private String sys;
    @Basic(optional = false)
    @Column(name = "RPT")
    private int rpt;

    public UidXrefTblPK() {
    }

    public UidXrefTblPK(String uid, String acct, String cust, String sys, int rpt) {
        this.uid = uid;
        this.acct = acct;
        this.cust = cust;
        this.sys = sys;
        this.rpt = rpt;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getAcct() {
        return acct;
    }

    public void setAcct(String acct) {
        this.acct = acct;
    }

    public String getCust() {
        return cust;
    }

    public void setCust(String cust) {
        this.cust = cust;
    }

    public String getSys() {
        return sys;
    }

    public void setSys(String sys) {
        this.sys = sys;
    }

    public int getRpt() {
        return rpt;
    }

    public void setRpt(int rpt) {
        this.rpt = rpt;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (uid != null ? uid.hashCode() : 0);
        hash += (acct != null ? acct.hashCode() : 0);
        hash += (cust != null ? cust.hashCode() : 0);
        hash += (sys != null ? sys.hashCode() : 0);
        hash += (int) rpt;
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof UidXrefTblPK)) {
            return false;
        }
        UidXrefTblPK other = (UidXrefTblPK) object;
        if ((this.uid == null && other.uid != null) || (this.uid != null && !this.uid.equals(other.uid))) {
            return false;
        }
        if ((this.acct == null && other.acct != null) || (this.acct != null && !this.acct.equals(other.acct))) {
            return false;
        }
        if ((this.cust == null && other.cust != null) || (this.cust != null && !this.cust.equals(other.cust))) {
            return false;
        }
        if ((this.sys == null && other.sys != null) || (this.sys != null && !this.sys.equals(other.sys))) {
            return false;
        }
        if (this.rpt != other.rpt) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.UidXrefTblPK[ uid=" + uid + ", acct=" + acct + ", cust=" + cust + ", sys=" + sys + ", rpt=" + rpt + " ]";
    }

}
