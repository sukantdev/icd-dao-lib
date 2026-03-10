/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author Sukant.Tiwari
 */
@Entity
@Table(name = "PROP_XTN_DISC", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "PropXtnDisc.findAll", query = "SELECT p FROM PropXtnDisc p")})
public class PropXtnDisc implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PropXtnDiscPK propXtnDiscPK;
    @Basic(optional = false)
    @Column(name = "DISC_TYP")
    private Character discTyp;
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
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
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
    @Column(name = "XPND_CTL_NBR")
    private int xpndCtlNbr;

    public PropXtnDisc() {
    }

    public PropXtnDisc(PropXtnDiscPK propXtnDiscPK) {
        this.propXtnDiscPK = propXtnDiscPK;
    }

    public PropXtnDisc(PropXtnDiscPK propXtnDiscPK, Character discTyp, short priority, short grp, String grpDesc, Character rtMeasure, BigDecimal rt, Character rtTyp, BigDecimal amt, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr, int xpndCtlNbr) {
        this.propXtnDiscPK = propXtnDiscPK;
        this.discTyp = discTyp;
        this.priority = priority;
        this.grp = grp;
        this.grpDesc = grpDesc;
        this.rtMeasure = rtMeasure;
        this.rt = rt;
        this.rtTyp = rtTyp;
        this.amt = amt;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
        this.xpndCtlNbr = xpndCtlNbr;
    }

    public PropXtnDisc(Date trnsDt, int ctlNbr, short prdNbr, Character discRebInd, short dupCtr) {
        this.propXtnDiscPK = new PropXtnDiscPK(trnsDt, ctlNbr, prdNbr, discRebInd, dupCtr);
    }

    public PropXtnDiscPK getPropXtnDiscPK() {
        return propXtnDiscPK;
    }

    public void setPropXtnDiscPK(PropXtnDiscPK propXtnDiscPK) {
        this.propXtnDiscPK = propXtnDiscPK;
    }

    public Character getDiscTyp() {
        return discTyp;
    }

    public void setDiscTyp(Character discTyp) {
        this.discTyp = discTyp;
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

    public int getXpndCtlNbr() {
        return xpndCtlNbr;
    }

    public void setXpndCtlNbr(int xpndCtlNbr) {
        this.xpndCtlNbr = xpndCtlNbr;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (propXtnDiscPK != null ? propXtnDiscPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PropXtnDisc)) {
            return false;
        }
        PropXtnDisc other = (PropXtnDisc) object;
        if ((this.propXtnDiscPK == null && other.propXtnDiscPK != null) || (this.propXtnDiscPK != null && !this.propXtnDiscPK.equals(other.propXtnDiscPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.PropXtnDisc[ propXtnDiscPK=" + propXtnDiscPK + " ]";
    }
    
}
