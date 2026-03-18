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
@Table(name = "PFID_MAINT", catalog = "", schema = "DBO")
public class PfidMaint implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PFID_CD")
    private String pfidCd;
    @Basic(optional = false)
    @Column(name = "PFID_CD_DESC")
    private String pfidCdDesc;
    @Basic(optional = false)
    @Column(name = "PFID_FREQ_CD")
    private Character pfidFreqCd;
    @Basic(optional = false)
    @Column(name = "PFID_SEC_CD")
    private String pfidSecCd;
    @Basic(optional = false)
    @Column(name = "PFID_STAT_CD")
    private Character pfidStatCd;
    @Basic(optional = false)
    @Column(name = "EFFCTV_DT_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date effctvDtTs;
    @Basic(optional = false)
    @Column(name = "PFID_LST_RECV_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date pfidLstRecvTs;
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
    @Column(name = "MDY_USER")
    private String mdyUser;
    @Basic(optional = false)
    @Column(name = "PFID_FILE_NAME")
    private String pfidFileName;
    @Basic(optional = false)
    @Column(name = "PFID_FILE_SWITCH")
    private Character pfidFileSwitch;
    @Basic(optional = false)
    @Column(name = "PFID_LAST_MODIFIED_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date pfidLastModifiedTs;
    @Basic(optional = false)
    @Column(name = "PFID_EMAIL_ADDR")
    private String pfidEmailAddr;
    @Basic(optional = false)
    @Column(name = "PFID_PRC_VALID_FLG")
    private Character pfidPrcValidFlg;
    @Basic(optional = false)
    @Column(name = "PFID_RACK_PRC_FLG")
    private Character pfidRackPrcFlg;
    @Basic(optional = false)
    @Column(name = "PFID_PURGE_DAYS")
    private short pfidPurgeDays;
    @Basic(optional = false)
    @Column(name = "PFID_PRC_VALID_POS_FLG")
    private Character pfidPrcValidPosFlg;

    @Basic(optional = false)
    @Column(name = "PFID_PRC_POS_VRNC_AMT")
    private BigDecimal pfidPrcPosVrncAmt;
    @Basic(optional = false)
    @Column(name = "PFID_PRC_AUTO_FLG")
    private Character pfidPrcAutoFlg;
    @Basic(optional = false)
    @Column(name = "PFID_PRC_CMPNT_EDIT_FLG")
    private Character pfidPrcCmpntEditFlg;
    @Basic(optional = false)
    @Column(name = "PFID_HOLD_TIME")
    private String pfidHoldTime;
    @Basic(optional = false)
    @Column(name = "PFID_PRC_MIN_QTY")
    private BigDecimal pfidPrcMinQty;
    @Basic(optional = false)
    @Column(name = "PFID_EMAIL_FLG")
    private Character pfidEmailFlg;
    @Basic(optional = false)
    @Column(name = "PFID_PRC_AUTO_TAX_FLG")
    private Character pfidPrcAutoTaxFlg;

    public PfidMaint() {
    }

    public PfidMaint(String pfidCd) {
        this.pfidCd = pfidCd;
    }

    public PfidMaint(String pfidCd, String pfidCdDesc, Character pfidFreqCd, String pfidSecCd, Character pfidStatCd, Date effctvDtTs, Date pfidLstRecvTs, Date crtTs, String crtUsr, Date mdyTs, String mdyUser, String pfidFileName, Character pfidFileSwitch, Date pfidLastModifiedTs, String pfidEmailAddr, Character pfidPrcValidFlg, Character pfidRackPrcFlg, short pfidPurgeDays, Character pfidPrcValidPosFlg, BigDecimal pfidPrcPosVrncAmt, Character pfidPrcAutoFlg, Character pfidPrcCmpntEditFlg, String pfidHoldTime, BigDecimal pfidPrcMinQty, Character pfidEmailFlg, Character pfidPrcAutoTaxFlg) {
        this.pfidCd = pfidCd;
        this.pfidCdDesc = pfidCdDesc;
        this.pfidFreqCd = pfidFreqCd;
        this.pfidSecCd = pfidSecCd;
        this.pfidStatCd = pfidStatCd;
        this.effctvDtTs = effctvDtTs;
        this.pfidLstRecvTs = pfidLstRecvTs;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUser = mdyUser;
        this.pfidFileName = pfidFileName;
        this.pfidFileSwitch = pfidFileSwitch;
        this.pfidLastModifiedTs = pfidLastModifiedTs;
        this.pfidEmailAddr = pfidEmailAddr;
        this.pfidPrcValidFlg = pfidPrcValidFlg;
        this.pfidRackPrcFlg = pfidRackPrcFlg;
        this.pfidPurgeDays = pfidPurgeDays;
        this.pfidPrcValidPosFlg = pfidPrcValidPosFlg;
        this.pfidPrcPosVrncAmt = pfidPrcPosVrncAmt;
        this.pfidPrcAutoFlg = pfidPrcAutoFlg;
        this.pfidPrcCmpntEditFlg = pfidPrcCmpntEditFlg;
        this.pfidHoldTime = pfidHoldTime;
        this.pfidPrcMinQty = pfidPrcMinQty;
        this.pfidEmailFlg = pfidEmailFlg;
        this.pfidPrcAutoTaxFlg = pfidPrcAutoTaxFlg;
    }

    public String getPfidCd() {
        return pfidCd;
    }

    public void setPfidCd(String pfidCd) {
        this.pfidCd = pfidCd;
    }

    public String getPfidCdDesc() {
        return pfidCdDesc;
    }

    public void setPfidCdDesc(String pfidCdDesc) {
        this.pfidCdDesc = pfidCdDesc;
    }

    public Character getPfidFreqCd() {
        return pfidFreqCd;
    }

    public void setPfidFreqCd(Character pfidFreqCd) {
        this.pfidFreqCd = pfidFreqCd;
    }

    public String getPfidSecCd() {
        return pfidSecCd;
    }

    public void setPfidSecCd(String pfidSecCd) {
        this.pfidSecCd = pfidSecCd;
    }

    public Character getPfidStatCd() {
        return pfidStatCd;
    }

    public void setPfidStatCd(Character pfidStatCd) {
        this.pfidStatCd = pfidStatCd;
    }

    public Date getEffctvDtTs() {
        return effctvDtTs;
    }

    public void setEffctvDtTs(Date effctvDtTs) {
        this.effctvDtTs = effctvDtTs;
    }

    public Date getPfidLstRecvTs() {
        return pfidLstRecvTs;
    }

    public void setPfidLstRecvTs(Date pfidLstRecvTs) {
        this.pfidLstRecvTs = pfidLstRecvTs;
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

    public String getMdyUser() {
        return mdyUser;
    }

    public void setMdyUser(String mdyUser) {
        this.mdyUser = mdyUser;
    }

    public String getPfidFileName() {
        return pfidFileName;
    }

    public void setPfidFileName(String pfidFileName) {
        this.pfidFileName = pfidFileName;
    }

    public Character getPfidFileSwitch() {
        return pfidFileSwitch;
    }

    public void setPfidFileSwitch(Character pfidFileSwitch) {
        this.pfidFileSwitch = pfidFileSwitch;
    }

    public Date getPfidLastModifiedTs() {
        return pfidLastModifiedTs;
    }

    public void setPfidLastModifiedTs(Date pfidLastModifiedTs) {
        this.pfidLastModifiedTs = pfidLastModifiedTs;
    }

    public String getPfidEmailAddr() {
        return pfidEmailAddr;
    }

    public void setPfidEmailAddr(String pfidEmailAddr) {
        this.pfidEmailAddr = pfidEmailAddr;
    }

    public Character getPfidPrcValidFlg() {
        return pfidPrcValidFlg;
    }

    public void setPfidPrcValidFlg(Character pfidPrcValidFlg) {
        this.pfidPrcValidFlg = pfidPrcValidFlg;
    }

    public Character getPfidRackPrcFlg() {
        return pfidRackPrcFlg;
    }

    public void setPfidRackPrcFlg(Character pfidRackPrcFlg) {
        this.pfidRackPrcFlg = pfidRackPrcFlg;
    }

    public short getPfidPurgeDays() {
        return pfidPurgeDays;
    }

    public void setPfidPurgeDays(short pfidPurgeDays) {
        this.pfidPurgeDays = pfidPurgeDays;
    }

    public Character getPfidPrcValidPosFlg() {
        return pfidPrcValidPosFlg;
    }

    public void setPfidPrcValidPosFlg(Character pfidPrcValidPosFlg) {
        this.pfidPrcValidPosFlg = pfidPrcValidPosFlg;
    }

    public BigDecimal getPfidPrcPosVrncAmt() {
        return pfidPrcPosVrncAmt;
    }

    public void setPfidPrcPosVrncAmt(BigDecimal pfidPrcPosVrncAmt) {
        this.pfidPrcPosVrncAmt = pfidPrcPosVrncAmt;
    }

    public Character getPfidPrcAutoFlg() {
        return pfidPrcAutoFlg;
    }

    public void setPfidPrcAutoFlg(Character pfidPrcAutoFlg) {
        this.pfidPrcAutoFlg = pfidPrcAutoFlg;
    }

    public Character getPfidPrcCmpntEditFlg() {
        return pfidPrcCmpntEditFlg;
    }

    public void setPfidPrcCmpntEditFlg(Character pfidPrcCmpntEditFlg) {
        this.pfidPrcCmpntEditFlg = pfidPrcCmpntEditFlg;
    }

    public String getPfidHoldTime() {
        return pfidHoldTime;
    }

    public void setPfidHoldTime(String pfidHoldTime) {
        this.pfidHoldTime = pfidHoldTime;
    }

    public BigDecimal getPfidPrcMinQty() {
        return pfidPrcMinQty;
    }

    public void setPfidPrcMinQty(BigDecimal pfidPrcMinQty) {
        this.pfidPrcMinQty = pfidPrcMinQty;
    }

    public Character getPfidEmailFlg() {
        return pfidEmailFlg;
    }

    public void setPfidEmailFlg(Character pfidEmailFlg) {
        this.pfidEmailFlg = pfidEmailFlg;
    }

    public Character getPfidPrcAutoTaxFlg() {
        return pfidPrcAutoTaxFlg;
    }

    public void setPfidPrcAutoTaxFlg(Character pfidPrcAutoTaxFlg) {
        this.pfidPrcAutoTaxFlg = pfidPrcAutoTaxFlg;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pfidCd != null ? pfidCd.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof PfidMaint)) {
            return false;
        }
        PfidMaint other = (PfidMaint) object;
        if ((this.pfidCd == null && other.pfidCd != null) || (this.pfidCd != null && !this.pfidCd.equals(other.pfidCd))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.PfidMaint[ pfidCd=" + pfidCd + " ]";
    }

}
