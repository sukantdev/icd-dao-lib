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
@Table(name = "EXPEDITE_FEES_DETAIL", catalog = "", schema = "DBO")
public class ExpediteFeesDetail implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ExpediteFeesDetailPK expediteFeesDetailPK;
    @Basic(optional = false)
    @Column(name = "EFD_PROCESSED")
    private Character efdProcessed;
    @Basic(optional = false)
    @Column(name = "EFD_ACCT_NBR")
    private String efdAcctNbr;
    @Basic(optional = false)
    @Column(name = "EFD_CUST_NBR")
    private String efdCustNbr;
    @Basic(optional = false)
    @Column(name = "EFD_INVOICE_NBR")
    private String efdInvoiceNbr;
    @Basic(optional = false)
    @Column(name = "EFD_USER_CODENAME_LAST")
    private String efdUserCodenameLast;
    @Basic(optional = false)
    @Column(name = "EFD_USER_CODENAME_FIRST")
    private String efdUserCodenameFirst;
    @Basic(optional = false)
    @Column(name = "EFD_CRD_FEE_SWITCH")
    private Character efdCrdFeeSwitch;
    @Basic(optional = false)
    @Column(name = "EFD_METHOD_OF_DELIVERY")
    private String efdMethodOfDelivery;
    @Basic(optional = false)
    @Column(name = "EFD_SHIP_TO_ADDR1")
    private String efdShipToAddr1;
    @Basic(optional = false)
    @Column(name = "EFD_SHIP_TO_ADDR2")
    private String efdShipToAddr2;
    @Basic(optional = false)
    @Column(name = "EFD_SHIP_TO_CITY")
    private String efdShipToCity;
    @Basic(optional = false)
    @Column(name = "EFD_SHIP_TO_STATE")
    private String efdShipToState;
    @Basic(optional = false)
    @Column(name = "EFD_SHIP_TO_ZIP")
    private String efdShipToZip;
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

    public ExpediteFeesDetail() {
    }

    public ExpediteFeesDetail(ExpediteFeesDetailPK expediteFeesDetailPK) {
        this.expediteFeesDetailPK = expediteFeesDetailPK;
    }

    public ExpediteFeesDetail(ExpediteFeesDetailPK expediteFeesDetailPK, Character efdProcessed, String efdAcctNbr, String efdCustNbr, String efdInvoiceNbr, String efdUserCodenameLast, String efdUserCodenameFirst, Character efdCrdFeeSwitch, String efdMethodOfDelivery, String efdShipToAddr1, String efdShipToAddr2, String efdShipToCity, String efdShipToState, String efdShipToZip, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.expediteFeesDetailPK = expediteFeesDetailPK;
        this.efdProcessed = efdProcessed;
        this.efdAcctNbr = efdAcctNbr;
        this.efdCustNbr = efdCustNbr;
        this.efdInvoiceNbr = efdInvoiceNbr;
        this.efdUserCodenameLast = efdUserCodenameLast;
        this.efdUserCodenameFirst = efdUserCodenameFirst;
        this.efdCrdFeeSwitch = efdCrdFeeSwitch;
        this.efdMethodOfDelivery = efdMethodOfDelivery;
        this.efdShipToAddr1 = efdShipToAddr1;
        this.efdShipToAddr2 = efdShipToAddr2;
        this.efdShipToCity = efdShipToCity;
        this.efdShipToState = efdShipToState;
        this.efdShipToZip = efdShipToZip;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public ExpediteFeesDetail(String efdCrdNbr, String efdRequestDate) {
        this.expediteFeesDetailPK = new ExpediteFeesDetailPK(efdCrdNbr, efdRequestDate);
    }

    public ExpediteFeesDetailPK getExpediteFeesDetailPK() {
        return expediteFeesDetailPK;
    }

    public void setExpediteFeesDetailPK(ExpediteFeesDetailPK expediteFeesDetailPK) {
        this.expediteFeesDetailPK = expediteFeesDetailPK;
    }

    public Character getEfdProcessed() {
        return efdProcessed;
    }

    public void setEfdProcessed(Character efdProcessed) {
        this.efdProcessed = efdProcessed;
    }

    public String getEfdAcctNbr() {
        return efdAcctNbr;
    }

    public void setEfdAcctNbr(String efdAcctNbr) {
        this.efdAcctNbr = efdAcctNbr;
    }

    public String getEfdCustNbr() {
        return efdCustNbr;
    }

    public void setEfdCustNbr(String efdCustNbr) {
        this.efdCustNbr = efdCustNbr;
    }

    public String getEfdInvoiceNbr() {
        return efdInvoiceNbr;
    }

    public void setEfdInvoiceNbr(String efdInvoiceNbr) {
        this.efdInvoiceNbr = efdInvoiceNbr;
    }

    public String getEfdUserCodenameLast() {
        return efdUserCodenameLast;
    }

    public void setEfdUserCodenameLast(String efdUserCodenameLast) {
        this.efdUserCodenameLast = efdUserCodenameLast;
    }

    public String getEfdUserCodenameFirst() {
        return efdUserCodenameFirst;
    }

    public void setEfdUserCodenameFirst(String efdUserCodenameFirst) {
        this.efdUserCodenameFirst = efdUserCodenameFirst;
    }

    public Character getEfdCrdFeeSwitch() {
        return efdCrdFeeSwitch;
    }

    public void setEfdCrdFeeSwitch(Character efdCrdFeeSwitch) {
        this.efdCrdFeeSwitch = efdCrdFeeSwitch;
    }

    public String getEfdMethodOfDelivery() {
        return efdMethodOfDelivery;
    }

    public void setEfdMethodOfDelivery(String efdMethodOfDelivery) {
        this.efdMethodOfDelivery = efdMethodOfDelivery;
    }

    public String getEfdShipToAddr1() {
        return efdShipToAddr1;
    }

    public void setEfdShipToAddr1(String efdShipToAddr1) {
        this.efdShipToAddr1 = efdShipToAddr1;
    }

    public String getEfdShipToAddr2() {
        return efdShipToAddr2;
    }

    public void setEfdShipToAddr2(String efdShipToAddr2) {
        this.efdShipToAddr2 = efdShipToAddr2;
    }

    public String getEfdShipToCity() {
        return efdShipToCity;
    }

    public void setEfdShipToCity(String efdShipToCity) {
        this.efdShipToCity = efdShipToCity;
    }

    public String getEfdShipToState() {
        return efdShipToState;
    }

    public void setEfdShipToState(String efdShipToState) {
        this.efdShipToState = efdShipToState;
    }

    public String getEfdShipToZip() {
        return efdShipToZip;
    }

    public void setEfdShipToZip(String efdShipToZip) {
        this.efdShipToZip = efdShipToZip;
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
        hash += (expediteFeesDetailPK != null ? expediteFeesDetailPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof ExpediteFeesDetail)) {
            return false;
        }
        ExpediteFeesDetail other = (ExpediteFeesDetail) object;
        if ((this.expediteFeesDetailPK == null && other.expediteFeesDetailPK != null) || (this.expediteFeesDetailPK != null && !this.expediteFeesDetailPK.equals(other.expediteFeesDetailPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.ExpediteFeesDetail[ expediteFeesDetailPK=" + expediteFeesDetailPK + " ]";
    }

}
