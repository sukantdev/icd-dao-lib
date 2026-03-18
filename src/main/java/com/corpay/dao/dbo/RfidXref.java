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
@Table(name = "RFID_XREF", catalog = "", schema = "DBO")
public class RfidXref implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "RFID_NBR")
    private String rfidNbr;
    @Basic(optional = false)
    @Column(name = "RFID_UNIT_TRLR_NBR")
    private String rfidUnitTrlrNbr;
    @Basic(optional = false)
    @Column(name = "RFID_ACCT_CD")
    private String rfidAcctCd;
    @Basic(optional = false)
    @Column(name = "RFID_TAG_TYP_CD")
    private Character rfidTagTypCd;
    @Basic(optional = false)
    @Column(name = "RFID_TAG_TYP_VER_CD")
    private Character rfidTagTypVerCd;
    @Basic(optional = false)
    @Column(name = "CUST_ID")
    private String custId;
    @Basic(optional = false)
    @Column(name = "UNIT_TRLR_NBR")
    private String unitTrlrNbr;
    @Basic(optional = false)
    @Column(name = "RFID_STAT_CD")
    private Character rfidStatCd;
    @Basic(optional = false)
    @Column(name = "LST_USE_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lstUseTs;
    @Basic(optional = false)
    @Column(name = "LST_USE_CRD_NBR")
    private String lstUseCrdNbr;
    @Basic(optional = false)
    @Column(name = "LST_USE_LOC_ID")
    private String lstUseLocId;
    @Basic(optional = false)
    @Column(name = "LST_USE_DRVR_NBR")
    private String lstUseDrvrNbr;
    @Basic(optional = false)
    @Column(name = "LST_USE_TRLR_NBR")
    private String lstUseTrlrNbr;

    @Basic(optional = false)
    @Column(name = "LST_USE_HUB_LO_VAL")
    private BigDecimal lstUseHubLoVal;
    @Basic(optional = false)
    @Column(name = "LST_USE_HUB_HI_VAL")
    private BigDecimal lstUseHubHiVal;
    @Basic(optional = false)
    @Column(name = "LST_USE_TRLR_HUB_VAL")
    private BigDecimal lstUseTrlrHubVal;
    @Basic(optional = false)
    @Column(name = "LST_USE_TRLR_HRS")
    private BigDecimal lstUseTrlrHrs;
    @Basic(optional = false)
    @Column(name = "LST_USE_TRIP_NBR")
    private String lstUseTripNbr;
    @Basic(optional = false)
    @Column(name = "LST_USE_DL_NBR")
    private String lstUseDlNbr;
    @Basic(optional = false)
    @Column(name = "LST_USE_DL_ST")
    private String lstUseDlSt;
    @Basic(optional = false)
    @Column(name = "LST_USE_PO_NBR")
    private String lstUsePoNbr;
    @Basic(optional = false)
    @Column(name = "LST_USE_LST_NM")
    private String lstUseLstNm;
    @Basic(optional = false)
    @Column(name = "LST_USE_FST_NM")
    private String lstUseFstNm;
    @Basic(optional = false)
    @Column(name = "LST_USE_UNIT_NBR")
    private String lstUseUnitNbr;
    @Basic(optional = false)
    @Column(name = "RFID_CRT_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date rfidCrtTs;
    @Basic(optional = false)
    @Column(name = "RFID_CRT_USR")
    private String rfidCrtUsr;
    @Basic(optional = false)
    @Column(name = "RFID_ASSGN_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date rfidAssgnTs;
    @Basic(optional = false)
    @Column(name = "RFID_ASSGN_USR")
    private String rfidAssgnUsr;
    @Basic(optional = false)
    @Column(name = "RFID_BTCH_ID")
    private String rfidBtchId;
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

    public RfidXref() {
    }

    public RfidXref(String rfidNbr) {
        this.rfidNbr = rfidNbr;
    }

    public RfidXref(String rfidNbr, String rfidUnitTrlrNbr, String rfidAcctCd, Character rfidTagTypCd, Character rfidTagTypVerCd, String custId, String unitTrlrNbr, Character rfidStatCd, Date lstUseTs, String lstUseCrdNbr, String lstUseLocId, String lstUseDrvrNbr, String lstUseTrlrNbr, BigDecimal lstUseHubLoVal, BigDecimal lstUseHubHiVal, BigDecimal lstUseTrlrHubVal, BigDecimal lstUseTrlrHrs, String lstUseTripNbr, String lstUseDlNbr, String lstUseDlSt, String lstUsePoNbr, String lstUseLstNm, String lstUseFstNm, String lstUseUnitNbr, Date rfidCrtTs, String rfidCrtUsr, Date rfidAssgnTs, String rfidAssgnUsr, String rfidBtchId, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.rfidNbr = rfidNbr;
        this.rfidUnitTrlrNbr = rfidUnitTrlrNbr;
        this.rfidAcctCd = rfidAcctCd;
        this.rfidTagTypCd = rfidTagTypCd;
        this.rfidTagTypVerCd = rfidTagTypVerCd;
        this.custId = custId;
        this.unitTrlrNbr = unitTrlrNbr;
        this.rfidStatCd = rfidStatCd;
        this.lstUseTs = lstUseTs;
        this.lstUseCrdNbr = lstUseCrdNbr;
        this.lstUseLocId = lstUseLocId;
        this.lstUseDrvrNbr = lstUseDrvrNbr;
        this.lstUseTrlrNbr = lstUseTrlrNbr;
        this.lstUseHubLoVal = lstUseHubLoVal;
        this.lstUseHubHiVal = lstUseHubHiVal;
        this.lstUseTrlrHubVal = lstUseTrlrHubVal;
        this.lstUseTrlrHrs = lstUseTrlrHrs;
        this.lstUseTripNbr = lstUseTripNbr;
        this.lstUseDlNbr = lstUseDlNbr;
        this.lstUseDlSt = lstUseDlSt;
        this.lstUsePoNbr = lstUsePoNbr;
        this.lstUseLstNm = lstUseLstNm;
        this.lstUseFstNm = lstUseFstNm;
        this.lstUseUnitNbr = lstUseUnitNbr;
        this.rfidCrtTs = rfidCrtTs;
        this.rfidCrtUsr = rfidCrtUsr;
        this.rfidAssgnTs = rfidAssgnTs;
        this.rfidAssgnUsr = rfidAssgnUsr;
        this.rfidBtchId = rfidBtchId;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public String getRfidNbr() {
        return rfidNbr;
    }

    public void setRfidNbr(String rfidNbr) {
        this.rfidNbr = rfidNbr;
    }

    public String getRfidUnitTrlrNbr() {
        return rfidUnitTrlrNbr;
    }

    public void setRfidUnitTrlrNbr(String rfidUnitTrlrNbr) {
        this.rfidUnitTrlrNbr = rfidUnitTrlrNbr;
    }

    public String getRfidAcctCd() {
        return rfidAcctCd;
    }

    public void setRfidAcctCd(String rfidAcctCd) {
        this.rfidAcctCd = rfidAcctCd;
    }

    public Character getRfidTagTypCd() {
        return rfidTagTypCd;
    }

    public void setRfidTagTypCd(Character rfidTagTypCd) {
        this.rfidTagTypCd = rfidTagTypCd;
    }

    public Character getRfidTagTypVerCd() {
        return rfidTagTypVerCd;
    }

    public void setRfidTagTypVerCd(Character rfidTagTypVerCd) {
        this.rfidTagTypVerCd = rfidTagTypVerCd;
    }

    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId;
    }

    public String getUnitTrlrNbr() {
        return unitTrlrNbr;
    }

    public void setUnitTrlrNbr(String unitTrlrNbr) {
        this.unitTrlrNbr = unitTrlrNbr;
    }

    public Character getRfidStatCd() {
        return rfidStatCd;
    }

    public void setRfidStatCd(Character rfidStatCd) {
        this.rfidStatCd = rfidStatCd;
    }

    public Date getLstUseTs() {
        return lstUseTs;
    }

    public void setLstUseTs(Date lstUseTs) {
        this.lstUseTs = lstUseTs;
    }

    public String getLstUseCrdNbr() {
        return lstUseCrdNbr;
    }

    public void setLstUseCrdNbr(String lstUseCrdNbr) {
        this.lstUseCrdNbr = lstUseCrdNbr;
    }

    public String getLstUseLocId() {
        return lstUseLocId;
    }

    public void setLstUseLocId(String lstUseLocId) {
        this.lstUseLocId = lstUseLocId;
    }

    public String getLstUseDrvrNbr() {
        return lstUseDrvrNbr;
    }

    public void setLstUseDrvrNbr(String lstUseDrvrNbr) {
        this.lstUseDrvrNbr = lstUseDrvrNbr;
    }

    public String getLstUseTrlrNbr() {
        return lstUseTrlrNbr;
    }

    public void setLstUseTrlrNbr(String lstUseTrlrNbr) {
        this.lstUseTrlrNbr = lstUseTrlrNbr;
    }

    public BigDecimal getLstUseHubLoVal() {
        return lstUseHubLoVal;
    }

    public void setLstUseHubLoVal(BigDecimal lstUseHubLoVal) {
        this.lstUseHubLoVal = lstUseHubLoVal;
    }

    public BigDecimal getLstUseHubHiVal() {
        return lstUseHubHiVal;
    }

    public void setLstUseHubHiVal(BigDecimal lstUseHubHiVal) {
        this.lstUseHubHiVal = lstUseHubHiVal;
    }

    public BigDecimal getLstUseTrlrHubVal() {
        return lstUseTrlrHubVal;
    }

    public void setLstUseTrlrHubVal(BigDecimal lstUseTrlrHubVal) {
        this.lstUseTrlrHubVal = lstUseTrlrHubVal;
    }

    public BigDecimal getLstUseTrlrHrs() {
        return lstUseTrlrHrs;
    }

    public void setLstUseTrlrHrs(BigDecimal lstUseTrlrHrs) {
        this.lstUseTrlrHrs = lstUseTrlrHrs;
    }

    public String getLstUseTripNbr() {
        return lstUseTripNbr;
    }

    public void setLstUseTripNbr(String lstUseTripNbr) {
        this.lstUseTripNbr = lstUseTripNbr;
    }

    public String getLstUseDlNbr() {
        return lstUseDlNbr;
    }

    public void setLstUseDlNbr(String lstUseDlNbr) {
        this.lstUseDlNbr = lstUseDlNbr;
    }

    public String getLstUseDlSt() {
        return lstUseDlSt;
    }

    public void setLstUseDlSt(String lstUseDlSt) {
        this.lstUseDlSt = lstUseDlSt;
    }

    public String getLstUsePoNbr() {
        return lstUsePoNbr;
    }

    public void setLstUsePoNbr(String lstUsePoNbr) {
        this.lstUsePoNbr = lstUsePoNbr;
    }

    public String getLstUseLstNm() {
        return lstUseLstNm;
    }

    public void setLstUseLstNm(String lstUseLstNm) {
        this.lstUseLstNm = lstUseLstNm;
    }

    public String getLstUseFstNm() {
        return lstUseFstNm;
    }

    public void setLstUseFstNm(String lstUseFstNm) {
        this.lstUseFstNm = lstUseFstNm;
    }

    public String getLstUseUnitNbr() {
        return lstUseUnitNbr;
    }

    public void setLstUseUnitNbr(String lstUseUnitNbr) {
        this.lstUseUnitNbr = lstUseUnitNbr;
    }

    public Date getRfidCrtTs() {
        return rfidCrtTs;
    }

    public void setRfidCrtTs(Date rfidCrtTs) {
        this.rfidCrtTs = rfidCrtTs;
    }

    public String getRfidCrtUsr() {
        return rfidCrtUsr;
    }

    public void setRfidCrtUsr(String rfidCrtUsr) {
        this.rfidCrtUsr = rfidCrtUsr;
    }

    public Date getRfidAssgnTs() {
        return rfidAssgnTs;
    }

    public void setRfidAssgnTs(Date rfidAssgnTs) {
        this.rfidAssgnTs = rfidAssgnTs;
    }

    public String getRfidAssgnUsr() {
        return rfidAssgnUsr;
    }

    public void setRfidAssgnUsr(String rfidAssgnUsr) {
        this.rfidAssgnUsr = rfidAssgnUsr;
    }

    public String getRfidBtchId() {
        return rfidBtchId;
    }

    public void setRfidBtchId(String rfidBtchId) {
        this.rfidBtchId = rfidBtchId;
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
        hash += (rfidNbr != null ? rfidNbr.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof RfidXref)) {
            return false;
        }
        RfidXref other = (RfidXref) object;
        if ((this.rfidNbr == null && other.rfidNbr != null) || (this.rfidNbr != null && !this.rfidNbr.equals(other.rfidNbr))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.RfidXref[ rfidNbr=" + rfidNbr + " ]";
    }

}
