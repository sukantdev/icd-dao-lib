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
@Table(name = "RB_BILL_SCHED", catalog = "", schema = "DBO")
public class RbBillSched implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "SUB_PHSE_ID")
    private Long subPhseId;
    @Basic(optional = false)
    @Column(name = "BILL_PD_ID")
    private long billPdId;

    @Basic(optional = false)
    @Column(name = "BILL_AMT")
    private BigDecimal billAmt;
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
    @JoinColumn(name = "SUB_PHSE_ID", referencedColumnName = "SUB_PHSE_ID", insertable = false, updatable = false)
    @OneToOne(optional = false, fetch = FetchType.LAZY)
    private RbSubsPhase rbSubsPhase;

    public RbBillSched() {
    }

    public RbBillSched(Long subPhseId) {
        this.subPhseId = subPhseId;
    }

    public RbBillSched(Long subPhseId, long billPdId, BigDecimal billAmt, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.subPhseId = subPhseId;
        this.billPdId = billPdId;
        this.billAmt = billAmt;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public Long getSubPhseId() {
        return subPhseId;
    }

    public void setSubPhseId(Long subPhseId) {
        this.subPhseId = subPhseId;
    }

    public long getBillPdId() {
        return billPdId;
    }

    public void setBillPdId(long billPdId) {
        this.billPdId = billPdId;
    }

    public BigDecimal getBillAmt() {
        return billAmt;
    }

    public void setBillAmt(BigDecimal billAmt) {
        this.billAmt = billAmt;
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

    public RbSubsPhase getRbSubsPhase() {
        return rbSubsPhase;
    }

    public void setRbSubsPhase(RbSubsPhase rbSubsPhase) {
        this.rbSubsPhase = rbSubsPhase;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (subPhseId != null ? subPhseId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof RbBillSched)) {
            return false;
        }
        RbBillSched other = (RbBillSched) object;
        if ((this.subPhseId == null && other.subPhseId != null) || (this.subPhseId != null && !this.subPhseId.equals(other.subPhseId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.RbBillSched[ subPhseId=" + subPhseId + " ]";
    }

}
