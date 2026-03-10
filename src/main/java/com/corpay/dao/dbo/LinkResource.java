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
@Table(name = "LINK_RESOURCE", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "LinkResource.findAll", query = "SELECT l FROM LinkResource l")})
public class LinkResource implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "LINK_RSRC_ID")
    private Integer linkRsrcId;
    @Basic(optional = false)
    @Column(name = "RSRC_ID")
    private String rsrcId;
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
    @Basic(optional = false)
    @Column(name = "MENU_FLAG")
    private Character menuFlag;
    @Basic(optional = false)
    @Column(name = "BEHAVIOR_CD")
    private Character behaviorCd;
    @Basic(optional = false)
    @Column(name = "LEVEL_1_DESC")
    private String level1Desc;
    @Basic(optional = false)
    @Column(name = "LEVEL_2_DESC")
    private String level2Desc;
    @Basic(optional = false)
    @Column(name = "LEVEL_0_SORT_NBR")
    private int level0SortNbr;
    @Basic(optional = false)
    @Column(name = "LEVEL_1_SORT_NBR")
    private int level1SortNbr;
    @Basic(optional = false)
    @Column(name = "LEVEL_2_SORT_NBR")
    private int level2SortNbr;
    @Basic(optional = false)
    @Column(name = "INCLUSIVE_FLG")
    private Character inclusiveFlg;

    public LinkResource() {
    }

    public LinkResource(Integer linkRsrcId) {
        this.linkRsrcId = linkRsrcId;
    }

    public LinkResource(Integer linkRsrcId, String rsrcId, String linkUriAddr, String labelKey, String groupNm, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr, Character menuFlag, Character behaviorCd, String level1Desc, String level2Desc, int level0SortNbr, int level1SortNbr, int level2SortNbr, Character inclusiveFlg) {
        this.linkRsrcId = linkRsrcId;
        this.rsrcId = rsrcId;
        this.linkUriAddr = linkUriAddr;
        this.labelKey = labelKey;
        this.groupNm = groupNm;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
        this.menuFlag = menuFlag;
        this.behaviorCd = behaviorCd;
        this.level1Desc = level1Desc;
        this.level2Desc = level2Desc;
        this.level0SortNbr = level0SortNbr;
        this.level1SortNbr = level1SortNbr;
        this.level2SortNbr = level2SortNbr;
        this.inclusiveFlg = inclusiveFlg;
    }

    public Integer getLinkRsrcId() {
        return linkRsrcId;
    }

    public void setLinkRsrcId(Integer linkRsrcId) {
        this.linkRsrcId = linkRsrcId;
    }

    public String getRsrcId() {
        return rsrcId;
    }

    public void setRsrcId(String rsrcId) {
        this.rsrcId = rsrcId;
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

    public Character getMenuFlag() {
        return menuFlag;
    }

    public void setMenuFlag(Character menuFlag) {
        this.menuFlag = menuFlag;
    }

    public Character getBehaviorCd() {
        return behaviorCd;
    }

    public void setBehaviorCd(Character behaviorCd) {
        this.behaviorCd = behaviorCd;
    }

    public String getLevel1Desc() {
        return level1Desc;
    }

    public void setLevel1Desc(String level1Desc) {
        this.level1Desc = level1Desc;
    }

    public String getLevel2Desc() {
        return level2Desc;
    }

    public void setLevel2Desc(String level2Desc) {
        this.level2Desc = level2Desc;
    }

    public int getLevel0SortNbr() {
        return level0SortNbr;
    }

    public void setLevel0SortNbr(int level0SortNbr) {
        this.level0SortNbr = level0SortNbr;
    }

    public int getLevel1SortNbr() {
        return level1SortNbr;
    }

    public void setLevel1SortNbr(int level1SortNbr) {
        this.level1SortNbr = level1SortNbr;
    }

    public int getLevel2SortNbr() {
        return level2SortNbr;
    }

    public void setLevel2SortNbr(int level2SortNbr) {
        this.level2SortNbr = level2SortNbr;
    }

    public Character getInclusiveFlg() {
        return inclusiveFlg;
    }

    public void setInclusiveFlg(Character inclusiveFlg) {
        this.inclusiveFlg = inclusiveFlg;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (linkRsrcId != null ? linkRsrcId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LinkResource)) {
            return false;
        }
        LinkResource other = (LinkResource) object;
        if ((this.linkRsrcId == null && other.linkRsrcId != null) || (this.linkRsrcId != null && !this.linkRsrcId.equals(other.linkRsrcId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.LinkResource[ linkRsrcId=" + linkRsrcId + " ]";
    }
    
}
