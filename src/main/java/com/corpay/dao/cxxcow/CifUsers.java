/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.corpay.dao.cxxcow;

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
@Table(name = "CIF_USERS", catalog = "", schema = "CXXCOW")
@NamedQueries({
    @NamedQuery(name = "CifUsers.findAll", query = "SELECT c FROM CifUsers c"),
    @NamedQuery(name = "CifUsers.findByUsrId", query = "SELECT c FROM CifUsers c WHERE c.usrId = :usrId"),
    @NamedQuery(name = "CifUsers.findByCifId", query = "SELECT c FROM CifUsers c WHERE c.cifId = :cifId"),
    @NamedQuery(name = "CifUsers.findByCrtTs", query = "SELECT c FROM CifUsers c WHERE c.crtTs = :crtTs"),
    @NamedQuery(name = "CifUsers.findByCrtUsr", query = "SELECT c FROM CifUsers c WHERE c.crtUsr = :crtUsr"),
    @NamedQuery(name = "CifUsers.findByMdyTs", query = "SELECT c FROM CifUsers c WHERE c.mdyTs = :mdyTs"),
    @NamedQuery(name = "CifUsers.findByMdyUsr", query = "SELECT c FROM CifUsers c WHERE c.mdyUsr = :mdyUsr")})
public class CifUsers implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "USR_ID")
    private String usrId;
    @Basic(optional = false)
    @Column(name = "CIF_ID")
    private String cifId;
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

    public CifUsers() {
    }

    public CifUsers(String usrId) {
        this.usrId = usrId;
    }

    public CifUsers(String usrId, String cifId, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.usrId = usrId;
        this.cifId = cifId;
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

    public String getCifId() {
        return cifId;
    }

    public void setCifId(String cifId) {
        this.cifId = cifId;
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
        if (!(object instanceof CifUsers)) {
            return false;
        }
        CifUsers other = (CifUsers) object;
        if ((this.usrId == null && other.usrId != null) || (this.usrId != null && !this.usrId.equals(other.usrId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.cxxcow.CifUsers[ usrId=" + usrId + " ]";
    }
    
}
