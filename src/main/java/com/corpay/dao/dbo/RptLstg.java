/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

/**
 *
 * @author Sukant.Tiwari
 */
@Entity
@Table(name = "RPT_LSTG", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "RptLstg.findAll", query = "SELECT r FROM RptLstg r")})
public class RptLstg implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "RPT_NBR")
    private Integer rptNbr;
    @Basic(optional = false)
    @Column(name = "RPT_NM")
    private String rptNm;
    @Basic(optional = false)
    @Column(name = "RPT_TYP")
    private String rptTyp;
    @Basic(optional = false)
    @Column(name = "SORT_ORD")
    private int sortOrd;
    @Basic(optional = false)
    @Column(name = "SQLKEY")
    private String sqlkey;
    @Basic(optional = false)
    @Column(name = "VIEWER_ID")
    private String viewerId;
    @Basic(optional = false)
    @Column(name = "DNLD_ID")
    private String dnldId;
    @Basic(optional = false)
    @Column(name = "DSABLD_FLG")
    private Character dsabldFlg;
    @Basic(optional = false)
    @Column(name = "AVL_FLG")
    private Character avlFlg;
    @Basic(optional = false)
    @Column(name = "X_FNC_ACTN")
    private String xFncActn;
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
    @Column(name = "SCY_TP_CD")
    private Character scyTpCd;
    @Basic(optional = false)
    @Column(name = "NAV_TP_CD")
    private Character navTpCd;
    @Basic(optional = false)
    @Column(name = "RPT_ACS_FLG")
    private Character rptAcsFlg;
    @Basic(optional = false)
    @Column(name = "REBATE_IND")
    private Character rebateInd;
    @Basic(optional = false)
    @Column(name = "DISCOUNTS_IND")
    private Character discountsInd;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "rptNbr", fetch = FetchType.LAZY)
    private Set<LinkRpt> linkRptSet;

    public RptLstg() {
    }

    public RptLstg(Integer rptNbr) {
        this.rptNbr = rptNbr;
    }

    public RptLstg(Integer rptNbr, String rptNm, String rptTyp, int sortOrd, String sqlkey, String viewerId, String dnldId, Character dsabldFlg, Character avlFlg, String xFncActn, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr, Character scyTpCd, Character navTpCd, Character rptAcsFlg, Character rebateInd, Character discountsInd) {
        this.rptNbr = rptNbr;
        this.rptNm = rptNm;
        this.rptTyp = rptTyp;
        this.sortOrd = sortOrd;
        this.sqlkey = sqlkey;
        this.viewerId = viewerId;
        this.dnldId = dnldId;
        this.dsabldFlg = dsabldFlg;
        this.avlFlg = avlFlg;
        this.xFncActn = xFncActn;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
        this.scyTpCd = scyTpCd;
        this.navTpCd = navTpCd;
        this.rptAcsFlg = rptAcsFlg;
        this.rebateInd = rebateInd;
        this.discountsInd = discountsInd;
    }

    public Integer getRptNbr() {
        return rptNbr;
    }

    public void setRptNbr(Integer rptNbr) {
        this.rptNbr = rptNbr;
    }

    public String getRptNm() {
        return rptNm;
    }

    public void setRptNm(String rptNm) {
        this.rptNm = rptNm;
    }

    public String getRptTyp() {
        return rptTyp;
    }

    public void setRptTyp(String rptTyp) {
        this.rptTyp = rptTyp;
    }

    public int getSortOrd() {
        return sortOrd;
    }

    public void setSortOrd(int sortOrd) {
        this.sortOrd = sortOrd;
    }

    public String getSqlkey() {
        return sqlkey;
    }

    public void setSqlkey(String sqlkey) {
        this.sqlkey = sqlkey;
    }

    public String getViewerId() {
        return viewerId;
    }

    public void setViewerId(String viewerId) {
        this.viewerId = viewerId;
    }

    public String getDnldId() {
        return dnldId;
    }

    public void setDnldId(String dnldId) {
        this.dnldId = dnldId;
    }

    public Character getDsabldFlg() {
        return dsabldFlg;
    }

    public void setDsabldFlg(Character dsabldFlg) {
        this.dsabldFlg = dsabldFlg;
    }

    public Character getAvlFlg() {
        return avlFlg;
    }

    public void setAvlFlg(Character avlFlg) {
        this.avlFlg = avlFlg;
    }

    public String getXFncActn() {
        return xFncActn;
    }

    public void setXFncActn(String xFncActn) {
        this.xFncActn = xFncActn;
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

    public Character getScyTpCd() {
        return scyTpCd;
    }

    public void setScyTpCd(Character scyTpCd) {
        this.scyTpCd = scyTpCd;
    }

    public Character getNavTpCd() {
        return navTpCd;
    }

    public void setNavTpCd(Character navTpCd) {
        this.navTpCd = navTpCd;
    }

    public Character getRptAcsFlg() {
        return rptAcsFlg;
    }

    public void setRptAcsFlg(Character rptAcsFlg) {
        this.rptAcsFlg = rptAcsFlg;
    }

    public Character getRebateInd() {
        return rebateInd;
    }

    public void setRebateInd(Character rebateInd) {
        this.rebateInd = rebateInd;
    }

    public Character getDiscountsInd() {
        return discountsInd;
    }

    public void setDiscountsInd(Character discountsInd) {
        this.discountsInd = discountsInd;
    }

    public Set<LinkRpt> getLinkRptSet() {
        return linkRptSet;
    }

    public void setLinkRptSet(Set<LinkRpt> linkRptSet) {
        this.linkRptSet = linkRptSet;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (rptNbr != null ? rptNbr.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RptLstg)) {
            return false;
        }
        RptLstg other = (RptLstg) object;
        if ((this.rptNbr == null && other.rptNbr != null) || (this.rptNbr != null && !this.rptNbr.equals(other.rptNbr))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.RptLstg[ rptNbr=" + rptNbr + " ]";
    }
    
}
