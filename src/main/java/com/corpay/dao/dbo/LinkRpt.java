/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
@Table(name = "LINK_RPT", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "LinkRpt.findAll", query = "SELECT l FROM LinkRpt l")})
public class LinkRpt implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "LINK_RPT_ID")
    private Integer linkRptId;
    @Basic(optional = false)
    @Column(name = "LINK_URI_ADDR")
    private String linkUriAddr;
    @Basic(optional = false)
    @Column(name = "LABEL_KEY")
    private String labelKey;
    @Basic(optional = false)
    @Column(name = "GROUP_NM")
    private String groupNm;
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
    @JoinColumn(name = "RPT_NBR", referencedColumnName = "RPT_NBR")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private RptLstg rptNbr;

    public LinkRpt() {
    }

    public LinkRpt(Integer linkRptId) {
        this.linkRptId = linkRptId;
    }

    public LinkRpt(Integer linkRptId, String linkUriAddr, String labelKey, String groupNm, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.linkRptId = linkRptId;
        this.linkUriAddr = linkUriAddr;
        this.labelKey = labelKey;
        this.groupNm = groupNm;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public Integer getLinkRptId() {
        return linkRptId;
    }

    public void setLinkRptId(Integer linkRptId) {
        this.linkRptId = linkRptId;
    }

    public String getLinkUriAddr() {
        return linkUriAddr;
    }

    public void setLinkUriAddr(String linkUriAddr) {
        this.linkUriAddr = linkUriAddr;
    }

    public String getLabelKey() {
        return labelKey;
    }

    public void setLabelKey(String labelKey) {
        this.labelKey = labelKey;
    }

    public String getGroupNm() {
        return groupNm;
    }

    public void setGroupNm(String groupNm) {
        this.groupNm = groupNm;
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

    public RptLstg getRptNbr() {
        return rptNbr;
    }

    public void setRptNbr(RptLstg rptNbr) {
        this.rptNbr = rptNbr;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (linkRptId != null ? linkRptId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LinkRpt)) {
            return false;
        }
        LinkRpt other = (LinkRpt) object;
        if ((this.linkRptId == null && other.linkRptId != null) || (this.linkRptId != null && !this.linkRptId.equals(other.linkRptId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.LinkRpt[ linkRptId=" + linkRptId + " ]";
    }
    
}
