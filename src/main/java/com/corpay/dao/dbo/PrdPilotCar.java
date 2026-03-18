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
@Table(name = "PRD_PILOT_CAR", catalog = "", schema = "DBO")
public class PrdPilotCar implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PrdPilotCarPK prdPilotCarPK;
    @Basic(optional = false)
    @Column(name = "PRMT_ACCT_CD")
    private String prmtAcctCd;
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

    public PrdPilotCar() {
    }

    public PrdPilotCar(PrdPilotCarPK prdPilotCarPK) {
        this.prdPilotCarPK = prdPilotCarPK;
    }

    public PrdPilotCar(PrdPilotCarPK prdPilotCarPK, String prmtAcctCd, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.prdPilotCarPK = prdPilotCarPK;
        this.prmtAcctCd = prmtAcctCd;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public PrdPilotCar(String applNbr, String childTyp) {
        this.prdPilotCarPK = new PrdPilotCarPK(applNbr, childTyp);
    }

    public PrdPilotCarPK getPrdPilotCarPK() {
        return prdPilotCarPK;
    }

    public void setPrdPilotCarPK(PrdPilotCarPK prdPilotCarPK) {
        this.prdPilotCarPK = prdPilotCarPK;
    }

    public String getPrmtAcctCd() {
        return prmtAcctCd;
    }

    public void setPrmtAcctCd(String prmtAcctCd) {
        this.prmtAcctCd = prmtAcctCd;
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
        hash += (prdPilotCarPK != null ? prdPilotCarPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof PrdPilotCar)) {
            return false;
        }
        PrdPilotCar other = (PrdPilotCar) object;
        if ((this.prdPilotCarPK == null && other.prdPilotCarPK != null) || (this.prdPilotCarPK != null && !this.prdPilotCarPK.equals(other.prdPilotCarPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.PrdPilotCar[ prdPilotCarPK=" + prdPilotCarPK + " ]";
    }

}
