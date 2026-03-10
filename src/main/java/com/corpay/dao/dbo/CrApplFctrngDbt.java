/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
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
@Table(name = "CR_APPL_FCTRNG_DBT", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "CrApplFctrngDbt.findAll", query = "SELECT c FROM CrApplFctrngDbt c")})
public class CrApplFctrngDbt implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "APPL_NBR")
    private String applNbr;
    @Basic(optional = false)
    @Column(name = "CDN_FL_ACCT_CD")
    private String cdnFlAcctCd;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "ANTICIP_MTHLY_VOL")
    private BigDecimal anticipMthlyVol;
    @Basic(optional = false)
    @Column(name = "RESELLER")
    private String reseller;
    @Basic(optional = false)
    @Column(name = "REQ_CLTN")
    private String reqCltn;
    @Basic(optional = false)
    @Column(name = "DBTR_CNTCT_FST_NM")
    private String dbtrCntctFstNm;
    @Basic(optional = false)
    @Column(name = "DBTR_CNTCT_LST_NM")
    private String dbtrCntctLstNm;
    @Basic(optional = false)
    @Column(name = "MDY_USR")
    private String mdyUsr;
    @Basic(optional = false)
    @Column(name = "MDY_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date mdyTs;
    @Basic(optional = false)
    @Column(name = "CRT_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date crtTs;
    @Basic(optional = false)
    @Column(name = "CRT_USR")
    private String crtUsr;

    public CrApplFctrngDbt() {
    }

    public CrApplFctrngDbt(String applNbr) {
        this.applNbr = applNbr;
    }

    public CrApplFctrngDbt(String applNbr, String cdnFlAcctCd, BigDecimal anticipMthlyVol, String reseller, String reqCltn, String dbtrCntctFstNm, String dbtrCntctLstNm, String mdyUsr, Date mdyTs, Date crtTs, String crtUsr) {
        this.applNbr = applNbr;
        this.cdnFlAcctCd = cdnFlAcctCd;
        this.anticipMthlyVol = anticipMthlyVol;
        this.reseller = reseller;
        this.reqCltn = reqCltn;
        this.dbtrCntctFstNm = dbtrCntctFstNm;
        this.dbtrCntctLstNm = dbtrCntctLstNm;
        this.mdyUsr = mdyUsr;
        this.mdyTs = mdyTs;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
    }

    public String getApplNbr() {
        return applNbr;
    }

    public void setApplNbr(String applNbr) {
        this.applNbr = applNbr;
    }

    public String getCdnFlAcctCd() {
        return cdnFlAcctCd;
    }

    public void setCdnFlAcctCd(String cdnFlAcctCd) {
        this.cdnFlAcctCd = cdnFlAcctCd;
    }

    public BigDecimal getAnticipMthlyVol() {
        return anticipMthlyVol;
    }

    public void setAnticipMthlyVol(BigDecimal anticipMthlyVol) {
        this.anticipMthlyVol = anticipMthlyVol;
    }

    public String getReseller() {
        return reseller;
    }

    public void setReseller(String reseller) {
        this.reseller = reseller;
    }

    public String getReqCltn() {
        return reqCltn;
    }

    public void setReqCltn(String reqCltn) {
        this.reqCltn = reqCltn;
    }

    public String getDbtrCntctFstNm() {
        return dbtrCntctFstNm;
    }

    public void setDbtrCntctFstNm(String dbtrCntctFstNm) {
        this.dbtrCntctFstNm = dbtrCntctFstNm;
    }

    public String getDbtrCntctLstNm() {
        return dbtrCntctLstNm;
    }

    public void setDbtrCntctLstNm(String dbtrCntctLstNm) {
        this.dbtrCntctLstNm = dbtrCntctLstNm;
    }

    public String getMdyUsr() {
        return mdyUsr;
    }

    public void setMdyUsr(String mdyUsr) {
        this.mdyUsr = mdyUsr;
    }

    public Date getMdyTs() {
        return mdyTs;
    }

    public void setMdyTs(Date mdyTs) {
        this.mdyTs = mdyTs;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (applNbr != null ? applNbr.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CrApplFctrngDbt)) {
            return false;
        }
        CrApplFctrngDbt other = (CrApplFctrngDbt) object;
        if ((this.applNbr == null && other.applNbr != null) || (this.applNbr != null && !this.applNbr.equals(other.applNbr))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.CrApplFctrngDbt[ applNbr=" + applNbr + " ]";
    }
    
}
