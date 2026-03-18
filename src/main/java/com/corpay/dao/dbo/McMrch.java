package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "MC_MRCH", catalog = "", schema = "DBO")
public class McMrch implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "MC_MRCH_CD")
    private String mcMrchCd;
    @Basic(optional = false)
    @Column(name = "MC_MRCH_PRD_CD")
    private String mcMrchPrdCd;
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
    @Column(name = "MC_MRCH_SJD_SUB_PROD_CD_1")
    private int mcMrchSjdSubProdCd1;
    @Basic(optional = false)
    @Column(name = "MC_MRCH_SJD_SUB_PROD_CD_2")
    private int mcMrchSjdSubProdCd2;

    public McMrch() {
    }

    public McMrch(String mcMrchCd) {
        this.mcMrchCd = mcMrchCd;
    }

    public McMrch(String mcMrchCd, String mcMrchPrdCd, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr, int mcMrchSjdSubProdCd1, int mcMrchSjdSubProdCd2) {
        this.mcMrchCd = mcMrchCd;
        this.mcMrchPrdCd = mcMrchPrdCd;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
        this.mcMrchSjdSubProdCd1 = mcMrchSjdSubProdCd1;
        this.mcMrchSjdSubProdCd2 = mcMrchSjdSubProdCd2;
    }

    public String getMcMrchCd() {
        return mcMrchCd;
    }

    public void setMcMrchCd(String mcMrchCd) {
        this.mcMrchCd = mcMrchCd;
    }

    public String getMcMrchPrdCd() {
        return mcMrchPrdCd;
    }

    public void setMcMrchPrdCd(String mcMrchPrdCd) {
        this.mcMrchPrdCd = mcMrchPrdCd;
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

    public int getMcMrchSjdSubProdCd1() {
        return mcMrchSjdSubProdCd1;
    }

    public void setMcMrchSjdSubProdCd1(int mcMrchSjdSubProdCd1) {
        this.mcMrchSjdSubProdCd1 = mcMrchSjdSubProdCd1;
    }

    public int getMcMrchSjdSubProdCd2() {
        return mcMrchSjdSubProdCd2;
    }

    public void setMcMrchSjdSubProdCd2(int mcMrchSjdSubProdCd2) {
        this.mcMrchSjdSubProdCd2 = mcMrchSjdSubProdCd2;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mcMrchCd != null ? mcMrchCd.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof McMrch)) {
            return false;
        }
        McMrch other = (McMrch) object;
        if ((this.mcMrchCd == null && other.mcMrchCd != null) || (this.mcMrchCd != null && !this.mcMrchCd.equals(other.mcMrchCd))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.McMrch[ mcMrchCd=" + mcMrchCd + " ]";
    }

}
