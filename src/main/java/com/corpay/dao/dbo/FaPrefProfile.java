package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "FA_PREF_PROFILE", catalog = "", schema = "DBO")
public class FaPrefProfile implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PREF_PROFILE_ID")
    private Long prefProfileId;
    @Basic(optional = false)
    @Column(name = "PROFILE_USER")
    private String profileUser;
    @Basic(optional = false)
    @Column(name = "PROFILE_USER_TYP")
    private String profileUserTyp;
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "prefProfileId", fetch = FetchType.LAZY)
    private Set<FaPref> faPrefSet;

    public FaPrefProfile() {
    }

    public FaPrefProfile(Long prefProfileId) {
        this.prefProfileId = prefProfileId;
    }

    public FaPrefProfile(Long prefProfileId, String profileUser, String profileUserTyp, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.prefProfileId = prefProfileId;
        this.profileUser = profileUser;
        this.profileUserTyp = profileUserTyp;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public Long getPrefProfileId() {
        return prefProfileId;
    }

    public void setPrefProfileId(Long prefProfileId) {
        this.prefProfileId = prefProfileId;
    }

    public String getProfileUser() {
        return profileUser;
    }

    public void setProfileUser(String profileUser) {
        this.profileUser = profileUser;
    }

    public String getProfileUserTyp() {
        return profileUserTyp;
    }

    public void setProfileUserTyp(String profileUserTyp) {
        this.profileUserTyp = profileUserTyp;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (prefProfileId != null ? prefProfileId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof FaPrefProfile)) {
            return false;
        }
        FaPrefProfile other = (FaPrefProfile) object;
        if ((this.prefProfileId == null && other.prefProfileId != null) || (this.prefProfileId != null && !this.prefProfileId.equals(other.prefProfileId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.FaPrefProfile[ prefProfileId=" + prefProfileId + " ]";
    }

}
