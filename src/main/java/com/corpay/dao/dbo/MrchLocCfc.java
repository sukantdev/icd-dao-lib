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
@Table(name = "MRCH_LOC_CFC", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "MrchLocCfc.findAll", query = "SELECT m FROM MrchLocCfc m")})
public class MrchLocCfc implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected MrchLocCfcPK mrchLocCfcPK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "MARK_UP_RT")
    private BigDecimal markUpRt;
    @Basic(optional = false)
    @Column(name = "MARK_UP_RT_TYP")
    private Character markUpRtTyp;
    @Basic(optional = false)
    @Column(name = "BILL_FLG")
    private Character billFlg;
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

    public MrchLocCfc() {
    }

    public MrchLocCfc(MrchLocCfcPK mrchLocCfcPK) {
        this.mrchLocCfcPK = mrchLocCfcPK;
    }

    public MrchLocCfc(MrchLocCfcPK mrchLocCfcPK, BigDecimal markUpRt, Character markUpRtTyp, Character billFlg, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.mrchLocCfcPK = mrchLocCfcPK;
        this.markUpRt = markUpRt;
        this.markUpRtTyp = markUpRtTyp;
        this.billFlg = billFlg;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public MrchLocCfc(String blngId, short discGrp) {
        this.mrchLocCfcPK = new MrchLocCfcPK(blngId, discGrp);
    }

    public MrchLocCfcPK getMrchLocCfcPK() {
        return mrchLocCfcPK;
    }

    public void setMrchLocCfcPK(MrchLocCfcPK mrchLocCfcPK) {
        this.mrchLocCfcPK = mrchLocCfcPK;
    }

    public BigDecimal getMarkUpRt() {
        return markUpRt;
    }

    public void setMarkUpRt(BigDecimal markUpRt) {
        this.markUpRt = markUpRt;
    }

    public Character getMarkUpRtTyp() {
        return markUpRtTyp;
    }

    public void setMarkUpRtTyp(Character markUpRtTyp) {
        this.markUpRtTyp = markUpRtTyp;
    }

    public Character getBillFlg() {
        return billFlg;
    }

    public void setBillFlg(Character billFlg) {
        this.billFlg = billFlg;
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
        hash += (mrchLocCfcPK != null ? mrchLocCfcPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MrchLocCfc)) {
            return false;
        }
        MrchLocCfc other = (MrchLocCfc) object;
        if ((this.mrchLocCfcPK == null && other.mrchLocCfcPK != null) || (this.mrchLocCfcPK != null && !this.mrchLocCfcPK.equals(other.mrchLocCfcPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.MrchLocCfc[ mrchLocCfcPK=" + mrchLocCfcPK + " ]";
    }
    
}
