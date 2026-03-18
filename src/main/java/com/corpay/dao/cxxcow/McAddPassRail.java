package com.corpay.dao.cxxcow;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Table(name = "MC_ADD_PASS_RAIL", catalog = "", schema = "CXXCOW")
public class McAddPassRail implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected McAddPassRailPK mcAddPassRailPK;
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
    @Column(name = "P505_PSGR_NM")
    private String p505PsgrNm;
    @Basic(optional = false)
    @Column(name = "P506_TICKET_NO")
    private String p506TicketNo;
    @Basic(optional = false)
    @Column(name = "P510_TRAV_AGNCY")
    private String p510TravAgncy;
    @Basic(optional = false)
    @Column(name = "P511_TRAV_AG_NM")
    private String p511TravAgNm;
    @Basic(optional = false)
    @Column(name = "P520_TRAVEL_DT")
    private int p520TravelDt;
    @Basic(optional = false)
    @Column(name = "P611_SEQ_NO")
    private String p611SeqNo;
    @Basic(optional = false)
    @Column(name = "P651_PROC_ID")
    private String p651ProcId;
    @Basic(optional = false)
    @Column(name = "P652S1_SRVC_TYP")
    private String p652s1SrvcTyp;
    @Basic(optional = false)
    @Column(name = "P652S2_SRVC_NATURE")
    private String p652s2SrvcNature;

    @Basic(optional = false)
    @Column(name = "P653S1_SRVC_AMT")
    private BigDecimal p653s1SrvcAmt;
    @Basic(optional = false)
    @Column(name = "P653S2_SRVC_EXP")
    private short p653s2SrvcExp;
    @Basic(optional = false)
    @Column(name = "P653S3_SRVC_SGN")
    private Character p653s3SrvcSgn;
    @Basic(optional = false)
    @Column(name = "P656S1_FULLVAT_AMT")
    private BigDecimal p656s1FullvatAmt;
    @Basic(optional = false)
    @Column(name = "P656S2_FULLVAT_EXP")
    private short p656s2FullvatExp;
    @Basic(optional = false)
    @Column(name = "P656S3_FULLVAT_SGN")
    private Character p656s3FullvatSgn;
    @Basic(optional = false)
    @Column(name = "P656S4_FULLVAT_AMT")
    private BigDecimal p656s4FullvatAmt;
    @Basic(optional = false)
    @Column(name = "P656S5_FULLVAT_EXP")
    private short p656s5FullvatExp;
    @Basic(optional = false)
    @Column(name = "P656S6_FULLVAT_SGN")
    private Character p656s6FullvatSgn;
    @Basic(optional = false)
    @Column(name = "P657S1_HALFVAT_AMT")
    private BigDecimal p657s1HalfvatAmt;
    @Basic(optional = false)
    @Column(name = "P657S2_HALFVAT_EXP")
    private short p657s2HalfvatExp;
    @Basic(optional = false)
    @Column(name = "P657S3_HALFVAT_SGN")
    private Character p657s3HalfvatSgn;
    @Basic(optional = false)
    @Column(name = "P657S4_HALFVAT_AMT")
    private BigDecimal p657s4HalfvatAmt;
    @Basic(optional = false)
    @Column(name = "P657S5_HALFVAT_EXP")
    private short p657s5HalfvatExp;
    @Basic(optional = false)
    @Column(name = "P657S6_HALFVAT_SGN")
    private Character p657s6HalfvatSgn;
    @Basic(optional = false)
    @Column(name = "P661_TRAFFIC_CD")
    private short p661TrafficCd;
    @Basic(optional = false)
    @Column(name = "P662_SAMPLE_NO")
    private short p662SampleNo;
    @Basic(optional = false)
    @Column(name = "P664_START_STATION")
    private String p664StartStation;
    @Basic(optional = false)
    @Column(name = "P665_DEST_STATION")
    private String p665DestStation;
    @Basic(optional = false)
    @Column(name = "P667S1_GENERIC_CD")
    private short p667s1GenericCd;
    @Basic(optional = false)
    @Column(name = "P667S2_GENERIC_NO")
    private String p667s2GenericNo;
    @Basic(optional = false)
    @Column(name = "P667S3_GENERIC2_CD")
    private short p667s3Generic2Cd;
    @Basic(optional = false)
    @Column(name = "P667S4_GENERIC2_NO")
    private String p667s4Generic2No;
    @Basic(optional = false)
    @Column(name = "P668S1_REDUCTN_CD")
    private short p668s1ReductnCd;
    @Basic(optional = false)
    @Column(name = "P668S2_REDUCTN_NO")
    private String p668s2ReductnNo;
    @Basic(optional = false)
    @Column(name = "P668S3_REDUCTN_CD")
    private short p668s3ReductnCd;
    @Basic(optional = false)
    @Column(name = "P668S4_REDUCTN_NO")
    private String p668s4ReductnNo;
    @Basic(optional = false)
    @Column(name = "P669_TRNSP_OTH_CD")
    private short p669TrnspOthCd;
    @Basic(optional = false)
    @Column(name = "P756S1_ADULT_CNT")
    private short p756s1AdultCnt;
    @Basic(optional = false)
    @Column(name = "P756S2_CHILD_CNT")
    private short p756s2ChildCnt;
    @Basic(optional = false)
    @Column(name = "P756S3_CLASS")
    private Character p756s3Class;
    @Basic(optional = false)
    @Column(name = "P757_TRNSP_SVC_PRV")
    private String p757TrnspSvcPrv;
    @Basic(optional = false)
    @Column(name = "P758_TRNSP_SVC_OFR")
    private String p758TrnspSvcOfr;
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

    public McAddPassRail() {
    }

    public McAddPassRail(McAddPassRailPK mcAddPassRailPK) {
        this.mcAddPassRailPK = mcAddPassRailPK;
    }

    public McAddPassRail(McAddPassRailPK mcAddPassRailPK, short msgTyId, String bitMapPri, String d1BitMapSec, short d24FuncCd, long d32AcqInstIdCd, long d33FwdngInstCd, String d48AddtlDat, short p191OrMsgFmt, short p501s1UsageCd, short p501s2IndstyRec, String p505PsgrNm, String p506TicketNo, String p510TravAgncy, String p511TravAgNm, int p520TravelDt, String p611SeqNo, String p651ProcId, String p652s1SrvcTyp, String p652s2SrvcNature, BigDecimal p653s1SrvcAmt, short p653s2SrvcExp, Character p653s3SrvcSgn, BigDecimal p656s1FullvatAmt, short p656s2FullvatExp, Character p656s3FullvatSgn, BigDecimal p656s4FullvatAmt, short p656s5FullvatExp, Character p656s6FullvatSgn, BigDecimal p657s1HalfvatAmt, short p657s2HalfvatExp, Character p657s3HalfvatSgn, BigDecimal p657s4HalfvatAmt, short p657s5HalfvatExp, Character p657s6HalfvatSgn, short p661TrafficCd, short p662SampleNo, String p664StartStation, String p665DestStation, short p667s1GenericCd, String p667s2GenericNo, short p667s3Generic2Cd, String p667s4Generic2No, short p668s1ReductnCd, String p668s2ReductnNo, short p668s3ReductnCd, String p668s4ReductnNo, short p669TrnspOthCd, short p756s1AdultCnt, short p756s2ChildCnt, Character p756s3Class, String p757TrnspSvcPrv, String p758TrnspSvcOfr, String d62AddtlData2, Character d63s1LfcycSpInd, String d63s2TraceId, long d93TrDestInst, long d94TrOrgInst, long d100RecvInstId, String d123AddtlDat3, String d124AddtlDat4, String d125AddtlDat5) {
        this.mcAddPassRailPK = mcAddPassRailPK;
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
        this.p505PsgrNm = p505PsgrNm;
        this.p506TicketNo = p506TicketNo;
        this.p510TravAgncy = p510TravAgncy;
        this.p511TravAgNm = p511TravAgNm;
        this.p520TravelDt = p520TravelDt;
        this.p611SeqNo = p611SeqNo;
        this.p651ProcId = p651ProcId;
        this.p652s1SrvcTyp = p652s1SrvcTyp;
        this.p652s2SrvcNature = p652s2SrvcNature;
        this.p653s1SrvcAmt = p653s1SrvcAmt;
        this.p653s2SrvcExp = p653s2SrvcExp;
        this.p653s3SrvcSgn = p653s3SrvcSgn;
        this.p656s1FullvatAmt = p656s1FullvatAmt;
        this.p656s2FullvatExp = p656s2FullvatExp;
        this.p656s3FullvatSgn = p656s3FullvatSgn;
        this.p656s4FullvatAmt = p656s4FullvatAmt;
        this.p656s5FullvatExp = p656s5FullvatExp;
        this.p656s6FullvatSgn = p656s6FullvatSgn;
        this.p657s1HalfvatAmt = p657s1HalfvatAmt;
        this.p657s2HalfvatExp = p657s2HalfvatExp;
        this.p657s3HalfvatSgn = p657s3HalfvatSgn;
        this.p657s4HalfvatAmt = p657s4HalfvatAmt;
        this.p657s5HalfvatExp = p657s5HalfvatExp;
        this.p657s6HalfvatSgn = p657s6HalfvatSgn;
        this.p661TrafficCd = p661TrafficCd;
        this.p662SampleNo = p662SampleNo;
        this.p664StartStation = p664StartStation;
        this.p665DestStation = p665DestStation;
        this.p667s1GenericCd = p667s1GenericCd;
        this.p667s2GenericNo = p667s2GenericNo;
        this.p667s3Generic2Cd = p667s3Generic2Cd;
        this.p667s4Generic2No = p667s4Generic2No;
        this.p668s1ReductnCd = p668s1ReductnCd;
        this.p668s2ReductnNo = p668s2ReductnNo;
        this.p668s3ReductnCd = p668s3ReductnCd;
        this.p668s4ReductnNo = p668s4ReductnNo;
        this.p669TrnspOthCd = p669TrnspOthCd;
        this.p756s1AdultCnt = p756s1AdultCnt;
        this.p756s2ChildCnt = p756s2ChildCnt;
        this.p756s3Class = p756s3Class;
        this.p757TrnspSvcPrv = p757TrnspSvcPrv;
        this.p758TrnspSvcOfr = p758TrnspSvcOfr;
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

    public McAddPassRail(short p105s1FileTy, int p105s2FileRDt, long p105s3ProcId, int p105s4FileSeqNo, short p501s3OccInd, int p501s4MsgNo, int d71MsgNo) {
        this.mcAddPassRailPK = new McAddPassRailPK(p105s1FileTy, p105s2FileRDt, p105s3ProcId, p105s4FileSeqNo, p501s3OccInd, p501s4MsgNo, d71MsgNo);
    }

    public McAddPassRailPK getMcAddPassRailPK() {
        return mcAddPassRailPK;
    }

    public void setMcAddPassRailPK(McAddPassRailPK mcAddPassRailPK) {
        this.mcAddPassRailPK = mcAddPassRailPK;
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

    public String getP505PsgrNm() {
        return p505PsgrNm;
    }

    public void setP505PsgrNm(String p505PsgrNm) {
        this.p505PsgrNm = p505PsgrNm;
    }

    public String getP506TicketNo() {
        return p506TicketNo;
    }

    public void setP506TicketNo(String p506TicketNo) {
        this.p506TicketNo = p506TicketNo;
    }

    public String getP510TravAgncy() {
        return p510TravAgncy;
    }

    public void setP510TravAgncy(String p510TravAgncy) {
        this.p510TravAgncy = p510TravAgncy;
    }

    public String getP511TravAgNm() {
        return p511TravAgNm;
    }

    public void setP511TravAgNm(String p511TravAgNm) {
        this.p511TravAgNm = p511TravAgNm;
    }

    public int getP520TravelDt() {
        return p520TravelDt;
    }

    public void setP520TravelDt(int p520TravelDt) {
        this.p520TravelDt = p520TravelDt;
    }

    public String getP611SeqNo() {
        return p611SeqNo;
    }

    public void setP611SeqNo(String p611SeqNo) {
        this.p611SeqNo = p611SeqNo;
    }

    public String getP651ProcId() {
        return p651ProcId;
    }

    public void setP651ProcId(String p651ProcId) {
        this.p651ProcId = p651ProcId;
    }

    public String getP652s1SrvcTyp() {
        return p652s1SrvcTyp;
    }

    public void setP652s1SrvcTyp(String p652s1SrvcTyp) {
        this.p652s1SrvcTyp = p652s1SrvcTyp;
    }

    public String getP652s2SrvcNature() {
        return p652s2SrvcNature;
    }

    public void setP652s2SrvcNature(String p652s2SrvcNature) {
        this.p652s2SrvcNature = p652s2SrvcNature;
    }

    public BigDecimal getP653s1SrvcAmt() {
        return p653s1SrvcAmt;
    }

    public void setP653s1SrvcAmt(BigDecimal p653s1SrvcAmt) {
        this.p653s1SrvcAmt = p653s1SrvcAmt;
    }

    public short getP653s2SrvcExp() {
        return p653s2SrvcExp;
    }

    public void setP653s2SrvcExp(short p653s2SrvcExp) {
        this.p653s2SrvcExp = p653s2SrvcExp;
    }

    public Character getP653s3SrvcSgn() {
        return p653s3SrvcSgn;
    }

    public void setP653s3SrvcSgn(Character p653s3SrvcSgn) {
        this.p653s3SrvcSgn = p653s3SrvcSgn;
    }

    public BigDecimal getP656s1FullvatAmt() {
        return p656s1FullvatAmt;
    }

    public void setP656s1FullvatAmt(BigDecimal p656s1FullvatAmt) {
        this.p656s1FullvatAmt = p656s1FullvatAmt;
    }

    public short getP656s2FullvatExp() {
        return p656s2FullvatExp;
    }

    public void setP656s2FullvatExp(short p656s2FullvatExp) {
        this.p656s2FullvatExp = p656s2FullvatExp;
    }

    public Character getP656s3FullvatSgn() {
        return p656s3FullvatSgn;
    }

    public void setP656s3FullvatSgn(Character p656s3FullvatSgn) {
        this.p656s3FullvatSgn = p656s3FullvatSgn;
    }

    public BigDecimal getP656s4FullvatAmt() {
        return p656s4FullvatAmt;
    }

    public void setP656s4FullvatAmt(BigDecimal p656s4FullvatAmt) {
        this.p656s4FullvatAmt = p656s4FullvatAmt;
    }

    public short getP656s5FullvatExp() {
        return p656s5FullvatExp;
    }

    public void setP656s5FullvatExp(short p656s5FullvatExp) {
        this.p656s5FullvatExp = p656s5FullvatExp;
    }

    public Character getP656s6FullvatSgn() {
        return p656s6FullvatSgn;
    }

    public void setP656s6FullvatSgn(Character p656s6FullvatSgn) {
        this.p656s6FullvatSgn = p656s6FullvatSgn;
    }

    public BigDecimal getP657s1HalfvatAmt() {
        return p657s1HalfvatAmt;
    }

    public void setP657s1HalfvatAmt(BigDecimal p657s1HalfvatAmt) {
        this.p657s1HalfvatAmt = p657s1HalfvatAmt;
    }

    public short getP657s2HalfvatExp() {
        return p657s2HalfvatExp;
    }

    public void setP657s2HalfvatExp(short p657s2HalfvatExp) {
        this.p657s2HalfvatExp = p657s2HalfvatExp;
    }

    public Character getP657s3HalfvatSgn() {
        return p657s3HalfvatSgn;
    }

    public void setP657s3HalfvatSgn(Character p657s3HalfvatSgn) {
        this.p657s3HalfvatSgn = p657s3HalfvatSgn;
    }

    public BigDecimal getP657s4HalfvatAmt() {
        return p657s4HalfvatAmt;
    }

    public void setP657s4HalfvatAmt(BigDecimal p657s4HalfvatAmt) {
        this.p657s4HalfvatAmt = p657s4HalfvatAmt;
    }

    public short getP657s5HalfvatExp() {
        return p657s5HalfvatExp;
    }

    public void setP657s5HalfvatExp(short p657s5HalfvatExp) {
        this.p657s5HalfvatExp = p657s5HalfvatExp;
    }

    public Character getP657s6HalfvatSgn() {
        return p657s6HalfvatSgn;
    }

    public void setP657s6HalfvatSgn(Character p657s6HalfvatSgn) {
        this.p657s6HalfvatSgn = p657s6HalfvatSgn;
    }

    public short getP661TrafficCd() {
        return p661TrafficCd;
    }

    public void setP661TrafficCd(short p661TrafficCd) {
        this.p661TrafficCd = p661TrafficCd;
    }

    public short getP662SampleNo() {
        return p662SampleNo;
    }

    public void setP662SampleNo(short p662SampleNo) {
        this.p662SampleNo = p662SampleNo;
    }

    public String getP664StartStation() {
        return p664StartStation;
    }

    public void setP664StartStation(String p664StartStation) {
        this.p664StartStation = p664StartStation;
    }

    public String getP665DestStation() {
        return p665DestStation;
    }

    public void setP665DestStation(String p665DestStation) {
        this.p665DestStation = p665DestStation;
    }

    public short getP667s1GenericCd() {
        return p667s1GenericCd;
    }

    public void setP667s1GenericCd(short p667s1GenericCd) {
        this.p667s1GenericCd = p667s1GenericCd;
    }

    public String getP667s2GenericNo() {
        return p667s2GenericNo;
    }

    public void setP667s2GenericNo(String p667s2GenericNo) {
        this.p667s2GenericNo = p667s2GenericNo;
    }

    public short getP667s3Generic2Cd() {
        return p667s3Generic2Cd;
    }

    public void setP667s3Generic2Cd(short p667s3Generic2Cd) {
        this.p667s3Generic2Cd = p667s3Generic2Cd;
    }

    public String getP667s4Generic2No() {
        return p667s4Generic2No;
    }

    public void setP667s4Generic2No(String p667s4Generic2No) {
        this.p667s4Generic2No = p667s4Generic2No;
    }

    public short getP668s1ReductnCd() {
        return p668s1ReductnCd;
    }

    public void setP668s1ReductnCd(short p668s1ReductnCd) {
        this.p668s1ReductnCd = p668s1ReductnCd;
    }

    public String getP668s2ReductnNo() {
        return p668s2ReductnNo;
    }

    public void setP668s2ReductnNo(String p668s2ReductnNo) {
        this.p668s2ReductnNo = p668s2ReductnNo;
    }

    public short getP668s3ReductnCd() {
        return p668s3ReductnCd;
    }

    public void setP668s3ReductnCd(short p668s3ReductnCd) {
        this.p668s3ReductnCd = p668s3ReductnCd;
    }

    public String getP668s4ReductnNo() {
        return p668s4ReductnNo;
    }

    public void setP668s4ReductnNo(String p668s4ReductnNo) {
        this.p668s4ReductnNo = p668s4ReductnNo;
    }

    public short getP669TrnspOthCd() {
        return p669TrnspOthCd;
    }

    public void setP669TrnspOthCd(short p669TrnspOthCd) {
        this.p669TrnspOthCd = p669TrnspOthCd;
    }

    public short getP756s1AdultCnt() {
        return p756s1AdultCnt;
    }

    public void setP756s1AdultCnt(short p756s1AdultCnt) {
        this.p756s1AdultCnt = p756s1AdultCnt;
    }

    public short getP756s2ChildCnt() {
        return p756s2ChildCnt;
    }

    public void setP756s2ChildCnt(short p756s2ChildCnt) {
        this.p756s2ChildCnt = p756s2ChildCnt;
    }

    public Character getP756s3Class() {
        return p756s3Class;
    }

    public void setP756s3Class(Character p756s3Class) {
        this.p756s3Class = p756s3Class;
    }

    public String getP757TrnspSvcPrv() {
        return p757TrnspSvcPrv;
    }

    public void setP757TrnspSvcPrv(String p757TrnspSvcPrv) {
        this.p757TrnspSvcPrv = p757TrnspSvcPrv;
    }

    public String getP758TrnspSvcOfr() {
        return p758TrnspSvcOfr;
    }

    public void setP758TrnspSvcOfr(String p758TrnspSvcOfr) {
        this.p758TrnspSvcOfr = p758TrnspSvcOfr;
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
        hash += (mcAddPassRailPK != null ? mcAddPassRailPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof McAddPassRail)) {
            return false;
        }
        McAddPassRail other = (McAddPassRail) object;
        if ((this.mcAddPassRailPK == null && other.mcAddPassRailPK != null) || (this.mcAddPassRailPK != null && !this.mcAddPassRailPK.equals(other.mcAddPassRailPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.cxxcow.McAddPassRail[ mcAddPassRailPK=" + mcAddPassRailPK + " ]";
    }

}
