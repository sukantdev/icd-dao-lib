/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
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
@Table(name = "MT_FUNDING_FILE", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "MtFundingFile.findAll", query = "SELECT m FROM MtFundingFile m")})
public class MtFundingFile implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected MtFundingFilePK mtFundingFilePK;
    @Basic(optional = false)
    @Column(name = "ENTRY_METH")
    private Character entryMeth;
    @Basic(optional = false)
    @Column(name = "DEB_CR_IND")
    private Character debCrInd;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "AMT")
    private BigDecimal amt;
    @Basic(optional = false)
    @Column(name = "CORP_CD")
    private String corpCd;
    @Basic(optional = false)
    @Column(name = "CRD_NBR")
    private String crdNbr;
    @Basic(optional = false)
    @Column(name = "UT_DT")
    @Temporal(TemporalType.DATE)
    private Date utDt;
    @Basic(optional = false)
    @Column(name = "APPROV_CD")
    private String approvCd;
    @Basic(optional = false)
    @Column(name = "AUTH_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date authTs;
    @Basic(optional = false)
    @Column(name = "RPTNG_CRD_NBR")
    private String rptngCrdNbr;
    @Basic(optional = false)
    @Column(name = "TRNS_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date trnsTs;
    @Basic(optional = false)
    @Column(name = "POST_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date postTs;
    @Basic(optional = false)
    @Column(name = "MCC")
    private String mcc;
    @Basic(optional = false)
    @Column(name = "MCC_DESC")
    private String mccDesc;
    @Basic(optional = false)
    @Column(name = "ACCEPT_LOC")
    private String acceptLoc;
    @Basic(optional = false)
    @Column(name = "INV_NO")
    private String invNo;
    @Basic(optional = false)
    @Column(name = "INV_DT")
    @Temporal(TemporalType.DATE)
    private Date invDt;
    @Basic(optional = false)
    @Column(name = "DUE_DT")
    @Temporal(TemporalType.DATE)
    private Date dueDt;
    @Basic(optional = false)
    @Column(name = "INV_COMMNT")
    private String invCommnt;
    @Basic(optional = false)
    @Column(name = "PMT_DT")
    @Temporal(TemporalType.DATE)
    private Date pmtDt;
    @Basic(optional = false)
    @Column(name = "PMT_NO")
    private String pmtNo;
    @Basic(optional = false)
    @Column(name = "CRD_AMT")
    private BigDecimal crdAmt;
    @Basic(optional = false)
    @Column(name = "VRTL_CRD_INV_NBR")
    private String vrtlCrdInvNbr;
    @Basic(optional = false)
    @Column(name = "GL_CD")
    private String glCd;
    @Basic(optional = false)
    @Column(name = "DISCRET_1")
    private String discret1;
    @Basic(optional = false)
    @Column(name = "DISCRET_2")
    private String discret2;
    @Basic(optional = false)
    @Column(name = "DISCRET_3")
    private String discret3;
    @Basic(optional = false)
    @Column(name = "TKN_IND")
    private Character tknInd;
    @Basic(optional = false)
    @Column(name = "CRD_TKN_NBR")
    private String crdTknNbr;
    @Basic(optional = false)
    @Column(name = "CRD_ISS_DT")
    @Temporal(TemporalType.DATE)
    private Date crdIssDt;
    @Basic(optional = false)
    @Column(name = "DESC")
    private String desc;
    @Basic(optional = false)
    @Column(name = "CDN_NOTES")
    private String cdnNotes;
    @Basic(optional = false)
    @Column(name = "MANUAL_DESC")
    private String manualDesc;
    @Basic(optional = false)
    @Column(name = "PS14_DESCRET")
    private String ps14Descret;
    @Basic(optional = false)
    @Column(name = "PS14_TRACKING_NBR")
    private String ps14TrackingNbr;
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
    @Column(name = "SRC_ACCT_NBR")
    private String srcAcctNbr;
    @Basic(optional = false)
    @Column(name = "ROW_CHG_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date rowChgTs;

    public MtFundingFile() {
    }

    public MtFundingFile(MtFundingFilePK mtFundingFilePK) {
        this.mtFundingFilePK = mtFundingFilePK;
    }

    public MtFundingFile(MtFundingFilePK mtFundingFilePK, Character entryMeth, Character debCrInd, BigDecimal amt, String corpCd, String crdNbr, Date utDt, String approvCd, Date authTs, String rptngCrdNbr, Date trnsTs, Date postTs, String mcc, String mccDesc, String acceptLoc, String invNo, Date invDt, Date dueDt, String invCommnt, Date pmtDt, String pmtNo, BigDecimal crdAmt, String vrtlCrdInvNbr, String glCd, String discret1, String discret2, String discret3, Character tknInd, String crdTknNbr, Date crdIssDt, String desc, String cdnNotes, String manualDesc, String ps14Descret, String ps14TrackingNbr, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr, String srcAcctNbr, Date rowChgTs) {
        this.mtFundingFilePK = mtFundingFilePK;
        this.entryMeth = entryMeth;
        this.debCrInd = debCrInd;
        this.amt = amt;
        this.corpCd = corpCd;
        this.crdNbr = crdNbr;
        this.utDt = utDt;
        this.approvCd = approvCd;
        this.authTs = authTs;
        this.rptngCrdNbr = rptngCrdNbr;
        this.trnsTs = trnsTs;
        this.postTs = postTs;
        this.mcc = mcc;
        this.mccDesc = mccDesc;
        this.acceptLoc = acceptLoc;
        this.invNo = invNo;
        this.invDt = invDt;
        this.dueDt = dueDt;
        this.invCommnt = invCommnt;
        this.pmtDt = pmtDt;
        this.pmtNo = pmtNo;
        this.crdAmt = crdAmt;
        this.vrtlCrdInvNbr = vrtlCrdInvNbr;
        this.glCd = glCd;
        this.discret1 = discret1;
        this.discret2 = discret2;
        this.discret3 = discret3;
        this.tknInd = tknInd;
        this.crdTknNbr = crdTknNbr;
        this.crdIssDt = crdIssDt;
        this.desc = desc;
        this.cdnNotes = cdnNotes;
        this.manualDesc = manualDesc;
        this.ps14Descret = ps14Descret;
        this.ps14TrackingNbr = ps14TrackingNbr;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
        this.srcAcctNbr = srcAcctNbr;
        this.rowChgTs = rowChgTs;
    }

    public MtFundingFile(String acctNbr, String custNbr, String trnsTyp, int fileNbr, int seqNo) {
        this.mtFundingFilePK = new MtFundingFilePK(acctNbr, custNbr, trnsTyp, fileNbr, seqNo);
    }

    public MtFundingFilePK getMtFundingFilePK() {
        return mtFundingFilePK;
    }

    public void setMtFundingFilePK(MtFundingFilePK mtFundingFilePK) {
        this.mtFundingFilePK = mtFundingFilePK;
    }

    public Character getEntryMeth() {
        return entryMeth;
    }

    public void setEntryMeth(Character entryMeth) {
        this.entryMeth = entryMeth;
    }

    public Character getDebCrInd() {
        return debCrInd;
    }

    public void setDebCrInd(Character debCrInd) {
        this.debCrInd = debCrInd;
    }

    public BigDecimal getAmt() {
        return amt;
    }

    public void setAmt(BigDecimal amt) {
        this.amt = amt;
    }

    public String getCorpCd() {
        return corpCd;
    }

    public void setCorpCd(String corpCd) {
        this.corpCd = corpCd;
    }

    public String getCrdNbr() {
        return crdNbr;
    }

    public void setCrdNbr(String crdNbr) {
        this.crdNbr = crdNbr;
    }

    public Date getUtDt() {
        return utDt;
    }

    public void setUtDt(Date utDt) {
        this.utDt = utDt;
    }

    public String getApprovCd() {
        return approvCd;
    }

    public void setApprovCd(String approvCd) {
        this.approvCd = approvCd;
    }

    public Date getAuthTs() {
        return authTs;
    }

    public void setAuthTs(Date authTs) {
        this.authTs = authTs;
    }

    public String getRptngCrdNbr() {
        return rptngCrdNbr;
    }

    public void setRptngCrdNbr(String rptngCrdNbr) {
        this.rptngCrdNbr = rptngCrdNbr;
    }

    public Date getTrnsTs() {
        return trnsTs;
    }

    public void setTrnsTs(Date trnsTs) {
        this.trnsTs = trnsTs;
    }

    public Date getPostTs() {
        return postTs;
    }

    public void setPostTs(Date postTs) {
        this.postTs = postTs;
    }

    public String getMcc() {
        return mcc;
    }

    public void setMcc(String mcc) {
        this.mcc = mcc;
    }

    public String getMccDesc() {
        return mccDesc;
    }

    public void setMccDesc(String mccDesc) {
        this.mccDesc = mccDesc;
    }

    public String getAcceptLoc() {
        return acceptLoc;
    }

    public void setAcceptLoc(String acceptLoc) {
        this.acceptLoc = acceptLoc;
    }

    public String getInvNo() {
        return invNo;
    }

    public void setInvNo(String invNo) {
        this.invNo = invNo;
    }

    public Date getInvDt() {
        return invDt;
    }

    public void setInvDt(Date invDt) {
        this.invDt = invDt;
    }

    public Date getDueDt() {
        return dueDt;
    }

    public void setDueDt(Date dueDt) {
        this.dueDt = dueDt;
    }

    public String getInvCommnt() {
        return invCommnt;
    }

    public void setInvCommnt(String invCommnt) {
        this.invCommnt = invCommnt;
    }

    public Date getPmtDt() {
        return pmtDt;
    }

    public void setPmtDt(Date pmtDt) {
        this.pmtDt = pmtDt;
    }

    public String getPmtNo() {
        return pmtNo;
    }

    public void setPmtNo(String pmtNo) {
        this.pmtNo = pmtNo;
    }

    public BigDecimal getCrdAmt() {
        return crdAmt;
    }

    public void setCrdAmt(BigDecimal crdAmt) {
        this.crdAmt = crdAmt;
    }

    public String getVrtlCrdInvNbr() {
        return vrtlCrdInvNbr;
    }

    public void setVrtlCrdInvNbr(String vrtlCrdInvNbr) {
        this.vrtlCrdInvNbr = vrtlCrdInvNbr;
    }

    public String getGlCd() {
        return glCd;
    }

    public void setGlCd(String glCd) {
        this.glCd = glCd;
    }

    public String getDiscret1() {
        return discret1;
    }

    public void setDiscret1(String discret1) {
        this.discret1 = discret1;
    }

    public String getDiscret2() {
        return discret2;
    }

    public void setDiscret2(String discret2) {
        this.discret2 = discret2;
    }

    public String getDiscret3() {
        return discret3;
    }

    public void setDiscret3(String discret3) {
        this.discret3 = discret3;
    }

    public Character getTknInd() {
        return tknInd;
    }

    public void setTknInd(Character tknInd) {
        this.tknInd = tknInd;
    }

    public String getCrdTknNbr() {
        return crdTknNbr;
    }

    public void setCrdTknNbr(String crdTknNbr) {
        this.crdTknNbr = crdTknNbr;
    }

    public Date getCrdIssDt() {
        return crdIssDt;
    }

    public void setCrdIssDt(Date crdIssDt) {
        this.crdIssDt = crdIssDt;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getCdnNotes() {
        return cdnNotes;
    }

    public void setCdnNotes(String cdnNotes) {
        this.cdnNotes = cdnNotes;
    }

    public String getManualDesc() {
        return manualDesc;
    }

    public void setManualDesc(String manualDesc) {
        this.manualDesc = manualDesc;
    }

    public String getPs14Descret() {
        return ps14Descret;
    }

    public void setPs14Descret(String ps14Descret) {
        this.ps14Descret = ps14Descret;
    }

    public String getPs14TrackingNbr() {
        return ps14TrackingNbr;
    }

    public void setPs14TrackingNbr(String ps14TrackingNbr) {
        this.ps14TrackingNbr = ps14TrackingNbr;
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

    public String getSrcAcctNbr() {
        return srcAcctNbr;
    }

    public void setSrcAcctNbr(String srcAcctNbr) {
        this.srcAcctNbr = srcAcctNbr;
    }

    public Date getRowChgTs() {
        return rowChgTs;
    }

    public void setRowChgTs(Date rowChgTs) {
        this.rowChgTs = rowChgTs;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mtFundingFilePK != null ? mtFundingFilePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MtFundingFile)) {
            return false;
        }
        MtFundingFile other = (MtFundingFile) object;
        if ((this.mtFundingFilePK == null && other.mtFundingFilePK != null) || (this.mtFundingFilePK != null && !this.mtFundingFilePK.equals(other.mtFundingFilePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.MtFundingFile[ mtFundingFilePK=" + mtFundingFilePK + " ]";
    }
    
}
