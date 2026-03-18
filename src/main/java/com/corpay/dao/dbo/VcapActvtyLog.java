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
@Table(name = "VCAP_ACTVTY_LOG", catalog = "", schema = "DBO")
public class VcapActvtyLog implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected VcapActvtyLogPK vcapActvtyLogPK;
    @Basic(optional = false)
    @Column(name = "CODEWORD")
    private String codeword;
    @Basic(optional = false)
    @Column(name = "SUPPLIER_NM")
    private String supplierNm;
    @Basic(optional = false)
    @Column(name = "EMAIL_ADDR1")
    private String emailAddr1;
    @Basic(optional = false)
    @Column(name = "EMAIL_ADDR2")
    private String emailAddr2;
    @Basic(optional = false)
    @Column(name = "INV_DT")
    private String invDt;
    @Basic(optional = false)
    @Column(name = "PAYMENT_DT")
    private String paymentDt;
    @Basic(optional = false)
    @Column(name = "PAYMENT_NBR")
    private String paymentNbr;
    @Basic(optional = false)
    @Column(name = "INVOICE_CMNT")
    private String invoiceCmnt;
    @Basic(optional = false)
    @Column(name = "PO_NBR")
    private String poNbr;

    @Basic(optional = false)
    @Column(name = "GRS_AMT")
    private BigDecimal grsAmt;
    @Basic(optional = false)
    @Column(name = "DISC_AMT")
    private BigDecimal discAmt;
    @Basic(optional = false)
    @Column(name = "GL_ACCT_CD")
    private String glAcctCd;
    @Basic(optional = false)
    @Column(name = "FAX_NBR")
    private String faxNbr;
    @Basic(optional = false)
    @Column(name = "REPAIR_ODR_NBR")
    private String repairOdrNbr;
    @Basic(optional = false)
    @Column(name = "VEHICLE_NBR")
    private String vehicleNbr;
    @Basic(optional = false)
    @Column(name = "PROMPTED_DRVR_ID")
    private String promptedDrvrId;
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

    public VcapActvtyLog() {
    }

    public VcapActvtyLog(VcapActvtyLogPK vcapActvtyLogPK) {
        this.vcapActvtyLogPK = vcapActvtyLogPK;
    }

    public VcapActvtyLog(VcapActvtyLogPK vcapActvtyLogPK, String codeword, String supplierNm, String emailAddr1, String emailAddr2, String invDt, String paymentDt, String paymentNbr, String invoiceCmnt, String poNbr, BigDecimal grsAmt, BigDecimal discAmt, String glAcctCd, String faxNbr, String repairOdrNbr, String vehicleNbr, String promptedDrvrId, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.vcapActvtyLogPK = vcapActvtyLogPK;
        this.codeword = codeword;
        this.supplierNm = supplierNm;
        this.emailAddr1 = emailAddr1;
        this.emailAddr2 = emailAddr2;
        this.invDt = invDt;
        this.paymentDt = paymentDt;
        this.paymentNbr = paymentNbr;
        this.invoiceCmnt = invoiceCmnt;
        this.poNbr = poNbr;
        this.grsAmt = grsAmt;
        this.discAmt = discAmt;
        this.glAcctCd = glAcctCd;
        this.faxNbr = faxNbr;
        this.repairOdrNbr = repairOdrNbr;
        this.vehicleNbr = vehicleNbr;
        this.promptedDrvrId = promptedDrvrId;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public VcapActvtyLog(String acctNbr, String custId, String supplierCd, String invNbr, String vcInvNbr, BigDecimal netAmt, String dueDt) {
        this.vcapActvtyLogPK = new VcapActvtyLogPK(acctNbr, custId, supplierCd, invNbr, vcInvNbr, netAmt, dueDt);
    }

    public VcapActvtyLogPK getVcapActvtyLogPK() {
        return vcapActvtyLogPK;
    }

    public void setVcapActvtyLogPK(VcapActvtyLogPK vcapActvtyLogPK) {
        this.vcapActvtyLogPK = vcapActvtyLogPK;
    }

    public String getCodeword() {
        return codeword;
    }

    public void setCodeword(String codeword) {
        this.codeword = codeword;
    }

    public String getSupplierNm() {
        return supplierNm;
    }

    public void setSupplierNm(String supplierNm) {
        this.supplierNm = supplierNm;
    }

    public String getEmailAddr1() {
        return emailAddr1;
    }

    public void setEmailAddr1(String emailAddr1) {
        this.emailAddr1 = emailAddr1;
    }

    public String getEmailAddr2() {
        return emailAddr2;
    }

    public void setEmailAddr2(String emailAddr2) {
        this.emailAddr2 = emailAddr2;
    }

    public String getInvDt() {
        return invDt;
    }

    public void setInvDt(String invDt) {
        this.invDt = invDt;
    }

    public String getPaymentDt() {
        return paymentDt;
    }

    public void setPaymentDt(String paymentDt) {
        this.paymentDt = paymentDt;
    }

    public String getPaymentNbr() {
        return paymentNbr;
    }

    public void setPaymentNbr(String paymentNbr) {
        this.paymentNbr = paymentNbr;
    }

    public String getInvoiceCmnt() {
        return invoiceCmnt;
    }

    public void setInvoiceCmnt(String invoiceCmnt) {
        this.invoiceCmnt = invoiceCmnt;
    }

    public String getPoNbr() {
        return poNbr;
    }

    public void setPoNbr(String poNbr) {
        this.poNbr = poNbr;
    }

    public BigDecimal getGrsAmt() {
        return grsAmt;
    }

    public void setGrsAmt(BigDecimal grsAmt) {
        this.grsAmt = grsAmt;
    }

    public BigDecimal getDiscAmt() {
        return discAmt;
    }

    public void setDiscAmt(BigDecimal discAmt) {
        this.discAmt = discAmt;
    }

    public String getGlAcctCd() {
        return glAcctCd;
    }

    public void setGlAcctCd(String glAcctCd) {
        this.glAcctCd = glAcctCd;
    }

    public String getFaxNbr() {
        return faxNbr;
    }

    public void setFaxNbr(String faxNbr) {
        this.faxNbr = faxNbr;
    }

    public String getRepairOdrNbr() {
        return repairOdrNbr;
    }

    public void setRepairOdrNbr(String repairOdrNbr) {
        this.repairOdrNbr = repairOdrNbr;
    }

    public String getVehicleNbr() {
        return vehicleNbr;
    }

    public void setVehicleNbr(String vehicleNbr) {
        this.vehicleNbr = vehicleNbr;
    }

    public String getPromptedDrvrId() {
        return promptedDrvrId;
    }

    public void setPromptedDrvrId(String promptedDrvrId) {
        this.promptedDrvrId = promptedDrvrId;
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
        hash += (vcapActvtyLogPK != null ? vcapActvtyLogPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof VcapActvtyLog)) {
            return false;
        }
        VcapActvtyLog other = (VcapActvtyLog) object;
        if ((this.vcapActvtyLogPK == null && other.vcapActvtyLogPK != null) || (this.vcapActvtyLogPK != null && !this.vcapActvtyLogPK.equals(other.vcapActvtyLogPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.VcapActvtyLog[ vcapActvtyLogPK=" + vcapActvtyLogPK + " ]";
    }

}
