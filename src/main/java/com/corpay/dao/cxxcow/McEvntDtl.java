package com.corpay.dao.cxxcow;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Table(name = "MC_EVNT_DTL", catalog = "", schema = "CXXCOW")
public class McEvntDtl implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected McEvntDtlPK mcEvntDtlPK;

    @Basic(optional = false)
    @Column(name = "P627S1_BILL_EVNT_A")
    private BigDecimal p627s1BillEvntA;
    @Basic(optional = false)
    @Column(name = "P627S2_BILL_EVNT_E")
    private short p627s2BillEvntE;
    @Basic(optional = false)
    @Column(name = "P627S3_BILL_EVNT_S")
    private Character p627s3BillEvntS;
    @Basic(optional = false)
    @Column(name = "P627S4_BILL_EVNT_D")
    private String p627s4BillEvntD;

    public McEvntDtl() {
    }

    public McEvntDtl(McEvntDtlPK mcEvntDtlPK) {
        this.mcEvntDtlPK = mcEvntDtlPK;
    }

    public McEvntDtl(McEvntDtlPK mcEvntDtlPK, BigDecimal p627s1BillEvntA, short p627s2BillEvntE, Character p627s3BillEvntS, String p627s4BillEvntD) {
        this.mcEvntDtlPK = mcEvntDtlPK;
        this.p627s1BillEvntA = p627s1BillEvntA;
        this.p627s2BillEvntE = p627s2BillEvntE;
        this.p627s3BillEvntS = p627s3BillEvntS;
        this.p627s4BillEvntD = p627s4BillEvntD;
    }

    public McEvntDtl(short p105s1FileTy, int p105s2FileRDt, long p105s3ProcId, int p105s4FileSeqNo, int d71MsgNo, short occInd, Character evntTyp) {
        this.mcEvntDtlPK = new McEvntDtlPK(p105s1FileTy, p105s2FileRDt, p105s3ProcId, p105s4FileSeqNo, d71MsgNo, occInd, evntTyp);
    }

    public McEvntDtlPK getMcEvntDtlPK() {
        return mcEvntDtlPK;
    }

    public void setMcEvntDtlPK(McEvntDtlPK mcEvntDtlPK) {
        this.mcEvntDtlPK = mcEvntDtlPK;
    }

    public BigDecimal getP627s1BillEvntA() {
        return p627s1BillEvntA;
    }

    public void setP627s1BillEvntA(BigDecimal p627s1BillEvntA) {
        this.p627s1BillEvntA = p627s1BillEvntA;
    }

    public short getP627s2BillEvntE() {
        return p627s2BillEvntE;
    }

    public void setP627s2BillEvntE(short p627s2BillEvntE) {
        this.p627s2BillEvntE = p627s2BillEvntE;
    }

    public Character getP627s3BillEvntS() {
        return p627s3BillEvntS;
    }

    public void setP627s3BillEvntS(Character p627s3BillEvntS) {
        this.p627s3BillEvntS = p627s3BillEvntS;
    }

    public String getP627s4BillEvntD() {
        return p627s4BillEvntD;
    }

    public void setP627s4BillEvntD(String p627s4BillEvntD) {
        this.p627s4BillEvntD = p627s4BillEvntD;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mcEvntDtlPK != null ? mcEvntDtlPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof McEvntDtl)) {
            return false;
        }
        McEvntDtl other = (McEvntDtl) object;
        if ((this.mcEvntDtlPK == null && other.mcEvntDtlPK != null) || (this.mcEvntDtlPK != null && !this.mcEvntDtlPK.equals(other.mcEvntDtlPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.cxxcow.McEvntDtl[ mcEvntDtlPK=" + mcEvntDtlPK + " ]";
    }

}
