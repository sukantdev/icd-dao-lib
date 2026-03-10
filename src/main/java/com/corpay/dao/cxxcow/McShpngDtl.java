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
@Table(name = "MC_SHPNG_DTL", catalog = "", schema = "CXXCOW")
@NamedQueries({
    @NamedQuery(name = "McShpngDtl.findAll", query = "SELECT m FROM McShpngDtl m"),
    @NamedQuery(name = "McShpngDtl.findByP105s1FileTy", query = "SELECT m FROM McShpngDtl m WHERE m.mcShpngDtlPK.p105s1FileTy = :p105s1FileTy"),
    @NamedQuery(name = "McShpngDtl.findByP105s2FileRDt", query = "SELECT m FROM McShpngDtl m WHERE m.mcShpngDtlPK.p105s2FileRDt = :p105s2FileRDt"),
    @NamedQuery(name = "McShpngDtl.findByP105s3ProcId", query = "SELECT m FROM McShpngDtl m WHERE m.mcShpngDtlPK.p105s3ProcId = :p105s3ProcId"),
    @NamedQuery(name = "McShpngDtl.findByP105s4FileSeqNo", query = "SELECT m FROM McShpngDtl m WHERE m.mcShpngDtlPK.p105s4FileSeqNo = :p105s4FileSeqNo"),
    @NamedQuery(name = "McShpngDtl.findByD71MsgNo", query = "SELECT m FROM McShpngDtl m WHERE m.mcShpngDtlPK.d71MsgNo = :d71MsgNo"),
    @NamedQuery(name = "McShpngDtl.findByOccInd", query = "SELECT m FROM McShpngDtl m WHERE m.mcShpngDtlPK.occInd = :occInd"),
    @NamedQuery(name = "McShpngDtl.findByP747s1SPartyDes", query = "SELECT m FROM McShpngDtl m WHERE m.p747s1SPartyDes = :p747s1SPartyDes"),
    @NamedQuery(name = "McShpngDtl.findByP747s2SPartyCnt", query = "SELECT m FROM McShpngDtl m WHERE m.p747s2SPartyCnt = :p747s2SPartyCnt")})
public class McShpngDtl implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected McShpngDtlPK mcShpngDtlPK;
    @Basic(optional = false)
    @Column(name = "P747S1_S_PARTY_DES")
    private Character p747s1SPartyDes;
    @Basic(optional = false)
    @Column(name = "P747S2_S_PARTY_CNT")
    private String p747s2SPartyCnt;

    public McShpngDtl() {
    }

    public McShpngDtl(McShpngDtlPK mcShpngDtlPK) {
        this.mcShpngDtlPK = mcShpngDtlPK;
    }

    public McShpngDtl(McShpngDtlPK mcShpngDtlPK, Character p747s1SPartyDes, String p747s2SPartyCnt) {
        this.mcShpngDtlPK = mcShpngDtlPK;
        this.p747s1SPartyDes = p747s1SPartyDes;
        this.p747s2SPartyCnt = p747s2SPartyCnt;
    }

    public McShpngDtl(short p105s1FileTy, int p105s2FileRDt, long p105s3ProcId, int p105s4FileSeqNo, int d71MsgNo, short occInd) {
        this.mcShpngDtlPK = new McShpngDtlPK(p105s1FileTy, p105s2FileRDt, p105s3ProcId, p105s4FileSeqNo, d71MsgNo, occInd);
    }

    public McShpngDtlPK getMcShpngDtlPK() {
        return mcShpngDtlPK;
    }

    public void setMcShpngDtlPK(McShpngDtlPK mcShpngDtlPK) {
        this.mcShpngDtlPK = mcShpngDtlPK;
    }

    public Character getP747s1SPartyDes() {
        return p747s1SPartyDes;
    }

    public void setP747s1SPartyDes(Character p747s1SPartyDes) {
        this.p747s1SPartyDes = p747s1SPartyDes;
    }

    public String getP747s2SPartyCnt() {
        return p747s2SPartyCnt;
    }

    public void setP747s2SPartyCnt(String p747s2SPartyCnt) {
        this.p747s2SPartyCnt = p747s2SPartyCnt;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mcShpngDtlPK != null ? mcShpngDtlPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof McShpngDtl)) {
            return false;
        }
        McShpngDtl other = (McShpngDtl) object;
        if ((this.mcShpngDtlPK == null && other.mcShpngDtlPK != null) || (this.mcShpngDtlPK != null && !this.mcShpngDtlPK.equals(other.mcShpngDtlPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.cxxcow.McShpngDtl[ mcShpngDtlPK=" + mcShpngDtlPK + " ]";
    }
    
}
