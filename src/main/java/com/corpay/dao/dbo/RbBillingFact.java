package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "RB_BILLING_FACT", catalog = "", schema = "DBO")
public class RbBillingFact implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected RbBillingFactPK rbBillingFactPK;
    @Basic(optional = false)
    @Column(name = "ORG_LVL_VAL")
    private String orgLvlVal;
    @Basic(optional = false)
    @Column(name = "ORG_LVL_TYP_CD")
    private String orgLvlTypCd;
    @Basic(optional = false)
    @Column(name = "ACCT_NBR")
    private String acctNbr;
    @Basic(optional = false)
    @Column(name = "APP_CD")
    private String appCd;
    @Basic(optional = false)
    @Column(name = "APP_NM")
    private String appNm;
    @Basic(optional = false)
    @Column(name = "MOD_CD")
    private String modCd;
    @Basic(optional = false)
    @Column(name = "MOD_NM")
    private String modNm;
    @Basic(optional = false)
    @Column(name = "PRODUCT_ID")
    private String productId;
    @Basic(optional = false)
    @Column(name = "BILL_SEQ_NBR")
    private String billSeqNbr;
    @Basic(optional = false)
    @Column(name = "BILL_PD_CD")
    private String billPdCd;
    @Basic(optional = false)
    @Column(name = "BILL_PD_NM")
    private String billPdNm;
    @Basic(optional = false)
    @Column(name = "BILL_PD_END_DT")
    @Temporal(TemporalType.DATE)
    private Date billPdEndDt;
    @Basic(optional = false)
    @Column(name = "BILL_PD_DAY_CNT")
    private int billPdDayCnt;
    @Basic(optional = false)
    @Column(name = "SUB_TYP_NM")
    private String subTypNm;
    @Basic(optional = false)
    @Column(name = "SUBSC_START_DT")
    @Temporal(TemporalType.DATE)
    private Date subscStartDt;
    @Basic(optional = false)
    @Column(name = "SUBSC_END_DT")
    @Temporal(TemporalType.DATE)
    private Date subscEndDt;
    @Basic(optional = false)
    @Column(name = "SUBSCRIBED_DAY_CNT")
    private int subscribedDayCnt;

    @Basic(optional = false)
    @Column(name = "BILL_PER_PD_AMT")
    private BigDecimal billPerPdAmt;
    @Basic(optional = false)
    @Column(name = "TOTAL_BILL_AMT")
    private BigDecimal totalBillAmt;
    @Basic(optional = false)
    @Column(name = "BILL_GEN_DT")
    @Temporal(TemporalType.DATE)
    private Date billGenDt;
    @Basic(optional = false)
    @Column(name = "BILL_EXPORT_DT")
    @Temporal(TemporalType.DATE)
    private Date billExportDt;
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

    public RbBillingFact() {
    }

    public RbBillingFact(RbBillingFactPK rbBillingFactPK) {
        this.rbBillingFactPK = rbBillingFactPK;
    }

    public RbBillingFact(RbBillingFactPK rbBillingFactPK, String orgLvlVal, String orgLvlTypCd, String acctNbr, String appCd, String appNm, String modCd, String modNm, String productId, String billSeqNbr, String billPdCd, String billPdNm, Date billPdEndDt, int billPdDayCnt, String subTypNm, Date subscStartDt, Date subscEndDt, int subscribedDayCnt, BigDecimal billPerPdAmt, BigDecimal totalBillAmt, Date billGenDt, Date billExportDt, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.rbBillingFactPK = rbBillingFactPK;
        this.orgLvlVal = orgLvlVal;
        this.orgLvlTypCd = orgLvlTypCd;
        this.acctNbr = acctNbr;
        this.appCd = appCd;
        this.appNm = appNm;
        this.modCd = modCd;
        this.modNm = modNm;
        this.productId = productId;
        this.billSeqNbr = billSeqNbr;
        this.billPdCd = billPdCd;
        this.billPdNm = billPdNm;
        this.billPdEndDt = billPdEndDt;
        this.billPdDayCnt = billPdDayCnt;
        this.subTypNm = subTypNm;
        this.subscStartDt = subscStartDt;
        this.subscEndDt = subscEndDt;
        this.subscribedDayCnt = subscribedDayCnt;
        this.billPerPdAmt = billPerPdAmt;
        this.totalBillAmt = totalBillAmt;
        this.billGenDt = billGenDt;
        this.billExportDt = billExportDt;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public RbBillingFact(String subTypCd, long subId, long subPhseId, Date billPdStartDt) {
        this.rbBillingFactPK = new RbBillingFactPK(subTypCd, subId, subPhseId, billPdStartDt);
    }

    public RbBillingFactPK getRbBillingFactPK() {
        return rbBillingFactPK;
    }

    public void setRbBillingFactPK(RbBillingFactPK rbBillingFactPK) {
        this.rbBillingFactPK = rbBillingFactPK;
    }

    public String getOrgLvlVal() {
        return orgLvlVal;
    }

    public void setOrgLvlVal(String orgLvlVal) {
        this.orgLvlVal = orgLvlVal;
    }

    public String getOrgLvlTypCd() {
        return orgLvlTypCd;
    }

    public void setOrgLvlTypCd(String orgLvlTypCd) {
        this.orgLvlTypCd = orgLvlTypCd;
    }

    public String getAcctNbr() {
        return acctNbr;
    }

    public void setAcctNbr(String acctNbr) {
        this.acctNbr = acctNbr;
    }

    public String getAppCd() {
        return appCd;
    }

    public void setAppCd(String appCd) {
        this.appCd = appCd;
    }

    public String getAppNm() {
        return appNm;
    }

    public void setAppNm(String appNm) {
        this.appNm = appNm;
    }

    public String getModCd() {
        return modCd;
    }

    public void setModCd(String modCd) {
        this.modCd = modCd;
    }

    public String getModNm() {
        return modNm;
    }

    public void setModNm(String modNm) {
        this.modNm = modNm;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getBillSeqNbr() {
        return billSeqNbr;
    }

    public void setBillSeqNbr(String billSeqNbr) {
        this.billSeqNbr = billSeqNbr;
    }

    public String getBillPdCd() {
        return billPdCd;
    }

    public void setBillPdCd(String billPdCd) {
        this.billPdCd = billPdCd;
    }

    public String getBillPdNm() {
        return billPdNm;
    }

    public void setBillPdNm(String billPdNm) {
        this.billPdNm = billPdNm;
    }

    public Date getBillPdEndDt() {
        return billPdEndDt;
    }

    public void setBillPdEndDt(Date billPdEndDt) {
        this.billPdEndDt = billPdEndDt;
    }

    public int getBillPdDayCnt() {
        return billPdDayCnt;
    }

    public void setBillPdDayCnt(int billPdDayCnt) {
        this.billPdDayCnt = billPdDayCnt;
    }

    public String getSubTypNm() {
        return subTypNm;
    }

    public void setSubTypNm(String subTypNm) {
        this.subTypNm = subTypNm;
    }

    public Date getSubscStartDt() {
        return subscStartDt;
    }

    public void setSubscStartDt(Date subscStartDt) {
        this.subscStartDt = subscStartDt;
    }

    public Date getSubscEndDt() {
        return subscEndDt;
    }

    public void setSubscEndDt(Date subscEndDt) {
        this.subscEndDt = subscEndDt;
    }

    public int getSubscribedDayCnt() {
        return subscribedDayCnt;
    }

    public void setSubscribedDayCnt(int subscribedDayCnt) {
        this.subscribedDayCnt = subscribedDayCnt;
    }

    public BigDecimal getBillPerPdAmt() {
        return billPerPdAmt;
    }

    public void setBillPerPdAmt(BigDecimal billPerPdAmt) {
        this.billPerPdAmt = billPerPdAmt;
    }

    public BigDecimal getTotalBillAmt() {
        return totalBillAmt;
    }

    public void setTotalBillAmt(BigDecimal totalBillAmt) {
        this.totalBillAmt = totalBillAmt;
    }

    public Date getBillGenDt() {
        return billGenDt;
    }

    public void setBillGenDt(Date billGenDt) {
        this.billGenDt = billGenDt;
    }

    public Date getBillExportDt() {
        return billExportDt;
    }

    public void setBillExportDt(Date billExportDt) {
        this.billExportDt = billExportDt;
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
        hash += (rbBillingFactPK != null ? rbBillingFactPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof RbBillingFact)) {
            return false;
        }
        RbBillingFact other = (RbBillingFact) object;
        if ((this.rbBillingFactPK == null && other.rbBillingFactPK != null) || (this.rbBillingFactPK != null && !this.rbBillingFactPK.equals(other.rbBillingFactPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.RbBillingFact[ rbBillingFactPK=" + rbBillingFactPK + " ]";
    }

}
