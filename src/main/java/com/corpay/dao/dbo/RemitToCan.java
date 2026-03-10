/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
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
@Table(name = "REMIT_TO_CAN", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "RemitToCan.findAll", query = "SELECT r FROM RemitToCan r")})
public class RemitToCan implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "RMT_TO_COMP")
    private String rmtToComp;
    @Basic(optional = false)
    @Column(name = "RMT_TO_CURR")
    private String rmtToCurr;
    @Basic(optional = false)
    @Column(name = "RMT_TO_CURR_DESC")
    private String rmtToCurrDesc;
    @Basic(optional = false)
    @Column(name = "RMT_TO_ELEC_BILL_PAYEE")
    private String rmtToElecBillPayee;
    @Basic(optional = false)
    @Column(name = "RMT_TO_EFT_BANK_NM")
    private String rmtToEftBankNm;
    @Basic(optional = false)
    @Column(name = "RMT_TO_EFT_ACCT_NBR")
    private String rmtToEftAcctNbr;
    @Basic(optional = false)
    @Column(name = "RMT_TO_EFT_BANK_ID")
    private String rmtToEftBankId;
    @Basic(optional = false)
    @Column(name = "RMT_TO_EFT_BRANCH_NBR")
    private String rmtToEftBranchNbr;
    @Basic(optional = false)
    @Column(name = "RMT_TO_EFT_CITY")
    private String rmtToEftCity;
    @Basic(optional = false)
    @Column(name = "RMT_TO_EFT_PROV")
    private String rmtToEftProv;
    @Basic(optional = false)
    @Column(name = "RMT_TO_EFT_POSTAL_CD")
    private String rmtToEftPostalCd;
    @Basic(optional = false)
    @Column(name = "RMT_TO_WIRE_BANK_NM")
    private String rmtToWireBankNm;
    @Basic(optional = false)
    @Column(name = "RMT_TO_WIRE_ACCT_NBR")
    private String rmtToWireAcctNbr;
    @Basic(optional = false)
    @Column(name = "RMT_TO_WIRE_BANK_ID")
    private String rmtToWireBankId;
    @Basic(optional = false)
    @Column(name = "RMT_TO_WIRE_BRANCH_NBR")
    private String rmtToWireBranchNbr;
    @Basic(optional = false)
    @Column(name = "RMT_TO_WIRE_CITY")
    private String rmtToWireCity;
    @Basic(optional = false)
    @Column(name = "RMT_TO_WIRE_PROV")
    private String rmtToWireProv;
    @Basic(optional = false)
    @Column(name = "RMT_TO_WIRE_POSTAL_CD")
    private String rmtToWirePostalCd;
    @Basic(optional = false)
    @Column(name = "RMT_TO_PAST_DUE_PHONE_NBR")
    private String rmtToPastDuePhoneNbr;
    @Basic(optional = false)
    @Column(name = "RMT_TO_PAST_DUE_FAX_NBR")
    private String rmtToPastDueFaxNbr;
    @Basic(optional = false)
    @Column(name = "RMT_TO_PAST_DUE_EMAIL")
    private String rmtToPastDueEmail;
    @Basic(optional = false)
    @Column(name = "RMT_TO_OTHER_PHONE")
    private String rmtToOtherPhone;
    @Basic(optional = false)
    @Column(name = "RMT_TO_OTHER_FAX")
    private String rmtToOtherFax;
    @Basic(optional = false)
    @Column(name = "RMT_TO_OTHER_EMAIL")
    private String rmtToOtherEmail;
    @Basic(optional = false)
    @Column(name = "RMT_TO_ELECTRONIC_FAX")
    private String rmtToElectronicFax;
    @Basic(optional = false)
    @Column(name = "RMT_TO_ELECTRONIC_EMAIL")
    private String rmtToElectronicEmail;
    @Basic(optional = false)
    @Column(name = "RMT_TO_CMNT_1")
    private String rmtToCmnt1;
    @Basic(optional = false)
    @Column(name = "RMT_TO_CMNT_2")
    private String rmtToCmnt2;
    @Basic(optional = false)
    @Column(name = "RMT_TO_CMNT_3")
    private String rmtToCmnt3;
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

    public RemitToCan() {
    }

    public RemitToCan(String rmtToComp) {
        this.rmtToComp = rmtToComp;
    }

    public RemitToCan(String rmtToComp, String rmtToCurr, String rmtToCurrDesc, String rmtToElecBillPayee, String rmtToEftBankNm, String rmtToEftAcctNbr, String rmtToEftBankId, String rmtToEftBranchNbr, String rmtToEftCity, String rmtToEftProv, String rmtToEftPostalCd, String rmtToWireBankNm, String rmtToWireAcctNbr, String rmtToWireBankId, String rmtToWireBranchNbr, String rmtToWireCity, String rmtToWireProv, String rmtToWirePostalCd, String rmtToPastDuePhoneNbr, String rmtToPastDueFaxNbr, String rmtToPastDueEmail, String rmtToOtherPhone, String rmtToOtherFax, String rmtToOtherEmail, String rmtToElectronicFax, String rmtToElectronicEmail, String rmtToCmnt1, String rmtToCmnt2, String rmtToCmnt3, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.rmtToComp = rmtToComp;
        this.rmtToCurr = rmtToCurr;
        this.rmtToCurrDesc = rmtToCurrDesc;
        this.rmtToElecBillPayee = rmtToElecBillPayee;
        this.rmtToEftBankNm = rmtToEftBankNm;
        this.rmtToEftAcctNbr = rmtToEftAcctNbr;
        this.rmtToEftBankId = rmtToEftBankId;
        this.rmtToEftBranchNbr = rmtToEftBranchNbr;
        this.rmtToEftCity = rmtToEftCity;
        this.rmtToEftProv = rmtToEftProv;
        this.rmtToEftPostalCd = rmtToEftPostalCd;
        this.rmtToWireBankNm = rmtToWireBankNm;
        this.rmtToWireAcctNbr = rmtToWireAcctNbr;
        this.rmtToWireBankId = rmtToWireBankId;
        this.rmtToWireBranchNbr = rmtToWireBranchNbr;
        this.rmtToWireCity = rmtToWireCity;
        this.rmtToWireProv = rmtToWireProv;
        this.rmtToWirePostalCd = rmtToWirePostalCd;
        this.rmtToPastDuePhoneNbr = rmtToPastDuePhoneNbr;
        this.rmtToPastDueFaxNbr = rmtToPastDueFaxNbr;
        this.rmtToPastDueEmail = rmtToPastDueEmail;
        this.rmtToOtherPhone = rmtToOtherPhone;
        this.rmtToOtherFax = rmtToOtherFax;
        this.rmtToOtherEmail = rmtToOtherEmail;
        this.rmtToElectronicFax = rmtToElectronicFax;
        this.rmtToElectronicEmail = rmtToElectronicEmail;
        this.rmtToCmnt1 = rmtToCmnt1;
        this.rmtToCmnt2 = rmtToCmnt2;
        this.rmtToCmnt3 = rmtToCmnt3;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public String getRmtToComp() {
        return rmtToComp;
    }

    public void setRmtToComp(String rmtToComp) {
        this.rmtToComp = rmtToComp;
    }

    public String getRmtToCurr() {
        return rmtToCurr;
    }

    public void setRmtToCurr(String rmtToCurr) {
        this.rmtToCurr = rmtToCurr;
    }

    public String getRmtToCurrDesc() {
        return rmtToCurrDesc;
    }

    public void setRmtToCurrDesc(String rmtToCurrDesc) {
        this.rmtToCurrDesc = rmtToCurrDesc;
    }

    public String getRmtToElecBillPayee() {
        return rmtToElecBillPayee;
    }

    public void setRmtToElecBillPayee(String rmtToElecBillPayee) {
        this.rmtToElecBillPayee = rmtToElecBillPayee;
    }

    public String getRmtToEftBankNm() {
        return rmtToEftBankNm;
    }

    public void setRmtToEftBankNm(String rmtToEftBankNm) {
        this.rmtToEftBankNm = rmtToEftBankNm;
    }

    public String getRmtToEftAcctNbr() {
        return rmtToEftAcctNbr;
    }

    public void setRmtToEftAcctNbr(String rmtToEftAcctNbr) {
        this.rmtToEftAcctNbr = rmtToEftAcctNbr;
    }

    public String getRmtToEftBankId() {
        return rmtToEftBankId;
    }

    public void setRmtToEftBankId(String rmtToEftBankId) {
        this.rmtToEftBankId = rmtToEftBankId;
    }

    public String getRmtToEftBranchNbr() {
        return rmtToEftBranchNbr;
    }

    public void setRmtToEftBranchNbr(String rmtToEftBranchNbr) {
        this.rmtToEftBranchNbr = rmtToEftBranchNbr;
    }

    public String getRmtToEftCity() {
        return rmtToEftCity;
    }

    public void setRmtToEftCity(String rmtToEftCity) {
        this.rmtToEftCity = rmtToEftCity;
    }

    public String getRmtToEftProv() {
        return rmtToEftProv;
    }

    public void setRmtToEftProv(String rmtToEftProv) {
        this.rmtToEftProv = rmtToEftProv;
    }

    public String getRmtToEftPostalCd() {
        return rmtToEftPostalCd;
    }

    public void setRmtToEftPostalCd(String rmtToEftPostalCd) {
        this.rmtToEftPostalCd = rmtToEftPostalCd;
    }

    public String getRmtToWireBankNm() {
        return rmtToWireBankNm;
    }

    public void setRmtToWireBankNm(String rmtToWireBankNm) {
        this.rmtToWireBankNm = rmtToWireBankNm;
    }

    public String getRmtToWireAcctNbr() {
        return rmtToWireAcctNbr;
    }

    public void setRmtToWireAcctNbr(String rmtToWireAcctNbr) {
        this.rmtToWireAcctNbr = rmtToWireAcctNbr;
    }

    public String getRmtToWireBankId() {
        return rmtToWireBankId;
    }

    public void setRmtToWireBankId(String rmtToWireBankId) {
        this.rmtToWireBankId = rmtToWireBankId;
    }

    public String getRmtToWireBranchNbr() {
        return rmtToWireBranchNbr;
    }

    public void setRmtToWireBranchNbr(String rmtToWireBranchNbr) {
        this.rmtToWireBranchNbr = rmtToWireBranchNbr;
    }

    public String getRmtToWireCity() {
        return rmtToWireCity;
    }

    public void setRmtToWireCity(String rmtToWireCity) {
        this.rmtToWireCity = rmtToWireCity;
    }

    public String getRmtToWireProv() {
        return rmtToWireProv;
    }

    public void setRmtToWireProv(String rmtToWireProv) {
        this.rmtToWireProv = rmtToWireProv;
    }

    public String getRmtToWirePostalCd() {
        return rmtToWirePostalCd;
    }

    public void setRmtToWirePostalCd(String rmtToWirePostalCd) {
        this.rmtToWirePostalCd = rmtToWirePostalCd;
    }

    public String getRmtToPastDuePhoneNbr() {
        return rmtToPastDuePhoneNbr;
    }

    public void setRmtToPastDuePhoneNbr(String rmtToPastDuePhoneNbr) {
        this.rmtToPastDuePhoneNbr = rmtToPastDuePhoneNbr;
    }

    public String getRmtToPastDueFaxNbr() {
        return rmtToPastDueFaxNbr;
    }

    public void setRmtToPastDueFaxNbr(String rmtToPastDueFaxNbr) {
        this.rmtToPastDueFaxNbr = rmtToPastDueFaxNbr;
    }

    public String getRmtToPastDueEmail() {
        return rmtToPastDueEmail;
    }

    public void setRmtToPastDueEmail(String rmtToPastDueEmail) {
        this.rmtToPastDueEmail = rmtToPastDueEmail;
    }

    public String getRmtToOtherPhone() {
        return rmtToOtherPhone;
    }

    public void setRmtToOtherPhone(String rmtToOtherPhone) {
        this.rmtToOtherPhone = rmtToOtherPhone;
    }

    public String getRmtToOtherFax() {
        return rmtToOtherFax;
    }

    public void setRmtToOtherFax(String rmtToOtherFax) {
        this.rmtToOtherFax = rmtToOtherFax;
    }

    public String getRmtToOtherEmail() {
        return rmtToOtherEmail;
    }

    public void setRmtToOtherEmail(String rmtToOtherEmail) {
        this.rmtToOtherEmail = rmtToOtherEmail;
    }

    public String getRmtToElectronicFax() {
        return rmtToElectronicFax;
    }

    public void setRmtToElectronicFax(String rmtToElectronicFax) {
        this.rmtToElectronicFax = rmtToElectronicFax;
    }

    public String getRmtToElectronicEmail() {
        return rmtToElectronicEmail;
    }

    public void setRmtToElectronicEmail(String rmtToElectronicEmail) {
        this.rmtToElectronicEmail = rmtToElectronicEmail;
    }

    public String getRmtToCmnt1() {
        return rmtToCmnt1;
    }

    public void setRmtToCmnt1(String rmtToCmnt1) {
        this.rmtToCmnt1 = rmtToCmnt1;
    }

    public String getRmtToCmnt2() {
        return rmtToCmnt2;
    }

    public void setRmtToCmnt2(String rmtToCmnt2) {
        this.rmtToCmnt2 = rmtToCmnt2;
    }

    public String getRmtToCmnt3() {
        return rmtToCmnt3;
    }

    public void setRmtToCmnt3(String rmtToCmnt3) {
        this.rmtToCmnt3 = rmtToCmnt3;
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
        hash += (rmtToComp != null ? rmtToComp.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RemitToCan)) {
            return false;
        }
        RemitToCan other = (RemitToCan) object;
        if ((this.rmtToComp == null && other.rmtToComp != null) || (this.rmtToComp != null && !this.rmtToComp.equals(other.rmtToComp))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.RemitToCan[ rmtToComp=" + rmtToComp + " ]";
    }
    
}
