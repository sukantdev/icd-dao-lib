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
@Table(name = "SVS_CLT_BRDNG_XREF", catalog = "", schema = "DBO")
public class SvsCltBrdngXref implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected SvsCltBrdngXrefPK svsCltBrdngXrefPK;
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

    public SvsCltBrdngXref() {
    }

    public SvsCltBrdngXref(SvsCltBrdngXrefPK svsCltBrdngXrefPK) {
        this.svsCltBrdngXrefPK = svsCltBrdngXrefPK;
    }

    public SvsCltBrdngXref(SvsCltBrdngXrefPK svsCltBrdngXrefPK, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.svsCltBrdngXrefPK = svsCltBrdngXrefPK;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public SvsCltBrdngXref(String brdngCd, String clientId) {
        this.svsCltBrdngXrefPK = new SvsCltBrdngXrefPK(brdngCd, clientId);
    }

    public SvsCltBrdngXrefPK getSvsCltBrdngXrefPK() {
        return svsCltBrdngXrefPK;
    }

    public void setSvsCltBrdngXrefPK(SvsCltBrdngXrefPK svsCltBrdngXrefPK) {
        this.svsCltBrdngXrefPK = svsCltBrdngXrefPK;
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
        hash += (svsCltBrdngXrefPK != null ? svsCltBrdngXrefPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof SvsCltBrdngXref)) {
            return false;
        }
        SvsCltBrdngXref other = (SvsCltBrdngXref) object;
        if ((this.svsCltBrdngXrefPK == null && other.svsCltBrdngXrefPK != null) || (this.svsCltBrdngXrefPK != null && !this.svsCltBrdngXrefPK.equals(other.svsCltBrdngXrefPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.SvsCltBrdngXref[ svsCltBrdngXrefPK=" + svsCltBrdngXrefPK + " ]";
    }

}
