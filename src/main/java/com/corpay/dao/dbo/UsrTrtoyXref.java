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
@Table(name = "USR_TRTOY_XREF", catalog = "", schema = "DBO")
public class UsrTrtoyXref implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected UsrTrtoyXrefPK usrTrtoyXrefPK;
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

    public UsrTrtoyXref() {
    }

    public UsrTrtoyXref(UsrTrtoyXrefPK usrTrtoyXrefPK) {
        this.usrTrtoyXrefPK = usrTrtoyXrefPK;
    }

    public UsrTrtoyXref(UsrTrtoyXrefPK usrTrtoyXrefPK, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.usrTrtoyXrefPK = usrTrtoyXrefPK;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public UsrTrtoyXref(String usrId, String trtoyCd) {
        this.usrTrtoyXrefPK = new UsrTrtoyXrefPK(usrId, trtoyCd);
    }

    public UsrTrtoyXrefPK getUsrTrtoyXrefPK() {
        return usrTrtoyXrefPK;
    }

    public void setUsrTrtoyXrefPK(UsrTrtoyXrefPK usrTrtoyXrefPK) {
        this.usrTrtoyXrefPK = usrTrtoyXrefPK;
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
        hash += (usrTrtoyXrefPK != null ? usrTrtoyXrefPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof UsrTrtoyXref)) {
            return false;
        }
        UsrTrtoyXref other = (UsrTrtoyXref) object;
        if ((this.usrTrtoyXrefPK == null && other.usrTrtoyXrefPK != null) || (this.usrTrtoyXrefPK != null && !this.usrTrtoyXrefPK.equals(other.usrTrtoyXrefPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.UsrTrtoyXref[ usrTrtoyXrefPK=" + usrTrtoyXrefPK + " ]";
    }

}
