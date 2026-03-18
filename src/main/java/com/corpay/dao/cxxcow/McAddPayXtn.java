package com.corpay.dao.cxxcow;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "MC_ADD_PAY_XTN", catalog = "", schema = "CXXCOW")
public class McAddPayXtn implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected McAddPayXtnPK mcAddPayXtnPK;
    @Column(name = "MSG_TY_ID")
    private Short msgTyId;
    @Column(name = "BIT_MAP_PRI")
    private String bitMapPri;
    @Column(name = "D1_BIT_MAP_SEC")
    private String d1BitMapSec;
    @Column(name = "D24_FUNC_CD")
    private Short d24FuncCd;
    @Column(name = "D32_ACQ_INST_ID_CD")
    private Long d32AcqInstIdCd;
    @Column(name = "D33_FWDNG_INST_CD")
    private Long d33FwdngInstCd;
    @Column(name = "D48_ADDTL_DAT")
    private String d48AddtlDat;
    @Column(name = "P191_OR_MSG_FMT")
    private Short p191OrMsgFmt;
    @Column(name = "P501S1_USAGE_CD")
    private Short p501s1UsageCd;
    @Basic(optional = false)
    @Column(name = "P501S2_INDSTY_REC")
    private short p501s2IndstyRec;
    @Column(name = "P663_FREEFRMDESC")
    private String p663Freefrmdesc;
    @Column(name = "P671_DT_FUNDSREQ")
    private Integer p671DtFundsreq;
    @Column(name = "P672_RCP_NM")
    private String p672RcpNm;
    @Column(name = "P673_DT_ANT_RCT")
    private Integer p673DtAntRct;
    @Column(name = "P674_ADDTRREFNOU")
    private String p674Addtrrefnou;
    @Column(name = "P675_ADDTRDESCD")
    private String p675Addtrdescd;
    @Column(name = "D62_ADDTL_DATA_2")
    private String d62AddtlData2;
    @Column(name = "D63S1_LFCYC_SP_IND")
    private Character d63s1LfcycSpInd;
    @Column(name = "D63S2_TRACE_ID")
    private String d63s2TraceId;
    @Column(name = "D63S3_VALIDN_CD")
    private String d63s3ValidnCd;
    @Column(name = "D63S4_LFCYCTR_SEQ")
    private String d63s4LfcyctrSeq;
    @Column(name = "D63S5_LFCYCTR_TOT")
    private String d63s5LfcyctrTot;
    @Column(name = "P670_PYR_NM_ID")
    private String p670PyrNmId;
    @Column(name = "D93_TR_DEST_INST")
    private Long d93TrDestInst;
    @Column(name = "D94_TR_ORG_INST")
    private Long d94TrOrgInst;
    @Column(name = "D100_RECV_INST_ID")
    private Long d100RecvInstId;
    @Column(name = "D123_ADDTL_DAT_3")
    private String d123AddtlDat3;
    @Column(name = "D124_ADDTL_DAT_4")
    private String d124AddtlDat4;
    @Column(name = "D125_ADDTL_DAT_5")
    private String d125AddtlDat5;
    @Basic(optional = false)
    @Column(name = "P670S2_PYR_ADDRESS")
    private String p670s2PyrAddress;
    @Basic(optional = false)
    @Column(name = "P670S3_PYR_CITY")
    private String p670s3PyrCity;
    @Basic(optional = false)
    @Column(name = "P670S4_PYR_ST")
    private String p670s4PyrSt;
    @Basic(optional = false)
    @Column(name = "P670S5_PYR_CRTY")
    private String p670s5PyrCrty;
    @Basic(optional = false)
    @Column(name = "P670S6_PYR_ZIP")
    private String p670s6PyrZip;

    public McAddPayXtn() {
    }

    public McAddPayXtn(McAddPayXtnPK mcAddPayXtnPK) {
        this.mcAddPayXtnPK = mcAddPayXtnPK;
    }

    public McAddPayXtn(McAddPayXtnPK mcAddPayXtnPK, short p501s2IndstyRec, String p670s2PyrAddress, String p670s3PyrCity, String p670s4PyrSt, String p670s5PyrCrty, String p670s6PyrZip) {
        this.mcAddPayXtnPK = mcAddPayXtnPK;
        this.p501s2IndstyRec = p501s2IndstyRec;
        this.p670s2PyrAddress = p670s2PyrAddress;
        this.p670s3PyrCity = p670s3PyrCity;
        this.p670s4PyrSt = p670s4PyrSt;
        this.p670s5PyrCrty = p670s5PyrCrty;
        this.p670s6PyrZip = p670s6PyrZip;
    }

    public McAddPayXtn(short p105s1FileTy, int p105s2FileRDt, long p105s3ProcId, int p105s4FileSeqNo, short p501s3OccInd, int p501s4MsgNo, int d71MsgNo) {
        this.mcAddPayXtnPK = new McAddPayXtnPK(p105s1FileTy, p105s2FileRDt, p105s3ProcId, p105s4FileSeqNo, p501s3OccInd, p501s4MsgNo, d71MsgNo);
    }

    public McAddPayXtnPK getMcAddPayXtnPK() {
        return mcAddPayXtnPK;
    }

    public void setMcAddPayXtnPK(McAddPayXtnPK mcAddPayXtnPK) {
        this.mcAddPayXtnPK = mcAddPayXtnPK;
    }

    public Short getMsgTyId() {
        return msgTyId;
    }

    public void setMsgTyId(Short msgTyId) {
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

    public Short getD24FuncCd() {
        return d24FuncCd;
    }

    public void setD24FuncCd(Short d24FuncCd) {
        this.d24FuncCd = d24FuncCd;
    }

    public Long getD32AcqInstIdCd() {
        return d32AcqInstIdCd;
    }

    public void setD32AcqInstIdCd(Long d32AcqInstIdCd) {
        this.d32AcqInstIdCd = d32AcqInstIdCd;
    }

    public Long getD33FwdngInstCd() {
        return d33FwdngInstCd;
    }

    public void setD33FwdngInstCd(Long d33FwdngInstCd) {
        this.d33FwdngInstCd = d33FwdngInstCd;
    }

    public String getD48AddtlDat() {
        return d48AddtlDat;
    }

    public void setD48AddtlDat(String d48AddtlDat) {
        this.d48AddtlDat = d48AddtlDat;
    }

    public Short getP191OrMsgFmt() {
        return p191OrMsgFmt;
    }

    public void setP191OrMsgFmt(Short p191OrMsgFmt) {
        this.p191OrMsgFmt = p191OrMsgFmt;
    }

    public Short getP501s1UsageCd() {
        return p501s1UsageCd;
    }

    public void setP501s1UsageCd(Short p501s1UsageCd) {
        this.p501s1UsageCd = p501s1UsageCd;
    }

    public short getP501s2IndstyRec() {
        return p501s2IndstyRec;
    }

    public void setP501s2IndstyRec(short p501s2IndstyRec) {
        this.p501s2IndstyRec = p501s2IndstyRec;
    }

    public String getP663Freefrmdesc() {
        return p663Freefrmdesc;
    }

    public void setP663Freefrmdesc(String p663Freefrmdesc) {
        this.p663Freefrmdesc = p663Freefrmdesc;
    }

    public Integer getP671DtFundsreq() {
        return p671DtFundsreq;
    }

    public void setP671DtFundsreq(Integer p671DtFundsreq) {
        this.p671DtFundsreq = p671DtFundsreq;
    }

    public String getP672RcpNm() {
        return p672RcpNm;
    }

    public void setP672RcpNm(String p672RcpNm) {
        this.p672RcpNm = p672RcpNm;
    }

    public Integer getP673DtAntRct() {
        return p673DtAntRct;
    }

    public void setP673DtAntRct(Integer p673DtAntRct) {
        this.p673DtAntRct = p673DtAntRct;
    }

    public String getP674Addtrrefnou() {
        return p674Addtrrefnou;
    }

    public void setP674Addtrrefnou(String p674Addtrrefnou) {
        this.p674Addtrrefnou = p674Addtrrefnou;
    }

    public String getP675Addtrdescd() {
        return p675Addtrdescd;
    }

    public void setP675Addtrdescd(String p675Addtrdescd) {
        this.p675Addtrdescd = p675Addtrdescd;
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

    public String getD63s3ValidnCd() {
        return d63s3ValidnCd;
    }

    public void setD63s3ValidnCd(String d63s3ValidnCd) {
        this.d63s3ValidnCd = d63s3ValidnCd;
    }

    public String getD63s4LfcyctrSeq() {
        return d63s4LfcyctrSeq;
    }

    public void setD63s4LfcyctrSeq(String d63s4LfcyctrSeq) {
        this.d63s4LfcyctrSeq = d63s4LfcyctrSeq;
    }

    public String getD63s5LfcyctrTot() {
        return d63s5LfcyctrTot;
    }

    public void setD63s5LfcyctrTot(String d63s5LfcyctrTot) {
        this.d63s5LfcyctrTot = d63s5LfcyctrTot;
    }

    public String getP670PyrNmId() {
        return p670PyrNmId;
    }

    public void setP670PyrNmId(String p670PyrNmId) {
        this.p670PyrNmId = p670PyrNmId;
    }

    public Long getD93TrDestInst() {
        return d93TrDestInst;
    }

    public void setD93TrDestInst(Long d93TrDestInst) {
        this.d93TrDestInst = d93TrDestInst;
    }

    public Long getD94TrOrgInst() {
        return d94TrOrgInst;
    }

    public void setD94TrOrgInst(Long d94TrOrgInst) {
        this.d94TrOrgInst = d94TrOrgInst;
    }

    public Long getD100RecvInstId() {
        return d100RecvInstId;
    }

    public void setD100RecvInstId(Long d100RecvInstId) {
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

    public String getP670s2PyrAddress() {
        return p670s2PyrAddress;
    }

    public void setP670s2PyrAddress(String p670s2PyrAddress) {
        this.p670s2PyrAddress = p670s2PyrAddress;
    }

    public String getP670s3PyrCity() {
        return p670s3PyrCity;
    }

    public void setP670s3PyrCity(String p670s3PyrCity) {
        this.p670s3PyrCity = p670s3PyrCity;
    }

    public String getP670s4PyrSt() {
        return p670s4PyrSt;
    }

    public void setP670s4PyrSt(String p670s4PyrSt) {
        this.p670s4PyrSt = p670s4PyrSt;
    }

    public String getP670s5PyrCrty() {
        return p670s5PyrCrty;
    }

    public void setP670s5PyrCrty(String p670s5PyrCrty) {
        this.p670s5PyrCrty = p670s5PyrCrty;
    }

    public String getP670s6PyrZip() {
        return p670s6PyrZip;
    }

    public void setP670s6PyrZip(String p670s6PyrZip) {
        this.p670s6PyrZip = p670s6PyrZip;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mcAddPayXtnPK != null ? mcAddPayXtnPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof McAddPayXtn)) {
            return false;
        }
        McAddPayXtn other = (McAddPayXtn) object;
        if ((this.mcAddPayXtnPK == null && other.mcAddPayXtnPK != null) || (this.mcAddPayXtnPK != null && !this.mcAddPayXtnPK.equals(other.mcAddPayXtnPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.cxxcow.McAddPayXtn[ mcAddPayXtnPK=" + mcAddPayXtnPK + " ]";
    }

}
