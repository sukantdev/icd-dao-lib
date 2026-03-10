/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.corpay.dao.cxxcow;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;
import java.io.Serializable;

/**
 *
 * @author Sukant.Tiwari
 */
@Entity
@Table(name = "MC_ADD_LODG_ACCT", catalog = "", schema = "CXXCOW")
@NamedQueries({
    @NamedQuery(name = "McAddLodgAcct.findAll", query = "SELECT m FROM McAddLodgAcct m"),
    @NamedQuery(name = "McAddLodgAcct.findByP105s1FileTy", query = "SELECT m FROM McAddLodgAcct m WHERE m.mcAddLodgAcctPK.p105s1FileTy = :p105s1FileTy"),
    @NamedQuery(name = "McAddLodgAcct.findByP105s2FileRDt", query = "SELECT m FROM McAddLodgAcct m WHERE m.mcAddLodgAcctPK.p105s2FileRDt = :p105s2FileRDt"),
    @NamedQuery(name = "McAddLodgAcct.findByP105s3ProcId", query = "SELECT m FROM McAddLodgAcct m WHERE m.mcAddLodgAcctPK.p105s3ProcId = :p105s3ProcId"),
    @NamedQuery(name = "McAddLodgAcct.findByP105s4FileSeqNo", query = "SELECT m FROM McAddLodgAcct m WHERE m.mcAddLodgAcctPK.p105s4FileSeqNo = :p105s4FileSeqNo"),
    @NamedQuery(name = "McAddLodgAcct.findByMsgTyId", query = "SELECT m FROM McAddLodgAcct m WHERE m.msgTyId = :msgTyId"),
    @NamedQuery(name = "McAddLodgAcct.findByBitMapPri", query = "SELECT m FROM McAddLodgAcct m WHERE m.bitMapPri = :bitMapPri"),
    @NamedQuery(name = "McAddLodgAcct.findByD1BitMapSec", query = "SELECT m FROM McAddLodgAcct m WHERE m.d1BitMapSec = :d1BitMapSec"),
    @NamedQuery(name = "McAddLodgAcct.findByD24FuncCd", query = "SELECT m FROM McAddLodgAcct m WHERE m.d24FuncCd = :d24FuncCd"),
    @NamedQuery(name = "McAddLodgAcct.findByD32AcqInstIdCd", query = "SELECT m FROM McAddLodgAcct m WHERE m.d32AcqInstIdCd = :d32AcqInstIdCd"),
    @NamedQuery(name = "McAddLodgAcct.findByD33FwdngInstCd", query = "SELECT m FROM McAddLodgAcct m WHERE m.d33FwdngInstCd = :d33FwdngInstCd"),
    @NamedQuery(name = "McAddLodgAcct.findByD48AddtlDat", query = "SELECT m FROM McAddLodgAcct m WHERE m.d48AddtlDat = :d48AddtlDat"),
    @NamedQuery(name = "McAddLodgAcct.findByP191OrMsgFmt", query = "SELECT m FROM McAddLodgAcct m WHERE m.p191OrMsgFmt = :p191OrMsgFmt"),
    @NamedQuery(name = "McAddLodgAcct.findByP501s1UsageCd", query = "SELECT m FROM McAddLodgAcct m WHERE m.p501s1UsageCd = :p501s1UsageCd"),
    @NamedQuery(name = "McAddLodgAcct.findByP501s2IndstyRec", query = "SELECT m FROM McAddLodgAcct m WHERE m.p501s2IndstyRec = :p501s2IndstyRec"),
    @NamedQuery(name = "McAddLodgAcct.findByP501s3OccInd", query = "SELECT m FROM McAddLodgAcct m WHERE m.mcAddLodgAcctPK.p501s3OccInd = :p501s3OccInd"),
    @NamedQuery(name = "McAddLodgAcct.findByP501s4MsgNo", query = "SELECT m FROM McAddLodgAcct m WHERE m.mcAddLodgAcctPK.p501s4MsgNo = :p501s4MsgNo"),
    @NamedQuery(name = "McAddLodgAcct.findByP502s1CustIdTyp", query = "SELECT m FROM McAddLodgAcct m WHERE m.p502s1CustIdTyp = :p502s1CustIdTyp"),
    @NamedQuery(name = "McAddLodgAcct.findByP502s2CustIdDtl", query = "SELECT m FROM McAddLodgAcct m WHERE m.p502s2CustIdDtl = :p502s2CustIdDtl"),
    @NamedQuery(name = "McAddLodgAcct.findByP759DelvrOrdrNo", query = "SELECT m FROM McAddLodgAcct m WHERE m.p759DelvrOrdrNo = :p759DelvrOrdrNo"),
    @NamedQuery(name = "McAddLodgAcct.findByP760CcrdSlipNo", query = "SELECT m FROM McAddLodgAcct m WHERE m.p760CcrdSlipNo = :p760CcrdSlipNo"),
    @NamedQuery(name = "McAddLodgAcct.findByP761TrvlAgncyNo", query = "SELECT m FROM McAddLodgAcct m WHERE m.p761TrvlAgncyNo = :p761TrvlAgncyNo"),
    @NamedQuery(name = "McAddLodgAcct.findByP762DataSource", query = "SELECT m FROM McAddLodgAcct m WHERE m.p762DataSource = :p762DataSource"),
    @NamedQuery(name = "McAddLodgAcct.findByP763VatSuprsInd", query = "SELECT m FROM McAddLodgAcct m WHERE m.p763VatSuprsInd = :p763VatSuprsInd"),
    @NamedQuery(name = "McAddLodgAcct.findByD62AddtlData2", query = "SELECT m FROM McAddLodgAcct m WHERE m.d62AddtlData2 = :d62AddtlData2"),
    @NamedQuery(name = "McAddLodgAcct.findByD63s1LfcycSpInd", query = "SELECT m FROM McAddLodgAcct m WHERE m.d63s1LfcycSpInd = :d63s1LfcycSpInd"),
    @NamedQuery(name = "McAddLodgAcct.findByD63s2TraceId", query = "SELECT m FROM McAddLodgAcct m WHERE m.d63s2TraceId = :d63s2TraceId"),
    @NamedQuery(name = "McAddLodgAcct.findByD71MsgNo", query = "SELECT m FROM McAddLodgAcct m WHERE m.mcAddLodgAcctPK.d71MsgNo = :d71MsgNo"),
    @NamedQuery(name = "McAddLodgAcct.findByD93TrDestInst", query = "SELECT m FROM McAddLodgAcct m WHERE m.d93TrDestInst = :d93TrDestInst"),
    @NamedQuery(name = "McAddLodgAcct.findByD94TrOrgInst", query = "SELECT m FROM McAddLodgAcct m WHERE m.d94TrOrgInst = :d94TrOrgInst"),
    @NamedQuery(name = "McAddLodgAcct.findByD100RecvInstId", query = "SELECT m FROM McAddLodgAcct m WHERE m.d100RecvInstId = :d100RecvInstId"),
    @NamedQuery(name = "McAddLodgAcct.findByD123AddtlDat3", query = "SELECT m FROM McAddLodgAcct m WHERE m.d123AddtlDat3 = :d123AddtlDat3"),
    @NamedQuery(name = "McAddLodgAcct.findByD124AddtlDat4", query = "SELECT m FROM McAddLodgAcct m WHERE m.d124AddtlDat4 = :d124AddtlDat4"),
    @NamedQuery(name = "McAddLodgAcct.findByD125AddtlDat5", query = "SELECT m FROM McAddLodgAcct m WHERE m.d125AddtlDat5 = :d125AddtlDat5")})
