package com.corpay.dao.cxxcow;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "MC_DELV_DTL", catalog = "", schema = "CXXCOW")
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
