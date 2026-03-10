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
@Table(name = "MC_CUST_LOC_DISC", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "McCustLocDisc.findAll", query = "SELECT m FROM McCustLocDisc m")})
public class McCustLocDisc implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected McCustLocDiscPK mcCustLocDiscPK;
    @Basic(optional = false)
    @Column(name = "PROD_GRP")
    private String prodGrp;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "DISC_RT")
    private BigDecimal discRt;
    @Basic(optional = false)
    @Column(name = "DISC_RT_TYP")
    private Character discRtTyp;
    @Basic(optional = false)
    @Column(name = "PRTY_CD")
    private short prtyCd;
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

    public McCustLocDisc() {
    }

    public McCustLocDisc(McCustLocDiscPK mcCustLocDiscPK) {
        this.mcCustLocDiscPK = mcCustLocDiscPK;
    }

    public McCustLocDisc(McCustLocDiscPK mcCustLocDiscPK, String prodGrp, BigDecimal discRt, Character discRtTyp, short prtyCd, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.mcCustLocDiscPK = mcCustLocDiscPK;
        this.prodGrp = prodGrp;
        this.discRt = discRt;
        this.discRtTyp = discRtTyp;
        this.prtyCd = prtyCd;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public McCustLocDisc(String custId, long acqInstIdCd, String acptId, String prodCd) {
        this.mcCustLocDiscPK = new McCustLocDiscPK(custId, acqInstIdCd, acptId, prodCd);
    }

    public McCustLocDiscPK getMcCustLocDiscPK() {
        return mcCustLocDiscPK;
    }

    public void setMcCustLocDiscPK(McCustLocDiscPK mcCustLocDiscPK) {
        this.mcCustLocDiscPK = mcCustLocDiscPK;
    }

    public String getProdGrp() {
        return prodGrp;
    }

    public void setProdGrp(String prodGrp) {
        this.prodGrp = prodGrp;
    }

    public BigDecimal getDiscRt() {
        return discRt;
    }

    public void setDiscRt(BigDecimal discRt) {
        this.discRt = discRt;
    }

    public Character getDiscRtTyp() {
        return discRtTyp;
    }

    public void setDiscRtTyp(Character discRtTyp) {
        this.discRtTyp = discRtTyp;
    }

    public short getPrtyCd() {
        return prtyCd;
    }

    public void setPrtyCd(short prtyCd) {
        this.prtyCd = prtyCd;
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
        hash += (mcCustLocDiscPK != null ? mcCustLocDiscPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof McCustLocDisc)) {
            return false;
        }
        McCustLocDisc other = (McCustLocDisc) object;
        if ((this.mcCustLocDiscPK == null && other.mcCustLocDiscPK != null) || (this.mcCustLocDiscPK != null && !this.mcCustLocDiscPK.equals(other.mcCustLocDiscPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.McCustLocDisc[ mcCustLocDiscPK=" + mcCustLocDiscPK + " ]";
    }
    
}
