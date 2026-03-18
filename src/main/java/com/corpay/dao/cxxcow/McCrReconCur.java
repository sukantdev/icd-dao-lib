
package com.corpay.dao.cxxcow;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Table(name = "MC_CR_RECON_CUR", catalog = "", schema = "CXXCOW")
public class McCrReconCur implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected McCrReconCurPK mcCrReconCurPK;
    @Column(name = "P393S1_FEE_TY_CD")
    private Short p393s1FeeTyCd;
    @Column(name = "P393S2_DB_CR_IND")
    private Character p393s2DbCrInd;

    @Column(name = "P393S3_FEE_AMT")
    private BigDecimal p393s3FeeAmt;

    public McCrReconCur() {
    }

    public McCrReconCur(McCrReconCurPK mcCrReconCurPK) {
        this.mcCrReconCurPK = mcCrReconCurPK;
    }

    public McCrReconCur(short p105s1FileTy, int p105s2FileRDt, long p105s3ProcId, int p105s4FileSeqNo, int d71MsgNo, short occInd) {
        this.mcCrReconCurPK = new McCrReconCurPK(p105s1FileTy, p105s2FileRDt, p105s3ProcId, p105s4FileSeqNo, d71MsgNo, occInd);
    }

    public McCrReconCurPK getMcCrReconCurPK() {
        return mcCrReconCurPK;
    }

    public void setMcCrReconCurPK(McCrReconCurPK mcCrReconCurPK) {
        this.mcCrReconCurPK = mcCrReconCurPK;
    }

    public Short getP393s1FeeTyCd() {
        return p393s1FeeTyCd;
    }

    public void setP393s1FeeTyCd(Short p393s1FeeTyCd) {
        this.p393s1FeeTyCd = p393s1FeeTyCd;
    }

    public Character getP393s2DbCrInd() {
        return p393s2DbCrInd;
    }

    public void setP393s2DbCrInd(Character p393s2DbCrInd) {
        this.p393s2DbCrInd = p393s2DbCrInd;
    }

    public BigDecimal getP393s3FeeAmt() {
        return p393s3FeeAmt;
    }

    public void setP393s3FeeAmt(BigDecimal p393s3FeeAmt) {
        this.p393s3FeeAmt = p393s3FeeAmt;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mcCrReconCurPK != null ? mcCrReconCurPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof McCrReconCur)) {
            return false;
        }
        McCrReconCur other = (McCrReconCur) object;
        if ((this.mcCrReconCurPK == null && other.mcCrReconCurPK != null) || (this.mcCrReconCurPK != null && !this.mcCrReconCurPK.equals(other.mcCrReconCurPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.cxxcow.McCrReconCur[ mcCrReconCurPK=" + mcCrReconCurPK + " ]";
    }

}
