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
@Table(name = "REMIT_TO", catalog = "", schema = "DBO")
public class RemitTo implements Serializable {

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
    @Column(name = "RMT_TO_PAYABLE")
    private String rmtToPayable;
    @Basic(optional = false)
    @Column(name = "RMT_TO_CHECK_PMT_NM")
    private String rmtToCheckPmtNm;
    @Basic(optional = false)
    @Column(name = "RMT_TO_CHECK_PMT_ADDR1")
    private String rmtToCheckPmtAddr1;
    @Basic(optional = false)
    @Column(name = "RMT_TO_CHECK_PMT_ADDR2")
    private String rmtToCheckPmtAddr2;
    @Basic(optional = false)
    @Column(name = "RMT_TO_CHECK_PMT_CITY")
    private String rmtToCheckPmtCity;
    @Basic(optional = false)
    @Column(name = "RMT_TO_CHECK_PMT_ST")
    private String rmtToCheckPmtSt;
    @Basic(optional = false)
    @Column(name = "RMT_TO_CHECK_PMT_POSTAL_CD")
    private String rmtToCheckPmtPostalCd;
    @Basic(optional = false)
    @Column(name = "RMT_TO_WIRE_BANK_NM")
    private String rmtToWireBankNm;
    @Basic(optional = false)
    @Column(name = "RMT_TO_WIRE_ACCT_NBR")
    private String rmtToWireAcctNbr;
    @Basic(optional = false)
    @Column(name = "RMT_TO_WIRE_RTNG_NBR")
    private String rmtToWireRtngNbr;
    @Basic(optional = false)
    @Column(name = "RMT_TO_WIRE_CITY")
    private String rmtToWireCity;
    @Basic(optional = false)
    @Column(name = "RMT_TO_WIRE_ST")
    private String rmtToWireSt;
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

    public RemitTo() {
    }

    public RemitTo(String rmtToComp) {
        this.rmtToComp = rmtToComp;
    }

    public RemitTo(String rmtToComp, String rmtToCurr, String rmtToCurrDesc, String rmtToPayable, String rmtToCheckPmtNm, String rmtToCheckPmtAddr1, String rmtToCheckPmtAddr2, String rmtToCheckPmtCity, String rmtToCheckPmtSt, String rmtToCheckPmtPostalCd, String rmtToWireBankNm, String rmtToWireAcctNbr, String rmtToWireRtngNbr, String rmtToWireCity, String rmtToWireSt, String rmtToWirePostalCd, String rmtToPastDuePhoneNbr, String rmtToPastDueFaxNbr, String rmtToPastDueEmail, String rmtToOtherPhone, String rmtToOtherFax, String rmtToOtherEmail, String rmtToElectronicFax, String rmtToElectronicEmail, String rmtToCmnt1, String rmtToCmnt2, String rmtToCmnt3, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.rmtToComp = rmtToComp;
        this.rmtToCurr = rmtToCurr;
        this.rmtToCurrDesc = rmtToCurrDesc;
        this.rmtToPayable = rmtToPayable;
        this.rmtToCheckPmtNm = rmtToCheckPmtNm;
        this.rmtToCheckPmtAddr1 = rmtToCheckPmtAddr1;
        this.rmtToCheckPmtAddr2 = rmtToCheckPmtAddr2;
        this.rmtToCheckPmtCity = rmtToCheckPmtCity;
        this.rmtToCheckPmtSt = rmtToCheckPmtSt;
        this.rmtToCheckPmtPostalCd = rmtToCheckPmtPostalCd;
        this.rmtToWireBankNm = rmtToWireBankNm;
        this.rmtToWireAcctNbr = rmtToWireAcctNbr;
        this.rmtToWireRtngNbr = rmtToWireRtngNbr;
        this.rmtToWireCity = rmtToWireCity;
        this.rmtToWireSt = rmtToWireSt;
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

    public String getRmtToPayable() {
        return rmtToPayable;
    }

    public void setRmtToPayable(String rmtToPayable) {
        this.rmtToPayable = rmtToPayable;
    }

    public String getRmtToCheckPmtNm() {
        return rmtToCheckPmtNm;
    }

    public void setRmtToCheckPmtNm(String rmtToCheckPmtNm) {
        this.rmtToCheckPmtNm = rmtToCheckPmtNm;
    }

    public String getRmtToCheckPmtAddr1() {
        return rmtToCheckPmtAddr1;
    }

    public void setRmtToCheckPmtAddr1(String rmtToCheckPmtAddr1) {
        this.rmtToCheckPmtAddr1 = rmtToCheckPmtAddr1;
    }

    public String getRmtToCheckPmtAddr2() {
        return rmtToCheckPmtAddr2;
    }

    public void setRmtToCheckPmtAddr2(String rmtToCheckPmtAddr2) {
        this.rmtToCheckPmtAddr2 = rmtToCheckPmtAddr2;
    }

    public String getRmtToCheckPmtCity() {
        return rmtToCheckPmtCity;
    }

    public void setRmtToCheckPmtCity(String rmtToCheckPmtCity) {
        this.rmtToCheckPmtCity = rmtToCheckPmtCity;
    }

    public String getRmtToCheckPmtSt() {
        return rmtToCheckPmtSt;
    }

    public void setRmtToCheckPmtSt(String rmtToCheckPmtSt) {
        this.rmtToCheckPmtSt = rmtToCheckPmtSt;
    }

    public String getRmtToCheckPmtPostalCd() {
        return rmtToCheckPmtPostalCd;
    }

    public void setRmtToCheckPmtPostalCd(String rmtToCheckPmtPostalCd) {
        this.rmtToCheckPmtPostalCd = rmtToCheckPmtPostalCd;
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

    public String getRmtToWireRtngNbr() {
        return rmtToWireRtngNbr;
    }

    public void setRmtToWireRtngNbr(String rmtToWireRtngNbr) {
        this.rmtToWireRtngNbr = rmtToWireRtngNbr;
    }

    public String getRmtToWireCity() {
        return rmtToWireCity;
    }

    public void setRmtToWireCity(String rmtToWireCity) {
        this.rmtToWireCity = rmtToWireCity;
    }

    public String getRmtToWireSt() {
        return rmtToWireSt;
    }

    public void setRmtToWireSt(String rmtToWireSt) {
        this.rmtToWireSt = rmtToWireSt;
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

        if (!(object instanceof RemitTo)) {
            return false;
        }
        RemitTo other = (RemitTo) object;
        if ((this.rmtToComp == null && other.rmtToComp != null) || (this.rmtToComp != null && !this.rmtToComp.equals(other.rmtToComp))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.RemitTo[ rmtToComp=" + rmtToComp + " ]";
    }

}
