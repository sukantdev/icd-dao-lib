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
@Table(name = "PRIORITY_NUMBER", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "PriorityNumber.findAll", query = "SELECT p FROM PriorityNumber p")})
public class PriorityNumber implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PRIORITY_TYPE")
    private String priorityType;
    @Basic(optional = false)
    @Column(name = "LAST_PRIORITY_NUMBER")
    private int lastPriorityNumber;
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

    public PriorityNumber() {
    }

    public PriorityNumber(String priorityType) {
        this.priorityType = priorityType;
    }

    public PriorityNumber(String priorityType, int lastPriorityNumber, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.priorityType = priorityType;
        this.lastPriorityNumber = lastPriorityNumber;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public String getPriorityType() {
        return priorityType;
    }

    public void setPriorityType(String priorityType) {
        this.priorityType = priorityType;
    }

    public int getLastPriorityNumber() {
        return lastPriorityNumber;
    }

    public void setLastPriorityNumber(int lastPriorityNumber) {
        this.lastPriorityNumber = lastPriorityNumber;
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
        hash += (priorityType != null ? priorityType.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PriorityNumber)) {
            return false;
        }
        PriorityNumber other = (PriorityNumber) object;
        if ((this.priorityType == null && other.priorityType != null) || (this.priorityType != null && !this.priorityType.equals(other.priorityType))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.PriorityNumber[ priorityType=" + priorityType + " ]";
    }
    
}
