package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "CRD_HLD_CONSENT", catalog = "", schema = "DBO")
public class CrdHldConsent implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CrdHldConsentPK crdHldConsentPK;
    @Basic(optional = false)
    @Column(name = "CRD_NBR_LAST_FOUR")
    private String crdNbrLastFour;
    @Basic(optional = false)
    @Column(name = "CONSENT_FLG")
    private Character consentFlg;
    @Basic(optional = false)
    @Column(name = "CRD_EMP_ID")
    private String crdEmpId;
    @Basic(optional = false)
    @Column(name = "CUST_ID")
    private String custId;
    @Basic(optional = false)
    @Column(name = "ACCT_NBR")
    private String acctNbr;
    @Basic(optional = false)
    @Column(name = "IP_ADDR")
    private String ipAddr;
    @Basic(optional = false)
    @Column(name = "FST_NM")
    private String fstNm;
    @Basic(optional = false)
    @Column(name = "LST_NM")
    private String lstNm;
    @Basic(optional = false)
    @Column(name = "FEE01_DESC")
    private String fee01Desc;

    @Basic(optional = false)
    @Column(name = "FEE01_VAL")
    private BigDecimal fee01Val;
    @Basic(optional = false)
    @Column(name = "FEE02_DESC")
    private String fee02Desc;
    @Basic(optional = false)
    @Column(name = "FEE02_VAL")
    private BigDecimal fee02Val;
    @Basic(optional = false)
    @Column(name = "FEE03_DESC")
    private String fee03Desc;
    @Basic(optional = false)
    @Column(name = "FEE03_VAL")
    private BigDecimal fee03Val;
    @Basic(optional = false)
    @Column(name = "FEE04_DESC")
    private String fee04Desc;
    @Basic(optional = false)
    @Column(name = "FEE04_VAL")
    private BigDecimal fee04Val;
    @Basic(optional = false)
    @Column(name = "FEE05_DESC")
    private String fee05Desc;
    @Basic(optional = false)
    @Column(name = "FEE05_VAL")
    private BigDecimal fee05Val;
    @Basic(optional = false)
    @Column(name = "FEE06_DESC")
    private String fee06Desc;
    @Basic(optional = false)
    @Column(name = "FEE06_VAL")
    private BigDecimal fee06Val;
    @Basic(optional = false)
    @Column(name = "FEE07_DESC")
    private String fee07Desc;
    @Basic(optional = false)
    @Column(name = "FEE07_VAL")
    private BigDecimal fee07Val;
    @Basic(optional = false)
    @Column(name = "FEE08_DESC")
    private String fee08Desc;
    @Basic(optional = false)
    @Column(name = "FEE08_VAL")
    private BigDecimal fee08Val;
    @Basic(optional = false)
    @Column(name = "FEE09_DESC")
    private String fee09Desc;
    @Basic(optional = false)
    @Column(name = "FEE09_VAL")
    private BigDecimal fee09Val;
    @Basic(optional = false)
    @Column(name = "FEE10_DESC")
    private String fee10Desc;
    @Basic(optional = false)
    @Column(name = "FEE10_VAL")
    private BigDecimal fee10Val;
    @Basic(optional = false)
    @Column(name = "FEE11_DESC")
    private String fee11Desc;
    @Basic(optional = false)
    @Column(name = "FEE11_VAL")
    private BigDecimal fee11Val;
    @Basic(optional = false)
    @Column(name = "FEE12_DESC")
    private String fee12Desc;
    @Basic(optional = false)
    @Column(name = "FEE12_VAL")
    private BigDecimal fee12Val;
    @Basic(optional = false)
    @Column(name = "FEE13_DESC")
    private String fee13Desc;
    @Basic(optional = false)
    @Column(name = "FEE13_VAL")
    private BigDecimal fee13Val;
    @Basic(optional = false)
    @Column(name = "FEE14_DESC")
    private String fee14Desc;
    @Basic(optional = false)
    @Column(name = "FEE14_VAL")
    private BigDecimal fee14Val;
    @Basic(optional = false)
    @Column(name = "FEE15_DESC")
    private String fee15Desc;
    @Basic(optional = false)
    @Column(name = "FEE15_VAL")
    private BigDecimal fee15Val;
    @Basic(optional = false)
    @Column(name = "FEE16_DESC")
    private String fee16Desc;
    @Basic(optional = false)
    @Column(name = "FEE16_VAL")
    private BigDecimal fee16Val;
    @Basic(optional = false)
    @Column(name = "FEE17_DESC")
    private String fee17Desc;
    @Basic(optional = false)
    @Column(name = "FEE17_VAL")
    private BigDecimal fee17Val;
    @Basic(optional = false)
    @Column(name = "FEE18_DESC")
    private String fee18Desc;
    @Basic(optional = false)
    @Column(name = "FEE18_VAL")
    private BigDecimal fee18Val;
    @Basic(optional = false)
    @Column(name = "FEE19_DESC")
    private String fee19Desc;
    @Basic(optional = false)
    @Column(name = "FEE19_VAL")
    private BigDecimal fee19Val;
    @Basic(optional = false)
    @Column(name = "FEE20_DESC")
    private String fee20Desc;
    @Basic(optional = false)
    @Column(name = "FEE20_VAL")
    private BigDecimal fee20Val;
    @Basic(optional = false)
    @Column(name = "FEE21_DESC")
    private String fee21Desc;
    @Basic(optional = false)
    @Column(name = "FEE21_VAL")
    private BigDecimal fee21Val;
    @Basic(optional = false)
    @Column(name = "FEE22_DESC")
    private String fee22Desc;
    @Basic(optional = false)
    @Column(name = "FEE22_VAL")
    private BigDecimal fee22Val;
    @Basic(optional = false)
    @Column(name = "FEE23_DESC")
    private String fee23Desc;
    @Basic(optional = false)
    @Column(name = "FEE23_VAL")
    private BigDecimal fee23Val;
    @Basic(optional = false)
    @Column(name = "FEE24_DESC")
    private String fee24Desc;
    @Basic(optional = false)
    @Column(name = "FEE24_VAL")
    private BigDecimal fee24Val;
    @Basic(optional = false)
    @Column(name = "FEE25_DESC")
    private String fee25Desc;
    @Basic(optional = false)
    @Column(name = "FEE25_VAL")
    private BigDecimal fee25Val;
    @Basic(optional = false)
    @Column(name = "FEE26_DESC")
    private String fee26Desc;
    @Basic(optional = false)
    @Column(name = "FEE26_VAL")
    private BigDecimal fee26Val;
    @Basic(optional = false)
    @Column(name = "FEE27_DESC")
    private String fee27Desc;
    @Basic(optional = false)
    @Column(name = "FEE27_VAL")
    private BigDecimal fee27Val;
    @Basic(optional = false)
    @Column(name = "FEE28_DESC")
    private String fee28Desc;
    @Basic(optional = false)
    @Column(name = "FEE28_VAL")
    private BigDecimal fee28Val;
    @Basic(optional = false)
    @Column(name = "FEE29_DESC")
    private String fee29Desc;
    @Basic(optional = false)
    @Column(name = "FEE29_VAL")
    private BigDecimal fee29Val;
    @Basic(optional = false)
    @Column(name = "FEE30_DESC")
    private String fee30Desc;
    @Basic(optional = false)
    @Column(name = "FEE30_VAL")
    private BigDecimal fee30Val;
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

    public CrdHldConsent() {
    }

    public CrdHldConsent(CrdHldConsentPK crdHldConsentPK) {
        this.crdHldConsentPK = crdHldConsentPK;
    }

    public CrdHldConsent(CrdHldConsentPK crdHldConsentPK, String crdNbrLastFour, Character consentFlg, String crdEmpId, String custId, String acctNbr, String ipAddr, String fstNm, String lstNm, String fee01Desc, BigDecimal fee01Val, String fee02Desc, BigDecimal fee02Val, String fee03Desc, BigDecimal fee03Val, String fee04Desc, BigDecimal fee04Val, String fee05Desc, BigDecimal fee05Val, String fee06Desc, BigDecimal fee06Val, String fee07Desc, BigDecimal fee07Val, String fee08Desc, BigDecimal fee08Val, String fee09Desc, BigDecimal fee09Val, String fee10Desc, BigDecimal fee10Val, String fee11Desc, BigDecimal fee11Val, String fee12Desc, BigDecimal fee12Val, String fee13Desc, BigDecimal fee13Val, String fee14Desc, BigDecimal fee14Val, String fee15Desc, BigDecimal fee15Val, String fee16Desc, BigDecimal fee16Val, String fee17Desc, BigDecimal fee17Val, String fee18Desc, BigDecimal fee18Val, String fee19Desc, BigDecimal fee19Val, String fee20Desc, BigDecimal fee20Val, String fee21Desc, BigDecimal fee21Val, String fee22Desc, BigDecimal fee22Val, String fee23Desc, BigDecimal fee23Val, String fee24Desc, BigDecimal fee24Val, String fee25Desc, BigDecimal fee25Val, String fee26Desc, BigDecimal fee26Val, String fee27Desc, BigDecimal fee27Val, String fee28Desc, BigDecimal fee28Val, String fee29Desc, BigDecimal fee29Val, String fee30Desc, BigDecimal fee30Val, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.crdHldConsentPK = crdHldConsentPK;
        this.crdNbrLastFour = crdNbrLastFour;
        this.consentFlg = consentFlg;
        this.crdEmpId = crdEmpId;
        this.custId = custId;
        this.acctNbr = acctNbr;
        this.ipAddr = ipAddr;
        this.fstNm = fstNm;
        this.lstNm = lstNm;
        this.fee01Desc = fee01Desc;
        this.fee01Val = fee01Val;
        this.fee02Desc = fee02Desc;
        this.fee02Val = fee02Val;
        this.fee03Desc = fee03Desc;
        this.fee03Val = fee03Val;
        this.fee04Desc = fee04Desc;
        this.fee04Val = fee04Val;
        this.fee05Desc = fee05Desc;
        this.fee05Val = fee05Val;
        this.fee06Desc = fee06Desc;
        this.fee06Val = fee06Val;
        this.fee07Desc = fee07Desc;
        this.fee07Val = fee07Val;
        this.fee08Desc = fee08Desc;
        this.fee08Val = fee08Val;
        this.fee09Desc = fee09Desc;
        this.fee09Val = fee09Val;
        this.fee10Desc = fee10Desc;
        this.fee10Val = fee10Val;
        this.fee11Desc = fee11Desc;
        this.fee11Val = fee11Val;
        this.fee12Desc = fee12Desc;
        this.fee12Val = fee12Val;
        this.fee13Desc = fee13Desc;
        this.fee13Val = fee13Val;
        this.fee14Desc = fee14Desc;
        this.fee14Val = fee14Val;
        this.fee15Desc = fee15Desc;
        this.fee15Val = fee15Val;
        this.fee16Desc = fee16Desc;
        this.fee16Val = fee16Val;
        this.fee17Desc = fee17Desc;
        this.fee17Val = fee17Val;
        this.fee18Desc = fee18Desc;
        this.fee18Val = fee18Val;
        this.fee19Desc = fee19Desc;
        this.fee19Val = fee19Val;
        this.fee20Desc = fee20Desc;
        this.fee20Val = fee20Val;
        this.fee21Desc = fee21Desc;
        this.fee21Val = fee21Val;
        this.fee22Desc = fee22Desc;
        this.fee22Val = fee22Val;
        this.fee23Desc = fee23Desc;
        this.fee23Val = fee23Val;
        this.fee24Desc = fee24Desc;
        this.fee24Val = fee24Val;
        this.fee25Desc = fee25Desc;
        this.fee25Val = fee25Val;
        this.fee26Desc = fee26Desc;
        this.fee26Val = fee26Val;
        this.fee27Desc = fee27Desc;
        this.fee27Val = fee27Val;
        this.fee28Desc = fee28Desc;
        this.fee28Val = fee28Val;
        this.fee29Desc = fee29Desc;
        this.fee29Val = fee29Val;
        this.fee30Desc = fee30Desc;
        this.fee30Val = fee30Val;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public CrdHldConsent(String crdTknNbr, Date consentTs) {
        this.crdHldConsentPK = new CrdHldConsentPK(crdTknNbr, consentTs);
    }

    public CrdHldConsentPK getCrdHldConsentPK() {
        return crdHldConsentPK;
    }

    public void setCrdHldConsentPK(CrdHldConsentPK crdHldConsentPK) {
        this.crdHldConsentPK = crdHldConsentPK;
    }

    public String getCrdNbrLastFour() {
        return crdNbrLastFour;
    }

    public void setCrdNbrLastFour(String crdNbrLastFour) {
        this.crdNbrLastFour = crdNbrLastFour;
    }

    public Character getConsentFlg() {
        return consentFlg;
    }

    public void setConsentFlg(Character consentFlg) {
        this.consentFlg = consentFlg;
    }

    public String getCrdEmpId() {
        return crdEmpId;
    }

    public void setCrdEmpId(String crdEmpId) {
        this.crdEmpId = crdEmpId;
    }

    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId;
    }

    public String getAcctNbr() {
        return acctNbr;
    }

    public void setAcctNbr(String acctNbr) {
        this.acctNbr = acctNbr;
    }

    public String getIpAddr() {
        return ipAddr;
    }

    public void setIpAddr(String ipAddr) {
        this.ipAddr = ipAddr;
    }

    public String getFstNm() {
        return fstNm;
    }

    public void setFstNm(String fstNm) {
        this.fstNm = fstNm;
    }

    public String getLstNm() {
        return lstNm;
    }

    public void setLstNm(String lstNm) {
        this.lstNm = lstNm;
    }

    public String getFee01Desc() {
        return fee01Desc;
    }

    public void setFee01Desc(String fee01Desc) {
        this.fee01Desc = fee01Desc;
    }

    public BigDecimal getFee01Val() {
        return fee01Val;
    }

    public void setFee01Val(BigDecimal fee01Val) {
        this.fee01Val = fee01Val;
    }

    public String getFee02Desc() {
        return fee02Desc;
    }

    public void setFee02Desc(String fee02Desc) {
        this.fee02Desc = fee02Desc;
    }

    public BigDecimal getFee02Val() {
        return fee02Val;
    }

    public void setFee02Val(BigDecimal fee02Val) {
        this.fee02Val = fee02Val;
    }

    public String getFee03Desc() {
        return fee03Desc;
    }

    public void setFee03Desc(String fee03Desc) {
        this.fee03Desc = fee03Desc;
    }

    public BigDecimal getFee03Val() {
        return fee03Val;
    }

    public void setFee03Val(BigDecimal fee03Val) {
        this.fee03Val = fee03Val;
    }

    public String getFee04Desc() {
        return fee04Desc;
    }

    public void setFee04Desc(String fee04Desc) {
        this.fee04Desc = fee04Desc;
    }

    public BigDecimal getFee04Val() {
        return fee04Val;
    }

    public void setFee04Val(BigDecimal fee04Val) {
        this.fee04Val = fee04Val;
    }

    public String getFee05Desc() {
        return fee05Desc;
    }

    public void setFee05Desc(String fee05Desc) {
        this.fee05Desc = fee05Desc;
    }

    public BigDecimal getFee05Val() {
        return fee05Val;
    }

    public void setFee05Val(BigDecimal fee05Val) {
        this.fee05Val = fee05Val;
    }

    public String getFee06Desc() {
        return fee06Desc;
    }

    public void setFee06Desc(String fee06Desc) {
        this.fee06Desc = fee06Desc;
    }

    public BigDecimal getFee06Val() {
        return fee06Val;
    }

    public void setFee06Val(BigDecimal fee06Val) {
        this.fee06Val = fee06Val;
    }

    public String getFee07Desc() {
        return fee07Desc;
    }

    public void setFee07Desc(String fee07Desc) {
        this.fee07Desc = fee07Desc;
    }

    public BigDecimal getFee07Val() {
        return fee07Val;
    }

    public void setFee07Val(BigDecimal fee07Val) {
        this.fee07Val = fee07Val;
    }

    public String getFee08Desc() {
        return fee08Desc;
    }

    public void setFee08Desc(String fee08Desc) {
        this.fee08Desc = fee08Desc;
    }

    public BigDecimal getFee08Val() {
        return fee08Val;
    }

    public void setFee08Val(BigDecimal fee08Val) {
        this.fee08Val = fee08Val;
    }

    public String getFee09Desc() {
        return fee09Desc;
    }

    public void setFee09Desc(String fee09Desc) {
        this.fee09Desc = fee09Desc;
    }

    public BigDecimal getFee09Val() {
        return fee09Val;
    }

    public void setFee09Val(BigDecimal fee09Val) {
        this.fee09Val = fee09Val;
    }

    public String getFee10Desc() {
        return fee10Desc;
    }

    public void setFee10Desc(String fee10Desc) {
        this.fee10Desc = fee10Desc;
    }

    public BigDecimal getFee10Val() {
        return fee10Val;
    }

    public void setFee10Val(BigDecimal fee10Val) {
        this.fee10Val = fee10Val;
    }

    public String getFee11Desc() {
        return fee11Desc;
    }

    public void setFee11Desc(String fee11Desc) {
        this.fee11Desc = fee11Desc;
    }

    public BigDecimal getFee11Val() {
        return fee11Val;
    }

    public void setFee11Val(BigDecimal fee11Val) {
        this.fee11Val = fee11Val;
    }

    public String getFee12Desc() {
        return fee12Desc;
    }

    public void setFee12Desc(String fee12Desc) {
        this.fee12Desc = fee12Desc;
    }

    public BigDecimal getFee12Val() {
        return fee12Val;
    }

    public void setFee12Val(BigDecimal fee12Val) {
        this.fee12Val = fee12Val;
    }

    public String getFee13Desc() {
        return fee13Desc;
    }

    public void setFee13Desc(String fee13Desc) {
        this.fee13Desc = fee13Desc;
    }

    public BigDecimal getFee13Val() {
        return fee13Val;
    }

    public void setFee13Val(BigDecimal fee13Val) {
        this.fee13Val = fee13Val;
    }

    public String getFee14Desc() {
        return fee14Desc;
    }

    public void setFee14Desc(String fee14Desc) {
        this.fee14Desc = fee14Desc;
    }

    public BigDecimal getFee14Val() {
        return fee14Val;
    }

    public void setFee14Val(BigDecimal fee14Val) {
        this.fee14Val = fee14Val;
    }

    public String getFee15Desc() {
        return fee15Desc;
    }

    public void setFee15Desc(String fee15Desc) {
        this.fee15Desc = fee15Desc;
    }

    public BigDecimal getFee15Val() {
        return fee15Val;
    }

    public void setFee15Val(BigDecimal fee15Val) {
        this.fee15Val = fee15Val;
    }

    public String getFee16Desc() {
        return fee16Desc;
    }

    public void setFee16Desc(String fee16Desc) {
        this.fee16Desc = fee16Desc;
    }

    public BigDecimal getFee16Val() {
        return fee16Val;
    }

    public void setFee16Val(BigDecimal fee16Val) {
        this.fee16Val = fee16Val;
    }

    public String getFee17Desc() {
        return fee17Desc;
    }

    public void setFee17Desc(String fee17Desc) {
        this.fee17Desc = fee17Desc;
    }

    public BigDecimal getFee17Val() {
        return fee17Val;
    }

    public void setFee17Val(BigDecimal fee17Val) {
        this.fee17Val = fee17Val;
    }

    public String getFee18Desc() {
        return fee18Desc;
    }

    public void setFee18Desc(String fee18Desc) {
        this.fee18Desc = fee18Desc;
    }

    public BigDecimal getFee18Val() {
        return fee18Val;
    }

    public void setFee18Val(BigDecimal fee18Val) {
        this.fee18Val = fee18Val;
    }

    public String getFee19Desc() {
        return fee19Desc;
    }

    public void setFee19Desc(String fee19Desc) {
        this.fee19Desc = fee19Desc;
    }

    public BigDecimal getFee19Val() {
        return fee19Val;
    }

    public void setFee19Val(BigDecimal fee19Val) {
        this.fee19Val = fee19Val;
    }

    public String getFee20Desc() {
        return fee20Desc;
    }

    public void setFee20Desc(String fee20Desc) {
        this.fee20Desc = fee20Desc;
    }

    public BigDecimal getFee20Val() {
        return fee20Val;
    }

    public void setFee20Val(BigDecimal fee20Val) {
        this.fee20Val = fee20Val;
    }

    public String getFee21Desc() {
        return fee21Desc;
    }

    public void setFee21Desc(String fee21Desc) {
        this.fee21Desc = fee21Desc;
    }

    public BigDecimal getFee21Val() {
        return fee21Val;
    }

    public void setFee21Val(BigDecimal fee21Val) {
        this.fee21Val = fee21Val;
    }

    public String getFee22Desc() {
        return fee22Desc;
    }

    public void setFee22Desc(String fee22Desc) {
        this.fee22Desc = fee22Desc;
    }

    public BigDecimal getFee22Val() {
        return fee22Val;
    }

    public void setFee22Val(BigDecimal fee22Val) {
        this.fee22Val = fee22Val;
    }

    public String getFee23Desc() {
        return fee23Desc;
    }

    public void setFee23Desc(String fee23Desc) {
        this.fee23Desc = fee23Desc;
    }

    public BigDecimal getFee23Val() {
        return fee23Val;
    }

    public void setFee23Val(BigDecimal fee23Val) {
        this.fee23Val = fee23Val;
    }

    public String getFee24Desc() {
        return fee24Desc;
    }

    public void setFee24Desc(String fee24Desc) {
        this.fee24Desc = fee24Desc;
    }

    public BigDecimal getFee24Val() {
        return fee24Val;
    }

    public void setFee24Val(BigDecimal fee24Val) {
        this.fee24Val = fee24Val;
    }

    public String getFee25Desc() {
        return fee25Desc;
    }

    public void setFee25Desc(String fee25Desc) {
        this.fee25Desc = fee25Desc;
    }

    public BigDecimal getFee25Val() {
        return fee25Val;
    }

    public void setFee25Val(BigDecimal fee25Val) {
        this.fee25Val = fee25Val;
    }

    public String getFee26Desc() {
        return fee26Desc;
    }

    public void setFee26Desc(String fee26Desc) {
        this.fee26Desc = fee26Desc;
    }

    public BigDecimal getFee26Val() {
        return fee26Val;
    }

    public void setFee26Val(BigDecimal fee26Val) {
        this.fee26Val = fee26Val;
    }

    public String getFee27Desc() {
        return fee27Desc;
    }

    public void setFee27Desc(String fee27Desc) {
        this.fee27Desc = fee27Desc;
    }

    public BigDecimal getFee27Val() {
        return fee27Val;
    }

    public void setFee27Val(BigDecimal fee27Val) {
        this.fee27Val = fee27Val;
    }

    public String getFee28Desc() {
        return fee28Desc;
    }

    public void setFee28Desc(String fee28Desc) {
        this.fee28Desc = fee28Desc;
    }

    public BigDecimal getFee28Val() {
        return fee28Val;
    }

    public void setFee28Val(BigDecimal fee28Val) {
        this.fee28Val = fee28Val;
    }

    public String getFee29Desc() {
        return fee29Desc;
    }

    public void setFee29Desc(String fee29Desc) {
        this.fee29Desc = fee29Desc;
    }

    public BigDecimal getFee29Val() {
        return fee29Val;
    }

    public void setFee29Val(BigDecimal fee29Val) {
        this.fee29Val = fee29Val;
    }

    public String getFee30Desc() {
        return fee30Desc;
    }

    public void setFee30Desc(String fee30Desc) {
        this.fee30Desc = fee30Desc;
    }

    public BigDecimal getFee30Val() {
        return fee30Val;
    }

    public void setFee30Val(BigDecimal fee30Val) {
        this.fee30Val = fee30Val;
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
        hash += (crdHldConsentPK != null ? crdHldConsentPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof CrdHldConsent)) {
            return false;
        }
        CrdHldConsent other = (CrdHldConsent) object;
        if ((this.crdHldConsentPK == null && other.crdHldConsentPK != null) || (this.crdHldConsentPK != null && !this.crdHldConsentPK.equals(other.crdHldConsentPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.CrdHldConsent[ crdHldConsentPK=" + crdHldConsentPK + " ]";
    }

}
