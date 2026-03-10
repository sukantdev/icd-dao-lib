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
@Table(name = "CURR_DESC", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "CurrDesc.findAll", query = "SELECT c FROM CurrDesc c")})
public class CurrDesc implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CurrDescPK currDescPK;
    @Basic(optional = false)
    @Column(name = "CURR_DESC_TXT")
    private String currDescTxt;
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

    public CurrDesc() {
    }

    public CurrDesc(CurrDescPK currDescPK) {
        this.currDescPK = currDescPK;
    }

    public CurrDesc(CurrDescPK currDescPK, String currDescTxt, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.currDescPK = currDescPK;
        this.currDescTxt = currDescTxt;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public CurrDesc(short currDescIso, String currDescAlph) {
        this.currDescPK = new CurrDescPK(currDescIso, currDescAlph);
    }

    public CurrDescPK getCurrDescPK() {
        return currDescPK;
    }

    public void setCurrDescPK(CurrDescPK currDescPK) {
        this.currDescPK = currDescPK;
    }

    public String getCurrDescTxt() {
        return currDescTxt;
    }

    public void setCurrDescTxt(String currDescTxt) {
        this.currDescTxt = currDescTxt;
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
        hash += (currDescPK != null ? currDescPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CurrDesc)) {
            return false;
        }
        CurrDesc other = (CurrDesc) object;
        if ((this.currDescPK == null && other.currDescPK != null) || (this.currDescPK != null && !this.currDescPK.equals(other.currDescPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.CurrDesc[ currDescPK=" + currDescPK + " ]";
    }
    
}
