/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.corpay.dao.cxxcow;

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
@Table(name = "MC_CR_RECON_CUR", catalog = "", schema = "CXXCOW")
@NamedQueries({
    @NamedQuery(name = "McCrReconCur.findAll", query = "SELECT m FROM McCrReconCur m"),
    @NamedQuery(name = "McCrReconCur.findByP105s1FileTy", query = "SELECT m FROM McCrReconCur m WHERE m.mcCrReconCurPK.p105s1FileTy = :p105s1FileTy"),
    @NamedQuery(name = "McCrReconCur.findByP105s2FileRDt", query = "SELECT m FROM McCrReconCur m WHERE m.mcCrReconCurPK.p105s2FileRDt = :p105s2FileRDt"),
    @NamedQuery(name = "McCrReconCur.findByP105s3ProcId", query = "SELECT m FROM McCrReconCur m WHERE m.mcCrReconCurPK.p105s3ProcId = :p105s3ProcId"),
    @NamedQuery(name = "McCrReconCur.findByP105s4FileSeqNo", query = "SELECT m FROM McCrReconCur m WHERE m.mcCrReconCurPK.p105s4FileSeqNo = :p105s4FileSeqNo"),
    @NamedQuery(name = "McCrReconCur.findByD71MsgNo", query = "SELECT m FROM McCrReconCur m WHERE m.mcCrReconCurPK.d71MsgNo = :d71MsgNo"),
    @NamedQuery(name = "McCrReconCur.findByP393s1FeeTyCd", query = "SELECT m FROM McCrReconCur m WHERE m.p393s1FeeTyCd = :p393s1FeeTyCd"),
    @NamedQuery(name = "McCrReconCur.findByP393s2DbCrInd", query = "SELECT m FROM McCrReconCur m WHERE m.p393s2DbCrInd = :p393s2DbCrInd"),
    @NamedQuery(name = "McCrReconCur.findByP393s3FeeAmt", query = "SELECT m FROM McCrReconCur m WHERE m.p393s3FeeAmt = :p393s3FeeAmt"),
    @NamedQuery(name = "McCrReconCur.findByOccInd", query = "SELECT m FROM McCrReconCur m WHERE m.mcCrReconCurPK.occInd = :occInd")})
public class McCrReconCur implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected McCrReconCurPK mcCrReconCurPK;
    @Column(name = "P393S1_FEE_TY_CD")
    private Short p393s1FeeTyCd;
    @Column(name = "P393S2_DB_CR_IND")
    private Character p393s2DbCrInd;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
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
        // TODO: Warning - this method won't work in the case the id fields are not set
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
