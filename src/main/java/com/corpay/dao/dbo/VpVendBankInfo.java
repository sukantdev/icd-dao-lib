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
@Table(name = "VP_VEND_BANK_INFO", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "VpVendBankInfo.findAll", query = "SELECT v FROM VpVendBankInfo v")})
public class VpVendBankInfo implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected VpVendBankInfoPK vpVendBankInfoPK;
    @Basic(optional = false)
    @Column(name = "BNK_NM")
    private String bnkNm;
    @Basic(optional = false)
    @Column(name = "BNK_ADDR_1")
    private String bnkAddr1;
    @Basic(optional = false)
    @Column(name = "BNK_ADDR_2")
    private String bnkAddr2;
    @Basic(optional = false)
    @Column(name = "BNK_CITY")
    private String bnkCity;
    @Basic(optional = false)
    @Column(name = "BNK_ST")
    private String bnkSt;
    @Basic(optional = false)
    @Column(name = "BNK_ZIP")
    private String bnkZip;
    @Basic(optional = false)
    @Column(name = "BNK_CONTACT_FNAME")
    private String bnkContactFname;
    @Basic(optional = false)
    @Column(name = "BNK_CONTACT_LNAME")
    private String bnkContactLname;
    @Basic(optional = false)
    @Column(name = "BNK_PHONE")
    private String bnkPhone;
    @Basic(optional = false)
    @Column(name = "BNK_RTING_NBR")
    private String bnkRtingNbr;
    @Basic(optional = false)
    @Column(name = "BNK_ACCT_NAME")
    private String bnkAcctName;
    @Basic(optional = false)
    @Column(name = "BNK_ACCT_NBR")
    private long bnkAcctNbr;
    @Basic(optional = false)
    @Column(name = "BNK_ACH_IND")
    private Character bnkAchInd;
    @Basic(optional = false)
    @Column(name = "BNK_UPD_TERM")
    private String bnkUpdTerm;
    @Basic(optional = false)
    @Column(name = "BNK_PRENOTE_DT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date bnkPrenoteDt;
    @Basic(optional = false)
    @Column(name = "BNK_CHK_SVGS_IND")
    private Character bnkChkSvgsInd;
    @Basic(optional = false)
    @Column(name = "BNK_PAY_DELAY")
    private int bnkPayDelay;
    @Basic(optional = false)
    @Column(name = "INIT_PROP_PROCESS")
    private Character initPropProcess;
    @Basic(optional = false)
    @Column(name = "ACCT_VER_AMT")
    private String acctVerAmt;
    @Basic(optional = false)
    @Column(name = "ACCT_VER_AMT_DT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date acctVerAmtDt;
    @Basic(optional = false)
    @Column(name = "BNK_CONT_EMAIL")
    private String bnkContEmail;
    @Basic(optional = false)
    @Column(name = "BNK_ACT_DT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date bnkActDt;
    @Basic(optional = false)
    @Column(name = "BNK_CDN_RTNG_NBR")
    private String bnkCdnRtngNbr;
    @Basic(optional = false)
    @Column(name = "BNK_DSCRTNRY_DATA")
    private String bnkDscrtnryData;
    @Basic(optional = false)
    @Column(name = "BNK_CMPY_ENTRY_DESC")
    private String bnkCmpyEntryDesc;
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

    public VpVendBankInfo() {
    }

    public VpVendBankInfo(VpVendBankInfoPK vpVendBankInfoPK) {
        this.vpVendBankInfoPK = vpVendBankInfoPK;
    }

    public VpVendBankInfo(VpVendBankInfoPK vpVendBankInfoPK, String bnkNm, String bnkAddr1, String bnkAddr2, String bnkCity, String bnkSt, String bnkZip, String bnkContactFname, String bnkContactLname, String bnkPhone, String bnkRtingNbr, String bnkAcctName, long bnkAcctNbr, Character bnkAchInd, String bnkUpdTerm, Date bnkPrenoteDt, Character bnkChkSvgsInd, int bnkPayDelay, Character initPropProcess, String acctVerAmt, Date acctVerAmtDt, String bnkContEmail, Date bnkActDt, String bnkCdnRtngNbr, String bnkDscrtnryData, String bnkCmpyEntryDesc, String mdyUsr, Date mdyTs, String crtUsr, Date crtTs) {
        this.vpVendBankInfoPK = vpVendBankInfoPK;
        this.bnkNm = bnkNm;
        this.bnkAddr1 = bnkAddr1;
        this.bnkAddr2 = bnkAddr2;
        this.bnkCity = bnkCity;
        this.bnkSt = bnkSt;
        this.bnkZip = bnkZip;
        this.bnkContactFname = bnkContactFname;
        this.bnkContactLname = bnkContactLname;
        this.bnkPhone = bnkPhone;
        this.bnkRtingNbr = bnkRtingNbr;
        this.bnkAcctName = bnkAcctName;
        this.bnkAcctNbr = bnkAcctNbr;
        this.bnkAchInd = bnkAchInd;
        this.bnkUpdTerm = bnkUpdTerm;
        this.bnkPrenoteDt = bnkPrenoteDt;
        this.bnkChkSvgsInd = bnkChkSvgsInd;
        this.bnkPayDelay = bnkPayDelay;
        this.initPropProcess = initPropProcess;
        this.acctVerAmt = acctVerAmt;
        this.acctVerAmtDt = acctVerAmtDt;
        this.bnkContEmail = bnkContEmail;
        this.bnkActDt = bnkActDt;
        this.bnkCdnRtngNbr = bnkCdnRtngNbr;
        this.bnkDscrtnryData = bnkDscrtnryData;
        this.bnkCmpyEntryDesc = bnkCmpyEntryDesc;
        this.mdyUsr = mdyUsr;
        this.mdyTs = mdyTs;
        this.crtUsr = crtUsr;
        this.crtTs = crtTs;
    }

    public VpVendBankInfo(String bnkPayLoc, String bnkPayLocTyp, String bnkPayMeth) {
        this.vpVendBankInfoPK = new VpVendBankInfoPK(bnkPayLoc, bnkPayLocTyp, bnkPayMeth);
    }

    public VpVendBankInfoPK getVpVendBankInfoPK() {
        return vpVendBankInfoPK;
    }

    public void setVpVendBankInfoPK(VpVendBankInfoPK vpVendBankInfoPK) {
        this.vpVendBankInfoPK = vpVendBankInfoPK;
    }

    public String getBnkNm() {
        return bnkNm;
    }

    public void setBnkNm(String bnkNm) {
        this.bnkNm = bnkNm;
    }

    public String getBnkAddr1() {
        return bnkAddr1;
    }

    public void setBnkAddr1(String bnkAddr1) {
        this.bnkAddr1 = bnkAddr1;
    }

    public String getBnkAddr2() {
        return bnkAddr2;
    }

    public void setBnkAddr2(String bnkAddr2) {
        this.bnkAddr2 = bnkAddr2;
    }

    public String getBnkCity() {
        return bnkCity;
    }

    public void setBnkCity(String bnkCity) {
        this.bnkCity = bnkCity;
    }

    public String getBnkSt() {
        return bnkSt;
    }

    public void setBnkSt(String bnkSt) {
        this.bnkSt = bnkSt;
    }

    public String getBnkZip() {
        return bnkZip;
    }

    public void setBnkZip(String bnkZip) {
        this.bnkZip = bnkZip;
    }

    public String getBnkContactFname() {
        return bnkContactFname;
    }

    public void setBnkContactFname(String bnkContactFname) {
        this.bnkContactFname = bnkContactFname;
    }

    public String getBnkContactLname() {
        return bnkContactLname;
    }

    public void setBnkContactLname(String bnkContactLname) {
        this.bnkContactLname = bnkContactLname;
    }

    public String getBnkPhone() {
        return bnkPhone;
    }

    public void setBnkPhone(String bnkPhone) {
        this.bnkPhone = bnkPhone;
    }

    public String getBnkRtingNbr() {
        return bnkRtingNbr;
    }

    public void setBnkRtingNbr(String bnkRtingNbr) {
        this.bnkRtingNbr = bnkRtingNbr;
    }

    public String getBnkAcctName() {
        return bnkAcctName;
    }

    public void setBnkAcctName(String bnkAcctName) {
        this.bnkAcctName = bnkAcctName;
    }

    public long getBnkAcctNbr() {
        return bnkAcctNbr;
    }

    public void setBnkAcctNbr(long bnkAcctNbr) {
        this.bnkAcctNbr = bnkAcctNbr;
    }

    public Character getBnkAchInd() {
        return bnkAchInd;
    }

    public void setBnkAchInd(Character bnkAchInd) {
        this.bnkAchInd = bnkAchInd;
    }

    public String getBnkUpdTerm() {
        return bnkUpdTerm;
    }

    public void setBnkUpdTerm(String bnkUpdTerm) {
        this.bnkUpdTerm = bnkUpdTerm;
    }

    public Date getBnkPrenoteDt() {
        return bnkPrenoteDt;
    }

    public void setBnkPrenoteDt(Date bnkPrenoteDt) {
        this.bnkPrenoteDt = bnkPrenoteDt;
    }

    public Character getBnkChkSvgsInd() {
        return bnkChkSvgsInd;
    }

    public void setBnkChkSvgsInd(Character bnkChkSvgsInd) {
        this.bnkChkSvgsInd = bnkChkSvgsInd;
    }

    public int getBnkPayDelay() {
        return bnkPayDelay;
    }

    public void setBnkPayDelay(int bnkPayDelay) {
        this.bnkPayDelay = bnkPayDelay;
    }

    public Character getInitPropProcess() {
        return initPropProcess;
    }

    public void setInitPropProcess(Character initPropProcess) {
        this.initPropProcess = initPropProcess;
    }

    public String getAcctVerAmt() {
        return acctVerAmt;
    }

    public void setAcctVerAmt(String acctVerAmt) {
        this.acctVerAmt = acctVerAmt;
    }

    public Date getAcctVerAmtDt() {
        return acctVerAmtDt;
    }

    public void setAcctVerAmtDt(Date acctVerAmtDt) {
        this.acctVerAmtDt = acctVerAmtDt;
    }

    public String getBnkContEmail() {
        return bnkContEmail;
    }

    public void setBnkContEmail(String bnkContEmail) {
        this.bnkContEmail = bnkContEmail;
    }

    public Date getBnkActDt() {
        return bnkActDt;
    }

    public void setBnkActDt(Date bnkActDt) {
        this.bnkActDt = bnkActDt;
    }

    public String getBnkCdnRtngNbr() {
        return bnkCdnRtngNbr;
    }

    public void setBnkCdnRtngNbr(String bnkCdnRtngNbr) {
        this.bnkCdnRtngNbr = bnkCdnRtngNbr;
    }

    public String getBnkDscrtnryData() {
        return bnkDscrtnryData;
    }

    public void setBnkDscrtnryData(String bnkDscrtnryData) {
        this.bnkDscrtnryData = bnkDscrtnryData;
    }

    public String getBnkCmpyEntryDesc() {
        return bnkCmpyEntryDesc;
    }

    public void setBnkCmpyEntryDesc(String bnkCmpyEntryDesc) {
        this.bnkCmpyEntryDesc = bnkCmpyEntryDesc;
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
        hash += (vpVendBankInfoPK != null ? vpVendBankInfoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof VpVendBankInfo)) {
            return false;
        }
        VpVendBankInfo other = (VpVendBankInfo) object;
        if ((this.vpVendBankInfoPK == null && other.vpVendBankInfoPK != null) || (this.vpVendBankInfoPK != null && !this.vpVendBankInfoPK.equals(other.vpVendBankInfoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.VpVendBankInfo[ vpVendBankInfoPK=" + vpVendBankInfoPK + " ]";
    }
    
}
