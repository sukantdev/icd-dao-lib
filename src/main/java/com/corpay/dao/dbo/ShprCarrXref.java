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
@Table(name = "SHPR_CARR_XREF", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "ShprCarrXref.findAll", query = "SELECT s FROM ShprCarrXref s")})
public class ShprCarrXref implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ShprCarrXrefPK shprCarrXrefPK;
    @Basic(optional = false)
    @Column(name = "ACCT_NBR")
    private String acctNbr;
    @Basic(optional = false)
    @Column(name = "CUST_ID")
    private String custId;
    @Basic(optional = false)
    @Column(name = "CRD_NBR")
    private String crdNbr;
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

    public ShprCarrXref() {
    }

    public ShprCarrXref(ShprCarrXrefPK shprCarrXrefPK) {
        this.shprCarrXrefPK = shprCarrXrefPK;
    }

    public ShprCarrXref(ShprCarrXrefPK shprCarrXrefPK, String acctNbr, String custId, String crdNbr, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.shprCarrXrefPK = shprCarrXrefPK;
        this.acctNbr = acctNbr;
        this.custId = custId;
        this.crdNbr = crdNbr;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public ShprCarrXref(Character typCd, String srvPrvdrAcctAbbrev, String svrAcctNbr) {
        this.shprCarrXrefPK = new ShprCarrXrefPK(typCd, srvPrvdrAcctAbbrev, svrAcctNbr);
    }

    public ShprCarrXrefPK getShprCarrXrefPK() {
        return shprCarrXrefPK;
    }

    public void setShprCarrXrefPK(ShprCarrXrefPK shprCarrXrefPK) {
        this.shprCarrXrefPK = shprCarrXrefPK;
    }

    public String getAcctNbr() {
        return acctNbr;
    }

    public void setAcctNbr(String acctNbr) {
        this.acctNbr = acctNbr;
    }

    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId;
    }

    public String getCrdNbr() {
        return crdNbr;
    }

    public void setCrdNbr(String crdNbr) {
        this.crdNbr = crdNbr;
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
        hash += (shprCarrXrefPK != null ? shprCarrXrefPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ShprCarrXref)) {
            return false;
        }
        ShprCarrXref other = (ShprCarrXref) object;
        if ((this.shprCarrXrefPK == null && other.shprCarrXrefPK != null) || (this.shprCarrXrefPK != null && !this.shprCarrXrefPK.equals(other.shprCarrXrefPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.ShprCarrXref[ shprCarrXrefPK=" + shprCarrXrefPK + " ]";
    }
    
}
