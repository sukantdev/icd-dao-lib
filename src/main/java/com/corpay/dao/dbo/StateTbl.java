package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "STATE_TBL", catalog = "", schema = "DBO")
public class StateTbl implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected StateTblPK stateTblPK;
    @Basic(optional = false)
    @Column(name = "ST_N_CRTY_CD_3")
    private short stNCrtyCd3;
    @Basic(optional = false)
    @Column(name = "ST_X_CRTY_CD_2")
    private String stXCrtyCd2;
    @Basic(optional = false)
    @Column(name = "ST_N_CRTY_CD_2")
    private short stNCrtyCd2;
    @Basic(optional = false)
    @Column(name = "ST_NON_US")
    private Character stNonUs;
    @Basic(optional = false)
    @Column(name = "CRT_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date crtTs;
    @Basic(optional = false)
    @Column(name = "CRT_USR")
    private String crtUsr;
    @Basic(optional = false)
    @Column(name = "MDY_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date mdyTs;
    @Basic(optional = false)
    @Column(name = "MDY_USR")
    private String mdyUsr;
    @Basic(optional = false)
    @Column(name = "ST_NM")
    private String stNm;
    @Basic(optional = false)
    @Column(name = "ST_ORD_CD")
    private short stOrdCd;
    @Basic(optional = false)
    @Column(name = "ST_ORD_CRTY_CD")
    private short stOrdCrtyCd;

    public StateTbl() {
    }

    public StateTbl(StateTblPK stateTblPK) {
        this.stateTblPK = stateTblPK;
    }

    public StateTbl(StateTblPK stateTblPK, short stNCrtyCd3, String stXCrtyCd2, short stNCrtyCd2, Character stNonUs, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr, String stNm, short stOrdCd, short stOrdCrtyCd) {
        this.stateTblPK = stateTblPK;
        this.stNCrtyCd3 = stNCrtyCd3;
        this.stXCrtyCd2 = stXCrtyCd2;
        this.stNCrtyCd2 = stNCrtyCd2;
        this.stNonUs = stNonUs;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
        this.stNm = stNm;
        this.stOrdCd = stOrdCd;
        this.stOrdCrtyCd = stOrdCrtyCd;
    }

    public StateTbl(String stCd, String stXCrtyCd3) {
        this.stateTblPK = new StateTblPK(stCd, stXCrtyCd3);
    }

    public StateTblPK getStateTblPK() {
        return stateTblPK;
    }

    public void setStateTblPK(StateTblPK stateTblPK) {
        this.stateTblPK = stateTblPK;
    }

    public short getStNCrtyCd3() {
        return stNCrtyCd3;
    }

    public void setStNCrtyCd3(short stNCrtyCd3) {
        this.stNCrtyCd3 = stNCrtyCd3;
    }

    public String getStXCrtyCd2() {
        return stXCrtyCd2;
    }

    public void setStXCrtyCd2(String stXCrtyCd2) {
        this.stXCrtyCd2 = stXCrtyCd2;
    }

    public short getStNCrtyCd2() {
        return stNCrtyCd2;
    }

    public void setStNCrtyCd2(short stNCrtyCd2) {
        this.stNCrtyCd2 = stNCrtyCd2;
    }

    public Character getStNonUs() {
        return stNonUs;
    }

    public void setStNonUs(Character stNonUs) {
        this.stNonUs = stNonUs;
    }

    public Date getCrtTs() {
        return crtTs;
    }

    public void setCrtTs(Date crtTs) {
        this.crtTs = crtTs;
    }

    public String getCrtUsr() {
        return crtUsr;
    }

    public void setCrtUsr(String crtUsr) {
        this.crtUsr = crtUsr;
    }

    public Date getMdyTs() {
        return mdyTs;
    }

    public void setMdyTs(Date mdyTs) {
        this.mdyTs = mdyTs;
    }

    public String getMdyUsr() {
        return mdyUsr;
    }

    public void setMdyUsr(String mdyUsr) {
        this.mdyUsr = mdyUsr;
    }

    public String getStNm() {
        return stNm;
    }

    public void setStNm(String stNm) {
        this.stNm = stNm;
    }

    public short getStOrdCd() {
        return stOrdCd;
    }

    public void setStOrdCd(short stOrdCd) {
        this.stOrdCd = stOrdCd;
    }

    public short getStOrdCrtyCd() {
        return stOrdCrtyCd;
    }

    public void setStOrdCrtyCd(short stOrdCrtyCd) {
        this.stOrdCrtyCd = stOrdCrtyCd;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (stateTblPK != null ? stateTblPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof StateTbl)) {
            return false;
        }
        StateTbl other = (StateTbl) object;
        if ((this.stateTblPK == null && other.stateTblPK != null) || (this.stateTblPK != null && !this.stateTblPK.equals(other.stateTblPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.StateTbl[ stateTblPK=" + stateTblPK + " ]";
    }

}
