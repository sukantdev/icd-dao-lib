/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.corpay.dao.cxxcow;

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
@Table(name = "PRICING_XTN_WRK", catalog = "", schema = "CXXCOW")
@NamedQueries({
    @NamedQuery(name = "PricingXtnWrk.findAll", query = "SELECT p FROM PricingXtnWrk p"),
    @NamedQuery(name = "PricingXtnWrk.findByXwrTiP105s1FileTy", query = "SELECT p FROM PricingXtnWrk p WHERE p.pricingXtnWrkPK.xwrTiP105s1FileTy = :xwrTiP105s1FileTy"),
    @NamedQuery(name = "PricingXtnWrk.findByXwrTiP105s2FileRDt", query = "SELECT p FROM PricingXtnWrk p WHERE p.pricingXtnWrkPK.xwrTiP105s2FileRDt = :xwrTiP105s2FileRDt"),
    @NamedQuery(name = "PricingXtnWrk.findByXwrTiP105s3ProcId", query = "SELECT p FROM PricingXtnWrk p WHERE p.pricingXtnWrkPK.xwrTiP105s3ProcId = :xwrTiP105s3ProcId"),
    @NamedQuery(name = "PricingXtnWrk.findByXwrTiP105s4FileSeqNo", query = "SELECT p FROM PricingXtnWrk p WHERE p.pricingXtnWrkPK.xwrTiP105s4FileSeqNo = :xwrTiP105s4FileSeqNo"),
    @NamedQuery(name = "PricingXtnWrk.findByXwrTiD71MsgNo", query = "SELECT p FROM PricingXtnWrk p WHERE p.pricingXtnWrkPK.xwrTiD71MsgNo = :xwrTiD71MsgNo"),
    @NamedQuery(name = "PricingXtnWrk.findByXwrRecordType", query = "SELECT p FROM PricingXtnWrk p WHERE p.pricingXtnWrkPK.xwrRecordType = :xwrRecordType"),
    @NamedQuery(name = "PricingXtnWrk.findByXwrRecordOccInd", query = "SELECT p FROM PricingXtnWrk p WHERE p.pricingXtnWrkPK.xwrRecordOccInd = :xwrRecordOccInd"),
    @NamedQuery(name = "PricingXtnWrk.findByXwrSecNbr", query = "SELECT p FROM PricingXtnWrk p WHERE p.xwrSecNbr = :xwrSecNbr"),
    @NamedQuery(name = "PricingXtnWrk.findByXwrXd01AcctCd", query = "SELECT p FROM PricingXtnWrk p WHERE p.xwrXd01AcctCd = :xwrXd01AcctCd"),
    @NamedQuery(name = "PricingXtnWrk.findByXwrXd01CustNbr", query = "SELECT p FROM PricingXtnWrk p WHERE p.xwrXd01CustNbr = :xwrXd01CustNbr"),
    @NamedQuery(name = "PricingXtnWrk.findByXwrXd01XtnTotAmt", query = "SELECT p FROM PricingXtnWrk p WHERE p.xwrXd01XtnTotAmt = :xwrXd01XtnTotAmt"),
    @NamedQuery(name = "PricingXtnWrk.findByXwrXd01InterchangeFee", query = "SELECT p FROM PricingXtnWrk p WHERE p.xwrXd01InterchangeFee = :xwrXd01InterchangeFee"),
    @NamedQuery(name = "PricingXtnWrk.findByXwrXd01CreditInd", query = "SELECT p FROM PricingXtnWrk p WHERE p.xwrXd01CreditInd = :xwrXd01CreditInd"),
    @NamedQuery(name = "PricingXtnWrk.findByXwrXd01AcctDiscInd", query = "SELECT p FROM PricingXtnWrk p WHERE p.xwrXd01AcctDiscInd = :xwrXd01AcctDiscInd"),
    @NamedQuery(name = "PricingXtnWrk.findByXwrXd01AcctRebInd", query = "SELECT p FROM PricingXtnWrk p WHERE p.xwrXd01AcctRebInd = :xwrXd01AcctRebInd"),
    @NamedQuery(name = "PricingXtnWrk.findByXwrXd01XborderInd", query = "SELECT p FROM PricingXtnWrk p WHERE p.xwrXd01XborderInd = :xwrXd01XborderInd"),
    @NamedQuery(name = "PricingXtnWrk.findByXwrXd01MccCd", query = "SELECT p FROM PricingXtnWrk p WHERE p.xwrXd01MccCd = :xwrXd01MccCd"),
    @NamedQuery(name = "PricingXtnWrk.findByXwrXd01SiteId", query = "SELECT p FROM PricingXtnWrk p WHERE p.xwrXd01SiteId = :xwrXd01SiteId"),
    @NamedQuery(name = "PricingXtnWrk.findByXwrXd01TtlDiscCdn", query = "SELECT p FROM PricingXtnWrk p WHERE p.xwrXd01TtlDiscCdn = :xwrXd01TtlDiscCdn"),
    @NamedQuery(name = "PricingXtnWrk.findByXwrXd01TtlRebCdn", query = "SELECT p FROM PricingXtnWrk p WHERE p.xwrXd01TtlRebCdn = :xwrXd01TtlRebCdn"),
    @NamedQuery(name = "PricingXtnWrk.findByXwrXd01TtlDiscSvc", query = "SELECT p FROM PricingXtnWrk p WHERE p.xwrXd01TtlDiscSvc = :xwrXd01TtlDiscSvc"),
    @NamedQuery(name = "PricingXtnWrk.findByXwrXd01TtlRebSvc", query = "SELECT p FROM PricingXtnWrk p WHERE p.xwrXd01TtlRebSvc = :xwrXd01TtlRebSvc"),
    @NamedQuery(name = "PricingXtnWrk.findByXwrXd01MigrType", query = "SELECT p FROM PricingXtnWrk p WHERE p.xwrXd01MigrType = :xwrXd01MigrType"),
    @NamedQuery(name = "PricingXtnWrk.findByXwrXd01DiffFndInd", query = "SELECT p FROM PricingXtnWrk p WHERE p.xwrXd01DiffFndInd = :xwrXd01DiffFndInd"),
    @NamedQuery(name = "PricingXtnWrk.findByCrtTs", query = "SELECT p FROM PricingXtnWrk p WHERE p.crtTs = :crtTs"),
    @NamedQuery(name = "PricingXtnWrk.findByCrtUsr", query = "SELECT p FROM PricingXtnWrk p WHERE p.crtUsr = :crtUsr"),
    @NamedQuery(name = "PricingXtnWrk.findByMdyTs", query = "SELECT p FROM PricingXtnWrk p WHERE p.mdyTs = :mdyTs"),
    @NamedQuery(name = "PricingXtnWrk.findByMdyUsr", query = "SELECT p FROM PricingXtnWrk p WHERE p.mdyUsr = :mdyUsr")})
