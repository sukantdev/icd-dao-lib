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
@Table(name = "DECLINE_CDS", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "DeclineCds.findAll", query = "SELECT d FROM DeclineCds d")})
public class DeclineCds implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "DECLINE_CD")
    private Integer declineCd;
    @Basic(optional = false)
    @Column(name = "DECLINE_MESSAGE")
    private String declineMessage;
    @Basic(optional = false)
    @Column(name = "CRECTV_ACTN")
    private String crectvActn;
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

    public DeclineCds() {
    }

    public DeclineCds(Integer declineCd) {
        this.declineCd = declineCd;
    }

    public DeclineCds(Integer declineCd, String declineMessage, String crectvActn, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.declineCd = declineCd;
        this.declineMessage = declineMessage;
        this.crectvActn = crectvActn;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public Integer getDeclineCd() {
        return declineCd;
    }

    public void setDeclineCd(Integer declineCd) {
        this.declineCd = declineCd;
    }

    public String getDeclineMessage() {
        return declineMessage;
    }

    public void setDeclineMessage(String declineMessage) {
        this.declineMessage = declineMessage;
    }

    public String getCrectvActn() {
        return crectvActn;
    }

    public void setCrectvActn(String crectvActn) {
        this.crectvActn = crectvActn;
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
        hash += (declineCd != null ? declineCd.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DeclineCds)) {
            return false;
        }
        DeclineCds other = (DeclineCds) object;
        if ((this.declineCd == null && other.declineCd != null) || (this.declineCd != null && !this.declineCd.equals(other.declineCd))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.DeclineCds[ declineCd=" + declineCd + " ]";
    }
    
}
