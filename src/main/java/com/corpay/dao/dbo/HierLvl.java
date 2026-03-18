package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "HIER_LVL", catalog = "", schema = "DBO")
public class HierLvl implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected HierLvlPK hierLvlPK;
    @Basic(optional = false)
    @Column(name = "LVL_DESC")
    private String lvlDesc;
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

    public HierLvl() {
    }

    public HierLvl(HierLvlPK hierLvlPK) {
        this.hierLvlPK = hierLvlPK;
    }

    public HierLvl(HierLvlPK hierLvlPK, String lvlDesc, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.hierLvlPK = hierLvlPK;
        this.lvlDesc = lvlDesc;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public HierLvl(String hierId, short lvlNbr) {
        this.hierLvlPK = new HierLvlPK(hierId, lvlNbr);
    }

    public HierLvlPK getHierLvlPK() {
        return hierLvlPK;
    }

    public void setHierLvlPK(HierLvlPK hierLvlPK) {
        this.hierLvlPK = hierLvlPK;
    }

    public String getLvlDesc() {
        return lvlDesc;
    }

    public void setLvlDesc(String lvlDesc) {
        this.lvlDesc = lvlDesc;
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
        hash += (hierLvlPK != null ? hierLvlPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof HierLvl)) {
            return false;
        }
        HierLvl other = (HierLvl) object;
        if ((this.hierLvlPK == null && other.hierLvlPK != null) || (this.hierLvlPK != null && !this.hierLvlPK.equals(other.hierLvlPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.HierLvl[ hierLvlPK=" + hierLvlPK + " ]";
    }

}