public class PricingXtnWrk implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PricingXtnWrkPK pricingXtnWrkPK;
    @Basic(optional = false)
    @Column(name = "XWR_SEC_NBR")
    private int xwrSecNbr;
    @Basic(optional = false)
    @Column(name = "XWR_XD_01_ACCT_CD")
    private String xwrXd01AcctCd;
    @Basic(optional = false)
    @Column(name = "XWR_XD_01_CUST_NBR")
    private String xwrXd01CustNbr;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "XWR_XD_01_XTN_TOT_AMT")
    private BigDecimal xwrXd01XtnTotAmt;
    @Basic(optional = false)
    @Column(name = "XWR_XD_01_INTERCHANGE_FEE")
    private BigDecimal xwrXd01InterchangeFee;
    @Basic(optional = false)
    @Column(name = "XWR_XD_01_CREDIT_IND")
    private Character xwrXd01CreditInd;
    @Basic(optional = false)
    @Column(name = "XWR_XD_01_ACCT_DISC_IND")
    private Character xwrXd01AcctDiscInd;
    @Basic(optional = false)
    @Column(name = "XWR_XD_01_ACCT_REB_IND")
    private Character xwrXd01AcctRebInd;
    @Basic(optional = false)
    @Column(name = "XWR_XD_01_XBORDER_IND")
    private Character xwrXd01XborderInd;
    @Basic(optional = false)
    @Column(name = "XWR_XD_01_MCC_CD")
    private String xwrXd01MccCd;
    @Basic(optional = false)
    @Column(name = "XWR_XD_01_SITE_ID")
    private String xwrXd01SiteId;
    @Basic(optional = false)
    @Column(name = "XWR_XD_01_TTL_DISC_CDN")
    private BigDecimal xwrXd01TtlDiscCdn;
    @Basic(optional = false)
    @Column(name = "XWR_XD_01_TTL_REB_CDN")
    private BigDecimal xwrXd01TtlRebCdn;
    @Basic(optional = false)
    @Column(name = "XWR_XD_01_TTL_DISC_SVC")
    private BigDecimal xwrXd01TtlDiscSvc;
    @Basic(optional = false)
    @Column(name = "XWR_XD_01_TTL_REB_SVC")
    private BigDecimal xwrXd01TtlRebSvc;
    @Basic(optional = false)
    @Column(name = "XWR_XD_01_MIGR_TYPE")
    private Character xwrXd01MigrType;
    @Basic(optional = false)
    @Column(name = "XWR_XD_01_DIFF_FND_IND")
    private Character xwrXd01DiffFndInd;
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

    public PricingXtnWrk() {
    }

    public PricingXtnWrk(PricingXtnWrkPK pricingXtnWrkPK) {
        this.pricingXtnWrkPK = pricingXtnWrkPK;
    }

    public PricingXtnWrk(PricingXtnWrkPK pricingXtnWrkPK, int xwrSecNbr, String xwrXd01AcctCd, String xwrXd01CustNbr, BigDecimal xwrXd01XtnTotAmt, BigDecimal xwrXd01InterchangeFee, Character xwrXd01CreditInd, Character xwrXd01AcctDiscInd, Character xwrXd01AcctRebInd, Character xwrXd01XborderInd, String xwrXd01MccCd, String xwrXd01SiteId, BigDecimal xwrXd01TtlDiscCdn, BigDecimal xwrXd01TtlRebCdn, BigDecimal xwrXd01TtlDiscSvc, BigDecimal xwrXd01TtlRebSvc, Character xwrXd01MigrType, Character xwrXd01DiffFndInd, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.pricingXtnWrkPK = pricingXtnWrkPK;
        this.xwrSecNbr = xwrSecNbr;
        this.xwrXd01AcctCd = xwrXd01AcctCd;
        this.xwrXd01CustNbr = xwrXd01CustNbr;
        this.xwrXd01XtnTotAmt = xwrXd01XtnTotAmt;
        this.xwrXd01InterchangeFee = xwrXd01InterchangeFee;
        this.xwrXd01CreditInd = xwrXd01CreditInd;
        this.xwrXd01AcctDiscInd = xwrXd01AcctDiscInd;
        this.xwrXd01AcctRebInd = xwrXd01AcctRebInd;
        this.xwrXd01XborderInd = xwrXd01XborderInd;
        this.xwrXd01MccCd = xwrXd01MccCd;
        this.xwrXd01SiteId = xwrXd01SiteId;
        this.xwrXd01TtlDiscCdn = xwrXd01TtlDiscCdn;
        this.xwrXd01TtlRebCdn = xwrXd01TtlRebCdn;
        this.xwrXd01TtlDiscSvc = xwrXd01TtlDiscSvc;
        this.xwrXd01TtlRebSvc = xwrXd01TtlRebSvc;
        this.xwrXd01MigrType = xwrXd01MigrType;
        this.xwrXd01DiffFndInd = xwrXd01DiffFndInd;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public PricingXtnWrk(short xwrTiP105s1FileTy, int xwrTiP105s2FileRDt, long xwrTiP105s3ProcId, int xwrTiP105s4FileSeqNo, int xwrTiD71MsgNo, String xwrRecordType, int xwrRecordOccInd) {
        this.pricingXtnWrkPK = new PricingXtnWrkPK(xwrTiP105s1FileTy, xwrTiP105s2FileRDt, xwrTiP105s3ProcId, xwrTiP105s4FileSeqNo, xwrTiD71MsgNo, xwrRecordType, xwrRecordOccInd);
    }

    public PricingXtnWrkPK getPricingXtnWrkPK() {
        return pricingXtnWrkPK;
    }

    public void setPricingXtnWrkPK(PricingXtnWrkPK pricingXtnWrkPK) {
        this.pricingXtnWrkPK = pricingXtnWrkPK;
    }

    public int getXwrSecNbr() {
        return xwrSecNbr;
    }

    public void setXwrSecNbr(int xwrSecNbr) {
        this.xwrSecNbr = xwrSecNbr;
    }

    public String getXwrXd01AcctCd() {
        return xwrXd01AcctCd;
    }

    public void setXwrXd01AcctCd(String xwrXd01AcctCd) {
        this.xwrXd01AcctCd = xwrXd01AcctCd;
    }

    public String getXwrXd01CustNbr() {
        return xwrXd01CustNbr;
    }

    public void setXwrXd01CustNbr(String xwrXd01CustNbr) {
        this.xwrXd01CustNbr = xwrXd01CustNbr;
    }

    public BigDecimal getXwrXd01XtnTotAmt() {
        return xwrXd01XtnTotAmt;
    }

    public void setXwrXd01XtnTotAmt(BigDecimal xwrXd01XtnTotAmt) {
        this.xwrXd01XtnTotAmt = xwrXd01XtnTotAmt;
    }

    public BigDecimal getXwrXd01InterchangeFee() {
        return xwrXd01InterchangeFee;
    }

    public void setXwrXd01InterchangeFee(BigDecimal xwrXd01InterchangeFee) {
        this.xwrXd01InterchangeFee = xwrXd01InterchangeFee;
    }

    public Character getXwrXd01CreditInd() {
        return xwrXd01CreditInd;
    }

    public void setXwrXd01CreditInd(Character xwrXd01CreditInd) {
        this.xwrXd01CreditInd = xwrXd01CreditInd;
    }

    public Character getXwrXd01AcctDiscInd() {
        return xwrXd01AcctDiscInd;
    }

    public void setXwrXd01AcctDiscInd(Character xwrXd01AcctDiscInd) {
        this.xwrXd01AcctDiscInd = xwrXd01AcctDiscInd;
    }

    public Character getXwrXd01AcctRebInd() {
        return xwrXd01AcctRebInd;
    }

    public void setXwrXd01AcctRebInd(Character xwrXd01AcctRebInd) {
        this.xwrXd01AcctRebInd = xwrXd01AcctRebInd;
    }

    public Character getXwrXd01XborderInd() {
        return xwrXd01XborderInd;
    }

    public void setXwrXd01XborderInd(Character xwrXd01XborderInd) {
        this.xwrXd01XborderInd = xwrXd01XborderInd;
    }

    public String getXwrXd01MccCd() {
        return xwrXd01MccCd;
    }

    public void setXwrXd01MccCd(String xwrXd01MccCd) {
        this.xwrXd01MccCd = xwrXd01MccCd;
    }

    public String getXwrXd01SiteId() {
        return xwrXd01SiteId;
    }

    public void setXwrXd01SiteId(String xwrXd01SiteId) {
        this.xwrXd01SiteId = xwrXd01SiteId;
    }

    public BigDecimal getXwrXd01TtlDiscCdn() {
        return xwrXd01TtlDiscCdn;
    }

    public void setXwrXd01TtlDiscCdn(BigDecimal xwrXd01TtlDiscCdn) {
        this.xwrXd01TtlDiscCdn = xwrXd01TtlDiscCdn;
    }

    public BigDecimal getXwrXd01TtlRebCdn() {
        return xwrXd01TtlRebCdn;
    }

    public void setXwrXd01TtlRebCdn(BigDecimal xwrXd01TtlRebCdn) {
        this.xwrXd01TtlRebCdn = xwrXd01TtlRebCdn;
    }

    public BigDecimal getXwrXd01TtlDiscSvc() {
        return xwrXd01TtlDiscSvc;
    }

    public void setXwrXd01TtlDiscSvc(BigDecimal xwrXd01TtlDiscSvc) {
        this.xwrXd01TtlDiscSvc = xwrXd01TtlDiscSvc;
    }

    public BigDecimal getXwrXd01TtlRebSvc() {
        return xwrXd01TtlRebSvc;
    }

    public void setXwrXd01TtlRebSvc(BigDecimal xwrXd01TtlRebSvc) {
        this.xwrXd01TtlRebSvc = xwrXd01TtlRebSvc;
    }

    public Character getXwrXd01MigrType() {
        return xwrXd01MigrType;
    }

    public void setXwrXd01MigrType(Character xwrXd01MigrType) {
        this.xwrXd01MigrType = xwrXd01MigrType;
    }

    public Character getXwrXd01DiffFndInd() {
        return xwrXd01DiffFndInd;
    }

    public void setXwrXd01DiffFndInd(Character xwrXd01DiffFndInd) {
        this.xwrXd01DiffFndInd = xwrXd01DiffFndInd;
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
        hash += (pricingXtnWrkPK != null ? pricingXtnWrkPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PricingXtnWrk)) {
            return false;
        }
        PricingXtnWrk other = (PricingXtnWrk) object;
        if ((this.pricingXtnWrkPK == null && other.pricingXtnWrkPK != null) || (this.pricingXtnWrkPK != null && !this.pricingXtnWrkPK.equals(other.pricingXtnWrkPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.cxxcow.PricingXtnWrk[ pricingXtnWrkPK=" + pricingXtnWrkPK + " ]";
    }
    
}
