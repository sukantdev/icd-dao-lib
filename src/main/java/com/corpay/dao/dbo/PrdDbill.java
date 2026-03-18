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
@Table(name = "PRD_DBILL", catalog = "", schema = "DBO")
public class PrdDbill implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "APPL_NBR")
    private String applNbr;
    @Basic(optional = false)
    @Column(name = "STUP_BLNG_MTHD")
    private String stupBlngMthd;
    @Basic(optional = false)
    @Column(name = "NBR_CARDS")
    private short nbrCards;
    @Basic(optional = false)
    @Column(name = "NBR_FUNDED_GALLONS")
    private String nbrFundedGallons;
    @Basic(optional = false)
    @Column(name = "AVG_GAL_FILL")
    private String avgGalFill;

    @Basic(optional = false)
    @Column(name = "DATA_CPTR_FEE")
    private BigDecimal dataCptrFee;
    @Basic(optional = false)
    @Column(name = "STRP_RDR")
    private BigDecimal strpRdr;
    @Basic(optional = false)
    @Column(name = "NBR_UNITS")
    private int nbrUnits;
    @Basic(optional = false)
    @Column(name = "CASH_ONLY_FEE")
    private BigDecimal cashOnlyFee;
    @Basic(optional = false)
    @Column(name = "STRP_RDR_PRTR")
    private BigDecimal strpRdrPrtr;
    @Basic(optional = false)
    @Column(name = "NBR_UNITS_PRTR")
    private int nbrUnitsPrtr;
    @Basic(optional = false)
    @Column(name = "FL_NTWKS_REQD")
    private String flNtwksReqd;
    @Basic(optional = false)
    @Column(name = "NTWK")
    private String ntwk;
    @Basic(optional = false)
    @Column(name = "CSTM_TS_FEES")
    private String cstmTsFees;
    @Basic(optional = false)
    @Column(name = "FL_PCHS_LMT")
    private int flPchsLmt;
    @Basic(optional = false)
    @Column(name = "DLY_FL")
    private Character dlyFl;
    @Basic(optional = false)
    @Column(name = "DLY_FL_AMT")
    private BigDecimal dlyFlAmt;
    @Basic(optional = false)
    @Column(name = "RCRNG_FL")
    private short rcrngFl;
    @Basic(optional = false)
    @Column(name = "RCRNG_FL_AMT")
    private BigDecimal rcrngFlAmt;
    @Basic(optional = false)
    @Column(name = "FL_GAL_LMT")
    private BigDecimal flGalLmt;
    @Basic(optional = false)
    @Column(name = "CASH_LMT")
    private BigDecimal cashLmt;
    @Basic(optional = false)
    @Column(name = "DLY_CASH")
    private Character dlyCash;
    @Basic(optional = false)
    @Column(name = "DLY_CASH_AMT")
    private BigDecimal dlyCashAmt;
    @Basic(optional = false)
    @Column(name = "RCRNG_CASH")
    private short rcrngCash;
    @Basic(optional = false)
    @Column(name = "RCRNG_CASH_AMT")
    private BigDecimal rcrngCashAmt;
    @Basic(optional = false)
    @Column(name = "ONE_TIMES_CASH")
    private Character oneTimesCash;
    @Basic(optional = false)
    @Column(name = "CRTY")
    private String crty;
    @Basic(optional = false)
    @Column(name = "DBILL_W_WHOM")
    private String dbillWWhom;
    @Basic(optional = false)
    @Column(name = "DLY_FL_PCHS")
    private Character dlyFlPchs;
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

    public PrdDbill() {
    }

    public PrdDbill(String applNbr) {
        this.applNbr = applNbr;
    }

    public PrdDbill(String applNbr, String stupBlngMthd, short nbrCards, String nbrFundedGallons, String avgGalFill, BigDecimal dataCptrFee, BigDecimal strpRdr, int nbrUnits, BigDecimal cashOnlyFee, BigDecimal strpRdrPrtr, int nbrUnitsPrtr, String flNtwksReqd, String ntwk, String cstmTsFees, int flPchsLmt, Character dlyFl, BigDecimal dlyFlAmt, short rcrngFl, BigDecimal rcrngFlAmt, BigDecimal flGalLmt, BigDecimal cashLmt, Character dlyCash, BigDecimal dlyCashAmt, short rcrngCash, BigDecimal rcrngCashAmt, Character oneTimesCash, String crty, String dbillWWhom, Character dlyFlPchs, String crtUsr, Date mdyTs, String mdyUsr, Date crtTs) {
        this.applNbr = applNbr;
        this.stupBlngMthd = stupBlngMthd;
        this.nbrCards = nbrCards;
        this.nbrFundedGallons = nbrFundedGallons;
        this.avgGalFill = avgGalFill;
        this.dataCptrFee = dataCptrFee;
        this.strpRdr = strpRdr;
        this.nbrUnits = nbrUnits;
        this.cashOnlyFee = cashOnlyFee;
        this.strpRdrPrtr = strpRdrPrtr;
        this.nbrUnitsPrtr = nbrUnitsPrtr;
        this.flNtwksReqd = flNtwksReqd;
        this.ntwk = ntwk;
        this.cstmTsFees = cstmTsFees;
        this.flPchsLmt = flPchsLmt;
        this.dlyFl = dlyFl;
        this.dlyFlAmt = dlyFlAmt;
        this.rcrngFl = rcrngFl;
        this.rcrngFlAmt = rcrngFlAmt;
        this.flGalLmt = flGalLmt;
        this.cashLmt = cashLmt;
        this.dlyCash = dlyCash;
        this.dlyCashAmt = dlyCashAmt;
        this.rcrngCash = rcrngCash;
        this.rcrngCashAmt = rcrngCashAmt;
        this.oneTimesCash = oneTimesCash;
        this.crty = crty;
        this.dbillWWhom = dbillWWhom;
        this.dlyFlPchs = dlyFlPchs;
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

    public String getStupBlngMthd() {
        return stupBlngMthd;
    }

    public void setStupBlngMthd(String stupBlngMthd) {
        this.stupBlngMthd = stupBlngMthd;
    }

    public short getNbrCards() {
        return nbrCards;
    }

    public void setNbrCards(short nbrCards) {
        this.nbrCards = nbrCards;
    }

    public String getNbrFundedGallons() {
        return nbrFundedGallons;
    }

    public void setNbrFundedGallons(String nbrFundedGallons) {
        this.nbrFundedGallons = nbrFundedGallons;
    }

    public String getAvgGalFill() {
        return avgGalFill;
    }

    public void setAvgGalFill(String avgGalFill) {
        this.avgGalFill = avgGalFill;
    }

    public BigDecimal getDataCptrFee() {
        return dataCptrFee;
    }

    public void setDataCptrFee(BigDecimal dataCptrFee) {
        this.dataCptrFee = dataCptrFee;
    }

    public BigDecimal getStrpRdr() {
        return strpRdr;
    }

    public void setStrpRdr(BigDecimal strpRdr) {
        this.strpRdr = strpRdr;
    }

    public int getNbrUnits() {
        return nbrUnits;
    }

    public void setNbrUnits(int nbrUnits) {
        this.nbrUnits = nbrUnits;
    }

    public BigDecimal getCashOnlyFee() {
        return cashOnlyFee;
    }

    public void setCashOnlyFee(BigDecimal cashOnlyFee) {
        this.cashOnlyFee = cashOnlyFee;
    }

    public BigDecimal getStrpRdrPrtr() {
        return strpRdrPrtr;
    }

    public void setStrpRdrPrtr(BigDecimal strpRdrPrtr) {
        this.strpRdrPrtr = strpRdrPrtr;
    }

    public int getNbrUnitsPrtr() {
        return nbrUnitsPrtr;
    }

    public void setNbrUnitsPrtr(int nbrUnitsPrtr) {
        this.nbrUnitsPrtr = nbrUnitsPrtr;
    }

    public String getFlNtwksReqd() {
        return flNtwksReqd;
    }

    public void setFlNtwksReqd(String flNtwksReqd) {
        this.flNtwksReqd = flNtwksReqd;
    }

    public String getNtwk() {
        return ntwk;
    }

    public void setNtwk(String ntwk) {
        this.ntwk = ntwk;
    }

    public String getCstmTsFees() {
        return cstmTsFees;
    }

    public void setCstmTsFees(String cstmTsFees) {
        this.cstmTsFees = cstmTsFees;
    }

    public int getFlPchsLmt() {
        return flPchsLmt;
    }

    public void setFlPchsLmt(int flPchsLmt) {
        this.flPchsLmt = flPchsLmt;
    }

    public Character getDlyFl() {
        return dlyFl;
    }

    public void setDlyFl(Character dlyFl) {
        this.dlyFl = dlyFl;
    }

    public BigDecimal getDlyFlAmt() {
        return dlyFlAmt;
    }

    public void setDlyFlAmt(BigDecimal dlyFlAmt) {
        this.dlyFlAmt = dlyFlAmt;
    }

    public short getRcrngFl() {
        return rcrngFl;
    }

    public void setRcrngFl(short rcrngFl) {
        this.rcrngFl = rcrngFl;
    }

    public BigDecimal getRcrngFlAmt() {
        return rcrngFlAmt;
    }

    public void setRcrngFlAmt(BigDecimal rcrngFlAmt) {
        this.rcrngFlAmt = rcrngFlAmt;
    }

    public BigDecimal getFlGalLmt() {
        return flGalLmt;
    }

    public void setFlGalLmt(BigDecimal flGalLmt) {
        this.flGalLmt = flGalLmt;
    }

    public BigDecimal getCashLmt() {
        return cashLmt;
    }

    public void setCashLmt(BigDecimal cashLmt) {
        this.cashLmt = cashLmt;
    }

    public Character getDlyCash() {
        return dlyCash;
    }

    public void setDlyCash(Character dlyCash) {
        this.dlyCash = dlyCash;
    }

    public BigDecimal getDlyCashAmt() {
        return dlyCashAmt;
    }

    public void setDlyCashAmt(BigDecimal dlyCashAmt) {
        this.dlyCashAmt = dlyCashAmt;
    }

    public short getRcrngCash() {
        return rcrngCash;
    }

    public void setRcrngCash(short rcrngCash) {
        this.rcrngCash = rcrngCash;
    }

    public BigDecimal getRcrngCashAmt() {
        return rcrngCashAmt;
    }

    public void setRcrngCashAmt(BigDecimal rcrngCashAmt) {
        this.rcrngCashAmt = rcrngCashAmt;
    }

    public Character getOneTimesCash() {
        return oneTimesCash;
    }

    public void setOneTimesCash(Character oneTimesCash) {
        this.oneTimesCash = oneTimesCash;
    }

    public String getCrty() {
        return crty;
    }

    public void setCrty(String crty) {
        this.crty = crty;
    }

    public String getDbillWWhom() {
        return dbillWWhom;
    }

    public void setDbillWWhom(String dbillWWhom) {
        this.dbillWWhom = dbillWWhom;
    }

    public Character getDlyFlPchs() {
        return dlyFlPchs;
    }

    public void setDlyFlPchs(Character dlyFlPchs) {
        this.dlyFlPchs = dlyFlPchs;
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

        if (!(object instanceof PrdDbill)) {
            return false;
        }
        PrdDbill other = (PrdDbill) object;
        if ((this.applNbr == null && other.applNbr != null) || (this.applNbr != null && !this.applNbr.equals(other.applNbr))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.PrdDbill[ applNbr=" + applNbr + " ]";
    }

}
