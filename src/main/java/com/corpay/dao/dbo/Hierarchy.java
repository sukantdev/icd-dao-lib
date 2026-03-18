package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "HIERARCHY", catalog = "", schema = "DBO")
public class Hierarchy implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "HIER_ID")
    private String hierId;
    @Basic(optional = false)
    @Column(name = "HIER_NM")
    private String hierNm;
    @Basic(optional = false)
    @Column(name = "NBR_OF_LVLS")
    private short nbrOfLvls;
    @Basic(optional = false)
    @Column(name = "CURR_CD")
    private String currCd;
    @Basic(optional = false)
    @Column(name = "PRF_BLK_FLG")
    private Character prfBlkFlg;
    @Basic(optional = false)
    @Column(name = "ONE_TM_LMT_FLG")
    private Character oneTmLmtFlg;
    @Basic(optional = false)
    @Column(name = "ONE_TM_LMT_ACM_FLG")
    private Character oneTmLmtAcmFlg;
    @Basic(optional = false)
    @Column(name = "MULP_PRF_FLG")
    private Character mulpPrfFlg;
    @Basic(optional = false)
    @Column(name = "CHG_LMT_UNT_CD")
    private Character chgLmtUntCd;
    @Basic(optional = false)
    @Column(name = "MC_LIM_NETW")
    private Character mcLimNetw;
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
    @Column(name = "TRP_ALWNC_FLG")
    private Character trpAlwncFlg;
    @Basic(optional = false)
    @Column(name = "CSH_ADV_CD")
    private Character cshAdvCd;
    @Basic(optional = false)
    @Column(name = "CO_DRV_NM_ENTR_FLG")
    private Character coDrvNmEntrFlg;
    @Basic(optional = false)
    @Column(name = "TSK_ORD_NBR")
    private String tskOrdNbr;
    @Basic(optional = false)
    @Column(name = "PCI_MSKNG_CHAR_CD")
    private Character pciMskngCharCd;
    @Basic(optional = false)
    @Column(name = "PCI_MSKNG_FLG")
    private Character pciMskngFlg;

    public Hierarchy() {
    }

    public Hierarchy(String hierId) {
        this.hierId = hierId;
    }

    public Hierarchy(String hierId, String hierNm, short nbrOfLvls, String currCd, Character prfBlkFlg, Character oneTmLmtFlg, Character oneTmLmtAcmFlg, Character mulpPrfFlg, Character chgLmtUntCd, Character mcLimNetw, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr, Character trpAlwncFlg, Character cshAdvCd, Character coDrvNmEntrFlg, String tskOrdNbr, Character pciMskngCharCd, Character pciMskngFlg) {
        this.hierId = hierId;
        this.hierNm = hierNm;
        this.nbrOfLvls = nbrOfLvls;
        this.currCd = currCd;
        this.prfBlkFlg = prfBlkFlg;
        this.oneTmLmtFlg = oneTmLmtFlg;
        this.oneTmLmtAcmFlg = oneTmLmtAcmFlg;
        this.mulpPrfFlg = mulpPrfFlg;
        this.chgLmtUntCd = chgLmtUntCd;
        this.mcLimNetw = mcLimNetw;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
        this.trpAlwncFlg = trpAlwncFlg;
        this.cshAdvCd = cshAdvCd;
        this.coDrvNmEntrFlg = coDrvNmEntrFlg;
        this.tskOrdNbr = tskOrdNbr;
        this.pciMskngCharCd = pciMskngCharCd;
        this.pciMskngFlg = pciMskngFlg;
    }

    public String getHierId() {
        return hierId;
    }

    public void setHierId(String hierId) {
        this.hierId = hierId;
    }

    public String getHierNm() {
        return hierNm;
    }

    public void setHierNm(String hierNm) {
        this.hierNm = hierNm;
    }

    public short getNbrOfLvls() {
        return nbrOfLvls;
    }

    public void setNbrOfLvls(short nbrOfLvls) {
        this.nbrOfLvls = nbrOfLvls;
    }

    public String getCurrCd() {
        return currCd;
    }

    public void setCurrCd(String currCd) {
        this.currCd = currCd;
    }

    public Character getPrfBlkFlg() {
        return prfBlkFlg;
    }

    public void setPrfBlkFlg(Character prfBlkFlg) {
        this.prfBlkFlg = prfBlkFlg;
    }

    public Character getOneTmLmtFlg() {
        return oneTmLmtFlg;
    }

    public void setOneTmLmtFlg(Character oneTmLmtFlg) {
        this.oneTmLmtFlg = oneTmLmtFlg;
    }

    public Character getOneTmLmtAcmFlg() {
        return oneTmLmtAcmFlg;
    }

    public void setOneTmLmtAcmFlg(Character oneTmLmtAcmFlg) {
        this.oneTmLmtAcmFlg = oneTmLmtAcmFlg;
    }

    public Character getMulpPrfFlg() {
        return mulpPrfFlg;
    }

    public void setMulpPrfFlg(Character mulpPrfFlg) {
        this.mulpPrfFlg = mulpPrfFlg;
    }

    public Character getChgLmtUntCd() {
        return chgLmtUntCd;
    }

    public void setChgLmtUntCd(Character chgLmtUntCd) {
        this.chgLmtUntCd = chgLmtUntCd;
    }

    public Character getMcLimNetw() {
        return mcLimNetw;
    }

    public void setMcLimNetw(Character mcLimNetw) {
        this.mcLimNetw = mcLimNetw;
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

    public Character getTrpAlwncFlg() {
        return trpAlwncFlg;
    }

    public void setTrpAlwncFlg(Character trpAlwncFlg) {
        this.trpAlwncFlg = trpAlwncFlg;
    }

    public Character getCshAdvCd() {
        return cshAdvCd;
    }

    public void setCshAdvCd(Character cshAdvCd) {
        this.cshAdvCd = cshAdvCd;
    }

    public Character getCoDrvNmEntrFlg() {
        return coDrvNmEntrFlg;
    }

    public void setCoDrvNmEntrFlg(Character coDrvNmEntrFlg) {
        this.coDrvNmEntrFlg = coDrvNmEntrFlg;
    }

    public String getTskOrdNbr() {
        return tskOrdNbr;
    }

    public void setTskOrdNbr(String tskOrdNbr) {
        this.tskOrdNbr = tskOrdNbr;
    }

    public Character getPciMskngCharCd() {
        return pciMskngCharCd;
    }

    public void setPciMskngCharCd(Character pciMskngCharCd) {
        this.pciMskngCharCd = pciMskngCharCd;
    }

    public Character getPciMskngFlg() {
        return pciMskngFlg;
    }

    public void setPciMskngFlg(Character pciMskngFlg) {
        this.pciMskngFlg = pciMskngFlg;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (hierId != null ? hierId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof Hierarchy)) {
            return false;
        }
        Hierarchy other = (Hierarchy) object;
        if ((this.hierId == null && other.hierId != null) || (this.hierId != null && !this.hierId.equals(other.hierId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.Hierarchy[ hierId=" + hierId + " ]";
    }

}
