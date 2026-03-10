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
@Table(name = "MDES_DGTL_WLT", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "MdesDgtlWlt.findAll", query = "SELECT m FROM MdesDgtlWlt m")})
public class MdesDgtlWlt implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "TKN_ID")
    private String tknId;
    @Basic(optional = false)
    @Column(name = "TKN_EXPR_MO")
    private String tknExprMo;
    @Basic(optional = false)
    @Column(name = "TKN_EXPR_YR")
    private String tknExprYr;
    @Basic(optional = false)
    @Column(name = "TKN_SEQ_NBR")
    private short tknSeqNbr;
    @Basic(optional = false)
    @Column(name = "TKN_UNQ_REF")
    private String tknUnqRef;
    @Basic(optional = false)
    @Column(name = "CORR_ID")
    private String corrId;
    @Basic(optional = false)
    @Column(name = "CRD_NBR")
    private String crdNbr;
    @Basic(optional = false)
    @Column(name = "CRD_EXPR_MO")
    private String crdExprMo;
    @Basic(optional = false)
    @Column(name = "CRD_EXPR_YR")
    private String crdExprYr;
    @Basic(optional = false)
    @Column(name = "ACT_CD")
    private String actCd;
    @Basic(optional = false)
    @Column(name = "WALLET_ID")
    private String walletId;
    @Basic(optional = false)
    @Column(name = "TKN_STAT")
    private String tknStat;
    @Basic(optional = false)
    @Column(name = "TKN_STAT_RSN")
    private String tknStatRsn;
    @Basic(optional = false)
    @Column(name = "TKN_TYP")
    private String tknTyp;
    @Basic(optional = false)
    @Column(name = "TKN_STAT_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date tknStatTs;
    @Basic(optional = false)
    @Column(name = "AUTH_TRIES")
    private short authTries;
    @Basic(optional = false)
    @Column(name = "ACT_CD_TRIES")
    private short actCdTries;
    @Basic(optional = false)
    @Column(name = "RECMD_DESN")
    private String recmdDesn;
    @Basic(optional = false)
    @Column(name = "RECMD_RSNS")
    private String recmdRsns;
    @Basic(optional = false)
    @Column(name = "AVS_RSP")
    private String avsRsp;
    @Basic(optional = false)
    @Column(name = "DVCE_SCR")
    private short dvceScr;
    @Basic(optional = false)
    @Column(name = "ACCT_SCR")
    private short acctScr;
    @Basic(optional = false)
    @Column(name = "ACCT_LF_TM")
    private short acctLfTm;
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
    @Column(name = "CNFG_ID")
    private String cnfgId;
    @Basic(optional = false)
    @Column(name = "ACCT_NBR")
    private String acctNbr;
    @Basic(optional = false)
    @Column(name = "CUST_ID")
    private String custId;
    @Basic(optional = false)
    @Column(name = "CRD_HLDR_NM")
    private String crdHldrNm;
    @Basic(optional = false)
    @Column(name = "DVCE_TYP")
    private String dvceTyp;
    @Basic(optional = false)
    @Column(name = "DVCE_OPER_SYS_NM")
    private String dvceOperSysNm;
    @Basic(optional = false)
    @Column(name = "CRD_CPTR_MTHD")
    private String crdCptrMthd;
    @Basic(optional = false)
    @Column(name = "SRCE_IP_ADDR")
    private String srceIpAddr;
    @Basic(optional = false)
    @Column(name = "DVCE_LOC_NM")
    private String dvceLocNm;
    @Basic(optional = false)
    @Column(name = "CRD_HLDR_EMAIL_ADDR")
    private String crdHldrEmailAddr;
    @Basic(optional = false)
    @Column(name = "CRTY_DLN_CD")
    private String crtyDlnCd;
    @Basic(optional = false)
    @Column(name = "PHONE_NBR")
    private String phoneNbr;
    @Basic(optional = false)
    @Column(name = "IMEI_ID")
    private String imeiId;
    @Basic(optional = false)
    @Column(name = "MSISDN_ID")
    private String msisdnId;

    public MdesDgtlWlt() {
    }

    public MdesDgtlWlt(String tknId) {
        this.tknId = tknId;
    }

    public MdesDgtlWlt(String tknId, String tknExprMo, String tknExprYr, short tknSeqNbr, String tknUnqRef, String corrId, String crdNbr, String crdExprMo, String crdExprYr, String actCd, String walletId, String tknStat, String tknStatRsn, String tknTyp, Date tknStatTs, short authTries, short actCdTries, String recmdDesn, String recmdRsns, String avsRsp, short dvceScr, short acctScr, short acctLfTm, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr, String cnfgId, String acctNbr, String custId, String crdHldrNm, String dvceTyp, String dvceOperSysNm, String crdCptrMthd, String srceIpAddr, String dvceLocNm, String crdHldrEmailAddr, String crtyDlnCd, String phoneNbr, String imeiId, String msisdnId) {
        this.tknId = tknId;
        this.tknExprMo = tknExprMo;
        this.tknExprYr = tknExprYr;
        this.tknSeqNbr = tknSeqNbr;
        this.tknUnqRef = tknUnqRef;
        this.corrId = corrId;
        this.crdNbr = crdNbr;
        this.crdExprMo = crdExprMo;
        this.crdExprYr = crdExprYr;
        this.actCd = actCd;
        this.walletId = walletId;
        this.tknStat = tknStat;
        this.tknStatRsn = tknStatRsn;
        this.tknTyp = tknTyp;
        this.tknStatTs = tknStatTs;
        this.authTries = authTries;
        this.actCdTries = actCdTries;
        this.recmdDesn = recmdDesn;
        this.recmdRsns = recmdRsns;
        this.avsRsp = avsRsp;
        this.dvceScr = dvceScr;
        this.acctScr = acctScr;
        this.acctLfTm = acctLfTm;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
        this.cnfgId = cnfgId;
        this.acctNbr = acctNbr;
        this.custId = custId;
        this.crdHldrNm = crdHldrNm;
        this.dvceTyp = dvceTyp;
        this.dvceOperSysNm = dvceOperSysNm;
        this.crdCptrMthd = crdCptrMthd;
        this.srceIpAddr = srceIpAddr;
        this.dvceLocNm = dvceLocNm;
        this.crdHldrEmailAddr = crdHldrEmailAddr;
        this.crtyDlnCd = crtyDlnCd;
        this.phoneNbr = phoneNbr;
        this.imeiId = imeiId;
        this.msisdnId = msisdnId;
    }

    public String getTknId() {
        return tknId;
    }

    public void setTknId(String tknId) {
        this.tknId = tknId;
    }

    public String getTknExprMo() {
        return tknExprMo;
    }

    public void setTknExprMo(String tknExprMo) {
        this.tknExprMo = tknExprMo;
    }

    public String getTknExprYr() {
        return tknExprYr;
    }

    public void setTknExprYr(String tknExprYr) {
        this.tknExprYr = tknExprYr;
    }

    public short getTknSeqNbr() {
        return tknSeqNbr;
    }

    public void setTknSeqNbr(short tknSeqNbr) {
        this.tknSeqNbr = tknSeqNbr;
    }

    public String getTknUnqRef() {
        return tknUnqRef;
    }

    public void setTknUnqRef(String tknUnqRef) {
        this.tknUnqRef = tknUnqRef;
    }

    public String getCorrId() {
        return corrId;
    }

    public void setCorrId(String corrId) {
        this.corrId = corrId;
    }

    public String getCrdNbr() {
        return crdNbr;
    }

    public void setCrdNbr(String crdNbr) {
        this.crdNbr = crdNbr;
    }

    public String getCrdExprMo() {
        return crdExprMo;
    }

    public void setCrdExprMo(String crdExprMo) {
        this.crdExprMo = crdExprMo;
    }

    public String getCrdExprYr() {
        return crdExprYr;
    }

    public void setCrdExprYr(String crdExprYr) {
        this.crdExprYr = crdExprYr;
    }

    public String getActCd() {
        return actCd;
    }

    public void setActCd(String actCd) {
        this.actCd = actCd;
    }

    public String getWalletId() {
        return walletId;
    }

    public void setWalletId(String walletId) {
        this.walletId = walletId;
    }

    public String getTknStat() {
        return tknStat;
    }

    public void setTknStat(String tknStat) {
        this.tknStat = tknStat;
    }

    public String getTknStatRsn() {
        return tknStatRsn;
    }

    public void setTknStatRsn(String tknStatRsn) {
        this.tknStatRsn = tknStatRsn;
    }

    public String getTknTyp() {
        return tknTyp;
    }

    public void setTknTyp(String tknTyp) {
        this.tknTyp = tknTyp;
    }

    public Date getTknStatTs() {
        return tknStatTs;
    }

    public void setTknStatTs(Date tknStatTs) {
        this.tknStatTs = tknStatTs;
    }

    public short getAuthTries() {
        return authTries;
    }

    public void setAuthTries(short authTries) {
        this.authTries = authTries;
    }

    public short getActCdTries() {
        return actCdTries;
    }

    public void setActCdTries(short actCdTries) {
        this.actCdTries = actCdTries;
    }

    public String getRecmdDesn() {
        return recmdDesn;
    }

    public void setRecmdDesn(String recmdDesn) {
        this.recmdDesn = recmdDesn;
    }

    public String getRecmdRsns() {
        return recmdRsns;
    }

    public void setRecmdRsns(String recmdRsns) {
        this.recmdRsns = recmdRsns;
    }

    public String getAvsRsp() {
        return avsRsp;
    }

    public void setAvsRsp(String avsRsp) {
        this.avsRsp = avsRsp;
    }

    public short getDvceScr() {
        return dvceScr;
    }

    public void setDvceScr(short dvceScr) {
        this.dvceScr = dvceScr;
    }

    public short getAcctScr() {
        return acctScr;
    }

    public void setAcctScr(short acctScr) {
        this.acctScr = acctScr;
    }

    public short getAcctLfTm() {
        return acctLfTm;
    }

    public void setAcctLfTm(short acctLfTm) {
        this.acctLfTm = acctLfTm;
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

    public String getCnfgId() {
        return cnfgId;
    }

    public void setCnfgId(String cnfgId) {
        this.cnfgId = cnfgId;
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

    public String getCrdHldrNm() {
        return crdHldrNm;
    }

    public void setCrdHldrNm(String crdHldrNm) {
        this.crdHldrNm = crdHldrNm;
    }

    public String getDvceTyp() {
        return dvceTyp;
    }

    public void setDvceTyp(String dvceTyp) {
        this.dvceTyp = dvceTyp;
    }

    public String getDvceOperSysNm() {
        return dvceOperSysNm;
    }

    public void setDvceOperSysNm(String dvceOperSysNm) {
        this.dvceOperSysNm = dvceOperSysNm;
    }

    public String getCrdCptrMthd() {
        return crdCptrMthd;
    }

    public void setCrdCptrMthd(String crdCptrMthd) {
        this.crdCptrMthd = crdCptrMthd;
    }

    public String getSrceIpAddr() {
        return srceIpAddr;
    }

    public void setSrceIpAddr(String srceIpAddr) {
        this.srceIpAddr = srceIpAddr;
    }

    public String getDvceLocNm() {
        return dvceLocNm;
    }

    public void setDvceLocNm(String dvceLocNm) {
        this.dvceLocNm = dvceLocNm;
    }

    public String getCrdHldrEmailAddr() {
        return crdHldrEmailAddr;
    }

    public void setCrdHldrEmailAddr(String crdHldrEmailAddr) {
        this.crdHldrEmailAddr = crdHldrEmailAddr;
    }

    public String getCrtyDlnCd() {
        return crtyDlnCd;
    }

    public void setCrtyDlnCd(String crtyDlnCd) {
        this.crtyDlnCd = crtyDlnCd;
    }

    public String getPhoneNbr() {
        return phoneNbr;
    }

    public void setPhoneNbr(String phoneNbr) {
        this.phoneNbr = phoneNbr;
    }

    public String getImeiId() {
        return imeiId;
    }

    public void setImeiId(String imeiId) {
        this.imeiId = imeiId;
    }

    public String getMsisdnId() {
        return msisdnId;
    }

    public void setMsisdnId(String msisdnId) {
        this.msisdnId = msisdnId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tknId != null ? tknId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MdesDgtlWlt)) {
            return false;
        }
        MdesDgtlWlt other = (MdesDgtlWlt) object;
        if ((this.tknId == null && other.tknId != null) || (this.tknId != null && !this.tknId.equals(other.tknId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.MdesDgtlWlt[ tknId=" + tknId + " ]";
    }
    
}
