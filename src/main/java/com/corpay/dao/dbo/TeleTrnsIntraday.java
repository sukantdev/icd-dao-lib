/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author Sukant.Tiwari
 */
@Entity
@Table(name = "TELE_TRNS_INTRADAY", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "TeleTrnsIntraday.findAll", query = "SELECT t FROM TeleTrnsIntraday t")})
public class TeleTrnsIntraday implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected TeleTrnsIntradayPK teleTrnsIntradayPK;
    @Basic(optional = false)
    @Column(name = "TELE_SENT_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date teleSentTs;
    @Basic(optional = false)
    @Column(name = "ACCT_NBR")
    private String acctNbr;
    @Basic(optional = false)
    @Column(name = "CUST_ID")
    private String custId;
    @Basic(optional = false)
    @Column(name = "SYSTEM_ID")
    private String systemId;
    @Basic(optional = false)
    @Column(name = "RPT_NBR")
    private int rptNbr;
    @Basic(optional = false)
    @Column(name = "CRD_NBR")
    private String crdNbr;
    @Basic(optional = false)
    @Column(name = "TELE_VIN")
    private String teleVin;
    @Basic(optional = false)
    @Column(name = "TELE_PARTNER_UNQ_ID")
    private String telePartnerUnqId;
    @Basic(optional = false)
    @Column(name = "TXN_DATE")
    @Temporal(TemporalType.DATE)
    private Date txnDate;
    @Basic(optional = false)
    @Column(name = "TXN_TIME")
    @Temporal(TemporalType.TIME)
    private Date txnTime;
    @Basic(optional = false)
    @Column(name = "TXN_POST_DATE")
    @Temporal(TemporalType.DATE)
    private Date txnPostDate;
    @Basic(optional = false)
    @Column(name = "TXN_POST_TIME")
    @Temporal(TemporalType.TIME)
    private Date txnPostTime;
    @Basic(optional = false)
    @Column(name = "TXN_POST_CTL_NBR")
    private String txnPostCtlNbr;
    @Basic(optional = false)
    @Column(name = "MRCH_LOC_ID")
    private String mrchLocId;
    @Basic(optional = false)
    @Column(name = "MRCH_NAME")
    private String mrchName;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "MRCH_LAT")
    private BigDecimal mrchLat;
    @Basic(optional = false)
    @Column(name = "MRCH_LONG")
    private BigDecimal mrchLong;
    @Basic(optional = false)
    @Column(name = "VEH_ODO")
    private String vehOdo;
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

    public TeleTrnsIntraday() {
    }

    public TeleTrnsIntraday(TeleTrnsIntradayPK teleTrnsIntradayPK) {
        this.teleTrnsIntradayPK = teleTrnsIntradayPK;
    }

    public TeleTrnsIntraday(TeleTrnsIntradayPK teleTrnsIntradayPK, Date teleSentTs, String acctNbr, String custId, String systemId, int rptNbr, String crdNbr, String teleVin, String telePartnerUnqId, Date txnDate, Date txnTime, Date txnPostDate, Date txnPostTime, String txnPostCtlNbr, String mrchLocId, String mrchName, BigDecimal mrchLat, BigDecimal mrchLong, String vehOdo, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.teleTrnsIntradayPK = teleTrnsIntradayPK;
        this.teleSentTs = teleSentTs;
        this.acctNbr = acctNbr;
        this.custId = custId;
        this.systemId = systemId;
        this.rptNbr = rptNbr;
        this.crdNbr = crdNbr;
        this.teleVin = teleVin;
        this.telePartnerUnqId = telePartnerUnqId;
        this.txnDate = txnDate;
        this.txnTime = txnTime;
        this.txnPostDate = txnPostDate;
        this.txnPostTime = txnPostTime;
        this.txnPostCtlNbr = txnPostCtlNbr;
        this.mrchLocId = mrchLocId;
        this.mrchName = mrchName;
        this.mrchLat = mrchLat;
        this.mrchLong = mrchLong;
        this.vehOdo = vehOdo;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public TeleTrnsIntraday(String partnerId, Date teleTrnsTs, long trkNbr) {
        this.teleTrnsIntradayPK = new TeleTrnsIntradayPK(partnerId, teleTrnsTs, trkNbr);
    }

    public TeleTrnsIntradayPK getTeleTrnsIntradayPK() {
        return teleTrnsIntradayPK;
    }

    public void setTeleTrnsIntradayPK(TeleTrnsIntradayPK teleTrnsIntradayPK) {
        this.teleTrnsIntradayPK = teleTrnsIntradayPK;
    }

    public Date getTeleSentTs() {
        return teleSentTs;
    }

    public void setTeleSentTs(Date teleSentTs) {
        this.teleSentTs = teleSentTs;
    }

    public String getAcctNbr() {
        return acctNbr;
    }

    public void setAcctNbr(String acctNbr) {
        this.acctNbr = acctNbr;
    }

    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId;
    }

    public String getSystemId() {
        return systemId;
    }

    public void setSystemId(String systemId) {
        this.systemId = systemId;
    }

    public int getRptNbr() {
        return rptNbr;
    }

    public void setRptNbr(int rptNbr) {
        this.rptNbr = rptNbr;
    }

    public String getCrdNbr() {
        return crdNbr;
    }

    public void setCrdNbr(String crdNbr) {
        this.crdNbr = crdNbr;
    }

    public String getTeleVin() {
        return teleVin;
    }

    public void setTeleVin(String teleVin) {
        this.teleVin = teleVin;
    }

    public String getTelePartnerUnqId() {
        return telePartnerUnqId;
    }

    public void setTelePartnerUnqId(String telePartnerUnqId) {
        this.telePartnerUnqId = telePartnerUnqId;
    }

    public Date getTxnDate() {
        return txnDate;
    }

    public void setTxnDate(Date txnDate) {
        this.txnDate = txnDate;
    }

    public Date getTxnTime() {
        return txnTime;
    }

    public void setTxnTime(Date txnTime) {
        this.txnTime = txnTime;
    }

    public Date getTxnPostDate() {
        return txnPostDate;
    }

    public void setTxnPostDate(Date txnPostDate) {
        this.txnPostDate = txnPostDate;
    }

    public Date getTxnPostTime() {
        return txnPostTime;
    }

    public void setTxnPostTime(Date txnPostTime) {
        this.txnPostTime = txnPostTime;
    }

    public String getTxnPostCtlNbr() {
        return txnPostCtlNbr;
    }

    public void setTxnPostCtlNbr(String txnPostCtlNbr) {
        this.txnPostCtlNbr = txnPostCtlNbr;
    }

    public String getMrchLocId() {
        return mrchLocId;
    }

    public void setMrchLocId(String mrchLocId) {
        this.mrchLocId = mrchLocId;
    }

    public String getMrchName() {
        return mrchName;
    }

    public void setMrchName(String mrchName) {
        this.mrchName = mrchName;
    }

    public BigDecimal getMrchLat() {
        return mrchLat;
    }

    public void setMrchLat(BigDecimal mrchLat) {
        this.mrchLat = mrchLat;
    }

    public BigDecimal getMrchLong() {
        return mrchLong;
    }

    public void setMrchLong(BigDecimal mrchLong) {
        this.mrchLong = mrchLong;
    }

    public String getVehOdo() {
        return vehOdo;
    }

    public void setVehOdo(String vehOdo) {
        this.vehOdo = vehOdo;
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
        hash += (teleTrnsIntradayPK != null ? teleTrnsIntradayPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TeleTrnsIntraday)) {
            return false;
        }
        TeleTrnsIntraday other = (TeleTrnsIntraday) object;
        if ((this.teleTrnsIntradayPK == null && other.teleTrnsIntradayPK != null) || (this.teleTrnsIntradayPK != null && !this.teleTrnsIntradayPK.equals(other.teleTrnsIntradayPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.TeleTrnsIntraday[ teleTrnsIntradayPK=" + teleTrnsIntradayPK + " ]";
    }
    
}
