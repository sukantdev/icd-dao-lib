package com.corpay.dao.cxxcow;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "MC_SECOND_PR_SUPA", catalog = "", schema = "CXXCOW")
public class McSecondPrSupa implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected McSecondPrSupaPK mcSecondPrSupaPK;
    @Column(name = "D35_TRACK_2_DATA")
    private String d35Track2Data;
    @Column(name = "D45_TRACK_1_DAT")
    private String d45Track1Dat;
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
    @Column(name = "P375_MBR_RCN_IND")
    private String p375MbrRcnInd;
    @Column(name = "P376_MBR_RCN_IND")
    private String p376MbrRcnInd;
    @Column(name = "P2_PROD_ID")
    private String p2ProdId;
    @Column(name = "P52S1_SECU_PROT")
    private Short p52s1SecuProt;
    @Column(name = "P52S2_CH_AUTH")
    private Short p52s2ChAuth;
    @Column(name = "P52S3_UCAF_COLIND")
    private Short p52s3UcafColind;
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
    @Column(name = "P044S1_CVC_VAL_IND")
    private Character p044s1CvcValInd;
    @Basic(optional = false)
    @Column(name = "P044S2_QPS_CB_IND")
    private Character p044s2QpsCbInd;

    public McSecondPrSupa() {
    }

    public McSecondPrSupa(McSecondPrSupaPK mcSecondPrSupaPK) {
        this.mcSecondPrSupaPK = mcSecondPrSupaPK;
    }

    public McSecondPrSupa(McSecondPrSupaPK mcSecondPrSupaPK, Character p177s1XborderInd, Character p177s2CurrInd, String p001s1PpasActTy, String p001s2PpasActNo, short p057TranCatInd, Character p044s1CvcValInd, Character p044s2QpsCbInd) {
        this.mcSecondPrSupaPK = mcSecondPrSupaPK;
        this.p177s1XborderInd = p177s1XborderInd;
        this.p177s2CurrInd = p177s2CurrInd;
        this.p001s1PpasActTy = p001s1PpasActTy;
        this.p001s2PpasActNo = p001s2PpasActNo;
        this.p057TranCatInd = p057TranCatInd;
        this.p044s1CvcValInd = p044s1CvcValInd;
        this.p044s2QpsCbInd = p044s2QpsCbInd;
    }

    public McSecondPrSupa(short p105s1FileTy, int p105s2FileRDt, long p105s3ProcId, int p105s4FileSeqNo, int d71MsgNo) {
        this.mcSecondPrSupaPK = new McSecondPrSupaPK(p105s1FileTy, p105s2FileRDt, p105s3ProcId, p105s4FileSeqNo, d71MsgNo);
    }

    public McSecondPrSupaPK getMcSecondPrSupaPK() {
        return mcSecondPrSupaPK;
    }

    public void setMcSecondPrSupaPK(McSecondPrSupaPK mcSecondPrSupaPK) {
        this.mcSecondPrSupaPK = mcSecondPrSupaPK;
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

    public Character getP044s1CvcValInd() {
        return p044s1CvcValInd;
    }

    public void setP044s1CvcValInd(Character p044s1CvcValInd) {
        this.p044s1CvcValInd = p044s1CvcValInd;
    }

    public Character getP044s2QpsCbInd() {
        return p044s2QpsCbInd;
    }

    public void setP044s2QpsCbInd(Character p044s2QpsCbInd) {
        this.p044s2QpsCbInd = p044s2QpsCbInd;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mcSecondPrSupaPK != null ? mcSecondPrSupaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof McSecondPrSupa)) {
            return false;
        }
        McSecondPrSupa other = (McSecondPrSupa) object;
        if ((this.mcSecondPrSupaPK == null && other.mcSecondPrSupaPK != null) || (this.mcSecondPrSupaPK != null && !this.mcSecondPrSupaPK.equals(other.mcSecondPrSupaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.cxxcow.McSecondPrSupa[ mcSecondPrSupaPK=" + mcSecondPrSupaPK + " ]";
    }

}
