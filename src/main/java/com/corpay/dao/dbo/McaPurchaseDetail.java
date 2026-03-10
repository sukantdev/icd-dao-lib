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
@Table(name = "MCA_PURCHASE_DETAIL", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "McaPurchaseDetail.findAll", query = "SELECT m FROM McaPurchaseDetail m")})
public class McaPurchaseDetail implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected McaPurchaseDetailPK mcaPurchaseDetailPK;
    @Basic(optional = false)
    @Column(name = "MCA_REF_NUM")
    private String mcaRefNum;
    @Basic(optional = false)
    @Column(name = "MCA_SETTLE_DATE")
    @Temporal(TemporalType.DATE)
    private Date mcaSettleDate;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "MCA_APPLIED_REMIT")
    private BigDecimal mcaAppliedRemit;
    @Basic(optional = false)
    @Column(name = "MCA_APPLIED_REVENUE")
    private BigDecimal mcaAppliedRevenue;
    @Basic(optional = false)
    @Column(name = "MCA_ACCT_CD")
    private String mcaAcctCd;
    @Basic(optional = false)
    @Column(name = "MCA_COUNTRY_CD")
    private Character mcaCountryCd;
    @Basic(optional = false)
    @Column(name = "MCA_TYPE_CD")
    private Character mcaTypeCd;
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

    public McaPurchaseDetail() {
    }

    public McaPurchaseDetail(McaPurchaseDetailPK mcaPurchaseDetailPK) {
        this.mcaPurchaseDetailPK = mcaPurchaseDetailPK;
    }

    public McaPurchaseDetail(McaPurchaseDetailPK mcaPurchaseDetailPK, String mcaRefNum, Date mcaSettleDate, BigDecimal mcaAppliedRemit, BigDecimal mcaAppliedRevenue, String mcaAcctCd, Character mcaCountryCd, Character mcaTypeCd, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.mcaPurchaseDetailPK = mcaPurchaseDetailPK;
        this.mcaRefNum = mcaRefNum;
        this.mcaSettleDate = mcaSettleDate;
        this.mcaAppliedRemit = mcaAppliedRemit;
        this.mcaAppliedRevenue = mcaAppliedRevenue;
        this.mcaAcctCd = mcaAcctCd;
        this.mcaCountryCd = mcaCountryCd;
        this.mcaTypeCd = mcaTypeCd;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public McaPurchaseDetail(String serviceCenterCd, short mcaPurchaseNum, Date mcaDetailTs) {
        this.mcaPurchaseDetailPK = new McaPurchaseDetailPK(serviceCenterCd, mcaPurchaseNum, mcaDetailTs);
    }

    public McaPurchaseDetailPK getMcaPurchaseDetailPK() {
        return mcaPurchaseDetailPK;
    }

    public void setMcaPurchaseDetailPK(McaPurchaseDetailPK mcaPurchaseDetailPK) {
        this.mcaPurchaseDetailPK = mcaPurchaseDetailPK;
    }

    public String getMcaRefNum() {
        return mcaRefNum;
    }

    public void setMcaRefNum(String mcaRefNum) {
        this.mcaRefNum = mcaRefNum;
    }

    public Date getMcaSettleDate() {
        return mcaSettleDate;
    }

    public void setMcaSettleDate(Date mcaSettleDate) {
        this.mcaSettleDate = mcaSettleDate;
    }

    public BigDecimal getMcaAppliedRemit() {
        return mcaAppliedRemit;
    }

    public void setMcaAppliedRemit(BigDecimal mcaAppliedRemit) {
        this.mcaAppliedRemit = mcaAppliedRemit;
    }

    public BigDecimal getMcaAppliedRevenue() {
        return mcaAppliedRevenue;
    }

    public void setMcaAppliedRevenue(BigDecimal mcaAppliedRevenue) {
        this.mcaAppliedRevenue = mcaAppliedRevenue;
    }

    public String getMcaAcctCd() {
        return mcaAcctCd;
    }

    public void setMcaAcctCd(String mcaAcctCd) {
        this.mcaAcctCd = mcaAcctCd;
    }

    public Character getMcaCountryCd() {
        return mcaCountryCd;
    }

    public void setMcaCountryCd(Character mcaCountryCd) {
        this.mcaCountryCd = mcaCountryCd;
    }

    public Character getMcaTypeCd() {
        return mcaTypeCd;
    }

    public void setMcaTypeCd(Character mcaTypeCd) {
        this.mcaTypeCd = mcaTypeCd;
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
        hash += (mcaPurchaseDetailPK != null ? mcaPurchaseDetailPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof McaPurchaseDetail)) {
            return false;
        }
        McaPurchaseDetail other = (McaPurchaseDetail) object;
        if ((this.mcaPurchaseDetailPK == null && other.mcaPurchaseDetailPK != null) || (this.mcaPurchaseDetailPK != null && !this.mcaPurchaseDetailPK.equals(other.mcaPurchaseDetailPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.McaPurchaseDetail[ mcaPurchaseDetailPK=" + mcaPurchaseDetailPK + " ]";
    }
    
}
