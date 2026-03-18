package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "CRD_CLATRL_KIT", catalog = "", schema = "DBO")
public class CrdClatrlKit implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CRD_CLATRL_CD")
    private Short crdClatrlCd;
    @Basic(optional = false)
    @Column(name = "CRD_CLATRL_DESC")
    private String crdClatrlDesc;
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

    public CrdClatrlKit() {
    }

    public CrdClatrlKit(Short crdClatrlCd) {
        this.crdClatrlCd = crdClatrlCd;
    }

    public CrdClatrlKit(Short crdClatrlCd, String crdClatrlDesc, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.crdClatrlCd = crdClatrlCd;
        this.crdClatrlDesc = crdClatrlDesc;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public Short getCrdClatrlCd() {
        return crdClatrlCd;
    }

    public void setCrdClatrlCd(Short crdClatrlCd) {
        this.crdClatrlCd = crdClatrlCd;
    }

    public String getCrdClatrlDesc() {
        return crdClatrlDesc;
    }

    public void setCrdClatrlDesc(String crdClatrlDesc) {
        this.crdClatrlDesc = crdClatrlDesc;
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
        hash += (crdClatrlCd != null ? crdClatrlCd.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof CrdClatrlKit)) {
            return false;
        }
        CrdClatrlKit other = (CrdClatrlKit) object;
        if ((this.crdClatrlCd == null && other.crdClatrlCd != null) || (this.crdClatrlCd != null && !this.crdClatrlCd.equals(other.crdClatrlCd))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.CrdClatrlKit[ crdClatrlCd=" + crdClatrlCd + " ]";
    }

}
