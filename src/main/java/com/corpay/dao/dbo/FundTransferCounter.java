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
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.OneToOne;
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
@Table(name = "FUND_TRANSFER_COUNTER", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "FundTransferCounter.findAll", query = "SELECT f FROM FundTransferCounter f")})
public class FundTransferCounter implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "FND_TRNSFR_CTR_ID")
    private String fndTrnsfrCtrId;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "DLY_AMT")
    private BigDecimal dlyAmt;
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
    @JoinColumn(name = "USR_COMP_ID", referencedColumnName = "USR_COMP_ID")
    @OneToOne(optional = false, fetch = FetchType.LAZY)
    private UsrComp usrCompId;

    public FundTransferCounter() {
    }

    public FundTransferCounter(String fndTrnsfrCtrId) {
        this.fndTrnsfrCtrId = fndTrnsfrCtrId;
    }

    public FundTransferCounter(String fndTrnsfrCtrId, BigDecimal dlyAmt, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.fndTrnsfrCtrId = fndTrnsfrCtrId;
        this.dlyAmt = dlyAmt;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public String getFndTrnsfrCtrId() {
        return fndTrnsfrCtrId;
    }

    public void setFndTrnsfrCtrId(String fndTrnsfrCtrId) {
        this.fndTrnsfrCtrId = fndTrnsfrCtrId;
    }

    public BigDecimal getDlyAmt() {
        return dlyAmt;
    }

    public void setDlyAmt(BigDecimal dlyAmt) {
        this.dlyAmt = dlyAmt;
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

    public UsrComp getUsrCompId() {
        return usrCompId;
    }

    public void setUsrCompId(UsrComp usrCompId) {
        this.usrCompId = usrCompId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (fndTrnsfrCtrId != null ? fndTrnsfrCtrId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FundTransferCounter)) {
            return false;
        }
        FundTransferCounter other = (FundTransferCounter) object;
        if ((this.fndTrnsfrCtrId == null && other.fndTrnsfrCtrId != null) || (this.fndTrnsfrCtrId != null && !this.fndTrnsfrCtrId.equals(other.fndTrnsfrCtrId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.FundTransferCounter[ fndTrnsfrCtrId=" + fndTrnsfrCtrId + " ]";
    }
    
}
