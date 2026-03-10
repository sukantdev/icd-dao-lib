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
@Table(name = "PREPAID_WEBSERVICE_MST", catalog = "", schema = "CXXCOW")
@NamedQueries({
    @NamedQuery(name = "PrepaidWebserviceMst.findAll", query = "SELECT p FROM PrepaidWebserviceMst p"),
    @NamedQuery(name = "PrepaidWebserviceMst.findByWebSvcId", query = "SELECT p FROM PrepaidWebserviceMst p WHERE p.webSvcId = :webSvcId"),
    @NamedQuery(name = "PrepaidWebserviceMst.findByWebSvcNm", query = "SELECT p FROM PrepaidWebserviceMst p WHERE p.webSvcNm = :webSvcNm"),
    @NamedQuery(name = "PrepaidWebserviceMst.findByWebSvcDesc", query = "SELECT p FROM PrepaidWebserviceMst p WHERE p.webSvcDesc = :webSvcDesc"),
    @NamedQuery(name = "PrepaidWebserviceMst.findByCrtTs", query = "SELECT p FROM PrepaidWebserviceMst p WHERE p.crtTs = :crtTs"),
    @NamedQuery(name = "PrepaidWebserviceMst.findByCrtUsr", query = "SELECT p FROM PrepaidWebserviceMst p WHERE p.crtUsr = :crtUsr"),
    @NamedQuery(name = "PrepaidWebserviceMst.findByMdyTs", query = "SELECT p FROM PrepaidWebserviceMst p WHERE p.mdyTs = :mdyTs"),
    @NamedQuery(name = "PrepaidWebserviceMst.findByMdyUsr", query = "SELECT p FROM PrepaidWebserviceMst p WHERE p.mdyUsr = :mdyUsr")})
public class PrepaidWebserviceMst implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "WEB_SVC_ID")
    private Integer webSvcId;
    @Basic(optional = false)
    @Column(name = "WEB_SVC_NM")
    private String webSvcNm;
    @Column(name = "WEB_SVC_DESC")
    private String webSvcDesc;
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

    public PrepaidWebserviceMst() {
    }

    public PrepaidWebserviceMst(Integer webSvcId) {
        this.webSvcId = webSvcId;
    }

    public PrepaidWebserviceMst(Integer webSvcId, String webSvcNm, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.webSvcId = webSvcId;
        this.webSvcNm = webSvcNm;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public Integer getWebSvcId() {
        return webSvcId;
    }

    public void setWebSvcId(Integer webSvcId) {
        this.webSvcId = webSvcId;
    }

    public String getWebSvcNm() {
        return webSvcNm;
    }

    public void setWebSvcNm(String webSvcNm) {
        this.webSvcNm = webSvcNm;
    }

    public String getWebSvcDesc() {
        return webSvcDesc;
    }

    public void setWebSvcDesc(String webSvcDesc) {
        this.webSvcDesc = webSvcDesc;
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
        hash += (webSvcId != null ? webSvcId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PrepaidWebserviceMst)) {
            return false;
        }
        PrepaidWebserviceMst other = (PrepaidWebserviceMst) object;
        if ((this.webSvcId == null && other.webSvcId != null) || (this.webSvcId != null && !this.webSvcId.equals(other.webSvcId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.cxxcow.PrepaidWebserviceMst[ webSvcId=" + webSvcId + " ]";
    }
    
}
