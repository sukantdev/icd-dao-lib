package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "PRP_CAN_TAX1", catalog = "", schema = "DBO")
public class PrpCanTax1 implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PrpCanTax1PK prpCanTax1PK;
    @Basic(optional = false)
    @Column(name = "PRP_CAN_TAX_PR1")
    private String prpCanTaxPr1;
    @Basic(optional = false)
    @Column(name = "PRP_CAN_TAX_PR2")
    private String prpCanTaxPr2;
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

    public PrpCanTax1() {
    }

    public PrpCanTax1(PrpCanTax1PK prpCanTax1PK) {
        this.prpCanTax1PK = prpCanTax1PK;
    }

    public PrpCanTax1(PrpCanTax1PK prpCanTax1PK, String prpCanTaxPr1, String prpCanTaxPr2, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.prpCanTax1PK = prpCanTax1PK;
        this.prpCanTaxPr1 = prpCanTaxPr1;
        this.prpCanTaxPr2 = prpCanTaxPr2;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public PrpCanTax1(String canTaxPrvncCd, String canTaxPrdCd, Date canEfctvDt) {
        this.prpCanTax1PK = new PrpCanTax1PK(canTaxPrvncCd, canTaxPrdCd, canEfctvDt);
    }

    public PrpCanTax1PK getPrpCanTax1PK() {
        return prpCanTax1PK;
    }

    public void setPrpCanTax1PK(PrpCanTax1PK prpCanTax1PK) {
        this.prpCanTax1PK = prpCanTax1PK;
    }

    public String getPrpCanTaxPr1() {
        return prpCanTaxPr1;
    }

    public void setPrpCanTaxPr1(String prpCanTaxPr1) {
        this.prpCanTaxPr1 = prpCanTaxPr1;
    }

    public String getPrpCanTaxPr2() {
        return prpCanTaxPr2;
    }

    public void setPrpCanTaxPr2(String prpCanTaxPr2) {
        this.prpCanTaxPr2 = prpCanTaxPr2;
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
        hash += (prpCanTax1PK != null ? prpCanTax1PK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof PrpCanTax1)) {
            return false;
        }
        PrpCanTax1 other = (PrpCanTax1) object;
        if ((this.prpCanTax1PK == null && other.prpCanTax1PK != null) || (this.prpCanTax1PK != null && !this.prpCanTax1PK.equals(other.prpCanTax1PK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.PrpCanTax1[ prpCanTax1PK=" + prpCanTax1PK + " ]";
    }

}
