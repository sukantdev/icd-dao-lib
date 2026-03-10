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
@Table(name = "AVN_TRNS_HDR", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "AvnTrnsHdr.findAll", query = "SELECT a FROM AvnTrnsHdr a")})
public class AvnTrnsHdr implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "TRNS_TRKG_NBR")
    private Integer trnsTrkgNbr;
    @Basic(optional = false)
    @Column(name = "TRNS_STAT")
    private Character trnsStat;
    @Basic(optional = false)
    @Column(name = "SUBMISSION_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date submissionTs;
    @Basic(optional = false)
    @Column(name = "CRD_NBR")
    private String crdNbr;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "TRNS_TL_AMT")
    private BigDecimal trnsTlAmt;
    @Basic(optional = false)
    @Column(name = "FBO_MRCH_CD")
    private String fboMrchCd;
    @Basic(optional = false)
    @Column(name = "FC_MRCH_CD")
    private String fcMrchCd;
    @Basic(optional = false)
    @Column(name = "PSTD_AIRFIELD_PRC")
    private BigDecimal pstdAirfieldPrc;
    @Basic(optional = false)
    @Column(name = "FC_PRC")
    private BigDecimal fcPrc;
    @Basic(optional = false)
    @Column(name = "TAIL_NBR")
    private String tailNbr;
    @Basic(optional = false)
    @Column(name = "TRIP_NBR")
    private String tripNbr;
    @Basic(optional = false)
    @Column(name = "TRIP_LEG_ID")
    private String tripLegId;
    @Basic(optional = false)
    @Column(name = "FL_REPRICE_IND")
    private Character flRepriceInd;
    @Basic(optional = false)
    @Column(name = "FBO_SRV_REP")
    private String fboSrvRep;
    @Basic(optional = false)
    @Column(name = "MRCH_CUST_ID")
    private String mrchCustId;
    @Basic(optional = false)
    @Column(name = "MRCH_TRNS_ID")
    private String mrchTrnsId;
    @Basic(optional = false)
    @Column(name = "CUST_PCHS_ORD_NBR")
    private String custPchsOrdNbr;
    @Basic(optional = false)
    @Column(name = "CREW_MEMBER_ID")
    private String crewMemberId;
    @Basic(optional = false)
    @Column(name = "COMMENTS")
    private String comments;
    @Basic(optional = false)
    @Column(name = "CANCEL_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date cancelTs;
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
    @Column(name = "MRCH_INV_NBR")
    private String mrchInvNbr;
    @Basic(optional = false)
    @Column(name = "TRNS_ORIG_CD")
    private int trnsOrigCd;

    public AvnTrnsHdr() {
    }

    public AvnTrnsHdr(Integer trnsTrkgNbr) {
        this.trnsTrkgNbr = trnsTrkgNbr;
    }

    public AvnTrnsHdr(Integer trnsTrkgNbr, Character trnsStat, Date submissionTs, String crdNbr, BigDecimal trnsTlAmt, String fboMrchCd, String fcMrchCd, BigDecimal pstdAirfieldPrc, BigDecimal fcPrc, String tailNbr, String tripNbr, String tripLegId, Character flRepriceInd, String fboSrvRep, String mrchCustId, String mrchTrnsId, String custPchsOrdNbr, String crewMemberId, String comments, Date cancelTs, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr, String mrchInvNbr, int trnsOrigCd) {
        this.trnsTrkgNbr = trnsTrkgNbr;
        this.trnsStat = trnsStat;
        this.submissionTs = submissionTs;
        this.crdNbr = crdNbr;
        this.trnsTlAmt = trnsTlAmt;
        this.fboMrchCd = fboMrchCd;
        this.fcMrchCd = fcMrchCd;
        this.pstdAirfieldPrc = pstdAirfieldPrc;
        this.fcPrc = fcPrc;
        this.tailNbr = tailNbr;
        this.tripNbr = tripNbr;
        this.tripLegId = tripLegId;
        this.flRepriceInd = flRepriceInd;
        this.fboSrvRep = fboSrvRep;
        this.mrchCustId = mrchCustId;
        this.mrchTrnsId = mrchTrnsId;
        this.custPchsOrdNbr = custPchsOrdNbr;
        this.crewMemberId = crewMemberId;
        this.comments = comments;
        this.cancelTs = cancelTs;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
        this.mrchInvNbr = mrchInvNbr;
        this.trnsOrigCd = trnsOrigCd;
    }

    public Integer getTrnsTrkgNbr() {
        return trnsTrkgNbr;
    }

    public void setTrnsTrkgNbr(Integer trnsTrkgNbr) {
        this.trnsTrkgNbr = trnsTrkgNbr;
    }

    public Character getTrnsStat() {
        return trnsStat;
    }

    public void setTrnsStat(Character trnsStat) {
        this.trnsStat = trnsStat;
    }

    public Date getSubmissionTs() {
        return submissionTs;
    }

    public void setSubmissionTs(Date submissionTs) {
        this.submissionTs = submissionTs;
    }

    public String getCrdNbr() {
        return crdNbr;
    }

    public void setCrdNbr(String crdNbr) {
        this.crdNbr = crdNbr;
    }

    public BigDecimal getTrnsTlAmt() {
        return trnsTlAmt;
    }

    public void setTrnsTlAmt(BigDecimal trnsTlAmt) {
        this.trnsTlAmt = trnsTlAmt;
    }

    public String getFboMrchCd() {
        return fboMrchCd;
    }

    public void setFboMrchCd(String fboMrchCd) {
        this.fboMrchCd = fboMrchCd;
    }

    public String getFcMrchCd() {
        return fcMrchCd;
    }

    public void setFcMrchCd(String fcMrchCd) {
        this.fcMrchCd = fcMrchCd;
    }

    public BigDecimal getPstdAirfieldPrc() {
        return pstdAirfieldPrc;
    }

    public void setPstdAirfieldPrc(BigDecimal pstdAirfieldPrc) {
        this.pstdAirfieldPrc = pstdAirfieldPrc;
    }

    public BigDecimal getFcPrc() {
        return fcPrc;
    }

    public void setFcPrc(BigDecimal fcPrc) {
        this.fcPrc = fcPrc;
    }

    public String getTailNbr() {
        return tailNbr;
    }

    public void setTailNbr(String tailNbr) {
        this.tailNbr = tailNbr;
    }

    public String getTripNbr() {
        return tripNbr;
    }

    public void setTripNbr(String tripNbr) {
        this.tripNbr = tripNbr;
    }

    public String getTripLegId() {
        return tripLegId;
    }

    public void setTripLegId(String tripLegId) {
        this.tripLegId = tripLegId;
    }

    public Character getFlRepriceInd() {
        return flRepriceInd;
    }

    public void setFlRepriceInd(Character flRepriceInd) {
        this.flRepriceInd = flRepriceInd;
    }

    public String getFboSrvRep() {
        return fboSrvRep;
    }

    public void setFboSrvRep(String fboSrvRep) {
        this.fboSrvRep = fboSrvRep;
    }

    public String getMrchCustId() {
        return mrchCustId;
    }

    public void setMrchCustId(String mrchCustId) {
        this.mrchCustId = mrchCustId;
    }

    public String getMrchTrnsId() {
        return mrchTrnsId;
    }

    public void setMrchTrnsId(String mrchTrnsId) {
        this.mrchTrnsId = mrchTrnsId;
    }

    public String getCustPchsOrdNbr() {
        return custPchsOrdNbr;
    }

    public void setCustPchsOrdNbr(String custPchsOrdNbr) {
        this.custPchsOrdNbr = custPchsOrdNbr;
    }

    public String getCrewMemberId() {
        return crewMemberId;
    }

    public void setCrewMemberId(String crewMemberId) {
        this.crewMemberId = crewMemberId;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public Date getCancelTs() {
        return cancelTs;
    }

    public void setCancelTs(Date cancelTs) {
        this.cancelTs = cancelTs;
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

    public String getMrchInvNbr() {
        return mrchInvNbr;
    }

    public void setMrchInvNbr(String mrchInvNbr) {
        this.mrchInvNbr = mrchInvNbr;
    }

    public int getTrnsOrigCd() {
        return trnsOrigCd;
    }

    public void setTrnsOrigCd(int trnsOrigCd) {
        this.trnsOrigCd = trnsOrigCd;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (trnsTrkgNbr != null ? trnsTrkgNbr.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AvnTrnsHdr)) {
            return false;
        }
        AvnTrnsHdr other = (AvnTrnsHdr) object;
        if ((this.trnsTrkgNbr == null && other.trnsTrkgNbr != null) || (this.trnsTrkgNbr != null && !this.trnsTrkgNbr.equals(other.trnsTrkgNbr))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.AvnTrnsHdr[ trnsTrkgNbr=" + trnsTrkgNbr + " ]";
    }
    
}
