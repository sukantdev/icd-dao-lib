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
@Table(name = "FA_PREF", catalog = "", schema = "DBO")
public class FaPref implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PREF_ID")
    private Long prefId;
    @Basic(optional = false)
    @Column(name = "PREF_NM")
    private String prefNm;
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
    @Column(name = "PREF_CD")
    private String prefCd;
    @JoinColumn(name = "PREF_PROFILE_ID", referencedColumnName = "PREF_PROFILE_ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private FaPrefProfile prefProfileId;
    @JoinColumn(name = "PREF_TYP_ID", referencedColumnName = "PREF_TYP_ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private FaPrefTyp prefTypId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "prefId", fetch = FetchType.LAZY)
    private Set<FaPrefVal> faPrefValSet;

    public FaPref() {
    }

    public FaPref(Long prefId) {
        this.prefId = prefId;
    }

    public FaPref(Long prefId, String prefNm, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.prefId = prefId;
        this.prefNm = prefNm;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public Long getPrefId() {
        return prefId;
    }

    public void setPrefId(Long prefId) {
        this.prefId = prefId;
    }

    public String getPrefNm() {
        return prefNm;
    }

    public void setPrefNm(String prefNm) {
        this.prefNm = prefNm;
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

    public String getPrefCd() {
        return prefCd;
    }

    public void setPrefCd(String prefCd) {
        this.prefCd = prefCd;
    }

    public FaPrefProfile getPrefProfileId() {
        return prefProfileId;
    }

    public void setPrefProfileId(FaPrefProfile prefProfileId) {
        this.prefProfileId = prefProfileId;
    }

    public FaPrefTyp getPrefTypId() {
        return prefTypId;
    }

    public void setPrefTypId(FaPrefTyp prefTypId) {
        this.prefTypId = prefTypId;
    }

    public Set<FaPrefVal> getFaPrefValSet() {
        return faPrefValSet;
    }

    public void setFaPrefValSet(Set<FaPrefVal> faPrefValSet) {
        this.faPrefValSet = faPrefValSet;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (prefId != null ? prefId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof FaPref)) {
            return false;
        }
        FaPref other = (FaPref) object;
        if ((this.prefId == null && other.prefId != null) || (this.prefId != null && !this.prefId.equals(other.prefId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.FaPref[ prefId=" + prefId + " ]";
    }

}
