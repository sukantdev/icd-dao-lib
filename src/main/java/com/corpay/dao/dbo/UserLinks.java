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
@Table(name = "USER_LINKS", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "UserLinks.findAll", query = "SELECT u FROM UserLinks u")})
public class UserLinks implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected UserLinksPK userLinksPK;
    @Basic(optional = false)
    @Column(name = "RSRC_ID")
    private String rsrcId;
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

    public UserLinks() {
    }

    public UserLinks(UserLinksPK userLinksPK) {
        this.userLinksPK = userLinksPK;
    }

    public UserLinks(UserLinksPK userLinksPK, String rsrcId, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.userLinksPK = userLinksPK;
        this.rsrcId = rsrcId;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public UserLinks(String userId, int linkRsrcId) {
        this.userLinksPK = new UserLinksPK(userId, linkRsrcId);
    }

    public UserLinksPK getUserLinksPK() {
        return userLinksPK;
    }

    public void setUserLinksPK(UserLinksPK userLinksPK) {
        this.userLinksPK = userLinksPK;
    }

    public String getRsrcId() {
        return rsrcId;
    }

    public void setRsrcId(String rsrcId) {
        this.rsrcId = rsrcId;
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
        hash += (userLinksPK != null ? userLinksPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UserLinks)) {
            return false;
        }
        UserLinks other = (UserLinks) object;
        if ((this.userLinksPK == null && other.userLinksPK != null) || (this.userLinksPK != null && !this.userLinksPK.equals(other.userLinksPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.UserLinks[ userLinksPK=" + userLinksPK + " ]";
    }
    
}
