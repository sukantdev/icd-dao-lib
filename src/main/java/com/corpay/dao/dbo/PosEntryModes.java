package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "POS_ENTRY_MODES", catalog = "", schema = "DBO")
public class PosEntryModes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ENTRY_MODE")
    private Integer entryMode;
    @Basic(optional = false)
    @Column(name = "ENTRY_MODE_DESC")
    private String entryModeDesc;
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

    public PosEntryModes() {
    }

    public PosEntryModes(Integer entryMode) {
        this.entryMode = entryMode;
    }

    public PosEntryModes(Integer entryMode, String entryModeDesc, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.entryMode = entryMode;
        this.entryModeDesc = entryModeDesc;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public Integer getEntryMode() {
        return entryMode;
    }

    public void setEntryMode(Integer entryMode) {
        this.entryMode = entryMode;
    }

    public String getEntryModeDesc() {
        return entryModeDesc;
    }

    public void setEntryModeDesc(String entryModeDesc) {
        this.entryModeDesc = entryModeDesc;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (entryMode != null ? entryMode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof PosEntryModes)) {
            return false;
        }
        PosEntryModes other = (PosEntryModes) object;
        if ((this.entryMode == null && other.entryMode != null) || (this.entryMode != null && !this.entryMode.equals(other.entryMode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.PosEntryModes[ entryMode=" + entryMode + " ]";
    }

}
