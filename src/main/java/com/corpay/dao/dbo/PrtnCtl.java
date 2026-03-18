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
@Table(name = "PRTN_CTL", catalog = "", schema = "DBO")
public class PrtnCtl implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "TABLE_NM")
    private String tableNm;
    @Basic(optional = false)
    @Column(name = "PRTN_DT")
    @Temporal(TemporalType.DATE)
    private Date prtnDt;
    @Basic(optional = false)
    @Column(name = "PRTN_NBR")
    private int prtnNbr;
    @Basic(optional = false)
    @Column(name = "PRTN_NBR_MAX")
    private int prtnNbrMax;
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

    public PrtnCtl() {
    }

    public PrtnCtl(String tableNm) {
        this.tableNm = tableNm;
    }

    public PrtnCtl(String tableNm, Date prtnDt, int prtnNbr, int prtnNbrMax, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.tableNm = tableNm;
        this.prtnDt = prtnDt;
        this.prtnNbr = prtnNbr;
        this.prtnNbrMax = prtnNbrMax;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public String getTableNm() {
        return tableNm;
    }

    public void setTableNm(String tableNm) {
        this.tableNm = tableNm;
    }

    public Date getPrtnDt() {
        return prtnDt;
    }

    public void setPrtnDt(Date prtnDt) {
        this.prtnDt = prtnDt;
    }

    public int getPrtnNbr() {
        return prtnNbr;
    }

    public void setPrtnNbr(int prtnNbr) {
        this.prtnNbr = prtnNbr;
    }

    public int getPrtnNbrMax() {
        return prtnNbrMax;
    }

    public void setPrtnNbrMax(int prtnNbrMax) {
        this.prtnNbrMax = prtnNbrMax;
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
        hash += (tableNm != null ? tableNm.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof PrtnCtl)) {
            return false;
        }
        PrtnCtl other = (PrtnCtl) object;
        if ((this.tableNm == null && other.tableNm != null) || (this.tableNm != null && !this.tableNm.equals(other.tableNm))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.PrtnCtl[ tableNm=" + tableNm + " ]";
    }

}
