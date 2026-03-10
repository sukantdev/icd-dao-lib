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
@Table(name = "AVN_MRCH_ADDR", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "AvnMrchAddr.findAll", query = "SELECT a FROM AvnMrchAddr a")})
public class AvnMrchAddr implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "MRCH_CD")
    private String mrchCd;
    @Basic(optional = false)
    @Column(name = "ADDR_CD")
    private String addrCd;
    @Basic(optional = false)
    @Column(name = "ADDR_NM")
    private String addrNm;
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
    @Column(name = "CRTY_CD")
    private String crtyCd;
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

    public AvnMrchAddr() {
    }

    public AvnMrchAddr(String mrchCd) {
        this.mrchCd = mrchCd;
    }

    public AvnMrchAddr(String mrchCd, String addrCd, String addrNm, String cty, String st, String zip, String crtyCd, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.mrchCd = mrchCd;
        this.addrCd = addrCd;
        this.addrNm = addrNm;
        this.cty = cty;
        this.st = st;
        this.zip = zip;
        this.crtyCd = crtyCd;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public String getMrchCd() {
        return mrchCd;
    }

    public void setMrchCd(String mrchCd) {
        this.mrchCd = mrchCd;
    }

    public String getAddrCd() {
        return addrCd;
    }

    public void setAddrCd(String addrCd) {
        this.addrCd = addrCd;
    }

    public String getAddrNm() {
        return addrNm;
    }

    public void setAddrNm(String addrNm) {
        this.addrNm = addrNm;
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

    public String getCrtyCd() {
        return crtyCd;
    }

    public void setCrtyCd(String crtyCd) {
        this.crtyCd = crtyCd;
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
        hash += (mrchCd != null ? mrchCd.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AvnMrchAddr)) {
            return false;
        }
        AvnMrchAddr other = (AvnMrchAddr) object;
        if ((this.mrchCd == null && other.mrchCd != null) || (this.mrchCd != null && !this.mrchCd.equals(other.mrchCd))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.AvnMrchAddr[ mrchCd=" + mrchCd + " ]";
    }
    
}
