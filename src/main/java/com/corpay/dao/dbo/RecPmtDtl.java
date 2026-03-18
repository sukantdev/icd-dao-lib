package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "REC_PMT_DTL", catalog = "", schema = "DBO")
public class RecPmtDtl implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private String id;
    @Basic(optional = false)
    @Column(name = "SUM_ID")
    private String sumId;
    @Basic(optional = false)
    @Column(name = "INV_NBR")
    private String invNbr;
    @Basic(optional = false)
    @Column(name = "VC_INV_NBR")
    private String vcInvNbr;
    @Basic(optional = false)
    @Column(name = "GL_ACCT")
    private String glAcct;
    @Basic(optional = false)
    @Column(name = "PO_NBR")
    private String poNbr;
    @Basic(optional = false)
    @Column(name = "PMT_NBR")
    private String pmtNbr;
    @Basic(optional = false)
    @Column(name = "INV_CMTS")
    private String invCmts;

    @Basic(optional = false)
    @Column(name = "GROSS_AMT")
    private BigDecimal grossAmt;
    @Basic(optional = false)
    @Column(name = "DISC_AMT")
    private BigDecimal discAmt;
    @Basic(optional = false)
    @Column(name = "NET_AMT")
    private BigDecimal netAmt;
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

    public RecPmtDtl() {
    }

    public RecPmtDtl(String id) {
        this.id = id;
    }

    public RecPmtDtl(String id, String sumId, String invNbr, String vcInvNbr, String glAcct, String poNbr, String pmtNbr, String invCmts, BigDecimal grossAmt, BigDecimal discAmt, BigDecimal netAmt, String mdyUsr, Date mdyTs, String crtUsr, Date crtTs) {
        this.id = id;
        this.sumId = sumId;
        this.invNbr = invNbr;
        this.vcInvNbr = vcInvNbr;
        this.glAcct = glAcct;
        this.poNbr = poNbr;
        this.pmtNbr = pmtNbr;
        this.invCmts = invCmts;
        this.grossAmt = grossAmt;
        this.discAmt = discAmt;
        this.netAmt = netAmt;
        this.mdyUsr = mdyUsr;
        this.mdyTs = mdyTs;
        this.crtUsr = crtUsr;
        this.crtTs = crtTs;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSumId() {
        return sumId;
    }

    public void setSumId(String sumId) {
        this.sumId = sumId;
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

    public String getGlAcct() {
        return glAcct;
    }

    public void setGlAcct(String glAcct) {
        this.glAcct = glAcct;
    }

    public String getPoNbr() {
        return poNbr;
    }

    public void setPoNbr(String poNbr) {
        this.poNbr = poNbr;
    }

    public String getPmtNbr() {
        return pmtNbr;
    }

    public void setPmtNbr(String pmtNbr) {
        this.pmtNbr = pmtNbr;
    }

    public String getInvCmts() {
        return invCmts;
    }

    public void setInvCmts(String invCmts) {
        this.invCmts = invCmts;
    }

    public BigDecimal getGrossAmt() {
        return grossAmt;
    }

    public void setGrossAmt(BigDecimal grossAmt) {
        this.grossAmt = grossAmt;
    }

    public BigDecimal getDiscAmt() {
        return discAmt;
    }

    public void setDiscAmt(BigDecimal discAmt) {
        this.discAmt = discAmt;
    }

    public BigDecimal getNetAmt() {
        return netAmt;
    }

    public void setNetAmt(BigDecimal netAmt) {
        this.netAmt = netAmt;
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
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof RecPmtDtl)) {
            return false;
        }
        RecPmtDtl other = (RecPmtDtl) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.RecPmtDtl[ id=" + id + " ]";
    }

}
