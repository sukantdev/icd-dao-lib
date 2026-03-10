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
@Table(name = "USR_NTFCTN_TYP_XREF", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "UsrNtfctnTypXref.findAll", query = "SELECT u FROM UsrNtfctnTypXref u")})
public class UsrNtfctnTypXref implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "USR_ID")
    private String usrId;
    @Basic(optional = false)
    @Column(name = "OW_NTFCTN_TYP_CD")
    private String owNtfctnTypCd;
    @Basic(optional = false)
    @Column(name = "TYP_CD")
    private Character typCd;
    @Basic(optional = false)
    @Column(name = "THRSHLD_TXT")
    private String thrshldTxt;
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

    public UsrNtfctnTypXref() {
    }

    public UsrNtfctnTypXref(String usrId) {
        this.usrId = usrId;
    }

    public UsrNtfctnTypXref(String usrId, String owNtfctnTypCd, Character typCd, String thrshldTxt, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.usrId = usrId;
        this.owNtfctnTypCd = owNtfctnTypCd;
        this.typCd = typCd;
        this.thrshldTxt = thrshldTxt;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public String getUsrId() {
        return usrId;
    }

    public void setUsrId(String usrId) {
        this.usrId = usrId;
    }

    public String getOwNtfctnTypCd() {
        return owNtfctnTypCd;
    }

    public void setOwNtfctnTypCd(String owNtfctnTypCd) {
        this.owNtfctnTypCd = owNtfctnTypCd;
    }

    public Character getTypCd() {
        return typCd;
    }

    public void setTypCd(Character typCd) {
        this.typCd = typCd;
    }

    public String getThrshldTxt() {
        return thrshldTxt;
    }

    public void setThrshldTxt(String thrshldTxt) {
        this.thrshldTxt = thrshldTxt;
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
        hash += (usrId != null ? usrId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UsrNtfctnTypXref)) {
            return false;
        }
        UsrNtfctnTypXref other = (UsrNtfctnTypXref) object;
        if ((this.usrId == null && other.usrId != null) || (this.usrId != null && !this.usrId.equals(other.usrId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.UsrNtfctnTypXref[ usrId=" + usrId + " ]";
    }
    
}
