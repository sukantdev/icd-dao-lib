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
@Table(name = "INV_CRD_VEH", catalog = "", schema = "DBO")
public class InvCrdVeh implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected InvCrdVehPK invCrdVehPK;
    @Basic(optional = false)
    @Column(name = "PRTN_ID")
    private short prtnId;
    @Basic(optional = false)
    @Column(name = "CRD_TYP")
    private Character crdTyp;
    @Basic(optional = false)
    @Column(name = "CRDH_FST_NM")
    private String crdhFstNm;
    @Basic(optional = false)
    @Column(name = "CRDH_LAST_NM")
    private String crdhLastNm;
    @Basic(optional = false)
    @Column(name = "EMP_NBR")
    private String empNbr;
    @Basic(optional = false)
    @Column(name = "DRV_LIC_NBR")
    private String drvLicNbr;
    @Basic(optional = false)
    @Column(name = "DRV_LIC_ST_PROV")
    private String drvLicStProv;
    @Basic(optional = false)
    @Column(name = "DRV_LIC_CRTY")
    private String drvLicCrty;
    @Basic(optional = false)
    @Column(name = "CUST_PRF_NBR")
    private String custPrfNbr;
    @Basic(optional = false)
    @Column(name = "USE_CUST_PRF")
    private Character useCustPrf;
    @Basic(optional = false)
    @Column(name = "TRIP_NBR")
    private String tripNbr;
    @Basic(optional = false)
    @Column(name = "ID_NBR")
    private String idNbr;
    @Basic(optional = false)
    @Column(name = "VEH_NBR")
    private String vehNbr;
    @Basic(optional = false)
    @Column(name = "VEH_DESC")
    private String vehDesc;
    @Basic(optional = false)
    @Column(name = "VIN")
    private String vin;
    @Basic(optional = false)
    @Column(name = "VEH_LIC_PLATE")
    private String vehLicPlate;
    @Basic(optional = false)
    @Column(name = "VEH_REG_EXP")
    private short vehRegExp;
    @Basic(optional = false)
    @Column(name = "VEH_FL_TYP")
    private String vehFlTyp;
    @Basic(optional = false)
    @Column(name = "VEH_TANK_CAP")
    private String vehTankCap;
    @Basic(optional = false)
    @Column(name = "TRL_NBR")
    private String trlNbr;
    @Basic(optional = false)
    @Column(name = "DRV_ID")
    private String drvId;
    @Basic(optional = false)
    @Column(name = "MISC_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date miscTs;
    @Basic(optional = false)
    @Column(name = "MISC_SEQ_NBR")
    private short miscSeqNbr;
    @Basic(optional = false)
    @Column(name = "POS_FST_NM")
    private String posFstNm;
    @Basic(optional = false)
    @Column(name = "POS_LST_NM")
    private String posLstNm;
    @Basic(optional = false)
    @Column(name = "RPAIR_ORD_NBR")
    private String rpairOrdNbr;
    @Basic(optional = false)
    @Column(name = "VNDR_INV_NBR")
    private String vndrInvNbr;
    @Basic(optional = false)
    @Column(name = "WRTY_REPORT")
    private Character wrtyReport;
    @Basic(optional = false)
    @Column(name = "WRTY_PIRD")
    private String wrtyPird;
    @Basic(optional = false)
    @Column(name = "VNDR_NBR")
    private String vndrNbr;
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
    @Column(name = "VIRTUAL_CRD_FLG")
    private Character virtualCrdFlg;
    @Basic(optional = false)
    @Column(name = "ADJ_VEH_NBR")
    private String adjVehNbr;
    @Basic(optional = false)
    @Column(name = "ID_MISC1")
    private String idMisc1;
    @Basic(optional = false)
    @Column(name = "ID_MISC2")
    private String idMisc2;
    @Basic(optional = false)
    @Column(name = "CRD_EXP_DT")
    private String crdExpDt;

    public InvCrdVeh() {
    }

    public InvCrdVeh(InvCrdVehPK invCrdVehPK) {
        this.invCrdVehPK = invCrdVehPK;
    }

    public InvCrdVeh(InvCrdVehPK invCrdVehPK, short prtnId, Character crdTyp, String crdhFstNm, String crdhLastNm, String empNbr, String drvLicNbr, String drvLicStProv, String drvLicCrty, String custPrfNbr, Character useCustPrf, String tripNbr, String idNbr, String vehNbr, String vehDesc, String vin, String vehLicPlate, short vehRegExp, String vehFlTyp, String vehTankCap, String trlNbr, String drvId, Date miscTs, short miscSeqNbr, String posFstNm, String posLstNm, String rpairOrdNbr, String vndrInvNbr, Character wrtyReport, String wrtyPird, String vndrNbr, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr, Character virtualCrdFlg, String adjVehNbr, String idMisc1, String idMisc2, String crdExpDt) {
        this.invCrdVehPK = invCrdVehPK;
        this.prtnId = prtnId;
        this.crdTyp = crdTyp;
        this.crdhFstNm = crdhFstNm;
        this.crdhLastNm = crdhLastNm;
        this.empNbr = empNbr;
        this.drvLicNbr = drvLicNbr;
        this.drvLicStProv = drvLicStProv;
        this.drvLicCrty = drvLicCrty;
        this.custPrfNbr = custPrfNbr;
        this.useCustPrf = useCustPrf;
        this.tripNbr = tripNbr;
        this.idNbr = idNbr;
        this.vehNbr = vehNbr;
        this.vehDesc = vehDesc;
        this.vin = vin;
        this.vehLicPlate = vehLicPlate;
        this.vehRegExp = vehRegExp;
        this.vehFlTyp = vehFlTyp;
        this.vehTankCap = vehTankCap;
        this.trlNbr = trlNbr;
        this.drvId = drvId;
        this.miscTs = miscTs;
        this.miscSeqNbr = miscSeqNbr;
        this.posFstNm = posFstNm;
        this.posLstNm = posLstNm;
        this.rpairOrdNbr = rpairOrdNbr;
        this.vndrInvNbr = vndrInvNbr;
        this.wrtyReport = wrtyReport;
        this.wrtyPird = wrtyPird;
        this.vndrNbr = vndrNbr;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
        this.virtualCrdFlg = virtualCrdFlg;
        this.adjVehNbr = adjVehNbr;
        this.idMisc1 = idMisc1;
        this.idMisc2 = idMisc2;
        this.crdExpDt = crdExpDt;
    }

    public InvCrdVeh(Date pstdDt, int trnsId) {
        this.invCrdVehPK = new InvCrdVehPK(pstdDt, trnsId);
    }

    public InvCrdVehPK getInvCrdVehPK() {
        return invCrdVehPK;
    }

    public void setInvCrdVehPK(InvCrdVehPK invCrdVehPK) {
        this.invCrdVehPK = invCrdVehPK;
    }

    public short getPrtnId() {
        return prtnId;
    }

    public void setPrtnId(short prtnId) {
        this.prtnId = prtnId;
    }

    public Character getCrdTyp() {
        return crdTyp;
    }

    public void setCrdTyp(Character crdTyp) {
        this.crdTyp = crdTyp;
    }

    public String getCrdhFstNm() {
        return crdhFstNm;
    }

    public void setCrdhFstNm(String crdhFstNm) {
        this.crdhFstNm = crdhFstNm;
    }

    public String getCrdhLastNm() {
        return crdhLastNm;
    }

    public void setCrdhLastNm(String crdhLastNm) {
        this.crdhLastNm = crdhLastNm;
    }

    public String getEmpNbr() {
        return empNbr;
    }

    public void setEmpNbr(String empNbr) {
        this.empNbr = empNbr;
    }

    public String getDrvLicNbr() {
        return drvLicNbr;
    }

    public void setDrvLicNbr(String drvLicNbr) {
        this.drvLicNbr = drvLicNbr;
    }

    public String getDrvLicStProv() {
        return drvLicStProv;
    }

    public void setDrvLicStProv(String drvLicStProv) {
        this.drvLicStProv = drvLicStProv;
    }

    public String getDrvLicCrty() {
        return drvLicCrty;
    }

    public void setDrvLicCrty(String drvLicCrty) {
        this.drvLicCrty = drvLicCrty;
    }

    public String getCustPrfNbr() {
        return custPrfNbr;
    }

    public void setCustPrfNbr(String custPrfNbr) {
        this.custPrfNbr = custPrfNbr;
    }

    public Character getUseCustPrf() {
        return useCustPrf;
    }

    public void setUseCustPrf(Character useCustPrf) {
        this.useCustPrf = useCustPrf;
    }

    public String getTripNbr() {
        return tripNbr;
    }

    public void setTripNbr(String tripNbr) {
        this.tripNbr = tripNbr;
    }

    public String getIdNbr() {
        return idNbr;
    }

    public void setIdNbr(String idNbr) {
        this.idNbr = idNbr;
    }

    public String getVehNbr() {
        return vehNbr;
    }

    public void setVehNbr(String vehNbr) {
        this.vehNbr = vehNbr;
    }

    public String getVehDesc() {
        return vehDesc;
    }

    public void setVehDesc(String vehDesc) {
        this.vehDesc = vehDesc;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getVehLicPlate() {
        return vehLicPlate;
    }

    public void setVehLicPlate(String vehLicPlate) {
        this.vehLicPlate = vehLicPlate;
    }

    public short getVehRegExp() {
        return vehRegExp;
    }

    public void setVehRegExp(short vehRegExp) {
        this.vehRegExp = vehRegExp;
    }

    public String getVehFlTyp() {
        return vehFlTyp;
    }

    public void setVehFlTyp(String vehFlTyp) {
        this.vehFlTyp = vehFlTyp;
    }

    public String getVehTankCap() {
        return vehTankCap;
    }

    public void setVehTankCap(String vehTankCap) {
        this.vehTankCap = vehTankCap;
    }

    public String getTrlNbr() {
        return trlNbr;
    }

    public void setTrlNbr(String trlNbr) {
        this.trlNbr = trlNbr;
    }

    public String getDrvId() {
        return drvId;
    }

    public void setDrvId(String drvId) {
        this.drvId = drvId;
    }

    public Date getMiscTs() {
        return miscTs;
    }

    public void setMiscTs(Date miscTs) {
        this.miscTs = miscTs;
    }

    public short getMiscSeqNbr() {
        return miscSeqNbr;
    }

    public void setMiscSeqNbr(short miscSeqNbr) {
        this.miscSeqNbr = miscSeqNbr;
    }

    public String getPosFstNm() {
        return posFstNm;
    }

    public void setPosFstNm(String posFstNm) {
        this.posFstNm = posFstNm;
    }

    public String getPosLstNm() {
        return posLstNm;
    }

    public void setPosLstNm(String posLstNm) {
        this.posLstNm = posLstNm;
    }

    public String getRpairOrdNbr() {
        return rpairOrdNbr;
    }

    public void setRpairOrdNbr(String rpairOrdNbr) {
        this.rpairOrdNbr = rpairOrdNbr;
    }

    public String getVndrInvNbr() {
        return vndrInvNbr;
    }

    public void setVndrInvNbr(String vndrInvNbr) {
        this.vndrInvNbr = vndrInvNbr;
    }

    public Character getWrtyReport() {
        return wrtyReport;
    }

    public void setWrtyReport(Character wrtyReport) {
        this.wrtyReport = wrtyReport;
    }

    public String getWrtyPird() {
        return wrtyPird;
    }

    public void setWrtyPird(String wrtyPird) {
        this.wrtyPird = wrtyPird;
    }

    public String getVndrNbr() {
        return vndrNbr;
    }

    public void setVndrNbr(String vndrNbr) {
        this.vndrNbr = vndrNbr;
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

    public Character getVirtualCrdFlg() {
        return virtualCrdFlg;
    }

    public void setVirtualCrdFlg(Character virtualCrdFlg) {
        this.virtualCrdFlg = virtualCrdFlg;
    }

    public String getAdjVehNbr() {
        return adjVehNbr;
    }

    public void setAdjVehNbr(String adjVehNbr) {
        this.adjVehNbr = adjVehNbr;
    }

    public String getIdMisc1() {
        return idMisc1;
    }

    public void setIdMisc1(String idMisc1) {
        this.idMisc1 = idMisc1;
    }

    public String getIdMisc2() {
        return idMisc2;
    }

    public void setIdMisc2(String idMisc2) {
        this.idMisc2 = idMisc2;
    }

    public String getCrdExpDt() {
        return crdExpDt;
    }

    public void setCrdExpDt(String crdExpDt) {
        this.crdExpDt = crdExpDt;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (invCrdVehPK != null ? invCrdVehPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof InvCrdVeh)) {
            return false;
        }
        InvCrdVeh other = (InvCrdVeh) object;
        if ((this.invCrdVehPK == null && other.invCrdVehPK != null) || (this.invCrdVehPK != null && !this.invCrdVehPK.equals(other.invCrdVehPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.InvCrdVeh[ invCrdVehPK=" + invCrdVehPK + " ]";
    }

}
