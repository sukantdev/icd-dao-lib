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
@Table(name = "RS_PRS_FRMT", catalog = "", schema = "DBO")
public class RsPrsFrmt implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected RsPrsFrmtPK rsPrsFrmtPK;
    @Basic(optional = false)
    @Column(name = "PRS_FRMT_PGM_NM")
    private String prsFrmtPgmNm;
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
    @Column(name = "MQ_EXPIRY_TM")
    private int mqExpiryTm;

    public RsPrsFrmt() {
    }

    public RsPrsFrmt(RsPrsFrmtPK rsPrsFrmtPK) {
        this.rsPrsFrmtPK = rsPrsFrmtPK;
    }

    public RsPrsFrmt(RsPrsFrmtPK rsPrsFrmtPK, String prsFrmtPgmNm, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr, int mqExpiryTm) {
        this.rsPrsFrmtPK = rsPrsFrmtPK;
        this.prsFrmtPgmNm = prsFrmtPgmNm;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
        this.mqExpiryTm = mqExpiryTm;
    }

    public RsPrsFrmt(String procTrnsId, int reqNbr) {
        this.rsPrsFrmtPK = new RsPrsFrmtPK(procTrnsId, reqNbr);
    }

    public RsPrsFrmtPK getRsPrsFrmtPK() {
        return rsPrsFrmtPK;
    }

    public void setRsPrsFrmtPK(RsPrsFrmtPK rsPrsFrmtPK) {
        this.rsPrsFrmtPK = rsPrsFrmtPK;
    }

    public String getPrsFrmtPgmNm() {
        return prsFrmtPgmNm;
    }

    public void setPrsFrmtPgmNm(String prsFrmtPgmNm) {
        this.prsFrmtPgmNm = prsFrmtPgmNm;
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

    public int getMqExpiryTm() {
        return mqExpiryTm;
    }

    public void setMqExpiryTm(int mqExpiryTm) {
        this.mqExpiryTm = mqExpiryTm;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (rsPrsFrmtPK != null ? rsPrsFrmtPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof RsPrsFrmt)) {
            return false;
        }
        RsPrsFrmt other = (RsPrsFrmt) object;
        if ((this.rsPrsFrmtPK == null && other.rsPrsFrmtPK != null) || (this.rsPrsFrmtPK != null && !this.rsPrsFrmtPK.equals(other.rsPrsFrmtPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.RsPrsFrmt[ rsPrsFrmtPK=" + rsPrsFrmtPK + " ]";
    }

}
