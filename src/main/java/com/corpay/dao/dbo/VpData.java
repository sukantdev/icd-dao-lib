/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
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
@Table(name = "VP_DATA", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "VpData.findAll", query = "SELECT v FROM VpData v")})
public class VpData implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "MAST_ID")
    private String mastId;
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
    @Column(name = "M_ADDR1")
    private String mAddr1;
    @Basic(optional = false)
    @Column(name = "M_ADDR2")
    private String mAddr2;
    @Basic(optional = false)
    @Column(name = "M_CITY")
    private String mCity;
    @Basic(optional = false)
    @Column(name = "M_ST")
    private String mSt;
    @Basic(optional = false)
    @Column(name = "M_ZIP")
    private String mZip;
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
    @Basic(optional = false)
    @Column(name = "CRT_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date crtTs;
    @Basic(optional = false)
    @Column(name = "CUST_BLNG_ADDR_1")
    private String custBlngAddr1;
    @Basic(optional = false)
    @Column(name = "CUST_BLNG_ADDR_2")
    private String custBlngAddr2;
    @Basic(optional = false)
    @Column(name = "CUST_BLNG_CTY")
    private String custBlngCty;
    @Basic(optional = false)
    @Column(name = "CUST_BLNG_ST")
    private String custBlngSt;
    @Basic(optional = false)
    @Column(name = "CUST_BLNG_POST_CD")
    private String custBlngPostCd;
    @Basic(optional = false)
    @Column(name = "CUST_SRV_LOC_ADDR_1")
    private String custSrvLocAddr1;
    @Basic(optional = false)
    @Column(name = "CUST_SRV_LOC_ADDR_2")
    private String custSrvLocAddr2;
    @Basic(optional = false)
    @Column(name = "CUST_SRV_LOC_CTY")
    private String custSrvLocCty;
    @Basic(optional = false)
    @Column(name = "CUST_SRV_LOC_ST")
    private String custSrvLocSt;
    @Basic(optional = false)
    @Column(name = "CUST_SRV_LOC_POST_CD")
    private String custSrvLocPostCd;

    public VpData() {
    }

    public VpData(String mastId) {
        this.mastId = mastId;
    }

    public VpData(String mastId, String custVend, String pAddr1, String pAddr2, String pCity, String pSt, String pZip, String mAddr1, String mAddr2, String mCity, String mSt, String mZip, String mdyUsr, Date mdyTs, String crtUsr, Date crtTs, String custBlngAddr1, String custBlngAddr2, String custBlngCty, String custBlngSt, String custBlngPostCd, String custSrvLocAddr1, String custSrvLocAddr2, String custSrvLocCty, String custSrvLocSt, String custSrvLocPostCd) {
        this.mastId = mastId;
        this.custVend = custVend;
        this.pAddr1 = pAddr1;
        this.pAddr2 = pAddr2;
        this.pCity = pCity;
        this.pSt = pSt;
        this.pZip = pZip;
        this.mAddr1 = mAddr1;
        this.mAddr2 = mAddr2;
        this.mCity = mCity;
        this.mSt = mSt;
        this.mZip = mZip;
        this.mdyUsr = mdyUsr;
        this.mdyTs = mdyTs;
        this.crtUsr = crtUsr;
        this.crtTs = crtTs;
        this.custBlngAddr1 = custBlngAddr1;
        this.custBlngAddr2 = custBlngAddr2;
        this.custBlngCty = custBlngCty;
        this.custBlngSt = custBlngSt;
        this.custBlngPostCd = custBlngPostCd;
        this.custSrvLocAddr1 = custSrvLocAddr1;
        this.custSrvLocAddr2 = custSrvLocAddr2;
        this.custSrvLocCty = custSrvLocCty;
        this.custSrvLocSt = custSrvLocSt;
        this.custSrvLocPostCd = custSrvLocPostCd;
    }

    public String getMastId() {
        return mastId;
    }

    public void setMastId(String mastId) {
        this.mastId = mastId;
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

    public String getMAddr1() {
        return mAddr1;
    }

    public void setMAddr1(String mAddr1) {
        this.mAddr1 = mAddr1;
    }

    public String getMAddr2() {
        return mAddr2;
    }

    public void setMAddr2(String mAddr2) {
        this.mAddr2 = mAddr2;
    }

    public String getMCity() {
        return mCity;
    }

    public void setMCity(String mCity) {
        this.mCity = mCity;
    }

    public String getMSt() {
        return mSt;
    }

    public void setMSt(String mSt) {
        this.mSt = mSt;
    }

    public String getMZip() {
        return mZip;
    }

    public void setMZip(String mZip) {
        this.mZip = mZip;
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

    public Date getCrtTs() {
        return crtTs;
    }

    public void setCrtTs(Date crtTs) {
        this.crtTs = crtTs;
    }

    public String getCustBlngAddr1() {
        return custBlngAddr1;
    }

    public void setCustBlngAddr1(String custBlngAddr1) {
        this.custBlngAddr1 = custBlngAddr1;
    }

    public String getCustBlngAddr2() {
        return custBlngAddr2;
    }

    public void setCustBlngAddr2(String custBlngAddr2) {
        this.custBlngAddr2 = custBlngAddr2;
    }

    public String getCustBlngCty() {
        return custBlngCty;
    }

    public void setCustBlngCty(String custBlngCty) {
        this.custBlngCty = custBlngCty;
    }

    public String getCustBlngSt() {
        return custBlngSt;
    }

    public void setCustBlngSt(String custBlngSt) {
        this.custBlngSt = custBlngSt;
    }

    public String getCustBlngPostCd() {
        return custBlngPostCd;
    }

    public void setCustBlngPostCd(String custBlngPostCd) {
        this.custBlngPostCd = custBlngPostCd;
    }

    public String getCustSrvLocAddr1() {
        return custSrvLocAddr1;
    }

    public void setCustSrvLocAddr1(String custSrvLocAddr1) {
        this.custSrvLocAddr1 = custSrvLocAddr1;
    }

    public String getCustSrvLocAddr2() {
        return custSrvLocAddr2;
    }

    public void setCustSrvLocAddr2(String custSrvLocAddr2) {
        this.custSrvLocAddr2 = custSrvLocAddr2;
    }

    public String getCustSrvLocCty() {
        return custSrvLocCty;
    }

    public void setCustSrvLocCty(String custSrvLocCty) {
        this.custSrvLocCty = custSrvLocCty;
    }

    public String getCustSrvLocSt() {
        return custSrvLocSt;
    }

    public void setCustSrvLocSt(String custSrvLocSt) {
        this.custSrvLocSt = custSrvLocSt;
    }

    public String getCustSrvLocPostCd() {
        return custSrvLocPostCd;
    }

    public void setCustSrvLocPostCd(String custSrvLocPostCd) {
        this.custSrvLocPostCd = custSrvLocPostCd;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mastId != null ? mastId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof VpData)) {
            return false;
        }
        VpData other = (VpData) object;
        if ((this.mastId == null && other.mastId != null) || (this.mastId != null && !this.mastId.equals(other.mastId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.VpData[ mastId=" + mastId + " ]";
    }
    
}
