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
import java.util.Date;

/**
 *
 * @author Sukant.Tiwari
 */
@Entity
@Table(name = "CRD_ACCESS_LOG", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "CrdAccessLog.findAll", query = "SELECT c FROM CrdAccessLog c")})
public class CrdAccessLog implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CrdAccessLogPK crdAccessLogPK;
    @Basic(optional = false)
    @Column(name = "TRAN_ID")
    private String tranId;
    @Basic(optional = false)
    @Column(name = "APP_ID")
    private String appId;
    @Basic(optional = false)
    @Column(name = "TERM_ID")
    private String termId;
    @Basic(optional = false)
    @Column(name = "MASKED_CRD_NBR")
    private String maskedCrdNbr;
    @Basic(optional = false)
    @Column(name = "CRD_TKN_NBR")
    private String crdTknNbr;
    @Basic(optional = false)
    @Column(name = "CUST_ID")
    private String custId;
    @Basic(optional = false)
    @Column(name = "ACCT_CD")
    private String acctCd;
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

    public CrdAccessLog() {
    }

    public CrdAccessLog(CrdAccessLogPK crdAccessLogPK) {
        this.crdAccessLogPK = crdAccessLogPK;
    }

    public CrdAccessLog(CrdAccessLogPK crdAccessLogPK, String tranId, String appId, String termId, String maskedCrdNbr, String crdTknNbr, String custId, String acctCd, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.crdAccessLogPK = crdAccessLogPK;
        this.tranId = tranId;
        this.appId = appId;
        this.termId = termId;
        this.maskedCrdNbr = maskedCrdNbr;
        this.crdTknNbr = crdTknNbr;
        this.custId = custId;
        this.acctCd = acctCd;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public CrdAccessLog(Date accessTs, String usrId, int seqNbr) {
        this.crdAccessLogPK = new CrdAccessLogPK(accessTs, usrId, seqNbr);
    }

    public CrdAccessLogPK getCrdAccessLogPK() {
        return crdAccessLogPK;
    }

    public void setCrdAccessLogPK(CrdAccessLogPK crdAccessLogPK) {
        this.crdAccessLogPK = crdAccessLogPK;
    }

    public String getTranId() {
        return tranId;
    }

    public void setTranId(String tranId) {
        this.tranId = tranId;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getTermId() {
        return termId;
    }

    public void setTermId(String termId) {
        this.termId = termId;
    }

    public String getMaskedCrdNbr() {
        return maskedCrdNbr;
    }

    public void setMaskedCrdNbr(String maskedCrdNbr) {
        this.maskedCrdNbr = maskedCrdNbr;
    }

    public String getCrdTknNbr() {
        return crdTknNbr;
    }

    public void setCrdTknNbr(String crdTknNbr) {
        this.crdTknNbr = crdTknNbr;
    }

    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId;
    }

    public String getAcctCd() {
        return acctCd;
    }

    public void setAcctCd(String acctCd) {
        this.acctCd = acctCd;
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
        hash += (crdAccessLogPK != null ? crdAccessLogPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CrdAccessLog)) {
            return false;
        }
        CrdAccessLog other = (CrdAccessLog) object;
        if ((this.crdAccessLogPK == null && other.crdAccessLogPK != null) || (this.crdAccessLogPK != null && !this.crdAccessLogPK.equals(other.crdAccessLogPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.CrdAccessLog[ crdAccessLogPK=" + crdAccessLogPK + " ]";
    }
    
}
