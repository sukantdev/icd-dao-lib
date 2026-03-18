package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "FN_XTN_DISC", catalog = "", schema = "DBO")
public class FnXtnDisc implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected FnXtnDiscPK fnXtnDiscPK;
    @Basic(optional = false)
    @Column(name = "DISC_TYP_CD")
    private Character discTypCd;
    @Basic(optional = false)
    @Column(name = "PRIORITY_IND")
    private short priorityInd;
    @Basic(optional = false)
    @Column(name = "GRP_NBR")
    private short grpNbr;
    @Basic(optional = false)
    @Column(name = "GRP_DESC")
    private String grpDesc;
    @Basic(optional = false)
    @Column(name = "RT_MEASURE_CD")
    private Character rtMeasureCd;

    @Basic(optional = false)
    @Column(name = "RT")
    private BigDecimal rt;
    @Basic(optional = false)
    @Column(name = "RT_TYP_CD")
    private Character rtTypCd;
    @Basic(optional = false)
    @Column(name = "DISC_AMT")
    private BigDecimal discAmt;
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

    public FnXtnDisc() {
    }

    public FnXtnDisc(FnXtnDiscPK fnXtnDiscPK) {
        this.fnXtnDiscPK = fnXtnDiscPK;
    }

    public FnXtnDisc(FnXtnDiscPK fnXtnDiscPK, Character discTypCd, short priorityInd, short grpNbr, String grpDesc, Character rtMeasureCd, BigDecimal rt, Character rtTypCd, BigDecimal discAmt, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.fnXtnDiscPK = fnXtnDiscPK;
        this.discTypCd = discTypCd;
        this.priorityInd = priorityInd;
        this.grpNbr = grpNbr;
        this.grpDesc = grpDesc;
        this.rtMeasureCd = rtMeasureCd;
        this.rt = rt;
        this.rtTypCd = rtTypCd;
        this.discAmt = discAmt;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public FnXtnDisc(Date trnsDt, int ctlNbr, Character discRebInd, short discSeq) {
        this.fnXtnDiscPK = new FnXtnDiscPK(trnsDt, ctlNbr, discRebInd, discSeq);
    }

    public FnXtnDiscPK getFnXtnDiscPK() {
        return fnXtnDiscPK;
    }

    public void setFnXtnDiscPK(FnXtnDiscPK fnXtnDiscPK) {
        this.fnXtnDiscPK = fnXtnDiscPK;
    }

    public Character getDiscTypCd() {
        return discTypCd;
    }

    public void setDiscTypCd(Character discTypCd) {
        this.discTypCd = discTypCd;
    }

    public short getPriorityInd() {
        return priorityInd;
    }

    public void setPriorityInd(short priorityInd) {
        this.priorityInd = priorityInd;
    }

    public short getGrpNbr() {
        return grpNbr;
    }

    public void setGrpNbr(short grpNbr) {
        this.grpNbr = grpNbr;
    }

    public String getGrpDesc() {
        return grpDesc;
    }

    public void setGrpDesc(String grpDesc) {
        this.grpDesc = grpDesc;
    }

    public Character getRtMeasureCd() {
        return rtMeasureCd;
    }

    public void setRtMeasureCd(Character rtMeasureCd) {
        this.rtMeasureCd = rtMeasureCd;
    }

    public BigDecimal getRt() {
        return rt;
    }

    public void setRt(BigDecimal rt) {
        this.rt = rt;
    }

    public Character getRtTypCd() {
        return rtTypCd;
    }

    public void setRtTypCd(Character rtTypCd) {
        this.rtTypCd = rtTypCd;
    }

    public BigDecimal getDiscAmt() {
        return discAmt;
    }

    public void setDiscAmt(BigDecimal discAmt) {
        this.discAmt = discAmt;
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
        hash += (fnXtnDiscPK != null ? fnXtnDiscPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof FnXtnDisc)) {
            return false;
        }
        FnXtnDisc other = (FnXtnDisc) object;
        if ((this.fnXtnDiscPK == null && other.fnXtnDiscPK != null) || (this.fnXtnDiscPK != null && !this.fnXtnDiscPK.equals(other.fnXtnDiscPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.FnXtnDisc[ fnXtnDiscPK=" + fnXtnDiscPK + " ]";
    }

}
