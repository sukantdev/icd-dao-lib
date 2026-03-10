/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
@Table(name = "FUND_ACCOUNT", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "FundAccount.findAll", query = "SELECT f FROM FundAccount f")})
public class FundAccount implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "FND_ACCT_ID")
    private String fndAcctId;
    @Basic(optional = false)
    @Column(name = "RTNG_NBR")
    private String rtngNbr;
    @Basic(optional = false)
    @Column(name = "ACCT_NBR")
    private String acctNbr;
    @Basic(optional = false)
    @Column(name = "ACCT_NM")
    private String acctNm;
    @Basic(optional = false)
    @Column(name = "APPRVD_FLG")
    private Character apprvdFlg;
    @Basic(optional = false)
    @Column(name = "CURR_CD")
    private String currCd;
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
    @JoinColumn(name = "FND_INSTTN_ID", referencedColumnName = "FND_INSTTN_ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private FundInstitution fndInsttnId;
    @JoinColumn(name = "USR_COMP_ID", referencedColumnName = "USR_COMP_ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private UsrComp usrCompId;

    public FundAccount() {
    }

    public FundAccount(String fndAcctId) {
        this.fndAcctId = fndAcctId;
    }

    public FundAccount(String fndAcctId, String rtngNbr, String acctNbr, String acctNm, Character apprvdFlg, String currCd, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.fndAcctId = fndAcctId;
        this.rtngNbr = rtngNbr;
        this.acctNbr = acctNbr;
        this.acctNm = acctNm;
        this.apprvdFlg = apprvdFlg;
        this.currCd = currCd;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public String getFndAcctId() {
        return fndAcctId;
    }

    public void setFndAcctId(String fndAcctId) {
        this.fndAcctId = fndAcctId;
    }

    public String getRtngNbr() {
        return rtngNbr;
    }

    public void setRtngNbr(String rtngNbr) {
        this.rtngNbr = rtngNbr;
    }

    public String getAcctNbr() {
        return acctNbr;
    }

    public void setAcctNbr(String acctNbr) {
        this.acctNbr = acctNbr;
    }

    public String getAcctNm() {
        return acctNm;
    }

    public void setAcctNm(String acctNm) {
        this.acctNm = acctNm;
    }

    public Character getApprvdFlg() {
        return apprvdFlg;
    }

    public void setApprvdFlg(Character apprvdFlg) {
        this.apprvdFlg = apprvdFlg;
    }

    public String getCurrCd() {
        return currCd;
    }

    public void setCurrCd(String currCd) {
        this.currCd = currCd;
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

    public FundInstitution getFndInsttnId() {
        return fndInsttnId;
    }

    public void setFndInsttnId(FundInstitution fndInsttnId) {
        this.fndInsttnId = fndInsttnId;
    }

    public UsrComp getUsrCompId() {
        return usrCompId;
    }

    public void setUsrCompId(UsrComp usrCompId) {
        this.usrCompId = usrCompId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (fndAcctId != null ? fndAcctId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FundAccount)) {
            return false;
        }
        FundAccount other = (FundAccount) object;
        if ((this.fndAcctId == null && other.fndAcctId != null) || (this.fndAcctId != null && !this.fndAcctId.equals(other.fndAcctId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.FundAccount[ fndAcctId=" + fndAcctId + " ]";
    }
    
}
