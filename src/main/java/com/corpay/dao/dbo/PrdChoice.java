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
import java.util.Date;

/**
 *
 * @author Sukant.Tiwari
 */
@Entity
@Table(name = "PRD_CHOICE", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "PrdChoice.findAll", query = "SELECT p FROM PrdChoice p")})
public class PrdChoice implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PrdChoicePK prdChoicePK;
    @Basic(optional = false)
    @Column(name = "RPT_FAX_NBR")
    private String rptFaxNbr;
    @Basic(optional = false)
    @Column(name = "RPT_EMAIL_ADDR")
    private String rptEmailAddr;
    @Basic(optional = false)
    @Column(name = "RPT_DELV_FLGS")
    private short rptDelvFlgs;
    @Basic(optional = false)
    @Column(name = "EXC_RPT_FLGS")
    private short excRptFlgs;
    @Basic(optional = false)
    @Column(name = "SFTWR_END_DT")
    @Temporal(TemporalType.DATE)
    private Date sftwrEndDt;
    @Basic(optional = false)
    @Column(name = "SFTWR_BEG_DT")
    @Temporal(TemporalType.DATE)
    private Date sftwrBegDt;
    @Basic(optional = false)
    @Column(name = "SYS_ENGNR_NM")
    private String sysEngnrNm;
    @Basic(optional = false)
    @Column(name = "SFTWR_ENGNR_PH")
    private String sftwrEngnrPh;
    @Basic(optional = false)
    @Column(name = "SFTWR_OTH_DESC")
    private String sftwrOthDesc;
    @Basic(optional = false)
    @Column(name = "INV_OPTN")
    private String invOptn;
    @Basic(optional = false)
    @Column(name = "INV_FLGS")
    private short invFlgs;
    @Basic(optional = false)
    @Column(name = "SFTWR_FLGS")
    private short sftwrFlgs;
    @Basic(optional = false)
    @Column(name = "GHOST")
    private short ghost;
    @Basic(optional = false)
    @Column(name = "RPT_BLDR_FLGS")
    private short rptBldrFlgs;
    @Basic(optional = false)
    @Column(name = "SFTWR_OTH")
    private Character sftwrOth;
    @Basic(optional = false)
    @Column(name = "SFTWR_TYP")
    private String sftwrTyp;
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

    public PrdChoice() {
    }

    public PrdChoice(PrdChoicePK prdChoicePK) {
        this.prdChoicePK = prdChoicePK;
    }

    public PrdChoice(PrdChoicePK prdChoicePK, String rptFaxNbr, String rptEmailAddr, short rptDelvFlgs, short excRptFlgs, Date sftwrEndDt, Date sftwrBegDt, String sysEngnrNm, String sftwrEngnrPh, String sftwrOthDesc, String invOptn, short invFlgs, short sftwrFlgs, short ghost, short rptBldrFlgs, Character sftwrOth, String sftwrTyp, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.prdChoicePK = prdChoicePK;
        this.rptFaxNbr = rptFaxNbr;
        this.rptEmailAddr = rptEmailAddr;
        this.rptDelvFlgs = rptDelvFlgs;
        this.excRptFlgs = excRptFlgs;
        this.sftwrEndDt = sftwrEndDt;
        this.sftwrBegDt = sftwrBegDt;
        this.sysEngnrNm = sysEngnrNm;
        this.sftwrEngnrPh = sftwrEngnrPh;
        this.sftwrOthDesc = sftwrOthDesc;
        this.invOptn = invOptn;
        this.invFlgs = invFlgs;
        this.sftwrFlgs = sftwrFlgs;
        this.ghost = ghost;
        this.rptBldrFlgs = rptBldrFlgs;
        this.sftwrOth = sftwrOth;
        this.sftwrTyp = sftwrTyp;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public PrdChoice(String applNbr, String childTyp) {
        this.prdChoicePK = new PrdChoicePK(applNbr, childTyp);
    }

    public PrdChoicePK getPrdChoicePK() {
        return prdChoicePK;
    }

    public void setPrdChoicePK(PrdChoicePK prdChoicePK) {
        this.prdChoicePK = prdChoicePK;
    }

    public String getRptFaxNbr() {
        return rptFaxNbr;
    }

    public void setRptFaxNbr(String rptFaxNbr) {
        this.rptFaxNbr = rptFaxNbr;
    }

    public String getRptEmailAddr() {
        return rptEmailAddr;
    }

    public void setRptEmailAddr(String rptEmailAddr) {
        this.rptEmailAddr = rptEmailAddr;
    }

    public short getRptDelvFlgs() {
        return rptDelvFlgs;
    }

    public void setRptDelvFlgs(short rptDelvFlgs) {
        this.rptDelvFlgs = rptDelvFlgs;
    }

    public short getExcRptFlgs() {
        return excRptFlgs;
    }

    public void setExcRptFlgs(short excRptFlgs) {
        this.excRptFlgs = excRptFlgs;
    }

    public Date getSftwrEndDt() {
        return sftwrEndDt;
    }

    public void setSftwrEndDt(Date sftwrEndDt) {
        this.sftwrEndDt = sftwrEndDt;
    }

    public Date getSftwrBegDt() {
        return sftwrBegDt;
    }

    public void setSftwrBegDt(Date sftwrBegDt) {
        this.sftwrBegDt = sftwrBegDt;
    }

    public String getSysEngnrNm() {
        return sysEngnrNm;
    }

    public void setSysEngnrNm(String sysEngnrNm) {
        this.sysEngnrNm = sysEngnrNm;
    }

    public String getSftwrEngnrPh() {
        return sftwrEngnrPh;
    }

    public void setSftwrEngnrPh(String sftwrEngnrPh) {
        this.sftwrEngnrPh = sftwrEngnrPh;
    }

    public String getSftwrOthDesc() {
        return sftwrOthDesc;
    }

    public void setSftwrOthDesc(String sftwrOthDesc) {
        this.sftwrOthDesc = sftwrOthDesc;
    }

    public String getInvOptn() {
        return invOptn;
    }

    public void setInvOptn(String invOptn) {
        this.invOptn = invOptn;
    }

    public short getInvFlgs() {
        return invFlgs;
    }

    public void setInvFlgs(short invFlgs) {
        this.invFlgs = invFlgs;
    }

    public short getSftwrFlgs() {
        return sftwrFlgs;
    }

    public void setSftwrFlgs(short sftwrFlgs) {
        this.sftwrFlgs = sftwrFlgs;
    }

    public short getGhost() {
        return ghost;
    }

    public void setGhost(short ghost) {
        this.ghost = ghost;
    }

    public short getRptBldrFlgs() {
        return rptBldrFlgs;
    }

    public void setRptBldrFlgs(short rptBldrFlgs) {
        this.rptBldrFlgs = rptBldrFlgs;
    }

    public Character getSftwrOth() {
        return sftwrOth;
    }

    public void setSftwrOth(Character sftwrOth) {
        this.sftwrOth = sftwrOth;
    }

    public String getSftwrTyp() {
        return sftwrTyp;
    }

    public void setSftwrTyp(String sftwrTyp) {
        this.sftwrTyp = sftwrTyp;
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
        hash += (prdChoicePK != null ? prdChoicePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PrdChoice)) {
            return false;
        }
        PrdChoice other = (PrdChoice) object;
        if ((this.prdChoicePK == null && other.prdChoicePK != null) || (this.prdChoicePK != null && !this.prdChoicePK.equals(other.prdChoicePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.PrdChoice[ prdChoicePK=" + prdChoicePK + " ]";
    }
    
}
