package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "CRD_LSTG", catalog = "", schema = "DBO")
public class CrdLstg implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "CUST_ID")
    private String custId;
    @Id
    @Basic(optional = false)
    @Column(name = "CRD_NBR")
    private String crdNbr;
    @Basic(optional = false)
    @Column(name = "CRD_EMP_ID")
    private String crdEmpId;
    @Basic(optional = false)
    @Column(name = "DRV_TRIP_NBR")
    private String drvTripNbr;
    @Basic(optional = false)
    @Column(name = "UNIT_NBR")
    private String unitNbr;
    @Basic(optional = false)
    @Column(name = "LST_NM")
    private String lstNm;
    @Basic(optional = false)
    @Column(name = "FST_NM")
    private String fstNm;
    @Basic(optional = false)
    @Column(name = "STAT")
    private String stat;
    @Basic(optional = false)
    @Column(name = "CRTN_DT")
    @Temporal(TemporalType.DATE)
    private Date crtnDt;
    @Basic(optional = false)
    @Column(name = "LST_USED_DT")
    @Temporal(TemporalType.DATE)
    private Date lstUsedDt;
    @Basic(optional = false)
    @Column(name = "DRV_LIC_NBR")
    private String drvLicNbr;
    @Basic(optional = false)
    @Column(name = "DRV_LIC_ST_PROV")
    private String drvLicStProv;
    @Basic(optional = false)
    @Column(name = "COMP_STAND_ID")
    private String compStandId;
    @Basic(optional = false)
    @Column(name = "COMP_STAND_FLG")
    private Character compStandFlg;
    @Basic(optional = false)
    @Column(name = "COMP_STAND_XREF")
    private String compStandXref;
    @Column(name = "MISC1")
    private String misc1;
    @Column(name = "MISC2")
    private String misc2;
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
    @Column(name = "TRL_NBR")
    private String trlNbr;
    @Basic(optional = false)
    @Column(name = "VEH_DESC")
    private String vehDesc;
    @Basic(optional = false)
    @Column(name = "VIN")
    private String vin;
    @Basic(optional = false)
    @Column(name = "VEH_LIC_PLATE")
    private String vehLicPlate;
    @Basic(optional = false)
    @Column(name = "RGSTRN_EXPR_DT")
    @Temporal(TemporalType.DATE)
    private Date rgstrnExprDt;
    @Basic(optional = false)
    @Column(name = "LST_PRMCRD_UPD_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lstPrmcrdUpdTs;
    @Basic(optional = false)
    @Column(name = "LST_PRMINFO_UPD_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lstPrminfoUpdTs;
    @Basic(optional = false)
    @Column(name = "HIER_ID")
    private String hierId;
    @Basic(optional = false)
    @Column(name = "NODE_ID")
    private String nodeId;
    @Basic(optional = false)
    @Column(name = "CRD_ID")
    private long crdId;
    @Basic(optional = false)
    @Column(name = "BIN")
    private int bin;
    @Basic(optional = false)
    @Column(name = "GHST_CRD_IND")
    private Character ghstCrdInd;
    @Basic(optional = false)
    @Column(name = "MISC3")
    private String misc3;
    @Basic(optional = false)
    @Column(name = "VEH_TANK_CAP")
    private String vehTankCap;
    @Basic(optional = false)
    @Column(name = "BLK_RSN_CD")
    private short blkRsnCd;
    @Basic(optional = false)
    @Column(name = "BLK_DT")
    @Temporal(TemporalType.DATE)
    private Date blkDt;
    @Basic(optional = false)
    @Column(name = "BLK_TM")
    @Temporal(TemporalType.TIME)
    private Date blkTm;
    @Basic(optional = false)
    @Column(name = "PAYROLL_USE_FLG")
    private Character payrollUseFlg;
    @Basic(optional = false)
    @Column(name = "CIP_PASS_FLG")
    private Character cipPassFlg;
    @Basic(optional = false)
    @Column(name = "CIP_PASS_DT")
    @Temporal(TemporalType.DATE)
    private Date cipPassDt;
    @Basic(optional = false)
    @Column(name = "CIP_PEND_DT")
    @Temporal(TemporalType.DATE)
    private Date cipPendDt;
    @Basic(optional = false)
    @Column(name = "PROGRAM_TYP_CD")
    private Character programTypCd;
    @Basic(optional = false)
    @Column(name = "EXPENSE_ACCT_FLG")
    private Character expenseAcctFlg;
    @Basic(optional = false)
    @Column(name = "CCH_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date cchTs;
    @Basic(optional = false)
    @Column(name = "FTC_FEE_CONSENT_CD")
    private Character ftcFeeConsentCd;
    @Basic(optional = false)
    @Column(name = "CRD_NBR_LAST_FOUR")
    private String crdNbrLastFour;
    @Basic(optional = false)
    @Column(name = "ACCT_CD")
    private String acctCd;
    @Basic(optional = false)
    @Column(name = "AUTO_LOCK_EXPIRY_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date autoLockExpiryTs;
    @Basic(optional = false)
    @Column(name = "AUTO_LOCK_FLG")
    private Character autoLockFlg;

    public CrdLstg() {
    }

    public CrdLstg(String crdNbr) {
        this.crdNbr = crdNbr;
    }

    public CrdLstg(String crdNbr, String custId, String crdEmpId, String drvTripNbr, String unitNbr, String lstNm, String fstNm, String stat, Date crtnDt, Date lstUsedDt, String drvLicNbr, String drvLicStProv, String compStandId, Character compStandFlg, String compStandXref, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr, String trlNbr, String vehDesc, String vin, String vehLicPlate, Date rgstrnExprDt, Date lstPrmcrdUpdTs, Date lstPrminfoUpdTs, String hierId, String nodeId, long crdId, int bin, Character ghstCrdInd, String misc3, String vehTankCap, short blkRsnCd, Date blkDt, Date blkTm, Character payrollUseFlg, Character cipPassFlg, Date cipPassDt, Date cipPendDt, Character programTypCd, Character expenseAcctFlg, Date cchTs, Character ftcFeeConsentCd, String crdNbrLastFour, String acctCd, Date autoLockExpiryTs, Character autoLockFlg) {
        this.crdNbr = crdNbr;
        this.custId = custId;
        this.crdEmpId = crdEmpId;
        this.drvTripNbr = drvTripNbr;
        this.unitNbr = unitNbr;
        this.lstNm = lstNm;
        this.fstNm = fstNm;
        this.stat = stat;
        this.crtnDt = crtnDt;
        this.lstUsedDt = lstUsedDt;
        this.drvLicNbr = drvLicNbr;
        this.drvLicStProv = drvLicStProv;
        this.compStandId = compStandId;
        this.compStandFlg = compStandFlg;
        this.compStandXref = compStandXref;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
        this.trlNbr = trlNbr;
        this.vehDesc = vehDesc;
        this.vin = vin;
        this.vehLicPlate = vehLicPlate;
        this.rgstrnExprDt = rgstrnExprDt;
        this.lstPrmcrdUpdTs = lstPrmcrdUpdTs;
        this.lstPrminfoUpdTs = lstPrminfoUpdTs;
        this.hierId = hierId;
        this.nodeId = nodeId;
        this.crdId = crdId;
        this.bin = bin;
        this.ghstCrdInd = ghstCrdInd;
        this.misc3 = misc3;
        this.vehTankCap = vehTankCap;
        this.blkRsnCd = blkRsnCd;
        this.blkDt = blkDt;
        this.blkTm = blkTm;
        this.payrollUseFlg = payrollUseFlg;
        this.cipPassFlg = cipPassFlg;
        this.cipPassDt = cipPassDt;
        this.cipPendDt = cipPendDt;
        this.programTypCd = programTypCd;
        this.expenseAcctFlg = expenseAcctFlg;
        this.cchTs = cchTs;
        this.ftcFeeConsentCd = ftcFeeConsentCd;
        this.crdNbrLastFour = crdNbrLastFour;
        this.acctCd = acctCd;
        this.autoLockExpiryTs = autoLockExpiryTs;
        this.autoLockFlg = autoLockFlg;
    }

    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId;
    }

    public String getCrdNbr() {
        return crdNbr;
    }

    public void setCrdNbr(String crdNbr) {
        this.crdNbr = crdNbr;
    }

    public String getCrdEmpId() {
        return crdEmpId;
    }

    public void setCrdEmpId(String crdEmpId) {
        this.crdEmpId = crdEmpId;
    }

    public String getDrvTripNbr() {
        return drvTripNbr;
    }

    public void setDrvTripNbr(String drvTripNbr) {
        this.drvTripNbr = drvTripNbr;
    }

    public String getUnitNbr() {
        return unitNbr;
    }

    public void setUnitNbr(String unitNbr) {
        this.unitNbr = unitNbr;
    }

    public String getLstNm() {
        return lstNm;
    }

    public void setLstNm(String lstNm) {
        this.lstNm = lstNm;
    }

    public String getFstNm() {
        return fstNm;
    }

    public void setFstNm(String fstNm) {
        this.fstNm = fstNm;
    }

    public String getStat() {
        return stat;
    }

    public void setStat(String stat) {
        this.stat = stat;
    }

    public Date getCrtnDt() {
        return crtnDt;
    }

    public void setCrtnDt(Date crtnDt) {
        this.crtnDt = crtnDt;
    }

    public Date getLstUsedDt() {
        return lstUsedDt;
    }

    public void setLstUsedDt(Date lstUsedDt) {
        this.lstUsedDt = lstUsedDt;
    }

    public String getDrvLicNbr() {
        return drvLicNbr;
    }

    public void setDrvLicNbr(String drvLicNbr) {
        this.drvLicNbr = drvLicNbr;
    }

    public String getDrvLicStProv() {
        return drvLicStProv;
    }

    public void setDrvLicStProv(String drvLicStProv) {
        this.drvLicStProv = drvLicStProv;
    }

    public String getCompStandId() {
        return compStandId;
    }

    public void setCompStandId(String compStandId) {
        this.compStandId = compStandId;
    }

    public Character getCompStandFlg() {
        return compStandFlg;
    }

    public void setCompStandFlg(Character compStandFlg) {
        this.compStandFlg = compStandFlg;
    }

    public String getCompStandXref() {
        return compStandXref;
    }

    public void setCompStandXref(String compStandXref) {
        this.compStandXref = compStandXref;
    }

    public String getMisc1() {
        return misc1;
    }

    public void setMisc1(String misc1) {
        this.misc1 = misc1;
    }

    public String getMisc2() {
        return misc2;
    }

    public void setMisc2(String misc2) {
        this.misc2 = misc2;
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

    public String getTrlNbr() {
        return trlNbr;
    }

    public void setTrlNbr(String trlNbr) {
        this.trlNbr = trlNbr;
    }

    public String getVehDesc() {
        return vehDesc;
    }

    public void setVehDesc(String vehDesc) {
        this.vehDesc = vehDesc;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getVehLicPlate() {
        return vehLicPlate;
    }

    public void setVehLicPlate(String vehLicPlate) {
        this.vehLicPlate = vehLicPlate;
    }

    public Date getRgstrnExprDt() {
        return rgstrnExprDt;
    }

    public void setRgstrnExprDt(Date rgstrnExprDt) {
        this.rgstrnExprDt = rgstrnExprDt;
    }

    public Date getLstPrmcrdUpdTs() {
        return lstPrmcrdUpdTs;
    }

    public void setLstPrmcrdUpdTs(Date lstPrmcrdUpdTs) {
        this.lstPrmcrdUpdTs = lstPrmcrdUpdTs;
    }

    public Date getLstPrminfoUpdTs() {
        return lstPrminfoUpdTs;
    }

    public void setLstPrminfoUpdTs(Date lstPrminfoUpdTs) {
        this.lstPrminfoUpdTs = lstPrminfoUpdTs;
    }

    public String getHierId() {
        return hierId;
    }

    public void setHierId(String hierId) {
        this.hierId = hierId;
    }

    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public long getCrdId() {
        return crdId;
    }

    public void setCrdId(long crdId) {
        this.crdId = crdId;
    }

    public int getBin() {
        return bin;
    }

    public void setBin(int bin) {
        this.bin = bin;
    }

    public Character getGhstCrdInd() {
        return ghstCrdInd;
    }

    public void setGhstCrdInd(Character ghstCrdInd) {
        this.ghstCrdInd = ghstCrdInd;
    }

    public String getMisc3() {
        return misc3;
    }

    public void setMisc3(String misc3) {
        this.misc3 = misc3;
    }

    public String getVehTankCap() {
        return vehTankCap;
    }

    public void setVehTankCap(String vehTankCap) {
        this.vehTankCap = vehTankCap;
    }

    public short getBlkRsnCd() {
        return blkRsnCd;
    }

    public void setBlkRsnCd(short blkRsnCd) {
        this.blkRsnCd = blkRsnCd;
    }

    public Date getBlkDt() {
        return blkDt;
    }

    public void setBlkDt(Date blkDt) {
        this.blkDt = blkDt;
    }

    public Date getBlkTm() {
        return blkTm;
    }

    public void setBlkTm(Date blkTm) {
        this.blkTm = blkTm;
    }

    public Character getPayrollUseFlg() {
        return payrollUseFlg;
    }

    public void setPayrollUseFlg(Character payrollUseFlg) {
        this.payrollUseFlg = payrollUseFlg;
    }

    public Character getCipPassFlg() {
        return cipPassFlg;
    }

    public void setCipPassFlg(Character cipPassFlg) {
        this.cipPassFlg = cipPassFlg;
    }

    public Date getCipPassDt() {
        return cipPassDt;
    }

    public void setCipPassDt(Date cipPassDt) {
        this.cipPassDt = cipPassDt;
    }

    public Date getCipPendDt() {
        return cipPendDt;
    }

    public void setCipPendDt(Date cipPendDt) {
        this.cipPendDt = cipPendDt;
    }

    public Character getProgramTypCd() {
        return programTypCd;
    }

    public void setProgramTypCd(Character programTypCd) {
        this.programTypCd = programTypCd;
    }

    public Character getExpenseAcctFlg() {
        return expenseAcctFlg;
    }

    public void setExpenseAcctFlg(Character expenseAcctFlg) {
        this.expenseAcctFlg = expenseAcctFlg;
    }

    public Date getCchTs() {
        return cchTs;
    }

    public void setCchTs(Date cchTs) {
        this.cchTs = cchTs;
    }

    public Character getFtcFeeConsentCd() {
        return ftcFeeConsentCd;
    }

    public void setFtcFeeConsentCd(Character ftcFeeConsentCd) {
        this.ftcFeeConsentCd = ftcFeeConsentCd;
    }

    public String getCrdNbrLastFour() {
        return crdNbrLastFour;
    }

    public void setCrdNbrLastFour(String crdNbrLastFour) {
        this.crdNbrLastFour = crdNbrLastFour;
    }

    public String getAcctCd() {
        return acctCd;
    }

    public void setAcctCd(String acctCd) {
        this.acctCd = acctCd;
    }

    public Date getAutoLockExpiryTs() {
        return autoLockExpiryTs;
    }

    public void setAutoLockExpiryTs(Date autoLockExpiryTs) {
        this.autoLockExpiryTs = autoLockExpiryTs;
    }

    public Character getAutoLockFlg() {
        return autoLockFlg;
    }

    public void setAutoLockFlg(Character autoLockFlg) {
        this.autoLockFlg = autoLockFlg;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (crdNbr != null ? crdNbr.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof CrdLstg)) {
            return false;
        }
        CrdLstg other = (CrdLstg) object;
        if ((this.crdNbr == null && other.crdNbr != null) || (this.crdNbr != null && !this.crdNbr.equals(other.crdNbr))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.CrdLstg[ crdNbr=" + crdNbr + " ]";
    }

}
