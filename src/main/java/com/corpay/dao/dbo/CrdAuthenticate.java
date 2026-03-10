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
@Table(name = "CRD_AUTHENTICATE", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "CrdAuthenticate.findAll", query = "SELECT c FROM CrdAuthenticate c")})
public class CrdAuthenticate implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CRD_NBR")
    private String crdNbr;
    @Basic(optional = false)
    @Column(name = "DOB")
    private short dob;
    @Basic(optional = false)
    @Column(name = "SSN4")
    private short ssn4;
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
    @Column(name = "CRD_HLDR_DOB")
    private String crdHldrDob;
    @Basic(optional = false)
    @Column(name = "CRD_HLDR_TAX_ID_TY")
    private Character crdHldrTaxIdTy;
    @Basic(optional = false)
    @Column(name = "CRD_HLDR_TAX_ID")
    private String crdHldrTaxId;
    @Basic(optional = false)
    @Column(name = "CDHLDR_ADDRESS1")
    private String cdhldrAddress1;
    @Basic(optional = false)
    @Column(name = "CDHLDR_ADDRESS2")
    private String cdhldrAddress2;
    @Basic(optional = false)
    @Column(name = "CDHLDR_CITY")
    private String cdhldrCity;
    @Basic(optional = false)
    @Column(name = "CDHLDR_STATE")
    private String cdhldrState;
    @Basic(optional = false)
    @Column(name = "CDHLDR_ZIP")
    private String cdhldrZip;
    @Basic(optional = false)
    @Column(name = "BUS_IND_CD")
    private Character busIndCd;
    @Basic(optional = false)
    @Column(name = "BUS_NM")
    private String busNm;
    @Basic(optional = false)
    @Column(name = "PRIMARY_WRK_LOC_ST")
    private String primaryWrkLocSt;

    public CrdAuthenticate() {
    }

    public CrdAuthenticate(String crdNbr) {
        this.crdNbr = crdNbr;
    }

    public CrdAuthenticate(String crdNbr, short dob, short ssn4, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr, String crdHldrDob, Character crdHldrTaxIdTy, String crdHldrTaxId, String cdhldrAddress1, String cdhldrAddress2, String cdhldrCity, String cdhldrState, String cdhldrZip, Character busIndCd, String busNm, String primaryWrkLocSt) {
        this.crdNbr = crdNbr;
        this.dob = dob;
        this.ssn4 = ssn4;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
        this.crdHldrDob = crdHldrDob;
        this.crdHldrTaxIdTy = crdHldrTaxIdTy;
        this.crdHldrTaxId = crdHldrTaxId;
        this.cdhldrAddress1 = cdhldrAddress1;
        this.cdhldrAddress2 = cdhldrAddress2;
        this.cdhldrCity = cdhldrCity;
        this.cdhldrState = cdhldrState;
        this.cdhldrZip = cdhldrZip;
        this.busIndCd = busIndCd;
        this.busNm = busNm;
        this.primaryWrkLocSt = primaryWrkLocSt;
    }

    public String getCrdNbr() {
        return crdNbr;
    }

    public void setCrdNbr(String crdNbr) {
        this.crdNbr = crdNbr;
    }

    public short getDob() {
        return dob;
    }

    public void setDob(short dob) {
        this.dob = dob;
    }

    public short getSsn4() {
        return ssn4;
    }

    public void setSsn4(short ssn4) {
        this.ssn4 = ssn4;
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

    public String getCrdHldrDob() {
        return crdHldrDob;
    }

    public void setCrdHldrDob(String crdHldrDob) {
        this.crdHldrDob = crdHldrDob;
    }

    public Character getCrdHldrTaxIdTy() {
        return crdHldrTaxIdTy;
    }

    public void setCrdHldrTaxIdTy(Character crdHldrTaxIdTy) {
        this.crdHldrTaxIdTy = crdHldrTaxIdTy;
    }

    public String getCrdHldrTaxId() {
        return crdHldrTaxId;
    }

    public void setCrdHldrTaxId(String crdHldrTaxId) {
        this.crdHldrTaxId = crdHldrTaxId;
    }

    public String getCdhldrAddress1() {
        return cdhldrAddress1;
    }

    public void setCdhldrAddress1(String cdhldrAddress1) {
        this.cdhldrAddress1 = cdhldrAddress1;
    }

    public String getCdhldrAddress2() {
        return cdhldrAddress2;
    }

    public void setCdhldrAddress2(String cdhldrAddress2) {
        this.cdhldrAddress2 = cdhldrAddress2;
    }

    public String getCdhldrCity() {
        return cdhldrCity;
    }

    public void setCdhldrCity(String cdhldrCity) {
        this.cdhldrCity = cdhldrCity;
    }

    public String getCdhldrState() {
        return cdhldrState;
    }

    public void setCdhldrState(String cdhldrState) {
        this.cdhldrState = cdhldrState;
    }

    public String getCdhldrZip() {
        return cdhldrZip;
    }

    public void setCdhldrZip(String cdhldrZip) {
        this.cdhldrZip = cdhldrZip;
    }

    public Character getBusIndCd() {
        return busIndCd;
    }

    public void setBusIndCd(Character busIndCd) {
        this.busIndCd = busIndCd;
    }

    public String getBusNm() {
        return busNm;
    }

    public void setBusNm(String busNm) {
        this.busNm = busNm;
    }

    public String getPrimaryWrkLocSt() {
        return primaryWrkLocSt;
    }

    public void setPrimaryWrkLocSt(String primaryWrkLocSt) {
        this.primaryWrkLocSt = primaryWrkLocSt;
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
        if (!(object instanceof CrdAuthenticate)) {
            return false;
        }
        CrdAuthenticate other = (CrdAuthenticate) object;
        if ((this.crdNbr == null && other.crdNbr != null) || (this.crdNbr != null && !this.crdNbr.equals(other.crdNbr))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.CrdAuthenticate[ crdNbr=" + crdNbr + " ]";
    }
    
}
