package com.corpay.dao.cxxcow;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;
import java.math.BigDecimal;

@Embeddable
public class McDispHistOldPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "D2_PRI_ACCNT_NO")
    private String d2PriAccntNo;
    @Basic(optional = false)
    @Column(name = "D12S1_LOCAL_TR_DT")
    private int d12s1LocalTrDt;

    @Basic(optional = false)
    @Column(name = "D30S1_TR_ORIG_AMT")
    private BigDecimal d30s1TrOrigAmt;
    @Basic(optional = false)
    @Column(name = "D31S1_IC_RT_DSGTR")
    private short d31s1IcRtDsgtr;
    @Basic(optional = false)
    @Column(name = "D31S2_ACQUIR_BIN")
    private int d31s2AcquirBin;
    @Basic(optional = false)
    @Column(name = "D31S3_JUL_PRC_DT")
    private short d31s3JulPrcDt;
    @Basic(optional = false)
    @Column(name = "D31S4_ACQ_SEQ_NO")
    private long d31s4AcqSeqNo;
    @Basic(optional = false)
    @Column(name = "D31S5_CHECK_DIGIT")
    private short d31s5CheckDigit;
    @Basic(optional = false)
    @Column(name = "D38_APPRVL_CD")
    private String d38ApprvlCd;
    @Basic(optional = false)
    @Column(name = "U0002_ADDED_DT")
    private int u0002AddedDt;
    @Basic(optional = false)
    @Column(name = "U0003_ADDED_TM")
    private int u0003AddedTm;

    public McDispHistOldPK() {
    }

    public McDispHistOldPK(String d2PriAccntNo, int d12s1LocalTrDt, BigDecimal d30s1TrOrigAmt, short d31s1IcRtDsgtr, int d31s2AcquirBin, short d31s3JulPrcDt, long d31s4AcqSeqNo, short d31s5CheckDigit, String d38ApprvlCd, int u0002AddedDt, int u0003AddedTm) {
        this.d2PriAccntNo = d2PriAccntNo;
        this.d12s1LocalTrDt = d12s1LocalTrDt;
        this.d30s1TrOrigAmt = d30s1TrOrigAmt;
        this.d31s1IcRtDsgtr = d31s1IcRtDsgtr;
        this.d31s2AcquirBin = d31s2AcquirBin;
        this.d31s3JulPrcDt = d31s3JulPrcDt;
        this.d31s4AcqSeqNo = d31s4AcqSeqNo;
        this.d31s5CheckDigit = d31s5CheckDigit;
        this.d38ApprvlCd = d38ApprvlCd;
        this.u0002AddedDt = u0002AddedDt;
        this.u0003AddedTm = u0003AddedTm;
    }

    public String getD2PriAccntNo() {
        return d2PriAccntNo;
    }

    public void setD2PriAccntNo(String d2PriAccntNo) {
        this.d2PriAccntNo = d2PriAccntNo;
    }

    public int getD12s1LocalTrDt() {
        return d12s1LocalTrDt;
    }

    public void setD12s1LocalTrDt(int d12s1LocalTrDt) {
        this.d12s1LocalTrDt = d12s1LocalTrDt;
    }

    public BigDecimal getD30s1TrOrigAmt() {
        return d30s1TrOrigAmt;
    }

    public void setD30s1TrOrigAmt(BigDecimal d30s1TrOrigAmt) {
        this.d30s1TrOrigAmt = d30s1TrOrigAmt;
    }

    public short getD31s1IcRtDsgtr() {
        return d31s1IcRtDsgtr;
    }

    public void setD31s1IcRtDsgtr(short d31s1IcRtDsgtr) {
        this.d31s1IcRtDsgtr = d31s1IcRtDsgtr;
    }

    public int getD31s2AcquirBin() {
        return d31s2AcquirBin;
    }

    public void setD31s2AcquirBin(int d31s2AcquirBin) {
        this.d31s2AcquirBin = d31s2AcquirBin;
    }

    public short getD31s3JulPrcDt() {
        return d31s3JulPrcDt;
    }

    public void setD31s3JulPrcDt(short d31s3JulPrcDt) {
        this.d31s3JulPrcDt = d31s3JulPrcDt;
    }

    public long getD31s4AcqSeqNo() {
        return d31s4AcqSeqNo;
    }

    public void setD31s4AcqSeqNo(long d31s4AcqSeqNo) {
        this.d31s4AcqSeqNo = d31s4AcqSeqNo;
    }

    public short getD31s5CheckDigit() {
        return d31s5CheckDigit;
    }

    public void setD31s5CheckDigit(short d31s5CheckDigit) {
        this.d31s5CheckDigit = d31s5CheckDigit;
    }

    public String getD38ApprvlCd() {
        return d38ApprvlCd;
    }

    public void setD38ApprvlCd(String d38ApprvlCd) {
        this.d38ApprvlCd = d38ApprvlCd;
    }

    public int getU0002AddedDt() {
        return u0002AddedDt;
    }

    public void setU0002AddedDt(int u0002AddedDt) {
        this.u0002AddedDt = u0002AddedDt;
    }

    public int getU0003AddedTm() {
        return u0003AddedTm;
    }

    public void setU0003AddedTm(int u0003AddedTm) {
        this.u0003AddedTm = u0003AddedTm;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (d2PriAccntNo != null ? d2PriAccntNo.hashCode() : 0);
        hash += (int) d12s1LocalTrDt;
        hash += (d30s1TrOrigAmt != null ? d30s1TrOrigAmt.hashCode() : 0);
        hash += (int) d31s1IcRtDsgtr;
        hash += (int) d31s2AcquirBin;
        hash += (int) d31s3JulPrcDt;
        hash += (int) d31s4AcqSeqNo;
        hash += (int) d31s5CheckDigit;
        hash += (d38ApprvlCd != null ? d38ApprvlCd.hashCode() : 0);
        hash += (int) u0002AddedDt;
        hash += (int) u0003AddedTm;
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof McDispHistOldPK)) {
            return false;
        }
        McDispHistOldPK other = (McDispHistOldPK) object;
        if ((this.d2PriAccntNo == null && other.d2PriAccntNo != null) || (this.d2PriAccntNo != null && !this.d2PriAccntNo.equals(other.d2PriAccntNo))) {
            return false;
        }
        if (this.d12s1LocalTrDt != other.d12s1LocalTrDt) {
            return false;
        }
        if ((this.d30s1TrOrigAmt == null && other.d30s1TrOrigAmt != null) || (this.d30s1TrOrigAmt != null && !this.d30s1TrOrigAmt.equals(other.d30s1TrOrigAmt))) {
            return false;
        }
        if (this.d31s1IcRtDsgtr != other.d31s1IcRtDsgtr) {
            return false;
        }
        if (this.d31s2AcquirBin != other.d31s2AcquirBin) {
            return false;
        }
        if (this.d31s3JulPrcDt != other.d31s3JulPrcDt) {
            return false;
        }
        if (this.d31s4AcqSeqNo != other.d31s4AcqSeqNo) {
            return false;
        }
        if (this.d31s5CheckDigit != other.d31s5CheckDigit) {
            return false;
        }
        if ((this.d38ApprvlCd == null && other.d38ApprvlCd != null) || (this.d38ApprvlCd != null && !this.d38ApprvlCd.equals(other.d38ApprvlCd))) {
            return false;
        }
        if (this.u0002AddedDt != other.u0002AddedDt) {
            return false;
        }
        if (this.u0003AddedTm != other.u0003AddedTm) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.cxxcow.McDispHistOldPK[ d2PriAccntNo=" + d2PriAccntNo + ", d12s1LocalTrDt=" + d12s1LocalTrDt + ", d30s1TrOrigAmt=" + d30s1TrOrigAmt + ", d31s1IcRtDsgtr=" + d31s1IcRtDsgtr + ", d31s2AcquirBin=" + d31s2AcquirBin + ", d31s3JulPrcDt=" + d31s3JulPrcDt + ", d31s4AcqSeqNo=" + d31s4AcqSeqNo + ", d31s5CheckDigit=" + d31s5CheckDigit + ", d38ApprvlCd=" + d38ApprvlCd + ", u0002AddedDt=" + u0002AddedDt + ", u0003AddedTm=" + u0003AddedTm + " ]";
    }

}
