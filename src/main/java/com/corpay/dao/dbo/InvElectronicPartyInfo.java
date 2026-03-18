package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "INV_ELECTRONIC_PARTY_INFO", catalog = "", schema = "DBO")
public class InvElectronicPartyInfo implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected InvElectronicPartyInfoPK invElectronicPartyInfoPK;
    @Basic(optional = false)
    @Column(name = "PTY_ID")
    private String ptyId;
    @Basic(optional = false)
    @Column(name = "PTY_NM_1")
    private String ptyNm1;
    @Basic(optional = false)
    @Column(name = "PTY_NM_2")
    private String ptyNm2;
    @Basic(optional = false)
    @Column(name = "PTY_NM_3")
    private String ptyNm3;
    @Basic(optional = false)
    @Column(name = "PTY_ADDR1")
    private String ptyAddr1;
    @Basic(optional = false)
    @Column(name = "PTY_ADDR2")
    private String ptyAddr2;
    @Basic(optional = false)
    @Column(name = "PTY_ADDR3")
    private String ptyAddr3;
    @Basic(optional = false)
    @Column(name = "PTY_ADDR4")
    private String ptyAddr4;
    @Basic(optional = false)
    @Column(name = "PTY_ADDR5")
    private String ptyAddr5;
    @Basic(optional = false)
    @Column(name = "PTY_ADDR6")
    private String ptyAddr6;
    @Basic(optional = false)
    @Column(name = "PTY_CTY")
    private String ptyCty;
    @Basic(optional = false)
    @Column(name = "PTY_ST")
    private String ptySt;
    @Basic(optional = false)
    @Column(name = "PTY_CRTY")
    private String ptyCrty;
    @Basic(optional = false)
    @Column(name = "PTY_ZIP")
    private String ptyZip;
    @Basic(optional = false)
    @Column(name = "PARTY_DESC_1")
    private Character partyDesc1;
    @Basic(optional = false)
    @Column(name = "PARTY_CNTCT_1")
    private String partyCntct1;
    @Basic(optional = false)
    @Column(name = "PARTY_DESC_2")
    private Character partyDesc2;
    @Basic(optional = false)
    @Column(name = "PARTY_CNTCT_2")
    private String partyCntct2;
    @Basic(optional = false)
    @Column(name = "PARTY_DESC_3")
    private Character partyDesc3;
    @Basic(optional = false)
    @Column(name = "PARTY_CNTCT_3")
    private String partyCntct3;
    @Basic(optional = false)
    @Column(name = "PARTY_DESC_4")
    private Character partyDesc4;
    @Basic(optional = false)
    @Column(name = "PARTY_CNTCT_4")
    private String partyCntct4;
    @Basic(optional = false)
    @Column(name = "PARTY_DESC_5")
    private Character partyDesc5;
    @Basic(optional = false)
    @Column(name = "PARTY_CNTCT_5")
    private String partyCntct5;
    @Basic(optional = false)
    @Column(name = "PTY_NAT_OF_FL")
    private Character ptyNatOfFl;
    @Basic(optional = false)
    @Column(name = "PTY_SUP_DATA_DESC_1_1")
    private String ptySupDataDesc11;
    @Basic(optional = false)
    @Column(name = "PTY_SUP_DATA_1_1")
    private String ptySupData11;
    @Basic(optional = false)
    @Column(name = "PTY_SUP_DATA_CD_1_1")
    private String ptySupDataCd11;
    @Basic(optional = false)
    @Column(name = "PTY_SUP_DATA_DESC_1_2")
    private String ptySupDataDesc12;
    @Basic(optional = false)
    @Column(name = "PTY_SUP_DATA_1_2")
    private String ptySupData12;
    @Basic(optional = false)
    @Column(name = "PTY_SUP_DATA_CD_1_2")
    private String ptySupDataCd12;
    @Basic(optional = false)
    @Column(name = "PTY_SUP_DATA_DESC_1_3")
    private String ptySupDataDesc13;
    @Basic(optional = false)
    @Column(name = "PTY_SUP_DATA_1_3")
    private String ptySupData13;
    @Basic(optional = false)
    @Column(name = "PTY_SUP_DATA_CD_1_3")
    private String ptySupDataCd13;
    @Basic(optional = false)
    @Column(name = "PTY_SUP_DATA_DESC_1_4")
    private String ptySupDataDesc14;
    @Basic(optional = false)
    @Column(name = "PTY_SUP_DATA_1_4")
    private String ptySupData14;
    @Basic(optional = false)
    @Column(name = "PTY_SUP_DATA_CD_1_4")
    private String ptySupDataCd14;
    @Basic(optional = false)
    @Column(name = "PTY_SUP_DATA_DESC_1_5")
    private String ptySupDataDesc15;
    @Basic(optional = false)
    @Column(name = "PTY_SUP_DATA_1_5")
    private String ptySupData15;
    @Basic(optional = false)
    @Column(name = "PTY_SUP_DATA_CD_1_5")
    private String ptySupDataCd15;
    @Basic(optional = false)
    @Column(name = "PTY_SUP_DATA_DESC_1_6")
    private String ptySupDataDesc16;
    @Basic(optional = false)
    @Column(name = "PTY_SUP_DATA_1_6")
    private String ptySupData16;
    @Basic(optional = false)
    @Column(name = "PTY_SUP_DATA_CD_1_6")
    private String ptySupDataCd16;
    @Basic(optional = false)
    @Column(name = "PTY_SUP_DATA_DESC_1_7")
    private String ptySupDataDesc17;
    @Basic(optional = false)
    @Column(name = "PTY_SUP_DATA_1_7")
    private String ptySupData17;
    @Basic(optional = false)
    @Column(name = "PTY_SUP_DATA_CD_1_7")
    private String ptySupDataCd17;
    @Basic(optional = false)
    @Column(name = "PTY_SUP_DATA_DESC_1_8")
    private String ptySupDataDesc18;
    @Basic(optional = false)
    @Column(name = "PTY_SUP_DATA_1_8")
    private String ptySupData18;
    @Basic(optional = false)
    @Column(name = "PTY_SUP_DATA_CD_1_8")
    private String ptySupDataCd18;
    @Basic(optional = false)
    @Column(name = "PTY_SUP_DATA_DESC_2_1")
    private String ptySupDataDesc21;
    @Basic(optional = false)
    @Column(name = "PTY_SUP_DATA_2_1")
    private String ptySupData21;
    @Basic(optional = false)
    @Column(name = "PTY_SUP_DATA_CD_2_1")
    private String ptySupDataCd21;
    @Basic(optional = false)
    @Column(name = "PTY_SUP_DATA_DESC_2_2")
    private String ptySupDataDesc22;
    @Basic(optional = false)
    @Column(name = "PTY_SUP_DATA_2_2")
    private String ptySupData22;
    @Basic(optional = false)
    @Column(name = "PTY_SUP_DATA_CD_2_2")
    private String ptySupDataCd22;
    @Basic(optional = false)
    @Column(name = "PTY_SUP_DATA_DESC_2_3")
    private String ptySupDataDesc23;
    @Basic(optional = false)
    @Column(name = "PTY_SUP_DATA_2_3")
    private String ptySupData23;
    @Basic(optional = false)
    @Column(name = "PTY_SUP_DATA_CD_2_3")
    private String ptySupDataCd23;
    @Basic(optional = false)
    @Column(name = "PTY_SUP_DATA_DESC_2_4")
    private String ptySupDataDesc24;
    @Basic(optional = false)
    @Column(name = "PTY_SUP_DATA_2_4")
    private String ptySupData24;
    @Basic(optional = false)
    @Column(name = "PTY_SUP_DATA_CD_2_4")
    private String ptySupDataCd24;
    @Basic(optional = false)
    @Column(name = "PTY_SUP_DATA_DESC_2_5")
    private String ptySupDataDesc25;
    @Basic(optional = false)
    @Column(name = "PTY_SUP_DATA_2_5")
    private String ptySupData25;
    @Basic(optional = false)
    @Column(name = "PTY_SUP_DATA_CD_2_5")
    private String ptySupDataCd25;
    @Basic(optional = false)
    @Column(name = "PTY_SUP_DATA_DESC_2_6")
    private String ptySupDataDesc26;
    @Basic(optional = false)
    @Column(name = "PTY_SUP_DATA_2_6")
    private String ptySupData26;
    @Basic(optional = false)
    @Column(name = "PTY_SUP_DATA_CD_2_6")
    private String ptySupDataCd26;
    @Basic(optional = false)
    @Column(name = "PTY_SUP_DATA_DESC_2_7")
    private String ptySupDataDesc27;
    @Basic(optional = false)
    @Column(name = "PTY_SUP_DATA_2_7")
    private String ptySupData27;
    @Basic(optional = false)
    @Column(name = "PTY_SUP_DATA_CD_2_7")
    private String ptySupDataCd27;
    @Basic(optional = false)
    @Column(name = "PTY_SUP_DATA_DESC_2_8")
    private String ptySupDataDesc28;
    @Basic(optional = false)
    @Column(name = "PTY_SUP_DATA_2_8")
    private String ptySupData28;
    @Basic(optional = false)
    @Column(name = "PTY_SUP_DATA_CD_2_8")
    private String ptySupDataCd28;
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

    public InvElectronicPartyInfo() {
    }

    public InvElectronicPartyInfo(InvElectronicPartyInfoPK invElectronicPartyInfoPK) {
        this.invElectronicPartyInfoPK = invElectronicPartyInfoPK;
    }

    public InvElectronicPartyInfo(InvElectronicPartyInfoPK invElectronicPartyInfoPK, String ptyId, String ptyNm1, String ptyNm2, String ptyNm3, String ptyAddr1, String ptyAddr2, String ptyAddr3, String ptyAddr4, String ptyAddr5, String ptyAddr6, String ptyCty, String ptySt, String ptyCrty, String ptyZip, Character partyDesc1, String partyCntct1, Character partyDesc2, String partyCntct2, Character partyDesc3, String partyCntct3, Character partyDesc4, String partyCntct4, Character partyDesc5, String partyCntct5, Character ptyNatOfFl, String ptySupDataDesc11, String ptySupData11, String ptySupDataCd11, String ptySupDataDesc12, String ptySupData12, String ptySupDataCd12, String ptySupDataDesc13, String ptySupData13, String ptySupDataCd13, String ptySupDataDesc14, String ptySupData14, String ptySupDataCd14, String ptySupDataDesc15, String ptySupData15, String ptySupDataCd15, String ptySupDataDesc16, String ptySupData16, String ptySupDataCd16, String ptySupDataDesc17, String ptySupData17, String ptySupDataCd17, String ptySupDataDesc18, String ptySupData18, String ptySupDataCd18, String ptySupDataDesc21, String ptySupData21, String ptySupDataCd21, String ptySupDataDesc22, String ptySupData22, String ptySupDataCd22, String ptySupDataDesc23, String ptySupData23, String ptySupDataCd23, String ptySupDataDesc24, String ptySupData24, String ptySupDataCd24, String ptySupDataDesc25, String ptySupData25, String ptySupDataCd25, String ptySupDataDesc26, String ptySupData26, String ptySupDataCd26, String ptySupDataDesc27, String ptySupData27, String ptySupDataCd27, String ptySupDataDesc28, String ptySupData28, String ptySupDataCd28, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.invElectronicPartyInfoPK = invElectronicPartyInfoPK;
        this.ptyId = ptyId;
        this.ptyNm1 = ptyNm1;
        this.ptyNm2 = ptyNm2;
        this.ptyNm3 = ptyNm3;
        this.ptyAddr1 = ptyAddr1;
        this.ptyAddr2 = ptyAddr2;
        this.ptyAddr3 = ptyAddr3;
        this.ptyAddr4 = ptyAddr4;
        this.ptyAddr5 = ptyAddr5;
        this.ptyAddr6 = ptyAddr6;
        this.ptyCty = ptyCty;
        this.ptySt = ptySt;
        this.ptyCrty = ptyCrty;
        this.ptyZip = ptyZip;
        this.partyDesc1 = partyDesc1;
        this.partyCntct1 = partyCntct1;
        this.partyDesc2 = partyDesc2;
        this.partyCntct2 = partyCntct2;
        this.partyDesc3 = partyDesc3;
        this.partyCntct3 = partyCntct3;
        this.partyDesc4 = partyDesc4;
        this.partyCntct4 = partyCntct4;
        this.partyDesc5 = partyDesc5;
        this.partyCntct5 = partyCntct5;
        this.ptyNatOfFl = ptyNatOfFl;
        this.ptySupDataDesc11 = ptySupDataDesc11;
        this.ptySupData11 = ptySupData11;
        this.ptySupDataCd11 = ptySupDataCd11;
        this.ptySupDataDesc12 = ptySupDataDesc12;
        this.ptySupData12 = ptySupData12;
        this.ptySupDataCd12 = ptySupDataCd12;
        this.ptySupDataDesc13 = ptySupDataDesc13;
        this.ptySupData13 = ptySupData13;
        this.ptySupDataCd13 = ptySupDataCd13;
        this.ptySupDataDesc14 = ptySupDataDesc14;
        this.ptySupData14 = ptySupData14;
        this.ptySupDataCd14 = ptySupDataCd14;
        this.ptySupDataDesc15 = ptySupDataDesc15;
        this.ptySupData15 = ptySupData15;
        this.ptySupDataCd15 = ptySupDataCd15;
        this.ptySupDataDesc16 = ptySupDataDesc16;
        this.ptySupData16 = ptySupData16;
        this.ptySupDataCd16 = ptySupDataCd16;
        this.ptySupDataDesc17 = ptySupDataDesc17;
        this.ptySupData17 = ptySupData17;
        this.ptySupDataCd17 = ptySupDataCd17;
        this.ptySupDataDesc18 = ptySupDataDesc18;
        this.ptySupData18 = ptySupData18;
        this.ptySupDataCd18 = ptySupDataCd18;
        this.ptySupDataDesc21 = ptySupDataDesc21;
        this.ptySupData21 = ptySupData21;
        this.ptySupDataCd21 = ptySupDataCd21;
        this.ptySupDataDesc22 = ptySupDataDesc22;
        this.ptySupData22 = ptySupData22;
        this.ptySupDataCd22 = ptySupDataCd22;
        this.ptySupDataDesc23 = ptySupDataDesc23;
        this.ptySupData23 = ptySupData23;
        this.ptySupDataCd23 = ptySupDataCd23;
        this.ptySupDataDesc24 = ptySupDataDesc24;
        this.ptySupData24 = ptySupData24;
        this.ptySupDataCd24 = ptySupDataCd24;
        this.ptySupDataDesc25 = ptySupDataDesc25;
        this.ptySupData25 = ptySupData25;
        this.ptySupDataCd25 = ptySupDataCd25;
        this.ptySupDataDesc26 = ptySupDataDesc26;
        this.ptySupData26 = ptySupData26;
        this.ptySupDataCd26 = ptySupDataCd26;
        this.ptySupDataDesc27 = ptySupDataDesc27;
        this.ptySupData27 = ptySupData27;
        this.ptySupDataCd27 = ptySupDataCd27;
        this.ptySupDataDesc28 = ptySupDataDesc28;
        this.ptySupData28 = ptySupData28;
        this.ptySupDataCd28 = ptySupDataCd28;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public InvElectronicPartyInfo(Date pstdDt, int trnsId, short seqNo) {
        this.invElectronicPartyInfoPK = new InvElectronicPartyInfoPK(pstdDt, trnsId, seqNo);
    }

    public InvElectronicPartyInfoPK getInvElectronicPartyInfoPK() {
        return invElectronicPartyInfoPK;
    }

    public void setInvElectronicPartyInfoPK(InvElectronicPartyInfoPK invElectronicPartyInfoPK) {
        this.invElectronicPartyInfoPK = invElectronicPartyInfoPK;
    }

    public String getPtyId() {
        return ptyId;
    }

    public void setPtyId(String ptyId) {
        this.ptyId = ptyId;
    }

    public String getPtyNm1() {
        return ptyNm1;
    }

    public void setPtyNm1(String ptyNm1) {
        this.ptyNm1 = ptyNm1;
    }

    public String getPtyNm2() {
        return ptyNm2;
    }

    public void setPtyNm2(String ptyNm2) {
        this.ptyNm2 = ptyNm2;
    }

    public String getPtyNm3() {
        return ptyNm3;
    }

    public void setPtyNm3(String ptyNm3) {
        this.ptyNm3 = ptyNm3;
    }

    public String getPtyAddr1() {
        return ptyAddr1;
    }

    public void setPtyAddr1(String ptyAddr1) {
        this.ptyAddr1 = ptyAddr1;
    }

    public String getPtyAddr2() {
        return ptyAddr2;
    }

    public void setPtyAddr2(String ptyAddr2) {
        this.ptyAddr2 = ptyAddr2;
    }

    public String getPtyAddr3() {
        return ptyAddr3;
    }

    public void setPtyAddr3(String ptyAddr3) {
        this.ptyAddr3 = ptyAddr3;
    }

    public String getPtyAddr4() {
        return ptyAddr4;
    }

    public void setPtyAddr4(String ptyAddr4) {
        this.ptyAddr4 = ptyAddr4;
    }

    public String getPtyAddr5() {
        return ptyAddr5;
    }

    public void setPtyAddr5(String ptyAddr5) {
        this.ptyAddr5 = ptyAddr5;
    }

    public String getPtyAddr6() {
        return ptyAddr6;
    }

    public void setPtyAddr6(String ptyAddr6) {
        this.ptyAddr6 = ptyAddr6;
    }

    public String getPtyCty() {
        return ptyCty;
    }

    public void setPtyCty(String ptyCty) {
        this.ptyCty = ptyCty;
    }

    public String getPtySt() {
        return ptySt;
    }

    public void setPtySt(String ptySt) {
        this.ptySt = ptySt;
    }

    public String getPtyCrty() {
        return ptyCrty;
    }

    public void setPtyCrty(String ptyCrty) {
        this.ptyCrty = ptyCrty;
    }

    public String getPtyZip() {
        return ptyZip;
    }

    public void setPtyZip(String ptyZip) {
        this.ptyZip = ptyZip;
    }

    public Character getPartyDesc1() {
        return partyDesc1;
    }

    public void setPartyDesc1(Character partyDesc1) {
        this.partyDesc1 = partyDesc1;
    }

    public String getPartyCntct1() {
        return partyCntct1;
    }

    public void setPartyCntct1(String partyCntct1) {
        this.partyCntct1 = partyCntct1;
    }

    public Character getPartyDesc2() {
        return partyDesc2;
    }

    public void setPartyDesc2(Character partyDesc2) {
        this.partyDesc2 = partyDesc2;
    }

    public String getPartyCntct2() {
        return partyCntct2;
    }

    public void setPartyCntct2(String partyCntct2) {
        this.partyCntct2 = partyCntct2;
    }

    public Character getPartyDesc3() {
        return partyDesc3;
    }

    public void setPartyDesc3(Character partyDesc3) {
        this.partyDesc3 = partyDesc3;
    }

    public String getPartyCntct3() {
        return partyCntct3;
    }

    public void setPartyCntct3(String partyCntct3) {
        this.partyCntct3 = partyCntct3;
    }

    public Character getPartyDesc4() {
        return partyDesc4;
    }

    public void setPartyDesc4(Character partyDesc4) {
        this.partyDesc4 = partyDesc4;
    }

    public String getPartyCntct4() {
        return partyCntct4;
    }

    public void setPartyCntct4(String partyCntct4) {
        this.partyCntct4 = partyCntct4;
    }

    public Character getPartyDesc5() {
        return partyDesc5;
    }

    public void setPartyDesc5(Character partyDesc5) {
        this.partyDesc5 = partyDesc5;
    }

    public String getPartyCntct5() {
        return partyCntct5;
    }

    public void setPartyCntct5(String partyCntct5) {
        this.partyCntct5 = partyCntct5;
    }

    public Character getPtyNatOfFl() {
        return ptyNatOfFl;
    }

    public void setPtyNatOfFl(Character ptyNatOfFl) {
        this.ptyNatOfFl = ptyNatOfFl;
    }

    public String getPtySupDataDesc11() {
        return ptySupDataDesc11;
    }

    public void setPtySupDataDesc11(String ptySupDataDesc11) {
        this.ptySupDataDesc11 = ptySupDataDesc11;
    }

    public String getPtySupData11() {
        return ptySupData11;
    }

    public void setPtySupData11(String ptySupData11) {
        this.ptySupData11 = ptySupData11;
    }

    public String getPtySupDataCd11() {
        return ptySupDataCd11;
    }

    public void setPtySupDataCd11(String ptySupDataCd11) {
        this.ptySupDataCd11 = ptySupDataCd11;
    }

    public String getPtySupDataDesc12() {
        return ptySupDataDesc12;
    }

    public void setPtySupDataDesc12(String ptySupDataDesc12) {
        this.ptySupDataDesc12 = ptySupDataDesc12;
    }

    public String getPtySupData12() {
        return ptySupData12;
    }

    public void setPtySupData12(String ptySupData12) {
        this.ptySupData12 = ptySupData12;
    }

    public String getPtySupDataCd12() {
        return ptySupDataCd12;
    }

    public void setPtySupDataCd12(String ptySupDataCd12) {
        this.ptySupDataCd12 = ptySupDataCd12;
    }

    public String getPtySupDataDesc13() {
        return ptySupDataDesc13;
    }

    public void setPtySupDataDesc13(String ptySupDataDesc13) {
        this.ptySupDataDesc13 = ptySupDataDesc13;
    }

    public String getPtySupData13() {
        return ptySupData13;
    }

    public void setPtySupData13(String ptySupData13) {
        this.ptySupData13 = ptySupData13;
    }

    public String getPtySupDataCd13() {
        return ptySupDataCd13;
    }

    public void setPtySupDataCd13(String ptySupDataCd13) {
        this.ptySupDataCd13 = ptySupDataCd13;
    }

    public String getPtySupDataDesc14() {
        return ptySupDataDesc14;
    }

    public void setPtySupDataDesc14(String ptySupDataDesc14) {
        this.ptySupDataDesc14 = ptySupDataDesc14;
    }

    public String getPtySupData14() {
        return ptySupData14;
    }

    public void setPtySupData14(String ptySupData14) {
        this.ptySupData14 = ptySupData14;
    }

    public String getPtySupDataCd14() {
        return ptySupDataCd14;
    }

    public void setPtySupDataCd14(String ptySupDataCd14) {
        this.ptySupDataCd14 = ptySupDataCd14;
    }

    public String getPtySupDataDesc15() {
        return ptySupDataDesc15;
    }

    public void setPtySupDataDesc15(String ptySupDataDesc15) {
        this.ptySupDataDesc15 = ptySupDataDesc15;
    }

    public String getPtySupData15() {
        return ptySupData15;
    }

    public void setPtySupData15(String ptySupData15) {
        this.ptySupData15 = ptySupData15;
    }

    public String getPtySupDataCd15() {
        return ptySupDataCd15;
    }

    public void setPtySupDataCd15(String ptySupDataCd15) {
        this.ptySupDataCd15 = ptySupDataCd15;
    }

    public String getPtySupDataDesc16() {
        return ptySupDataDesc16;
    }

    public void setPtySupDataDesc16(String ptySupDataDesc16) {
        this.ptySupDataDesc16 = ptySupDataDesc16;
    }

    public String getPtySupData16() {
        return ptySupData16;
    }

    public void setPtySupData16(String ptySupData16) {
        this.ptySupData16 = ptySupData16;
    }

    public String getPtySupDataCd16() {
        return ptySupDataCd16;
    }

    public void setPtySupDataCd16(String ptySupDataCd16) {
        this.ptySupDataCd16 = ptySupDataCd16;
    }

    public String getPtySupDataDesc17() {
        return ptySupDataDesc17;
    }

    public void setPtySupDataDesc17(String ptySupDataDesc17) {
        this.ptySupDataDesc17 = ptySupDataDesc17;
    }

    public String getPtySupData17() {
        return ptySupData17;
    }

    public void setPtySupData17(String ptySupData17) {
        this.ptySupData17 = ptySupData17;
    }

    public String getPtySupDataCd17() {
        return ptySupDataCd17;
    }

    public void setPtySupDataCd17(String ptySupDataCd17) {
        this.ptySupDataCd17 = ptySupDataCd17;
    }

    public String getPtySupDataDesc18() {
        return ptySupDataDesc18;
    }

    public void setPtySupDataDesc18(String ptySupDataDesc18) {
        this.ptySupDataDesc18 = ptySupDataDesc18;
    }

    public String getPtySupData18() {
        return ptySupData18;
    }

    public void setPtySupData18(String ptySupData18) {
        this.ptySupData18 = ptySupData18;
    }

    public String getPtySupDataCd18() {
        return ptySupDataCd18;
    }

    public void setPtySupDataCd18(String ptySupDataCd18) {
        this.ptySupDataCd18 = ptySupDataCd18;
    }

    public String getPtySupDataDesc21() {
        return ptySupDataDesc21;
    }

    public void setPtySupDataDesc21(String ptySupDataDesc21) {
        this.ptySupDataDesc21 = ptySupDataDesc21;
    }

    public String getPtySupData21() {
        return ptySupData21;
    }

    public void setPtySupData21(String ptySupData21) {
        this.ptySupData21 = ptySupData21;
    }

    public String getPtySupDataCd21() {
        return ptySupDataCd21;
    }

    public void setPtySupDataCd21(String ptySupDataCd21) {
        this.ptySupDataCd21 = ptySupDataCd21;
    }

    public String getPtySupDataDesc22() {
        return ptySupDataDesc22;
    }

    public void setPtySupDataDesc22(String ptySupDataDesc22) {
        this.ptySupDataDesc22 = ptySupDataDesc22;
    }

    public String getPtySupData22() {
        return ptySupData22;
    }

    public void setPtySupData22(String ptySupData22) {
        this.ptySupData22 = ptySupData22;
    }

    public String getPtySupDataCd22() {
        return ptySupDataCd22;
    }

    public void setPtySupDataCd22(String ptySupDataCd22) {
        this.ptySupDataCd22 = ptySupDataCd22;
    }

    public String getPtySupDataDesc23() {
        return ptySupDataDesc23;
    }

    public void setPtySupDataDesc23(String ptySupDataDesc23) {
        this.ptySupDataDesc23 = ptySupDataDesc23;
    }

    public String getPtySupData23() {
        return ptySupData23;
    }

    public void setPtySupData23(String ptySupData23) {
        this.ptySupData23 = ptySupData23;
    }

    public String getPtySupDataCd23() {
        return ptySupDataCd23;
    }

    public void setPtySupDataCd23(String ptySupDataCd23) {
        this.ptySupDataCd23 = ptySupDataCd23;
    }

    public String getPtySupDataDesc24() {
        return ptySupDataDesc24;
    }

    public void setPtySupDataDesc24(String ptySupDataDesc24) {
        this.ptySupDataDesc24 = ptySupDataDesc24;
    }

    public String getPtySupData24() {
        return ptySupData24;
    }

    public void setPtySupData24(String ptySupData24) {
        this.ptySupData24 = ptySupData24;
    }

    public String getPtySupDataCd24() {
        return ptySupDataCd24;
    }

    public void setPtySupDataCd24(String ptySupDataCd24) {
        this.ptySupDataCd24 = ptySupDataCd24;
    }

    public String getPtySupDataDesc25() {
        return ptySupDataDesc25;
    }

    public void setPtySupDataDesc25(String ptySupDataDesc25) {
        this.ptySupDataDesc25 = ptySupDataDesc25;
    }

    public String getPtySupData25() {
        return ptySupData25;
    }

    public void setPtySupData25(String ptySupData25) {
        this.ptySupData25 = ptySupData25;
    }

    public String getPtySupDataCd25() {
        return ptySupDataCd25;
    }

    public void setPtySupDataCd25(String ptySupDataCd25) {
        this.ptySupDataCd25 = ptySupDataCd25;
    }

    public String getPtySupDataDesc26() {
        return ptySupDataDesc26;
    }

    public void setPtySupDataDesc26(String ptySupDataDesc26) {
        this.ptySupDataDesc26 = ptySupDataDesc26;
    }

    public String getPtySupData26() {
        return ptySupData26;
    }

    public void setPtySupData26(String ptySupData26) {
        this.ptySupData26 = ptySupData26;
    }

    public String getPtySupDataCd26() {
        return ptySupDataCd26;
    }

    public void setPtySupDataCd26(String ptySupDataCd26) {
        this.ptySupDataCd26 = ptySupDataCd26;
    }

    public String getPtySupDataDesc27() {
        return ptySupDataDesc27;
    }

    public void setPtySupDataDesc27(String ptySupDataDesc27) {
        this.ptySupDataDesc27 = ptySupDataDesc27;
    }

    public String getPtySupData27() {
        return ptySupData27;
    }

    public void setPtySupData27(String ptySupData27) {
        this.ptySupData27 = ptySupData27;
    }

    public String getPtySupDataCd27() {
        return ptySupDataCd27;
    }

    public void setPtySupDataCd27(String ptySupDataCd27) {
        this.ptySupDataCd27 = ptySupDataCd27;
    }

    public String getPtySupDataDesc28() {
        return ptySupDataDesc28;
    }

    public void setPtySupDataDesc28(String ptySupDataDesc28) {
        this.ptySupDataDesc28 = ptySupDataDesc28;
    }

    public String getPtySupData28() {
        return ptySupData28;
    }

    public void setPtySupData28(String ptySupData28) {
        this.ptySupData28 = ptySupData28;
    }

    public String getPtySupDataCd28() {
        return ptySupDataCd28;
    }

    public void setPtySupDataCd28(String ptySupDataCd28) {
        this.ptySupDataCd28 = ptySupDataCd28;
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
        hash += (invElectronicPartyInfoPK != null ? invElectronicPartyInfoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof InvElectronicPartyInfo)) {
            return false;
        }
        InvElectronicPartyInfo other = (InvElectronicPartyInfo) object;
        if ((this.invElectronicPartyInfoPK == null && other.invElectronicPartyInfoPK != null) || (this.invElectronicPartyInfoPK != null && !this.invElectronicPartyInfoPK.equals(other.invElectronicPartyInfoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.InvElectronicPartyInfo[ invElectronicPartyInfoPK=" + invElectronicPartyInfoPK + " ]";
    }

}
