package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "INV_CYC_DTS", catalog = "", schema = "DBO")
public class InvCycDts implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected InvCycDtsPK invCycDtsPK;
    @Basic(optional = false)
    @Column(name = "PMT_DUE_DT")
    @Temporal(TemporalType.DATE)
    private Date pmtDueDt;
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
    @Column(name = "CAN_INV_AMT")
    private BigDecimal canInvAmt;
    @Basic(optional = false)
    @Column(name = "CAN_INV_AMT_DBCR_I")
    private Character canInvAmtDbcrI;
    @Basic(optional = false)
    @Column(name = "US_INV_BG_BAL")
    private BigDecimal usInvBgBal;
    @Basic(optional = false)
    @Column(name = "US_BG_BAL_DBCR_IND")
    private Character usBgBalDbcrInd;
    @Basic(optional = false)
    @Column(name = "CAN_INV_BG_BAL")
    private BigDecimal canInvBgBal;
    @Basic(optional = false)
    @Column(name = "CAN_BG_BAL_DBCR_I")
    private Character canBgBalDbcrI;
    @Basic(optional = false)
    @Column(name = "INV_AMT")
    private BigDecimal invAmt;
    @Basic(optional = false)
    @Column(name = "CR_OR_DB")
    private Character crOrDb;
    @Basic(optional = false)
    @Column(name = "INV_BEGIN_PSTD_DT")
    @Temporal(TemporalType.DATE)
    private Date invBeginPstdDt;
    @Basic(optional = false)
    @Column(name = "INV_END_PSTD_DT")
    @Temporal(TemporalType.DATE)
    private Date invEndPstdDt;

    public InvCycDts() {
    }

    public InvCycDts(InvCycDtsPK invCycDtsPK) {
        this.invCycDtsPK = invCycDtsPK;
    }

    public InvCycDts(InvCycDtsPK invCycDtsPK, Date pmtDueDt, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr, BigDecimal canInvAmt, Character canInvAmtDbcrI, BigDecimal usInvBgBal, Character usBgBalDbcrInd, BigDecimal canInvBgBal, Character canBgBalDbcrI, BigDecimal invAmt, Character crOrDb, Date invBeginPstdDt, Date invEndPstdDt) {
        this.invCycDtsPK = invCycDtsPK;
        this.pmtDueDt = pmtDueDt;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
        this.canInvAmt = canInvAmt;
        this.canInvAmtDbcrI = canInvAmtDbcrI;
        this.usInvBgBal = usInvBgBal;
        this.usBgBalDbcrInd = usBgBalDbcrInd;
        this.canInvBgBal = canInvBgBal;
        this.canBgBalDbcrI = canBgBalDbcrI;
        this.invAmt = invAmt;
        this.crOrDb = crOrDb;
        this.invBeginPstdDt = invBeginPstdDt;
        this.invEndPstdDt = invEndPstdDt;
    }

    public InvCycDts(String acctNbr, Date cycInvDt) {
        this.invCycDtsPK = new InvCycDtsPK(acctNbr, cycInvDt);
    }

    public InvCycDtsPK getInvCycDtsPK() {
        return invCycDtsPK;
    }

    public void setInvCycDtsPK(InvCycDtsPK invCycDtsPK) {
        this.invCycDtsPK = invCycDtsPK;
    }

    public Date getPmtDueDt() {
        return pmtDueDt;
    }

    public void setPmtDueDt(Date pmtDueDt) {
        this.pmtDueDt = pmtDueDt;
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

    public BigDecimal getCanInvAmt() {
        return canInvAmt;
    }

    public void setCanInvAmt(BigDecimal canInvAmt) {
        this.canInvAmt = canInvAmt;
    }

    public Character getCanInvAmtDbcrI() {
        return canInvAmtDbcrI;
    }

    public void setCanInvAmtDbcrI(Character canInvAmtDbcrI) {
        this.canInvAmtDbcrI = canInvAmtDbcrI;
    }

    public BigDecimal getUsInvBgBal() {
        return usInvBgBal;
    }

    public void setUsInvBgBal(BigDecimal usInvBgBal) {
        this.usInvBgBal = usInvBgBal;
    }

    public Character getUsBgBalDbcrInd() {
        return usBgBalDbcrInd;
    }

    public void setUsBgBalDbcrInd(Character usBgBalDbcrInd) {
        this.usBgBalDbcrInd = usBgBalDbcrInd;
    }

    public BigDecimal getCanInvBgBal() {
        return canInvBgBal;
    }

    public void setCanInvBgBal(BigDecimal canInvBgBal) {
        this.canInvBgBal = canInvBgBal;
    }

    public Character getCanBgBalDbcrI() {
        return canBgBalDbcrI;
    }

    public void setCanBgBalDbcrI(Character canBgBalDbcrI) {
        this.canBgBalDbcrI = canBgBalDbcrI;
    }

    public BigDecimal getInvAmt() {
        return invAmt;
    }

    public void setInvAmt(BigDecimal invAmt) {
        this.invAmt = invAmt;
    }

    public Character getCrOrDb() {
        return crOrDb;
    }

    public void setCrOrDb(Character crOrDb) {
        this.crOrDb = crOrDb;
    }

    public Date getInvBeginPstdDt() {
        return invBeginPstdDt;
    }

    public void setInvBeginPstdDt(Date invBeginPstdDt) {
        this.invBeginPstdDt = invBeginPstdDt;
    }

    public Date getInvEndPstdDt() {
        return invEndPstdDt;
    }

    public void setInvEndPstdDt(Date invEndPstdDt) {
        this.invEndPstdDt = invEndPstdDt;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (invCycDtsPK != null ? invCycDtsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof InvCycDts)) {
            return false;
        }
        InvCycDts other = (InvCycDts) object;
        if ((this.invCycDtsPK == null && other.invCycDtsPK != null) || (this.invCycDtsPK != null && !this.invCycDtsPK.equals(other.invCycDtsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.InvCycDts[ invCycDtsPK=" + invCycDtsPK + " ]";
    }

}
