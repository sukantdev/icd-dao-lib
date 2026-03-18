package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "PRD_PRMTS_CR_CRD", catalog = "", schema = "DBO")
public class PrdPrmtsCrCrd implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "APPL_NBR")
    private String applNbr;

    @Basic(optional = false)
    @Column(name = "AVG_MTHLY_TL")
    private BigDecimal avgMthlyTl;
    @Basic(optional = false)
    @Column(name = "ORD_TM_DY_FLG")
    private Character ordTmDyFlg;
    @Basic(optional = false)
    @Column(name = "ORD_TM_FLG_NIGHT")
    private Character ordTmFlgNight;
    @Basic(optional = false)
    @Column(name = "ORD_TM_EVNG_FLG")
    private Character ordTmEvngFlg;
    @Basic(optional = false)
    @Column(name = "WKND_FLG")
    private Character wkndFlg;
    @Basic(optional = false)
    @Column(name = "NBR_DRVS")
    private int nbrDrvs;
    @Basic(optional = false)
    @Column(name = "NBR_TRUCKS")
    private int nbrTrucks;
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

    public PrdPrmtsCrCrd() {
    }

    public PrdPrmtsCrCrd(String applNbr) {
        this.applNbr = applNbr;
    }

    public PrdPrmtsCrCrd(String applNbr, BigDecimal avgMthlyTl, Character ordTmDyFlg, Character ordTmFlgNight, Character ordTmEvngFlg, Character wkndFlg, int nbrDrvs, int nbrTrucks, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.applNbr = applNbr;
        this.avgMthlyTl = avgMthlyTl;
        this.ordTmDyFlg = ordTmDyFlg;
        this.ordTmFlgNight = ordTmFlgNight;
        this.ordTmEvngFlg = ordTmEvngFlg;
        this.wkndFlg = wkndFlg;
        this.nbrDrvs = nbrDrvs;
        this.nbrTrucks = nbrTrucks;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public String getApplNbr() {
        return applNbr;
    }

    public void setApplNbr(String applNbr) {
        this.applNbr = applNbr;
    }

    public BigDecimal getAvgMthlyTl() {
        return avgMthlyTl;
    }

    public void setAvgMthlyTl(BigDecimal avgMthlyTl) {
        this.avgMthlyTl = avgMthlyTl;
    }

    public Character getOrdTmDyFlg() {
        return ordTmDyFlg;
    }

    public void setOrdTmDyFlg(Character ordTmDyFlg) {
        this.ordTmDyFlg = ordTmDyFlg;
    }

    public Character getOrdTmFlgNight() {
        return ordTmFlgNight;
    }

    public void setOrdTmFlgNight(Character ordTmFlgNight) {
        this.ordTmFlgNight = ordTmFlgNight;
    }

    public Character getOrdTmEvngFlg() {
        return ordTmEvngFlg;
    }

    public void setOrdTmEvngFlg(Character ordTmEvngFlg) {
        this.ordTmEvngFlg = ordTmEvngFlg;
    }

    public Character getWkndFlg() {
        return wkndFlg;
    }

    public void setWkndFlg(Character wkndFlg) {
        this.wkndFlg = wkndFlg;
    }

    public int getNbrDrvs() {
        return nbrDrvs;
    }

    public void setNbrDrvs(int nbrDrvs) {
        this.nbrDrvs = nbrDrvs;
    }

    public int getNbrTrucks() {
        return nbrTrucks;
    }

    public void setNbrTrucks(int nbrTrucks) {
        this.nbrTrucks = nbrTrucks;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (applNbr != null ? applNbr.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof PrdPrmtsCrCrd)) {
            return false;
        }
        PrdPrmtsCrCrd other = (PrdPrmtsCrCrd) object;
        if ((this.applNbr == null && other.applNbr != null) || (this.applNbr != null && !this.applNbr.equals(other.applNbr))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.PrdPrmtsCrCrd[ applNbr=" + applNbr + " ]";
    }

}
