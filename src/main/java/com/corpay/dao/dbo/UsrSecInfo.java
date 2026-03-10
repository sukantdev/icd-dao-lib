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
@Table(name = "USR_SEC_INFO", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "UsrSecInfo.findAll", query = "SELECT u FROM UsrSecInfo u")})
public class UsrSecInfo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "USR_ID")
    private String usrId;
    @Basic(optional = false)
    @Column(name = "USR_SSN")
    private String usrSsn;
    @Basic(optional = false)
    @Column(name = "USR_SSN_LAST_FOUR")
    private String usrSsnLastFour;
    @Basic(optional = false)
    @Column(name = "USR_DOB")
    private String usrDob;
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
    @Basic(optional = false)
    @Column(name = "CCH_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date cchTs;

    public UsrSecInfo() {
    }

    public UsrSecInfo(String usrId) {
        this.usrId = usrId;
    }

    public UsrSecInfo(String usrId, String usrSsn, String usrSsnLastFour, String usrDob, String crdNbr, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr, Date cchTs) {
        this.usrId = usrId;
        this.usrSsn = usrSsn;
        this.usrSsnLastFour = usrSsnLastFour;
        this.usrDob = usrDob;
        this.crdNbr = crdNbr;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
        this.cchTs = cchTs;
    }

    public String getUsrId() {
        return usrId;
    }

    public void setUsrId(String usrId) {
        this.usrId = usrId;
    }

    public String getUsrSsn() {
        return usrSsn;
    }

    public void setUsrSsn(String usrSsn) {
        this.usrSsn = usrSsn;
    }

    public String getUsrSsnLastFour() {
        return usrSsnLastFour;
    }

    public void setUsrSsnLastFour(String usrSsnLastFour) {
        this.usrSsnLastFour = usrSsnLastFour;
    }

    public String getUsrDob() {
        return usrDob;
    }

    public void setUsrDob(String usrDob) {
        this.usrDob = usrDob;
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

    public Date getCchTs() {
        return cchTs;
    }

    public void setCchTs(Date cchTs) {
        this.cchTs = cchTs;
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
        if (!(object instanceof UsrSecInfo)) {
            return false;
        }
        UsrSecInfo other = (UsrSecInfo) object;
        if ((this.usrId == null && other.usrId != null) || (this.usrId != null && !this.usrId.equals(other.usrId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.UsrSecInfo[ usrId=" + usrId + " ]";
    }
    
}
