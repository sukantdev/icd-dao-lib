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
@Table(name = "RS_SYS_STATS", catalog = "", schema = "DBO")
public class RsSysStats implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected RsSysStatsPK rsSysStatsPK;
    @Basic(optional = false)
    @Column(name = "ROW_DT")
    @Temporal(TemporalType.DATE)
    private Date rowDt;
    @Basic(optional = false)
    @Column(name = "ROW_HR")
    private short rowHr;
    @Basic(optional = false)
    @Column(name = "IN_CNT")
    private short inCnt;
    @Basic(optional = false)
    @Column(name = "OUT_CNT")
    private short outCnt;
    @Basic(optional = false)
    @Column(name = "TL_TM")
    private int tlTm;
    @Basic(optional = false)
    @Column(name = "ERR_CNT")
    private short errCnt;
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

    public RsSysStats() {
    }

    public RsSysStats(RsSysStatsPK rsSysStatsPK) {
        this.rsSysStatsPK = rsSysStatsPK;
    }

    public RsSysStats(RsSysStatsPK rsSysStatsPK, Date rowDt, short rowHr, short inCnt, short outCnt, int tlTm, short errCnt, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.rsSysStatsPK = rsSysStatsPK;
        this.rowDt = rowDt;
        this.rowHr = rowHr;
        this.inCnt = inCnt;
        this.outCnt = outCnt;
        this.tlTm = tlTm;
        this.errCnt = errCnt;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public RsSysStats(String queNm, int rowMnt) {
        this.rsSysStatsPK = new RsSysStatsPK(queNm, rowMnt);
    }

    public RsSysStatsPK getRsSysStatsPK() {
        return rsSysStatsPK;
    }

    public void setRsSysStatsPK(RsSysStatsPK rsSysStatsPK) {
        this.rsSysStatsPK = rsSysStatsPK;
    }

    public Date getRowDt() {
        return rowDt;
    }

    public void setRowDt(Date rowDt) {
        this.rowDt = rowDt;
    }

    public short getRowHr() {
        return rowHr;
    }

    public void setRowHr(short rowHr) {
        this.rowHr = rowHr;
    }

    public short getInCnt() {
        return inCnt;
    }

    public void setInCnt(short inCnt) {
        this.inCnt = inCnt;
    }

    public short getOutCnt() {
        return outCnt;
    }

    public void setOutCnt(short outCnt) {
        this.outCnt = outCnt;
    }

    public int getTlTm() {
        return tlTm;
    }

    public void setTlTm(int tlTm) {
        this.tlTm = tlTm;
    }

    public short getErrCnt() {
        return errCnt;
    }

    public void setErrCnt(short errCnt) {
        this.errCnt = errCnt;
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
        hash += (rsSysStatsPK != null ? rsSysStatsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof RsSysStats)) {
            return false;
        }
        RsSysStats other = (RsSysStats) object;
        if ((this.rsSysStatsPK == null && other.rsSysStatsPK != null) || (this.rsSysStatsPK != null && !this.rsSysStatsPK.equals(other.rsSysStatsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.RsSysStats[ rsSysStatsPK=" + rsSysStatsPK + " ]";
    }

}
