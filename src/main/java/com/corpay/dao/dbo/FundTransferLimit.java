package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "FUND_TRANSFER_LIMIT", catalog = "", schema = "DBO")
public class FundTransferLimit implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "FND_TRNSFR_LMT_ID")
    private String fndTrnsfrLmtId;

    @Basic(optional = false)
    @Column(name = "PMT_AMT_MULT")
    private BigDecimal pmtAmtMult;
    @Basic(optional = false)
    @Column(name = "DLY_LMT_AMT")
    private BigDecimal dlyLmtAmt;
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

    public FundTransferLimit() {
    }

    public FundTransferLimit(String fndTrnsfrLmtId) {
        this.fndTrnsfrLmtId = fndTrnsfrLmtId;
    }

    public FundTransferLimit(String fndTrnsfrLmtId, BigDecimal pmtAmtMult, BigDecimal dlyLmtAmt, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.fndTrnsfrLmtId = fndTrnsfrLmtId;
        this.pmtAmtMult = pmtAmtMult;
        this.dlyLmtAmt = dlyLmtAmt;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public String getFndTrnsfrLmtId() {
        return fndTrnsfrLmtId;
    }

    public void setFndTrnsfrLmtId(String fndTrnsfrLmtId) {
        this.fndTrnsfrLmtId = fndTrnsfrLmtId;
    }

    public BigDecimal getPmtAmtMult() {
        return pmtAmtMult;
    }

    public void setPmtAmtMult(BigDecimal pmtAmtMult) {
        this.pmtAmtMult = pmtAmtMult;
    }

    public BigDecimal getDlyLmtAmt() {
        return dlyLmtAmt;
    }

    public void setDlyLmtAmt(BigDecimal dlyLmtAmt) {
        this.dlyLmtAmt = dlyLmtAmt;
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
        hash += (fndTrnsfrLmtId != null ? fndTrnsfrLmtId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof FundTransferLimit)) {
            return false;
        }
        FundTransferLimit other = (FundTransferLimit) object;
        if ((this.fndTrnsfrLmtId == null && other.fndTrnsfrLmtId != null) || (this.fndTrnsfrLmtId != null && !this.fndTrnsfrLmtId.equals(other.fndTrnsfrLmtId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.FundTransferLimit[ fndTrnsfrLmtId=" + fndTrnsfrLmtId + " ]";
    }

}
