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
@Table(name = "VP_PROC_RULES", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "VpProcRules.findAll", query = "SELECT v FROM VpProcRules v")})
public class VpProcRules implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "VPR_ID")
    private String vprId;
    @Basic(optional = false)
    @Column(name = "CUST_ID")
    private String custId;
    @Basic(optional = false)
    @Column(name = "RULE_TYP_CD")
    private Character ruleTypCd;
    @Basic(optional = false)
    @Column(name = "APP_TYP_CD")
    private String appTypCd;
    @Basic(optional = false)
    @Column(name = "FIELD_NM")
    private String fieldNm;
    @Basic(optional = false)
    @Column(name = "SRCH_FIELD_NM")
    private String srchFieldNm;
    @Basic(optional = false)
    @Column(name = "RPL_FIELD_NM")
    private String rplFieldNm;
    @Basic(optional = false)
    @Column(name = "MDY_USR")
    private String mdyUsr;
    @Basic(optional = false)
    @Column(name = "MDY_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date mdyTs;
    @Basic(optional = false)
    @Column(name = "CRT_USR")
    private String crtUsr;
    @Basic(optional = false)
    @Column(name = "CRT_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date crtTs;

    public VpProcRules() {
    }

    public VpProcRules(String vprId) {
        this.vprId = vprId;
    }

    public VpProcRules(String vprId, String custId, Character ruleTypCd, String appTypCd, String fieldNm, String srchFieldNm, String rplFieldNm, String mdyUsr, Date mdyTs, String crtUsr, Date crtTs) {
        this.vprId = vprId;
        this.custId = custId;
        this.ruleTypCd = ruleTypCd;
        this.appTypCd = appTypCd;
        this.fieldNm = fieldNm;
        this.srchFieldNm = srchFieldNm;
        this.rplFieldNm = rplFieldNm;
        this.mdyUsr = mdyUsr;
        this.mdyTs = mdyTs;
        this.crtUsr = crtUsr;
        this.crtTs = crtTs;
    }

    public String getVprId() {
        return vprId;
    }

    public void setVprId(String vprId) {
        this.vprId = vprId;
    }

    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId;
    }

    public Character getRuleTypCd() {
        return ruleTypCd;
    }

    public void setRuleTypCd(Character ruleTypCd) {
        this.ruleTypCd = ruleTypCd;
    }

    public String getAppTypCd() {
        return appTypCd;
    }

    public void setAppTypCd(String appTypCd) {
        this.appTypCd = appTypCd;
    }

    public String getFieldNm() {
        return fieldNm;
    }

    public void setFieldNm(String fieldNm) {
        this.fieldNm = fieldNm;
    }

    public String getSrchFieldNm() {
        return srchFieldNm;
    }

    public void setSrchFieldNm(String srchFieldNm) {
        this.srchFieldNm = srchFieldNm;
    }

    public String getRplFieldNm() {
        return rplFieldNm;
    }

    public void setRplFieldNm(String rplFieldNm) {
        this.rplFieldNm = rplFieldNm;
    }

    public String getMdyUsr() {
        return mdyUsr;
    }

    public void setMdyUsr(String mdyUsr) {
        this.mdyUsr = mdyUsr;
    }

    public Date getMdyTs() {
        return mdyTs;
    }

    public void setMdyTs(Date mdyTs) {
        this.mdyTs = mdyTs;
    }

    public String getCrtUsr() {
        return crtUsr;
    }

    public void setCrtUsr(String crtUsr) {
        this.crtUsr = crtUsr;
    }

    public Date getCrtTs() {
        return crtTs;
    }

    public void setCrtTs(Date crtTs) {
        this.crtTs = crtTs;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (vprId != null ? vprId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof VpProcRules)) {
            return false;
        }
        VpProcRules other = (VpProcRules) object;
        if ((this.vprId == null && other.vprId != null) || (this.vprId != null && !this.vprId.equals(other.vprId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.VpProcRules[ vprId=" + vprId + " ]";
    }
    
}
