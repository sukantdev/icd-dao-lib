package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "FA_PREF_VAL", catalog = "", schema = "DBO")
public class FaPrefVal implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PREF_VAL_ID")
    private Long prefValId;
    @Basic(optional = false)
    @Column(name = "PREF_VAL")
    private String prefVal;
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
    @JoinColumn(name = "PREF_ID", referencedColumnName = "PREF_ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private FaPref prefId;

    public FaPrefVal() {
    }

    public FaPrefVal(Long prefValId) {
        this.prefValId = prefValId;
    }

    public FaPrefVal(Long prefValId, String prefVal, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.prefValId = prefValId;
        this.prefVal = prefVal;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public Long getPrefValId() {
        return prefValId;
    }

    public void setPrefValId(Long prefValId) {
        this.prefValId = prefValId;
    }

    public String getPrefVal() {
        return prefVal;
    }

    public void setPrefVal(String prefVal) {
        this.prefVal = prefVal;
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

    public FaPref getPrefId() {
        return prefId;
    }

    public void setPrefId(FaPref prefId) {
        this.prefId = prefId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (prefValId != null ? prefValId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof FaPrefVal)) {
            return false;
        }
        FaPrefVal other = (FaPrefVal) object;
        if ((this.prefValId == null && other.prefValId != null) || (this.prefValId != null && !this.prefValId.equals(other.prefValId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.FaPrefVal[ prefValId=" + prefValId + " ]";
    }

}
