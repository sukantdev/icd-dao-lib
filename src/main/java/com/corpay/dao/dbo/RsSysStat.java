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
@Table(name = "RS_SYS_STAT", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "RsSysStat.findAll", query = "SELECT r FROM RsSysStat r")})
public class RsSysStat implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "QUE_NM")
    private String queNm;
    @Basic(optional = false)
    @Column(name = "RCVD_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date rcvdTs;
    @Basic(optional = false)
    @Column(name = "SEND_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date sendTs;
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

    public RsSysStat() {
    }

    public RsSysStat(String queNm) {
        this.queNm = queNm;
    }

    public RsSysStat(String queNm, Date rcvdTs, Date sendTs, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.queNm = queNm;
        this.rcvdTs = rcvdTs;
        this.sendTs = sendTs;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public String getQueNm() {
        return queNm;
    }

    public void setQueNm(String queNm) {
        this.queNm = queNm;
    }

    public Date getRcvdTs() {
        return rcvdTs;
    }

    public void setRcvdTs(Date rcvdTs) {
        this.rcvdTs = rcvdTs;
    }

    public Date getSendTs() {
        return sendTs;
    }

    public void setSendTs(Date sendTs) {
        this.sendTs = sendTs;
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
        hash += (queNm != null ? queNm.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RsSysStat)) {
            return false;
        }
        RsSysStat other = (RsSysStat) object;
        if ((this.queNm == null && other.queNm != null) || (this.queNm != null && !this.queNm.equals(other.queNm))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.RsSysStat[ queNm=" + queNm + " ]";
    }
    
}
