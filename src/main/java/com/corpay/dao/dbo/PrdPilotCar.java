/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Sukant.Tiwari
 */
@Entity
@Table(name = "PRD_PILOT_CAR", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "PrdPilotCar.findAll", query = "SELECT p FROM PrdPilotCar p")})
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
        // TODO: Warning - this method won't work in the case the id fields are not set
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
