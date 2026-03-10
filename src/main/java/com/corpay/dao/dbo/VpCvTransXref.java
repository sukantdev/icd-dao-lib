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
@Table(name = "VP_CV_TRANS_XREF", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "VpCvTransXref.findAll", query = "SELECT v FROM VpCvTransXref v")})
public class VpCvTransXref implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected VpCvTransXrefPK vpCvTransXrefPK;
    @Basic(optional = false)
    @Column(name = "CUST_ID")
    private String custId;
    @Basic(optional = false)
    @Column(name = "VENDOR_NBR")
    private String vendorNbr;
    @Basic(optional = false)
    @Column(name = "LOC_CD")
    private String locCd;
    @Basic(optional = false)
    @Column(name = "CV_MAST_ID")
    private String cvMastId;
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

    public VpCvTransXref() {
    }

    public VpCvTransXref(VpCvTransXrefPK vpCvTransXrefPK) {
        this.vpCvTransXrefPK = vpCvTransXrefPK;
    }

    public VpCvTransXref(VpCvTransXrefPK vpCvTransXrefPK, String custId, String vendorNbr, String locCd, String cvMastId, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.vpCvTransXrefPK = vpCvTransXrefPK;
        this.custId = custId;
        this.vendorNbr = vendorNbr;
        this.locCd = locCd;
        this.cvMastId = cvMastId;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public VpCvTransXref(String authPan, Date authUtDt, int authApprovCd, Date authLocalTs) {
        this.vpCvTransXrefPK = new VpCvTransXrefPK(authPan, authUtDt, authApprovCd, authLocalTs);
    }

    public VpCvTransXrefPK getVpCvTransXrefPK() {
        return vpCvTransXrefPK;
    }

    public void setVpCvTransXrefPK(VpCvTransXrefPK vpCvTransXrefPK) {
        this.vpCvTransXrefPK = vpCvTransXrefPK;
    }

    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId;
    }

    public String getVendorNbr() {
        return vendorNbr;
    }

    public void setVendorNbr(String vendorNbr) {
        this.vendorNbr = vendorNbr;
    }

    public String getLocCd() {
        return locCd;
    }

    public void setLocCd(String locCd) {
        this.locCd = locCd;
    }

    public String getCvMastId() {
        return cvMastId;
    }

    public void setCvMastId(String cvMastId) {
        this.cvMastId = cvMastId;
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
        hash += (vpCvTransXrefPK != null ? vpCvTransXrefPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof VpCvTransXref)) {
            return false;
        }
        VpCvTransXref other = (VpCvTransXref) object;
        if ((this.vpCvTransXrefPK == null && other.vpCvTransXrefPK != null) || (this.vpCvTransXrefPK != null && !this.vpCvTransXrefPK.equals(other.vpCvTransXrefPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.VpCvTransXref[ vpCvTransXrefPK=" + vpCvTransXrefPK + " ]";
    }
    
}
