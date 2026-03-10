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
@Table(name = "MC_SAFE", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "McSafe.findAll", query = "SELECT m FROM McSafe m")})
public class McSafe implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected McSafePK mcSafePK;
    @Basic(optional = false)
    @Column(name = "SAFE_BCH_ID")
    @Temporal(TemporalType.DATE)
    private Date safeBchId;
    @Basic(optional = false)
    @Column(name = "SAFE_BCH_SEQ_NBR")
    private int safeBchSeqNbr;
    @Basic(optional = false)
    @Column(name = "SAFE_STAT")
    private Character safeStat;
    @Basic(optional = false)
    @Column(name = "SAFE_ACCT_NBR")
    private String safeAcctNbr;
    @Basic(optional = false)
    @Column(name = "SAFE_CUST_ID")
    private String safeCustId;
    @Basic(optional = false)
    @Column(name = "SAFE_PAN")
    private String safePan;
    @Basic(optional = false)
    @Column(name = "SAFE_MC_DATA")
    private String safeMcData;
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
    @Column(name = "AUTH_AVS_RESP")
    private Character authAvsResp;
    @Basic(optional = false)
    @Column(name = "AUTH_ALM_APPROV_CD")
    private String authAlmApprovCd;
    @Basic(optional = false)
    @Column(name = "AUTH_TERM_ID")
    private String authTermId;
    @Basic(optional = false)
    @Column(name = "AUTH_UCAF_IND")
    private Character authUcafInd;
    @Basic(optional = false)
    @Column(name = "D48S42_ELEC_COMM_IND")
    private String d48s42ElecCommInd;
    @Basic(optional = false)
    @Column(name = "D48S87_CVC_IND")
    private Character d48s87CvcInd;
    @Basic(optional = false)
    @Column(name = "SAFE_TRAN_DT")
    private int safeTranDt;
    @Basic(optional = false)
    @Column(name = "CRD_TKN_NBR")
    private String crdTknNbr;
    @Basic(optional = false)
    @Column(name = "D22S1_CRDDATINCP")
    private Character d22s1Crddatincp;
    @Basic(optional = false)
    @Column(name = "SAFE_TERM_ATT_IND")
    private short safeTermAttInd;
    @Basic(optional = false)
    @Column(name = "D22S5_CH_PSNT_DAT")
    private Character d22s5ChPsntDat;
    @Basic(optional = false)
    @Column(name = "D22S7_CRD_DAT_MD")
    private Character d22s7CrdDatMd;
    @Basic(optional = false)
    @Column(name = "SAFE_SUB_FRD_TYP")
    private Character safeSubFrdTyp;
    @Basic(optional = false)
    @Column(name = "D26_CRD_ACPTRBUS")
    private short d26CrdAcptrbus;
    @Basic(optional = false)
    @Column(name = "D31S1_IC_RT_DSGTR")
    private short d31s1IcRtDsgtr;
    @Basic(optional = false)
    @Column(name = "D31S2_ACQUIR_BIN")
    private int d31s2AcquirBin;
    @Basic(optional = false)
    @Column(name = "D31S3_JUL_PRC_DT")
    private short d31s3JulPrcDt;
    @Basic(optional = false)
    @Column(name = "D31S4_ACQ_SEQ_NO")
    private long d31s4AcqSeqNo;
    @Basic(optional = false)
    @Column(name = "D31S5_CHECK_DIGIT")
    private short d31s5CheckDigit;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "D4_TRAN_AMT")
    private BigDecimal d4TranAmt;
    @Basic(optional = false)
    @Column(name = "D42_CRD_ACPR_ID")
    private String d42CrdAcprId;
    @Basic(optional = false)
    @Column(name = "D49_TRAN_CURR_CD")
    private short d49TranCurrCd;
    @Basic(optional = false)
    @Column(name = "D51_CH_BL_CUR_CD")
    private short d51ChBlCurCd;
    @Basic(optional = false)
    @Column(name = "D6_CH_BILLING_AMT")
    private BigDecimal d6ChBillingAmt;
    @Basic(optional = false)
    @Column(name = "D94_TR_ORG_INST")
    private long d94TrOrgInst;
    @Basic(optional = false)
    @Column(name = "SAFE_SETTLE_DT")
    private int safeSettleDt;
    @Basic(optional = false)
    @Column(name = "P2_PROD_ID")
    private String p2ProdId;
    @Basic(optional = false)
    @Column(name = "D43S1_CRD_ACP_NM")
    private String d43s1CrdAcpNm;
    @Basic(optional = false)
    @Column(name = "D43S3_CRD_ACP_CTY")
    private String d43s3CrdAcpCty;
    @Basic(optional = false)
    @Column(name = "D43S4_CRD_ACP_ZIP")
    private String d43s4CrdAcpZip;
    @Basic(optional = false)
    @Column(name = "D43S5_CRD_ACP_ST")
    private String d43s5CrdAcpSt;
    @Basic(optional = false)
    @Column(name = "D43S6_CRD_ACP_CTRY")
    private String d43s6CrdAcpCtry;
    @Basic(optional = false)
    @Column(name = "SAFE_FRD_TYPE_CD")
    private String safeFrdTypeCd;
    @Basic(optional = false)
    @Column(name = "D22S4_TERMOP_ENV")
    private short d22s4TermopEnv;
    @Basic(optional = false)
    @Column(name = "D22S6_CRD_PSNT_DAT")
    private Character d22s6CrdPsntDat;

    public McSafe() {
    }

    public McSafe(McSafePK mcSafePK) {
        this.mcSafePK = mcSafePK;
    }

    public McSafe(McSafePK mcSafePK, Date safeBchId, int safeBchSeqNbr, Character safeStat, String safeAcctNbr, String safeCustId, String safePan, String safeMcData, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr, Character authAvsResp, String authAlmApprovCd, String authTermId, Character authUcafInd, String d48s42ElecCommInd, Character d48s87CvcInd, int safeTranDt, String crdTknNbr, Character d22s1Crddatincp, short safeTermAttInd, Character d22s5ChPsntDat, Character d22s7CrdDatMd, Character safeSubFrdTyp, short d26CrdAcptrbus, short d31s1IcRtDsgtr, int d31s2AcquirBin, short d31s3JulPrcDt, long d31s4AcqSeqNo, short d31s5CheckDigit, BigDecimal d4TranAmt, String d42CrdAcprId, short d49TranCurrCd, short d51ChBlCurCd, BigDecimal d6ChBillingAmt, long d94TrOrgInst, int safeSettleDt, String p2ProdId, String d43s1CrdAcpNm, String d43s3CrdAcpCty, String d43s4CrdAcpZip, String d43s5CrdAcpSt, String d43s6CrdAcpCtry, String safeFrdTypeCd, short d22s4TermopEnv, Character d22s6CrdPsntDat) {
        this.mcSafePK = mcSafePK;
        this.safeBchId = safeBchId;
        this.safeBchSeqNbr = safeBchSeqNbr;
        this.safeStat = safeStat;
        this.safeAcctNbr = safeAcctNbr;
        this.safeCustId = safeCustId;
        this.safePan = safePan;
        this.safeMcData = safeMcData;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
        this.authAvsResp = authAvsResp;
        this.authAlmApprovCd = authAlmApprovCd;
        this.authTermId = authTermId;
        this.authUcafInd = authUcafInd;
        this.d48s42ElecCommInd = d48s42ElecCommInd;
        this.d48s87CvcInd = d48s87CvcInd;
        this.safeTranDt = safeTranDt;
        this.crdTknNbr = crdTknNbr;
        this.d22s1Crddatincp = d22s1Crddatincp;
        this.safeTermAttInd = safeTermAttInd;
        this.d22s5ChPsntDat = d22s5ChPsntDat;
        this.d22s7CrdDatMd = d22s7CrdDatMd;
        this.safeSubFrdTyp = safeSubFrdTyp;
        this.d26CrdAcptrbus = d26CrdAcptrbus;
        this.d31s1IcRtDsgtr = d31s1IcRtDsgtr;
        this.d31s2AcquirBin = d31s2AcquirBin;
        this.d31s3JulPrcDt = d31s3JulPrcDt;
        this.d31s4AcqSeqNo = d31s4AcqSeqNo;
        this.d31s5CheckDigit = d31s5CheckDigit;
        this.d4TranAmt = d4TranAmt;
        this.d42CrdAcprId = d42CrdAcprId;
        this.d49TranCurrCd = d49TranCurrCd;
        this.d51ChBlCurCd = d51ChBlCurCd;
        this.d6ChBillingAmt = d6ChBillingAmt;
        this.d94TrOrgInst = d94TrOrgInst;
        this.safeSettleDt = safeSettleDt;
        this.p2ProdId = p2ProdId;
        this.d43s1CrdAcpNm = d43s1CrdAcpNm;
        this.d43s3CrdAcpCty = d43s3CrdAcpCty;
        this.d43s4CrdAcpZip = d43s4CrdAcpZip;
        this.d43s5CrdAcpSt = d43s5CrdAcpSt;
        this.d43s6CrdAcpCtry = d43s6CrdAcpCtry;
        this.safeFrdTypeCd = safeFrdTypeCd;
        this.d22s4TermopEnv = d22s4TermopEnv;
        this.d22s6CrdPsntDat = d22s6CrdPsntDat;
    }

    public McSafe(Date safeTrnsId, short p105s1FileTy, int p105s2FileRDt, long p105s3ProcId, int p105s4FileSeqNo, int d71MsgNo) {
        this.mcSafePK = new McSafePK(safeTrnsId, p105s1FileTy, p105s2FileRDt, p105s3ProcId, p105s4FileSeqNo, d71MsgNo);
    }

    public McSafePK getMcSafePK() {
        return mcSafePK;
    }

    public void setMcSafePK(McSafePK mcSafePK) {
        this.mcSafePK = mcSafePK;
    }

    public Date getSafeBchId() {
        return safeBchId;
    }

    public void setSafeBchId(Date safeBchId) {
        this.safeBchId = safeBchId;
    }

    public int getSafeBchSeqNbr() {
        return safeBchSeqNbr;
    }

    public void setSafeBchSeqNbr(int safeBchSeqNbr) {
        this.safeBchSeqNbr = safeBchSeqNbr;
    }

    public Character getSafeStat() {
        return safeStat;
    }

    public void setSafeStat(Character safeStat) {
        this.safeStat = safeStat;
    }

    public String getSafeAcctNbr() {
        return safeAcctNbr;
    }

    public void setSafeAcctNbr(String safeAcctNbr) {
        this.safeAcctNbr = safeAcctNbr;
    }

    public String getSafeCustId() {
        return safeCustId;
    }

    public void setSafeCustId(String safeCustId) {
        this.safeCustId = safeCustId;
    }

    public String getSafePan() {
        return safePan;
    }

    public void setSafePan(String safePan) {
        this.safePan = safePan;
    }

    public String getSafeMcData() {
        return safeMcData;
    }

    public void setSafeMcData(String safeMcData) {
        this.safeMcData = safeMcData;
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

    public Character getAuthAvsResp() {
        return authAvsResp;
    }

    public void setAuthAvsResp(Character authAvsResp) {
        this.authAvsResp = authAvsResp;
    }

    public String getAuthAlmApprovCd() {
        return authAlmApprovCd;
    }

    public void setAuthAlmApprovCd(String authAlmApprovCd) {
        this.authAlmApprovCd = authAlmApprovCd;
    }

    public String getAuthTermId() {
        return authTermId;
    }

    public void setAuthTermId(String authTermId) {
        this.authTermId = authTermId;
    }

    public Character getAuthUcafInd() {
        return authUcafInd;
    }

    public void setAuthUcafInd(Character authUcafInd) {
        this.authUcafInd = authUcafInd;
    }

    public String getD48s42ElecCommInd() {
        return d48s42ElecCommInd;
    }

    public void setD48s42ElecCommInd(String d48s42ElecCommInd) {
        this.d48s42ElecCommInd = d48s42ElecCommInd;
    }

    public Character getD48s87CvcInd() {
        return d48s87CvcInd;
    }

    public void setD48s87CvcInd(Character d48s87CvcInd) {
        this.d48s87CvcInd = d48s87CvcInd;
    }

    public int getSafeTranDt() {
        return safeTranDt;
    }

    public void setSafeTranDt(int safeTranDt) {
        this.safeTranDt = safeTranDt;
    }

    public String getCrdTknNbr() {
        return crdTknNbr;
    }

    public void setCrdTknNbr(String crdTknNbr) {
        this.crdTknNbr = crdTknNbr;
    }

    public Character getD22s1Crddatincp() {
        return d22s1Crddatincp;
    }

    public void setD22s1Crddatincp(Character d22s1Crddatincp) {
        this.d22s1Crddatincp = d22s1Crddatincp;
    }

    public short getSafeTermAttInd() {
        return safeTermAttInd;
    }

    public void setSafeTermAttInd(short safeTermAttInd) {
        this.safeTermAttInd = safeTermAttInd;
    }

    public Character getD22s5ChPsntDat() {
        return d22s5ChPsntDat;
    }

    public void setD22s5ChPsntDat(Character d22s5ChPsntDat) {
        this.d22s5ChPsntDat = d22s5ChPsntDat;
    }

    public Character getD22s7CrdDatMd() {
        return d22s7CrdDatMd;
    }

    public void setD22s7CrdDatMd(Character d22s7CrdDatMd) {
        this.d22s7CrdDatMd = d22s7CrdDatMd;
    }

    public Character getSafeSubFrdTyp() {
        return safeSubFrdTyp;
    }

    public void setSafeSubFrdTyp(Character safeSubFrdTyp) {
        this.safeSubFrdTyp = safeSubFrdTyp;
    }

    public short getD26CrdAcptrbus() {
        return d26CrdAcptrbus;
    }

    public void setD26CrdAcptrbus(short d26CrdAcptrbus) {
        this.d26CrdAcptrbus = d26CrdAcptrbus;
    }

    public short getD31s1IcRtDsgtr() {
        return d31s1IcRtDsgtr;
    }

    public void setD31s1IcRtDsgtr(short d31s1IcRtDsgtr) {
        this.d31s1IcRtDsgtr = d31s1IcRtDsgtr;
    }

    public int getD31s2AcquirBin() {
        return d31s2AcquirBin;
    }

    public void setD31s2AcquirBin(int d31s2AcquirBin) {
        this.d31s2AcquirBin = d31s2AcquirBin;
    }

    public short getD31s3JulPrcDt() {
        return d31s3JulPrcDt;
    }

    public void setD31s3JulPrcDt(short d31s3JulPrcDt) {
        this.d31s3JulPrcDt = d31s3JulPrcDt;
    }

    public long getD31s4AcqSeqNo() {
        return d31s4AcqSeqNo;
    }

    public void setD31s4AcqSeqNo(long d31s4AcqSeqNo) {
        this.d31s4AcqSeqNo = d31s4AcqSeqNo;
    }

    public short getD31s5CheckDigit() {
        return d31s5CheckDigit;
    }

    public void setD31s5CheckDigit(short d31s5CheckDigit) {
        this.d31s5CheckDigit = d31s5CheckDigit;
    }

    public BigDecimal getD4TranAmt() {
        return d4TranAmt;
    }

    public void setD4TranAmt(BigDecimal d4TranAmt) {
        this.d4TranAmt = d4TranAmt;
    }

    public String getD42CrdAcprId() {
        return d42CrdAcprId;
    }

    public void setD42CrdAcprId(String d42CrdAcprId) {
        this.d42CrdAcprId = d42CrdAcprId;
    }

    public short getD49TranCurrCd() {
        return d49TranCurrCd;
    }

    public void setD49TranCurrCd(short d49TranCurrCd) {
        this.d49TranCurrCd = d49TranCurrCd;
    }

    public short getD51ChBlCurCd() {
        return d51ChBlCurCd;
    }

    public void setD51ChBlCurCd(short d51ChBlCurCd) {
        this.d51ChBlCurCd = d51ChBlCurCd;
    }

    public BigDecimal getD6ChBillingAmt() {
        return d6ChBillingAmt;
    }

    public void setD6ChBillingAmt(BigDecimal d6ChBillingAmt) {
        this.d6ChBillingAmt = d6ChBillingAmt;
    }

    public long getD94TrOrgInst() {
        return d94TrOrgInst;
    }

    public void setD94TrOrgInst(long d94TrOrgInst) {
        this.d94TrOrgInst = d94TrOrgInst;
    }

    public int getSafeSettleDt() {
        return safeSettleDt;
    }

    public void setSafeSettleDt(int safeSettleDt) {
        this.safeSettleDt = safeSettleDt;
    }

    public String getP2ProdId() {
        return p2ProdId;
    }

    public void setP2ProdId(String p2ProdId) {
        this.p2ProdId = p2ProdId;
    }

    public String getD43s1CrdAcpNm() {
        return d43s1CrdAcpNm;
    }

    public void setD43s1CrdAcpNm(String d43s1CrdAcpNm) {
        this.d43s1CrdAcpNm = d43s1CrdAcpNm;
    }

    public String getD43s3CrdAcpCty() {
        return d43s3CrdAcpCty;
    }

    public void setD43s3CrdAcpCty(String d43s3CrdAcpCty) {
        this.d43s3CrdAcpCty = d43s3CrdAcpCty;
    }

    public String getD43s4CrdAcpZip() {
        return d43s4CrdAcpZip;
    }

    public void setD43s4CrdAcpZip(String d43s4CrdAcpZip) {
        this.d43s4CrdAcpZip = d43s4CrdAcpZip;
    }

    public String getD43s5CrdAcpSt() {
        return d43s5CrdAcpSt;
    }

    public void setD43s5CrdAcpSt(String d43s5CrdAcpSt) {
        this.d43s5CrdAcpSt = d43s5CrdAcpSt;
    }

    public String getD43s6CrdAcpCtry() {
        return d43s6CrdAcpCtry;
    }

    public void setD43s6CrdAcpCtry(String d43s6CrdAcpCtry) {
        this.d43s6CrdAcpCtry = d43s6CrdAcpCtry;
    }

    public String getSafeFrdTypeCd() {
        return safeFrdTypeCd;
    }

    public void setSafeFrdTypeCd(String safeFrdTypeCd) {
        this.safeFrdTypeCd = safeFrdTypeCd;
    }

    public short getD22s4TermopEnv() {
        return d22s4TermopEnv;
    }

    public void setD22s4TermopEnv(short d22s4TermopEnv) {
        this.d22s4TermopEnv = d22s4TermopEnv;
    }

    public Character getD22s6CrdPsntDat() {
        return d22s6CrdPsntDat;
    }

    public void setD22s6CrdPsntDat(Character d22s6CrdPsntDat) {
        this.d22s6CrdPsntDat = d22s6CrdPsntDat;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mcSafePK != null ? mcSafePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof McSafe)) {
            return false;
        }
        McSafe other = (McSafe) object;
        if ((this.mcSafePK == null && other.mcSafePK != null) || (this.mcSafePK != null && !this.mcSafePK.equals(other.mcSafePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.McSafe[ mcSafePK=" + mcSafePK + " ]";
    }
    
}
