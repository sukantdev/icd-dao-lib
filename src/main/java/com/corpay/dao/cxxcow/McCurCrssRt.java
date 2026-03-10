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

/**
 *
 * @author Sukant.Tiwari
 */
@Entity
@Table(name = "MC_CUR_CRSS_RT", catalog = "", schema = "CXXCOW")
@NamedQueries({
    @NamedQuery(name = "McCurCrssRt.findAll", query = "SELECT m FROM McCurCrssRt m"),
    @NamedQuery(name = "McCurCrssRt.findByP105s1FileTy", query = "SELECT m FROM McCurCrssRt m WHERE m.mcCurCrssRtPK.p105s1FileTy = :p105s1FileTy"),
    @NamedQuery(name = "McCurCrssRt.findByP105s2FileRDt", query = "SELECT m FROM McCurCrssRt m WHERE m.mcCurCrssRtPK.p105s2FileRDt = :p105s2FileRDt"),
    @NamedQuery(name = "McCurCrssRt.findByP105s3ProcId", query = "SELECT m FROM McCurCrssRt m WHERE m.mcCurCrssRtPK.p105s3ProcId = :p105s3ProcId"),
    @NamedQuery(name = "McCurCrssRt.findByP105s4FileSeqNo", query = "SELECT m FROM McCurCrssRt m WHERE m.mcCurCrssRtPK.p105s4FileSeqNo = :p105s4FileSeqNo"),
    @NamedQuery(name = "McCurCrssRt.findByD71MsgNo", query = "SELECT m FROM McCurCrssRt m WHERE m.mcCurCrssRtPK.d71MsgNo = :d71MsgNo"),
    @NamedQuery(name = "McCurCrssRt.findByP164s1CurrCd", query = "SELECT m FROM McCurCrssRt m WHERE m.p164s1CurrCd = :p164s1CurrCd"),
    @NamedQuery(name = "McCurCrssRt.findByP164s2CurCnvRt", query = "SELECT m FROM McCurCrssRt m WHERE m.p164s2CurCnvRt = :p164s2CurCnvRt"),
    @NamedQuery(name = "McCurCrssRt.findByP164s3CurCnvTy", query = "SELECT m FROM McCurCrssRt m WHERE m.p164s3CurCnvTy = :p164s3CurCnvTy"),
    @NamedQuery(name = "McCurCrssRt.findByP164s4BusDt", query = "SELECT m FROM McCurCrssRt m WHERE m.p164s4BusDt = :p164s4BusDt"),
    @NamedQuery(name = "McCurCrssRt.findByP164s5ClCyc", query = "SELECT m FROM McCurCrssRt m WHERE m.p164s5ClCyc = :p164s5ClCyc"),
    @NamedQuery(name = "McCurCrssRt.findByOccInd", query = "SELECT m FROM McCurCrssRt m WHERE m.mcCurCrssRtPK.occInd = :occInd")})
public class McCurCrssRt implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected McCurCrssRtPK mcCurCrssRtPK;
    @Column(name = "P164S1_CURR_CD")
    private Short p164s1CurrCd;
    @Column(name = "P164S2_CUR_CNV_RT")
    private Long p164s2CurCnvRt;
    @Column(name = "P164S3_CUR_CNV_TY")
    private Character p164s3CurCnvTy;
    @Column(name = "P164S4_BUS_DT")
    private Integer p164s4BusDt;
    @Column(name = "P164S5_CL_CYC")
    private Short p164s5ClCyc;

    public McCurCrssRt() {
    }

    public McCurCrssRt(McCurCrssRtPK mcCurCrssRtPK) {
        this.mcCurCrssRtPK = mcCurCrssRtPK;
    }

    public McCurCrssRt(short p105s1FileTy, int p105s2FileRDt, long p105s3ProcId, int p105s4FileSeqNo, int d71MsgNo, short occInd) {
        this.mcCurCrssRtPK = new McCurCrssRtPK(p105s1FileTy, p105s2FileRDt, p105s3ProcId, p105s4FileSeqNo, d71MsgNo, occInd);
    }

    public McCurCrssRtPK getMcCurCrssRtPK() {
        return mcCurCrssRtPK;
    }

    public void setMcCurCrssRtPK(McCurCrssRtPK mcCurCrssRtPK) {
        this.mcCurCrssRtPK = mcCurCrssRtPK;
    }

    public Short getP164s1CurrCd() {
        return p164s1CurrCd;
    }

    public void setP164s1CurrCd(Short p164s1CurrCd) {
        this.p164s1CurrCd = p164s1CurrCd;
    }

    public Long getP164s2CurCnvRt() {
        return p164s2CurCnvRt;
    }

    public void setP164s2CurCnvRt(Long p164s2CurCnvRt) {
        this.p164s2CurCnvRt = p164s2CurCnvRt;
    }

    public Character getP164s3CurCnvTy() {
        return p164s3CurCnvTy;
    }

    public void setP164s3CurCnvTy(Character p164s3CurCnvTy) {
        this.p164s3CurCnvTy = p164s3CurCnvTy;
    }

    public Integer getP164s4BusDt() {
        return p164s4BusDt;
    }

    public void setP164s4BusDt(Integer p164s4BusDt) {
        this.p164s4BusDt = p164s4BusDt;
    }

    public Short getP164s5ClCyc() {
        return p164s5ClCyc;
    }

    public void setP164s5ClCyc(Short p164s5ClCyc) {
        this.p164s5ClCyc = p164s5ClCyc;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mcCurCrssRtPK != null ? mcCurCrssRtPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof McCurCrssRt)) {
            return false;
        }
        McCurCrssRt other = (McCurCrssRt) object;
        if ((this.mcCurCrssRtPK == null && other.mcCurCrssRtPK != null) || (this.mcCurCrssRtPK != null && !this.mcCurCrssRtPK.equals(other.mcCurCrssRtPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.cxxcow.McCurCrssRt[ mcCurCrssRtPK=" + mcCurCrssRtPK + " ]";
    }
    
}
