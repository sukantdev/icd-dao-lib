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
@Table(name = "CUST_CM_PREFS", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "CustCmPrefs.findAll", query = "SELECT c FROM CustCmPrefs c")})
public class CustCmPrefs implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CUST_ID")
    private String custId;
    @Basic(optional = false)
    @Column(name = "UDF_LBL_1")
    private String udfLbl1;
    @Basic(optional = false)
    @Column(name = "UDF_LBL_2")
    private String udfLbl2;
    @Basic(optional = false)
    @Column(name = "UDF_LBL_3")
    private String udfLbl3;
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

    public CustCmPrefs() {
    }

    public CustCmPrefs(String custId) {
        this.custId = custId;
    }

    public CustCmPrefs(String custId, String udfLbl1, String udfLbl2, String udfLbl3, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.custId = custId;
        this.udfLbl1 = udfLbl1;
        this.udfLbl2 = udfLbl2;
        this.udfLbl3 = udfLbl3;
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

    public String getUdfLbl1() {
        return udfLbl1;
    }

    public void setUdfLbl1(String udfLbl1) {
        this.udfLbl1 = udfLbl1;
    }

    public String getUdfLbl2() {
        return udfLbl2;
    }

    public void setUdfLbl2(String udfLbl2) {
        this.udfLbl2 = udfLbl2;
    }

    public String getUdfLbl3() {
        return udfLbl3;
    }

    public void setUdfLbl3(String udfLbl3) {
        this.udfLbl3 = udfLbl3;
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
        if (!(object instanceof CustCmPrefs)) {
            return false;
        }
        CustCmPrefs other = (CustCmPrefs) object;
        if ((this.custId == null && other.custId != null) || (this.custId != null && !this.custId.equals(other.custId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.CustCmPrefs[ custId=" + custId + " ]";
    }
    
}
