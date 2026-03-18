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
@Table(name = "DX38_ADD_INFO", catalog = "", schema = "DBO")
public class Dx38AddInfo implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected Dx38AddInfoPK dx38AddInfoPK;
    @Basic(optional = false)
    @Column(name = "TRAN_ID")
    private String tranId;
    @Basic(optional = false)
    @Column(name = "FEP_BATCH_NBR")
    private String fepBatchNbr;
    @Basic(optional = false)
    @Column(name = "STAN_CMNT")
    private String stanCmnt;
    @Basic(optional = false)
    @Column(name = "TERM_BATCH_NBR")
    private String termBatchNbr;
    @Basic(optional = false)
    @Column(name = "OP_ENV_CD")
    private Character opEnvCd;
    @Basic(optional = false)
    @Column(name = "MISC_ENTRY_NBR")
    private String miscEntryNbr;
    @Basic(optional = false)
    @Column(name = "VEH_LIC_PLATE_NBR")
    private String vehLicPlateNbr;
    @Basic(optional = false)
    @Column(name = "OIL_CO_BNM")
    private String oilCoBnm;
    @Basic(optional = false)
    @Column(name = "CRT_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date crtTs;
    @Basic(optional = false)
    @Column(name = "CRT_USR")
    private String crtUsr;

    public Dx38AddInfo() {
    }

    public Dx38AddInfo(Dx38AddInfoPK dx38AddInfoPK) {
        this.dx38AddInfoPK = dx38AddInfoPK;
    }

    public Dx38AddInfo(Dx38AddInfoPK dx38AddInfoPK, String tranId, String fepBatchNbr, String stanCmnt, String termBatchNbr, Character opEnvCd, String miscEntryNbr, String vehLicPlateNbr, String oilCoBnm, Date crtTs, String crtUsr) {
        this.dx38AddInfoPK = dx38AddInfoPK;
        this.tranId = tranId;
        this.fepBatchNbr = fepBatchNbr;
        this.stanCmnt = stanCmnt;
        this.termBatchNbr = termBatchNbr;
        this.opEnvCd = opEnvCd;
        this.miscEntryNbr = miscEntryNbr;
        this.vehLicPlateNbr = vehLicPlateNbr;
        this.oilCoBnm = oilCoBnm;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
    }

    public Dx38AddInfo(short p105s1FileTy, int p105s2FileRDt, long p105s3ProcId, int p105s4FileSeqNo, int d71MsgNo) {
        this.dx38AddInfoPK = new Dx38AddInfoPK(p105s1FileTy, p105s2FileRDt, p105s3ProcId, p105s4FileSeqNo, d71MsgNo);
    }

    public Dx38AddInfoPK getDx38AddInfoPK() {
        return dx38AddInfoPK;
    }

    public void setDx38AddInfoPK(Dx38AddInfoPK dx38AddInfoPK) {
        this.dx38AddInfoPK = dx38AddInfoPK;
    }

    public String getTranId() {
        return tranId;
    }

    public void setTranId(String tranId) {
        this.tranId = tranId;
    }

    public String getFepBatchNbr() {
        return fepBatchNbr;
    }

    public void setFepBatchNbr(String fepBatchNbr) {
        this.fepBatchNbr = fepBatchNbr;
    }

    public String getStanCmnt() {
        return stanCmnt;
    }

    public void setStanCmnt(String stanCmnt) {
        this.stanCmnt = stanCmnt;
    }

    public String getTermBatchNbr() {
        return termBatchNbr;
    }

    public void setTermBatchNbr(String termBatchNbr) {
        this.termBatchNbr = termBatchNbr;
    }

    public Character getOpEnvCd() {
        return opEnvCd;
    }

    public void setOpEnvCd(Character opEnvCd) {
        this.opEnvCd = opEnvCd;
    }

    public String getMiscEntryNbr() {
        return miscEntryNbr;
    }

    public void setMiscEntryNbr(String miscEntryNbr) {
        this.miscEntryNbr = miscEntryNbr;
    }

    public String getVehLicPlateNbr() {
        return vehLicPlateNbr;
    }

    public void setVehLicPlateNbr(String vehLicPlateNbr) {
        this.vehLicPlateNbr = vehLicPlateNbr;
    }

    public String getOilCoBnm() {
        return oilCoBnm;
    }

    public void setOilCoBnm(String oilCoBnm) {
        this.oilCoBnm = oilCoBnm;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (dx38AddInfoPK != null ? dx38AddInfoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof Dx38AddInfo)) {
            return false;
        }
        Dx38AddInfo other = (Dx38AddInfo) object;
        if ((this.dx38AddInfoPK == null && other.dx38AddInfoPK != null) || (this.dx38AddInfoPK != null && !this.dx38AddInfoPK.equals(other.dx38AddInfoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.Dx38AddInfo[ dx38AddInfoPK=" + dx38AddInfoPK + " ]";
    }

}
