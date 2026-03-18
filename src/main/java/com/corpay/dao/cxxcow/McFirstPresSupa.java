package com.corpay.dao.cxxcow;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "MC_FIRST_PRES_SUPA", catalog = "", schema = "CXXCOW")
public class McFirstPresSupa implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected McFirstPresSupaPK mcFirstPresSupaPK;
    @Column(name = "D14_EXP_DT")
    private Short d14ExpDt;
    @Column(name = "P022_REC_PMT_IND")
    private Short p022RecPmtInd;
    @Column(name = "P043_PGM_REGSTN")
    private String p043PgmRegstn;
    @Column(name = "P172_SOLE_PRO_NM")
    private String p172SoleProNm;
    @Basic(optional = false)
    @Column(name = "P044S1_CVC_VAL_IND")
    private Character p044s1CvcValInd;
    @Basic(optional = false)
    @Column(name = "P044S2_QPS_CB_IND")
    private Character p044s2QpsCbInd;

    public McFirstPresSupa() {
    }

    public McFirstPresSupa(McFirstPresSupaPK mcFirstPresSupaPK) {
        this.mcFirstPresSupaPK = mcFirstPresSupaPK;
    }

    public McFirstPresSupa(McFirstPresSupaPK mcFirstPresSupaPK, Character p044s1CvcValInd, Character p044s2QpsCbInd) {
        this.mcFirstPresSupaPK = mcFirstPresSupaPK;
        this.p044s1CvcValInd = p044s1CvcValInd;
        this.p044s2QpsCbInd = p044s2QpsCbInd;
    }

    public McFirstPresSupa(short p105s1FileTy, int p105s2FileRDt, long p105s3ProcId, int p105s4FileSeqNo, int d71MsgNo) {
        this.mcFirstPresSupaPK = new McFirstPresSupaPK(p105s1FileTy, p105s2FileRDt, p105s3ProcId, p105s4FileSeqNo, d71MsgNo);
    }

    public McFirstPresSupaPK getMcFirstPresSupaPK() {
        return mcFirstPresSupaPK;
    }

    public void setMcFirstPresSupaPK(McFirstPresSupaPK mcFirstPresSupaPK) {
        this.mcFirstPresSupaPK = mcFirstPresSupaPK;
    }

    public Short getD14ExpDt() {
        return d14ExpDt;
    }

    public void setD14ExpDt(Short d14ExpDt) {
        this.d14ExpDt = d14ExpDt;
    }

    public Short getP022RecPmtInd() {
        return p022RecPmtInd;
    }

    public void setP022RecPmtInd(Short p022RecPmtInd) {
        this.p022RecPmtInd = p022RecPmtInd;
    }

    public String getP043PgmRegstn() {
        return p043PgmRegstn;
    }

    public void setP043PgmRegstn(String p043PgmRegstn) {
        this.p043PgmRegstn = p043PgmRegstn;
    }

    public String getP172SoleProNm() {
        return p172SoleProNm;
    }

    public void setP172SoleProNm(String p172SoleProNm) {
        this.p172SoleProNm = p172SoleProNm;
    }

    public Character getP044s1CvcValInd() {
        return p044s1CvcValInd;
    }

    public void setP044s1CvcValInd(Character p044s1CvcValInd) {
        this.p044s1CvcValInd = p044s1CvcValInd;
    }

    public Character getP044s2QpsCbInd() {
        return p044s2QpsCbInd;
    }

    public void setP044s2QpsCbInd(Character p044s2QpsCbInd) {
        this.p044s2QpsCbInd = p044s2QpsCbInd;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mcFirstPresSupaPK != null ? mcFirstPresSupaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof McFirstPresSupa)) {
            return false;
        }
        McFirstPresSupa other = (McFirstPresSupa) object;
        if ((this.mcFirstPresSupaPK == null && other.mcFirstPresSupaPK != null) || (this.mcFirstPresSupaPK != null && !this.mcFirstPresSupaPK.equals(other.mcFirstPresSupaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.cxxcow.McFirstPresSupa[ mcFirstPresSupaPK=" + mcFirstPresSupaPK + " ]";
    }

}
