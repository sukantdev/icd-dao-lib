package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "VMC_ADVC", catalog = "", schema = "DBO")
public class VmcAdvc implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CRD_NBR")
    private String crdNbr;
    @Basic(optional = false)
    @Column(name = "ACCT_NBR")
    private String acctNbr;
    @Basic(optional = false)
    @Column(name = "CUST_ID")
    private String custId;
    @Basic(optional = false)
    @Column(name = "VRTL_CRD_INV_NBR")
    private String vrtlCrdInvNbr;
    @Basic(optional = false)
    @Column(name = "SUPL_NM")
    private String suplNm;
    @Basic(optional = false)
    @Column(name = "EMAIL_ADDR1")
    private String emailAddr1;
    @Basic(optional = false)
    @Column(name = "EMAIL_ADDR2")
    private String emailAddr2;
    @Basic(optional = false)
    @Column(name = "PMT_NBR")
    private String pmtNbr;
    @Basic(optional = false)
    @Column(name = "FAX")
    private String fax;
    @Basic(optional = false)
    @Column(name = "REMIT_ADVC_SENT_FL")
    private Character remitAdvcSentFl;
    @Basic(optional = false)
    @Column(name = "REMIT_ADVC_SENT_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date remitAdvcSentTs;
    @Basic(optional = false)
    @Column(name = "EXPR_DT")
    private String exprDt;
    @Basic(optional = false)
    @Column(name = "CRD_VERIFICATION_C")
    private String crdVerificationC;
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
    @Basic(optional = false)
    @Column(name = "PMT_TYP")
    private String pmtTyp;
    @Basic(optional = false)
    @Column(name = "VENDOR_NBR")
    private String vendorNbr;
    @Basic(optional = false)
    @Column(name = "LOC_CD")
    private String locCd;
    @Basic(optional = false)
    @Column(name = "CODEWORD")
    private String codeword;
    @Basic(optional = false)
    @Column(name = "GL_ACCT_CD")
    private String glAcctCd;
    @Column(name = "MASKED_CRD_FL")
    private Character maskedCrdFl;
    @Column(name = "COMP_NM")
    private String compNm;
    @Column(name = "CRD_HLDR_NM")
    private String crdHldrNm;

    public VmcAdvc() {
    }

    public VmcAdvc(String crdNbr) {
        this.crdNbr = crdNbr;
    }

    public VmcAdvc(String crdNbr, String acctNbr, String custId, String vrtlCrdInvNbr, String suplNm, String emailAddr1, String emailAddr2, String pmtNbr, String fax, Character remitAdvcSentFl, Date remitAdvcSentTs, String exprDt, String crdVerificationC, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr, String pmtTyp, String vendorNbr, String locCd, String codeword, String glAcctCd) {
        this.crdNbr = crdNbr;
        this.acctNbr = acctNbr;
        this.custId = custId;
        this.vrtlCrdInvNbr = vrtlCrdInvNbr;
        this.suplNm = suplNm;
        this.emailAddr1 = emailAddr1;
        this.emailAddr2 = emailAddr2;
        this.pmtNbr = pmtNbr;
        this.fax = fax;
        this.remitAdvcSentFl = remitAdvcSentFl;
        this.remitAdvcSentTs = remitAdvcSentTs;
        this.exprDt = exprDt;
        this.crdVerificationC = crdVerificationC;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
        this.pmtTyp = pmtTyp;
        this.vendorNbr = vendorNbr;
        this.locCd = locCd;
        this.codeword = codeword;
        this.glAcctCd = glAcctCd;
    }

    public String getCrdNbr() {
        return crdNbr;
    }

    public void setCrdNbr(String crdNbr) {
        this.crdNbr = crdNbr;
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

    public String getVrtlCrdInvNbr() {
        return vrtlCrdInvNbr;
    }

    public void setVrtlCrdInvNbr(String vrtlCrdInvNbr) {
        this.vrtlCrdInvNbr = vrtlCrdInvNbr;
    }

    public String getSuplNm() {
        return suplNm;
    }

    public void setSuplNm(String suplNm) {
        this.suplNm = suplNm;
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

    public String getPmtNbr() {
        return pmtNbr;
    }

    public void setPmtNbr(String pmtNbr) {
        this.pmtNbr = pmtNbr;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public Character getRemitAdvcSentFl() {
        return remitAdvcSentFl;
    }

    public void setRemitAdvcSentFl(Character remitAdvcSentFl) {
        this.remitAdvcSentFl = remitAdvcSentFl;
    }

    public Date getRemitAdvcSentTs() {
        return remitAdvcSentTs;
    }

    public void setRemitAdvcSentTs(Date remitAdvcSentTs) {
        this.remitAdvcSentTs = remitAdvcSentTs;
    }

    public String getExprDt() {
        return exprDt;
    }

    public void setExprDt(String exprDt) {
        this.exprDt = exprDt;
    }

    public String getCrdVerificationC() {
        return crdVerificationC;
    }

    public void setCrdVerificationC(String crdVerificationC) {
        this.crdVerificationC = crdVerificationC;
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

    public String getPmtTyp() {
        return pmtTyp;
    }

    public void setPmtTyp(String pmtTyp) {
        this.pmtTyp = pmtTyp;
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

    public String getCodeword() {
        return codeword;
    }

    public void setCodeword(String codeword) {
        this.codeword = codeword;
    }

    public String getGlAcctCd() {
        return glAcctCd;
    }

    public void setGlAcctCd(String glAcctCd) {
        this.glAcctCd = glAcctCd;
    }

    public Character getMaskedCrdFl() {
        return maskedCrdFl;
    }

    public void setMaskedCrdFl(Character maskedCrdFl) {
        this.maskedCrdFl = maskedCrdFl;
    }

    public String getCompNm() {
        return compNm;
    }

    public void setCompNm(String compNm) {
        this.compNm = compNm;
    }

    public String getCrdHldrNm() {
        return crdHldrNm;
    }

    public void setCrdHldrNm(String crdHldrNm) {
        this.crdHldrNm = crdHldrNm;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (crdNbr != null ? crdNbr.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof VmcAdvc)) {
            return false;
        }
        VmcAdvc other = (VmcAdvc) object;
        if ((this.crdNbr == null && other.crdNbr != null) || (this.crdNbr != null && !this.crdNbr.equals(other.crdNbr))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.VmcAdvc[ crdNbr=" + crdNbr + " ]";
    }

}
