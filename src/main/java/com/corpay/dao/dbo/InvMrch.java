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
import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author Sukant.Tiwari
 */
@Entity
@Table(name = "INV_MRCH", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "InvMrch.findAll", query = "SELECT i FROM InvMrch i")})
public class InvMrch implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected InvMrchPK invMrchPK;
    @Basic(optional = false)
    @Column(name = "PRTN_ID")
    private short prtnId;
    @Basic(optional = false)
    @Column(name = "MRCH_GRP")
    private String mrchGrp;
    @Basic(optional = false)
    @Column(name = "MCC")
    private String mcc;
    @Basic(optional = false)
    @Column(name = "MRCH_MINORITY_STAT")
    private String mrchMinorityStat;
    @Basic(optional = false)
    @Column(name = "MC_ACQUIRER")
    private String mcAcquirer;
    @Basic(optional = false)
    @Column(name = "MC_ACPTR")
    private String mcAcptr;
    @Basic(optional = false)
    @Column(name = "MC_TERM")
    private String mcTerm;
    @Basic(optional = false)
    @Column(name = "MRCH_CHAIN")
    private String mrchChain;
    @Basic(optional = false)
    @Column(name = "MRCH_CORP_CD")
    private String mrchCorpCd;
    @Basic(optional = false)
    @Column(name = "MRCH_CD")
    private String mrchCd;
    @Basic(optional = false)
    @Column(name = "MRCH_CHAIN_DESC")
    private String mrchChainDesc;
    @Basic(optional = false)
    @Column(name = "MERCH_TAX_ID")
    private String merchTaxId;
    @Basic(optional = false)
    @Column(name = "XPND_FL_BCH_REF_NB")
    private String xpndFlBchRefNb;
    @Basic(optional = false)
    @Column(name = "CORP_VAT_NBR")
    private String corpVatNbr;
    @Basic(optional = false)
    @Column(name = "MRCH_VAT_NBR")
    private String mrchVatNbr;
    @Basic(optional = false)
    @Column(name = "CUST_VAT_NBR")
    private String custVatNbr;
    @Basic(optional = false)
    @Column(name = "MRCH_CUST_NME")
    private String mrchCustNme;
    @Basic(optional = false)
    @Column(name = "MRCH_CUST_ACCT_NBR")
    private String mrchCustAcctNbr;
    @Basic(optional = false)
    @Column(name = "MRCH_ADDR_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date mrchAddrTs;
    @Basic(optional = false)
    @Column(name = "MRCH_ADDR_SEQ_NBR")
    private short mrchAddrSeqNbr;
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
    @Basic(optional = false)
    @Column(name = "CDN_PRD_DESC_LOCAT")
    private String cdnPrdDescLocat;
    @Basic(optional = false)
    @Column(name = "MKTR_ID")
    private String mktrId;
    @Basic(optional = false)
    @Column(name = "MKTR_NM")
    private String mktrNm;
    @Basic(optional = false)
    @Column(name = "CRD_ACPTR")
    private String crdAcptr;
    @Basic(optional = false)
    @Column(name = "FL_INF_24_HRS")
    private Character flInf24Hrs;
    @Basic(optional = false)
    @Column(name = "FL_INF_18_WHEEL")
    private Character flInf18Wheel;
    @Basic(optional = false)
    @Column(name = "FL_INF_DIESEL")
    private Character flInfDiesel;
    @Basic(optional = false)
    @Column(name = "FL_INF_ISTATE_EXIT")
    private Character flInfIstateExit;
    @Basic(optional = false)
    @Column(name = "FL_INF_CONV_STOR")
    private Character flInfConvStor;
    @Basic(optional = false)
    @Column(name = "FL_INF_TS_W_REST")
    private Character flInfTsWRest;
    @Basic(optional = false)
    @Column(name = "FL_INF_TS_W_HOTEL")
    private Character flInfTsWHotel;
    @Basic(optional = false)
    @Column(name = "FL_INF_TS_W_SHWR")
    private Character flInfTsWShwr;
    @Basic(optional = false)
    @Column(name = "FL_INF_VMAINT")
    private Character flInfVmaint;
    @Basic(optional = false)
    @Column(name = "FL_INF_CWASH")
    private Character flInfCwash;
    @Basic(optional = false)
    @Column(name = "FL_INF_AV_FUEL")
    private Character flInfAvFuel;
    @Basic(optional = false)
    @Column(name = "FL_INF_MAR_FUEL")
    private Character flInfMarFuel;
    @Basic(optional = false)
    @Column(name = "FL_INF_ALT_FUEL")
    private Character flInfAltFuel;
    @Basic(optional = false)
    @Column(name = "FL_INF_PATP")
    private Character flInfPatp;
    @Basic(optional = false)
    @Column(name = "OIL_CMPY_BRAND")
    private String oilCmpyBrand;
    @Basic(optional = false)
    @Column(name = "MERCH_TAX_ID_PROVIDED_CD")
    private Character merchTaxIdProvidedCd;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "LAT_NBR")
    private BigDecimal latNbr;
    @Basic(optional = false)
    @Column(name = "LONG_NBR")
    private BigDecimal longNbr;

    public InvMrch() {
    }

    public InvMrch(InvMrchPK invMrchPK) {
        this.invMrchPK = invMrchPK;
    }

    public InvMrch(InvMrchPK invMrchPK, short prtnId, String mrchGrp, String mcc, String mrchMinorityStat, String mcAcquirer, String mcAcptr, String mcTerm, String mrchChain, String mrchCorpCd, String mrchCd, String mrchChainDesc, String merchTaxId, String xpndFlBchRefNb, String corpVatNbr, String mrchVatNbr, String custVatNbr, String mrchCustNme, String mrchCustAcctNbr, Date mrchAddrTs, short mrchAddrSeqNbr, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr, String cdnPrdDescLocat, String mktrId, String mktrNm, String crdAcptr, Character flInf24Hrs, Character flInf18Wheel, Character flInfDiesel, Character flInfIstateExit, Character flInfConvStor, Character flInfTsWRest, Character flInfTsWHotel, Character flInfTsWShwr, Character flInfVmaint, Character flInfCwash, Character flInfAvFuel, Character flInfMarFuel, Character flInfAltFuel, Character flInfPatp, String oilCmpyBrand, Character merchTaxIdProvidedCd, BigDecimal latNbr, BigDecimal longNbr) {
        this.invMrchPK = invMrchPK;
        this.prtnId = prtnId;
        this.mrchGrp = mrchGrp;
        this.mcc = mcc;
        this.mrchMinorityStat = mrchMinorityStat;
        this.mcAcquirer = mcAcquirer;
        this.mcAcptr = mcAcptr;
        this.mcTerm = mcTerm;
        this.mrchChain = mrchChain;
        this.mrchCorpCd = mrchCorpCd;
        this.mrchCd = mrchCd;
        this.mrchChainDesc = mrchChainDesc;
        this.merchTaxId = merchTaxId;
        this.xpndFlBchRefNb = xpndFlBchRefNb;
        this.corpVatNbr = corpVatNbr;
        this.mrchVatNbr = mrchVatNbr;
        this.custVatNbr = custVatNbr;
        this.mrchCustNme = mrchCustNme;
        this.mrchCustAcctNbr = mrchCustAcctNbr;
        this.mrchAddrTs = mrchAddrTs;
        this.mrchAddrSeqNbr = mrchAddrSeqNbr;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
        this.cdnPrdDescLocat = cdnPrdDescLocat;
        this.mktrId = mktrId;
        this.mktrNm = mktrNm;
        this.crdAcptr = crdAcptr;
        this.flInf24Hrs = flInf24Hrs;
        this.flInf18Wheel = flInf18Wheel;
        this.flInfDiesel = flInfDiesel;
        this.flInfIstateExit = flInfIstateExit;
        this.flInfConvStor = flInfConvStor;
        this.flInfTsWRest = flInfTsWRest;
        this.flInfTsWHotel = flInfTsWHotel;
        this.flInfTsWShwr = flInfTsWShwr;
        this.flInfVmaint = flInfVmaint;
        this.flInfCwash = flInfCwash;
        this.flInfAvFuel = flInfAvFuel;
        this.flInfMarFuel = flInfMarFuel;
        this.flInfAltFuel = flInfAltFuel;
        this.flInfPatp = flInfPatp;
        this.oilCmpyBrand = oilCmpyBrand;
        this.merchTaxIdProvidedCd = merchTaxIdProvidedCd;
        this.latNbr = latNbr;
        this.longNbr = longNbr;
    }

    public InvMrch(Date pstdDt, int trnsId) {
        this.invMrchPK = new InvMrchPK(pstdDt, trnsId);
    }

    public InvMrchPK getInvMrchPK() {
        return invMrchPK;
    }

    public void setInvMrchPK(InvMrchPK invMrchPK) {
        this.invMrchPK = invMrchPK;
    }

    public short getPrtnId() {
        return prtnId;
    }

    public void setPrtnId(short prtnId) {
        this.prtnId = prtnId;
    }

    public String getMrchGrp() {
        return mrchGrp;
    }

    public void setMrchGrp(String mrchGrp) {
        this.mrchGrp = mrchGrp;
    }

    public String getMcc() {
        return mcc;
    }

    public void setMcc(String mcc) {
        this.mcc = mcc;
    }

    public String getMrchMinorityStat() {
        return mrchMinorityStat;
    }

    public void setMrchMinorityStat(String mrchMinorityStat) {
        this.mrchMinorityStat = mrchMinorityStat;
    }

    public String getMcAcquirer() {
        return mcAcquirer;
    }

    public void setMcAcquirer(String mcAcquirer) {
        this.mcAcquirer = mcAcquirer;
    }

    public String getMcAcptr() {
        return mcAcptr;
    }

    public void setMcAcptr(String mcAcptr) {
        this.mcAcptr = mcAcptr;
    }

    public String getMcTerm() {
        return mcTerm;
    }

    public void setMcTerm(String mcTerm) {
        this.mcTerm = mcTerm;
    }

    public String getMrchChain() {
        return mrchChain;
    }

    public void setMrchChain(String mrchChain) {
        this.mrchChain = mrchChain;
    }

    public String getMrchCorpCd() {
        return mrchCorpCd;
    }

    public void setMrchCorpCd(String mrchCorpCd) {
        this.mrchCorpCd = mrchCorpCd;
    }

    public String getMrchCd() {
        return mrchCd;
    }

    public void setMrchCd(String mrchCd) {
        this.mrchCd = mrchCd;
    }

    public String getMrchChainDesc() {
        return mrchChainDesc;
    }

    public void setMrchChainDesc(String mrchChainDesc) {
        this.mrchChainDesc = mrchChainDesc;
    }

    public String getMerchTaxId() {
        return merchTaxId;
    }

    public void setMerchTaxId(String merchTaxId) {
        this.merchTaxId = merchTaxId;
    }

    public String getXpndFlBchRefNb() {
        return xpndFlBchRefNb;
    }

    public void setXpndFlBchRefNb(String xpndFlBchRefNb) {
        this.xpndFlBchRefNb = xpndFlBchRefNb;
    }

    public String getCorpVatNbr() {
        return corpVatNbr;
    }

    public void setCorpVatNbr(String corpVatNbr) {
        this.corpVatNbr = corpVatNbr;
    }

    public String getMrchVatNbr() {
        return mrchVatNbr;
    }

    public void setMrchVatNbr(String mrchVatNbr) {
        this.mrchVatNbr = mrchVatNbr;
    }

    public String getCustVatNbr() {
        return custVatNbr;
    }

    public void setCustVatNbr(String custVatNbr) {
        this.custVatNbr = custVatNbr;
    }

    public String getMrchCustNme() {
        return mrchCustNme;
    }

    public void setMrchCustNme(String mrchCustNme) {
        this.mrchCustNme = mrchCustNme;
    }

    public String getMrchCustAcctNbr() {
        return mrchCustAcctNbr;
    }

    public void setMrchCustAcctNbr(String mrchCustAcctNbr) {
        this.mrchCustAcctNbr = mrchCustAcctNbr;
    }

    public Date getMrchAddrTs() {
        return mrchAddrTs;
    }

    public void setMrchAddrTs(Date mrchAddrTs) {
        this.mrchAddrTs = mrchAddrTs;
    }

    public short getMrchAddrSeqNbr() {
        return mrchAddrSeqNbr;
    }

    public void setMrchAddrSeqNbr(short mrchAddrSeqNbr) {
        this.mrchAddrSeqNbr = mrchAddrSeqNbr;
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

    public String getCdnPrdDescLocat() {
        return cdnPrdDescLocat;
    }

    public void setCdnPrdDescLocat(String cdnPrdDescLocat) {
        this.cdnPrdDescLocat = cdnPrdDescLocat;
    }

    public String getMktrId() {
        return mktrId;
    }

    public void setMktrId(String mktrId) {
        this.mktrId = mktrId;
    }

    public String getMktrNm() {
        return mktrNm;
    }

    public void setMktrNm(String mktrNm) {
        this.mktrNm = mktrNm;
    }

    public String getCrdAcptr() {
        return crdAcptr;
    }

    public void setCrdAcptr(String crdAcptr) {
        this.crdAcptr = crdAcptr;
    }

    public Character getFlInf24Hrs() {
        return flInf24Hrs;
    }

    public void setFlInf24Hrs(Character flInf24Hrs) {
        this.flInf24Hrs = flInf24Hrs;
    }

    public Character getFlInf18Wheel() {
        return flInf18Wheel;
    }

    public void setFlInf18Wheel(Character flInf18Wheel) {
        this.flInf18Wheel = flInf18Wheel;
    }

    public Character getFlInfDiesel() {
        return flInfDiesel;
    }

    public void setFlInfDiesel(Character flInfDiesel) {
        this.flInfDiesel = flInfDiesel;
    }

    public Character getFlInfIstateExit() {
        return flInfIstateExit;
    }

    public void setFlInfIstateExit(Character flInfIstateExit) {
        this.flInfIstateExit = flInfIstateExit;
    }

    public Character getFlInfConvStor() {
        return flInfConvStor;
    }

    public void setFlInfConvStor(Character flInfConvStor) {
        this.flInfConvStor = flInfConvStor;
    }

    public Character getFlInfTsWRest() {
        return flInfTsWRest;
    }

    public void setFlInfTsWRest(Character flInfTsWRest) {
        this.flInfTsWRest = flInfTsWRest;
    }

    public Character getFlInfTsWHotel() {
        return flInfTsWHotel;
    }

    public void setFlInfTsWHotel(Character flInfTsWHotel) {
        this.flInfTsWHotel = flInfTsWHotel;
    }

    public Character getFlInfTsWShwr() {
        return flInfTsWShwr;
    }

    public void setFlInfTsWShwr(Character flInfTsWShwr) {
        this.flInfTsWShwr = flInfTsWShwr;
    }

    public Character getFlInfVmaint() {
        return flInfVmaint;
    }

    public void setFlInfVmaint(Character flInfVmaint) {
        this.flInfVmaint = flInfVmaint;
    }

    public Character getFlInfCwash() {
        return flInfCwash;
    }

    public void setFlInfCwash(Character flInfCwash) {
        this.flInfCwash = flInfCwash;
    }

    public Character getFlInfAvFuel() {
        return flInfAvFuel;
    }

    public void setFlInfAvFuel(Character flInfAvFuel) {
        this.flInfAvFuel = flInfAvFuel;
    }

    public Character getFlInfMarFuel() {
        return flInfMarFuel;
    }

    public void setFlInfMarFuel(Character flInfMarFuel) {
        this.flInfMarFuel = flInfMarFuel;
    }

    public Character getFlInfAltFuel() {
        return flInfAltFuel;
    }

    public void setFlInfAltFuel(Character flInfAltFuel) {
        this.flInfAltFuel = flInfAltFuel;
    }

    public Character getFlInfPatp() {
        return flInfPatp;
    }

    public void setFlInfPatp(Character flInfPatp) {
        this.flInfPatp = flInfPatp;
    }

    public String getOilCmpyBrand() {
        return oilCmpyBrand;
    }

    public void setOilCmpyBrand(String oilCmpyBrand) {
        this.oilCmpyBrand = oilCmpyBrand;
    }

    public Character getMerchTaxIdProvidedCd() {
        return merchTaxIdProvidedCd;
    }

    public void setMerchTaxIdProvidedCd(Character merchTaxIdProvidedCd) {
        this.merchTaxIdProvidedCd = merchTaxIdProvidedCd;
    }

    public BigDecimal getLatNbr() {
        return latNbr;
    }

    public void setLatNbr(BigDecimal latNbr) {
        this.latNbr = latNbr;
    }

    public BigDecimal getLongNbr() {
        return longNbr;
    }

    public void setLongNbr(BigDecimal longNbr) {
        this.longNbr = longNbr;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (invMrchPK != null ? invMrchPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InvMrch)) {
            return false;
        }
        InvMrch other = (InvMrch) object;
        if ((this.invMrchPK == null && other.invMrchPK != null) || (this.invMrchPK != null && !this.invMrchPK.equals(other.invMrchPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.InvMrch[ invMrchPK=" + invMrchPK + " ]";
    }
    
}
