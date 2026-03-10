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
@Table(name = "ACH_3RD_PARTY_BANK", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "Ach3rdPartyBank.findAll", query = "SELECT a FROM Ach3rdPartyBank a")})
public class Ach3rdPartyBank implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected Ach3rdPartyBankPK ach3rdPartyBankPK;
    @Basic(optional = false)
    @Column(name = "BANK_NAME")
    private String bankName;
    @Basic(optional = false)
    @Column(name = "BANK_ADDR")
    private String bankAddr;
    @Basic(optional = false)
    @Column(name = "BANK_CITY")
    private String bankCity;
    @Basic(optional = false)
    @Column(name = "BANK_STATE")
    private String bankState;
    @Basic(optional = false)
    @Column(name = "BANK_ZIP_CODE")
    private int bankZipCode;
    @Basic(optional = false)
    @Column(name = "BANK_PHONE_NBR")
    private long bankPhoneNbr;
    @Basic(optional = false)
    @Column(name = "BANK_ACCT_NAME")
    private String bankAcctName;
    @Basic(optional = false)
    @Column(name = "BANK_CONTACT_NAME")
    private String bankContactName;
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

    public Ach3rdPartyBank() {
    }

    public Ach3rdPartyBank(Ach3rdPartyBankPK ach3rdPartyBankPK) {
        this.ach3rdPartyBankPK = ach3rdPartyBankPK;
    }

    public Ach3rdPartyBank(Ach3rdPartyBankPK ach3rdPartyBankPK, String bankName, String bankAddr, String bankCity, String bankState, int bankZipCode, long bankPhoneNbr, String bankAcctName, String bankContactName, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.ach3rdPartyBankPK = ach3rdPartyBankPK;
        this.bankName = bankName;
        this.bankAddr = bankAddr;
        this.bankCity = bankCity;
        this.bankState = bankState;
        this.bankZipCode = bankZipCode;
        this.bankPhoneNbr = bankPhoneNbr;
        this.bankAcctName = bankAcctName;
        this.bankContactName = bankContactName;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public Ach3rdPartyBank(String acctNbr, String bankAcctNbr, String bankRoutingNbr) {
        this.ach3rdPartyBankPK = new Ach3rdPartyBankPK(acctNbr, bankAcctNbr, bankRoutingNbr);
    }

    public Ach3rdPartyBankPK getAch3rdPartyBankPK() {
        return ach3rdPartyBankPK;
    }

    public void setAch3rdPartyBankPK(Ach3rdPartyBankPK ach3rdPartyBankPK) {
        this.ach3rdPartyBankPK = ach3rdPartyBankPK;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankAddr() {
        return bankAddr;
    }

    public void setBankAddr(String bankAddr) {
        this.bankAddr = bankAddr;
    }

    public String getBankCity() {
        return bankCity;
    }

    public void setBankCity(String bankCity) {
        this.bankCity = bankCity;
    }

    public String getBankState() {
        return bankState;
    }

    public void setBankState(String bankState) {
        this.bankState = bankState;
    }

    public int getBankZipCode() {
        return bankZipCode;
    }

    public void setBankZipCode(int bankZipCode) {
        this.bankZipCode = bankZipCode;
    }

    public long getBankPhoneNbr() {
        return bankPhoneNbr;
    }

    public void setBankPhoneNbr(long bankPhoneNbr) {
        this.bankPhoneNbr = bankPhoneNbr;
    }

    public String getBankAcctName() {
        return bankAcctName;
    }

    public void setBankAcctName(String bankAcctName) {
        this.bankAcctName = bankAcctName;
    }

    public String getBankContactName() {
        return bankContactName;
    }

    public void setBankContactName(String bankContactName) {
        this.bankContactName = bankContactName;
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
        hash += (ach3rdPartyBankPK != null ? ach3rdPartyBankPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ach3rdPartyBank)) {
            return false;
        }
        Ach3rdPartyBank other = (Ach3rdPartyBank) object;
        if ((this.ach3rdPartyBankPK == null && other.ach3rdPartyBankPK != null) || (this.ach3rdPartyBankPK != null && !this.ach3rdPartyBankPK.equals(other.ach3rdPartyBankPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.Ach3rdPartyBank[ ach3rdPartyBankPK=" + ach3rdPartyBankPK + " ]";
    }
    
}
