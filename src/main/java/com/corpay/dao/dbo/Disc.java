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
@Table(name = "DISC", catalog = "", schema = "DBO")
public class Disc implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DiscPK discPK;
    @Basic(optional = false)
    @Column(name = "GRP")
    private short grp;
    @Basic(optional = false)
    @Column(name = "RT_MEASURE")
    private Character rtMeasure;

    @Basic(optional = false)
    @Column(name = "FRM_VAL")
    private BigDecimal frmVal;
    @Basic(optional = false)
    @Column(name = "TO_VAL")
    private BigDecimal toVal;
    @Basic(optional = false)
    @Column(name = "RT")
    private BigDecimal rt;
    @Basic(optional = false)
    @Column(name = "RT_TYP")
    private Character rtTyp;
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

    public Disc() {
    }

    public Disc(DiscPK discPK) {
        this.discPK = discPK;
    }

    public Disc(DiscPK discPK, short grp, Character rtMeasure, BigDecimal frmVal, BigDecimal toVal, BigDecimal rt, Character rtTyp, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.discPK = discPK;
        this.grp = grp;
        this.rtMeasure = rtMeasure;
        this.frmVal = frmVal;
        this.toVal = toVal;
        this.rt = rt;
        this.rtTyp = rtTyp;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public Disc(String acctNbr, String custId, Character discRebInd, short priority) {
        this.discPK = new DiscPK(acctNbr, custId, discRebInd, priority);
    }

    public DiscPK getDiscPK() {
        return discPK;
    }

    public void setDiscPK(DiscPK discPK) {
        this.discPK = discPK;
    }

    public short getGrp() {
        return grp;
    }

    public void setGrp(short grp) {
        this.grp = grp;
    }

    public Character getRtMeasure() {
        return rtMeasure;
    }

    public void setRtMeasure(Character rtMeasure) {
        this.rtMeasure = rtMeasure;
    }

    public BigDecimal getFrmVal() {
        return frmVal;
    }

    public void setFrmVal(BigDecimal frmVal) {
        this.frmVal = frmVal;
    }

    public BigDecimal getToVal() {
        return toVal;
    }

    public void setToVal(BigDecimal toVal) {
        this.toVal = toVal;
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
        hash += (discPK != null ? discPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof Disc)) {
            return false;
        }
        Disc other = (Disc) object;
        if ((this.discPK == null && other.discPK != null) || (this.discPK != null && !this.discPK.equals(other.discPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.Disc[ discPK=" + discPK + " ]";
    }

}
