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
@Table(name = "INV_MOBIL_FL", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "InvMobilFl.findAll", query = "SELECT i FROM InvMobilFl i")})
public class InvMobilFl implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected InvMobilFlPK invMobilFlPK;
    @Basic(optional = false)
    @Column(name = "CUST_NM")
    private String custNm;
    @Basic(optional = false)
    @Column(name = "CUST_ACCT_NBR")
    private String custAcctNbr;
    @Basic(optional = false)
    @Column(name = "FLNG_LOC_NM")
    private String flngLocNm;
    @Basic(optional = false)
    @Column(name = "FLNG_LOC_CITY")
    private String flngLocCity;
    @Basic(optional = false)
    @Column(name = "FLNG_LOC_ST")
    private String flngLocSt;
    @Basic(optional = false)
    @Column(name = "FLNG_LOC_ZIP")
    private String flngLocZip;
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

    public InvMobilFl() {
    }

    public InvMobilFl(InvMobilFlPK invMobilFlPK) {
        this.invMobilFlPK = invMobilFlPK;
    }

    public InvMobilFl(InvMobilFlPK invMobilFlPK, String custNm, String custAcctNbr, String flngLocNm, String flngLocCity, String flngLocSt, String flngLocZip, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.invMobilFlPK = invMobilFlPK;
        this.custNm = custNm;
        this.custAcctNbr = custAcctNbr;
        this.flngLocNm = flngLocNm;
        this.flngLocCity = flngLocCity;
        this.flngLocSt = flngLocSt;
        this.flngLocZip = flngLocZip;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public InvMobilFl(Date mobilFlTs, short mobilSeqNbr) {
        this.invMobilFlPK = new InvMobilFlPK(mobilFlTs, mobilSeqNbr);
    }

    public InvMobilFlPK getInvMobilFlPK() {
        return invMobilFlPK;
    }

    public void setInvMobilFlPK(InvMobilFlPK invMobilFlPK) {
        this.invMobilFlPK = invMobilFlPK;
    }

    public String getCustNm() {
        return custNm;
    }

    public void setCustNm(String custNm) {
        this.custNm = custNm;
    }

    public String getCustAcctNbr() {
        return custAcctNbr;
    }

    public void setCustAcctNbr(String custAcctNbr) {
        this.custAcctNbr = custAcctNbr;
    }

    public String getFlngLocNm() {
        return flngLocNm;
    }

    public void setFlngLocNm(String flngLocNm) {
        this.flngLocNm = flngLocNm;
    }

    public String getFlngLocCity() {
        return flngLocCity;
    }

    public void setFlngLocCity(String flngLocCity) {
        this.flngLocCity = flngLocCity;
    }

    public String getFlngLocSt() {
        return flngLocSt;
    }

    public void setFlngLocSt(String flngLocSt) {
        this.flngLocSt = flngLocSt;
    }

    public String getFlngLocZip() {
        return flngLocZip;
    }

    public void setFlngLocZip(String flngLocZip) {
        this.flngLocZip = flngLocZip;
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
        hash += (invMobilFlPK != null ? invMobilFlPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InvMobilFl)) {
            return false;
        }
        InvMobilFl other = (InvMobilFl) object;
        if ((this.invMobilFlPK == null && other.invMobilFlPK != null) || (this.invMobilFlPK != null && !this.invMobilFlPK.equals(other.invMobilFlPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.InvMobilFl[ invMobilFlPK=" + invMobilFlPK + " ]";
    }
    
}
