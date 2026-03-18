package com.corpay.dao.cxxcow;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Table(name = "MC_DB_RECON_CUR", catalog = "", schema = "CXXCOW")
public class McDbReconCur implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected McDbReconCurPK mcDbReconCurPK;
    @Column(name = "P392S1_FEE_TY_CD")
    private Short p392s1FeeTyCd;
    @Column(name = "P392S2_DB_CR_IND")
    private Character p392s2DbCrInd;

    @Column(name = "P392S3_FEE_AMT")
    private BigDecimal p392s3FeeAmt;

    public McDbReconCur() {
    }

    public McDbReconCur(McDbReconCurPK mcDbReconCurPK) {
        this.mcDbReconCurPK = mcDbReconCurPK;
    }

    public McDbReconCur(short p105s1FileTy, int p105s2FileRDt, long p105s3ProcId, int p105s4FileSeqNo, int d71MsgNo, short occInd) {
        this.mcDbReconCurPK = new McDbReconCurPK(p105s1FileTy, p105s2FileRDt, p105s3ProcId, p105s4FileSeqNo, d71MsgNo, occInd);
    }

    public McDbReconCurPK getMcDbReconCurPK() {
        return mcDbReconCurPK;
    }

    public void setMcDbReconCurPK(McDbReconCurPK mcDbReconCurPK) {
        this.mcDbReconCurPK = mcDbReconCurPK;
    }

    public Short getP392s1FeeTyCd() {
        return p392s1FeeTyCd;
    }

    public void setP392s1FeeTyCd(Short p392s1FeeTyCd) {
        this.p392s1FeeTyCd = p392s1FeeTyCd;
    }

    public Character getP392s2DbCrInd() {
        return p392s2DbCrInd;
    }

    public void setP392s2DbCrInd(Character p392s2DbCrInd) {
        this.p392s2DbCrInd = p392s2DbCrInd;
    }

    public BigDecimal getP392s3FeeAmt() {
        return p392s3FeeAmt;
    }

    public void setP392s3FeeAmt(BigDecimal p392s3FeeAmt) {
        this.p392s3FeeAmt = p392s3FeeAmt;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mcDbReconCurPK != null ? mcDbReconCurPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof McDbReconCur)) {
            return false;
        }
        McDbReconCur other = (McDbReconCur) object;
        if ((this.mcDbReconCurPK == null && other.mcDbReconCurPK != null) || (this.mcDbReconCurPK != null && !this.mcDbReconCurPK.equals(other.mcDbReconCurPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.cxxcow.McDbReconCur[ mcDbReconCurPK=" + mcDbReconCurPK + " ]";
    }

}
