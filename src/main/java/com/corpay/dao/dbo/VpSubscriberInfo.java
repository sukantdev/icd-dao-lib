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
@Table(name = "VP_SUBSCRIBER_INFO", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "VpSubscriberInfo.findAll", query = "SELECT v FROM VpSubscriberInfo v")})
public class VpSubscriberInfo implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected VpSubscriberInfoPK vpSubscriberInfoPK;
    @Basic(optional = false)
    @Column(name = "SB_NAME")
    private String sbName;
    @Basic(optional = false)
    @Column(name = "SB_EMAIL1")
    private String sbEmail1;
    @Basic(optional = false)
    @Column(name = "SB_EMAIL2")
    private String sbEmail2;
    @Basic(optional = false)
    @Column(name = "SB_ADDRESS1")
    private String sbAddress1;
    @Basic(optional = false)
    @Column(name = "SB_ADDRESS2")
    private String sbAddress2;
    @Basic(optional = false)
    @Column(name = "SB_CITY")
    private String sbCity;
    @Basic(optional = false)
    @Column(name = "SB_ST")
    private String sbSt;
    @Basic(optional = false)
    @Column(name = "SB_ZIP")
    private String sbZip;
    @Basic(optional = false)
    @Column(name = "SB_PHONE_NBR")
    private String sbPhoneNbr;
    @Basic(optional = false)
    @Column(name = "SB_ACCT_NBR")
    private String sbAcctNbr;
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

    public VpSubscriberInfo() {
    }

    public VpSubscriberInfo(VpSubscriberInfoPK vpSubscriberInfoPK) {
        this.vpSubscriberInfoPK = vpSubscriberInfoPK;
    }

    public VpSubscriberInfo(VpSubscriberInfoPK vpSubscriberInfoPK, String sbName, String sbEmail1, String sbEmail2, String sbAddress1, String sbAddress2, String sbCity, String sbSt, String sbZip, String sbPhoneNbr, String sbAcctNbr, String mdyUsr, Date mdyTs, String crtUsr, Date crtTs) {
        this.vpSubscriberInfoPK = vpSubscriberInfoPK;
        this.sbName = sbName;
        this.sbEmail1 = sbEmail1;
        this.sbEmail2 = sbEmail2;
        this.sbAddress1 = sbAddress1;
        this.sbAddress2 = sbAddress2;
        this.sbCity = sbCity;
        this.sbSt = sbSt;
        this.sbZip = sbZip;
        this.sbPhoneNbr = sbPhoneNbr;
        this.sbAcctNbr = sbAcctNbr;
        this.mdyUsr = mdyUsr;
        this.mdyTs = mdyTs;
        this.crtUsr = crtUsr;
        this.crtTs = crtTs;
    }

    public VpSubscriberInfo(String batchId, long batchSeqNbr, String custId, String acctNbr) {
        this.vpSubscriberInfoPK = new VpSubscriberInfoPK(batchId, batchSeqNbr, custId, acctNbr);
    }

    public VpSubscriberInfoPK getVpSubscriberInfoPK() {
        return vpSubscriberInfoPK;
    }

    public void setVpSubscriberInfoPK(VpSubscriberInfoPK vpSubscriberInfoPK) {
        this.vpSubscriberInfoPK = vpSubscriberInfoPK;
    }

    public String getSbName() {
        return sbName;
    }

    public void setSbName(String sbName) {
        this.sbName = sbName;
    }

    public String getSbEmail1() {
        return sbEmail1;
    }

    public void setSbEmail1(String sbEmail1) {
        this.sbEmail1 = sbEmail1;
    }

    public String getSbEmail2() {
        return sbEmail2;
    }

    public void setSbEmail2(String sbEmail2) {
        this.sbEmail2 = sbEmail2;
    }

    public String getSbAddress1() {
        return sbAddress1;
    }

    public void setSbAddress1(String sbAddress1) {
        this.sbAddress1 = sbAddress1;
    }

    public String getSbAddress2() {
        return sbAddress2;
    }

    public void setSbAddress2(String sbAddress2) {
        this.sbAddress2 = sbAddress2;
    }

    public String getSbCity() {
        return sbCity;
    }

    public void setSbCity(String sbCity) {
        this.sbCity = sbCity;
    }

    public String getSbSt() {
        return sbSt;
    }

    public void setSbSt(String sbSt) {
        this.sbSt = sbSt;
    }

    public String getSbZip() {
        return sbZip;
    }

    public void setSbZip(String sbZip) {
        this.sbZip = sbZip;
    }

    public String getSbPhoneNbr() {
        return sbPhoneNbr;
    }

    public void setSbPhoneNbr(String sbPhoneNbr) {
        this.sbPhoneNbr = sbPhoneNbr;
    }

    public String getSbAcctNbr() {
        return sbAcctNbr;
    }

    public void setSbAcctNbr(String sbAcctNbr) {
        this.sbAcctNbr = sbAcctNbr;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (vpSubscriberInfoPK != null ? vpSubscriberInfoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof VpSubscriberInfo)) {
            return false;
        }
        VpSubscriberInfo other = (VpSubscriberInfo) object;
        if ((this.vpSubscriberInfoPK == null && other.vpSubscriberInfoPK != null) || (this.vpSubscriberInfoPK != null && !this.vpSubscriberInfoPK.equals(other.vpSubscriberInfoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.VpSubscriberInfo[ vpSubscriberInfoPK=" + vpSubscriberInfoPK + " ]";
    }
    
}
