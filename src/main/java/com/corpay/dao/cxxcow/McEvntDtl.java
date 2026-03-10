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
@Table(name = "MC_EVNT_DTL", catalog = "", schema = "CXXCOW")
@NamedQueries({
    @NamedQuery(name = "McEvntDtl.findAll", query = "SELECT m FROM McEvntDtl m"),
    @NamedQuery(name = "McEvntDtl.findByP105s1FileTy", query = "SELECT m FROM McEvntDtl m WHERE m.mcEvntDtlPK.p105s1FileTy = :p105s1FileTy"),
    @NamedQuery(name = "McEvntDtl.findByP105s2FileRDt", query = "SELECT m FROM McEvntDtl m WHERE m.mcEvntDtlPK.p105s2FileRDt = :p105s2FileRDt"),
    @NamedQuery(name = "McEvntDtl.findByP105s3ProcId", query = "SELECT m FROM McEvntDtl m WHERE m.mcEvntDtlPK.p105s3ProcId = :p105s3ProcId"),
    @NamedQuery(name = "McEvntDtl.findByP105s4FileSeqNo", query = "SELECT m FROM McEvntDtl m WHERE m.mcEvntDtlPK.p105s4FileSeqNo = :p105s4FileSeqNo"),
    @NamedQuery(name = "McEvntDtl.findByD71MsgNo", query = "SELECT m FROM McEvntDtl m WHERE m.mcEvntDtlPK.d71MsgNo = :d71MsgNo"),
    @NamedQuery(name = "McEvntDtl.findByOccInd", query = "SELECT m FROM McEvntDtl m WHERE m.mcEvntDtlPK.occInd = :occInd"),
    @NamedQuery(name = "McEvntDtl.findByEvntTyp", query = "SELECT m FROM McEvntDtl m WHERE m.mcEvntDtlPK.evntTyp = :evntTyp"),
    @NamedQuery(name = "McEvntDtl.findByP627s1BillEvntA", query = "SELECT m FROM McEvntDtl m WHERE m.p627s1BillEvntA = :p627s1BillEvntA"),
    @NamedQuery(name = "McEvntDtl.findByP627s2BillEvntE", query = "SELECT m FROM McEvntDtl m WHERE m.p627s2BillEvntE = :p627s2BillEvntE"),
    @NamedQuery(name = "McEvntDtl.findByP627s3BillEvntS", query = "SELECT m FROM McEvntDtl m WHERE m.p627s3BillEvntS = :p627s3BillEvntS"),
    @NamedQuery(name = "McEvntDtl.findByP627s4BillEvntD", query = "SELECT m FROM McEvntDtl m WHERE m.p627s4BillEvntD = :p627s4BillEvntD")})
public class McEvntDtl implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected McEvntDtlPK mcEvntDtlPK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
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
        // TODO: Warning - this method won't work in the case the id fields are not set
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
