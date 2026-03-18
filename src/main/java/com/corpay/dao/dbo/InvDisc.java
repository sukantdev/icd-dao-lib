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
@Table(name = "INV_DISC", catalog = "", schema = "DBO")
public class InvDisc implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected InvDiscPK invDiscPK;
    @Basic(optional = false)
    @Column(name = "PRTN_ID")
    private short prtnId;
    @Basic(optional = false)
    @Column(name = "PROD_DTL_CR_OR_DB")
    private Character prodDtlCrOrDb;
    @Basic(optional = false)
    @Column(name = "PRD_CD")
    private String prdCd;
    @Basic(optional = false)
    @Column(name = "PRD_DESC")
    private String prdDesc;
    @Basic(optional = false)
    @Column(name = "PRIORITY")
    private short priority;
    @Basic(optional = false)
    @Column(name = "GRP")
    private short grp;
    @Basic(optional = false)
    @Column(name = "GRP_DESC")
    private String grpDesc;
    @Basic(optional = false)
    @Column(name = "RT_MEASURE")
    private Character rtMeasure;

    @Basic(optional = false)
    @Column(name = "RT")
    private BigDecimal rt;
    @Basic(optional = false)
    @Column(name = "RT_TYP")
    private Character rtTyp;
    @Basic(optional = false)
    @Column(name = "AMT")
    private BigDecimal amt;
    @Basic(optional = false)
    @Column(name = "DISB_METH")
    private Character disbMeth;
    @Basic(optional = false)
    @Column(name = "GRP_CAT")
    private Character grpCat;
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

    public InvDisc() {
    }

    public InvDisc(InvDiscPK invDiscPK) {
        this.invDiscPK = invDiscPK;
    }

    public InvDisc(InvDiscPK invDiscPK, short prtnId, Character prodDtlCrOrDb, String prdCd, String prdDesc, short priority, short grp, String grpDesc, Character rtMeasure, BigDecimal rt, Character rtTyp, BigDecimal amt, Character disbMeth, Character grpCat, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.invDiscPK = invDiscPK;
        this.prtnId = prtnId;
        this.prodDtlCrOrDb = prodDtlCrOrDb;
        this.prdCd = prdCd;
        this.prdDesc = prdDesc;
        this.priority = priority;
        this.grp = grp;
        this.grpDesc = grpDesc;
        this.rtMeasure = rtMeasure;
        this.rt = rt;
        this.rtTyp = rtTyp;
        this.amt = amt;
        this.disbMeth = disbMeth;
        this.grpCat = grpCat;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public InvDisc(Date pstdDt, int trnsId, int seqNbr, Character discTyp, int subSeqNbr) {
        this.invDiscPK = new InvDiscPK(pstdDt, trnsId, seqNbr, discTyp, subSeqNbr);
    }

    public InvDiscPK getInvDiscPK() {
        return invDiscPK;
    }

    public void setInvDiscPK(InvDiscPK invDiscPK) {
        this.invDiscPK = invDiscPK;
    }

    public short getPrtnId() {
        return prtnId;
    }

    public void setPrtnId(short prtnId) {
        this.prtnId = prtnId;
    }

    public Character getProdDtlCrOrDb() {
        return prodDtlCrOrDb;
    }

    public void setProdDtlCrOrDb(Character prodDtlCrOrDb) {
        this.prodDtlCrOrDb = prodDtlCrOrDb;
    }

    public String getPrdCd() {
        return prdCd;
    }

    public void setPrdCd(String prdCd) {
        this.prdCd = prdCd;
    }

    public String getPrdDesc() {
        return prdDesc;
    }

    public void setPrdDesc(String prdDesc) {
        this.prdDesc = prdDesc;
    }

    public short getPriority() {
        return priority;
    }

    public void setPriority(short priority) {
        this.priority = priority;
    }

    public short getGrp() {
        return grp;
    }

    public void setGrp(short grp) {
        this.grp = grp;
    }

    public String getGrpDesc() {
        return grpDesc;
    }

    public void setGrpDesc(String grpDesc) {
        this.grpDesc = grpDesc;
    }

    public Character getRtMeasure() {
        return rtMeasure;
    }

    public void setRtMeasure(Character rtMeasure) {
        this.rtMeasure = rtMeasure;
    }

    public BigDecimal getRt() {
        return rt;
    }

    public void setRt(BigDecimal rt) {
        this.rt = rt;
    }

    public Character getRtTyp() {
        return rtTyp;
    }

    public void setRtTyp(Character rtTyp) {
        this.rtTyp = rtTyp;
    }

    public BigDecimal getAmt() {
        return amt;
    }

    public void setAmt(BigDecimal amt) {
        this.amt = amt;
    }

    public Character getDisbMeth() {
        return disbMeth;
    }

    public void setDisbMeth(Character disbMeth) {
        this.disbMeth = disbMeth;
    }

    public Character getGrpCat() {
        return grpCat;
    }

    public void setGrpCat(Character grpCat) {
        this.grpCat = grpCat;
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
        hash += (invDiscPK != null ? invDiscPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof InvDisc)) {
            return false;
        }
        InvDisc other = (InvDisc) object;
        if ((this.invDiscPK == null && other.invDiscPK != null) || (this.invDiscPK != null && !this.invDiscPK.equals(other.invDiscPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.InvDisc[ invDiscPK=" + invDiscPK + " ]";
    }

}
