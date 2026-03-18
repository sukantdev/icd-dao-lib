package com.corpay.dao.cxxcow;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "MC_SHPNG_DTL", catalog = "", schema = "CXXCOW")
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
