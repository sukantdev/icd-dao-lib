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
@Table(name = "VP_MATCH", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "VpMatch.findAll", query = "SELECT v FROM VpMatch v")})
public class VpMatch implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "MAST_ID")
    private String mastId;
    @Basic(optional = false)
    @Column(name = "E_CUST_MAST_ID")
    private String eCustMastId;
    @Basic(optional = false)
    @Column(name = "M_CUST_MAST_ID")
    private String mCustMastId;
    @Basic(optional = false)
    @Column(name = "E_CV_MAST_ID")
    private String eCvMastId;
    @Basic(optional = false)
    @Column(name = "M_CV_MAST_ID")
    private String mCvMastId;
    @Basic(optional = false)
    @Column(name = "E_VEND_MAST_ID")
    private String eVendMastId;
    @Basic(optional = false)
    @Column(name = "M_VEND_MAST_ID")
    private String mVendMastId;
    @Basic(optional = false)
    @Column(name = "PP_VEND_NM")
    private short ppVendNm;
    @Basic(optional = false)
    @Column(name = "PP_REMIT_EMAIL")
    private short ppRemitEmail;
    @Basic(optional = false)
    @Column(name = "PP_TAX_ID")
    private short ppTaxId;
    @Basic(optional = false)
    @Column(name = "PP_P_ZIP")
    private short ppPZip;
    @Basic(optional = false)
    @Column(name = "PP_PHONE")
    private short ppPhone;
    @Basic(optional = false)
    @Column(name = "PP_DB_NUM")
    private short ppDbNum;
    @Basic(optional = false)
    @Column(name = "MATCHED_CD")
    private Character matchedCd;
    @Basic(optional = false)
    @Column(name = "E_CONTACT_MAST_ID")
    private String eContactMastId;
    @Basic(optional = false)
    @Column(name = "M_CONTACT_MAST_ID")
    private String mContactMastId;
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
    @Basic(optional = false)
    @Column(name = "PP_TOTAL")
    private int ppTotal;
    @Basic(optional = false)
    @Column(name = "ACTN_RQD_TYP_CD")
    private String actnRqdTypCd;

    public VpMatch() {
    }

    public VpMatch(String mastId) {
        this.mastId = mastId;
    }

    public VpMatch(String mastId, String eCustMastId, String mCustMastId, String eCvMastId, String mCvMastId, String eVendMastId, String mVendMastId, short ppVendNm, short ppRemitEmail, short ppTaxId, short ppPZip, short ppPhone, short ppDbNum, Character matchedCd, String eContactMastId, String mContactMastId, String mdyUsr, Date mdyTs, String crtUsr, Date crtTs, int ppTotal, String actnRqdTypCd) {
        this.mastId = mastId;
        this.eCustMastId = eCustMastId;
        this.mCustMastId = mCustMastId;
        this.eCvMastId = eCvMastId;
        this.mCvMastId = mCvMastId;
        this.eVendMastId = eVendMastId;
        this.mVendMastId = mVendMastId;
        this.ppVendNm = ppVendNm;
        this.ppRemitEmail = ppRemitEmail;
        this.ppTaxId = ppTaxId;
        this.ppPZip = ppPZip;
        this.ppPhone = ppPhone;
        this.ppDbNum = ppDbNum;
        this.matchedCd = matchedCd;
        this.eContactMastId = eContactMastId;
        this.mContactMastId = mContactMastId;
        this.mdyUsr = mdyUsr;
        this.mdyTs = mdyTs;
        this.crtUsr = crtUsr;
        this.crtTs = crtTs;
        this.ppTotal = ppTotal;
        this.actnRqdTypCd = actnRqdTypCd;
    }

    public String getMastId() {
        return mastId;
    }

    public void setMastId(String mastId) {
        this.mastId = mastId;
    }

    public String getECustMastId() {
        return eCustMastId;
    }

    public void setECustMastId(String eCustMastId) {
        this.eCustMastId = eCustMastId;
    }

    public String getMCustMastId() {
        return mCustMastId;
    }

    public void setMCustMastId(String mCustMastId) {
        this.mCustMastId = mCustMastId;
    }

    public String getECvMastId() {
        return eCvMastId;
    }

    public void setECvMastId(String eCvMastId) {
        this.eCvMastId = eCvMastId;
    }

    public String getMCvMastId() {
        return mCvMastId;
    }

    public void setMCvMastId(String mCvMastId) {
        this.mCvMastId = mCvMastId;
    }

    public String getEVendMastId() {
        return eVendMastId;
    }

    public void setEVendMastId(String eVendMastId) {
        this.eVendMastId = eVendMastId;
    }

    public String getMVendMastId() {
        return mVendMastId;
    }

    public void setMVendMastId(String mVendMastId) {
        this.mVendMastId = mVendMastId;
    }

    public short getPpVendNm() {
        return ppVendNm;
    }

    public void setPpVendNm(short ppVendNm) {
        this.ppVendNm = ppVendNm;
    }

    public short getPpRemitEmail() {
        return ppRemitEmail;
    }

    public void setPpRemitEmail(short ppRemitEmail) {
        this.ppRemitEmail = ppRemitEmail;
    }

    public short getPpTaxId() {
        return ppTaxId;
    }

    public void setPpTaxId(short ppTaxId) {
        this.ppTaxId = ppTaxId;
    }

    public short getPpPZip() {
        return ppPZip;
    }

    public void setPpPZip(short ppPZip) {
        this.ppPZip = ppPZip;
    }

    public short getPpPhone() {
        return ppPhone;
    }

    public void setPpPhone(short ppPhone) {
        this.ppPhone = ppPhone;
    }

    public short getPpDbNum() {
        return ppDbNum;
    }

    public void setPpDbNum(short ppDbNum) {
        this.ppDbNum = ppDbNum;
    }

    public Character getMatchedCd() {
        return matchedCd;
    }

    public void setMatchedCd(Character matchedCd) {
        this.matchedCd = matchedCd;
    }

    public String getEContactMastId() {
        return eContactMastId;
    }

    public void setEContactMastId(String eContactMastId) {
        this.eContactMastId = eContactMastId;
    }

    public String getMContactMastId() {
        return mContactMastId;
    }

    public void setMContactMastId(String mContactMastId) {
        this.mContactMastId = mContactMastId;
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

    public int getPpTotal() {
        return ppTotal;
    }

    public void setPpTotal(int ppTotal) {
        this.ppTotal = ppTotal;
    }

    public String getActnRqdTypCd() {
        return actnRqdTypCd;
    }

    public void setActnRqdTypCd(String actnRqdTypCd) {
        this.actnRqdTypCd = actnRqdTypCd;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mastId != null ? mastId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof VpMatch)) {
            return false;
        }
        VpMatch other = (VpMatch) object;
        if ((this.mastId == null && other.mastId != null) || (this.mastId != null && !this.mastId.equals(other.mastId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.VpMatch[ mastId=" + mastId + " ]";
    }
    
}
