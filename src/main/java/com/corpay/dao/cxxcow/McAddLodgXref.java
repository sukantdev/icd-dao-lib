package com.corpay.dao.cxxcow;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "MC_ADD_LODG_XREF", catalog = "", schema = "CXXCOW")
public class McAddLodgXref implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected McAddLodgXrefPK mcAddLodgXrefPK;
    @Basic(optional = false)
    @Column(name = "P660S1_CUSTREF_ID")
    private short p660s1CustrefId;
    @Basic(optional = false)
    @Column(name = "P660S2_CUSTREF_DTL")
    private String p660s2CustrefDtl;

    public McAddLodgXref() {
    }

    public McAddLodgXref(McAddLodgXrefPK mcAddLodgXrefPK) {
        this.mcAddLodgXrefPK = mcAddLodgXrefPK;
    }

    public McAddLodgXref(McAddLodgXrefPK mcAddLodgXrefPK, short p660s1CustrefId, String p660s2CustrefDtl) {
        this.mcAddLodgXrefPK = mcAddLodgXrefPK;
        this.p660s1CustrefId = p660s1CustrefId;
        this.p660s2CustrefDtl = p660s2CustrefDtl;
    }

    public McAddLodgXref(short p105s1FileTy, int p105s2FileRDt, long p105s3ProcId, int p105s4FileSeqNo, int d71MsgNo, short occInd) {
        this.mcAddLodgXrefPK = new McAddLodgXrefPK(p105s1FileTy, p105s2FileRDt, p105s3ProcId, p105s4FileSeqNo, d71MsgNo, occInd);
    }

    public McAddLodgXrefPK getMcAddLodgXrefPK() {
        return mcAddLodgXrefPK;
    }

    public void setMcAddLodgXrefPK(McAddLodgXrefPK mcAddLodgXrefPK) {
        this.mcAddLodgXrefPK = mcAddLodgXrefPK;
    }

    public short getP660s1CustrefId() {
        return p660s1CustrefId;
    }

    public void setP660s1CustrefId(short p660s1CustrefId) {
        this.p660s1CustrefId = p660s1CustrefId;
    }

    public String getP660s2CustrefDtl() {
        return p660s2CustrefDtl;
    }

    public void setP660s2CustrefDtl(String p660s2CustrefDtl) {
        this.p660s2CustrefDtl = p660s2CustrefDtl;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mcAddLodgXrefPK != null ? mcAddLodgXrefPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof McAddLodgXref)) {
            return false;
        }
        McAddLodgXref other = (McAddLodgXref) object;
        if ((this.mcAddLodgXrefPK == null && other.mcAddLodgXrefPK != null) || (this.mcAddLodgXrefPK != null && !this.mcAddLodgXrefPK.equals(other.mcAddLodgXrefPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.cxxcow.McAddLodgXref[ mcAddLodgXrefPK=" + mcAddLodgXrefPK + " ]";
    }

}
