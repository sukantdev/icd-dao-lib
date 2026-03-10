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
@Table(name = "FN_2IN1_CUST_XREF", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "Fn2in1CustXref.findAll", query = "SELECT f FROM Fn2in1CustXref f")})
public class Fn2in1CustXref implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CUST_ID")
    private String custId;
    @Basic(optional = false)
    @Column(name = "FN_CUST_NBR")
    private long fnCustNbr;
    @Basic(optional = false)
    @Column(name = "FN_PROFILE_ID")
    private long fnProfileId;
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

    public Fn2in1CustXref() {
    }

    public Fn2in1CustXref(String custId) {
        this.custId = custId;
    }

    public Fn2in1CustXref(String custId, long fnCustNbr, long fnProfileId, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.custId = custId;
        this.fnCustNbr = fnCustNbr;
        this.fnProfileId = fnProfileId;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId;
    }

    public long getFnCustNbr() {
        return fnCustNbr;
    }

    public void setFnCustNbr(long fnCustNbr) {
        this.fnCustNbr = fnCustNbr;
    }

    public long getFnProfileId() {
        return fnProfileId;
    }

    public void setFnProfileId(long fnProfileId) {
        this.fnProfileId = fnProfileId;
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
        hash += (custId != null ? custId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Fn2in1CustXref)) {
            return false;
        }
        Fn2in1CustXref other = (Fn2in1CustXref) object;
        if ((this.custId == null && other.custId != null) || (this.custId != null && !this.custId.equals(other.custId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.Fn2in1CustXref[ custId=" + custId + " ]";
    }
    
}
