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
@Table(name = "PFID_CUST_XREF", catalog = "", schema = "DBO")
public class PfidCustXref implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PfidCustXrefPK pfidCustXrefPK;
    @Basic(optional = false)
    @Column(name = "PFID_CUST_STAT_CD")
    private Character pfidCustStatCd;
    @Basic(optional = false)
    @Column(name = "EFFCTV_DT_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date effctvDtTs;
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

    public PfidCustXref() {
    }

    public PfidCustXref(PfidCustXrefPK pfidCustXrefPK) {
        this.pfidCustXrefPK = pfidCustXrefPK;
    }

    public PfidCustXref(PfidCustXrefPK pfidCustXrefPK, Character pfidCustStatCd, Date effctvDtTs, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.pfidCustXrefPK = pfidCustXrefPK;
        this.pfidCustStatCd = pfidCustStatCd;
        this.effctvDtTs = effctvDtTs;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public PfidCustXref(String pfidCd, String acctNbr, String custId) {
        this.pfidCustXrefPK = new PfidCustXrefPK(pfidCd, acctNbr, custId);
    }

    public PfidCustXrefPK getPfidCustXrefPK() {
        return pfidCustXrefPK;
    }

    public void setPfidCustXrefPK(PfidCustXrefPK pfidCustXrefPK) {
        this.pfidCustXrefPK = pfidCustXrefPK;
    }

    public Character getPfidCustStatCd() {
        return pfidCustStatCd;
    }

    public void setPfidCustStatCd(Character pfidCustStatCd) {
        this.pfidCustStatCd = pfidCustStatCd;
    }

    public Date getEffctvDtTs() {
        return effctvDtTs;
    }

    public void setEffctvDtTs(Date effctvDtTs) {
        this.effctvDtTs = effctvDtTs;
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
        hash += (pfidCustXrefPK != null ? pfidCustXrefPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof PfidCustXref)) {
            return false;
        }
        PfidCustXref other = (PfidCustXref) object;
        if ((this.pfidCustXrefPK == null && other.pfidCustXrefPK != null) || (this.pfidCustXrefPK != null && !this.pfidCustXrefPK.equals(other.pfidCustXrefPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.PfidCustXref[ pfidCustXrefPK=" + pfidCustXrefPK + " ]";
    }

}
