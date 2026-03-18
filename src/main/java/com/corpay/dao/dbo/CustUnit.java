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
@Table(name = "CUST_UNIT", catalog = "", schema = "DBO")
public class CustUnit implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CustUnitPK custUnitPK;
    @Basic(optional = false)
    @Column(name = "VIN_NBR")
    private String vinNbr;
    @Basic(optional = false)
    @Column(name = "LIC_PLATE_NBR")
    private String licPlateNbr;
    @Basic(optional = false)
    @Column(name = "VEHICLE_DESC")
    private String vehicleDesc;
    @Basic(optional = false)
    @Column(name = "REG_EXP_DT")
    private short regExpDt;
    @Basic(optional = false)
    @Column(name = "MISC1_NBR")
    private String misc1Nbr;
    @Basic(optional = false)
    @Column(name = "MISC2_NBR")
    private String misc2Nbr;
    @Column(name = "CRT_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date crtTs;
    @Column(name = "CRT_USR")
    private String crtUsr;
    @Column(name = "MDY_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date mdyTs;
    @Column(name = "MDY_USR")
    private String mdyUsr;

    public CustUnit() {
    }

    public CustUnit(CustUnitPK custUnitPK) {
        this.custUnitPK = custUnitPK;
    }

    public CustUnit(CustUnitPK custUnitPK, String vinNbr, String licPlateNbr, String vehicleDesc, short regExpDt, String misc1Nbr, String misc2Nbr) {
        this.custUnitPK = custUnitPK;
        this.vinNbr = vinNbr;
        this.licPlateNbr = licPlateNbr;
        this.vehicleDesc = vehicleDesc;
        this.regExpDt = regExpDt;
        this.misc1Nbr = misc1Nbr;
        this.misc2Nbr = misc2Nbr;
    }

    public CustUnit(String custId, String unitId) {
        this.custUnitPK = new CustUnitPK(custId, unitId);
    }

    public CustUnitPK getCustUnitPK() {
        return custUnitPK;
    }

    public void setCustUnitPK(CustUnitPK custUnitPK) {
        this.custUnitPK = custUnitPK;
    }

    public String getVinNbr() {
        return vinNbr;
    }

    public void setVinNbr(String vinNbr) {
        this.vinNbr = vinNbr;
    }

    public String getLicPlateNbr() {
        return licPlateNbr;
    }

    public void setLicPlateNbr(String licPlateNbr) {
        this.licPlateNbr = licPlateNbr;
    }

    public String getVehicleDesc() {
        return vehicleDesc;
    }

    public void setVehicleDesc(String vehicleDesc) {
        this.vehicleDesc = vehicleDesc;
    }

    public short getRegExpDt() {
        return regExpDt;
    }

    public void setRegExpDt(short regExpDt) {
        this.regExpDt = regExpDt;
    }

    public String getMisc1Nbr() {
        return misc1Nbr;
    }

    public void setMisc1Nbr(String misc1Nbr) {
        this.misc1Nbr = misc1Nbr;
    }

    public String getMisc2Nbr() {
        return misc2Nbr;
    }

    public void setMisc2Nbr(String misc2Nbr) {
        this.misc2Nbr = misc2Nbr;
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
        hash += (custUnitPK != null ? custUnitPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof CustUnit)) {
            return false;
        }
        CustUnit other = (CustUnit) object;
        if ((this.custUnitPK == null && other.custUnitPK != null) || (this.custUnitPK != null && !this.custUnitPK.equals(other.custUnitPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.CustUnit[ custUnitPK=" + custUnitPK + " ]";
    }

}
