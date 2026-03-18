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
@Table(name = "PROC_CMPLTN_DTS", catalog = "", schema = "DBO")
public class ProcCmpltnDts implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "DT_TYP")
    private String dtTyp;
    @Basic(optional = false)
    @Column(name = "LATEST_DT_CMPLTD")
    @Temporal(TemporalType.DATE)
    private Date latestDtCmpltd;
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

    public ProcCmpltnDts() {
    }

    public ProcCmpltnDts(String dtTyp) {
        this.dtTyp = dtTyp;
    }

    public ProcCmpltnDts(String dtTyp, Date latestDtCmpltd, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.dtTyp = dtTyp;
        this.latestDtCmpltd = latestDtCmpltd;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public String getDtTyp() {
        return dtTyp;
    }

    public void setDtTyp(String dtTyp) {
        this.dtTyp = dtTyp;
    }

    public Date getLatestDtCmpltd() {
        return latestDtCmpltd;
    }

    public void setLatestDtCmpltd(Date latestDtCmpltd) {
        this.latestDtCmpltd = latestDtCmpltd;
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
        hash += (dtTyp != null ? dtTyp.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof ProcCmpltnDts)) {
            return false;
        }
        ProcCmpltnDts other = (ProcCmpltnDts) object;
        if ((this.dtTyp == null && other.dtTyp != null) || (this.dtTyp != null && !this.dtTyp.equals(other.dtTyp))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.ProcCmpltnDts[ dtTyp=" + dtTyp + " ]";
    }

}
