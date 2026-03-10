/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author Sukant.Tiwari
 */
@Entity
@Table(name = "VP_P4U_INVOICES", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "VpP4uInvoices.findAll", query = "SELECT v FROM VpP4uInvoices v")})
public class VpP4uInvoices implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "SF_INV_ID")
    private String sfInvId;
    @Basic(optional = false)
    @Column(name = "INV_NBR")
    private String invNbr;
    @Basic(optional = false)
    @Column(name = "SF_MDY_USR")
    private String sfMdyUsr;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "AMT_PAID")
    private BigDecimal amtPaid;
    @Basic(optional = false)
    @Column(name = "CRD_NBR")
    private String crdNbr;
    @Basic(optional = false)
    @Column(name = "COMPLETED_FLG")
    private Character completedFlg;
    @Basic(optional = false)
    @Column(name = "CREDITS")
    private BigDecimal credits;
    @Basic(optional = false)
    @Column(name = "GROSS_AMT")
    private BigDecimal grossAmt;
    @Basic(optional = false)
    @Column(name = "NET_AMT")
    private BigDecimal netAmt;
    @Basic(optional = false)
    @Column(name = "NOTES")
    private String notes;
    @Basic(optional = false)
    @Column(name = "TRACK_NBR")
    private String trackNbr;
    @Basic(optional = false)
    @Column(name = "PMT_REASON")
    private String pmtReason;
    @Basic(optional = false)
    @Column(name = "SB_ACCT_NBR")
    private String sbAcctNbr;
    @Basic(optional = false)
    @Column(name = "VC_INV_NBR")
    private String vcInvNbr;
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

    public VpP4uInvoices() {
    }

    public VpP4uInvoices(String sfInvId) {
        this.sfInvId = sfInvId;
    }

    public VpP4uInvoices(String sfInvId, String invNbr, String sfMdyUsr, BigDecimal amtPaid, String crdNbr, Character completedFlg, BigDecimal credits, BigDecimal grossAmt, BigDecimal netAmt, String notes, String trackNbr, String pmtReason, String sbAcctNbr, String vcInvNbr, String mdyUsr, Date mdyTs, String crtUsr, Date crtTs) {
        this.sfInvId = sfInvId;
        this.invNbr = invNbr;
        this.sfMdyUsr = sfMdyUsr;
        this.amtPaid = amtPaid;
        this.crdNbr = crdNbr;
        this.completedFlg = completedFlg;
        this.credits = credits;
        this.grossAmt = grossAmt;
        this.netAmt = netAmt;
        this.notes = notes;
        this.trackNbr = trackNbr;
        this.pmtReason = pmtReason;
        this.sbAcctNbr = sbAcctNbr;
        this.vcInvNbr = vcInvNbr;
        this.mdyUsr = mdyUsr;
        this.mdyTs = mdyTs;
        this.crtUsr = crtUsr;
        this.crtTs = crtTs;
    }

    public String getSfInvId() {
        return sfInvId;
    }

    public void setSfInvId(String sfInvId) {
        this.sfInvId = sfInvId;
    }

    public String getInvNbr() {
        return invNbr;
    }

    public void setInvNbr(String invNbr) {
        this.invNbr = invNbr;
    }

    public String getSfMdyUsr() {
        return sfMdyUsr;
    }

    public void setSfMdyUsr(String sfMdyUsr) {
        this.sfMdyUsr = sfMdyUsr;
    }

    public BigDecimal getAmtPaid() {
        return amtPaid;
    }

    public void setAmtPaid(BigDecimal amtPaid) {
        this.amtPaid = amtPaid;
    }

    public String getCrdNbr() {
        return crdNbr;
    }

    public void setCrdNbr(String crdNbr) {
        this.crdNbr = crdNbr;
    }

    public Character getCompletedFlg() {
        return completedFlg;
    }

    public void setCompletedFlg(Character completedFlg) {
        this.completedFlg = completedFlg;
    }

    public BigDecimal getCredits() {
        return credits;
    }

    public void setCredits(BigDecimal credits) {
        this.credits = credits;
    }

    public BigDecimal getGrossAmt() {
        return grossAmt;
    }

    public void setGrossAmt(BigDecimal grossAmt) {
        this.grossAmt = grossAmt;
    }

    public BigDecimal getNetAmt() {
        return netAmt;
    }

    public void setNetAmt(BigDecimal netAmt) {
        this.netAmt = netAmt;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getTrackNbr() {
        return trackNbr;
    }

    public void setTrackNbr(String trackNbr) {
        this.trackNbr = trackNbr;
    }

    public String getPmtReason() {
        return pmtReason;
    }

    public void setPmtReason(String pmtReason) {
        this.pmtReason = pmtReason;
    }

    public String getSbAcctNbr() {
        return sbAcctNbr;
    }

    public void setSbAcctNbr(String sbAcctNbr) {
        this.sbAcctNbr = sbAcctNbr;
    }

    public String getVcInvNbr() {
        return vcInvNbr;
    }

    public void setVcInvNbr(String vcInvNbr) {
        this.vcInvNbr = vcInvNbr;
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
        hash += (sfInvId != null ? sfInvId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof VpP4uInvoices)) {
            return false;
        }
        VpP4uInvoices other = (VpP4uInvoices) object;
        if ((this.sfInvId == null && other.sfInvId != null) || (this.sfInvId != null && !this.sfInvId.equals(other.sfInvId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.VpP4uInvoices[ sfInvId=" + sfInvId + " ]";
    }
    
}
