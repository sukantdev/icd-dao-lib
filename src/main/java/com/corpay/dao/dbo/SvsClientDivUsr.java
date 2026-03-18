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
@Table(name = "SVS_CLIENT_DIV_USR", catalog = "", schema = "DBO")
public class SvsClientDivUsr implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected SvsClientDivUsrPK svsClientDivUsrPK;
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

    public SvsClientDivUsr() {
    }

    public SvsClientDivUsr(SvsClientDivUsrPK svsClientDivUsrPK) {
        this.svsClientDivUsrPK = svsClientDivUsrPK;
    }

    public SvsClientDivUsr(SvsClientDivUsrPK svsClientDivUsrPK, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.svsClientDivUsrPK = svsClientDivUsrPK;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public SvsClientDivUsr(String clientId, String div, String usrId) {
        this.svsClientDivUsrPK = new SvsClientDivUsrPK(clientId, div, usrId);
    }

    public SvsClientDivUsrPK getSvsClientDivUsrPK() {
        return svsClientDivUsrPK;
    }

    public void setSvsClientDivUsrPK(SvsClientDivUsrPK svsClientDivUsrPK) {
        this.svsClientDivUsrPK = svsClientDivUsrPK;
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
        hash += (svsClientDivUsrPK != null ? svsClientDivUsrPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof SvsClientDivUsr)) {
            return false;
        }
        SvsClientDivUsr other = (SvsClientDivUsr) object;
        if ((this.svsClientDivUsrPK == null && other.svsClientDivUsrPK != null) || (this.svsClientDivUsrPK != null && !this.svsClientDivUsrPK.equals(other.svsClientDivUsrPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.SvsClientDivUsr[ svsClientDivUsrPK=" + svsClientDivUsrPK + " ]";
    }

}
