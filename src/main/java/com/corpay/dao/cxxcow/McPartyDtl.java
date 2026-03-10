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
@Table(name = "MC_PARTY_DTL", catalog = "", schema = "CXXCOW")
@NamedQueries({
    @NamedQuery(name = "McPartyDtl.findAll", query = "SELECT m FROM McPartyDtl m"),
    @NamedQuery(name = "McPartyDtl.findByP105s1FileTy", query = "SELECT m FROM McPartyDtl m WHERE m.mcPartyDtlPK.p105s1FileTy = :p105s1FileTy"),
    @NamedQuery(name = "McPartyDtl.findByP105s2FileRDt", query = "SELECT m FROM McPartyDtl m WHERE m.mcPartyDtlPK.p105s2FileRDt = :p105s2FileRDt"),
    @NamedQuery(name = "McPartyDtl.findByP105s3ProcId", query = "SELECT m FROM McPartyDtl m WHERE m.mcPartyDtlPK.p105s3ProcId = :p105s3ProcId"),
    @NamedQuery(name = "McPartyDtl.findByP105s4FileSeqNo", query = "SELECT m FROM McPartyDtl m WHERE m.mcPartyDtlPK.p105s4FileSeqNo = :p105s4FileSeqNo"),
    @NamedQuery(name = "McPartyDtl.findByD71MsgNo", query = "SELECT m FROM McPartyDtl m WHERE m.mcPartyDtlPK.d71MsgNo = :d71MsgNo"),
    @NamedQuery(name = "McPartyDtl.findByOccInd", query = "SELECT m FROM McPartyDtl m WHERE m.mcPartyDtlPK.occInd = :occInd"),
    @NamedQuery(name = "McPartyDtl.findByP594s1PartyDesc", query = "SELECT m FROM McPartyDtl m WHERE m.p594s1PartyDesc = :p594s1PartyDesc"),
    @NamedQuery(name = "McPartyDtl.findByP594s2PartyCntct", query = "SELECT m FROM McPartyDtl m WHERE m.p594s2PartyCntct = :p594s2PartyCntct")})
public class McPartyDtl implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected McPartyDtlPK mcPartyDtlPK;
    @Basic(optional = false)
    @Column(name = "P594S1_PARTY_DESC")
    private Character p594s1PartyDesc;
    @Basic(optional = false)
    @Column(name = "P594S2_PARTY_CNTCT")
    private String p594s2PartyCntct;

    public McPartyDtl() {
    }

    public McPartyDtl(McPartyDtlPK mcPartyDtlPK) {
        this.mcPartyDtlPK = mcPartyDtlPK;
    }

    public McPartyDtl(McPartyDtlPK mcPartyDtlPK, Character p594s1PartyDesc, String p594s2PartyCntct) {
        this.mcPartyDtlPK = mcPartyDtlPK;
        this.p594s1PartyDesc = p594s1PartyDesc;
        this.p594s2PartyCntct = p594s2PartyCntct;
    }

    public McPartyDtl(short p105s1FileTy, int p105s2FileRDt, long p105s3ProcId, int p105s4FileSeqNo, int d71MsgNo, short occInd) {
        this.mcPartyDtlPK = new McPartyDtlPK(p105s1FileTy, p105s2FileRDt, p105s3ProcId, p105s4FileSeqNo, d71MsgNo, occInd);
    }

    public McPartyDtlPK getMcPartyDtlPK() {
        return mcPartyDtlPK;
    }

    public void setMcPartyDtlPK(McPartyDtlPK mcPartyDtlPK) {
        this.mcPartyDtlPK = mcPartyDtlPK;
    }

    public Character getP594s1PartyDesc() {
        return p594s1PartyDesc;
    }

    public void setP594s1PartyDesc(Character p594s1PartyDesc) {
        this.p594s1PartyDesc = p594s1PartyDesc;
    }

    public String getP594s2PartyCntct() {
        return p594s2PartyCntct;
    }

    public void setP594s2PartyCntct(String p594s2PartyCntct) {
        this.p594s2PartyCntct = p594s2PartyCntct;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mcPartyDtlPK != null ? mcPartyDtlPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof McPartyDtl)) {
            return false;
        }
        McPartyDtl other = (McPartyDtl) object;
        if ((this.mcPartyDtlPK == null && other.mcPartyDtlPK != null) || (this.mcPartyDtlPK != null && !this.mcPartyDtlPK.equals(other.mcPartyDtlPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.cxxcow.McPartyDtl[ mcPartyDtlPK=" + mcPartyDtlPK + " ]";
    }
    
}
