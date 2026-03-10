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
@Table(name = "GEAC_PURGED_ACCOUNTS", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "GeacPurgedAccounts.findAll", query = "SELECT g FROM GeacPurgedAccounts g")})
public class GeacPurgedAccounts implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected GeacPurgedAccountsPK geacPurgedAccountsPK;
    @Basic(optional = false)
    @Column(name = "GEAC_NAME")
    private String geacName;
    @Basic(optional = false)
    @Column(name = "GEAC_ADDRESS1")
    private String geacAddress1;
    @Basic(optional = false)
    @Column(name = "GEAC_ADDRESS2")
    private String geacAddress2;
    @Basic(optional = false)
    @Column(name = "GEAC_ADDRESS3")
    private String geacAddress3;
    @Basic(optional = false)
    @Column(name = "GEAC_STATE_CD")
    private String geacStateCd;
    @Basic(optional = false)
    @Column(name = "GEAC_POSTAL_CD")
    private String geacPostalCd;
    @Basic(optional = false)
    @Column(name = "GEAC_PHONE_NBR")
    private String geacPhoneNbr;
    @Basic(optional = false)
    @Column(name = "CREDIT_LMT_AMT")
    private int creditLmtAmt;
    @Basic(optional = false)
    @Column(name = "GEAC_OPENED_DT")
    private String geacOpenedDt;
    @Basic(optional = false)
    @Column(name = "GEAC_LAST_SALE_DT")
    @Temporal(TemporalType.DATE)
    private Date geacLastSaleDt;
    @Basic(optional = false)
    @Column(name = "GEAC_LAST_CASH_DT")
    @Temporal(TemporalType.DATE)
    private Date geacLastCashDt;
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

    public GeacPurgedAccounts() {
    }

    public GeacPurgedAccounts(GeacPurgedAccountsPK geacPurgedAccountsPK) {
        this.geacPurgedAccountsPK = geacPurgedAccountsPK;
    }

    public GeacPurgedAccounts(GeacPurgedAccountsPK geacPurgedAccountsPK, String geacName, String geacAddress1, String geacAddress2, String geacAddress3, String geacStateCd, String geacPostalCd, String geacPhoneNbr, int creditLmtAmt, String geacOpenedDt, Date geacLastSaleDt, Date geacLastCashDt, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.geacPurgedAccountsPK = geacPurgedAccountsPK;
        this.geacName = geacName;
        this.geacAddress1 = geacAddress1;
        this.geacAddress2 = geacAddress2;
        this.geacAddress3 = geacAddress3;
        this.geacStateCd = geacStateCd;
        this.geacPostalCd = geacPostalCd;
        this.geacPhoneNbr = geacPhoneNbr;
        this.creditLmtAmt = creditLmtAmt;
        this.geacOpenedDt = geacOpenedDt;
        this.geacLastSaleDt = geacLastSaleDt;
        this.geacLastCashDt = geacLastCashDt;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public GeacPurgedAccounts(Date purgeDt, String geacAcctNbr, String geacCmpyCd) {
        this.geacPurgedAccountsPK = new GeacPurgedAccountsPK(purgeDt, geacAcctNbr, geacCmpyCd);
    }

    public GeacPurgedAccountsPK getGeacPurgedAccountsPK() {
        return geacPurgedAccountsPK;
    }

    public void setGeacPurgedAccountsPK(GeacPurgedAccountsPK geacPurgedAccountsPK) {
        this.geacPurgedAccountsPK = geacPurgedAccountsPK;
    }

    public String getGeacName() {
        return geacName;
    }

    public void setGeacName(String geacName) {
        this.geacName = geacName;
    }

    public String getGeacAddress1() {
        return geacAddress1;
    }

    public void setGeacAddress1(String geacAddress1) {
        this.geacAddress1 = geacAddress1;
    }

    public String getGeacAddress2() {
        return geacAddress2;
    }

    public void setGeacAddress2(String geacAddress2) {
        this.geacAddress2 = geacAddress2;
    }

    public String getGeacAddress3() {
        return geacAddress3;
    }

    public void setGeacAddress3(String geacAddress3) {
        this.geacAddress3 = geacAddress3;
    }

    public String getGeacStateCd() {
        return geacStateCd;
    }

    public void setGeacStateCd(String geacStateCd) {
        this.geacStateCd = geacStateCd;
    }

    public String getGeacPostalCd() {
        return geacPostalCd;
    }

    public void setGeacPostalCd(String geacPostalCd) {
        this.geacPostalCd = geacPostalCd;
    }

    public String getGeacPhoneNbr() {
        return geacPhoneNbr;
    }

    public void setGeacPhoneNbr(String geacPhoneNbr) {
        this.geacPhoneNbr = geacPhoneNbr;
    }

    public int getCreditLmtAmt() {
        return creditLmtAmt;
    }

    public void setCreditLmtAmt(int creditLmtAmt) {
        this.creditLmtAmt = creditLmtAmt;
    }

    public String getGeacOpenedDt() {
        return geacOpenedDt;
    }

    public void setGeacOpenedDt(String geacOpenedDt) {
        this.geacOpenedDt = geacOpenedDt;
    }

    public Date getGeacLastSaleDt() {
        return geacLastSaleDt;
    }

    public void setGeacLastSaleDt(Date geacLastSaleDt) {
        this.geacLastSaleDt = geacLastSaleDt;
    }

    public Date getGeacLastCashDt() {
        return geacLastCashDt;
    }

    public void setGeacLastCashDt(Date geacLastCashDt) {
        this.geacLastCashDt = geacLastCashDt;
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
        hash += (geacPurgedAccountsPK != null ? geacPurgedAccountsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GeacPurgedAccounts)) {
            return false;
        }
        GeacPurgedAccounts other = (GeacPurgedAccounts) object;
        if ((this.geacPurgedAccountsPK == null && other.geacPurgedAccountsPK != null) || (this.geacPurgedAccountsPK != null && !this.geacPurgedAccountsPK.equals(other.geacPurgedAccountsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.GeacPurgedAccounts[ geacPurgedAccountsPK=" + geacPurgedAccountsPK + " ]";
    }
    
}
