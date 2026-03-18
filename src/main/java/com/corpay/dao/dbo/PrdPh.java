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
@Table(name = "PRD_PH", catalog = "", schema = "DBO")
public class PrdPh implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "APPL_NBR")
    private String applNbr;

    @Basic(optional = false)
    @Column(name = "FEE_PER_MNT")
    private BigDecimal feePerMnt;
    @Basic(optional = false)
    @Column(name = "PH_INV")
    private Character phInv;
    @Basic(optional = false)
    @Column(name = "PH_USG_RPT")
    private Character phUsgRpt;
    @Basic(optional = false)
    @Column(name = "FNDG_OPTN_FLGS")
    private short fndgOptnFlgs;
    @Basic(optional = false)
    @Column(name = "MAX_NBR_DLY_CALLS")
    private int maxNbrDlyCalls;
    @Basic(optional = false)
    @Column(name = "MAX_DLY_CST")
    private BigDecimal maxDlyCst;
    @Basic(optional = false)
    @Column(name = "FREE_CL_CNT")
    private int freeClCnt;
    @Basic(optional = false)
    @Column(name = "USR_OPTN_FLGS")
    private short usrOptnFlgs;
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
    @Basic(optional = false)
    @Column(name = "CRT_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date crtTs;

    public PrdPh() {
    }

    public PrdPh(String applNbr) {
        this.applNbr = applNbr;
    }

    public PrdPh(String applNbr, BigDecimal feePerMnt, Character phInv, Character phUsgRpt, short fndgOptnFlgs, int maxNbrDlyCalls, BigDecimal maxDlyCst, int freeClCnt, short usrOptnFlgs, String crtUsr, Date mdyTs, String mdyUsr, Date crtTs) {
        this.applNbr = applNbr;
        this.feePerMnt = feePerMnt;
        this.phInv = phInv;
        this.phUsgRpt = phUsgRpt;
        this.fndgOptnFlgs = fndgOptnFlgs;
        this.maxNbrDlyCalls = maxNbrDlyCalls;
        this.maxDlyCst = maxDlyCst;
        this.freeClCnt = freeClCnt;
        this.usrOptnFlgs = usrOptnFlgs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
        this.crtTs = crtTs;
    }

    public String getApplNbr() {
        return applNbr;
    }

    public void setApplNbr(String applNbr) {
        this.applNbr = applNbr;
    }

    public BigDecimal getFeePerMnt() {
        return feePerMnt;
    }

    public void setFeePerMnt(BigDecimal feePerMnt) {
        this.feePerMnt = feePerMnt;
    }

    public Character getPhInv() {
        return phInv;
    }

    public void setPhInv(Character phInv) {
        this.phInv = phInv;
    }

    public Character getPhUsgRpt() {
        return phUsgRpt;
    }

    public void setPhUsgRpt(Character phUsgRpt) {
        this.phUsgRpt = phUsgRpt;
    }

    public short getFndgOptnFlgs() {
        return fndgOptnFlgs;
    }

    public void setFndgOptnFlgs(short fndgOptnFlgs) {
        this.fndgOptnFlgs = fndgOptnFlgs;
    }

    public int getMaxNbrDlyCalls() {
        return maxNbrDlyCalls;
    }

    public void setMaxNbrDlyCalls(int maxNbrDlyCalls) {
        this.maxNbrDlyCalls = maxNbrDlyCalls;
    }

    public BigDecimal getMaxDlyCst() {
        return maxDlyCst;
    }

    public void setMaxDlyCst(BigDecimal maxDlyCst) {
        this.maxDlyCst = maxDlyCst;
    }

    public int getFreeClCnt() {
        return freeClCnt;
    }

    public void setFreeClCnt(int freeClCnt) {
        this.freeClCnt = freeClCnt;
    }

    public short getUsrOptnFlgs() {
        return usrOptnFlgs;
    }

    public void setUsrOptnFlgs(short usrOptnFlgs) {
        this.usrOptnFlgs = usrOptnFlgs;
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

    public Date getCrtTs() {
        return crtTs;
    }

    public void setCrtTs(Date crtTs) {
        this.crtTs = crtTs;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (applNbr != null ? applNbr.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof PrdPh)) {
            return false;
        }
        PrdPh other = (PrdPh) object;
        if ((this.applNbr == null && other.applNbr != null) || (this.applNbr != null && !this.applNbr.equals(other.applNbr))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.PrdPh[ applNbr=" + applNbr + " ]";
    }

}
