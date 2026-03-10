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
@Table(name = "PRD_CR_CRD", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "PrdCrCrd.findAll", query = "SELECT p FROM PrdCrCrd p")})
public class PrdCrCrd implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PrdCrCrdPK prdCrCrdPK;
    @Basic(optional = false)
    @Column(name = "CUST_NM")
    private String custNm;
    @Basic(optional = false)
    @Column(name = "CRD_NBR")
    private String crdNbr;
    @Basic(optional = false)
    @Column(name = "CRD_EXPR_DT")
    @Temporal(TemporalType.DATE)
    private Date crdExprDt;
    @Basic(optional = false)
    @Column(name = "ISU_BANK_NM")
    private String isuBankNm;
    @Basic(optional = false)
    @Column(name = "ISU_BANK_CTY")
    private String isuBankCty;
    @Basic(optional = false)
    @Column(name = "ISU_BANK_ST")
    private String isuBankSt;
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

    public PrdCrCrd() {
    }

    public PrdCrCrd(PrdCrCrdPK prdCrCrdPK) {
        this.prdCrCrdPK = prdCrCrdPK;
    }

    public PrdCrCrd(PrdCrCrdPK prdCrCrdPK, String custNm, String crdNbr, Date crdExprDt, String isuBankNm, String isuBankCty, String isuBankSt, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.prdCrCrdPK = prdCrCrdPK;
        this.custNm = custNm;
        this.crdNbr = crdNbr;
        this.crdExprDt = crdExprDt;
        this.isuBankNm = isuBankNm;
        this.isuBankCty = isuBankCty;
        this.isuBankSt = isuBankSt;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public PrdCrCrd(String applNbr, String childTyp, Character crdTyp) {
        this.prdCrCrdPK = new PrdCrCrdPK(applNbr, childTyp, crdTyp);
    }

    public PrdCrCrdPK getPrdCrCrdPK() {
        return prdCrCrdPK;
    }

    public void setPrdCrCrdPK(PrdCrCrdPK prdCrCrdPK) {
        this.prdCrCrdPK = prdCrCrdPK;
    }

    public String getCustNm() {
        return custNm;
    }

    public void setCustNm(String custNm) {
        this.custNm = custNm;
    }

    public String getCrdNbr() {
        return crdNbr;
    }

    public void setCrdNbr(String crdNbr) {
        this.crdNbr = crdNbr;
    }

    public Date getCrdExprDt() {
        return crdExprDt;
    }

    public void setCrdExprDt(Date crdExprDt) {
        this.crdExprDt = crdExprDt;
    }

    public String getIsuBankNm() {
        return isuBankNm;
    }

    public void setIsuBankNm(String isuBankNm) {
        this.isuBankNm = isuBankNm;
    }

    public String getIsuBankCty() {
        return isuBankCty;
    }

    public void setIsuBankCty(String isuBankCty) {
        this.isuBankCty = isuBankCty;
    }

    public String getIsuBankSt() {
        return isuBankSt;
    }

    public void setIsuBankSt(String isuBankSt) {
        this.isuBankSt = isuBankSt;
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
        hash += (prdCrCrdPK != null ? prdCrCrdPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PrdCrCrd)) {
            return false;
        }
        PrdCrCrd other = (PrdCrCrd) object;
        if ((this.prdCrCrdPK == null && other.prdCrCrdPK != null) || (this.prdCrCrdPK != null && !this.prdCrCrdPK.equals(other.prdCrCrdPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.PrdCrCrd[ prdCrCrdPK=" + prdCrCrdPK + " ]";
    }
    
}
