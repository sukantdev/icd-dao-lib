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
@Table(name = "MC_ADDNL_AMT", catalog = "", schema = "CXXCOW")
@NamedQueries({
    @NamedQuery(name = "McAddnlAmt.findAll", query = "SELECT m FROM McAddnlAmt m"),
    @NamedQuery(name = "McAddnlAmt.findByP105s1FileTy", query = "SELECT m FROM McAddnlAmt m WHERE m.mcAddnlAmtPK.p105s1FileTy = :p105s1FileTy"),
    @NamedQuery(name = "McAddnlAmt.findByP105s2FileRDt", query = "SELECT m FROM McAddnlAmt m WHERE m.mcAddnlAmtPK.p105s2FileRDt = :p105s2FileRDt"),
    @NamedQuery(name = "McAddnlAmt.findByP105s3ProcId", query = "SELECT m FROM McAddnlAmt m WHERE m.mcAddnlAmtPK.p105s3ProcId = :p105s3ProcId"),
    @NamedQuery(name = "McAddnlAmt.findByP105s4FileSeqNo", query = "SELECT m FROM McAddnlAmt m WHERE m.mcAddnlAmtPK.p105s4FileSeqNo = :p105s4FileSeqNo"),
    @NamedQuery(name = "McAddnlAmt.findByD71MsgNo", query = "SELECT m FROM McAddnlAmt m WHERE m.mcAddnlAmtPK.d71MsgNo = :d71MsgNo"),
    @NamedQuery(name = "McAddnlAmt.findByOccInd", query = "SELECT m FROM McAddnlAmt m WHERE m.mcAddnlAmtPK.occInd = :occInd"),
    @NamedQuery(name = "McAddnlAmt.findByD54s1AdtlAcctTy", query = "SELECT m FROM McAddnlAmt m WHERE m.d54s1AdtlAcctTy = :d54s1AdtlAcctTy"),
    @NamedQuery(name = "McAddnlAmt.findByD54s2AdtlAmtTyp", query = "SELECT m FROM McAddnlAmt m WHERE m.d54s2AdtlAmtTyp = :d54s2AdtlAmtTyp"),
    @NamedQuery(name = "McAddnlAmt.findByD54s3AdtlCurrCd", query = "SELECT m FROM McAddnlAmt m WHERE m.d54s3AdtlCurrCd = :d54s3AdtlCurrCd"),
    @NamedQuery(name = "McAddnlAmt.findByD54s4AdtlAmtSgn", query = "SELECT m FROM McAddnlAmt m WHERE m.d54s4AdtlAmtSgn = :d54s4AdtlAmtSgn"),
    @NamedQuery(name = "McAddnlAmt.findByD54s5AdtlAmt", query = "SELECT m FROM McAddnlAmt m WHERE m.d54s5AdtlAmt = :d54s5AdtlAmt")})
public class McAddnlAmt implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected McAddnlAmtPK mcAddnlAmtPK;
    @Column(name = "D54S1_ADTL_ACCT_TY")
    private Short d54s1AdtlAcctTy;
    @Column(name = "D54S2_ADTL_AMT_TYP")
    private Short d54s2AdtlAmtTyp;
    @Column(name = "D54S3_ADTL_CURR_CD")
    private Short d54s3AdtlCurrCd;
    @Column(name = "D54S4_ADTL_AMT_SGN")
    private Character d54s4AdtlAmtSgn;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "D54S5_ADTL_AMT")
    private BigDecimal d54s5AdtlAmt;

    public McAddnlAmt() {
    }

    public McAddnlAmt(McAddnlAmtPK mcAddnlAmtPK) {
        this.mcAddnlAmtPK = mcAddnlAmtPK;
    }

    public McAddnlAmt(short p105s1FileTy, int p105s2FileRDt, long p105s3ProcId, int p105s4FileSeqNo, int d71MsgNo, short occInd) {
        this.mcAddnlAmtPK = new McAddnlAmtPK(p105s1FileTy, p105s2FileRDt, p105s3ProcId, p105s4FileSeqNo, d71MsgNo, occInd);
    }

    public McAddnlAmtPK getMcAddnlAmtPK() {
        return mcAddnlAmtPK;
    }

    public void setMcAddnlAmtPK(McAddnlAmtPK mcAddnlAmtPK) {
        this.mcAddnlAmtPK = mcAddnlAmtPK;
    }

    public Short getD54s1AdtlAcctTy() {
        return d54s1AdtlAcctTy;
    }

    public void setD54s1AdtlAcctTy(Short d54s1AdtlAcctTy) {
        this.d54s1AdtlAcctTy = d54s1AdtlAcctTy;
    }

    public Short getD54s2AdtlAmtTyp() {
        return d54s2AdtlAmtTyp;
    }

    public void setD54s2AdtlAmtTyp(Short d54s2AdtlAmtTyp) {
        this.d54s2AdtlAmtTyp = d54s2AdtlAmtTyp;
    }

    public Short getD54s3AdtlCurrCd() {
        return d54s3AdtlCurrCd;
    }

    public void setD54s3AdtlCurrCd(Short d54s3AdtlCurrCd) {
        this.d54s3AdtlCurrCd = d54s3AdtlCurrCd;
    }

    public Character getD54s4AdtlAmtSgn() {
        return d54s4AdtlAmtSgn;
    }

    public void setD54s4AdtlAmtSgn(Character d54s4AdtlAmtSgn) {
        this.d54s4AdtlAmtSgn = d54s4AdtlAmtSgn;
    }

    public BigDecimal getD54s5AdtlAmt() {
        return d54s5AdtlAmt;
    }

    public void setD54s5AdtlAmt(BigDecimal d54s5AdtlAmt) {
        this.d54s5AdtlAmt = d54s5AdtlAmt;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mcAddnlAmtPK != null ? mcAddnlAmtPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof McAddnlAmt)) {
            return false;
        }
        McAddnlAmt other = (McAddnlAmt) object;
        if ((this.mcAddnlAmtPK == null && other.mcAddnlAmtPK != null) || (this.mcAddnlAmtPK != null && !this.mcAddnlAmtPK.equals(other.mcAddnlAmtPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.cxxcow.McAddnlAmt[ mcAddnlAmtPK=" + mcAddnlAmtPK + " ]";
    }
    
}
