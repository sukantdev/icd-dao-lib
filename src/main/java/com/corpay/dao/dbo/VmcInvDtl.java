package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "VMC_INV_DTL", catalog = "", schema = "DBO")
public class VmcInvDtl implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected VmcInvDtlPK vmcInvDtlPK;
    @Basic(optional = false)
    @Column(name = "INV_NBR")
    private String invNbr;
    @Basic(optional = false)
    @Column(name = "INV_DT")
    @Temporal(TemporalType.DATE)
    private Date invDt;

    @Basic(optional = false)
    @Column(name = "GRS_AMT")
    private BigDecimal grsAmt;
    @Basic(optional = false)
    @Column(name = "INV_DISC")
    private BigDecimal invDisc;
    @Basic(optional = false)
    @Column(name = "INV_AMT")
    private BigDecimal invAmt;
    @Basic(optional = false)
    @Column(name = "DUE_DT")
    @Temporal(TemporalType.DATE)
    private Date dueDt;
    @Basic(optional = false)
    @Column(name = "PMT_DT")
    @Temporal(TemporalType.DATE)
    private Date pmtDt;
    @Basic(optional = false)
    @Column(name = "CMNT")
    private String cmnt;
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
    @Column(name = "PO_NBR")
    private String poNbr;
    @Basic(optional = false)
    @Column(name = "REPAIR_ODR_NBR")
    private String repairOdrNbr;
    @Basic(optional = false)
    @Column(name = "VEHICLE_NBR")
    private String vehicleNbr;
    @Basic(optional = false)
    @Column(name = "PROMPTED_DRVR_ID")
    private String promptedDrvrId;

    public VmcInvDtl() {
    }

    public VmcInvDtl(VmcInvDtlPK vmcInvDtlPK) {
        this.vmcInvDtlPK = vmcInvDtlPK;
    }

    public VmcInvDtl(VmcInvDtlPK vmcInvDtlPK, String invNbr, Date invDt, BigDecimal grsAmt, BigDecimal invDisc, BigDecimal invAmt, Date dueDt, Date pmtDt, String cmnt, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr, String poNbr, String repairOdrNbr, String vehicleNbr, String promptedDrvrId) {
        this.vmcInvDtlPK = vmcInvDtlPK;
        this.invNbr = invNbr;
        this.invDt = invDt;
        this.grsAmt = grsAmt;
        this.invDisc = invDisc;
        this.invAmt = invAmt;
        this.dueDt = dueDt;
        this.pmtDt = pmtDt;
        this.cmnt = cmnt;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
        this.poNbr = poNbr;
        this.repairOdrNbr = repairOdrNbr;
        this.vehicleNbr = vehicleNbr;
        this.promptedDrvrId = promptedDrvrId;
    }

    public VmcInvDtl(String crdNbr, int entrySeq) {
        this.vmcInvDtlPK = new VmcInvDtlPK(crdNbr, entrySeq);
    }

    public VmcInvDtlPK getVmcInvDtlPK() {
        return vmcInvDtlPK;
    }

    public void setVmcInvDtlPK(VmcInvDtlPK vmcInvDtlPK) {
        this.vmcInvDtlPK = vmcInvDtlPK;
    }

    public String getInvNbr() {
        return invNbr;
    }

    public void setInvNbr(String invNbr) {
        this.invNbr = invNbr;
    }

    public Date getInvDt() {
        return invDt;
    }

    public void setInvDt(Date invDt) {
        this.invDt = invDt;
    }

    public BigDecimal getGrsAmt() {
        return grsAmt;
    }

    public void setGrsAmt(BigDecimal grsAmt) {
        this.grsAmt = grsAmt;
    }

    public BigDecimal getInvDisc() {
        return invDisc;
    }

    public void setInvDisc(BigDecimal invDisc) {
        this.invDisc = invDisc;
    }

    public BigDecimal getInvAmt() {
        return invAmt;
    }

    public void setInvAmt(BigDecimal invAmt) {
        this.invAmt = invAmt;
    }

    public Date getDueDt() {
        return dueDt;
    }

    public void setDueDt(Date dueDt) {
        this.dueDt = dueDt;
    }

    public Date getPmtDt() {
        return pmtDt;
    }

    public void setPmtDt(Date pmtDt) {
        this.pmtDt = pmtDt;
    }

    public String getCmnt() {
        return cmnt;
    }

    public void setCmnt(String cmnt) {
        this.cmnt = cmnt;
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

    public String getPoNbr() {
        return poNbr;
    }

    public void setPoNbr(String poNbr) {
        this.poNbr = poNbr;
    }

    public String getRepairOdrNbr() {
        return repairOdrNbr;
    }

    public void setRepairOdrNbr(String repairOdrNbr) {
        this.repairOdrNbr = repairOdrNbr;
    }

    public String getVehicleNbr() {
        return vehicleNbr;
    }

    public void setVehicleNbr(String vehicleNbr) {
        this.vehicleNbr = vehicleNbr;
    }

    public String getPromptedDrvrId() {
        return promptedDrvrId;
    }

    public void setPromptedDrvrId(String promptedDrvrId) {
        this.promptedDrvrId = promptedDrvrId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (vmcInvDtlPK != null ? vmcInvDtlPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof VmcInvDtl)) {
            return false;
        }
        VmcInvDtl other = (VmcInvDtl) object;
        if ((this.vmcInvDtlPK == null && other.vmcInvDtlPK != null) || (this.vmcInvDtlPK != null && !this.vmcInvDtlPK.equals(other.vmcInvDtlPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.VmcInvDtl[ vmcInvDtlPK=" + vmcInvDtlPK + " ]";
    }

}
