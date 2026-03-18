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
@Table(name = "VP_CV_INV", catalog = "", schema = "DBO")
public class VpCvInv implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "INV_ID")
    private String invId;
    @Basic(optional = false)
    @Column(name = "CV_MAST_ID")
    private String cvMastId;
    @Basic(optional = false)
    @Column(name = "INV_NBR")
    private String invNbr;
    @Basic(optional = false)
    @Column(name = "INV_DT")
    @Temporal(TemporalType.DATE)
    private Date invDt;

    @Basic(optional = false)
    @Column(name = "INV_AMT")
    private BigDecimal invAmt;
    @Basic(optional = false)
    @Column(name = "SF_INV_UID")
    private String sfInvUid;
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

    public VpCvInv() {
    }

    public VpCvInv(String invId) {
        this.invId = invId;
    }

    public VpCvInv(String invId, String cvMastId, String invNbr, Date invDt, BigDecimal invAmt, String sfInvUid, String mdyUsr, Date mdyTs, String crtUsr, Date crtTs) {
        this.invId = invId;
        this.cvMastId = cvMastId;
        this.invNbr = invNbr;
        this.invDt = invDt;
        this.invAmt = invAmt;
        this.sfInvUid = sfInvUid;
        this.mdyUsr = mdyUsr;
        this.mdyTs = mdyTs;
        this.crtUsr = crtUsr;
        this.crtTs = crtTs;
    }

    public String getInvId() {
        return invId;
    }

    public void setInvId(String invId) {
        this.invId = invId;
    }

    public String getCvMastId() {
        return cvMastId;
    }

    public void setCvMastId(String cvMastId) {
        this.cvMastId = cvMastId;
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

    public BigDecimal getInvAmt() {
        return invAmt;
    }

    public void setInvAmt(BigDecimal invAmt) {
        this.invAmt = invAmt;
    }

    public String getSfInvUid() {
        return sfInvUid;
    }

    public void setSfInvUid(String sfInvUid) {
        this.sfInvUid = sfInvUid;
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
        hash += (invId != null ? invId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof VpCvInv)) {
            return false;
        }
        VpCvInv other = (VpCvInv) object;
        if ((this.invId == null && other.invId != null) || (this.invId != null && !this.invId.equals(other.invId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.VpCvInv[ invId=" + invId + " ]";
    }

}
