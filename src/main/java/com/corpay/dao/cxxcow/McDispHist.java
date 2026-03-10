/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.corpay.dao.cxxcow;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 *
 * @author Sukant.Tiwari
 */
@Entity
@Table(name = "MC_DISP_HIST", catalog = "", schema = "CXXCOW")
@NamedQueries({
    @NamedQuery(name = "McDispHist.findAll", query = "SELECT m FROM McDispHist m"),
    @NamedQuery(name = "McDispHist.findByD2PriAccntNo", query = "SELECT m FROM McDispHist m WHERE m.mcDispHistPK.d2PriAccntNo = :d2PriAccntNo"),
    @NamedQuery(name = "McDispHist.findByD4TranAmt", query = "SELECT m FROM McDispHist m WHERE m.d4TranAmt = :d4TranAmt"),
    @NamedQuery(name = "McDispHist.findByD12s1LocalTrDt", query = "SELECT m FROM McDispHist m WHERE m.mcDispHistPK.d12s1LocalTrDt = :d12s1LocalTrDt"),
    @NamedQuery(name = "McDispHist.findByD30s1TrOrigAmt", query = "SELECT m FROM McDispHist m WHERE m.mcDispHistPK.d30s1TrOrigAmt = :d30s1TrOrigAmt"),
    @NamedQuery(name = "McDispHist.findByD31s1IcRtDsgtr", query = "SELECT m FROM McDispHist m WHERE m.mcDispHistPK.d31s1IcRtDsgtr = :d31s1IcRtDsgtr"),
    @NamedQuery(name = "McDispHist.findByD31s2AcquirBin", query = "SELECT m FROM McDispHist m WHERE m.mcDispHistPK.d31s2AcquirBin = :d31s2AcquirBin"),
    @NamedQuery(name = "McDispHist.findByD31s3JulPrcDt", query = "SELECT m FROM McDispHist m WHERE m.mcDispHistPK.d31s3JulPrcDt = :d31s3JulPrcDt"),
    @NamedQuery(name = "McDispHist.findByD31s4AcqSeqNo", query = "SELECT m FROM McDispHist m WHERE m.mcDispHistPK.d31s4AcqSeqNo = :d31s4AcqSeqNo"),
    @NamedQuery(name = "McDispHist.findByD31s5CheckDigit", query = "SELECT m FROM McDispHist m WHERE m.mcDispHistPK.d31s5CheckDigit = :d31s5CheckDigit"),
    @NamedQuery(name = "McDispHist.findByD38ApprvlCd", query = "SELECT m FROM McDispHist m WHERE m.mcDispHistPK.d38ApprvlCd = :d38ApprvlCd"),
    @NamedQuery(name = "McDispHist.findByU0000RecordType", query = "SELECT m FROM McDispHist m WHERE m.u0000RecordType = :u0000RecordType"),
    @NamedQuery(name = "McDispHist.findByU0001Status", query = "SELECT m FROM McDispHist m WHERE m.u0001Status = :u0001Status"),
    @NamedQuery(name = "McDispHist.findByU0002AddedDt", query = "SELECT m FROM McDispHist m WHERE m.mcDispHistPK.u0002AddedDt = :u0002AddedDt"),
    @NamedQuery(name = "McDispHist.findByU0003AddedTm", query = "SELECT m FROM McDispHist m WHERE m.mcDispHistPK.u0003AddedTm = :u0003AddedTm"),
    @NamedQuery(name = "McDispHist.findByU0004AddedId", query = "SELECT m FROM McDispHist m WHERE m.u0004AddedId = :u0004AddedId"),
    @NamedQuery(name = "McDispHist.findByD26CrdAcptrbus", query = "SELECT m FROM McDispHist m WHERE m.d26CrdAcptrbus = :d26CrdAcptrbus"),
    @NamedQuery(name = "McDispHist.findByD93TrDestInst", query = "SELECT m FROM McDispHist m WHERE m.d93TrDestInst = :d93TrDestInst"),
    @NamedQuery(name = "McDispHist.findByU0005AcctCde", query = "SELECT m FROM McDispHist m WHERE m.u0005AcctCde = :u0005AcctCde")})
public class McDispHist implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected McDispHistPK mcDispHistPK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
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

    public McDispHist() {
    }

    public McDispHist(McDispHistPK mcDispHistPK) {
        this.mcDispHistPK = mcDispHistPK;
    }

    public McDispHist(McDispHistPK mcDispHistPK, BigDecimal d4TranAmt, short u0000RecordType, short u0001Status, String u0004AddedId, short d26CrdAcptrbus, long d93TrDestInst, String u0005AcctCde) {
        this.mcDispHistPK = mcDispHistPK;
        this.d4TranAmt = d4TranAmt;
        this.u0000RecordType = u0000RecordType;
        this.u0001Status = u0001Status;
        this.u0004AddedId = u0004AddedId;
        this.d26CrdAcptrbus = d26CrdAcptrbus;
        this.d93TrDestInst = d93TrDestInst;
        this.u0005AcctCde = u0005AcctCde;
    }

    public McDispHist(String d2PriAccntNo, int d12s1LocalTrDt, BigDecimal d30s1TrOrigAmt, short d31s1IcRtDsgtr, int d31s2AcquirBin, short d31s3JulPrcDt, long d31s4AcqSeqNo, short d31s5CheckDigit, String d38ApprvlCd, int u0002AddedDt, int u0003AddedTm) {
        this.mcDispHistPK = new McDispHistPK(d2PriAccntNo, d12s1LocalTrDt, d30s1TrOrigAmt, d31s1IcRtDsgtr, d31s2AcquirBin, d31s3JulPrcDt, d31s4AcqSeqNo, d31s5CheckDigit, d38ApprvlCd, u0002AddedDt, u0003AddedTm);
    }

    public McDispHistPK getMcDispHistPK() {
        return mcDispHistPK;
    }

    public void setMcDispHistPK(McDispHistPK mcDispHistPK) {
        this.mcDispHistPK = mcDispHistPK;
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
        hash += (mcDispHistPK != null ? mcDispHistPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof McDispHist)) {
            return false;
        }
        McDispHist other = (McDispHist) object;
        if ((this.mcDispHistPK == null && other.mcDispHistPK != null) || (this.mcDispHistPK != null && !this.mcDispHistPK.equals(other.mcDispHistPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.cxxcow.McDispHist[ mcDispHistPK=" + mcDispHistPK + " ]";
    }
    
}
