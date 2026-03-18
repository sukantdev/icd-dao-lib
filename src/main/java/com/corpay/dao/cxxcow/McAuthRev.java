package com.corpay.dao.cxxcow;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "MC_AUTH_REV", catalog = "", schema = "CXXCOW")
public class McAuthRev implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected McAuthRevPK mcAuthRevPK;

    @Basic(optional = false)
    @Column(name = "REV_HLD_ORIG_AMT")
    private BigDecimal revHldOrigAmt;
    @Basic(optional = false)
    @Column(name = "REV_HLD_NEW_AMT")
    private BigDecimal revHldNewAmt;
    @Basic(optional = false)
    @Column(name = "REV_HLD_CUM_AMT")
    private BigDecimal revHldCumAmt;
    @Basic(optional = false)
    @Column(name = "REV_RPLCMNT_AMT")
    private BigDecimal revRplcmntAmt;
    @Basic(optional = false)
    @Column(name = "REV_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date revTs;
    @Basic(optional = false)
    @Column(name = "REV_REASON")
    private Character revReason;
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

    public McAuthRev() {
    }

    public McAuthRev(McAuthRevPK mcAuthRevPK) {
        this.mcAuthRevPK = mcAuthRevPK;
    }

    public McAuthRev(McAuthRevPK mcAuthRevPK, BigDecimal revHldOrigAmt, BigDecimal revHldNewAmt, BigDecimal revHldCumAmt, BigDecimal revRplcmntAmt, Date revTs, Character revReason, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.mcAuthRevPK = mcAuthRevPK;
        this.revHldOrigAmt = revHldOrigAmt;
        this.revHldNewAmt = revHldNewAmt;
        this.revHldCumAmt = revHldCumAmt;
        this.revRplcmntAmt = revRplcmntAmt;
        this.revTs = revTs;
        this.revReason = revReason;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public McAuthRev(String authPan, Date authUtDt, int authApprovCd, Date authLocalTs, short revOcc) {
        this.mcAuthRevPK = new McAuthRevPK(authPan, authUtDt, authApprovCd, authLocalTs, revOcc);
    }

    public McAuthRevPK getMcAuthRevPK() {
        return mcAuthRevPK;
    }

    public void setMcAuthRevPK(McAuthRevPK mcAuthRevPK) {
        this.mcAuthRevPK = mcAuthRevPK;
    }

    public BigDecimal getRevHldOrigAmt() {
        return revHldOrigAmt;
    }

    public void setRevHldOrigAmt(BigDecimal revHldOrigAmt) {
        this.revHldOrigAmt = revHldOrigAmt;
    }

    public BigDecimal getRevHldNewAmt() {
        return revHldNewAmt;
    }

    public void setRevHldNewAmt(BigDecimal revHldNewAmt) {
        this.revHldNewAmt = revHldNewAmt;
    }

    public BigDecimal getRevHldCumAmt() {
        return revHldCumAmt;
    }

    public void setRevHldCumAmt(BigDecimal revHldCumAmt) {
        this.revHldCumAmt = revHldCumAmt;
    }

    public BigDecimal getRevRplcmntAmt() {
        return revRplcmntAmt;
    }

    public void setRevRplcmntAmt(BigDecimal revRplcmntAmt) {
        this.revRplcmntAmt = revRplcmntAmt;
    }

    public Date getRevTs() {
        return revTs;
    }

    public void setRevTs(Date revTs) {
        this.revTs = revTs;
    }

    public Character getRevReason() {
        return revReason;
    }

    public void setRevReason(Character revReason) {
        this.revReason = revReason;
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
        hash += (mcAuthRevPK != null ? mcAuthRevPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof McAuthRev)) {
            return false;
        }
        McAuthRev other = (McAuthRev) object;
        if ((this.mcAuthRevPK == null && other.mcAuthRevPK != null) || (this.mcAuthRevPK != null && !this.mcAuthRevPK.equals(other.mcAuthRevPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.cxxcow.McAuthRev[ mcAuthRevPK=" + mcAuthRevPK + " ]";
    }

}
