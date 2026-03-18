package com.corpay.dao.cxxcow;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "MC_PARTY_DTL", catalog = "", schema = "CXXCOW")
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
