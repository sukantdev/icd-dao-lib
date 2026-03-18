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
@Table(name = "RPT_NAMES", catalog = "", schema = "DBO")
public class RptNames implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected RptNamesPK rptNamesPK;
    @Basic(optional = false)
    @Column(name = "RPT_NM")
    private String rptNm;
    @Basic(optional = false)
    @Column(name = "RPT_DESC")
    private String rptDesc;
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

    public RptNames() {
    }

    public RptNames(RptNamesPK rptNamesPK) {
        this.rptNamesPK = rptNamesPK;
    }

    public RptNames(RptNamesPK rptNamesPK, String rptNm, String rptDesc, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.rptNamesPK = rptNamesPK;
        this.rptNm = rptNm;
        this.rptDesc = rptDesc;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public RptNames(String rptTyp, String acctTyp, String pdfCd, Character compId) {
        this.rptNamesPK = new RptNamesPK(rptTyp, acctTyp, pdfCd, compId);
    }

    public RptNamesPK getRptNamesPK() {
        return rptNamesPK;
    }

    public void setRptNamesPK(RptNamesPK rptNamesPK) {
        this.rptNamesPK = rptNamesPK;
    }

    public String getRptNm() {
        return rptNm;
    }

    public void setRptNm(String rptNm) {
        this.rptNm = rptNm;
    }

    public String getRptDesc() {
        return rptDesc;
    }

    public void setRptDesc(String rptDesc) {
        this.rptDesc = rptDesc;
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
        hash += (rptNamesPK != null ? rptNamesPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof RptNames)) {
            return false;
        }
        RptNames other = (RptNames) object;
        if ((this.rptNamesPK == null && other.rptNamesPK != null) || (this.rptNamesPK != null && !this.rptNamesPK.equals(other.rptNamesPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.RptNames[ rptNamesPK=" + rptNamesPK + " ]";
    }

}
