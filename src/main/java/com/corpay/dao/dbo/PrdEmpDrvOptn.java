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
@Table(name = "PRD_EMP_DRV_OPTN", catalog = "", schema = "DBO")
public class PrdEmpDrvOptn implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PrdEmpDrvOptnPK prdEmpDrvOptnPK;
    @Basic(optional = false)
    @Column(name = "EMP_NBR")
    private Character empNbr;
    @Basic(optional = false)
    @Column(name = "VERIFY_UNIT_FLG")
    private Character verifyUnitFlg;
    @Basic(optional = false)
    @Column(name = "TRIP_NBR")
    private Character tripNbr;
    @Basic(optional = false)
    @Column(name = "HUB_CPTR_FLG")
    private Character hubCptrFlg;
    @Basic(optional = false)
    @Column(name = "TRIP_NBR_MAX_LGTH")
    private String tripNbrMaxLgth;
    @Basic(optional = false)
    @Column(name = "TRIP_NBR_EDIT")
    private String tripNbrEdit;
    @Basic(optional = false)
    @Column(name = "HUB_OVRD_FLG")
    private Character hubOvrdFlg;
    @Basic(optional = false)
    @Column(name = "HUB_MIN_MAX")
    private String hubMinMax;
    @Basic(optional = false)
    @Column(name = "FOREIGN_TRNS_FLG")
    private Character foreignTrnsFlg;
    @Basic(optional = false)
    @Column(name = "VIN_CPTR_FLG")
    private Character vinCptrFlg;
    @Basic(optional = false)
    @Column(name = "VEHS_DESC_FLG")
    private Character vehsDescFlg;
    @Basic(optional = false)
    @Column(name = "LIC_PLATE_NBR")
    private String licPlateNbr;
    @Basic(optional = false)
    @Column(name = "REG_EXPR_FLG")
    private Character regExprFlg;
    @Basic(optional = false)
    @Column(name = "MISC_ONE_FLG")
    private Character miscOneFlg;
    @Basic(optional = false)
    @Column(name = "MISC_TWO_FLG")
    private Character miscTwoFlg;
    @Basic(optional = false)
    @Column(name = "PRE_AUTH_HOLD_AMT")
    private String preAuthHoldAmt;
    @Basic(optional = false)
    @Column(name = "FLT_REQ_PRMG_FLG")
    private Character fltReqPrmgFlg;
    @Basic(optional = false)
    @Column(name = "MC_LTD_NTWK_FLG")
    private Character mcLtdNtwkFlg;
    @Basic(optional = false)
    @Column(name = "INTNT_TRNS_FLG")
    private Character intntTrnsFlg;
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

    public PrdEmpDrvOptn() {
    }

    public PrdEmpDrvOptn(PrdEmpDrvOptnPK prdEmpDrvOptnPK) {
        this.prdEmpDrvOptnPK = prdEmpDrvOptnPK;
    }

    public PrdEmpDrvOptn(PrdEmpDrvOptnPK prdEmpDrvOptnPK, Character empNbr, Character verifyUnitFlg, Character tripNbr, Character hubCptrFlg, String tripNbrMaxLgth, String tripNbrEdit, Character hubOvrdFlg, String hubMinMax, Character foreignTrnsFlg, Character vinCptrFlg, Character vehsDescFlg, String licPlateNbr, Character regExprFlg, Character miscOneFlg, Character miscTwoFlg, String preAuthHoldAmt, Character fltReqPrmgFlg, Character mcLtdNtwkFlg, Character intntTrnsFlg, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.prdEmpDrvOptnPK = prdEmpDrvOptnPK;
        this.empNbr = empNbr;
        this.verifyUnitFlg = verifyUnitFlg;
        this.tripNbr = tripNbr;
        this.hubCptrFlg = hubCptrFlg;
        this.tripNbrMaxLgth = tripNbrMaxLgth;
        this.tripNbrEdit = tripNbrEdit;
        this.hubOvrdFlg = hubOvrdFlg;
        this.hubMinMax = hubMinMax;
        this.foreignTrnsFlg = foreignTrnsFlg;
        this.vinCptrFlg = vinCptrFlg;
        this.vehsDescFlg = vehsDescFlg;
        this.licPlateNbr = licPlateNbr;
        this.regExprFlg = regExprFlg;
        this.miscOneFlg = miscOneFlg;
        this.miscTwoFlg = miscTwoFlg;
        this.preAuthHoldAmt = preAuthHoldAmt;
        this.fltReqPrmgFlg = fltReqPrmgFlg;
        this.mcLtdNtwkFlg = mcLtdNtwkFlg;
        this.intntTrnsFlg = intntTrnsFlg;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public PrdEmpDrvOptn(String applNbr, String childTyp) {
        this.prdEmpDrvOptnPK = new PrdEmpDrvOptnPK(applNbr, childTyp);
    }

    public PrdEmpDrvOptnPK getPrdEmpDrvOptnPK() {
        return prdEmpDrvOptnPK;
    }

    public void setPrdEmpDrvOptnPK(PrdEmpDrvOptnPK prdEmpDrvOptnPK) {
        this.prdEmpDrvOptnPK = prdEmpDrvOptnPK;
    }

    public Character getEmpNbr() {
        return empNbr;
    }

    public void setEmpNbr(Character empNbr) {
        this.empNbr = empNbr;
    }

    public Character getVerifyUnitFlg() {
        return verifyUnitFlg;
    }

    public void setVerifyUnitFlg(Character verifyUnitFlg) {
        this.verifyUnitFlg = verifyUnitFlg;
    }

    public Character getTripNbr() {
        return tripNbr;
    }

    public void setTripNbr(Character tripNbr) {
        this.tripNbr = tripNbr;
    }

    public Character getHubCptrFlg() {
        return hubCptrFlg;
    }

    public void setHubCptrFlg(Character hubCptrFlg) {
        this.hubCptrFlg = hubCptrFlg;
    }

    public String getTripNbrMaxLgth() {
        return tripNbrMaxLgth;
    }

    public void setTripNbrMaxLgth(String tripNbrMaxLgth) {
        this.tripNbrMaxLgth = tripNbrMaxLgth;
    }

    public String getTripNbrEdit() {
        return tripNbrEdit;
    }

    public void setTripNbrEdit(String tripNbrEdit) {
        this.tripNbrEdit = tripNbrEdit;
    }

    public Character getHubOvrdFlg() {
        return hubOvrdFlg;
    }

    public void setHubOvrdFlg(Character hubOvrdFlg) {
        this.hubOvrdFlg = hubOvrdFlg;
    }

    public String getHubMinMax() {
        return hubMinMax;
    }

    public void setHubMinMax(String hubMinMax) {
        this.hubMinMax = hubMinMax;
    }

    public Character getForeignTrnsFlg() {
        return foreignTrnsFlg;
    }

    public void setForeignTrnsFlg(Character foreignTrnsFlg) {
        this.foreignTrnsFlg = foreignTrnsFlg;
    }

    public Character getVinCptrFlg() {
        return vinCptrFlg;
    }

    public void setVinCptrFlg(Character vinCptrFlg) {
        this.vinCptrFlg = vinCptrFlg;
    }

    public Character getVehsDescFlg() {
        return vehsDescFlg;
    }

    public void setVehsDescFlg(Character vehsDescFlg) {
        this.vehsDescFlg = vehsDescFlg;
    }

    public String getLicPlateNbr() {
        return licPlateNbr;
    }

    public void setLicPlateNbr(String licPlateNbr) {
        this.licPlateNbr = licPlateNbr;
    }

    public Character getRegExprFlg() {
        return regExprFlg;
    }

    public void setRegExprFlg(Character regExprFlg) {
        this.regExprFlg = regExprFlg;
    }

    public Character getMiscOneFlg() {
        return miscOneFlg;
    }

    public void setMiscOneFlg(Character miscOneFlg) {
        this.miscOneFlg = miscOneFlg;
    }

    public Character getMiscTwoFlg() {
        return miscTwoFlg;
    }

    public void setMiscTwoFlg(Character miscTwoFlg) {
        this.miscTwoFlg = miscTwoFlg;
    }

    public String getPreAuthHoldAmt() {
        return preAuthHoldAmt;
    }

    public void setPreAuthHoldAmt(String preAuthHoldAmt) {
        this.preAuthHoldAmt = preAuthHoldAmt;
    }

    public Character getFltReqPrmgFlg() {
        return fltReqPrmgFlg;
    }

    public void setFltReqPrmgFlg(Character fltReqPrmgFlg) {
        this.fltReqPrmgFlg = fltReqPrmgFlg;
    }

    public Character getMcLtdNtwkFlg() {
        return mcLtdNtwkFlg;
    }

    public void setMcLtdNtwkFlg(Character mcLtdNtwkFlg) {
        this.mcLtdNtwkFlg = mcLtdNtwkFlg;
    }

    public Character getIntntTrnsFlg() {
        return intntTrnsFlg;
    }

    public void setIntntTrnsFlg(Character intntTrnsFlg) {
        this.intntTrnsFlg = intntTrnsFlg;
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
        hash += (prdEmpDrvOptnPK != null ? prdEmpDrvOptnPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof PrdEmpDrvOptn)) {
            return false;
        }
        PrdEmpDrvOptn other = (PrdEmpDrvOptn) object;
        if ((this.prdEmpDrvOptnPK == null && other.prdEmpDrvOptnPK != null) || (this.prdEmpDrvOptnPK != null && !this.prdEmpDrvOptnPK.equals(other.prdEmpDrvOptnPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.PrdEmpDrvOptn[ prdEmpDrvOptnPK=" + prdEmpDrvOptnPK + " ]";
    }

}
