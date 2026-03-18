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
@Table(name = "PRD_FL_TAX_LIC", catalog = "", schema = "DBO")
public class PrdFlTaxLic implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "APPL_NBR")
    private String applNbr;
    @Basic(optional = false)
    @Column(name = "FL_TAX_ACCT_CD")
    private String flTaxAcctCd;
    @Basic(optional = false)
    @Column(name = "NBR_UNITS")
    private String nbrUnits;

    @Basic(optional = false)
    @Column(name = "RT_PER_UNIT")
    private BigDecimal rtPerUnit;
    @Basic(optional = false)
    @Column(name = "FL_TAX_FLG")
    private Character flTaxFlg;
    @Basic(optional = false)
    @Column(name = "FL_TAX_OPTN_FLG")
    private int flTaxOptnFlg;
    @Basic(optional = false)
    @Column(name = "NBR_ELTRN_UNITS")
    private int nbrEltrnUnits;
    @Basic(optional = false)
    @Column(name = "NBR_MNL_UNITS")
    private int nbrMnlUnits;
    @Basic(optional = false)
    @Column(name = "EFCTV_SRV_DT")
    @Temporal(TemporalType.DATE)
    private Date efctvSrvDt;
    @Basic(optional = false)
    @Column(name = "CDN_PMT_FLG")
    private Character cdnPmtFlg;
    @Basic(optional = false)
    @Column(name = "JRSDCTN_PMT_FLG")
    private Character jrsdctnPmtFlg;
    @Basic(optional = false)
    @Column(name = "HVY_VEHS_TAX")
    private BigDecimal hvyVehsTax;
    @Basic(optional = false)
    @Column(name = "OFF_HWY_RFND")
    private BigDecimal offHwyRfnd;
    @Basic(optional = false)
    @Column(name = "PTO_RFND")
    private BigDecimal ptoRfnd;
    @Basic(optional = false)
    @Column(name = "PROP_TAX")
    private BigDecimal propTax;
    @Basic(optional = false)
    @Column(name = "PRTG_FEE_RATE1")
    private BigDecimal prtgFeeRate1;
    @Basic(optional = false)
    @Column(name = "PRTG_FEE_RATE2")
    private BigDecimal prtgFeeRate2;
    @Basic(optional = false)
    @Column(name = "PROCG_FEE")
    private BigDecimal procgFee;
    @Basic(optional = false)
    @Column(name = "RTRND_DTR_FEE")
    private BigDecimal rtrndDtrFee;
    @Basic(optional = false)
    @Column(name = "PPR_FL_RCPTS")
    private BigDecimal pprFlRcpts;
    @Basic(optional = false)
    @Column(name = "IRP_LIC_FEE")
    private BigDecimal irpLicFee;
    @Basic(optional = false)
    @Column(name = "IRP_SUPLMNT")
    private BigDecimal irpSuplmnt;
    @Basic(optional = false)
    @Column(name = "OTH_SUPLMNT")
    private BigDecimal othSuplmnt;
    @Basic(optional = false)
    @Column(name = "IRP_PLATE_RNWL")
    private BigDecimal irpPlateRnwl;
    @Basic(optional = false)
    @Column(name = "IFTA_REG")
    private BigDecimal iftaReg;
    @Basic(optional = false)
    @Column(name = "SSRS_REG")
    private BigDecimal ssrsReg;
    @Basic(optional = false)
    @Column(name = "TITLE_APPL")
    private BigDecimal titleAppl;
    @Basic(optional = false)
    @Column(name = "BAS_PLATE_RNWL")
    private BigDecimal basPlateRnwl;
    @Basic(optional = false)
    @Column(name = "EMRGCY_FL_PRMTS")
    private BigDecimal emrgcyFlPrmts;
    @Basic(optional = false)
    @Column(name = "COMP_NM")
    private String compNm;
    @Basic(optional = false)
    @Column(name = "FL_ACQR_FLG")
    private Character flAcqrFlg;
    @Basic(optional = false)
    @Column(name = "FL_OTH_DESC")
    private String flOthDesc;
    @Basic(optional = false)
    @Column(name = "CRD_ASGN_FLG")
    private Character crdAsgnFlg;
    @Basic(optional = false)
    @Column(name = "CRD_ASGN_OTH_DESC")
    private String crdAsgnOthDesc;
    @Basic(optional = false)
    @Column(name = "FL_CRD_FLG")
    private Character flCrdFlg;
    @Basic(optional = false)
    @Column(name = "FL_CRD_OTH_DESC")
    private String flCrdOthDesc;
    @Basic(optional = false)
    @Column(name = "FL_RCVD_FLG")
    private Character flRcvdFlg;
    @Basic(optional = false)
    @Column(name = "FL_RCVD_OTH_DESC")
    private String flRcvdOthDesc;
    @Basic(optional = false)
    @Column(name = "DATA_FREQ_FLG")
    private Character dataFreqFlg;
    @Basic(optional = false)
    @Column(name = "DATA_FREQ_OTH_DESC")
    private String dataFreqOthDesc;
    @Basic(optional = false)
    @Column(name = "DATA_CLTN_MTHD")
    private String dataCltnMthd;
    @Basic(optional = false)
    @Column(name = "CLTN_MTHD_PCTGE")
    private BigDecimal cltnMthdPctge;
    @Basic(optional = false)
    @Column(name = "CPU_PLTFM")
    private String cpuPltfm;
    @Basic(optional = false)
    @Column(name = "DATA_SEND_MTHD")
    private String dataSendMthd;
    @Basic(optional = false)
    @Column(name = "RCPT_SEND_MTHD")
    private String rcptSendMthd;
    @Basic(optional = false)
    @Column(name = "STLT_SYS_FLG")
    private Character stltSysFlg;
    @Basic(optional = false)
    @Column(name = "STLT_SYS_OTH_DESC")
    private String stltSysOthDesc;
    @Basic(optional = false)
    @Column(name = "GPS_CPU_PLTFM")
    private String gpsCpuPltfm;
    @Basic(optional = false)
    @Column(name = "GPS_DSPCH_SFTWR")
    private String gpsDspchSftwr;
    @Basic(optional = false)
    @Column(name = "ALL_GPS_VEHS_FLG")
    private Character allGpsVehsFlg;
    @Basic(optional = false)
    @Column(name = "MILA_RCVD_MTHD")
    private String milaRcvdMthd;
    @Basic(optional = false)
    @Column(name = "PSTN_RDNG_FREQ")
    private String pstnRdngFreq;
    @Basic(optional = false)
    @Column(name = "ODM_RDNG_FREQ")
    private String odmRdngFreq;
    @Basic(optional = false)
    @Column(name = "GPS_SEND_MTHD")
    private String gpsSendMthd;
    @Basic(optional = false)
    @Column(name = "MIS_STAFF_FLAG")
    private Character misStaffFlag;
    @Basic(optional = false)
    @Column(name = "MIS_OTH_DESC")
    private String misOthDesc;
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

    public PrdFlTaxLic() {
    }

    public PrdFlTaxLic(String applNbr) {
        this.applNbr = applNbr;
    }

    public PrdFlTaxLic(String applNbr, String flTaxAcctCd, String nbrUnits, BigDecimal rtPerUnit, Character flTaxFlg, int flTaxOptnFlg, int nbrEltrnUnits, int nbrMnlUnits, Date efctvSrvDt, Character cdnPmtFlg, Character jrsdctnPmtFlg, BigDecimal hvyVehsTax, BigDecimal offHwyRfnd, BigDecimal ptoRfnd, BigDecimal propTax, BigDecimal prtgFeeRate1, BigDecimal prtgFeeRate2, BigDecimal procgFee, BigDecimal rtrndDtrFee, BigDecimal pprFlRcpts, BigDecimal irpLicFee, BigDecimal irpSuplmnt, BigDecimal othSuplmnt, BigDecimal irpPlateRnwl, BigDecimal iftaReg, BigDecimal ssrsReg, BigDecimal titleAppl, BigDecimal basPlateRnwl, BigDecimal emrgcyFlPrmts, String compNm, Character flAcqrFlg, String flOthDesc, Character crdAsgnFlg, String crdAsgnOthDesc, Character flCrdFlg, String flCrdOthDesc, Character flRcvdFlg, String flRcvdOthDesc, Character dataFreqFlg, String dataFreqOthDesc, String dataCltnMthd, BigDecimal cltnMthdPctge, String cpuPltfm, String dataSendMthd, String rcptSendMthd, Character stltSysFlg, String stltSysOthDesc, String gpsCpuPltfm, String gpsDspchSftwr, Character allGpsVehsFlg, String milaRcvdMthd, String pstnRdngFreq, String odmRdngFreq, String gpsSendMthd, Character misStaffFlag, String misOthDesc, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.applNbr = applNbr;
        this.flTaxAcctCd = flTaxAcctCd;
        this.nbrUnits = nbrUnits;
        this.rtPerUnit = rtPerUnit;
        this.flTaxFlg = flTaxFlg;
        this.flTaxOptnFlg = flTaxOptnFlg;
        this.nbrEltrnUnits = nbrEltrnUnits;
        this.nbrMnlUnits = nbrMnlUnits;
        this.efctvSrvDt = efctvSrvDt;
        this.cdnPmtFlg = cdnPmtFlg;
        this.jrsdctnPmtFlg = jrsdctnPmtFlg;
        this.hvyVehsTax = hvyVehsTax;
        this.offHwyRfnd = offHwyRfnd;
        this.ptoRfnd = ptoRfnd;
        this.propTax = propTax;
        this.prtgFeeRate1 = prtgFeeRate1;
        this.prtgFeeRate2 = prtgFeeRate2;
        this.procgFee = procgFee;
        this.rtrndDtrFee = rtrndDtrFee;
        this.pprFlRcpts = pprFlRcpts;
        this.irpLicFee = irpLicFee;
        this.irpSuplmnt = irpSuplmnt;
        this.othSuplmnt = othSuplmnt;
        this.irpPlateRnwl = irpPlateRnwl;
        this.iftaReg = iftaReg;
        this.ssrsReg = ssrsReg;
        this.titleAppl = titleAppl;
        this.basPlateRnwl = basPlateRnwl;
        this.emrgcyFlPrmts = emrgcyFlPrmts;
        this.compNm = compNm;
        this.flAcqrFlg = flAcqrFlg;
        this.flOthDesc = flOthDesc;
        this.crdAsgnFlg = crdAsgnFlg;
        this.crdAsgnOthDesc = crdAsgnOthDesc;
        this.flCrdFlg = flCrdFlg;
        this.flCrdOthDesc = flCrdOthDesc;
        this.flRcvdFlg = flRcvdFlg;
        this.flRcvdOthDesc = flRcvdOthDesc;
        this.dataFreqFlg = dataFreqFlg;
        this.dataFreqOthDesc = dataFreqOthDesc;
        this.dataCltnMthd = dataCltnMthd;
        this.cltnMthdPctge = cltnMthdPctge;
        this.cpuPltfm = cpuPltfm;
        this.dataSendMthd = dataSendMthd;
        this.rcptSendMthd = rcptSendMthd;
        this.stltSysFlg = stltSysFlg;
        this.stltSysOthDesc = stltSysOthDesc;
        this.gpsCpuPltfm = gpsCpuPltfm;
        this.gpsDspchSftwr = gpsDspchSftwr;
        this.allGpsVehsFlg = allGpsVehsFlg;
        this.milaRcvdMthd = milaRcvdMthd;
        this.pstnRdngFreq = pstnRdngFreq;
        this.odmRdngFreq = odmRdngFreq;
        this.gpsSendMthd = gpsSendMthd;
        this.misStaffFlag = misStaffFlag;
        this.misOthDesc = misOthDesc;
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

    public String getFlTaxAcctCd() {
        return flTaxAcctCd;
    }

    public void setFlTaxAcctCd(String flTaxAcctCd) {
        this.flTaxAcctCd = flTaxAcctCd;
    }

    public String getNbrUnits() {
        return nbrUnits;
    }

    public void setNbrUnits(String nbrUnits) {
        this.nbrUnits = nbrUnits;
    }

    public BigDecimal getRtPerUnit() {
        return rtPerUnit;
    }

    public void setRtPerUnit(BigDecimal rtPerUnit) {
        this.rtPerUnit = rtPerUnit;
    }

    public Character getFlTaxFlg() {
        return flTaxFlg;
    }

    public void setFlTaxFlg(Character flTaxFlg) {
        this.flTaxFlg = flTaxFlg;
    }

    public int getFlTaxOptnFlg() {
        return flTaxOptnFlg;
    }

    public void setFlTaxOptnFlg(int flTaxOptnFlg) {
        this.flTaxOptnFlg = flTaxOptnFlg;
    }

    public int getNbrEltrnUnits() {
        return nbrEltrnUnits;
    }

    public void setNbrEltrnUnits(int nbrEltrnUnits) {
        this.nbrEltrnUnits = nbrEltrnUnits;
    }

    public int getNbrMnlUnits() {
        return nbrMnlUnits;
    }

    public void setNbrMnlUnits(int nbrMnlUnits) {
        this.nbrMnlUnits = nbrMnlUnits;
    }

    public Date getEfctvSrvDt() {
        return efctvSrvDt;
    }

    public void setEfctvSrvDt(Date efctvSrvDt) {
        this.efctvSrvDt = efctvSrvDt;
    }

    public Character getCdnPmtFlg() {
        return cdnPmtFlg;
    }

    public void setCdnPmtFlg(Character cdnPmtFlg) {
        this.cdnPmtFlg = cdnPmtFlg;
    }

    public Character getJrsdctnPmtFlg() {
        return jrsdctnPmtFlg;
    }

    public void setJrsdctnPmtFlg(Character jrsdctnPmtFlg) {
        this.jrsdctnPmtFlg = jrsdctnPmtFlg;
    }

    public BigDecimal getHvyVehsTax() {
        return hvyVehsTax;
    }

    public void setHvyVehsTax(BigDecimal hvyVehsTax) {
        this.hvyVehsTax = hvyVehsTax;
    }

    public BigDecimal getOffHwyRfnd() {
        return offHwyRfnd;
    }

    public void setOffHwyRfnd(BigDecimal offHwyRfnd) {
        this.offHwyRfnd = offHwyRfnd;
    }

    public BigDecimal getPtoRfnd() {
        return ptoRfnd;
    }

    public void setPtoRfnd(BigDecimal ptoRfnd) {
        this.ptoRfnd = ptoRfnd;
    }

    public BigDecimal getPropTax() {
        return propTax;
    }

    public void setPropTax(BigDecimal propTax) {
        this.propTax = propTax;
    }

    public BigDecimal getPrtgFeeRate1() {
        return prtgFeeRate1;
    }

    public void setPrtgFeeRate1(BigDecimal prtgFeeRate1) {
        this.prtgFeeRate1 = prtgFeeRate1;
    }

    public BigDecimal getPrtgFeeRate2() {
        return prtgFeeRate2;
    }

    public void setPrtgFeeRate2(BigDecimal prtgFeeRate2) {
        this.prtgFeeRate2 = prtgFeeRate2;
    }

    public BigDecimal getProcgFee() {
        return procgFee;
    }

    public void setProcgFee(BigDecimal procgFee) {
        this.procgFee = procgFee;
    }

    public BigDecimal getRtrndDtrFee() {
        return rtrndDtrFee;
    }

    public void setRtrndDtrFee(BigDecimal rtrndDtrFee) {
        this.rtrndDtrFee = rtrndDtrFee;
    }

    public BigDecimal getPprFlRcpts() {
        return pprFlRcpts;
    }

    public void setPprFlRcpts(BigDecimal pprFlRcpts) {
        this.pprFlRcpts = pprFlRcpts;
    }

    public BigDecimal getIrpLicFee() {
        return irpLicFee;
    }

    public void setIrpLicFee(BigDecimal irpLicFee) {
        this.irpLicFee = irpLicFee;
    }

    public BigDecimal getIrpSuplmnt() {
        return irpSuplmnt;
    }

    public void setIrpSuplmnt(BigDecimal irpSuplmnt) {
        this.irpSuplmnt = irpSuplmnt;
    }

    public BigDecimal getOthSuplmnt() {
        return othSuplmnt;
    }

    public void setOthSuplmnt(BigDecimal othSuplmnt) {
        this.othSuplmnt = othSuplmnt;
    }

    public BigDecimal getIrpPlateRnwl() {
        return irpPlateRnwl;
    }

    public void setIrpPlateRnwl(BigDecimal irpPlateRnwl) {
        this.irpPlateRnwl = irpPlateRnwl;
    }

    public BigDecimal getIftaReg() {
        return iftaReg;
    }

    public void setIftaReg(BigDecimal iftaReg) {
        this.iftaReg = iftaReg;
    }

    public BigDecimal getSsrsReg() {
        return ssrsReg;
    }

    public void setSsrsReg(BigDecimal ssrsReg) {
        this.ssrsReg = ssrsReg;
    }

    public BigDecimal getTitleAppl() {
        return titleAppl;
    }

    public void setTitleAppl(BigDecimal titleAppl) {
        this.titleAppl = titleAppl;
    }

    public BigDecimal getBasPlateRnwl() {
        return basPlateRnwl;
    }

    public void setBasPlateRnwl(BigDecimal basPlateRnwl) {
        this.basPlateRnwl = basPlateRnwl;
    }

    public BigDecimal getEmrgcyFlPrmts() {
        return emrgcyFlPrmts;
    }

    public void setEmrgcyFlPrmts(BigDecimal emrgcyFlPrmts) {
        this.emrgcyFlPrmts = emrgcyFlPrmts;
    }

    public String getCompNm() {
        return compNm;
    }

    public void setCompNm(String compNm) {
        this.compNm = compNm;
    }

    public Character getFlAcqrFlg() {
        return flAcqrFlg;
    }

    public void setFlAcqrFlg(Character flAcqrFlg) {
        this.flAcqrFlg = flAcqrFlg;
    }

    public String getFlOthDesc() {
        return flOthDesc;
    }

    public void setFlOthDesc(String flOthDesc) {
        this.flOthDesc = flOthDesc;
    }

    public Character getCrdAsgnFlg() {
        return crdAsgnFlg;
    }

    public void setCrdAsgnFlg(Character crdAsgnFlg) {
        this.crdAsgnFlg = crdAsgnFlg;
    }

    public String getCrdAsgnOthDesc() {
        return crdAsgnOthDesc;
    }

    public void setCrdAsgnOthDesc(String crdAsgnOthDesc) {
        this.crdAsgnOthDesc = crdAsgnOthDesc;
    }

    public Character getFlCrdFlg() {
        return flCrdFlg;
    }

    public void setFlCrdFlg(Character flCrdFlg) {
        this.flCrdFlg = flCrdFlg;
    }

    public String getFlCrdOthDesc() {
        return flCrdOthDesc;
    }

    public void setFlCrdOthDesc(String flCrdOthDesc) {
        this.flCrdOthDesc = flCrdOthDesc;
    }

    public Character getFlRcvdFlg() {
        return flRcvdFlg;
    }

    public void setFlRcvdFlg(Character flRcvdFlg) {
        this.flRcvdFlg = flRcvdFlg;
    }

    public String getFlRcvdOthDesc() {
        return flRcvdOthDesc;
    }

    public void setFlRcvdOthDesc(String flRcvdOthDesc) {
        this.flRcvdOthDesc = flRcvdOthDesc;
    }

    public Character getDataFreqFlg() {
        return dataFreqFlg;
    }

    public void setDataFreqFlg(Character dataFreqFlg) {
        this.dataFreqFlg = dataFreqFlg;
    }

    public String getDataFreqOthDesc() {
        return dataFreqOthDesc;
    }

    public void setDataFreqOthDesc(String dataFreqOthDesc) {
        this.dataFreqOthDesc = dataFreqOthDesc;
    }

    public String getDataCltnMthd() {
        return dataCltnMthd;
    }

    public void setDataCltnMthd(String dataCltnMthd) {
        this.dataCltnMthd = dataCltnMthd;
    }

    public BigDecimal getCltnMthdPctge() {
        return cltnMthdPctge;
    }

    public void setCltnMthdPctge(BigDecimal cltnMthdPctge) {
        this.cltnMthdPctge = cltnMthdPctge;
    }

    public String getCpuPltfm() {
        return cpuPltfm;
    }

    public void setCpuPltfm(String cpuPltfm) {
        this.cpuPltfm = cpuPltfm;
    }

    public String getDataSendMthd() {
        return dataSendMthd;
    }

    public void setDataSendMthd(String dataSendMthd) {
        this.dataSendMthd = dataSendMthd;
    }

    public String getRcptSendMthd() {
        return rcptSendMthd;
    }

    public void setRcptSendMthd(String rcptSendMthd) {
        this.rcptSendMthd = rcptSendMthd;
    }

    public Character getStltSysFlg() {
        return stltSysFlg;
    }

    public void setStltSysFlg(Character stltSysFlg) {
        this.stltSysFlg = stltSysFlg;
    }

    public String getStltSysOthDesc() {
        return stltSysOthDesc;
    }

    public void setStltSysOthDesc(String stltSysOthDesc) {
        this.stltSysOthDesc = stltSysOthDesc;
    }

    public String getGpsCpuPltfm() {
        return gpsCpuPltfm;
    }

    public void setGpsCpuPltfm(String gpsCpuPltfm) {
        this.gpsCpuPltfm = gpsCpuPltfm;
    }

    public String getGpsDspchSftwr() {
        return gpsDspchSftwr;
    }

    public void setGpsDspchSftwr(String gpsDspchSftwr) {
        this.gpsDspchSftwr = gpsDspchSftwr;
    }

    public Character getAllGpsVehsFlg() {
        return allGpsVehsFlg;
    }

    public void setAllGpsVehsFlg(Character allGpsVehsFlg) {
        this.allGpsVehsFlg = allGpsVehsFlg;
    }

    public String getMilaRcvdMthd() {
        return milaRcvdMthd;
    }

    public void setMilaRcvdMthd(String milaRcvdMthd) {
        this.milaRcvdMthd = milaRcvdMthd;
    }

    public String getPstnRdngFreq() {
        return pstnRdngFreq;
    }

    public void setPstnRdngFreq(String pstnRdngFreq) {
        this.pstnRdngFreq = pstnRdngFreq;
    }

    public String getOdmRdngFreq() {
        return odmRdngFreq;
    }

    public void setOdmRdngFreq(String odmRdngFreq) {
        this.odmRdngFreq = odmRdngFreq;
    }

    public String getGpsSendMthd() {
        return gpsSendMthd;
    }

    public void setGpsSendMthd(String gpsSendMthd) {
        this.gpsSendMthd = gpsSendMthd;
    }

    public Character getMisStaffFlag() {
        return misStaffFlag;
    }

    public void setMisStaffFlag(Character misStaffFlag) {
        this.misStaffFlag = misStaffFlag;
    }

    public String getMisOthDesc() {
        return misOthDesc;
    }

    public void setMisOthDesc(String misOthDesc) {
        this.misOthDesc = misOthDesc;
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

        if (!(object instanceof PrdFlTaxLic)) {
            return false;
        }
        PrdFlTaxLic other = (PrdFlTaxLic) object;
        if ((this.applNbr == null && other.applNbr != null) || (this.applNbr != null && !this.applNbr.equals(other.applNbr))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.PrdFlTaxLic[ applNbr=" + applNbr + " ]";
    }

}
