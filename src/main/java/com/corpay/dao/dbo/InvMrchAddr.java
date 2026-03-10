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
@Table(name = "INV_MRCH_ADDR", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "InvMrchAddr.findAll", query = "SELECT i FROM InvMrchAddr i")})
public class InvMrchAddr implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected InvMrchAddrPK invMrchAddrPK;
    @Basic(optional = false)
    @Column(name = "MRCH_NM")
    private String mrchNm;
    @Basic(optional = false)
    @Column(name = "MRCH_ADDR_1")
    private String mrchAddr1;
    @Basic(optional = false)
    @Column(name = "MRCH_ADDR_2")
    private String mrchAddr2;
    @Basic(optional = false)
    @Column(name = "MRCH_CITY")
    private String mrchCity;
    @Basic(optional = false)
    @Column(name = "MRCH_POST_CD")
    private String mrchPostCd;
    @Basic(optional = false)
    @Column(name = "MRCH_ST")
    private String mrchSt;
    @Basic(optional = false)
    @Column(name = "MRCH_CRTY_CD")
    private String mrchCrtyCd;
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

    public InvMrchAddr() {
    }

    public InvMrchAddr(InvMrchAddrPK invMrchAddrPK) {
        this.invMrchAddrPK = invMrchAddrPK;
    }

    public InvMrchAddr(InvMrchAddrPK invMrchAddrPK, String mrchNm, String mrchAddr1, String mrchAddr2, String mrchCity, String mrchPostCd, String mrchSt, String mrchCrtyCd, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.invMrchAddrPK = invMrchAddrPK;
        this.mrchNm = mrchNm;
        this.mrchAddr1 = mrchAddr1;
        this.mrchAddr2 = mrchAddr2;
        this.mrchCity = mrchCity;
        this.mrchPostCd = mrchPostCd;
        this.mrchSt = mrchSt;
        this.mrchCrtyCd = mrchCrtyCd;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public InvMrchAddr(Date mrchAddrTs, short mrchAddrSeqNbr) {
        this.invMrchAddrPK = new InvMrchAddrPK(mrchAddrTs, mrchAddrSeqNbr);
    }

    public InvMrchAddrPK getInvMrchAddrPK() {
        return invMrchAddrPK;
    }

    public void setInvMrchAddrPK(InvMrchAddrPK invMrchAddrPK) {
        this.invMrchAddrPK = invMrchAddrPK;
    }

    public String getMrchNm() {
        return mrchNm;
    }

    public void setMrchNm(String mrchNm) {
        this.mrchNm = mrchNm;
    }

    public String getMrchAddr1() {
        return mrchAddr1;
    }

    public void setMrchAddr1(String mrchAddr1) {
        this.mrchAddr1 = mrchAddr1;
    }

    public String getMrchAddr2() {
        return mrchAddr2;
    }

    public void setMrchAddr2(String mrchAddr2) {
        this.mrchAddr2 = mrchAddr2;
    }

    public String getMrchCity() {
        return mrchCity;
    }

    public void setMrchCity(String mrchCity) {
        this.mrchCity = mrchCity;
    }

    public String getMrchPostCd() {
        return mrchPostCd;
    }

    public void setMrchPostCd(String mrchPostCd) {
        this.mrchPostCd = mrchPostCd;
    }

    public String getMrchSt() {
        return mrchSt;
    }

    public void setMrchSt(String mrchSt) {
        this.mrchSt = mrchSt;
    }

    public String getMrchCrtyCd() {
        return mrchCrtyCd;
    }

    public void setMrchCrtyCd(String mrchCrtyCd) {
        this.mrchCrtyCd = mrchCrtyCd;
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
        hash += (invMrchAddrPK != null ? invMrchAddrPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InvMrchAddr)) {
            return false;
        }
        InvMrchAddr other = (InvMrchAddr) object;
        if ((this.invMrchAddrPK == null && other.invMrchAddrPK != null) || (this.invMrchAddrPK != null && !this.invMrchAddrPK.equals(other.invMrchAddrPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.InvMrchAddr[ invMrchAddrPK=" + invMrchAddrPK + " ]";
    }
    
}
