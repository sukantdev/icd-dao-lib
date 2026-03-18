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
@Table(name = "STATE_FEE_WAIVER", catalog = "", schema = "DBO")
public class StateFeeWaiver implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected StateFeeWaiverPK stateFeeWaiverPK;
    @Basic(optional = false)
    @Column(name = "WAIVE_FLG")
    private Character waiveFlg;
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

    public StateFeeWaiver() {
    }

    public StateFeeWaiver(StateFeeWaiverPK stateFeeWaiverPK) {
        this.stateFeeWaiverPK = stateFeeWaiverPK;
    }

    public StateFeeWaiver(StateFeeWaiverPK stateFeeWaiverPK, Character waiveFlg, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.stateFeeWaiverPK = stateFeeWaiverPK;
        this.waiveFlg = waiveFlg;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public StateFeeWaiver(String stateCd, String feeTypCd) {
        this.stateFeeWaiverPK = new StateFeeWaiverPK(stateCd, feeTypCd);
    }

    public StateFeeWaiverPK getStateFeeWaiverPK() {
        return stateFeeWaiverPK;
    }

    public void setStateFeeWaiverPK(StateFeeWaiverPK stateFeeWaiverPK) {
        this.stateFeeWaiverPK = stateFeeWaiverPK;
    }

    public Character getWaiveFlg() {
        return waiveFlg;
    }

    public void setWaiveFlg(Character waiveFlg) {
        this.waiveFlg = waiveFlg;
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
        hash += (stateFeeWaiverPK != null ? stateFeeWaiverPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof StateFeeWaiver)) {
            return false;
        }
        StateFeeWaiver other = (StateFeeWaiver) object;
        if ((this.stateFeeWaiverPK == null && other.stateFeeWaiverPK != null) || (this.stateFeeWaiverPK != null && !this.stateFeeWaiverPK.equals(other.stateFeeWaiverPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.StateFeeWaiver[ stateFeeWaiverPK=" + stateFeeWaiverPK + " ]";
    }

}
