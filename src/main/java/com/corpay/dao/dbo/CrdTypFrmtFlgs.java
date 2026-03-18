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
@Table(name = "CRD_TYP_FRMT_FLGS", catalog = "", schema = "DBO")
public class CrdTypFrmtFlgs implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CrdTypFrmtFlgsPK crdTypFrmtFlgsPK;
    @Basic(optional = false)
    @Column(name = "CRD_FLGS")
    private String crdFlgs;
    @Basic(optional = false)
    @Column(name = "CRD_STAT")
    private Character crdStat;
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
    @Column(name = "PROPRTY_CRD_FLG")
    private Character proprtyCrdFlg;
    @Basic(optional = false)
    @Column(name = "MC_FLG")
    private Character mcFlg;
    @Basic(optional = false)
    @Column(name = "VRTL_CRD_FLG")
    private Character vrtlCrdFlg;
    @Basic(optional = false)
    @Column(name = "BP_PL_FLG")
    private Character bpPlFlg;
    @Basic(optional = false)
    @Column(name = "BP_INTRM_FLG")
    private Character bpIntrmFlg;
    @Basic(optional = false)
    @Column(name = "SPRVAL_CRD_FLG")
    private Character sprvalCrdFlg;
    @Basic(optional = false)
    @Column(name = "PNCH_FLG")
    private Character pnchFlg;
    @Basic(optional = false)
    @Column(name = "RNWBL_CRD_FLG")
    private Character rnwblCrdFlg;
    @Basic(optional = false)
    @Column(name = "ATM_ALW_FLG")
    private Character atmAlwFlg;
    @Basic(optional = false)
    @Column(name = "NO_CRD_TYP_CHG_FLG")
    private Character noCrdTypChgFlg;
    @Basic(optional = false)
    @Column(name = "NO_CRD_FMT_CHG_FLG")
    private Character noCrdFmtChgFlg;
    @Basic(optional = false)
    @Column(name = "CO_DRV_NM_ENTR_FLG")
    private Character coDrvNmEntrFlg;
    @Basic(optional = false)
    @Column(name = "INCL_IN_WEB_CL_FLG")
    private Character inclInWebClFlg;
    @Basic(optional = false)
    @Column(name = "CRD_CNNT_MOVE_FLG")
    private Character crdCnntMoveFlg;
    @Basic(optional = false)
    @Column(name = "PNSK_CRD_FLG")
    private Character pnskCrdFlg;
    @Basic(optional = false)
    @Column(name = "MC_TYP_1_FLG")
    private Character mcTyp1Flg;
    @Basic(optional = false)
    @Column(name = "PGM_TYP_FLG")
    private Character pgmTypFlg;
    @Basic(optional = false)
    @Column(name = "DSPLY_BIN_FLG")
    private Character dsplyBinFlg;
    @Basic(optional = false)
    @Column(name = "CRT_CRD_TKN_FLG")
    private Character crtCrdTknFlg;
    @Basic(optional = false)
    @Column(name = "CRT_CRD_HASH_FLG")
    private Character crtCrdHashFlg;
    @Basic(optional = false)
    @Column(name = "ALW_US_PROPRTY_FLG")
    private Character alwUsProprtyFlg;
    @Basic(optional = false)
    @Column(name = "CREDIT_TO_CRD_FLG")
    private Character creditToCrdFlg;
    @Basic(optional = false)
    @Column(name = "EXP_DT_ON_CRD_FLG")
    private Character expDtOnCrdFlg;
    @Basic(optional = false)
    @Column(name = "CRD_SRVC_CD")
    private String crdSrvcCd;
    @Basic(optional = false)
    @Column(name = "MC_ONROAD_FLG")
    private Character mcOnroadFlg;
    @Basic(optional = false)
    @Column(name = "VIRTUAL_COMCHEK_FLG")
    private Character virtualComchekFlg;
    @Basic(optional = false)
    @Column(name = "FN_2IN1_FLG")
    private Character fn2in1Flg;
    @Basic(optional = false)
    @Column(name = "FN_CUST_PROFILE_ID")
    private long fnCustProfileId;
    @Basic(optional = false)
    @Column(name = "CT_VIP_FLG")
    private Character ctVipFlg;
    @Basic(optional = false)
    @Column(name = "DEBIT_FLG")
    private Character debitFlg;

    public CrdTypFrmtFlgs() {
    }

    public CrdTypFrmtFlgs(CrdTypFrmtFlgsPK crdTypFrmtFlgsPK) {
        this.crdTypFrmtFlgsPK = crdTypFrmtFlgsPK;
    }

    public CrdTypFrmtFlgs(CrdTypFrmtFlgsPK crdTypFrmtFlgsPK, String crdFlgs, Character crdStat, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr, Character proprtyCrdFlg, Character mcFlg, Character vrtlCrdFlg, Character bpPlFlg, Character bpIntrmFlg, Character sprvalCrdFlg, Character pnchFlg, Character rnwblCrdFlg, Character atmAlwFlg, Character noCrdTypChgFlg, Character noCrdFmtChgFlg, Character coDrvNmEntrFlg, Character inclInWebClFlg, Character crdCnntMoveFlg, Character pnskCrdFlg, Character mcTyp1Flg, Character pgmTypFlg, Character dsplyBinFlg, Character crtCrdTknFlg, Character crtCrdHashFlg, Character alwUsProprtyFlg, Character creditToCrdFlg, Character expDtOnCrdFlg, String crdSrvcCd, Character mcOnroadFlg, Character virtualComchekFlg, Character fn2in1Flg, long fnCustProfileId, Character ctVipFlg, Character debitFlg) {
        this.crdTypFrmtFlgsPK = crdTypFrmtFlgsPK;
        this.crdFlgs = crdFlgs;
        this.crdStat = crdStat;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
        this.proprtyCrdFlg = proprtyCrdFlg;
        this.mcFlg = mcFlg;
        this.vrtlCrdFlg = vrtlCrdFlg;
        this.bpPlFlg = bpPlFlg;
        this.bpIntrmFlg = bpIntrmFlg;
        this.sprvalCrdFlg = sprvalCrdFlg;
        this.pnchFlg = pnchFlg;
        this.rnwblCrdFlg = rnwblCrdFlg;
        this.atmAlwFlg = atmAlwFlg;
        this.noCrdTypChgFlg = noCrdTypChgFlg;
        this.noCrdFmtChgFlg = noCrdFmtChgFlg;
        this.coDrvNmEntrFlg = coDrvNmEntrFlg;
        this.inclInWebClFlg = inclInWebClFlg;
        this.crdCnntMoveFlg = crdCnntMoveFlg;
        this.pnskCrdFlg = pnskCrdFlg;
        this.mcTyp1Flg = mcTyp1Flg;
        this.pgmTypFlg = pgmTypFlg;
        this.dsplyBinFlg = dsplyBinFlg;
        this.crtCrdTknFlg = crtCrdTknFlg;
        this.crtCrdHashFlg = crtCrdHashFlg;
        this.alwUsProprtyFlg = alwUsProprtyFlg;
        this.creditToCrdFlg = creditToCrdFlg;
        this.expDtOnCrdFlg = expDtOnCrdFlg;
        this.crdSrvcCd = crdSrvcCd;
        this.mcOnroadFlg = mcOnroadFlg;
        this.virtualComchekFlg = virtualComchekFlg;
        this.fn2in1Flg = fn2in1Flg;
        this.fnCustProfileId = fnCustProfileId;
        this.ctVipFlg = ctVipFlg;
        this.debitFlg = debitFlg;
    }

    public CrdTypFrmtFlgs(String crdTyp, String crdFrmt) {
        this.crdTypFrmtFlgsPK = new CrdTypFrmtFlgsPK(crdTyp, crdFrmt);
    }

    public CrdTypFrmtFlgsPK getCrdTypFrmtFlgsPK() {
        return crdTypFrmtFlgsPK;
    }

    public void setCrdTypFrmtFlgsPK(CrdTypFrmtFlgsPK crdTypFrmtFlgsPK) {
        this.crdTypFrmtFlgsPK = crdTypFrmtFlgsPK;
    }

    public String getCrdFlgs() {
        return crdFlgs;
    }

    public void setCrdFlgs(String crdFlgs) {
        this.crdFlgs = crdFlgs;
    }

    public Character getCrdStat() {
        return crdStat;
    }

    public void setCrdStat(Character crdStat) {
        this.crdStat = crdStat;
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

    public Character getProprtyCrdFlg() {
        return proprtyCrdFlg;
    }

    public void setProprtyCrdFlg(Character proprtyCrdFlg) {
        this.proprtyCrdFlg = proprtyCrdFlg;
    }

    public Character getMcFlg() {
        return mcFlg;
    }

    public void setMcFlg(Character mcFlg) {
        this.mcFlg = mcFlg;
    }

    public Character getVrtlCrdFlg() {
        return vrtlCrdFlg;
    }

    public void setVrtlCrdFlg(Character vrtlCrdFlg) {
        this.vrtlCrdFlg = vrtlCrdFlg;
    }

    public Character getBpPlFlg() {
        return bpPlFlg;
    }

    public void setBpPlFlg(Character bpPlFlg) {
        this.bpPlFlg = bpPlFlg;
    }

    public Character getBpIntrmFlg() {
        return bpIntrmFlg;
    }

    public void setBpIntrmFlg(Character bpIntrmFlg) {
        this.bpIntrmFlg = bpIntrmFlg;
    }

    public Character getSprvalCrdFlg() {
        return sprvalCrdFlg;
    }

    public void setSprvalCrdFlg(Character sprvalCrdFlg) {
        this.sprvalCrdFlg = sprvalCrdFlg;
    }

    public Character getPnchFlg() {
        return pnchFlg;
    }

    public void setPnchFlg(Character pnchFlg) {
        this.pnchFlg = pnchFlg;
    }

    public Character getRnwblCrdFlg() {
        return rnwblCrdFlg;
    }

    public void setRnwblCrdFlg(Character rnwblCrdFlg) {
        this.rnwblCrdFlg = rnwblCrdFlg;
    }

    public Character getAtmAlwFlg() {
        return atmAlwFlg;
    }

    public void setAtmAlwFlg(Character atmAlwFlg) {
        this.atmAlwFlg = atmAlwFlg;
    }

    public Character getNoCrdTypChgFlg() {
        return noCrdTypChgFlg;
    }

    public void setNoCrdTypChgFlg(Character noCrdTypChgFlg) {
        this.noCrdTypChgFlg = noCrdTypChgFlg;
    }

    public Character getNoCrdFmtChgFlg() {
        return noCrdFmtChgFlg;
    }

    public void setNoCrdFmtChgFlg(Character noCrdFmtChgFlg) {
        this.noCrdFmtChgFlg = noCrdFmtChgFlg;
    }

    public Character getCoDrvNmEntrFlg() {
        return coDrvNmEntrFlg;
    }

    public void setCoDrvNmEntrFlg(Character coDrvNmEntrFlg) {
        this.coDrvNmEntrFlg = coDrvNmEntrFlg;
    }

    public Character getInclInWebClFlg() {
        return inclInWebClFlg;
    }

    public void setInclInWebClFlg(Character inclInWebClFlg) {
        this.inclInWebClFlg = inclInWebClFlg;
    }

    public Character getCrdCnntMoveFlg() {
        return crdCnntMoveFlg;
    }

    public void setCrdCnntMoveFlg(Character crdCnntMoveFlg) {
        this.crdCnntMoveFlg = crdCnntMoveFlg;
    }

    public Character getPnskCrdFlg() {
        return pnskCrdFlg;
    }

    public void setPnskCrdFlg(Character pnskCrdFlg) {
        this.pnskCrdFlg = pnskCrdFlg;
    }

    public Character getMcTyp1Flg() {
        return mcTyp1Flg;
    }

    public void setMcTyp1Flg(Character mcTyp1Flg) {
        this.mcTyp1Flg = mcTyp1Flg;
    }

    public Character getPgmTypFlg() {
        return pgmTypFlg;
    }

    public void setPgmTypFlg(Character pgmTypFlg) {
        this.pgmTypFlg = pgmTypFlg;
    }

    public Character getDsplyBinFlg() {
        return dsplyBinFlg;
    }

    public void setDsplyBinFlg(Character dsplyBinFlg) {
        this.dsplyBinFlg = dsplyBinFlg;
    }

    public Character getCrtCrdTknFlg() {
        return crtCrdTknFlg;
    }

    public void setCrtCrdTknFlg(Character crtCrdTknFlg) {
        this.crtCrdTknFlg = crtCrdTknFlg;
    }

    public Character getCrtCrdHashFlg() {
        return crtCrdHashFlg;
    }

    public void setCrtCrdHashFlg(Character crtCrdHashFlg) {
        this.crtCrdHashFlg = crtCrdHashFlg;
    }

    public Character getAlwUsProprtyFlg() {
        return alwUsProprtyFlg;
    }

    public void setAlwUsProprtyFlg(Character alwUsProprtyFlg) {
        this.alwUsProprtyFlg = alwUsProprtyFlg;
    }

    public Character getCreditToCrdFlg() {
        return creditToCrdFlg;
    }

    public void setCreditToCrdFlg(Character creditToCrdFlg) {
        this.creditToCrdFlg = creditToCrdFlg;
    }

    public Character getExpDtOnCrdFlg() {
        return expDtOnCrdFlg;
    }

    public void setExpDtOnCrdFlg(Character expDtOnCrdFlg) {
        this.expDtOnCrdFlg = expDtOnCrdFlg;
    }

    public String getCrdSrvcCd() {
        return crdSrvcCd;
    }

    public void setCrdSrvcCd(String crdSrvcCd) {
        this.crdSrvcCd = crdSrvcCd;
    }

    public Character getMcOnroadFlg() {
        return mcOnroadFlg;
    }

    public void setMcOnroadFlg(Character mcOnroadFlg) {
        this.mcOnroadFlg = mcOnroadFlg;
    }

    public Character getVirtualComchekFlg() {
        return virtualComchekFlg;
    }

    public void setVirtualComchekFlg(Character virtualComchekFlg) {
        this.virtualComchekFlg = virtualComchekFlg;
    }

    public Character getFn2in1Flg() {
        return fn2in1Flg;
    }

    public void setFn2in1Flg(Character fn2in1Flg) {
        this.fn2in1Flg = fn2in1Flg;
    }

    public long getFnCustProfileId() {
        return fnCustProfileId;
    }

    public void setFnCustProfileId(long fnCustProfileId) {
        this.fnCustProfileId = fnCustProfileId;
    }

    public Character getCtVipFlg() {
        return ctVipFlg;
    }

    public void setCtVipFlg(Character ctVipFlg) {
        this.ctVipFlg = ctVipFlg;
    }

    public Character getDebitFlg() {
        return debitFlg;
    }

    public void setDebitFlg(Character debitFlg) {
        this.debitFlg = debitFlg;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (crdTypFrmtFlgsPK != null ? crdTypFrmtFlgsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof CrdTypFrmtFlgs)) {
            return false;
        }
        CrdTypFrmtFlgs other = (CrdTypFrmtFlgs) object;
        if ((this.crdTypFrmtFlgsPK == null && other.crdTypFrmtFlgsPK != null) || (this.crdTypFrmtFlgsPK != null && !this.crdTypFrmtFlgsPK.equals(other.crdTypFrmtFlgsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.CrdTypFrmtFlgs[ crdTypFrmtFlgsPK=" + crdTypFrmtFlgsPK + " ]";
    }

}
