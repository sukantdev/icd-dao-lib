package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "USR_ACCT_XREF", catalog = "", schema = "DBO")
public class UsrAcctXref implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected UsrAcctXrefPK usrAcctXrefPK;
    @Basic(optional = false)
    @Column(name = "CRT_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date crtTs;
    @Basic(optional = false)
    @Column(name = "CRT_USR")
    private String crtUsr;
    @Basic(optional = false)
    @Column(name = "MDY_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date mdyTs;
    @Basic(optional = false)
    @Column(name = "MDY_USR")
    private String mdyUsr;
    @Basic(optional = false)
    @Column(name = "PRIMARY_ADMIN_FLG")
    private Character primaryAdminFlg;

    public UsrAcctXref() {
    }

    public UsrAcctXref(UsrAcctXrefPK usrAcctXrefPK) {
        this.usrAcctXrefPK = usrAcctXrefPK;
    }

    public UsrAcctXref(UsrAcctXrefPK usrAcctXrefPK, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr, Character primaryAdminFlg) {
        this.usrAcctXrefPK = usrAcctXrefPK;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
        this.primaryAdminFlg = primaryAdminFlg;
    }

    public UsrAcctXref(String usrId, String acctNbr) {
        this.usrAcctXrefPK = new UsrAcctXrefPK(usrId, acctNbr);
    }

    public UsrAcctXrefPK getUsrAcctXrefPK() {
        return usrAcctXrefPK;
    }

    public void setUsrAcctXrefPK(UsrAcctXrefPK usrAcctXrefPK) {
        this.usrAcctXrefPK = usrAcctXrefPK;
    }

    public Date getCrtTs() {
        return crtTs;
    }

    public void setCrtTs(Date crtTs) {
        this.crtTs = crtTs;
    }

    public String getCrtUsr() {
        return crtUsr;
    }

    public void setCrtUsr(String crtUsr) {
        this.crtUsr = crtUsr;
    }

    public Date getMdyTs() {
        return mdyTs;
    }

    public void setMdyTs(Date mdyTs) {
        this.mdyTs = mdyTs;
    }

    public String getMdyUsr() {
        return mdyUsr;
    }

    public void setMdyUsr(String mdyUsr) {
        this.mdyUsr = mdyUsr;
    }

    public Character getPrimaryAdminFlg() {
        return primaryAdminFlg;
    }

    public void setPrimaryAdminFlg(Character primaryAdminFlg) {
        this.primaryAdminFlg = primaryAdminFlg;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (usrAcctXrefPK != null ? usrAcctXrefPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof UsrAcctXref)) {
            return false;
        }
        UsrAcctXref other = (UsrAcctXref) object;
        if ((this.usrAcctXrefPK == null && other.usrAcctXrefPK != null) || (this.usrAcctXrefPK != null && !this.usrAcctXrefPK.equals(other.usrAcctXrefPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.UsrAcctXref[ usrAcctXrefPK=" + usrAcctXrefPK + " ]";
    }

}
