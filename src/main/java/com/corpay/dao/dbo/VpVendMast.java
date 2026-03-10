/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Sukant.Tiwari
 */
@Entity
@Table(name = "VP_VEND_MAST", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "VpVendMast.findAll", query = "SELECT v FROM VpVendMast v")})
public class VpVendMast implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "VEND_MAST_ID")
    private String vendMastId;
    @Basic(optional = false)
    @Column(name = "VEND_STATUS")
    private Character vendStatus;
    @Basic(optional = false)
    @Column(name = "VEND_NM")
    private String vendNm;
    @Basic(optional = false)
    @Column(name = "VEND_GRP_ID")
    private String vendGrpId;
    @Basic(optional = false)
    @Column(name = "VEND_GRP_NM")
    private String vendGrpNm;
    @Basic(optional = false)
    @Column(name = "VEND_MAST_NBR")
    private String vendMastNbr;
    @Basic(optional = false)
    @Column(name = "SERV_CENTER_CD")
    private String servCenterCd;
    @Basic(optional = false)
    @Column(name = "COUNTRY_CD")
    private String countryCd;
    @Basic(optional = false)
    @Column(name = "TAX_ID")
    private String taxId;
    @Basic(optional = false)
    @Column(name = "DB_NBR")
    private String dbNbr;
    @Basic(optional = false)
    @Column(name = "REMIT_EMAIL")
    private String remitEmail;
    @Basic(optional = false)
    @Column(name = "MCC")
    private String mcc;
    @Basic(optional = false)
    @Column(name = "MCC_DEC")
    private String mccDec;
    @Basic(optional = false)
    @Column(name = "MC_AQUIRER_ID")
    private String mcAquirerId;
    @Basic(optional = false)
    @Column(name = "MC_ACCEPTOR_ID")
    private String mcAcceptorId;
    @Basic(optional = false)
    @Column(name = "DATA_LVL")
    private String dataLvl;
    @Basic(optional = false)
    @Column(name = "V_MISC_1")
    private String vMisc1;
    @Basic(optional = false)
    @Column(name = "V_MISC_2")
    private String vMisc2;
    @Basic(optional = false)
    @Column(name = "V_MISC_3")
    private String vMisc3;
    @Basic(optional = false)
    @Column(name = "V_MISC_4")
    private String vMisc4;
    @Basic(optional = false)
    @Column(name = "MATCH_CONF_LVL")
    private Character matchConfLvl;
    @Basic(optional = false)
    @Column(name = "MATCH_CONF_LVL_DT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date matchConfLvlDt;
    @Basic(optional = false)
    @Column(name = "MDY_USR")
    private String mdyUsr;
    @Basic(optional = false)
    @Column(name = "MDY_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date mdyTs;
    @Basic(optional = false)
    @Column(name = "CRT_USR")
    private String crtUsr;
    @Basic(optional = false)
    @Column(name = "CRT_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date crtTs;
    @Basic(optional = false)
    @Column(name = "EMAIL_ADDR")
    private String emailAddr;
    @Basic(optional = false)
    @Column(name = "PHONE_NBR")
    private String phoneNbr;
    @Basic(optional = false)
    @Column(name = "FAX_NBR")
    private String faxNbr;
    @Basic(optional = false)
    @Column(name = "REMIT_TYPE_CD")
    private Character remitTypeCd;
    @Basic(optional = false)
    @Column(name = "REG_CUST_ID")
    private String regCustId;
    @Basic(optional = false)
    @Column(name = "PFU_IND")
    private Character pfuInd;
    @Basic(optional = false)
    @Column(name = "EXCL_FRM_MTCH_FLG")
    private Character exclFrmMtchFlg;
    @Basic(optional = false)
    @Column(name = "STAT_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date statTs;
    @Basic(optional = false)
    @Column(name = "DECLINE_REASON_CD")
    private String declineReasonCd;
    @Basic(optional = false)
    @Column(name = "DECLINE_INTERCHANGE_AMT")
    private short declineInterchangeAmt;
    @Basic(optional = false)
    @Column(name = "DECLINE_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date declineTs;
    @Basic(optional = false)
    @Column(name = "SF_VNDR_ACCT_UID")
    private String sfVndrAcctUid;
    @Basic(optional = false)
    @Column(name = "PMT_MTHD_CD")
    private String pmtMthdCd;
    @Basic(optional = false)
    @Column(name = "STAT_RSN_CD")
    private int statRsnCd;
    @Basic(optional = false)
    @Column(name = "MATCHED_FLG")
    private Character matchedFlg;
    @Basic(optional = false)
    @Column(name = "ENRLD_USR_ID")
    private String enrldUsrId;
    @Basic(optional = false)
    @Column(name = "VP_3RD_PARTY_ID")
    private String vp3rdPartyId;
    @Basic(optional = false)
    @Column(name = "ALLOW_EMAIL_OVRRD_FLG")
    private Character allowEmailOvrrdFlg;
    @Basic(optional = false)
    @Column(name = "MC_SUPPLIER_ID")
    private String mcSupplierId;
    @Basic(optional = false)
    @Column(name = "BATCH_REMIT_FLG")
    private Character batchRemitFlg;
    @Basic(optional = false)
    @Column(name = "GOLDEN_KEY")
    private String goldenKey;
    @Basic(optional = false)
    @Column(name = "LOC_ID")
    private String locId;
    @Basic(optional = false)
    @Column(name = "OVRD_CDN_PAY_METH_FLG")
    private Character ovrdCdnPayMethFlg;
    @Basic(optional = false)
    @Column(name = "ALT_BIN_FLG")
    private Character altBinFlg;
    @Basic(optional = false)
    @Column(name = "FULL_CARD_ON_REMITTANCE_FLG")
    private String fullCardOnRemittanceFlg;
    @Basic(optional = false)
    @Column(name = "VEND_ACPT_DBT_ONLY_FLG")
    private Character vendAcptDbtOnlyFlg;

    public VpVendMast() {
    }

    public VpVendMast(String vendMastId) {
        this.vendMastId = vendMastId;
    }

    public VpVendMast(String vendMastId, Character vendStatus, String vendNm, String vendGrpId, String vendGrpNm, String vendMastNbr, String servCenterCd, String countryCd, String taxId, String dbNbr, String remitEmail, String mcc, String mccDec, String mcAquirerId, String mcAcceptorId, String dataLvl, String vMisc1, String vMisc2, String vMisc3, String vMisc4, Character matchConfLvl, Date matchConfLvlDt, String mdyUsr, Date mdyTs, String crtUsr, Date crtTs, String emailAddr, String phoneNbr, String faxNbr, Character remitTypeCd, String regCustId, Character pfuInd, Character exclFrmMtchFlg, Date statTs, String declineReasonCd, short declineInterchangeAmt, Date declineTs, String sfVndrAcctUid, String pmtMthdCd, int statRsnCd, Character matchedFlg, String enrldUsrId, String vp3rdPartyId, Character allowEmailOvrrdFlg, String mcSupplierId, Character batchRemitFlg, String goldenKey, String locId, Character ovrdCdnPayMethFlg, Character altBinFlg, String fullCardOnRemittanceFlg, Character vendAcptDbtOnlyFlg) {
        this.vendMastId = vendMastId;
        this.vendStatus = vendStatus;
        this.vendNm = vendNm;
        this.vendGrpId = vendGrpId;
        this.vendGrpNm = vendGrpNm;
        this.vendMastNbr = vendMastNbr;
        this.servCenterCd = servCenterCd;
        this.countryCd = countryCd;
        this.taxId = taxId;
        this.dbNbr = dbNbr;
        this.remitEmail = remitEmail;
        this.mcc = mcc;
        this.mccDec = mccDec;
        this.mcAquirerId = mcAquirerId;
        this.mcAcceptorId = mcAcceptorId;
        this.dataLvl = dataLvl;
        this.vMisc1 = vMisc1;
        this.vMisc2 = vMisc2;
        this.vMisc3 = vMisc3;
        this.vMisc4 = vMisc4;
        this.matchConfLvl = matchConfLvl;
        this.matchConfLvlDt = matchConfLvlDt;
        this.mdyUsr = mdyUsr;
        this.mdyTs = mdyTs;
        this.crtUsr = crtUsr;
        this.crtTs = crtTs;
        this.emailAddr = emailAddr;
        this.phoneNbr = phoneNbr;
        this.faxNbr = faxNbr;
        this.remitTypeCd = remitTypeCd;
        this.regCustId = regCustId;
        this.pfuInd = pfuInd;
        this.exclFrmMtchFlg = exclFrmMtchFlg;
        this.statTs = statTs;
        this.declineReasonCd = declineReasonCd;
        this.declineInterchangeAmt = declineInterchangeAmt;
        this.declineTs = declineTs;
        this.sfVndrAcctUid = sfVndrAcctUid;
        this.pmtMthdCd = pmtMthdCd;
        this.statRsnCd = statRsnCd;
        this.matchedFlg = matchedFlg;
        this.enrldUsrId = enrldUsrId;
        this.vp3rdPartyId = vp3rdPartyId;
        this.allowEmailOvrrdFlg = allowEmailOvrrdFlg;
        this.mcSupplierId = mcSupplierId;
        this.batchRemitFlg = batchRemitFlg;
        this.goldenKey = goldenKey;
        this.locId = locId;
        this.ovrdCdnPayMethFlg = ovrdCdnPayMethFlg;
        this.altBinFlg = altBinFlg;
        this.fullCardOnRemittanceFlg = fullCardOnRemittanceFlg;
        this.vendAcptDbtOnlyFlg = vendAcptDbtOnlyFlg;
    }

    public String getVendMastId() {
        return vendMastId;
    }

    public void setVendMastId(String vendMastId) {
        this.vendMastId = vendMastId;
    }

    public Character getVendStatus() {
        return vendStatus;
    }

    public void setVendStatus(Character vendStatus) {
        this.vendStatus = vendStatus;
    }

    public String getVendNm() {
        return vendNm;
    }

    public void setVendNm(String vendNm) {
        this.vendNm = vendNm;
    }

    public String getVendGrpId() {
        return vendGrpId;
    }

    public void setVendGrpId(String vendGrpId) {
        this.vendGrpId = vendGrpId;
    }

    public String getVendGrpNm() {
        return vendGrpNm;
    }

    public void setVendGrpNm(String vendGrpNm) {
        this.vendGrpNm = vendGrpNm;
    }

    public String getVendMastNbr() {
        return vendMastNbr;
    }

    public void setVendMastNbr(String vendMastNbr) {
        this.vendMastNbr = vendMastNbr;
    }

    public String getServCenterCd() {
        return servCenterCd;
    }

    public void setServCenterCd(String servCenterCd) {
        this.servCenterCd = servCenterCd;
    }

    public String getCountryCd() {
        return countryCd;
    }

    public void setCountryCd(String countryCd) {
        this.countryCd = countryCd;
    }

    public String getTaxId() {
        return taxId;
    }

    public void setTaxId(String taxId) {
        this.taxId = taxId;
    }

    public String getDbNbr() {
        return dbNbr;
    }

    public void setDbNbr(String dbNbr) {
        this.dbNbr = dbNbr;
    }

    public String getRemitEmail() {
        return remitEmail;
    }

    public void setRemitEmail(String remitEmail) {
        this.remitEmail = remitEmail;
    }

    public String getMcc() {
        return mcc;
    }

    public void setMcc(String mcc) {
        this.mcc = mcc;
    }

    public String getMccDec() {
        return mccDec;
    }

    public void setMccDec(String mccDec) {
        this.mccDec = mccDec;
    }

    public String getMcAquirerId() {
        return mcAquirerId;
    }

    public void setMcAquirerId(String mcAquirerId) {
        this.mcAquirerId = mcAquirerId;
    }

    public String getMcAcceptorId() {
        return mcAcceptorId;
    }

    public void setMcAcceptorId(String mcAcceptorId) {
        this.mcAcceptorId = mcAcceptorId;
    }

    public String getDataLvl() {
        return dataLvl;
    }

    public void setDataLvl(String dataLvl) {
        this.dataLvl = dataLvl;
    }

    public String getVMisc1() {
        return vMisc1;
    }

    public void setVMisc1(String vMisc1) {
        this.vMisc1 = vMisc1;
    }

    public String getVMisc2() {
        return vMisc2;
    }

    public void setVMisc2(String vMisc2) {
        this.vMisc2 = vMisc2;
    }

    public String getVMisc3() {
        return vMisc3;
    }

    public void setVMisc3(String vMisc3) {
        this.vMisc3 = vMisc3;
    }

    public String getVMisc4() {
        return vMisc4;
    }

    public void setVMisc4(String vMisc4) {
        this.vMisc4 = vMisc4;
    }

    public Character getMatchConfLvl() {
        return matchConfLvl;
    }

    public void setMatchConfLvl(Character matchConfLvl) {
        this.matchConfLvl = matchConfLvl;
    }

    public Date getMatchConfLvlDt() {
        return matchConfLvlDt;
    }

    public void setMatchConfLvlDt(Date matchConfLvlDt) {
        this.matchConfLvlDt = matchConfLvlDt;
    }

    public String getMdyUsr() {
        return mdyUsr;
    }

    public void setMdyUsr(String mdyUsr) {
        this.mdyUsr = mdyUsr;
    }

    public Date getMdyTs() {
        return mdyTs;
    }

    public void setMdyTs(Date mdyTs) {
        this.mdyTs = mdyTs;
    }

    public String getCrtUsr() {
        return crtUsr;
    }

    public void setCrtUsr(String crtUsr) {
        this.crtUsr = crtUsr;
    }

    public Date getCrtTs() {
        return crtTs;
    }

    public void setCrtTs(Date crtTs) {
        this.crtTs = crtTs;
    }

    public String getEmailAddr() {
        return emailAddr;
    }

    public void setEmailAddr(String emailAddr) {
        this.emailAddr = emailAddr;
    }

    public String getPhoneNbr() {
        return phoneNbr;
    }

    public void setPhoneNbr(String phoneNbr) {
        this.phoneNbr = phoneNbr;
    }

    public String getFaxNbr() {
        return faxNbr;
    }

    public void setFaxNbr(String faxNbr) {
        this.faxNbr = faxNbr;
    }

    public Character getRemitTypeCd() {
        return remitTypeCd;
    }

    public void setRemitTypeCd(Character remitTypeCd) {
        this.remitTypeCd = remitTypeCd;
    }

    public String getRegCustId() {
        return regCustId;
    }

    public void setRegCustId(String regCustId) {
        this.regCustId = regCustId;
    }

    public Character getPfuInd() {
        return pfuInd;
    }

    public void setPfuInd(Character pfuInd) {
        this.pfuInd = pfuInd;
    }

    public Character getExclFrmMtchFlg() {
        return exclFrmMtchFlg;
    }

    public void setExclFrmMtchFlg(Character exclFrmMtchFlg) {
        this.exclFrmMtchFlg = exclFrmMtchFlg;
    }

    public Date getStatTs() {
        return statTs;
    }

    public void setStatTs(Date statTs) {
        this.statTs = statTs;
    }

    public String getDeclineReasonCd() {
        return declineReasonCd;
    }

    public void setDeclineReasonCd(String declineReasonCd) {
        this.declineReasonCd = declineReasonCd;
    }

    public short getDeclineInterchangeAmt() {
        return declineInterchangeAmt;
    }

    public void setDeclineInterchangeAmt(short declineInterchangeAmt) {
        this.declineInterchangeAmt = declineInterchangeAmt;
    }

    public Date getDeclineTs() {
        return declineTs;
    }

    public void setDeclineTs(Date declineTs) {
        this.declineTs = declineTs;
    }

    public String getSfVndrAcctUid() {
        return sfVndrAcctUid;
    }

    public void setSfVndrAcctUid(String sfVndrAcctUid) {
        this.sfVndrAcctUid = sfVndrAcctUid;
    }

    public String getPmtMthdCd() {
        return pmtMthdCd;
    }

    public void setPmtMthdCd(String pmtMthdCd) {
        this.pmtMthdCd = pmtMthdCd;
    }

    public int getStatRsnCd() {
        return statRsnCd;
    }

    public void setStatRsnCd(int statRsnCd) {
        this.statRsnCd = statRsnCd;
    }

    public Character getMatchedFlg() {
        return matchedFlg;
    }

    public void setMatchedFlg(Character matchedFlg) {
        this.matchedFlg = matchedFlg;
    }

    public String getEnrldUsrId() {
        return enrldUsrId;
    }

    public void setEnrldUsrId(String enrldUsrId) {
        this.enrldUsrId = enrldUsrId;
    }

    public String getVp3rdPartyId() {
        return vp3rdPartyId;
    }

    public void setVp3rdPartyId(String vp3rdPartyId) {
        this.vp3rdPartyId = vp3rdPartyId;
    }

    public Character getAllowEmailOvrrdFlg() {
        return allowEmailOvrrdFlg;
    }

    public void setAllowEmailOvrrdFlg(Character allowEmailOvrrdFlg) {
        this.allowEmailOvrrdFlg = allowEmailOvrrdFlg;
    }

    public String getMcSupplierId() {
        return mcSupplierId;
    }

    public void setMcSupplierId(String mcSupplierId) {
        this.mcSupplierId = mcSupplierId;
    }

    public Character getBatchRemitFlg() {
        return batchRemitFlg;
    }

    public void setBatchRemitFlg(Character batchRemitFlg) {
        this.batchRemitFlg = batchRemitFlg;
    }

    public String getGoldenKey() {
        return goldenKey;
    }

    public void setGoldenKey(String goldenKey) {
        this.goldenKey = goldenKey;
    }

    public String getLocId() {
        return locId;
    }

    public void setLocId(String locId) {
        this.locId = locId;
    }

    public Character getOvrdCdnPayMethFlg() {
        return ovrdCdnPayMethFlg;
    }

    public void setOvrdCdnPayMethFlg(Character ovrdCdnPayMethFlg) {
        this.ovrdCdnPayMethFlg = ovrdCdnPayMethFlg;
    }

    public Character getAltBinFlg() {
        return altBinFlg;
    }

    public void setAltBinFlg(Character altBinFlg) {
        this.altBinFlg = altBinFlg;
    }

    public String getFullCardOnRemittanceFlg() {
        return fullCardOnRemittanceFlg;
    }

    public void setFullCardOnRemittanceFlg(String fullCardOnRemittanceFlg) {
        this.fullCardOnRemittanceFlg = fullCardOnRemittanceFlg;
    }

    public Character getVendAcptDbtOnlyFlg() {
        return vendAcptDbtOnlyFlg;
    }

    public void setVendAcptDbtOnlyFlg(Character vendAcptDbtOnlyFlg) {
        this.vendAcptDbtOnlyFlg = vendAcptDbtOnlyFlg;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (vendMastId != null ? vendMastId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof VpVendMast)) {
            return false;
        }
        VpVendMast other = (VpVendMast) object;
        if ((this.vendMastId == null && other.vendMastId != null) || (this.vendMastId != null && !this.vendMastId.equals(other.vendMastId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.VpVendMast[ vendMastId=" + vendMastId + " ]";
    }
    
}
