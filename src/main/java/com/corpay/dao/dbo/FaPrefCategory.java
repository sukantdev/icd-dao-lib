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
@Table(name = "FA_PREF_CATEGORY", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "FaPrefCategory.findAll", query = "SELECT f FROM FaPrefCategory f")})
public class FaPrefCategory implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PREF_CATEGORY_ID")
    private Long prefCategoryId;
    @Basic(optional = false)
    @Column(name = "PREF_CATEGORY_NM")
    private String prefCategoryNm;
    @Basic(optional = false)
    @Column(name = "COMM")
    private String comm;
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "prefCategoryId", fetch = FetchType.LAZY)
    private Set<FaPrefTyp> faPrefTypSet;

    public FaPrefCategory() {
    }

    public FaPrefCategory(Long prefCategoryId) {
        this.prefCategoryId = prefCategoryId;
    }

    public FaPrefCategory(Long prefCategoryId, String prefCategoryNm, String comm, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.prefCategoryId = prefCategoryId;
        this.prefCategoryNm = prefCategoryNm;
        this.comm = comm;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public Long getPrefCategoryId() {
        return prefCategoryId;
    }

    public void setPrefCategoryId(Long prefCategoryId) {
        this.prefCategoryId = prefCategoryId;
    }

    public String getPrefCategoryNm() {
        return prefCategoryNm;
    }

    public void setPrefCategoryNm(String prefCategoryNm) {
        this.prefCategoryNm = prefCategoryNm;
    }

    public String getComm() {
        return comm;
    }

    public void setComm(String comm) {
        this.comm = comm;
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

    public Set<FaPrefTyp> getFaPrefTypSet() {
        return faPrefTypSet;
    }

    public void setFaPrefTypSet(Set<FaPrefTyp> faPrefTypSet) {
        this.faPrefTypSet = faPrefTypSet;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (prefCategoryId != null ? prefCategoryId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FaPrefCategory)) {
            return false;
        }
        FaPrefCategory other = (FaPrefCategory) object;
        if ((this.prefCategoryId == null && other.prefCategoryId != null) || (this.prefCategoryId != null && !this.prefCategoryId.equals(other.prefCategoryId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.FaPrefCategory[ prefCategoryId=" + prefCategoryId + " ]";
    }
    
}
