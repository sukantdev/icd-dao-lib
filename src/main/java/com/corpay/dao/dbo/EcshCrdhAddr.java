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
@Table(name = "ECSH_CRDH_ADDR", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "EcshCrdhAddr.findAll", query = "SELECT e FROM EcshCrdhAddr e")})
public class EcshCrdhAddr implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ECSH_CRD_NBR")
    private String ecshCrdNbr;
    @Basic(optional = false)
    @Column(name = "ECSH_EMP_NBR")
    private String ecshEmpNbr;
    @Basic(optional = false)
    @Column(name = "ECSH_CUST_ID")
    private String ecshCustId;
    @Basic(optional = false)
    @Column(name = "ADDR_LINE1")
    private String addrLine1;
    @Basic(optional = false)
    @Column(name = "ADDR_LINE2")
    private String addrLine2;
    @Basic(optional = false)
    @Column(name = "ADDR_LINE3")
    private String addrLine3;
    @Basic(optional = false)
    @Column(name = "CTY")
    private String cty;
    @Basic(optional = false)
    @Column(name = "ST")
    private String st;
    @Basic(optional = false)
    @Column(name = "CRTY_CD")
    private String crtyCd;
    @Basic(optional = false)
    @Column(name = "ZIP")
    private String zip;
    @Basic(optional = false)
    @Column(name = "PH_NBR")
    private String phNbr;
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

    public EcshCrdhAddr() {
    }

    public EcshCrdhAddr(String ecshCrdNbr) {
        this.ecshCrdNbr = ecshCrdNbr;
    }

    public EcshCrdhAddr(String ecshCrdNbr, String ecshEmpNbr, String ecshCustId, String addrLine1, String addrLine2, String addrLine3, String cty, String st, String crtyCd, String zip, String phNbr, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.ecshCrdNbr = ecshCrdNbr;
        this.ecshEmpNbr = ecshEmpNbr;
        this.ecshCustId = ecshCustId;
        this.addrLine1 = addrLine1;
        this.addrLine2 = addrLine2;
        this.addrLine3 = addrLine3;
        this.cty = cty;
        this.st = st;
        this.crtyCd = crtyCd;
        this.zip = zip;
        this.phNbr = phNbr;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public String getEcshCrdNbr() {
        return ecshCrdNbr;
    }

    public void setEcshCrdNbr(String ecshCrdNbr) {
        this.ecshCrdNbr = ecshCrdNbr;
    }

    public String getEcshEmpNbr() {
        return ecshEmpNbr;
    }

    public void setEcshEmpNbr(String ecshEmpNbr) {
        this.ecshEmpNbr = ecshEmpNbr;
    }

    public String getEcshCustId() {
        return ecshCustId;
    }

    public void setEcshCustId(String ecshCustId) {
        this.ecshCustId = ecshCustId;
    }

    public String getAddrLine1() {
        return addrLine1;
    }

    public void setAddrLine1(String addrLine1) {
        this.addrLine1 = addrLine1;
    }

    public String getAddrLine2() {
        return addrLine2;
    }

    public void setAddrLine2(String addrLine2) {
        this.addrLine2 = addrLine2;
    }

    public String getAddrLine3() {
        return addrLine3;
    }

    public void setAddrLine3(String addrLine3) {
        this.addrLine3 = addrLine3;
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

    public String getCrtyCd() {
        return crtyCd;
    }

    public void setCrtyCd(String crtyCd) {
        this.crtyCd = crtyCd;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getPhNbr() {
        return phNbr;
    }

    public void setPhNbr(String phNbr) {
        this.phNbr = phNbr;
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
        hash += (ecshCrdNbr != null ? ecshCrdNbr.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EcshCrdhAddr)) {
            return false;
        }
        EcshCrdhAddr other = (EcshCrdhAddr) object;
        if ((this.ecshCrdNbr == null && other.ecshCrdNbr != null) || (this.ecshCrdNbr != null && !this.ecshCrdNbr.equals(other.ecshCrdNbr))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.EcshCrdhAddr[ ecshCrdNbr=" + ecshCrdNbr + " ]";
    }
    
}
