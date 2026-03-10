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
@Table(name = "ACCT_PYMT_HIST", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "AcctPymtHist.findAll", query = "SELECT a FROM AcctPymtHist a")})
public class AcctPymtHist implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected AcctPymtHistPK acctPymtHistPK;
    @Basic(optional = false)
    @Column(name = "PH_PYMT_NBR")
    private String phPymtNbr;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "PH_PYMT_AMT")
    private BigDecimal phPymtAmt;
    @Basic(optional = false)
    @Column(name = "PH_PYMT_SRC_CD")
    private String phPymtSrcCd;
    @Basic(optional = false)
    @Column(name = "PH_PYMT_SRC_NM")
    private String phPymtSrcNm;
    @Basic(optional = false)
    @Column(name = "PH_AR_CO_CD")
    private String phArCoCd;
    @Basic(optional = false)
    @Column(name = "PH_SYS_ID_CD")
    private Character phSysIdCd;
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

    public AcctPymtHist() {
    }

    public AcctPymtHist(AcctPymtHistPK acctPymtHistPK) {
        this.acctPymtHistPK = acctPymtHistPK;
    }

    public AcctPymtHist(AcctPymtHistPK acctPymtHistPK, String phPymtNbr, BigDecimal phPymtAmt, String phPymtSrcCd, String phPymtSrcNm, String phArCoCd, Character phSysIdCd, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.acctPymtHistPK = acctPymtHistPK;
        this.phPymtNbr = phPymtNbr;
        this.phPymtAmt = phPymtAmt;
        this.phPymtSrcCd = phPymtSrcCd;
        this.phPymtSrcNm = phPymtSrcNm;
        this.phArCoCd = phArCoCd;
        this.phSysIdCd = phSysIdCd;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public AcctPymtHist(String phAcctCd, Date phPymtDt, int phPymtDtSeqNbr) {
        this.acctPymtHistPK = new AcctPymtHistPK(phAcctCd, phPymtDt, phPymtDtSeqNbr);
    }

    public AcctPymtHistPK getAcctPymtHistPK() {
        return acctPymtHistPK;
    }

    public void setAcctPymtHistPK(AcctPymtHistPK acctPymtHistPK) {
        this.acctPymtHistPK = acctPymtHistPK;
    }

    public String getPhPymtNbr() {
        return phPymtNbr;
    }

    public void setPhPymtNbr(String phPymtNbr) {
        this.phPymtNbr = phPymtNbr;
    }

    public BigDecimal getPhPymtAmt() {
        return phPymtAmt;
    }

    public void setPhPymtAmt(BigDecimal phPymtAmt) {
        this.phPymtAmt = phPymtAmt;
    }

    public String getPhPymtSrcCd() {
        return phPymtSrcCd;
    }

    public void setPhPymtSrcCd(String phPymtSrcCd) {
        this.phPymtSrcCd = phPymtSrcCd;
    }

    public String getPhPymtSrcNm() {
        return phPymtSrcNm;
    }

    public void setPhPymtSrcNm(String phPymtSrcNm) {
        this.phPymtSrcNm = phPymtSrcNm;
    }

    public String getPhArCoCd() {
        return phArCoCd;
    }

    public void setPhArCoCd(String phArCoCd) {
        this.phArCoCd = phArCoCd;
    }

    public Character getPhSysIdCd() {
        return phSysIdCd;
    }

    public void setPhSysIdCd(Character phSysIdCd) {
        this.phSysIdCd = phSysIdCd;
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
        hash += (acctPymtHistPK != null ? acctPymtHistPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AcctPymtHist)) {
            return false;
        }
        AcctPymtHist other = (AcctPymtHist) object;
        if ((this.acctPymtHistPK == null && other.acctPymtHistPK != null) || (this.acctPymtHistPK != null && !this.acctPymtHistPK.equals(other.acctPymtHistPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.AcctPymtHist[ acctPymtHistPK=" + acctPymtHistPK + " ]";
    }
    
}
