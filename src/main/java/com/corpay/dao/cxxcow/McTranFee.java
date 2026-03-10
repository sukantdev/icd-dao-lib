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
@Table(name = "MC_TRAN_FEE", catalog = "", schema = "CXXCOW")
@NamedQueries({
    @NamedQuery(name = "McTranFee.findAll", query = "SELECT m FROM McTranFee m"),
    @NamedQuery(name = "McTranFee.findByP105s1FileTy", query = "SELECT m FROM McTranFee m WHERE m.mcTranFeePK.p105s1FileTy = :p105s1FileTy"),
    @NamedQuery(name = "McTranFee.findByP105s2FileRDt", query = "SELECT m FROM McTranFee m WHERE m.mcTranFeePK.p105s2FileRDt = :p105s2FileRDt"),
    @NamedQuery(name = "McTranFee.findByP105s3ProcId", query = "SELECT m FROM McTranFee m WHERE m.mcTranFeePK.p105s3ProcId = :p105s3ProcId"),
    @NamedQuery(name = "McTranFee.findByP105s4FileSeqNo", query = "SELECT m FROM McTranFee m WHERE m.mcTranFeePK.p105s4FileSeqNo = :p105s4FileSeqNo"),
    @NamedQuery(name = "McTranFee.findByP146s1TrnfeeTy", query = "SELECT m FROM McTranFee m WHERE m.p146s1TrnfeeTy = :p146s1TrnfeeTy"),
    @NamedQuery(name = "McTranFee.findByP146s2TrnfeePrc", query = "SELECT m FROM McTranFee m WHERE m.p146s2TrnfeePrc = :p146s2TrnfeePrc"),
    @NamedQuery(name = "McTranFee.findByP146s3TrnfeeStl", query = "SELECT m FROM McTranFee m WHERE m.p146s3TrnfeeStl = :p146s3TrnfeeStl"),
    @NamedQuery(name = "McTranFee.findByP146s4TrnfeeCurr", query = "SELECT m FROM McTranFee m WHERE m.p146s4TrnfeeCurr = :p146s4TrnfeeCurr"),
    @NamedQuery(name = "McTranFee.findByP146s5TrnfeeAmt", query = "SELECT m FROM McTranFee m WHERE m.p146s5TrnfeeAmt = :p146s5TrnfeeAmt"),
    @NamedQuery(name = "McTranFee.findByP146s6Trnfeercur", query = "SELECT m FROM McTranFee m WHERE m.p146s6Trnfeercur = :p146s6Trnfeercur"),
    @NamedQuery(name = "McTranFee.findByP146s7TrnfeerAmt", query = "SELECT m FROM McTranFee m WHERE m.p146s7TrnfeerAmt = :p146s7TrnfeerAmt"),
    @NamedQuery(name = "McTranFee.findByD71MsgNo", query = "SELECT m FROM McTranFee m WHERE m.mcTranFeePK.d71MsgNo = :d71MsgNo"),
    @NamedQuery(name = "McTranFee.findByOccInd", query = "SELECT m FROM McTranFee m WHERE m.mcTranFeePK.occInd = :occInd")})
public class McTranFee implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected McTranFeePK mcTranFeePK;
    @Column(name = "P146S1_TRNFEE_TY")
    private Short p146s1TrnfeeTy;
    @Column(name = "P146S2_TRNFEE_PRC")
    private Short p146s2TrnfeePrc;
    @Column(name = "P146S3_TRNFEE_STL")
    private Short p146s3TrnfeeStl;
    @Column(name = "P146S4_TRNFEE_CURR")
    private Short p146s4TrnfeeCurr;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "P146S5_TRNFEE_AMT")
    private BigDecimal p146s5TrnfeeAmt;
    @Column(name = "P146S6_TRNFEERCUR")
    private Short p146s6Trnfeercur;
    @Column(name = "P146S7_TRNFEER_AMT")
    private BigDecimal p146s7TrnfeerAmt;

    public McTranFee() {
    }

    public McTranFee(McTranFeePK mcTranFeePK) {
        this.mcTranFeePK = mcTranFeePK;
    }

    public McTranFee(short p105s1FileTy, int p105s2FileRDt, long p105s3ProcId, int p105s4FileSeqNo, int d71MsgNo, short occInd) {
        this.mcTranFeePK = new McTranFeePK(p105s1FileTy, p105s2FileRDt, p105s3ProcId, p105s4FileSeqNo, d71MsgNo, occInd);
    }

    public McTranFeePK getMcTranFeePK() {
        return mcTranFeePK;
    }

    public void setMcTranFeePK(McTranFeePK mcTranFeePK) {
        this.mcTranFeePK = mcTranFeePK;
    }

    public Short getP146s1TrnfeeTy() {
        return p146s1TrnfeeTy;
    }

    public void setP146s1TrnfeeTy(Short p146s1TrnfeeTy) {
        this.p146s1TrnfeeTy = p146s1TrnfeeTy;
    }

    public Short getP146s2TrnfeePrc() {
        return p146s2TrnfeePrc;
    }

    public void setP146s2TrnfeePrc(Short p146s2TrnfeePrc) {
        this.p146s2TrnfeePrc = p146s2TrnfeePrc;
    }

    public Short getP146s3TrnfeeStl() {
        return p146s3TrnfeeStl;
    }

    public void setP146s3TrnfeeStl(Short p146s3TrnfeeStl) {
        this.p146s3TrnfeeStl = p146s3TrnfeeStl;
    }

    public Short getP146s4TrnfeeCurr() {
        return p146s4TrnfeeCurr;
    }

    public void setP146s4TrnfeeCurr(Short p146s4TrnfeeCurr) {
        this.p146s4TrnfeeCurr = p146s4TrnfeeCurr;
    }

    public BigDecimal getP146s5TrnfeeAmt() {
        return p146s5TrnfeeAmt;
    }

    public void setP146s5TrnfeeAmt(BigDecimal p146s5TrnfeeAmt) {
        this.p146s5TrnfeeAmt = p146s5TrnfeeAmt;
    }

    public Short getP146s6Trnfeercur() {
        return p146s6Trnfeercur;
    }

    public void setP146s6Trnfeercur(Short p146s6Trnfeercur) {
        this.p146s6Trnfeercur = p146s6Trnfeercur;
    }

    public BigDecimal getP146s7TrnfeerAmt() {
        return p146s7TrnfeerAmt;
    }

    public void setP146s7TrnfeerAmt(BigDecimal p146s7TrnfeerAmt) {
        this.p146s7TrnfeerAmt = p146s7TrnfeerAmt;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mcTranFeePK != null ? mcTranFeePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof McTranFee)) {
            return false;
        }
        McTranFee other = (McTranFee) object;
        if ((this.mcTranFeePK == null && other.mcTranFeePK != null) || (this.mcTranFeePK != null && !this.mcTranFeePK.equals(other.mcTranFeePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.cxxcow.McTranFee[ mcTranFeePK=" + mcTranFeePK + " ]";
    }
    
}
