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
import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author Sukant.Tiwari
 */
@Entity
@Table(name = "PAYCODE_EXP", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "PaycodeExp.findAll", query = "SELECT p FROM PaycodeExp p")})
public class PaycodeExp implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PaycodeExpPK paycodeExpPK;
    @Basic(optional = false)
    @Column(name = "STAT_CD")
    private Character statCd;
    @Basic(optional = false)
    @Column(name = "STAT_LOC_CD")
    private String statLocCd;
    @Basic(optional = false)
    @Column(name = "CRD_NBR")
    private String crdNbr;
    @Basic(optional = false)
    @Column(name = "CRD_TKN_NBR")
    private String crdTknNbr;
    @Basic(optional = false)
    @Column(name = "CUST_ID")
    private String custId;
    @Basic(optional = false)
    @Column(name = "EXP_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date expTs;
    @Basic(optional = false)
    @Column(name = "CRD_EMP_ID")
    private String crdEmpId;
    @Basic(optional = false)
    @Column(name = "UNIT_NBR")
    private String unitNbr;
    @Basic(optional = false)
    @Column(name = "DRV_TRIP_NBR")
    private String drvTripNbr;
    @Basic(optional = false)
    @Column(name = "FST_NM")
    private String fstNm;
    @Basic(optional = false)
    @Column(name = "LST_NM")
    private String lstNm;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "HUB_RDNG")
    private BigDecimal hubRdng;
    @Basic(optional = false)
    @Column(name = "TRL_HUB_RDNG")
    private BigDecimal trlHubRdng;
    @Basic(optional = false)
    @Column(name = "PO_NBR")
    private String poNbr;
    @Basic(optional = false)
    @Column(name = "DRV_LIC_NBR")
    private String drvLicNbr;
    @Basic(optional = false)
    @Column(name = "DL_LIC_ST_PROV")
    private String dlLicStProv;
    @Basic(optional = false)
    @Column(name = "ORIG_EXP_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date origExpTs;
    @Basic(optional = false)
    @Column(name = "POST_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date postTs;
    @Basic(optional = false)
    @Column(name = "PRE_AUTH_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date preAuthTs;
    @Basic(optional = false)
    @Column(name = "PRE_EDIT_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date preEditTs;
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

    public PaycodeExp() {
    }

    public PaycodeExp(PaycodeExpPK paycodeExpPK) {
        this.paycodeExpPK = paycodeExpPK;
    }

    public PaycodeExp(PaycodeExpPK paycodeExpPK, Character statCd, String statLocCd, String crdNbr, String crdTknNbr, String custId, Date expTs, String crdEmpId, String unitNbr, String drvTripNbr, String fstNm, String lstNm, BigDecimal hubRdng, BigDecimal trlHubRdng, String poNbr, String drvLicNbr, String dlLicStProv, Date origExpTs, Date postTs, Date preAuthTs, Date preEditTs, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.paycodeExpPK = paycodeExpPK;
        this.statCd = statCd;
        this.statLocCd = statLocCd;
        this.crdNbr = crdNbr;
        this.crdTknNbr = crdTknNbr;
        this.custId = custId;
        this.expTs = expTs;
        this.crdEmpId = crdEmpId;
        this.unitNbr = unitNbr;
        this.drvTripNbr = drvTripNbr;
        this.fstNm = fstNm;
        this.lstNm = lstNm;
        this.hubRdng = hubRdng;
        this.trlHubRdng = trlHubRdng;
        this.poNbr = poNbr;
        this.drvLicNbr = drvLicNbr;
        this.dlLicStProv = dlLicStProv;
        this.origExpTs = origExpTs;
        this.postTs = postTs;
        this.preAuthTs = preAuthTs;
        this.preEditTs = preEditTs;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public PaycodeExp(String payLoc, String payUniqCd, int seqNbr) {
        this.paycodeExpPK = new PaycodeExpPK(payLoc, payUniqCd, seqNbr);
    }

    public PaycodeExpPK getPaycodeExpPK() {
        return paycodeExpPK;
    }

    public void setPaycodeExpPK(PaycodeExpPK paycodeExpPK) {
        this.paycodeExpPK = paycodeExpPK;
    }

    public Character getStatCd() {
        return statCd;
    }

    public void setStatCd(Character statCd) {
        this.statCd = statCd;
    }

    public String getStatLocCd() {
        return statLocCd;
    }

    public void setStatLocCd(String statLocCd) {
        this.statLocCd = statLocCd;
    }

    public String getCrdNbr() {
        return crdNbr;
    }

    public void setCrdNbr(String crdNbr) {
        this.crdNbr = crdNbr;
    }

    public String getCrdTknNbr() {
        return crdTknNbr;
    }

    public void setCrdTknNbr(String crdTknNbr) {
        this.crdTknNbr = crdTknNbr;
    }

    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId;
    }

    public Date getExpTs() {
        return expTs;
    }

    public void setExpTs(Date expTs) {
        this.expTs = expTs;
    }

    public String getCrdEmpId() {
        return crdEmpId;
    }

    public void setCrdEmpId(String crdEmpId) {
        this.crdEmpId = crdEmpId;
    }

    public String getUnitNbr() {
        return unitNbr;
    }

    public void setUnitNbr(String unitNbr) {
        this.unitNbr = unitNbr;
    }

    public String getDrvTripNbr() {
        return drvTripNbr;
    }

    public void setDrvTripNbr(String drvTripNbr) {
        this.drvTripNbr = drvTripNbr;
    }

    public String getFstNm() {
        return fstNm;
    }

    public void setFstNm(String fstNm) {
        this.fstNm = fstNm;
    }

    public String getLstNm() {
        return lstNm;
    }

    public void setLstNm(String lstNm) {
        this.lstNm = lstNm;
    }

    public BigDecimal getHubRdng() {
        return hubRdng;
    }

    public void setHubRdng(BigDecimal hubRdng) {
        this.hubRdng = hubRdng;
    }

    public BigDecimal getTrlHubRdng() {
        return trlHubRdng;
    }

    public void setTrlHubRdng(BigDecimal trlHubRdng) {
        this.trlHubRdng = trlHubRdng;
    }

    public String getPoNbr() {
        return poNbr;
    }

    public void setPoNbr(String poNbr) {
        this.poNbr = poNbr;
    }

    public String getDrvLicNbr() {
        return drvLicNbr;
    }

    public void setDrvLicNbr(String drvLicNbr) {
        this.drvLicNbr = drvLicNbr;
    }

    public String getDlLicStProv() {
        return dlLicStProv;
    }

    public void setDlLicStProv(String dlLicStProv) {
        this.dlLicStProv = dlLicStProv;
    }

    public Date getOrigExpTs() {
        return origExpTs;
    }

    public void setOrigExpTs(Date origExpTs) {
        this.origExpTs = origExpTs;
    }

    public Date getPostTs() {
        return postTs;
    }

    public void setPostTs(Date postTs) {
        this.postTs = postTs;
    }

    public Date getPreAuthTs() {
        return preAuthTs;
    }

    public void setPreAuthTs(Date preAuthTs) {
        this.preAuthTs = preAuthTs;
    }

    public Date getPreEditTs() {
        return preEditTs;
    }

    public void setPreEditTs(Date preEditTs) {
        this.preEditTs = preEditTs;
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
        hash += (paycodeExpPK != null ? paycodeExpPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PaycodeExp)) {
            return false;
        }
        PaycodeExp other = (PaycodeExp) object;
        if ((this.paycodeExpPK == null && other.paycodeExpPK != null) || (this.paycodeExpPK != null && !this.paycodeExpPK.equals(other.paycodeExpPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.PaycodeExp[ paycodeExpPK=" + paycodeExpPK + " ]";
    }
    
}
