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
@Table(name = "VENDOR_REJECTS", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "VendorRejects.findAll", query = "SELECT v FROM VendorRejects v")})
public class VendorRejects implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "VNDR_REJECTS_ID")
    private String vndrRejectsId;
    @Basic(optional = false)
    @Column(name = "CUST_ID")
    private String custId;
    @Basic(optional = false)
    @Column(name = "VNDR_NBR")
    private String vndrNbr;
    @Basic(optional = false)
    @Column(name = "LOC_CD")
    private String locCd;
    @Basic(optional = false)
    @Column(name = "VNDR_NM")
    private String vndrNm;
    @Basic(optional = false)
    @Column(name = "DBA_NM")
    private String dbaNm;
    @Basic(optional = false)
    @Column(name = "RMT_EMAIL")
    private String rmtEmail;
    @Basic(optional = false)
    @Column(name = "TAX_ID")
    private String taxId;
    @Basic(optional = false)
    @Column(name = "DUNS_NBR")
    private String dunsNbr;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "ANL_SPND")
    private BigDecimal anlSpnd;
    @Basic(optional = false)
    @Column(name = "ADDR1")
    private String addr1;
    @Basic(optional = false)
    @Column(name = "ADDR2")
    private String addr2;
    @Basic(optional = false)
    @Column(name = "CTY")
    private String cty;
    @Basic(optional = false)
    @Column(name = "ST")
    private String st;
    @Basic(optional = false)
    @Column(name = "ZIP")
    private String zip;
    @Basic(optional = false)
    @Column(name = "CNTRY_CD")
    private String cntryCd;
    @Basic(optional = false)
    @Column(name = "VNDR_CNTCT_TTL")
    private String vndrCntctTtl;
    @Basic(optional = false)
    @Column(name = "VNDR_CNTCT_PREFIX")
    private String vndrCntctPrefix;
    @Basic(optional = false)
    @Column(name = "VNDR_CNTCT_FST_NM")
    private String vndrCntctFstNm;
    @Basic(optional = false)
    @Column(name = "VNDR_CNTCT_LAT_NA")
    private String vndrCntctLatNa;
    @Basic(optional = false)
    @Column(name = "VNDR_CNTCT_SUFFIX")
    private String vndrCntctSuffix;
    @Basic(optional = false)
    @Column(name = "VNDR_CNTCT_EMAIL")
    private String vndrCntctEmail;
    @Basic(optional = false)
    @Column(name = "VNDR_CNTCT_PH_NBR")
    private String vndrCntctPhNbr;
    @Basic(optional = false)
    @Column(name = "TRMS")
    private String trms;
    @Basic(optional = false)
    @Column(name = "CURR_PMT_MTHD")
    private String currPmtMthd;
    @Basic(optional = false)
    @Column(name = "VNDR_USR")
    private String vndrUsr;
    @Basic(optional = false)
    @Column(name = "TRNS_CNT")
    private int trnsCnt;
    @Basic(optional = false)
    @Column(name = "RESP_CD")
    private String respCd;
    @Basic(optional = false)
    @Column(name = "RESP_MSG")
    private String respMsg;
    @Basic(optional = false)
    @Column(name = "RJCT_CD")
    private String rjctCd;
    @Basic(optional = false)
    @Column(name = "RJCT_MSG")
    private String rjctMsg;
    @Basic(optional = false)
    @Column(name = "MDY_USR")
    private String mdyUsr;
    @Basic(optional = false)
    @Column(name = "MDY_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date mdyTs;
    @Basic(optional = false)
    @Column(name = "CRT_USR")
    private String crtUsr;
    @Basic(optional = false)
    @Column(name = "CRT_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date crtTs;

    public VendorRejects() {
    }

    public VendorRejects(String vndrRejectsId) {
        this.vndrRejectsId = vndrRejectsId;
    }

    public VendorRejects(String vndrRejectsId, String custId, String vndrNbr, String locCd, String vndrNm, String dbaNm, String rmtEmail, String taxId, String dunsNbr, BigDecimal anlSpnd, String addr1, String addr2, String cty, String st, String zip, String cntryCd, String vndrCntctTtl, String vndrCntctPrefix, String vndrCntctFstNm, String vndrCntctLatNa, String vndrCntctSuffix, String vndrCntctEmail, String vndrCntctPhNbr, String trms, String currPmtMthd, String vndrUsr, int trnsCnt, String respCd, String respMsg, String rjctCd, String rjctMsg, String mdyUsr, Date mdyTs, String crtUsr, Date crtTs) {
        this.vndrRejectsId = vndrRejectsId;
        this.custId = custId;
        this.vndrNbr = vndrNbr;
        this.locCd = locCd;
        this.vndrNm = vndrNm;
        this.dbaNm = dbaNm;
        this.rmtEmail = rmtEmail;
        this.taxId = taxId;
        this.dunsNbr = dunsNbr;
        this.anlSpnd = anlSpnd;
        this.addr1 = addr1;
        this.addr2 = addr2;
        this.cty = cty;
        this.st = st;
        this.zip = zip;
        this.cntryCd = cntryCd;
        this.vndrCntctTtl = vndrCntctTtl;
        this.vndrCntctPrefix = vndrCntctPrefix;
        this.vndrCntctFstNm = vndrCntctFstNm;
        this.vndrCntctLatNa = vndrCntctLatNa;
        this.vndrCntctSuffix = vndrCntctSuffix;
        this.vndrCntctEmail = vndrCntctEmail;
        this.vndrCntctPhNbr = vndrCntctPhNbr;
        this.trms = trms;
        this.currPmtMthd = currPmtMthd;
        this.vndrUsr = vndrUsr;
        this.trnsCnt = trnsCnt;
        this.respCd = respCd;
        this.respMsg = respMsg;
        this.rjctCd = rjctCd;
        this.rjctMsg = rjctMsg;
        this.mdyUsr = mdyUsr;
        this.mdyTs = mdyTs;
        this.crtUsr = crtUsr;
        this.crtTs = crtTs;
    }

    public String getVndrRejectsId() {
        return vndrRejectsId;
    }

    public void setVndrRejectsId(String vndrRejectsId) {
        this.vndrRejectsId = vndrRejectsId;
    }

    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId;
    }

    public String getVndrNbr() {
        return vndrNbr;
    }

    public void setVndrNbr(String vndrNbr) {
        this.vndrNbr = vndrNbr;
    }

    public String getLocCd() {
        return locCd;
    }

    public void setLocCd(String locCd) {
        this.locCd = locCd;
    }

    public String getVndrNm() {
        return vndrNm;
    }

    public void setVndrNm(String vndrNm) {
        this.vndrNm = vndrNm;
    }

    public String getDbaNm() {
        return dbaNm;
    }

    public void setDbaNm(String dbaNm) {
        this.dbaNm = dbaNm;
    }

    public String getRmtEmail() {
        return rmtEmail;
    }

    public void setRmtEmail(String rmtEmail) {
        this.rmtEmail = rmtEmail;
    }

    public String getTaxId() {
        return taxId;
    }

    public void setTaxId(String taxId) {
        this.taxId = taxId;
    }

    public String getDunsNbr() {
        return dunsNbr;
    }

    public void setDunsNbr(String dunsNbr) {
        this.dunsNbr = dunsNbr;
    }

    public BigDecimal getAnlSpnd() {
        return anlSpnd;
    }

    public void setAnlSpnd(BigDecimal anlSpnd) {
        this.anlSpnd = anlSpnd;
    }

    public String getAddr1() {
        return addr1;
    }

    public void setAddr1(String addr1) {
        this.addr1 = addr1;
    }

    public String getAddr2() {
        return addr2;
    }

    public void setAddr2(String addr2) {
        this.addr2 = addr2;
    }

    public String getCty() {
        return cty;
    }

    public void setCty(String cty) {
        this.cty = cty;
    }

    public String getSt() {
        return st;
    }

    public void setSt(String st) {
        this.st = st;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getCntryCd() {
        return cntryCd;
    }

    public void setCntryCd(String cntryCd) {
        this.cntryCd = cntryCd;
    }

    public String getVndrCntctTtl() {
        return vndrCntctTtl;
    }

    public void setVndrCntctTtl(String vndrCntctTtl) {
        this.vndrCntctTtl = vndrCntctTtl;
    }

    public String getVndrCntctPrefix() {
        return vndrCntctPrefix;
    }

    public void setVndrCntctPrefix(String vndrCntctPrefix) {
        this.vndrCntctPrefix = vndrCntctPrefix;
    }

    public String getVndrCntctFstNm() {
        return vndrCntctFstNm;
    }

    public void setVndrCntctFstNm(String vndrCntctFstNm) {
        this.vndrCntctFstNm = vndrCntctFstNm;
    }

    public String getVndrCntctLatNa() {
        return vndrCntctLatNa;
    }

    public void setVndrCntctLatNa(String vndrCntctLatNa) {
        this.vndrCntctLatNa = vndrCntctLatNa;
    }

    public String getVndrCntctSuffix() {
        return vndrCntctSuffix;
    }

    public void setVndrCntctSuffix(String vndrCntctSuffix) {
        this.vndrCntctSuffix = vndrCntctSuffix;
    }

    public String getVndrCntctEmail() {
        return vndrCntctEmail;
    }

    public void setVndrCntctEmail(String vndrCntctEmail) {
        this.vndrCntctEmail = vndrCntctEmail;
    }

    public String getVndrCntctPhNbr() {
        return vndrCntctPhNbr;
    }

    public void setVndrCntctPhNbr(String vndrCntctPhNbr) {
        this.vndrCntctPhNbr = vndrCntctPhNbr;
    }

    public String getTrms() {
        return trms;
    }

    public void setTrms(String trms) {
        this.trms = trms;
    }

    public String getCurrPmtMthd() {
        return currPmtMthd;
    }

    public void setCurrPmtMthd(String currPmtMthd) {
        this.currPmtMthd = currPmtMthd;
    }

    public String getVndrUsr() {
        return vndrUsr;
    }

    public void setVndrUsr(String vndrUsr) {
        this.vndrUsr = vndrUsr;
    }

    public int getTrnsCnt() {
        return trnsCnt;
    }

    public void setTrnsCnt(int trnsCnt) {
        this.trnsCnt = trnsCnt;
    }

    public String getRespCd() {
        return respCd;
    }

    public void setRespCd(String respCd) {
        this.respCd = respCd;
    }

    public String getRespMsg() {
        return respMsg;
    }

    public void setRespMsg(String respMsg) {
        this.respMsg = respMsg;
    }

    public String getRjctCd() {
        return rjctCd;
    }

    public void setRjctCd(String rjctCd) {
        this.rjctCd = rjctCd;
    }

    public String getRjctMsg() {
        return rjctMsg;
    }

    public void setRjctMsg(String rjctMsg) {
        this.rjctMsg = rjctMsg;
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

    public String getCrtUsr() {
        return crtUsr;
    }

    public void setCrtUsr(String crtUsr) {
        this.crtUsr = crtUsr;
    }

    public Date getCrtTs() {
        return crtTs;
    }

    public void setCrtTs(Date crtTs) {
        this.crtTs = crtTs;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (vndrRejectsId != null ? vndrRejectsId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof VendorRejects)) {
            return false;
        }
        VendorRejects other = (VendorRejects) object;
        if ((this.vndrRejectsId == null && other.vndrRejectsId != null) || (this.vndrRejectsId != null && !this.vndrRejectsId.equals(other.vndrRejectsId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.VendorRejects[ vndrRejectsId=" + vndrRejectsId + " ]";
    }
    
}
