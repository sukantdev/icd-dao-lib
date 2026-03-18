package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "FA_TRP_MAST", catalog = "", schema = "DBO")
public class FaTrpMast implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "TRP_ID")
    private Long trpId;
    @Basic(optional = false)
    @Column(name = "TRP_FILE_INFO_ID")
    private long trpFileInfoId;
    @Basic(optional = false)
    @Column(name = "CUST_ID")
    private String custId;
    @Basic(optional = false)
    @Column(name = "TRP_NM")
    private String trpNm;
    @Basic(optional = false)
    @Column(name = "DRV_ID")
    private String drvId;
    @Basic(optional = false)
    @Column(name = "VEH_ID")
    private String vehId;

    @Basic(optional = false)
    @Column(name = "TANK_SIZE")
    private BigDecimal tankSize;
    @Basic(optional = false)
    @Column(name = "VEH_MPG")
    private BigDecimal vehMpg;
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

    public FaTrpMast() {
    }

    public FaTrpMast(Long trpId) {
        this.trpId = trpId;
    }

    public FaTrpMast(Long trpId, long trpFileInfoId, String custId, String trpNm, String drvId, String vehId, BigDecimal tankSize, BigDecimal vehMpg, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.trpId = trpId;
        this.trpFileInfoId = trpFileInfoId;
        this.custId = custId;
        this.trpNm = trpNm;
        this.drvId = drvId;
        this.vehId = vehId;
        this.tankSize = tankSize;
        this.vehMpg = vehMpg;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public Long getTrpId() {
        return trpId;
    }

    public void setTrpId(Long trpId) {
        this.trpId = trpId;
    }

    public long getTrpFileInfoId() {
        return trpFileInfoId;
    }

    public void setTrpFileInfoId(long trpFileInfoId) {
        this.trpFileInfoId = trpFileInfoId;
    }

    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId;
    }

    public String getTrpNm() {
        return trpNm;
    }

    public void setTrpNm(String trpNm) {
        this.trpNm = trpNm;
    }

    public String getDrvId() {
        return drvId;
    }

    public void setDrvId(String drvId) {
        this.drvId = drvId;
    }

    public String getVehId() {
        return vehId;
    }

    public void setVehId(String vehId) {
        this.vehId = vehId;
    }

    public BigDecimal getTankSize() {
        return tankSize;
    }

    public void setTankSize(BigDecimal tankSize) {
        this.tankSize = tankSize;
    }

    public BigDecimal getVehMpg() {
        return vehMpg;
    }

    public void setVehMpg(BigDecimal vehMpg) {
        this.vehMpg = vehMpg;
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
        hash += (trpId != null ? trpId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof FaTrpMast)) {
            return false;
        }
        FaTrpMast other = (FaTrpMast) object;
        if ((this.trpId == null && other.trpId != null) || (this.trpId != null && !this.trpId.equals(other.trpId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.FaTrpMast[ trpId=" + trpId + " ]";
    }

}
