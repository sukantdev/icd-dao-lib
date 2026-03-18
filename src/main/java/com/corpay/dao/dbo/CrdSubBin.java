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
@Table(name = "CRD_SUB_BIN", catalog = "", schema = "DBO")
public class CrdSubBin implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CrdSubBinPK crdSubBinPK;
    @Basic(optional = false)
    @Column(name = "CRD_DFLT_FLG")
    private Character crdDfltFlg;
    @Basic(optional = false)
    @Column(name = "CRD_BIN")
    private int crdBin;
    @Basic(optional = false)
    @Column(name = "CRD_STA")
    private int crdSta;
    @Basic(optional = false)
    @Column(name = "CRD_END")
    private int crdEnd;
    @Basic(optional = false)
    @Column(name = "CRD_CUR")
    private int crdCur;
    @Basic(optional = false)
    @Column(name = "CRD_PRI")
    private int crdPri;
    @Basic(optional = false)
    @Column(name = "CRD_FLGS")
    private String crdFlgs;
    @Basic(optional = false)
    @Column(name = "CRD_STAT")
    private Character crdStat;
    @Basic(optional = false)
    @Column(name = "CRD_CMNT")
    private String crdCmnt;
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
    @Basic(optional = false)
    @Column(name = "BLK_SIZE_AMT")
    private int blkSizeAmt;
    @Basic(optional = false)
    @Column(name = "NXT_SEQ_NBR")
    private int nxtSeqNbr;
    @Basic(optional = false)
    @Column(name = "MIN_REMAIN_AMT")
    private int minRemainAmt;
    @Basic(optional = false)
    @Column(name = "LST_SEQ_NBR")
    private int lstSeqNbr;
    @Basic(optional = false)
    @Column(name = "CRD_DIGITAL_WALLET_FLG")
    private Character crdDigitalWalletFlg;

    public CrdSubBin() {
    }

    public CrdSubBin(CrdSubBinPK crdSubBinPK) {
        this.crdSubBinPK = crdSubBinPK;
    }

    public CrdSubBin(CrdSubBinPK crdSubBinPK, Character crdDfltFlg, int crdBin, int crdSta, int crdEnd, int crdCur, int crdPri, String crdFlgs, Character crdStat, String crdCmnt, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr, int blkSizeAmt, int nxtSeqNbr, int minRemainAmt, int lstSeqNbr, Character crdDigitalWalletFlg) {
        this.crdSubBinPK = crdSubBinPK;
        this.crdDfltFlg = crdDfltFlg;
        this.crdBin = crdBin;
        this.crdSta = crdSta;
        this.crdEnd = crdEnd;
        this.crdCur = crdCur;
        this.crdPri = crdPri;
        this.crdFlgs = crdFlgs;
        this.crdStat = crdStat;
        this.crdCmnt = crdCmnt;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
        this.blkSizeAmt = blkSizeAmt;
        this.nxtSeqNbr = nxtSeqNbr;
        this.minRemainAmt = minRemainAmt;
        this.lstSeqNbr = lstSeqNbr;
        this.crdDigitalWalletFlg = crdDigitalWalletFlg;
    }

    public CrdSubBin(String crdTyp, String crdFrmt) {
        this.crdSubBinPK = new CrdSubBinPK(crdTyp, crdFrmt);
    }

    public CrdSubBinPK getCrdSubBinPK() {
        return crdSubBinPK;
    }

    public void setCrdSubBinPK(CrdSubBinPK crdSubBinPK) {
        this.crdSubBinPK = crdSubBinPK;
    }

    public Character getCrdDfltFlg() {
        return crdDfltFlg;
    }

    public void setCrdDfltFlg(Character crdDfltFlg) {
        this.crdDfltFlg = crdDfltFlg;
    }

    public int getCrdBin() {
        return crdBin;
    }

    public void setCrdBin(int crdBin) {
        this.crdBin = crdBin;
    }

    public int getCrdSta() {
        return crdSta;
    }

    public void setCrdSta(int crdSta) {
        this.crdSta = crdSta;
    }

    public int getCrdEnd() {
        return crdEnd;
    }

    public void setCrdEnd(int crdEnd) {
        this.crdEnd = crdEnd;
    }

    public int getCrdCur() {
        return crdCur;
    }

    public void setCrdCur(int crdCur) {
        this.crdCur = crdCur;
    }

    public int getCrdPri() {
        return crdPri;
    }

    public void setCrdPri(int crdPri) {
        this.crdPri = crdPri;
    }

    public String getCrdFlgs() {
        return crdFlgs;
    }

    public void setCrdFlgs(String crdFlgs) {
        this.crdFlgs = crdFlgs;
    }

    public Character getCrdStat() {
        return crdStat;
    }

    public void setCrdStat(Character crdStat) {
        this.crdStat = crdStat;
    }

    public String getCrdCmnt() {
        return crdCmnt;
    }

    public void setCrdCmnt(String crdCmnt) {
        this.crdCmnt = crdCmnt;
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

    public int getBlkSizeAmt() {
        return blkSizeAmt;
    }

    public void setBlkSizeAmt(int blkSizeAmt) {
        this.blkSizeAmt = blkSizeAmt;
    }

    public int getNxtSeqNbr() {
        return nxtSeqNbr;
    }

    public void setNxtSeqNbr(int nxtSeqNbr) {
        this.nxtSeqNbr = nxtSeqNbr;
    }

    public int getMinRemainAmt() {
        return minRemainAmt;
    }

    public void setMinRemainAmt(int minRemainAmt) {
        this.minRemainAmt = minRemainAmt;
    }

    public int getLstSeqNbr() {
        return lstSeqNbr;
    }

    public void setLstSeqNbr(int lstSeqNbr) {
        this.lstSeqNbr = lstSeqNbr;
    }

    public Character getCrdDigitalWalletFlg() {
        return crdDigitalWalletFlg;
    }

    public void setCrdDigitalWalletFlg(Character crdDigitalWalletFlg) {
        this.crdDigitalWalletFlg = crdDigitalWalletFlg;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (crdSubBinPK != null ? crdSubBinPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof CrdSubBin)) {
            return false;
        }
        CrdSubBin other = (CrdSubBin) object;
        if ((this.crdSubBinPK == null && other.crdSubBinPK != null) || (this.crdSubBinPK != null && !this.crdSubBinPK.equals(other.crdSubBinPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.CrdSubBin[ crdSubBinPK=" + crdSubBinPK + " ]";
    }

}
