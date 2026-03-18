package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;
import java.math.BigDecimal;

@Embeddable
public class VcapActvtyLogPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "ACCT_NBR")
    private String acctNbr;
    @Basic(optional = false)
    @Column(name = "CUST_ID")
    private String custId;
    @Basic(optional = false)
    @Column(name = "SUPPLIER_CD")
    private String supplierCd;
    @Basic(optional = false)
    @Column(name = "INV_NBR")
    private String invNbr;
    @Basic(optional = false)
    @Column(name = "VC_INV_NBR")
    private String vcInvNbr;

    @Basic(optional = false)
    @Column(name = "NET_AMT")
    private BigDecimal netAmt;
    @Basic(optional = false)
    @Column(name = "DUE_DT")
    private String dueDt;

    public VcapActvtyLogPK() {
    }

    public VcapActvtyLogPK(String acctNbr, String custId, String supplierCd, String invNbr, String vcInvNbr, BigDecimal netAmt, String dueDt) {
        this.acctNbr = acctNbr;
        this.custId = custId;
        this.supplierCd = supplierCd;
        this.invNbr = invNbr;
        this.vcInvNbr = vcInvNbr;
        this.netAmt = netAmt;
        this.dueDt = dueDt;
    }

    public String getAcctNbr() {
        return acctNbr;
    }

    public void setAcctNbr(String acctNbr) {
        this.acctNbr = acctNbr;
    }

    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId;
    }

    public String getSupplierCd() {
        return supplierCd;
    }

    public void setSupplierCd(String supplierCd) {
        this.supplierCd = supplierCd;
    }

    public String getInvNbr() {
        return invNbr;
    }

    public void setInvNbr(String invNbr) {
        this.invNbr = invNbr;
    }

    public String getVcInvNbr() {
        return vcInvNbr;
    }

    public void setVcInvNbr(String vcInvNbr) {
        this.vcInvNbr = vcInvNbr;
    }

    public BigDecimal getNetAmt() {
        return netAmt;
    }

    public void setNetAmt(BigDecimal netAmt) {
        this.netAmt = netAmt;
    }

    public String getDueDt() {
        return dueDt;
    }

    public void setDueDt(String dueDt) {
        this.dueDt = dueDt;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (acctNbr != null ? acctNbr.hashCode() : 0);
        hash += (custId != null ? custId.hashCode() : 0);
        hash += (supplierCd != null ? supplierCd.hashCode() : 0);
        hash += (invNbr != null ? invNbr.hashCode() : 0);
        hash += (vcInvNbr != null ? vcInvNbr.hashCode() : 0);
        hash += (netAmt != null ? netAmt.hashCode() : 0);
        hash += (dueDt != null ? dueDt.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof VcapActvtyLogPK)) {
            return false;
        }
        VcapActvtyLogPK other = (VcapActvtyLogPK) object;
        if ((this.acctNbr == null && other.acctNbr != null) || (this.acctNbr != null && !this.acctNbr.equals(other.acctNbr))) {
            return false;
        }
        if ((this.custId == null && other.custId != null) || (this.custId != null && !this.custId.equals(other.custId))) {
            return false;
        }
        if ((this.supplierCd == null && other.supplierCd != null) || (this.supplierCd != null && !this.supplierCd.equals(other.supplierCd))) {
            return false;
        }
        if ((this.invNbr == null && other.invNbr != null) || (this.invNbr != null && !this.invNbr.equals(other.invNbr))) {
            return false;
        }
        if ((this.vcInvNbr == null && other.vcInvNbr != null) || (this.vcInvNbr != null && !this.vcInvNbr.equals(other.vcInvNbr))) {
            return false;
        }
        if ((this.netAmt == null && other.netAmt != null) || (this.netAmt != null && !this.netAmt.equals(other.netAmt))) {
            return false;
        }
        if ((this.dueDt == null && other.dueDt != null) || (this.dueDt != null && !this.dueDt.equals(other.dueDt))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.VcapActvtyLogPK[ acctNbr=" + acctNbr + ", custId=" + custId + ", supplierCd=" + supplierCd + ", invNbr=" + invNbr + ", vcInvNbr=" + vcInvNbr + ", netAmt=" + netAmt + ", dueDt=" + dueDt + " ]";
    }

}
