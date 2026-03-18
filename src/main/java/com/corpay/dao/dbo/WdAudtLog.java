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
@Table(name = "WD_AUDT_LOG", catalog = "", schema = "DBO")
public class WdAudtLog implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CRT_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date crtTs;
    @Basic(optional = false)
    @Column(name = "BT_BNK_REF_NBR")
    private String btBnkRefNbr;

    @Basic(optional = false)
    @Column(name = "BT_PMT_AMT")
    private BigDecimal btPmtAmt;
    @Basic(optional = false)
    @Column(name = "BT_ACCT_NBR")
    private String btAcctNbr;
    @Basic(optional = false)
    @Column(name = "BT_PMT_NBR")
    private int btPmtNbr;
    @Basic(optional = false)
    @Column(name = "BT_TRNS_DT")
    @Temporal(TemporalType.DATE)
    private Date btTrnsDt;
    @Basic(optional = false)
    @Column(name = "TYP_CD")
    private String typCd;
    @Basic(optional = false)
    @Column(name = "SUM_1_NBR")
    private int sum1Nbr;
    @Basic(optional = false)
    @Column(name = "SUM_2_NBR")
    private int sum2Nbr;
    @Basic(optional = false)
    @Column(name = "NOTE_TXT")
    private String noteTxt;
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

    public WdAudtLog() {
    }

    public WdAudtLog(Date crtTs) {
        this.crtTs = crtTs;
    }

    public WdAudtLog(Date crtTs, String btBnkRefNbr, BigDecimal btPmtAmt, String btAcctNbr, int btPmtNbr, Date btTrnsDt, String typCd, int sum1Nbr, int sum2Nbr, String noteTxt, String crtUsr, Date mdyTs, String mdyUsr) {
        this.crtTs = crtTs;
        this.btBnkRefNbr = btBnkRefNbr;
        this.btPmtAmt = btPmtAmt;
        this.btAcctNbr = btAcctNbr;
        this.btPmtNbr = btPmtNbr;
        this.btTrnsDt = btTrnsDt;
        this.typCd = typCd;
        this.sum1Nbr = sum1Nbr;
        this.sum2Nbr = sum2Nbr;
        this.noteTxt = noteTxt;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public Date getCrtTs() {
        return crtTs;
    }

    public void setCrtTs(Date crtTs) {
        this.crtTs = crtTs;
    }

    public String getBtBnkRefNbr() {
        return btBnkRefNbr;
    }

    public void setBtBnkRefNbr(String btBnkRefNbr) {
        this.btBnkRefNbr = btBnkRefNbr;
    }

    public BigDecimal getBtPmtAmt() {
        return btPmtAmt;
    }

    public void setBtPmtAmt(BigDecimal btPmtAmt) {
        this.btPmtAmt = btPmtAmt;
    }

    public String getBtAcctNbr() {
        return btAcctNbr;
    }

    public void setBtAcctNbr(String btAcctNbr) {
        this.btAcctNbr = btAcctNbr;
    }

    public int getBtPmtNbr() {
        return btPmtNbr;
    }

    public void setBtPmtNbr(int btPmtNbr) {
        this.btPmtNbr = btPmtNbr;
    }

    public Date getBtTrnsDt() {
        return btTrnsDt;
    }

    public void setBtTrnsDt(Date btTrnsDt) {
        this.btTrnsDt = btTrnsDt;
    }

    public String getTypCd() {
        return typCd;
    }

    public void setTypCd(String typCd) {
        this.typCd = typCd;
    }

    public int getSum1Nbr() {
        return sum1Nbr;
    }

    public void setSum1Nbr(int sum1Nbr) {
        this.sum1Nbr = sum1Nbr;
    }

    public int getSum2Nbr() {
        return sum2Nbr;
    }

    public void setSum2Nbr(int sum2Nbr) {
        this.sum2Nbr = sum2Nbr;
    }

    public String getNoteTxt() {
        return noteTxt;
    }

    public void setNoteTxt(String noteTxt) {
        this.noteTxt = noteTxt;
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
        hash += (crtTs != null ? crtTs.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof WdAudtLog)) {
            return false;
        }
        WdAudtLog other = (WdAudtLog) object;
        if ((this.crtTs == null && other.crtTs != null) || (this.crtTs != null && !this.crtTs.equals(other.crtTs))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.WdAudtLog[ crtTs=" + crtTs + " ]";
    }

}
