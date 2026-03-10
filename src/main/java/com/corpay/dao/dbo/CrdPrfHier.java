/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.corpay.dao.dbo;

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
import java.util.Date;

/**
 *
 * @author Sukant.Tiwari
 */
@Entity
@Table(name = "CRD_PRF_HIER", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "CrdPrfHier.findAll", query = "SELECT c FROM CrdPrfHier c")})
public class CrdPrfHier implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CrdPrfHierPK crdPrfHierPK;
    @Basic(optional = false)
    @Column(name = "ACCT_NBR")
    private String acctNbr;
    @Column(name = "RPTNG_HIER_LVL1")
    private String rptngHierLvl1;
    @Column(name = "RPTNG_HIER_LVL2")
    private String rptngHierLvl2;
    @Column(name = "RPTNG_HIER_LVL3")
    private String rptngHierLvl3;
    @Column(name = "RPTNG_HIER_LVL4")
    private String rptngHierLvl4;
    @Column(name = "RPTNG_HIER_LVL5")
    private String rptngHierLvl5;
    @Column(name = "RPTNG_HIER_LVL6")
    private String rptngHierLvl6;
    @Column(name = "RPTNG_HIER_LVL7")
    private String rptngHierLvl7;
    @Column(name = "RPTNG_HIER_LVL8")
    private String rptngHierLvl8;
    @Column(name = "RPTNG_HIER_LVL9")
    private String rptngHierLvl9;
    @Column(name = "RPTNG_HIER_LVL10")
    private String rptngHierLvl10;
    @Column(name = "RPTNG_HIER_LVL11")
    private String rptngHierLvl11;
    @Column(name = "RPTNG_HIER_LVL12")
    private String rptngHierLvl12;
    @Column(name = "RPTNG_HIER_LVL13")
    private String rptngHierLvl13;
    @Column(name = "RPTNG_HIER_LVL14")
    private String rptngHierLvl14;
    @Column(name = "RPTNG_HIER_LVL15")
    private String rptngHierLvl15;
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

    public CrdPrfHier() {
    }

    public CrdPrfHier(CrdPrfHierPK crdPrfHierPK) {
        this.crdPrfHierPK = crdPrfHierPK;
    }

    public CrdPrfHier(CrdPrfHierPK crdPrfHierPK, String acctNbr, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.crdPrfHierPK = crdPrfHierPK;
        this.acctNbr = acctNbr;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public CrdPrfHier(String custId, String compStandXref) {
        this.crdPrfHierPK = new CrdPrfHierPK(custId, compStandXref);
    }

    public CrdPrfHierPK getCrdPrfHierPK() {
        return crdPrfHierPK;
    }

    public void setCrdPrfHierPK(CrdPrfHierPK crdPrfHierPK) {
        this.crdPrfHierPK = crdPrfHierPK;
    }

    public String getAcctNbr() {
        return acctNbr;
    }

    public void setAcctNbr(String acctNbr) {
        this.acctNbr = acctNbr;
    }

    public String getRptngHierLvl1() {
        return rptngHierLvl1;
    }

    public void setRptngHierLvl1(String rptngHierLvl1) {
        this.rptngHierLvl1 = rptngHierLvl1;
    }

    public String getRptngHierLvl2() {
        return rptngHierLvl2;
    }

    public void setRptngHierLvl2(String rptngHierLvl2) {
        this.rptngHierLvl2 = rptngHierLvl2;
    }

    public String getRptngHierLvl3() {
        return rptngHierLvl3;
    }

    public void setRptngHierLvl3(String rptngHierLvl3) {
        this.rptngHierLvl3 = rptngHierLvl3;
    }

    public String getRptngHierLvl4() {
        return rptngHierLvl4;
    }

    public void setRptngHierLvl4(String rptngHierLvl4) {
        this.rptngHierLvl4 = rptngHierLvl4;
    }

    public String getRptngHierLvl5() {
        return rptngHierLvl5;
    }

    public void setRptngHierLvl5(String rptngHierLvl5) {
        this.rptngHierLvl5 = rptngHierLvl5;
    }

    public String getRptngHierLvl6() {
        return rptngHierLvl6;
    }

    public void setRptngHierLvl6(String rptngHierLvl6) {
        this.rptngHierLvl6 = rptngHierLvl6;
    }

    public String getRptngHierLvl7() {
        return rptngHierLvl7;
    }

    public void setRptngHierLvl7(String rptngHierLvl7) {
        this.rptngHierLvl7 = rptngHierLvl7;
    }

    public String getRptngHierLvl8() {
        return rptngHierLvl8;
    }

    public void setRptngHierLvl8(String rptngHierLvl8) {
        this.rptngHierLvl8 = rptngHierLvl8;
    }

    public String getRptngHierLvl9() {
        return rptngHierLvl9;
    }

    public void setRptngHierLvl9(String rptngHierLvl9) {
        this.rptngHierLvl9 = rptngHierLvl9;
    }

    public String getRptngHierLvl10() {
        return rptngHierLvl10;
    }

    public void setRptngHierLvl10(String rptngHierLvl10) {
        this.rptngHierLvl10 = rptngHierLvl10;
    }

    public String getRptngHierLvl11() {
        return rptngHierLvl11;
    }

    public void setRptngHierLvl11(String rptngHierLvl11) {
        this.rptngHierLvl11 = rptngHierLvl11;
    }

    public String getRptngHierLvl12() {
        return rptngHierLvl12;
    }

    public void setRptngHierLvl12(String rptngHierLvl12) {
        this.rptngHierLvl12 = rptngHierLvl12;
    }

    public String getRptngHierLvl13() {
        return rptngHierLvl13;
    }

    public void setRptngHierLvl13(String rptngHierLvl13) {
        this.rptngHierLvl13 = rptngHierLvl13;
    }

    public String getRptngHierLvl14() {
        return rptngHierLvl14;
    }

    public void setRptngHierLvl14(String rptngHierLvl14) {
        this.rptngHierLvl14 = rptngHierLvl14;
    }

    public String getRptngHierLvl15() {
        return rptngHierLvl15;
    }

    public void setRptngHierLvl15(String rptngHierLvl15) {
        this.rptngHierLvl15 = rptngHierLvl15;
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
        hash += (crdPrfHierPK != null ? crdPrfHierPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CrdPrfHier)) {
            return false;
        }
        CrdPrfHier other = (CrdPrfHier) object;
        if ((this.crdPrfHierPK == null && other.crdPrfHierPK != null) || (this.crdPrfHierPK != null && !this.crdPrfHierPK.equals(other.crdPrfHierPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.CrdPrfHier[ crdPrfHierPK=" + crdPrfHierPK + " ]";
    }
    
}
