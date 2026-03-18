package com.corpay.dao.cxxcow;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Table(name = "MC_DISP_HIST_OLD", catalog = "", schema = "CXXCOW")
public class McDispHistOld implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected McDispHistOldPK mcDispHistOldPK;

    @Basic(optional = false)
    @Column(name = "D4_TRAN_AMT")
    private BigDecimal d4TranAmt;
    @Basic(optional = false)
    @Column(name = "U0000_RECORD_TYPE")
    private short u0000RecordType;
    @Basic(optional = false)
    @Column(name = "U0001_STATUS")
    private short u0001Status;
    @Basic(optional = false)
    @Column(name = "U0004_ADDED_ID")
    private String u0004AddedId;
    @Basic(optional = false)
    @Column(name = "D26_CRD_ACPTRBUS")
    private short d26CrdAcptrbus;
    @Basic(optional = false)
    @Column(name = "D93_TR_DEST_INST")
    private long d93TrDestInst;
    @Basic(optional = false)
    @Column(name = "U0005_ACCT_CDE")
    private String u0005AcctCde;

    public McDispHistOld() {
    }

    public McDispHistOld(McDispHistOldPK mcDispHistOldPK) {
        this.mcDispHistOldPK = mcDispHistOldPK;
    }

    public McDispHistOld(McDispHistOldPK mcDispHistOldPK, BigDecimal d4TranAmt, short u0000RecordType, short u0001Status, String u0004AddedId, short d26CrdAcptrbus, long d93TrDestInst, String u0005AcctCde) {
        this.mcDispHistOldPK = mcDispHistOldPK;
        this.d4TranAmt = d4TranAmt;
        this.u0000RecordType = u0000RecordType;
        this.u0001Status = u0001Status;
        this.u0004AddedId = u0004AddedId;
        this.d26CrdAcptrbus = d26CrdAcptrbus;
        this.d93TrDestInst = d93TrDestInst;
        this.u0005AcctCde = u0005AcctCde;
    }

    public McDispHistOld(String d2PriAccntNo, int d12s1LocalTrDt, BigDecimal d30s1TrOrigAmt, short d31s1IcRtDsgtr, int d31s2AcquirBin, short d31s3JulPrcDt, long d31s4AcqSeqNo, short d31s5CheckDigit, String d38ApprvlCd, int u0002AddedDt, int u0003AddedTm) {
        this.mcDispHistOldPK = new McDispHistOldPK(d2PriAccntNo, d12s1LocalTrDt, d30s1TrOrigAmt, d31s1IcRtDsgtr, d31s2AcquirBin, d31s3JulPrcDt, d31s4AcqSeqNo, d31s5CheckDigit, d38ApprvlCd, u0002AddedDt, u0003AddedTm);
    }

    public McDispHistOldPK getMcDispHistOldPK() {
        return mcDispHistOldPK;
    }

    public void setMcDispHistOldPK(McDispHistOldPK mcDispHistOldPK) {
        this.mcDispHistOldPK = mcDispHistOldPK;
    }

    public BigDecimal getD4TranAmt() {
        return d4TranAmt;
    }

    public void setD4TranAmt(BigDecimal d4TranAmt) {
        this.d4TranAmt = d4TranAmt;
    }

    public short getU0000RecordType() {
        return u0000RecordType;
    }

    public void setU0000RecordType(short u0000RecordType) {
        this.u0000RecordType = u0000RecordType;
    }

    public short getU0001Status() {
        return u0001Status;
    }

    public void setU0001Status(short u0001Status) {
        this.u0001Status = u0001Status;
    }

    public String getU0004AddedId() {
        return u0004AddedId;
    }

    public void setU0004AddedId(String u0004AddedId) {
        this.u0004AddedId = u0004AddedId;
    }

    public short getD26CrdAcptrbus() {
        return d26CrdAcptrbus;
    }

    public void setD26CrdAcptrbus(short d26CrdAcptrbus) {
        this.d26CrdAcptrbus = d26CrdAcptrbus;
    }

    public long getD93TrDestInst() {
        return d93TrDestInst;
    }

    public void setD93TrDestInst(long d93TrDestInst) {
        this.d93TrDestInst = d93TrDestInst;
    }

    public String getU0005AcctCde() {
        return u0005AcctCde;
    }

    public void setU0005AcctCde(String u0005AcctCde) {
        this.u0005AcctCde = u0005AcctCde;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mcDispHistOldPK != null ? mcDispHistOldPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof McDispHistOld)) {
            return false;
        }
        McDispHistOld other = (McDispHistOld) object;
        if ((this.mcDispHistOldPK == null && other.mcDispHistOldPK != null) || (this.mcDispHistOldPK != null && !this.mcDispHistOldPK.equals(other.mcDispHistOldPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.cxxcow.McDispHistOld[ mcDispHistOldPK=" + mcDispHistOldPK + " ]";
    }

}
