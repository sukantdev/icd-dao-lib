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
@Table(name = "MC_CUR_EXP", catalog = "", schema = "CXXCOW")
@NamedQueries({
    @NamedQuery(name = "McCurExp.findAll", query = "SELECT m FROM McCurExp m"),
    @NamedQuery(name = "McCurExp.findByP105s1FileTy", query = "SELECT m FROM McCurExp m WHERE m.mcCurExpPK.p105s1FileTy = :p105s1FileTy"),
    @NamedQuery(name = "McCurExp.findByP105s2FileRDt", query = "SELECT m FROM McCurExp m WHERE m.mcCurExpPK.p105s2FileRDt = :p105s2FileRDt"),
    @NamedQuery(name = "McCurExp.findByP105s3ProcId", query = "SELECT m FROM McCurExp m WHERE m.mcCurExpPK.p105s3ProcId = :p105s3ProcId"),
    @NamedQuery(name = "McCurExp.findByP105s4FileSeqNo", query = "SELECT m FROM McCurExp m WHERE m.mcCurExpPK.p105s4FileSeqNo = :p105s4FileSeqNo"),
    @NamedQuery(name = "McCurExp.findByP148s1CurrCd", query = "SELECT m FROM McCurExp m WHERE m.p148s1CurrCd = :p148s1CurrCd"),
    @NamedQuery(name = "McCurExp.findByP148s2CurrExp", query = "SELECT m FROM McCurExp m WHERE m.p148s2CurrExp = :p148s2CurrExp"),
    @NamedQuery(name = "McCurExp.findByD71MsgNo", query = "SELECT m FROM McCurExp m WHERE m.mcCurExpPK.d71MsgNo = :d71MsgNo"),
    @NamedQuery(name = "McCurExp.findByOccInd", query = "SELECT m FROM McCurExp m WHERE m.mcCurExpPK.occInd = :occInd")})
public class McCurExp implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected McCurExpPK mcCurExpPK;
    @Column(name = "P148S1_CURR_CD")
    private Integer p148s1CurrCd;
    @Column(name = "P148S2_CURR_EXP")
    private Character p148s2CurrExp;

    public McCurExp() {
    }

    public McCurExp(McCurExpPK mcCurExpPK) {
        this.mcCurExpPK = mcCurExpPK;
    }

    public McCurExp(short p105s1FileTy, int p105s2FileRDt, long p105s3ProcId, int p105s4FileSeqNo, int d71MsgNo, short occInd) {
        this.mcCurExpPK = new McCurExpPK(p105s1FileTy, p105s2FileRDt, p105s3ProcId, p105s4FileSeqNo, d71MsgNo, occInd);
    }

    public McCurExpPK getMcCurExpPK() {
        return mcCurExpPK;
    }

    public void setMcCurExpPK(McCurExpPK mcCurExpPK) {
        this.mcCurExpPK = mcCurExpPK;
    }

    public Integer getP148s1CurrCd() {
        return p148s1CurrCd;
    }

    public void setP148s1CurrCd(Integer p148s1CurrCd) {
        this.p148s1CurrCd = p148s1CurrCd;
    }

    public Character getP148s2CurrExp() {
        return p148s2CurrExp;
    }

    public void setP148s2CurrExp(Character p148s2CurrExp) {
        this.p148s2CurrExp = p148s2CurrExp;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mcCurExpPK != null ? mcCurExpPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof McCurExp)) {
            return false;
        }
        McCurExp other = (McCurExp) object;
        if ((this.mcCurExpPK == null && other.mcCurExpPK != null) || (this.mcCurExpPK != null && !this.mcCurExpPK.equals(other.mcCurExpPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.cxxcow.McCurExp[ mcCurExpPK=" + mcCurExpPK + " ]";
    }
    
}
