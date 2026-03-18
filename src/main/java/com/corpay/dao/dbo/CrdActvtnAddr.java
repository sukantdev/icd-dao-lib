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
@Table(name = "CRD_ACTVTN_ADDR", catalog = "", schema = "DBO")
public class CrdActvtnAddr implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CRD_NBR")
    private String crdNbr;
    @Basic(optional = false)
    @Column(name = "CUST_ID")
    private String custId;
    @Basic(optional = false)
    @Column(name = "CUST_ADDR1")
    private String custAddr1;
    @Basic(optional = false)
    @Column(name = "CUST_ADDR2")
    private String custAddr2;
    @Basic(optional = false)
    @Column(name = "CUST_CTY")
    private String custCty;
    @Basic(optional = false)
    @Column(name = "CUST_ST")
    private String custSt;
    @Basic(optional = false)
    @Column(name = "CUST_CRTY_CD")
    private String custCrtyCd;
    @Basic(optional = false)
    @Column(name = "CUST_ZIP")
    private String custZip;
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

    public CrdActvtnAddr() {
    }

    public CrdActvtnAddr(String crdNbr) {
        this.crdNbr = crdNbr;
    }

    public CrdActvtnAddr(String crdNbr, String custId, String custAddr1, String custAddr2, String custCty, String custSt, String custCrtyCd, String custZip, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.crdNbr = crdNbr;
        this.custId = custId;
        this.custAddr1 = custAddr1;
        this.custAddr2 = custAddr2;
        this.custCty = custCty;
        this.custSt = custSt;
        this.custCrtyCd = custCrtyCd;
        this.custZip = custZip;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public String getCrdNbr() {
        return crdNbr;
    }

    public void setCrdNbr(String crdNbr) {
        this.crdNbr = crdNbr;
    }

    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId;
    }

    public String getCustAddr1() {
        return custAddr1;
    }

    public void setCustAddr1(String custAddr1) {
        this.custAddr1 = custAddr1;
    }

    public String getCustAddr2() {
        return custAddr2;
    }

    public void setCustAddr2(String custAddr2) {
        this.custAddr2 = custAddr2;
    }

    public String getCustCty() {
        return custCty;
    }

    public void setCustCty(String custCty) {
        this.custCty = custCty;
    }

    public String getCustSt() {
        return custSt;
    }

    public void setCustSt(String custSt) {
        this.custSt = custSt;
    }

    public String getCustCrtyCd() {
        return custCrtyCd;
    }

    public void setCustCrtyCd(String custCrtyCd) {
        this.custCrtyCd = custCrtyCd;
    }

    public String getCustZip() {
        return custZip;
    }

    public void setCustZip(String custZip) {
        this.custZip = custZip;
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
        hash += (crdNbr != null ? crdNbr.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof CrdActvtnAddr)) {
            return false;
        }
        CrdActvtnAddr other = (CrdActvtnAddr) object;
        if ((this.crdNbr == null && other.crdNbr != null) || (this.crdNbr != null && !this.crdNbr.equals(other.crdNbr))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.CrdActvtnAddr[ crdNbr=" + crdNbr + " ]";
    }

}
