package com.corpay.dao.cxxcow;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Table(name = "MC_FIRST_PRES_SUPB", catalog = "", schema = "CXXCOW")
public class McFirstPresSupb implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected McFirstPresSupbPK mcFirstPresSupbPK;

    @Column(name = "D8_CH_BL_FEE_AMT")
    private BigDecimal d8ChBlFeeAmt;
    @Column(name = "D35_TRACK_2_DATA")
    private String d35Track2Data;
    @Column(name = "D45_TRACK_1_DAT")
    private String d45Track1Dat;
    @Column(name = "P020_ICCR_EFF_DT")
    private Integer p020IccrEffDt;
    @Column(name = "P021_ICCR_PERC")
    private BigDecimal p021IccrPerc;
    @Column(name = "P161S1_S_SRVC_TAI")
    private String p161s1SSrvcTai;
    @Column(name = "P161S2_S_SRVC_TAA")
    private String p161s2SSrvcTaa;
    @Column(name = "P161S3_S_SRVC_LVL")
    private Short p161s3SSrvcLvl;
    @Column(name = "P161S4_S_SRVC_ID")
    private String p161s4SSrvcId;
    @Column(name = "P161S5_S_FE_RT_CL")
    private Character p161s5SFeRtCl;
    @Column(name = "P161S6_RECON_DT")
    private Integer p161s6ReconDt;
    @Column(name = "P161S7_RECON_CYCLE")
    private Short p161s7ReconCycle;
    @Column(name = "P161S8_S_DT")
    private Integer p161s8SDt;
    @Column(name = "P161S9_S_CYCLE")
    private Short p161s9SCycle;
    @Column(name = "P171S1_CHR_SET_IND")
    private String p171s1ChrSetInd;
    @Column(name = "P171S2_CRD_ACPDSC")
    private String p171s2CrdAcpdsc;
    @Column(name = "P175_CRD_ACP_URL")
    private String p175CrdAcpUrl;
    @Column(name = "P189S1_FORMAT_NO")
    private Character p189s1FormatNo;
    @Column(name = "P189S2_PHONE_DAT")
    private String p189s2PhoneDat;
    @Column(name = "P190_PART_ID_CD")
    private String p190PartIdCd;
    @Column(name = "P375_MBR_RCN_IND")
    private String p375MbrRcnInd;
    @Column(name = "P376_MBR_RCN_IND")
    private String p376MbrRcnInd;
    @Column(name = "D55_INTD_CIR_SYS")
    private String d55IntdCirSys;
    @Column(name = "D62_ADDTL_DATA_2")
    private String d62AddtlData2;
    @Column(name = "D123_ADDTL_DAT_3")
    private String d123AddtlDat3;
    @Column(name = "D124_ADDTL_DAT_4")
    private String d124AddtlDat4;
    @Column(name = "D125_ADDTL_DAT_5")
    private String d125AddtlDat5;
    @Column(name = "P2_PROD_ID")
    private String p2ProdId;
    @Column(name = "P52S1_SECU_PROT")
    private Short p52s1SecuProt;
    @Column(name = "P52S2_CH_AUTH")
    private Short p52s2ChAuth;
    @Column(name = "P52S3_UCAF_COLIND")
    private Short p52s3UcafColind;
    @Basic(optional = false)
    @Column(name = "D54S1_ADTL_ACCT_TY")
    private short d54s1AdtlAcctTy;
    @Basic(optional = false)
    @Column(name = "D54S2_ADTL_AMT_TYP")
    private short d54s2AdtlAmtTyp;
    @Basic(optional = false)
    @Column(name = "D54S3_ADTL_CURR_CD")
    private short d54s3AdtlCurrCd;
    @Basic(optional = false)
    @Column(name = "D54S4_ADTL_AMT_SGN")
    private Character d54s4AdtlAmtSgn;
    @Basic(optional = false)
    @Column(name = "D54S5_ADTL_AMT")
    private BigDecimal d54s5AdtlAmt;
    @Basic(optional = false)
    @Column(name = "D111_MCCR_AMT")
    private BigDecimal d111MccrAmt;
    @Basic(optional = false)
    @Column(name = "P177S1_XBORDER_IND")
    private Character p177s1XborderInd;
    @Basic(optional = false)
    @Column(name = "P177S2_CURR_IND")
    private Character p177s2CurrInd;
    @Basic(optional = false)
    @Column(name = "P001S1_PPAS_ACT_TY")
    private String p001s1PpasActTy;
    @Basic(optional = false)
    @Column(name = "P001S2_PPAS_ACT_NO")
    private String p001s2PpasActNo;
    @Basic(optional = false)
    @Column(name = "P057_TRAN_CAT_IND")
    private short p057TranCatInd;
    @Basic(optional = false)
    @Column(name = "P192_PMT_INIT")
    private String p192PmtInit;

    public McFirstPresSupb() {
    }

    public McFirstPresSupb(McFirstPresSupbPK mcFirstPresSupbPK) {
        this.mcFirstPresSupbPK = mcFirstPresSupbPK;
    }

    public McFirstPresSupb(McFirstPresSupbPK mcFirstPresSupbPK, short d54s1AdtlAcctTy, short d54s2AdtlAmtTyp, short d54s3AdtlCurrCd, Character d54s4AdtlAmtSgn, BigDecimal d54s5AdtlAmt, BigDecimal d111MccrAmt, Character p177s1XborderInd, Character p177s2CurrInd, String p001s1PpasActTy, String p001s2PpasActNo, short p057TranCatInd, String p192PmtInit) {
        this.mcFirstPresSupbPK = mcFirstPresSupbPK;
        this.d54s1AdtlAcctTy = d54s1AdtlAcctTy;
        this.d54s2AdtlAmtTyp = d54s2AdtlAmtTyp;
        this.d54s3AdtlCurrCd = d54s3AdtlCurrCd;
        this.d54s4AdtlAmtSgn = d54s4AdtlAmtSgn;
        this.d54s5AdtlAmt = d54s5AdtlAmt;
        this.d111MccrAmt = d111MccrAmt;
        this.p177s1XborderInd = p177s1XborderInd;
        this.p177s2CurrInd = p177s2CurrInd;
        this.p001s1PpasActTy = p001s1PpasActTy;
        this.p001s2PpasActNo = p001s2PpasActNo;
        this.p057TranCatInd = p057TranCatInd;
        this.p192PmtInit = p192PmtInit;
    }

    public McFirstPresSupb(short p105s1FileTy, int p105s2FileRDt, long p105s3ProcId, int p105s4FileSeqNo, int d71MsgNo) {
        this.mcFirstPresSupbPK = new McFirstPresSupbPK(p105s1FileTy, p105s2FileRDt, p105s3ProcId, p105s4FileSeqNo, d71MsgNo);
    }

    public McFirstPresSupbPK getMcFirstPresSupbPK() {
        return mcFirstPresSupbPK;
    }

    public void setMcFirstPresSupbPK(McFirstPresSupbPK mcFirstPresSupbPK) {
        this.mcFirstPresSupbPK = mcFirstPresSupbPK;
    }

    public BigDecimal getD8ChBlFeeAmt() {
        return d8ChBlFeeAmt;
    }

    public void setD8ChBlFeeAmt(BigDecimal d8ChBlFeeAmt) {
        this.d8ChBlFeeAmt = d8ChBlFeeAmt;
    }

    public String getD35Track2Data() {
        return d35Track2Data;
    }

    public void setD35Track2Data(String d35Track2Data) {
        this.d35Track2Data = d35Track2Data;
    }

    public String getD45Track1Dat() {
        return d45Track1Dat;
    }

    public void setD45Track1Dat(String d45Track1Dat) {
        this.d45Track1Dat = d45Track1Dat;
    }

    public Integer getP020IccrEffDt() {
        return p020IccrEffDt;
    }

    public void setP020IccrEffDt(Integer p020IccrEffDt) {
        this.p020IccrEffDt = p020IccrEffDt;
    }

    public BigDecimal getP021IccrPerc() {
        return p021IccrPerc;
    }

    public void setP021IccrPerc(BigDecimal p021IccrPerc) {
        this.p021IccrPerc = p021IccrPerc;
    }

    public String getP161s1SSrvcTai() {
        return p161s1SSrvcTai;
    }

    public void setP161s1SSrvcTai(String p161s1SSrvcTai) {
        this.p161s1SSrvcTai = p161s1SSrvcTai;
    }

    public String getP161s2SSrvcTaa() {
        return p161s2SSrvcTaa;
    }

    public void setP161s2SSrvcTaa(String p161s2SSrvcTaa) {
        this.p161s2SSrvcTaa = p161s2SSrvcTaa;
    }

    public Short getP161s3SSrvcLvl() {
        return p161s3SSrvcLvl;
    }

    public void setP161s3SSrvcLvl(Short p161s3SSrvcLvl) {
        this.p161s3SSrvcLvl = p161s3SSrvcLvl;
    }

    public String getP161s4SSrvcId() {
        return p161s4SSrvcId;
    }

    public void setP161s4SSrvcId(String p161s4SSrvcId) {
        this.p161s4SSrvcId = p161s4SSrvcId;
    }

    public Character getP161s5SFeRtCl() {
        return p161s5SFeRtCl;
    }

    public void setP161s5SFeRtCl(Character p161s5SFeRtCl) {
        this.p161s5SFeRtCl = p161s5SFeRtCl;
    }

    public Integer getP161s6ReconDt() {
        return p161s6ReconDt;
    }

    public void setP161s6ReconDt(Integer p161s6ReconDt) {
        this.p161s6ReconDt = p161s6ReconDt;
    }

    public Short getP161s7ReconCycle() {
        return p161s7ReconCycle;
    }

    public void setP161s7ReconCycle(Short p161s7ReconCycle) {
        this.p161s7ReconCycle = p161s7ReconCycle;
    }

    public Integer getP161s8SDt() {
        return p161s8SDt;
    }

    public void setP161s8SDt(Integer p161s8SDt) {
        this.p161s8SDt = p161s8SDt;
    }

    public Short getP161s9SCycle() {
        return p161s9SCycle;
    }

    public void setP161s9SCycle(Short p161s9SCycle) {
        this.p161s9SCycle = p161s9SCycle;
    }

    public String getP171s1ChrSetInd() {
        return p171s1ChrSetInd;
    }

    public void setP171s1ChrSetInd(String p171s1ChrSetInd) {
        this.p171s1ChrSetInd = p171s1ChrSetInd;
    }

    public String getP171s2CrdAcpdsc() {
        return p171s2CrdAcpdsc;
    }

    public void setP171s2CrdAcpdsc(String p171s2CrdAcpdsc) {
        this.p171s2CrdAcpdsc = p171s2CrdAcpdsc;
    }

    public String getP175CrdAcpUrl() {
        return p175CrdAcpUrl;
    }

    public void setP175CrdAcpUrl(String p175CrdAcpUrl) {
        this.p175CrdAcpUrl = p175CrdAcpUrl;
    }

    public Character getP189s1FormatNo() {
        return p189s1FormatNo;
    }

    public void setP189s1FormatNo(Character p189s1FormatNo) {
        this.p189s1FormatNo = p189s1FormatNo;
    }

    public String getP189s2PhoneDat() {
        return p189s2PhoneDat;
    }

    public void setP189s2PhoneDat(String p189s2PhoneDat) {
        this.p189s2PhoneDat = p189s2PhoneDat;
    }

    public String getP190PartIdCd() {
        return p190PartIdCd;
    }

    public void setP190PartIdCd(String p190PartIdCd) {
        this.p190PartIdCd = p190PartIdCd;
    }

    public String getP375MbrRcnInd() {
        return p375MbrRcnInd;
    }

    public void setP375MbrRcnInd(String p375MbrRcnInd) {
        this.p375MbrRcnInd = p375MbrRcnInd;
    }

    public String getP376MbrRcnInd() {
        return p376MbrRcnInd;
    }

    public void setP376MbrRcnInd(String p376MbrRcnInd) {
        this.p376MbrRcnInd = p376MbrRcnInd;
    }

    public String getD55IntdCirSys() {
        return d55IntdCirSys;
    }

    public void setD55IntdCirSys(String d55IntdCirSys) {
        this.d55IntdCirSys = d55IntdCirSys;
    }

    public String getD62AddtlData2() {
        return d62AddtlData2;
    }

    public void setD62AddtlData2(String d62AddtlData2) {
        this.d62AddtlData2 = d62AddtlData2;
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

    public String getP2ProdId() {
        return p2ProdId;
    }

    public void setP2ProdId(String p2ProdId) {
        this.p2ProdId = p2ProdId;
    }

    public Short getP52s1SecuProt() {
        return p52s1SecuProt;
    }

    public void setP52s1SecuProt(Short p52s1SecuProt) {
        this.p52s1SecuProt = p52s1SecuProt;
    }

    public Short getP52s2ChAuth() {
        return p52s2ChAuth;
    }

    public void setP52s2ChAuth(Short p52s2ChAuth) {
        this.p52s2ChAuth = p52s2ChAuth;
    }

    public Short getP52s3UcafColind() {
        return p52s3UcafColind;
    }

    public void setP52s3UcafColind(Short p52s3UcafColind) {
        this.p52s3UcafColind = p52s3UcafColind;
    }

    public short getD54s1AdtlAcctTy() {
        return d54s1AdtlAcctTy;
    }

    public void setD54s1AdtlAcctTy(short d54s1AdtlAcctTy) {
        this.d54s1AdtlAcctTy = d54s1AdtlAcctTy;
    }

    public short getD54s2AdtlAmtTyp() {
        return d54s2AdtlAmtTyp;
    }

    public void setD54s2AdtlAmtTyp(short d54s2AdtlAmtTyp) {
        this.d54s2AdtlAmtTyp = d54s2AdtlAmtTyp;
    }

    public short getD54s3AdtlCurrCd() {
        return d54s3AdtlCurrCd;
    }

    public void setD54s3AdtlCurrCd(short d54s3AdtlCurrCd) {
        this.d54s3AdtlCurrCd = d54s3AdtlCurrCd;
    }

    public Character getD54s4AdtlAmtSgn() {
        return d54s4AdtlAmtSgn;
    }

    public void setD54s4AdtlAmtSgn(Character d54s4AdtlAmtSgn) {
        this.d54s4AdtlAmtSgn = d54s4AdtlAmtSgn;
    }

    public BigDecimal getD54s5AdtlAmt() {
        return d54s5AdtlAmt;
    }

    public void setD54s5AdtlAmt(BigDecimal d54s5AdtlAmt) {
        this.d54s5AdtlAmt = d54s5AdtlAmt;
    }

    public BigDecimal getD111MccrAmt() {
        return d111MccrAmt;
    }

    public void setD111MccrAmt(BigDecimal d111MccrAmt) {
        this.d111MccrAmt = d111MccrAmt;
    }

    public Character getP177s1XborderInd() {
        return p177s1XborderInd;
    }

    public void setP177s1XborderInd(Character p177s1XborderInd) {
        this.p177s1XborderInd = p177s1XborderInd;
    }

    public Character getP177s2CurrInd() {
        return p177s2CurrInd;
    }

    public void setP177s2CurrInd(Character p177s2CurrInd) {
        this.p177s2CurrInd = p177s2CurrInd;
    }

    public String getP001s1PpasActTy() {
        return p001s1PpasActTy;
    }

    public void setP001s1PpasActTy(String p001s1PpasActTy) {
        this.p001s1PpasActTy = p001s1PpasActTy;
    }

    public String getP001s2PpasActNo() {
        return p001s2PpasActNo;
    }

    public void setP001s2PpasActNo(String p001s2PpasActNo) {
        this.p001s2PpasActNo = p001s2PpasActNo;
    }

    public short getP057TranCatInd() {
        return p057TranCatInd;
    }

    public void setP057TranCatInd(short p057TranCatInd) {
        this.p057TranCatInd = p057TranCatInd;
    }

    public String getP192PmtInit() {
        return p192PmtInit;
    }

    public void setP192PmtInit(String p192PmtInit) {
        this.p192PmtInit = p192PmtInit;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mcFirstPresSupbPK != null ? mcFirstPresSupbPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof McFirstPresSupb)) {
            return false;
        }
        McFirstPresSupb other = (McFirstPresSupb) object;
        if ((this.mcFirstPresSupbPK == null && other.mcFirstPresSupbPK != null) || (this.mcFirstPresSupbPK != null && !this.mcFirstPresSupbPK.equals(other.mcFirstPresSupbPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.cxxcow.McFirstPresSupb[ mcFirstPresSupbPK=" + mcFirstPresSupbPK + " ]";
    }

}
