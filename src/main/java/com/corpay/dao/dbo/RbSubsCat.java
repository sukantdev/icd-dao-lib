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
@Table(name = "RB_SUBS_CAT", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "RbSubsCat.findAll", query = "SELECT r FROM RbSubsCat r")})
public class RbSubsCat implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "SUB_CAT_ID")
    private Long subCatId;
    @Basic(optional = false)
    @Column(name = "SUB_CAT_NM")
    private String subCatNm;
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
    @Column(name = "SUB_CAT_CD")
    private String subCatCd;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "subCatId", fetch = FetchType.LAZY)
    private Set<RbSubsTyp> rbSubsTypSet;

    public RbSubsCat() {
    }

    public RbSubsCat(Long subCatId) {
        this.subCatId = subCatId;
    }

    public RbSubsCat(Long subCatId, String subCatNm, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr, String subCatCd) {
        this.subCatId = subCatId;
        this.subCatNm = subCatNm;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
        this.subCatCd = subCatCd;
    }

    public Long getSubCatId() {
        return subCatId;
    }

    public void setSubCatId(Long subCatId) {
        this.subCatId = subCatId;
    }

    public String getSubCatNm() {
        return subCatNm;
    }

    public void setSubCatNm(String subCatNm) {
        this.subCatNm = subCatNm;
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

    public String getSubCatCd() {
        return subCatCd;
    }

    public void setSubCatCd(String subCatCd) {
        this.subCatCd = subCatCd;
    }

    public Set<RbSubsTyp> getRbSubsTypSet() {
        return rbSubsTypSet;
    }

    public void setRbSubsTypSet(Set<RbSubsTyp> rbSubsTypSet) {
        this.rbSubsTypSet = rbSubsTypSet;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (subCatId != null ? subCatId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RbSubsCat)) {
            return false;
        }
        RbSubsCat other = (RbSubsCat) object;
        if ((this.subCatId == null && other.subCatId != null) || (this.subCatId != null && !this.subCatId.equals(other.subCatId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.RbSubsCat[ subCatId=" + subCatId + " ]";
    }
    
}
