/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.corpay.dao.cxxcow;

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
@Table(name = "THRD_PAC_TXN_XREF", catalog = "", schema = "CXXCOW")
@NamedQueries({
    @NamedQuery(name = "ThrdPacTxnXref.findAll", query = "SELECT t FROM ThrdPacTxnXref t"),
    @NamedQuery(name = "ThrdPacTxnXref.findByAuthPan", query = "SELECT t FROM ThrdPacTxnXref t WHERE t.thrdPacTxnXrefPK.authPan = :authPan"),
    @NamedQuery(name = "ThrdPacTxnXref.findByAuthUtDt", query = "SELECT t FROM ThrdPacTxnXref t WHERE t.thrdPacTxnXrefPK.authUtDt = :authUtDt"),
    @NamedQuery(name = "ThrdPacTxnXref.findByAuthApprovCd", query = "SELECT t FROM ThrdPacTxnXref t WHERE t.thrdPacTxnXrefPK.authApprovCd = :authApprovCd"),
    @NamedQuery(name = "ThrdPacTxnXref.findByAuthLocalTs", query = "SELECT t FROM ThrdPacTxnXref t WHERE t.thrdPacTxnXrefPK.authLocalTs = :authLocalTs"),
    @NamedQuery(name = "ThrdPacTxnXref.findByThrdPacId", query = "SELECT t FROM ThrdPacTxnXref t WHERE t.thrdPacId = :thrdPacId"),
    @NamedQuery(name = "ThrdPacTxnXref.findByThrdPacXrefNbr", query = "SELECT t FROM ThrdPacTxnXref t WHERE t.thrdPacXrefNbr = :thrdPacXrefNbr"),
    @NamedQuery(name = "ThrdPacTxnXref.findByCrtTs", query = "SELECT t FROM ThrdPacTxnXref t WHERE t.crtTs = :crtTs"),
    @NamedQuery(name = "ThrdPacTxnXref.findByCrtUsr", query = "SELECT t FROM ThrdPacTxnXref t WHERE t.crtUsr = :crtUsr"),
    @NamedQuery(name = "ThrdPacTxnXref.findByMdyTs", query = "SELECT t FROM ThrdPacTxnXref t WHERE t.mdyTs = :mdyTs"),
    @NamedQuery(name = "ThrdPacTxnXref.findByMdyUsr", query = "SELECT t FROM ThrdPacTxnXref t WHERE t.mdyUsr = :mdyUsr")})
public class ThrdPacTxnXref implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ThrdPacTxnXrefPK thrdPacTxnXrefPK;
    @Basic(optional = false)
    @Column(name = "THRD_PAC_ID")
    private String thrdPacId;
    @Basic(optional = false)
    @Column(name = "THRD_PAC_XREF_NBR")
    private String thrdPacXrefNbr;
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

    public ThrdPacTxnXref() {
    }

    public ThrdPacTxnXref(ThrdPacTxnXrefPK thrdPacTxnXrefPK) {
        this.thrdPacTxnXrefPK = thrdPacTxnXrefPK;
    }

    public ThrdPacTxnXref(ThrdPacTxnXrefPK thrdPacTxnXrefPK, String thrdPacId, String thrdPacXrefNbr, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.thrdPacTxnXrefPK = thrdPacTxnXrefPK;
        this.thrdPacId = thrdPacId;
        this.thrdPacXrefNbr = thrdPacXrefNbr;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public ThrdPacTxnXref(String authPan, Date authUtDt, int authApprovCd, Date authLocalTs) {
        this.thrdPacTxnXrefPK = new ThrdPacTxnXrefPK(authPan, authUtDt, authApprovCd, authLocalTs);
    }

    public ThrdPacTxnXrefPK getThrdPacTxnXrefPK() {
        return thrdPacTxnXrefPK;
    }

    public void setThrdPacTxnXrefPK(ThrdPacTxnXrefPK thrdPacTxnXrefPK) {
        this.thrdPacTxnXrefPK = thrdPacTxnXrefPK;
    }

    public String getThrdPacId() {
        return thrdPacId;
    }

    public void setThrdPacId(String thrdPacId) {
        this.thrdPacId = thrdPacId;
    }

    public String getThrdPacXrefNbr() {
        return thrdPacXrefNbr;
    }

    public void setThrdPacXrefNbr(String thrdPacXrefNbr) {
        this.thrdPacXrefNbr = thrdPacXrefNbr;
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
        hash += (thrdPacTxnXrefPK != null ? thrdPacTxnXrefPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ThrdPacTxnXref)) {
            return false;
        }
        ThrdPacTxnXref other = (ThrdPacTxnXref) object;
        if ((this.thrdPacTxnXrefPK == null && other.thrdPacTxnXrefPK != null) || (this.thrdPacTxnXrefPK != null && !this.thrdPacTxnXrefPK.equals(other.thrdPacTxnXrefPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.cxxcow.ThrdPacTxnXref[ thrdPacTxnXrefPK=" + thrdPacTxnXrefPK + " ]";
    }
    
}
