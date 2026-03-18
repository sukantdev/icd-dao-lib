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
@Table(name = "VP_VLB_TRANSACTION", catalog = "", schema = "DBO")
public class VpVlbTransaction implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected VpVlbTransactionPK vpVlbTransactionPK;
    @Basic(optional = false)
    @Column(name = "SUPPLIER")
    private String supplier;
    @Basic(optional = false)
    @Column(name = "CRD_TYP")
    private String crdTyp;
    @Basic(optional = false)
    @Column(name = "ACCT_NBR")
    private String acctNbr;
    @Basic(optional = false)
    @Column(name = "INVOICE_NBR")
    private String invoiceNbr;

    @Basic(optional = false)
    @Column(name = "TOT_PYMNT_AMT")
    private BigDecimal totPymntAmt;
    @Basic(optional = false)
    @Column(name = "INVOICE_AMT")
    private BigDecimal invoiceAmt;
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
    @Column(name = "PROCESS_FLG")
    private Character processFlg;
    @Basic(optional = false)
    @Column(name = "PYMNT_STAT_TXT")
    private String pymntStatTxt;
    @Basic(optional = false)
    @Column(name = "INVOICE_EXC_RSN_TX")
    private String invoiceExcRsnTx;
    @Basic(optional = false)
    @Column(name = "CRD_RESP_TXT")
    private String crdRespTxt;

    public VpVlbTransaction() {
    }

    public VpVlbTransaction(VpVlbTransactionPK vpVlbTransactionPK) {
        this.vpVlbTransactionPK = vpVlbTransactionPK;
    }

    public VpVlbTransaction(VpVlbTransactionPK vpVlbTransactionPK, String supplier, String crdTyp, String acctNbr, String invoiceNbr, BigDecimal totPymntAmt, BigDecimal invoiceAmt, String mdyUsr, Date mdyTs, String crtUsr, Date crtTs, Character processFlg, String pymntStatTxt, String invoiceExcRsnTx, String crdRespTxt) {
        this.vpVlbTransactionPK = vpVlbTransactionPK;
        this.supplier = supplier;
        this.crdTyp = crdTyp;
        this.acctNbr = acctNbr;
        this.invoiceNbr = invoiceNbr;
        this.totPymntAmt = totPymntAmt;
        this.invoiceAmt = invoiceAmt;
        this.mdyUsr = mdyUsr;
        this.mdyTs = mdyTs;
        this.crtUsr = crtUsr;
        this.crtTs = crtTs;
        this.processFlg = processFlg;
        this.pymntStatTxt = pymntStatTxt;
        this.invoiceExcRsnTx = invoiceExcRsnTx;
        this.crdRespTxt = crdRespTxt;
    }

    public VpVlbTransaction(String cdnAcctNbr, String cnfrmNbr, Date pymntDt, int seqNbr) {
        this.vpVlbTransactionPK = new VpVlbTransactionPK(cdnAcctNbr, cnfrmNbr, pymntDt, seqNbr);
    }

    public VpVlbTransactionPK getVpVlbTransactionPK() {
        return vpVlbTransactionPK;
    }

    public void setVpVlbTransactionPK(VpVlbTransactionPK vpVlbTransactionPK) {
        this.vpVlbTransactionPK = vpVlbTransactionPK;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public String getCrdTyp() {
        return crdTyp;
    }

    public void setCrdTyp(String crdTyp) {
        this.crdTyp = crdTyp;
    }

    public String getAcctNbr() {
        return acctNbr;
    }

    public void setAcctNbr(String acctNbr) {
        this.acctNbr = acctNbr;
    }

    public String getInvoiceNbr() {
        return invoiceNbr;
    }

    public void setInvoiceNbr(String invoiceNbr) {
        this.invoiceNbr = invoiceNbr;
    }

    public BigDecimal getTotPymntAmt() {
        return totPymntAmt;
    }

    public void setTotPymntAmt(BigDecimal totPymntAmt) {
        this.totPymntAmt = totPymntAmt;
    }

    public BigDecimal getInvoiceAmt() {
        return invoiceAmt;
    }

    public void setInvoiceAmt(BigDecimal invoiceAmt) {
        this.invoiceAmt = invoiceAmt;
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

    public Character getProcessFlg() {
        return processFlg;
    }

    public void setProcessFlg(Character processFlg) {
        this.processFlg = processFlg;
    }

    public String getPymntStatTxt() {
        return pymntStatTxt;
    }

    public void setPymntStatTxt(String pymntStatTxt) {
        this.pymntStatTxt = pymntStatTxt;
    }

    public String getInvoiceExcRsnTx() {
        return invoiceExcRsnTx;
    }

    public void setInvoiceExcRsnTx(String invoiceExcRsnTx) {
        this.invoiceExcRsnTx = invoiceExcRsnTx;
    }

    public String getCrdRespTxt() {
        return crdRespTxt;
    }

    public void setCrdRespTxt(String crdRespTxt) {
        this.crdRespTxt = crdRespTxt;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (vpVlbTransactionPK != null ? vpVlbTransactionPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof VpVlbTransaction)) {
            return false;
        }
        VpVlbTransaction other = (VpVlbTransaction) object;
        if ((this.vpVlbTransactionPK == null && other.vpVlbTransactionPK != null) || (this.vpVlbTransactionPK != null && !this.vpVlbTransactionPK.equals(other.vpVlbTransactionPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.VpVlbTransaction[ vpVlbTransactionPK=" + vpVlbTransactionPK + " ]";
    }

}
