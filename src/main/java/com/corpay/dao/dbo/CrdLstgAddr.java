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
import java.util.Date;

/**
 *
 * @author Sukant.Tiwari
 */
@Entity
@Table(name = "CRD_LSTG_ADDR", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "CrdLstgAddr.findAll", query = "SELECT c FROM CrdLstgAddr c")})
public class CrdLstgAddr implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CRD_NBR")
    private String crdNbr;
    @Basic(optional = false)
    @Column(name = "MLNG_ADDR1")
    private String mlngAddr1;
    @Basic(optional = false)
    @Column(name = "MLNG_ADDR2")
    private String mlngAddr2;
    @Basic(optional = false)
    @Column(name = "MLNG_CITY")
    private String mlngCity;
    @Basic(optional = false)
    @Column(name = "MLNG_ST")
    private String mlngSt;
    @Basic(optional = false)
    @Column(name = "MLNG_POST_CD")
    private String mlngPostCd;
    @Basic(optional = false)
    @Column(name = "MLNG_CRTY")
    private String mlngCrty;
    @Basic(optional = false)
    @Column(name = "MLNG_NM")
    private String mlngNm;
    @Basic(optional = false)
    @Column(name = "MLNG_ATTN_TO")
    private String mlngAttnTo;
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
    @Column(name = "CDHLDR_MOBILE_NBR")
    private String cdhldrMobileNbr;
    @Basic(optional = false)
    @Column(name = "CDHLDR_EMAIL_ADDR")
    private String cdhldrEmailAddr;

    public CrdLstgAddr() {
    }

    public CrdLstgAddr(String crdNbr) {
        this.crdNbr = crdNbr;
    }

    public CrdLstgAddr(String crdNbr, String mlngAddr1, String mlngAddr2, String mlngCity, String mlngSt, String mlngPostCd, String mlngCrty, String mlngNm, String mlngAttnTo, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr, String cdhldrMobileNbr, String cdhldrEmailAddr) {
        this.crdNbr = crdNbr;
        this.mlngAddr1 = mlngAddr1;
        this.mlngAddr2 = mlngAddr2;
        this.mlngCity = mlngCity;
        this.mlngSt = mlngSt;
        this.mlngPostCd = mlngPostCd;
        this.mlngCrty = mlngCrty;
        this.mlngNm = mlngNm;
        this.mlngAttnTo = mlngAttnTo;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
        this.cdhldrMobileNbr = cdhldrMobileNbr;
        this.cdhldrEmailAddr = cdhldrEmailAddr;
    }

    public String getCrdNbr() {
        return crdNbr;
    }

    public void setCrdNbr(String crdNbr) {
        this.crdNbr = crdNbr;
    }

    public String getMlngAddr1() {
        return mlngAddr1;
    }

    public void setMlngAddr1(String mlngAddr1) {
        this.mlngAddr1 = mlngAddr1;
    }

    public String getMlngAddr2() {
        return mlngAddr2;
    }

    public void setMlngAddr2(String mlngAddr2) {
        this.mlngAddr2 = mlngAddr2;
    }

    public String getMlngCity() {
        return mlngCity;
    }

    public void setMlngCity(String mlngCity) {
        this.mlngCity = mlngCity;
    }

    public String getMlngSt() {
        return mlngSt;
    }

    public void setMlngSt(String mlngSt) {
        this.mlngSt = mlngSt;
    }

    public String getMlngPostCd() {
        return mlngPostCd;
    }

    public void setMlngPostCd(String mlngPostCd) {
        this.mlngPostCd = mlngPostCd;
    }

    public String getMlngCrty() {
        return mlngCrty;
    }

    public void setMlngCrty(String mlngCrty) {
        this.mlngCrty = mlngCrty;
    }

    public String getMlngNm() {
        return mlngNm;
    }

    public void setMlngNm(String mlngNm) {
        this.mlngNm = mlngNm;
    }

    public String getMlngAttnTo() {
        return mlngAttnTo;
    }

    public void setMlngAttnTo(String mlngAttnTo) {
        this.mlngAttnTo = mlngAttnTo;
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

    public String getCdhldrMobileNbr() {
        return cdhldrMobileNbr;
    }

    public void setCdhldrMobileNbr(String cdhldrMobileNbr) {
        this.cdhldrMobileNbr = cdhldrMobileNbr;
    }

    public String getCdhldrEmailAddr() {
        return cdhldrEmailAddr;
    }

    public void setCdhldrEmailAddr(String cdhldrEmailAddr) {
        this.cdhldrEmailAddr = cdhldrEmailAddr;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (crdNbr != null ? crdNbr.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CrdLstgAddr)) {
            return false;
        }
        CrdLstgAddr other = (CrdLstgAddr) object;
        if ((this.crdNbr == null && other.crdNbr != null) || (this.crdNbr != null && !this.crdNbr.equals(other.crdNbr))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.CrdLstgAddr[ crdNbr=" + crdNbr + " ]";
    }
    
}
