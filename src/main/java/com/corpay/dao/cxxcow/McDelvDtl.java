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

/**
 *
 * @author Sukant.Tiwari
 */
@Entity
@Table(name = "MC_DELV_DTL", catalog = "", schema = "CXXCOW")
@NamedQueries({
    @NamedQuery(name = "McDelvDtl.findAll", query = "SELECT m FROM McDelvDtl m"),
    @NamedQuery(name = "McDelvDtl.findByP105s1FileTy", query = "SELECT m FROM McDelvDtl m WHERE m.mcDelvDtlPK.p105s1FileTy = :p105s1FileTy"),
    @NamedQuery(name = "McDelvDtl.findByP105s2FileRDt", query = "SELECT m FROM McDelvDtl m WHERE m.mcDelvDtlPK.p105s2FileRDt = :p105s2FileRDt"),
    @NamedQuery(name = "McDelvDtl.findByP105s3ProcId", query = "SELECT m FROM McDelvDtl m WHERE m.mcDelvDtlPK.p105s3ProcId = :p105s3ProcId"),
    @NamedQuery(name = "McDelvDtl.findByP105s4FileSeqNo", query = "SELECT m FROM McDelvDtl m WHERE m.mcDelvDtlPK.p105s4FileSeqNo = :p105s4FileSeqNo"),
    @NamedQuery(name = "McDelvDtl.findByD71MsgNo", query = "SELECT m FROM McDelvDtl m WHERE m.mcDelvDtlPK.d71MsgNo = :d71MsgNo"),
    @NamedQuery(name = "McDelvDtl.findByOccInd", query = "SELECT m FROM McDelvDtl m WHERE m.mcDelvDtlPK.occInd = :occInd"),
    @NamedQuery(name = "McDelvDtl.findByP754s1DelvDesc", query = "SELECT m FROM McDelvDtl m WHERE m.p754s1DelvDesc = :p754s1DelvDesc"),
    @NamedQuery(name = "McDelvDtl.findByP754s2DelvCntct", query = "SELECT m FROM McDelvDtl m WHERE m.p754s2DelvCntct = :p754s2DelvCntct")})
public class McDelvDtl implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected McDelvDtlPK mcDelvDtlPK;
    @Basic(optional = false)
    @Column(name = "P754S1_DELV_DESC")
    private Character p754s1DelvDesc;
    @Basic(optional = false)
    @Column(name = "P754S2_DELV_CNTCT")
    private String p754s2DelvCntct;

    public McDelvDtl() {
    }

    public McDelvDtl(McDelvDtlPK mcDelvDtlPK) {
        this.mcDelvDtlPK = mcDelvDtlPK;
    }

    public McDelvDtl(McDelvDtlPK mcDelvDtlPK, Character p754s1DelvDesc, String p754s2DelvCntct) {
        this.mcDelvDtlPK = mcDelvDtlPK;
        this.p754s1DelvDesc = p754s1DelvDesc;
        this.p754s2DelvCntct = p754s2DelvCntct;
    }

    public McDelvDtl(short p105s1FileTy, int p105s2FileRDt, long p105s3ProcId, int p105s4FileSeqNo, int d71MsgNo, short occInd) {
        this.mcDelvDtlPK = new McDelvDtlPK(p105s1FileTy, p105s2FileRDt, p105s3ProcId, p105s4FileSeqNo, d71MsgNo, occInd);
    }

    public McDelvDtlPK getMcDelvDtlPK() {
        return mcDelvDtlPK;
    }

    public void setMcDelvDtlPK(McDelvDtlPK mcDelvDtlPK) {
        this.mcDelvDtlPK = mcDelvDtlPK;
    }

    public Character getP754s1DelvDesc() {
        return p754s1DelvDesc;
    }

    public void setP754s1DelvDesc(Character p754s1DelvDesc) {
        this.p754s1DelvDesc = p754s1DelvDesc;
    }

    public String getP754s2DelvCntct() {
        return p754s2DelvCntct;
    }

    public void setP754s2DelvCntct(String p754s2DelvCntct) {
        this.p754s2DelvCntct = p754s2DelvCntct;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mcDelvDtlPK != null ? mcDelvDtlPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof McDelvDtl)) {
            return false;
        }
        McDelvDtl other = (McDelvDtl) object;
        if ((this.mcDelvDtlPK == null && other.mcDelvDtlPK != null) || (this.mcDelvDtlPK != null && !this.mcDelvDtlPK.equals(other.mcDelvDtlPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.cxxcow.McDelvDtl[ mcDelvDtlPK=" + mcDelvDtlPK + " ]";
    }
    
}
