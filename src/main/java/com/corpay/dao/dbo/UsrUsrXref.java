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
@Table(name = "USR_USR_XREF", catalog = "", schema = "DBO")
public class UsrUsrXref implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected UsrUsrXrefPK usrUsrXrefPK;
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

    public UsrUsrXref() {
    }

    public UsrUsrXref(UsrUsrXrefPK usrUsrXrefPK) {
        this.usrUsrXrefPK = usrUsrXrefPK;
    }

    public UsrUsrXref(UsrUsrXrefPK usrUsrXrefPK, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.usrUsrXrefPK = usrUsrXrefPK;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public UsrUsrXref(String usrId, String othrUsrId) {
        this.usrUsrXrefPK = new UsrUsrXrefPK(usrId, othrUsrId);
    }

    public UsrUsrXrefPK getUsrUsrXrefPK() {
        return usrUsrXrefPK;
    }

    public void setUsrUsrXrefPK(UsrUsrXrefPK usrUsrXrefPK) {
        this.usrUsrXrefPK = usrUsrXrefPK;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (usrUsrXrefPK != null ? usrUsrXrefPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof UsrUsrXref)) {
            return false;
        }
        UsrUsrXref other = (UsrUsrXref) object;
        if ((this.usrUsrXrefPK == null && other.usrUsrXrefPK != null) || (this.usrUsrXrefPK != null && !this.usrUsrXrefPK.equals(other.usrUsrXrefPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.UsrUsrXref[ usrUsrXrefPK=" + usrUsrXrefPK + " ]";
    }

}
