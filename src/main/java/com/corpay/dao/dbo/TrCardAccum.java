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
@Table(name = "TR_CARD_ACCUM", catalog = "", schema = "DBO")
public class TrCardAccum implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CA_CARD_NUMBER")
    private String caCardNumber;
    @Basic(optional = false)
    @Column(name = "CA_CASH_LDATE")
    @Temporal(TemporalType.DATE)
    private Date caCashLdate;
    @Basic(optional = false)
    @Column(name = "CA_PURCHASE_LDATE")
    @Temporal(TemporalType.DATE)
    private Date caPurchaseLdate;
    @Basic(optional = false)
    @Column(name = "CA_DIESEL_LDATE")
    @Temporal(TemporalType.DATE)
    private Date caDieselLdate;
    @Basic(optional = false)
    @Column(name = "CA_REEFER_LDATE")
    @Temporal(TemporalType.DATE)
    private Date caReeferLdate;

    @Basic(optional = false)
    @Column(name = "CA_CASH_USED")
    private BigDecimal caCashUsed;
    @Basic(optional = false)
    @Column(name = "CA_PURCHASE_USED")
    private BigDecimal caPurchaseUsed;
    @Basic(optional = false)
    @Column(name = "CA_DIESEL_USED")
    private BigDecimal caDieselUsed;
    @Basic(optional = false)
    @Column(name = "CA_REEFER_USED")
    private BigDecimal caReeferUsed;
    @Basic(optional = false)
    @Column(name = "CA_OT_CASH_BAL")
    private BigDecimal caOtCashBal;
    @Basic(optional = false)
    @Column(name = "CA_OT_PURCHASE_BAL")
    private BigDecimal caOtPurchaseBal;
    @Basic(optional = false)
    @Column(name = "CA_EXPRESS_CASH_BAL")
    private BigDecimal caExpressCashBal;
    @Basic(optional = false)
    @Column(name = "CA_EXPRESS_CASH_HOLD")
    private BigDecimal caExpressCashHold;
    @Basic(optional = false)
    @Column(name = "CA_PIN_TRIES")
    private BigDecimal caPinTries;
    @Basic(optional = false)
    @Column(name = "CA_MCDB_DLY_TXN_COUNT")
    private int caMcdbDlyTxnCount;
    @Basic(optional = false)
    @Column(name = "CA_MCDB_DLY_AMOUNT_USED")
    private BigDecimal caMcdbDlyAmountUsed;
    @Basic(optional = false)
    @Column(name = "CA_MCDB_LDATE")
    @Temporal(TemporalType.DATE)
    private Date caMcdbLdate;
    @Basic(optional = false)
    @Column(name = "CA_FREE_TXN_COUNT")
    private int caFreeTxnCount;
    @Basic(optional = false)
    @Column(name = "CA_LAST_EXP_DATE")
    private String caLastExpDate;
    @Basic(optional = false)
    @Column(name = "CA_UPDATE_TSTAMP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date caUpdateTstamp;
    @Basic(optional = false)
    @Column(name = "CA_LAST_CRC")
    private long caLastCrc;
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

    public TrCardAccum() {
    }

    public TrCardAccum(String caCardNumber) {
        this.caCardNumber = caCardNumber;
    }

    public TrCardAccum(String caCardNumber, Date caCashLdate, Date caPurchaseLdate, Date caDieselLdate, Date caReeferLdate, BigDecimal caCashUsed, BigDecimal caPurchaseUsed, BigDecimal caDieselUsed, BigDecimal caReeferUsed, BigDecimal caOtCashBal, BigDecimal caOtPurchaseBal, BigDecimal caExpressCashBal, BigDecimal caExpressCashHold, BigDecimal caPinTries, int caMcdbDlyTxnCount, BigDecimal caMcdbDlyAmountUsed, Date caMcdbLdate, int caFreeTxnCount, String caLastExpDate, Date caUpdateTstamp, long caLastCrc, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.caCardNumber = caCardNumber;
        this.caCashLdate = caCashLdate;
        this.caPurchaseLdate = caPurchaseLdate;
        this.caDieselLdate = caDieselLdate;
        this.caReeferLdate = caReeferLdate;
        this.caCashUsed = caCashUsed;
        this.caPurchaseUsed = caPurchaseUsed;
        this.caDieselUsed = caDieselUsed;
        this.caReeferUsed = caReeferUsed;
        this.caOtCashBal = caOtCashBal;
        this.caOtPurchaseBal = caOtPurchaseBal;
        this.caExpressCashBal = caExpressCashBal;
        this.caExpressCashHold = caExpressCashHold;
        this.caPinTries = caPinTries;
        this.caMcdbDlyTxnCount = caMcdbDlyTxnCount;
        this.caMcdbDlyAmountUsed = caMcdbDlyAmountUsed;
        this.caMcdbLdate = caMcdbLdate;
        this.caFreeTxnCount = caFreeTxnCount;
        this.caLastExpDate = caLastExpDate;
        this.caUpdateTstamp = caUpdateTstamp;
        this.caLastCrc = caLastCrc;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public String getCaCardNumber() {
        return caCardNumber;
    }

    public void setCaCardNumber(String caCardNumber) {
        this.caCardNumber = caCardNumber;
    }

    public Date getCaCashLdate() {
        return caCashLdate;
    }

    public void setCaCashLdate(Date caCashLdate) {
        this.caCashLdate = caCashLdate;
    }

    public Date getCaPurchaseLdate() {
        return caPurchaseLdate;
    }

    public void setCaPurchaseLdate(Date caPurchaseLdate) {
        this.caPurchaseLdate = caPurchaseLdate;
    }

    public Date getCaDieselLdate() {
        return caDieselLdate;
    }

    public void setCaDieselLdate(Date caDieselLdate) {
        this.caDieselLdate = caDieselLdate;
    }

    public Date getCaReeferLdate() {
        return caReeferLdate;
    }

    public void setCaReeferLdate(Date caReeferLdate) {
        this.caReeferLdate = caReeferLdate;
    }

    public BigDecimal getCaCashUsed() {
        return caCashUsed;
    }

    public void setCaCashUsed(BigDecimal caCashUsed) {
        this.caCashUsed = caCashUsed;
    }

    public BigDecimal getCaPurchaseUsed() {
        return caPurchaseUsed;
    }

    public void setCaPurchaseUsed(BigDecimal caPurchaseUsed) {
        this.caPurchaseUsed = caPurchaseUsed;
    }

    public BigDecimal getCaDieselUsed() {
        return caDieselUsed;
    }

    public void setCaDieselUsed(BigDecimal caDieselUsed) {
        this.caDieselUsed = caDieselUsed;
    }

    public BigDecimal getCaReeferUsed() {
        return caReeferUsed;
    }

    public void setCaReeferUsed(BigDecimal caReeferUsed) {
        this.caReeferUsed = caReeferUsed;
    }

    public BigDecimal getCaOtCashBal() {
        return caOtCashBal;
    }

    public void setCaOtCashBal(BigDecimal caOtCashBal) {
        this.caOtCashBal = caOtCashBal;
    }

    public BigDecimal getCaOtPurchaseBal() {
        return caOtPurchaseBal;
    }

    public void setCaOtPurchaseBal(BigDecimal caOtPurchaseBal) {
        this.caOtPurchaseBal = caOtPurchaseBal;
    }

    public BigDecimal getCaExpressCashBal() {
        return caExpressCashBal;
    }

    public void setCaExpressCashBal(BigDecimal caExpressCashBal) {
        this.caExpressCashBal = caExpressCashBal;
    }

    public BigDecimal getCaExpressCashHold() {
        return caExpressCashHold;
    }

    public void setCaExpressCashHold(BigDecimal caExpressCashHold) {
        this.caExpressCashHold = caExpressCashHold;
    }

    public BigDecimal getCaPinTries() {
        return caPinTries;
    }

    public void setCaPinTries(BigDecimal caPinTries) {
        this.caPinTries = caPinTries;
    }

    public int getCaMcdbDlyTxnCount() {
        return caMcdbDlyTxnCount;
    }

    public void setCaMcdbDlyTxnCount(int caMcdbDlyTxnCount) {
        this.caMcdbDlyTxnCount = caMcdbDlyTxnCount;
    }

    public BigDecimal getCaMcdbDlyAmountUsed() {
        return caMcdbDlyAmountUsed;
    }

    public void setCaMcdbDlyAmountUsed(BigDecimal caMcdbDlyAmountUsed) {
        this.caMcdbDlyAmountUsed = caMcdbDlyAmountUsed;
    }

    public Date getCaMcdbLdate() {
        return caMcdbLdate;
    }

    public void setCaMcdbLdate(Date caMcdbLdate) {
        this.caMcdbLdate = caMcdbLdate;
    }

    public int getCaFreeTxnCount() {
        return caFreeTxnCount;
    }

    public void setCaFreeTxnCount(int caFreeTxnCount) {
        this.caFreeTxnCount = caFreeTxnCount;
    }

    public String getCaLastExpDate() {
        return caLastExpDate;
    }

    public void setCaLastExpDate(String caLastExpDate) {
        this.caLastExpDate = caLastExpDate;
    }

    public Date getCaUpdateTstamp() {
        return caUpdateTstamp;
    }

    public void setCaUpdateTstamp(Date caUpdateTstamp) {
        this.caUpdateTstamp = caUpdateTstamp;
    }

    public long getCaLastCrc() {
        return caLastCrc;
    }

    public void setCaLastCrc(long caLastCrc) {
        this.caLastCrc = caLastCrc;
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
        hash += (caCardNumber != null ? caCardNumber.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof TrCardAccum)) {
            return false;
        }
        TrCardAccum other = (TrCardAccum) object;
        if ((this.caCardNumber == null && other.caCardNumber != null) || (this.caCardNumber != null && !this.caCardNumber.equals(other.caCardNumber))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.TrCardAccum[ caCardNumber=" + caCardNumber + " ]";
    }

}
