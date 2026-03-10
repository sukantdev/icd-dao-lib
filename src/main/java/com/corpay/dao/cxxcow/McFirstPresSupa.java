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
@Table(name = "MC_FIRST_PRES_SUPA", catalog = "", schema = "CXXCOW")
@NamedQueries({
    @NamedQuery(name = "McFirstPresSupa.findAll", query = "SELECT m FROM McFirstPresSupa m"),
    @NamedQuery(name = "McFirstPresSupa.findByP105s1FileTy", query = "SELECT m FROM McFirstPresSupa m WHERE m.mcFirstPresSupaPK.p105s1FileTy = :p105s1FileTy"),
    @NamedQuery(name = "McFirstPresSupa.findByP105s2FileRDt", query = "SELECT m FROM McFirstPresSupa m WHERE m.mcFirstPresSupaPK.p105s2FileRDt = :p105s2FileRDt"),
    @NamedQuery(name = "McFirstPresSupa.findByP105s3ProcId", query = "SELECT m FROM McFirstPresSupa m WHERE m.mcFirstPresSupaPK.p105s3ProcId = :p105s3ProcId"),
    @NamedQuery(name = "McFirstPresSupa.findByP105s4FileSeqNo", query = "SELECT m FROM McFirstPresSupa m WHERE m.mcFirstPresSupaPK.p105s4FileSeqNo = :p105s4FileSeqNo"),
    @NamedQuery(name = "McFirstPresSupa.findByD71MsgNo", query = "SELECT m FROM McFirstPresSupa m WHERE m.mcFirstPresSupaPK.d71MsgNo = :d71MsgNo"),
    @NamedQuery(name = "McFirstPresSupa.findByD14ExpDt", query = "SELECT m FROM McFirstPresSupa m WHERE m.d14ExpDt = :d14ExpDt"),
    @NamedQuery(name = "McFirstPresSupa.findByP022RecPmtInd", query = "SELECT m FROM McFirstPresSupa m WHERE m.p022RecPmtInd = :p022RecPmtInd"),
    @NamedQuery(name = "McFirstPresSupa.findByP043PgmRegstn", query = "SELECT m FROM McFirstPresSupa m WHERE m.p043PgmRegstn = :p043PgmRegstn"),
    @NamedQuery(name = "McFirstPresSupa.findByP172SoleProNm", query = "SELECT m FROM McFirstPresSupa m WHERE m.p172SoleProNm = :p172SoleProNm"),
    @NamedQuery(name = "McFirstPresSupa.findByP044s1CvcValInd", query = "SELECT m FROM McFirstPresSupa m WHERE m.p044s1CvcValInd = :p044s1CvcValInd"),
    @NamedQuery(name = "McFirstPresSupa.findByP044s2QpsCbInd", query = "SELECT m FROM McFirstPresSupa m WHERE m.p044s2QpsCbInd = :p044s2QpsCbInd")})
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
        // TODO: Warning - this method won't work in the case the id fields are not set
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
