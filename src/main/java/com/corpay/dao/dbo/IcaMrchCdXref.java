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
@Table(name = "ICA_MRCH_CD_XREF", catalog = "", schema = "DBO")
public class IcaMrchCdXref implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ICA_CD")
    private Integer icaCd;
    @Basic(optional = false)
    @Column(name = "MRCH_CD")
    private String mrchCd;
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

    public IcaMrchCdXref() {
    }

    public IcaMrchCdXref(Integer icaCd) {
        this.icaCd = icaCd;
    }

    public IcaMrchCdXref(Integer icaCd, String mrchCd, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.icaCd = icaCd;
        this.mrchCd = mrchCd;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public Integer getIcaCd() {
        return icaCd;
    }

    public void setIcaCd(Integer icaCd) {
        this.icaCd = icaCd;
    }

    public String getMrchCd() {
        return mrchCd;
    }

    public void setMrchCd(String mrchCd) {
        this.mrchCd = mrchCd;
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
        hash += (icaCd != null ? icaCd.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof IcaMrchCdXref)) {
            return false;
        }
        IcaMrchCdXref other = (IcaMrchCdXref) object;
        if ((this.icaCd == null && other.icaCd != null) || (this.icaCd != null && !this.icaCd.equals(other.icaCd))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.IcaMrchCdXref[ icaCd=" + icaCd + " ]";
    }

}
