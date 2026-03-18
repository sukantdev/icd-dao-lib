package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "BKGRD_CHKS", catalog = "", schema = "DBO")
public class BkgrdChks implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "APPL_NBR")
    private String applNbr;
    @Basic(optional = false)
    @Column(name = "CDN_ACCT_CD")
    private String cdnAcctCd;
    @Basic(optional = false)
    @Column(name = "NBR_DRIVERS")
    private int nbrDrivers;

    @Basic(optional = false)
    @Column(name = "RT_PER_DRV")
    private BigDecimal rtPerDrv;
    @Basic(optional = false)
    @Column(name = "EFFECTIVE_SRV_DT")
    @Temporal(TemporalType.DATE)
    private Date effectiveSrvDt;
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

    public BkgrdChks() {
    }

    public BkgrdChks(String applNbr) {
        this.applNbr = applNbr;
    }

    public BkgrdChks(String applNbr, String cdnAcctCd, int nbrDrivers, BigDecimal rtPerDrv, Date effectiveSrvDt, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.applNbr = applNbr;
        this.cdnAcctCd = cdnAcctCd;
        this.nbrDrivers = nbrDrivers;
        this.rtPerDrv = rtPerDrv;
        this.effectiveSrvDt = effectiveSrvDt;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public String getApplNbr() {
        return applNbr;
    }

    public void setApplNbr(String applNbr) {
        this.applNbr = applNbr;
    }

    public String getCdnAcctCd() {
        return cdnAcctCd;
    }

    public void setCdnAcctCd(String cdnAcctCd) {
        this.cdnAcctCd = cdnAcctCd;
    }

    public int getNbrDrivers() {
        return nbrDrivers;
    }

    public void setNbrDrivers(int nbrDrivers) {
        this.nbrDrivers = nbrDrivers;
    }

    public BigDecimal getRtPerDrv() {
        return rtPerDrv;
    }

    public void setRtPerDrv(BigDecimal rtPerDrv) {
        this.rtPerDrv = rtPerDrv;
    }

    public Date getEffectiveSrvDt() {
        return effectiveSrvDt;
    }

    public void setEffectiveSrvDt(Date effectiveSrvDt) {
        this.effectiveSrvDt = effectiveSrvDt;
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
        hash += (applNbr != null ? applNbr.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof BkgrdChks)) {
            return false;
        }
        BkgrdChks other = (BkgrdChks) object;
        if ((this.applNbr == null && other.applNbr != null) || (this.applNbr != null && !this.applNbr.equals(other.applNbr))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.BkgrdChks[ applNbr=" + applNbr + " ]";
    }

}
