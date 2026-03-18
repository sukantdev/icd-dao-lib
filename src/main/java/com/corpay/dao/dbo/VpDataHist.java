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
@Table(name = "VP_DATA_HIST", catalog = "", schema = "DBO")
public class VpDataHist implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected VpDataHistPK vpDataHistPK;
    @Basic(optional = false)
    @Column(name = "CUST_VEND")
    private String custVend;
    @Basic(optional = false)
    @Column(name = "P_ADDR1")
    private String pAddr1;
    @Basic(optional = false)
    @Column(name = "P_ADDR2")
    private String pAddr2;
    @Basic(optional = false)
    @Column(name = "P_CITY")
    private String pCity;
    @Basic(optional = false)
    @Column(name = "P_ST")
    private String pSt;
    @Basic(optional = false)
    @Column(name = "P_ZIP")
    private String pZip;
    @Basic(optional = false)
    @Column(name = "MDY_USR")
    private String mdyUsr;
    @Basic(optional = false)
    @Column(name = "MDY_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date mdyTs;
    @Basic(optional = false)
    @Column(name = "CRT_USR")
    private String crtUsr;

    public VpDataHist() {
    }

    public VpDataHist(VpDataHistPK vpDataHistPK) {
        this.vpDataHistPK = vpDataHistPK;
    }

    public VpDataHist(VpDataHistPK vpDataHistPK, String custVend, String pAddr1, String pAddr2, String pCity, String pSt, String pZip, String mdyUsr, Date mdyTs, String crtUsr) {
        this.vpDataHistPK = vpDataHistPK;
        this.custVend = custVend;
        this.pAddr1 = pAddr1;
        this.pAddr2 = pAddr2;
        this.pCity = pCity;
        this.pSt = pSt;
        this.pZip = pZip;
        this.mdyUsr = mdyUsr;
        this.mdyTs = mdyTs;
        this.crtUsr = crtUsr;
    }

    public VpDataHist(String mastId, Date crtTs) {
        this.vpDataHistPK = new VpDataHistPK(mastId, crtTs);
    }

    public VpDataHistPK getVpDataHistPK() {
        return vpDataHistPK;
    }

    public void setVpDataHistPK(VpDataHistPK vpDataHistPK) {
        this.vpDataHistPK = vpDataHistPK;
    }

    public String getCustVend() {
        return custVend;
    }

    public void setCustVend(String custVend) {
        this.custVend = custVend;
    }

    public String getPAddr1() {
        return pAddr1;
    }

    public void setPAddr1(String pAddr1) {
        this.pAddr1 = pAddr1;
    }

    public String getPAddr2() {
        return pAddr2;
    }

    public void setPAddr2(String pAddr2) {
        this.pAddr2 = pAddr2;
    }

    public String getPCity() {
        return pCity;
    }

    public void setPCity(String pCity) {
        this.pCity = pCity;
    }

    public String getPSt() {
        return pSt;
    }

    public void setPSt(String pSt) {
        this.pSt = pSt;
    }

    public String getPZip() {
        return pZip;
    }

    public void setPZip(String pZip) {
        this.pZip = pZip;
    }

    public String getMdyUsr() {
        return mdyUsr;
    }

    public void setMdyUsr(String mdyUsr) {
        this.mdyUsr = mdyUsr;
    }

    public Date getMdyTs() {
        return mdyTs;
    }

    public void setMdyTs(Date mdyTs) {
        this.mdyTs = mdyTs;
    }

    public String getCrtUsr() {
        return crtUsr;
    }

    public void setCrtUsr(String crtUsr) {
        this.crtUsr = crtUsr;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (vpDataHistPK != null ? vpDataHistPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof VpDataHist)) {
            return false;
        }
        VpDataHist other = (VpDataHist) object;
        if ((this.vpDataHistPK == null && other.vpDataHistPK != null) || (this.vpDataHistPK != null && !this.vpDataHistPK.equals(other.vpDataHistPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.VpDataHist[ vpDataHistPK=" + vpDataHistPK + " ]";
    }

}