public class McAddLodgAcct implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected McAddLodgAcctPK mcAddLodgAcctPK;
    @Basic(optional = false)
    @Column(name = "MSG_TY_ID")
    private short msgTyId;
    @Basic(optional = false)
    @Column(name = "BIT_MAP_PRI")
    private String bitMapPri;
    @Basic(optional = false)
    @Column(name = "D1_BIT_MAP_SEC")
    private String d1BitMapSec;
    @Basic(optional = false)
    @Column(name = "D24_FUNC_CD")
    private short d24FuncCd;
    @Basic(optional = false)
    @Column(name = "D32_ACQ_INST_ID_CD")
    private long d32AcqInstIdCd;
    @Basic(optional = false)
    @Column(name = "D33_FWDNG_INST_CD")
    private long d33FwdngInstCd;
    @Basic(optional = false)
    @Column(name = "D48_ADDTL_DAT")
    private String d48AddtlDat;
    @Basic(optional = false)
    @Column(name = "P191_OR_MSG_FMT")
    private short p191OrMsgFmt;
    @Basic(optional = false)
    @Column(name = "P501S1_USAGE_CD")
    private short p501s1UsageCd;
    @Basic(optional = false)
    @Column(name = "P501S2_INDSTY_REC")
    private short p501s2IndstyRec;
    @Basic(optional = false)
    @Column(name = "P502S1_CUST_ID_TYP")
    private String p502s1CustIdTyp;
    @Basic(optional = false)
    @Column(name = "P502S2_CUST_ID_DTL")
    private String p502s2CustIdDtl;
    @Basic(optional = false)
    @Column(name = "P759_DELVR_ORDR_NO")
    private String p759DelvrOrdrNo;
    @Basic(optional = false)
    @Column(name = "P760_CCRD_SLIP_NO")
    private String p760CcrdSlipNo;
    @Basic(optional = false)
    @Column(name = "P761_TRVL_AGNCY_NO")
    private String p761TrvlAgncyNo;
    @Basic(optional = false)
    @Column(name = "P762_DATA_SOURCE")
    private short p762DataSource;
    @Basic(optional = false)
    @Column(name = "P763_VAT_SUPRS_IND")
    private String p763VatSuprsInd;
    @Basic(optional = false)
    @Column(name = "D62_ADDTL_DATA_2")
    private String d62AddtlData2;
    @Basic(optional = false)
    @Column(name = "D63S1_LFCYC_SP_IND")
    private Character d63s1LfcycSpInd;
    @Basic(optional = false)
    @Column(name = "D63S2_TRACE_ID")
    private String d63s2TraceId;
    @Basic(optional = false)
    @Column(name = "D93_TR_DEST_INST")
    private long d93TrDestInst;
    @Basic(optional = false)
    @Column(name = "D94_TR_ORG_INST")
    private long d94TrOrgInst;
    @Basic(optional = false)
    @Column(name = "D100_RECV_INST_ID")
    private long d100RecvInstId;
    @Basic(optional = false)
    @Column(name = "D123_ADDTL_DAT_3")
    private String d123AddtlDat3;
    @Basic(optional = false)
    @Column(name = "D124_ADDTL_DAT_4")
    private String d124AddtlDat4;
    @Basic(optional = false)
    @Column(name = "D125_ADDTL_DAT_5")
    private String d125AddtlDat5;

    public McAddLodgAcct() {
    }

    public McAddLodgAcct(McAddLodgAcctPK mcAddLodgAcctPK) {
        this.mcAddLodgAcctPK = mcAddLodgAcctPK;
    }

    public McAddLodgAcct(McAddLodgAcctPK mcAddLodgAcctPK, short msgTyId, String bitMapPri, String d1BitMapSec, short d24FuncCd, long d32AcqInstIdCd, long d33FwdngInstCd, String d48AddtlDat, short p191OrMsgFmt, short p501s1UsageCd, short p501s2IndstyRec, String p502s1CustIdTyp, String p502s2CustIdDtl, String p759DelvrOrdrNo, String p760CcrdSlipNo, String p761TrvlAgncyNo, short p762DataSource, String p763VatSuprsInd, String d62AddtlData2, Character d63s1LfcycSpInd, String d63s2TraceId, long d93TrDestInst, long d94TrOrgInst, long d100RecvInstId, String d123AddtlDat3, String d124AddtlDat4, String d125AddtlDat5) {
        this.mcAddLodgAcctPK = mcAddLodgAcctPK;
        this.msgTyId = msgTyId;
        this.bitMapPri = bitMapPri;
        this.d1BitMapSec = d1BitMapSec;
        this.d24FuncCd = d24FuncCd;
        this.d32AcqInstIdCd = d32AcqInstIdCd;
        this.d33FwdngInstCd = d33FwdngInstCd;
        this.d48AddtlDat = d48AddtlDat;
        this.p191OrMsgFmt = p191OrMsgFmt;
        this.p501s1UsageCd = p501s1UsageCd;
        this.p501s2IndstyRec = p501s2IndstyRec;
        this.p502s1CustIdTyp = p502s1CustIdTyp;
        this.p502s2CustIdDtl = p502s2CustIdDtl;
        this.p759DelvrOrdrNo = p759DelvrOrdrNo;
        this.p760CcrdSlipNo = p760CcrdSlipNo;
        this.p761TrvlAgncyNo = p761TrvlAgncyNo;
        this.p762DataSource = p762DataSource;
        this.p763VatSuprsInd = p763VatSuprsInd;
        this.d62AddtlData2 = d62AddtlData2;
        this.d63s1LfcycSpInd = d63s1LfcycSpInd;
        this.d63s2TraceId = d63s2TraceId;
        this.d93TrDestInst = d93TrDestInst;
        this.d94TrOrgInst = d94TrOrgInst;
        this.d100RecvInstId = d100RecvInstId;
        this.d123AddtlDat3 = d123AddtlDat3;
        this.d124AddtlDat4 = d124AddtlDat4;
        this.d125AddtlDat5 = d125AddtlDat5;
    }

    public McAddLodgAcct(short p105s1FileTy, int p105s2FileRDt, long p105s3ProcId, int p105s4FileSeqNo, short p501s3OccInd, int p501s4MsgNo, int d71MsgNo) {
        this.mcAddLodgAcctPK = new McAddLodgAcctPK(p105s1FileTy, p105s2FileRDt, p105s3ProcId, p105s4FileSeqNo, p501s3OccInd, p501s4MsgNo, d71MsgNo);
    }

    public McAddLodgAcctPK getMcAddLodgAcctPK() {
        return mcAddLodgAcctPK;
    }

    public void setMcAddLodgAcctPK(McAddLodgAcctPK mcAddLodgAcctPK) {
        this.mcAddLodgAcctPK = mcAddLodgAcctPK;
    }

    public short getMsgTyId() {
        return msgTyId;
    }

    public void setMsgTyId(short msgTyId) {
        this.msgTyId = msgTyId;
    }

    public String getBitMapPri() {
        return bitMapPri;
    }

    public void setBitMapPri(String bitMapPri) {
        this.bitMapPri = bitMapPri;
    }

    public String getD1BitMapSec() {
        return d1BitMapSec;
    }

    public void setD1BitMapSec(String d1BitMapSec) {
        this.d1BitMapSec = d1BitMapSec;
    }

    public short getD24FuncCd() {
        return d24FuncCd;
    }

    public void setD24FuncCd(short d24FuncCd) {
        this.d24FuncCd = d24FuncCd;
    }

    public long getD32AcqInstIdCd() {
        return d32AcqInstIdCd;
    }

    public void setD32AcqInstIdCd(long d32AcqInstIdCd) {
        this.d32AcqInstIdCd = d32AcqInstIdCd;
    }

    public long getD33FwdngInstCd() {
        return d33FwdngInstCd;
    }

    public void setD33FwdngInstCd(long d33FwdngInstCd) {
        this.d33FwdngInstCd = d33FwdngInstCd;
    }

    public String getD48AddtlDat() {
        return d48AddtlDat;
    }

    public void setD48AddtlDat(String d48AddtlDat) {
        this.d48AddtlDat = d48AddtlDat;
    }

    public short getP191OrMsgFmt() {
        return p191OrMsgFmt;
    }

    public void setP191OrMsgFmt(short p191OrMsgFmt) {
        this.p191OrMsgFmt = p191OrMsgFmt;
    }

    public short getP501s1UsageCd() {
        return p501s1UsageCd;
    }

    public void setP501s1UsageCd(short p501s1UsageCd) {
        this.p501s1UsageCd = p501s1UsageCd;
    }

    public short getP501s2IndstyRec() {
        return p501s2IndstyRec;
    }

    public void setP501s2IndstyRec(short p501s2IndstyRec) {
        this.p501s2IndstyRec = p501s2IndstyRec;
    }

    public String getP502s1CustIdTyp() {
        return p502s1CustIdTyp;
    }

    public void setP502s1CustIdTyp(String p502s1CustIdTyp) {
        this.p502s1CustIdTyp = p502s1CustIdTyp;
    }

    public String getP502s2CustIdDtl() {
        return p502s2CustIdDtl;
    }

    public void setP502s2CustIdDtl(String p502s2CustIdDtl) {
        this.p502s2CustIdDtl = p502s2CustIdDtl;
    }

    public String getP759DelvrOrdrNo() {
        return p759DelvrOrdrNo;
    }

    public void setP759DelvrOrdrNo(String p759DelvrOrdrNo) {
        this.p759DelvrOrdrNo = p759DelvrOrdrNo;
    }

    public String getP760CcrdSlipNo() {
        return p760CcrdSlipNo;
    }

    public void setP760CcrdSlipNo(String p760CcrdSlipNo) {
        this.p760CcrdSlipNo = p760CcrdSlipNo;
    }

    public String getP761TrvlAgncyNo() {
        return p761TrvlAgncyNo;
    }

    public void setP761TrvlAgncyNo(String p761TrvlAgncyNo) {
        this.p761TrvlAgncyNo = p761TrvlAgncyNo;
    }

    public short getP762DataSource() {
        return p762DataSource;
    }

    public void setP762DataSource(short p762DataSource) {
        this.p762DataSource = p762DataSource;
    }

    public String getP763VatSuprsInd() {
        return p763VatSuprsInd;
    }

    public void setP763VatSuprsInd(String p763VatSuprsInd) {
        this.p763VatSuprsInd = p763VatSuprsInd;
    }

    public String getD62AddtlData2() {
        return d62AddtlData2;
    }

    public void setD62AddtlData2(String d62AddtlData2) {
        this.d62AddtlData2 = d62AddtlData2;
    }

    public Character getD63s1LfcycSpInd() {
        return d63s1LfcycSpInd;
    }

    public void setD63s1LfcycSpInd(Character d63s1LfcycSpInd) {
        this.d63s1LfcycSpInd = d63s1LfcycSpInd;
    }

    public String getD63s2TraceId() {
        return d63s2TraceId;
    }

    public void setD63s2TraceId(String d63s2TraceId) {
        this.d63s2TraceId = d63s2TraceId;
    }

    public long getD93TrDestInst() {
        return d93TrDestInst;
    }

    public void setD93TrDestInst(long d93TrDestInst) {
        this.d93TrDestInst = d93TrDestInst;
    }

    public long getD94TrOrgInst() {
        return d94TrOrgInst;
    }

    public void setD94TrOrgInst(long d94TrOrgInst) {
        this.d94TrOrgInst = d94TrOrgInst;
    }

    public long getD100RecvInstId() {
        return d100RecvInstId;
    }

    public void setD100RecvInstId(long d100RecvInstId) {
        this.d100RecvInstId = d100RecvInstId;
    }

    public String getD123AddtlDat3() {
        return d123AddtlDat3;
    }

    public void setD123AddtlDat3(String d123AddtlDat3) {
        this.d123AddtlDat3 = d123AddtlDat3;
    }

    public String getD124AddtlDat4() {
        return d124AddtlDat4;
    }

    public void setD124AddtlDat4(String d124AddtlDat4) {
        this.d124AddtlDat4 = d124AddtlDat4;
    }

    public String getD125AddtlDat5() {
        return d125AddtlDat5;
    }

    public void setD125AddtlDat5(String d125AddtlDat5) {
        this.d125AddtlDat5 = d125AddtlDat5;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mcAddLodgAcctPK != null ? mcAddLodgAcctPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof McAddLodgAcct)) {
            return false;
        }
        McAddLodgAcct other = (McAddLodgAcct) object;
        if ((this.mcAddLodgAcctPK == null && other.mcAddLodgAcctPK != null) || (this.mcAddLodgAcctPK != null && !this.mcAddLodgAcctPK.equals(other.mcAddLodgAcctPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.cxxcow.McAddLodgAcct[ mcAddLodgAcctPK=" + mcAddLodgAcctPK + " ]";
    }
    
}
