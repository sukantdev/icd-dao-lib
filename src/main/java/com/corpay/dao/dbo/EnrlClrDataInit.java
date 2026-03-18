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
@Table(name = "ENRL_CLR_DATA_INIT", catalog = "", schema = "DBO")
public class EnrlClrDataInit implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected EnrlClrDataInitPK enrlClrDataInitPK;
    @Basic(optional = false)
    @Column(name = "VEND_MAST_ID")
    private String vendMastId;
    @Basic(optional = false)
    @Column(name = "MDY_USR")
    private String mdyUsr;
    @Basic(optional = false)
    @Column(name = "MDY_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date mdyTs;
    @Basic(optional = false)
    @Column(name = "CRT_USR")
    private String crtUsr;
    @Basic(optional = false)
    @Column(name = "CRT_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date crtTs;

    public EnrlClrDataInit() {
    }

    public EnrlClrDataInit(EnrlClrDataInitPK enrlClrDataInitPK) {
        this.enrlClrDataInitPK = enrlClrDataInitPK;
    }

    public EnrlClrDataInit(EnrlClrDataInitPK enrlClrDataInitPK, String vendMastId, String mdyUsr, Date mdyTs, String crtUsr, Date crtTs) {
        this.enrlClrDataInitPK = enrlClrDataInitPK;
        this.vendMastId = vendMastId;
        this.mdyUsr = mdyUsr;
        this.mdyTs = mdyTs;
        this.crtUsr = crtUsr;
        this.crtTs = crtTs;
    }

    public EnrlClrDataInit(String batchId, int batchSeqNbr) {
        this.enrlClrDataInitPK = new EnrlClrDataInitPK(batchId, batchSeqNbr);
    }

    public EnrlClrDataInitPK getEnrlClrDataInitPK() {
        return enrlClrDataInitPK;
    }

    public void setEnrlClrDataInitPK(EnrlClrDataInitPK enrlClrDataInitPK) {
        this.enrlClrDataInitPK = enrlClrDataInitPK;
    }

    public String getVendMastId() {
        return vendMastId;
    }

    public void setVendMastId(String vendMastId) {
        this.vendMastId = vendMastId;
    }

    public String getMdyUsr() {
        return mdyUsr;
    }

    public void setMdyUsr(String mdyUsr) {
        this.mdyUsr = mdyUsr;
    }

    public Date getMdyTs() {
        return mdyTs;
    }

    public void setMdyTs(Date mdyTs) {
        this.mdyTs = mdyTs;
    }

    public String getCrtUsr() {
        return crtUsr;
    }

    public void setCrtUsr(String crtUsr) {
        this.crtUsr = crtUsr;
    }

    public Date getCrtTs() {
        return crtTs;
    }

    public void setCrtTs(Date crtTs) {
        this.crtTs = crtTs;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (enrlClrDataInitPK != null ? enrlClrDataInitPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof EnrlClrDataInit)) {
            return false;
        }
        EnrlClrDataInit other = (EnrlClrDataInit) object;
        if ((this.enrlClrDataInitPK == null && other.enrlClrDataInitPK != null) || (this.enrlClrDataInitPK != null && !this.enrlClrDataInitPK.equals(other.enrlClrDataInitPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.EnrlClrDataInit[ enrlClrDataInitPK=" + enrlClrDataInitPK + " ]";
    }

}
