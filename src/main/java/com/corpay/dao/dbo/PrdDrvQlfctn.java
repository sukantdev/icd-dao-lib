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
@Table(name = "PRD_DRV_QLFCTN", catalog = "", schema = "DBO")
public class PrdDrvQlfctn implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "APPL_NBR")
    private String applNbr;
    @Basic(optional = false)
    @Column(name = "CDN_ACCT_CD")
    private String cdnAcctCd;
    @Basic(optional = false)
    @Column(name = "NBR_DRVS")
    private int nbrDrvs;

    @Basic(optional = false)
    @Column(name = "MTHLY_RT_PER_DRV")
    private BigDecimal mthlyRtPerDrv;
    @Basic(optional = false)
    @Column(name = "STUP_FEE_PER_DRV")
    private BigDecimal stupFeePerDrv;
    @Basic(optional = false)
    @Column(name = "EFCTV_SRV_DT")
    @Temporal(TemporalType.DATE)
    private Date efctvSrvDt;
    @Basic(optional = false)
    @Column(name = "DRUG_TEST_FLG")
    private Character drugTestFlg;
    @Basic(optional = false)
    @Column(name = "INACT_DRV_FLG")
    private Character inactDrvFlg;
    @Basic(optional = false)
    @Column(name = "ACT_DRV_FLG")
    private Character actDrvFlg;
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

    public PrdDrvQlfctn() {
    }

    public PrdDrvQlfctn(String applNbr) {
        this.applNbr = applNbr;
    }

    public PrdDrvQlfctn(String applNbr, String cdnAcctCd, int nbrDrvs, BigDecimal mthlyRtPerDrv, BigDecimal stupFeePerDrv, Date efctvSrvDt, Character drugTestFlg, Character inactDrvFlg, Character actDrvFlg, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.applNbr = applNbr;
        this.cdnAcctCd = cdnAcctCd;
        this.nbrDrvs = nbrDrvs;
        this.mthlyRtPerDrv = mthlyRtPerDrv;
        this.stupFeePerDrv = stupFeePerDrv;
        this.efctvSrvDt = efctvSrvDt;
        this.drugTestFlg = drugTestFlg;
        this.inactDrvFlg = inactDrvFlg;
        this.actDrvFlg = actDrvFlg;
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

    public int getNbrDrvs() {
        return nbrDrvs;
    }

    public void setNbrDrvs(int nbrDrvs) {
        this.nbrDrvs = nbrDrvs;
    }

    public BigDecimal getMthlyRtPerDrv() {
        return mthlyRtPerDrv;
    }

    public void setMthlyRtPerDrv(BigDecimal mthlyRtPerDrv) {
        this.mthlyRtPerDrv = mthlyRtPerDrv;
    }

    public BigDecimal getStupFeePerDrv() {
        return stupFeePerDrv;
    }

    public void setStupFeePerDrv(BigDecimal stupFeePerDrv) {
        this.stupFeePerDrv = stupFeePerDrv;
    }

    public Date getEfctvSrvDt() {
        return efctvSrvDt;
    }

    public void setEfctvSrvDt(Date efctvSrvDt) {
        this.efctvSrvDt = efctvSrvDt;
    }

    public Character getDrugTestFlg() {
        return drugTestFlg;
    }

    public void setDrugTestFlg(Character drugTestFlg) {
        this.drugTestFlg = drugTestFlg;
    }

    public Character getInactDrvFlg() {
        return inactDrvFlg;
    }

    public void setInactDrvFlg(Character inactDrvFlg) {
        this.inactDrvFlg = inactDrvFlg;
    }

    public Character getActDrvFlg() {
        return actDrvFlg;
    }

    public void setActDrvFlg(Character actDrvFlg) {
        this.actDrvFlg = actDrvFlg;
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

        if (!(object instanceof PrdDrvQlfctn)) {
            return false;
        }
        PrdDrvQlfctn other = (PrdDrvQlfctn) object;
        if ((this.applNbr == null && other.applNbr != null) || (this.applNbr != null && !this.applNbr.equals(other.applNbr))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.PrdDrvQlfctn[ applNbr=" + applNbr + " ]";
    }

}
