package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "RB_SUBS_TYP", catalog = "", schema = "DBO")
public class RbSubsTyp implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "SUB_TYP_ID")
    private Long subTypId;
    @Basic(optional = false)
    @Column(name = "SUB_TYP_NM")
    private String subTypNm;
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
    @Column(name = "SUB_TYP_CD")
    private String subTypCd;
    @JoinColumn(name = "SUB_CAT_ID", referencedColumnName = "SUB_CAT_ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private RbSubsCat subCatId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "subTypId", fetch = FetchType.LAZY)
    private Set<RbSubsPhase> rbSubsPhaseSet;

    public RbSubsTyp() {
    }

    public RbSubsTyp(Long subTypId) {
        this.subTypId = subTypId;
    }

    public RbSubsTyp(Long subTypId, String subTypNm, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr, String subTypCd) {
        this.subTypId = subTypId;
        this.subTypNm = subTypNm;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
        this.subTypCd = subTypCd;
    }

    public Long getSubTypId() {
        return subTypId;
    }

    public void setSubTypId(Long subTypId) {
        this.subTypId = subTypId;
    }

    public String getSubTypNm() {
        return subTypNm;
    }

    public void setSubTypNm(String subTypNm) {
        this.subTypNm = subTypNm;
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

    public String getSubTypCd() {
        return subTypCd;
    }

    public void setSubTypCd(String subTypCd) {
        this.subTypCd = subTypCd;
    }

    public RbSubsCat getSubCatId() {
        return subCatId;
    }

    public void setSubCatId(RbSubsCat subCatId) {
        this.subCatId = subCatId;
    }

    public Set<RbSubsPhase> getRbSubsPhaseSet() {
        return rbSubsPhaseSet;
    }

    public void setRbSubsPhaseSet(Set<RbSubsPhase> rbSubsPhaseSet) {
        this.rbSubsPhaseSet = rbSubsPhaseSet;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (subTypId != null ? subTypId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof RbSubsTyp)) {
            return false;
        }
        RbSubsTyp other = (RbSubsTyp) object;
        if ((this.subTypId == null && other.subTypId != null) || (this.subTypId != null && !this.subTypId.equals(other.subTypId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.RbSubsTyp[ subTypId=" + subTypId + " ]";
    }

}
