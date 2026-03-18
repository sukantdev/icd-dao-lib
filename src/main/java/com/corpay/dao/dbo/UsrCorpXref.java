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
@Table(name = "USR_CORP_XREF", catalog = "", schema = "DBO")
public class UsrCorpXref implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected UsrCorpXrefPK usrCorpXrefPK;
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

    public UsrCorpXref() {
    }

    public UsrCorpXref(UsrCorpXrefPK usrCorpXrefPK) {
        this.usrCorpXrefPK = usrCorpXrefPK;
    }

    public UsrCorpXref(UsrCorpXrefPK usrCorpXrefPK, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.usrCorpXrefPK = usrCorpXrefPK;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public UsrCorpXref(String usrId, String corpCd) {
        this.usrCorpXrefPK = new UsrCorpXrefPK(usrId, corpCd);
    }

    public UsrCorpXrefPK getUsrCorpXrefPK() {
        return usrCorpXrefPK;
    }

    public void setUsrCorpXrefPK(UsrCorpXrefPK usrCorpXrefPK) {
        this.usrCorpXrefPK = usrCorpXrefPK;
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
        hash += (usrCorpXrefPK != null ? usrCorpXrefPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof UsrCorpXref)) {
            return false;
        }
        UsrCorpXref other = (UsrCorpXref) object;
        if ((this.usrCorpXrefPK == null && other.usrCorpXrefPK != null) || (this.usrCorpXrefPK != null && !this.usrCorpXrefPK.equals(other.usrCorpXrefPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.UsrCorpXref[ usrCorpXrefPK=" + usrCorpXrefPK + " ]";
    }

}
