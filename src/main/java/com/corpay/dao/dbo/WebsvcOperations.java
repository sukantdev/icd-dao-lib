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
@Table(name = "WEBSVC_OPERATIONS", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "WebsvcOperations.findAll", query = "SELECT w FROM WebsvcOperations w")})
public class WebsvcOperations implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "OP_ID")
    private String opId;
    @Basic(optional = false)
    @Column(name = "GROUP_ID")
    private String groupId;
    @Basic(optional = false)
    @Column(name = "DESCRIPTION")
    private String description;
    @Basic(optional = false)
    @Column(name = "WEB_SVC_ID")
    private String webSvcId;
    @Basic(optional = false)
    @Column(name = "DEFAULT_LMT")
    private int defaultLmt;
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

    public WebsvcOperations() {
    }

    public WebsvcOperations(String opId) {
        this.opId = opId;
    }

    public WebsvcOperations(String opId, String groupId, String description, String webSvcId, int defaultLmt, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.opId = opId;
        this.groupId = groupId;
        this.description = description;
        this.webSvcId = webSvcId;
        this.defaultLmt = defaultLmt;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public String getOpId() {
        return opId;
    }

    public void setOpId(String opId) {
        this.opId = opId;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getWebSvcId() {
        return webSvcId;
    }

    public void setWebSvcId(String webSvcId) {
        this.webSvcId = webSvcId;
    }

    public int getDefaultLmt() {
        return defaultLmt;
    }

    public void setDefaultLmt(int defaultLmt) {
        this.defaultLmt = defaultLmt;
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
        hash += (opId != null ? opId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof WebsvcOperations)) {
            return false;
        }
        WebsvcOperations other = (WebsvcOperations) object;
        if ((this.opId == null && other.opId != null) || (this.opId != null && !this.opId.equals(other.opId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.WebsvcOperations[ opId=" + opId + " ]";
    }
    
}
