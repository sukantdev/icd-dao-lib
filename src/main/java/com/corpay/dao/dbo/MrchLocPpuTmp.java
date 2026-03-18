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
@Table(name = "MRCH_LOC_PPU_TMP", catalog = "", schema = "DBO")
public class MrchLocPpuTmp implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected MrchLocPpuTmpPK mrchLocPpuTmpPK;
    @Basic(optional = false)
    @Column(name = "LST_TRNS_DT")
    @Temporal(TemporalType.DATE)
    private Date lstTrnsDt;

    @Basic(optional = false)
    @Column(name = "FL_UNIT_PRC")
    private BigDecimal flUnitPrc;
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

    public MrchLocPpuTmp() {
    }

    public MrchLocPpuTmp(MrchLocPpuTmpPK mrchLocPpuTmpPK) {
        this.mrchLocPpuTmpPK = mrchLocPpuTmpPK;
    }

    public MrchLocPpuTmp(MrchLocPpuTmpPK mrchLocPpuTmpPK, Date lstTrnsDt, BigDecimal flUnitPrc, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.mrchLocPpuTmpPK = mrchLocPpuTmpPK;
        this.lstTrnsDt = lstTrnsDt;
        this.flUnitPrc = flUnitPrc;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public MrchLocPpuTmp(String locId, Character flSrvTyp, String flPrdCd) {
        this.mrchLocPpuTmpPK = new MrchLocPpuTmpPK(locId, flSrvTyp, flPrdCd);
    }

    public MrchLocPpuTmpPK getMrchLocPpuTmpPK() {
        return mrchLocPpuTmpPK;
    }

    public void setMrchLocPpuTmpPK(MrchLocPpuTmpPK mrchLocPpuTmpPK) {
        this.mrchLocPpuTmpPK = mrchLocPpuTmpPK;
    }

    public Date getLstTrnsDt() {
        return lstTrnsDt;
    }

    public void setLstTrnsDt(Date lstTrnsDt) {
        this.lstTrnsDt = lstTrnsDt;
    }

    public BigDecimal getFlUnitPrc() {
        return flUnitPrc;
    }

    public void setFlUnitPrc(BigDecimal flUnitPrc) {
        this.flUnitPrc = flUnitPrc;
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
        hash += (mrchLocPpuTmpPK != null ? mrchLocPpuTmpPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof MrchLocPpuTmp)) {
            return false;
        }
        MrchLocPpuTmp other = (MrchLocPpuTmp) object;
        if ((this.mrchLocPpuTmpPK == null && other.mrchLocPpuTmpPK != null) || (this.mrchLocPpuTmpPK != null && !this.mrchLocPpuTmpPK.equals(other.mrchLocPpuTmpPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.MrchLocPpuTmp[ mrchLocPpuTmpPK=" + mrchLocPpuTmpPK + " ]";
    }

}
