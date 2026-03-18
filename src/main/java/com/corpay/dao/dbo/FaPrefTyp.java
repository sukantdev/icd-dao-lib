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
@Table(name = "FA_PREF_TYP", catalog = "", schema = "DBO")
public class FaPrefTyp implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PREF_TYP_ID")
    private Long prefTypId;
    @Basic(optional = false)
    @Column(name = "PREF_TYP_NM")
    private String prefTypNm;
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "prefTypId", fetch = FetchType.LAZY)
    private Set<FaPref> faPrefSet;
    @JoinColumn(name = "PREF_CATEGORY_ID", referencedColumnName = "PREF_CATEGORY_ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private FaPrefCategory prefCategoryId;

    public FaPrefTyp() {
    }

    public FaPrefTyp(Long prefTypId) {
        this.prefTypId = prefTypId;
    }

    public FaPrefTyp(Long prefTypId, String prefTypNm, String comm, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.prefTypId = prefTypId;
        this.prefTypNm = prefTypNm;
        this.comm = comm;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public Long getPrefTypId() {
        return prefTypId;
    }

    public void setPrefTypId(Long prefTypId) {
        this.prefTypId = prefTypId;
    }

    public String getPrefTypNm() {
        return prefTypNm;
    }

    public void setPrefTypNm(String prefTypNm) {
        this.prefTypNm = prefTypNm;
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

    public Set<FaPref> getFaPrefSet() {
        return faPrefSet;
    }

    public void setFaPrefSet(Set<FaPref> faPrefSet) {
        this.faPrefSet = faPrefSet;
    }

    public FaPrefCategory getPrefCategoryId() {
        return prefCategoryId;
    }

    public void setPrefCategoryId(FaPrefCategory prefCategoryId) {
        this.prefCategoryId = prefCategoryId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (prefTypId != null ? prefTypId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof FaPrefTyp)) {
            return false;
        }
        FaPrefTyp other = (FaPrefTyp) object;
        if ((this.prefTypId == null && other.prefTypId != null) || (this.prefTypId != null && !this.prefTypId.equals(other.prefTypId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.FaPrefTyp[ prefTypId=" + prefTypId + " ]";
    }

}
