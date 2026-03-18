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
@Table(name = "VP_ACQUIRER", catalog = "", schema = "DBO")
public class VpAcquirer implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private String id;
    @Basic(optional = false)
    @Column(name = "MERCHANT_NAME")
    private String merchantName;
    @Basic(optional = false)
    @Column(name = "ACQUIRER")
    private String acquirer;
    @Basic(optional = false)
    @Column(name = "PLATFORM")
    private String platform;
    @Basic(optional = false)
    @Column(name = "NETWORK")
    private String network;
    @Basic(optional = false)
    @Column(name = "MCC")
    private String mcc;
    @Basic(optional = false)
    @Column(name = "MCC_DESCRIPTION")
    private String mccDescription;
    @Basic(optional = false)
    @Column(name = "ADDRESS_LINE_1")
    private String addressLine1;
    @Basic(optional = false)
    @Column(name = "ADDRESS_LINE_2")
    private String addressLine2;
    @Basic(optional = false)
    @Column(name = "CITY")
    private String city;
    @Basic(optional = false)
    @Column(name = "STATE")
    private String state;
    @Basic(optional = false)
    @Column(name = "POSTAL_CODE")
    private String postalCode;
    @Basic(optional = false)
    @Column(name = "COUNTRY")
    private String country;
    @Basic(optional = false)
    @Column(name = "PHONE_NUMBER")
    private String phoneNumber;
    @Basic(optional = false)
    @Column(name = "MERCHANT_ID")
    private String merchantId;
    @Basic(optional = false)
    @Column(name = "CLIENT_NUMBER")
    private String clientNumber;
    @Basic(optional = false)
    @Column(name = "TERMINAL_ID")
    private String terminalId;
    @Basic(optional = false)
    @Column(name = "BANK_ID_ACQUIRER_ID")
    private String bankIdAcquirerId;
    @Basic(optional = false)
    @Column(name = "ACQUIRER_BIN")
    private String acquirerBin;
    @Basic(optional = false)
    @Column(name = "AGENT_BANK")
    private String agentBank;
    @Basic(optional = false)
    @Column(name = "AGENT_CHAIN")
    private String agentChain;
    @Basic(optional = false)
    @Column(name = "STORE_NUMBER")
    private String storeNumber;
    @Basic(optional = false)
    @Column(name = "TIME_ZONE_DIFF")
    private String timeZoneDiff;
    @Basic(optional = false)
    @Column(name = "V_NUMBER")
    private String vNumber;
    @Basic(optional = false)
    @Column(name = "TAX_ID")
    private String taxId;
    @Basic(optional = false)
    @Column(name = "MISC_1")
    private String misc1;
    @Basic(optional = false)
    @Column(name = "MISC_2")
    private String misc2;
    @Basic(optional = false)
    @Column(name = "MISC_3")
    private String misc3;
    @Basic(optional = false)
    @Column(name = "EMAIL")
    private String email;
    @Basic(optional = false)
    @Column(name = "TID_FORMAT")
    private String tidFormat;
    @Basic(optional = false)
    @Column(name = "AUTO_RECONCILIATION_TIME")
    private String autoReconciliationTime;
    @Basic(optional = false)
    @Column(name = "SOURCE_ID")
    private String sourceId;
    @Basic(optional = false)
    @Column(name = "SOURCE_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date sourceTs;
    @Basic(optional = false)
    @Column(name = "CONTACT")
    private String contact;
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

    public VpAcquirer() {
    }

    public VpAcquirer(String id) {
        this.id = id;
    }

    public VpAcquirer(String id, String merchantName, String acquirer, String platform, String network, String mcc, String mccDescription, String addressLine1, String addressLine2, String city, String state, String postalCode, String country, String phoneNumber, String merchantId, String clientNumber, String terminalId, String bankIdAcquirerId, String acquirerBin, String agentBank, String agentChain, String storeNumber, String timeZoneDiff, String vNumber, String taxId, String misc1, String misc2, String misc3, String email, String tidFormat, String autoReconciliationTime, String sourceId, Date sourceTs, String contact, String mdyUsr, Date mdyTs, String crtUsr, Date crtTs) {
        this.id = id;
        this.merchantName = merchantName;
        this.acquirer = acquirer;
        this.platform = platform;
        this.network = network;
        this.mcc = mcc;
        this.mccDescription = mccDescription;
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.city = city;
        this.state = state;
        this.postalCode = postalCode;
        this.country = country;
        this.phoneNumber = phoneNumber;
        this.merchantId = merchantId;
        this.clientNumber = clientNumber;
        this.terminalId = terminalId;
        this.bankIdAcquirerId = bankIdAcquirerId;
        this.acquirerBin = acquirerBin;
        this.agentBank = agentBank;
        this.agentChain = agentChain;
        this.storeNumber = storeNumber;
        this.timeZoneDiff = timeZoneDiff;
        this.vNumber = vNumber;
        this.taxId = taxId;
        this.misc1 = misc1;
        this.misc2 = misc2;
        this.misc3 = misc3;
        this.email = email;
        this.tidFormat = tidFormat;
        this.autoReconciliationTime = autoReconciliationTime;
        this.sourceId = sourceId;
        this.sourceTs = sourceTs;
        this.contact = contact;
        this.mdyUsr = mdyUsr;
        this.mdyTs = mdyTs;
        this.crtUsr = crtUsr;
        this.crtTs = crtTs;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMerchantName() {
        return merchantName;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName;
    }

    public String getAcquirer() {
        return acquirer;
    }

    public void setAcquirer(String acquirer) {
        this.acquirer = acquirer;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getNetwork() {
        return network;
    }

    public void setNetwork(String network) {
        this.network = network;
    }

    public String getMcc() {
        return mcc;
    }

    public void setMcc(String mcc) {
        this.mcc = mcc;
    }

    public String getMccDescription() {
        return mccDescription;
    }

    public void setMccDescription(String mccDescription) {
        this.mccDescription = mccDescription;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    public String getClientNumber() {
        return clientNumber;
    }

    public void setClientNumber(String clientNumber) {
        this.clientNumber = clientNumber;
    }

    public String getTerminalId() {
        return terminalId;
    }

    public void setTerminalId(String terminalId) {
        this.terminalId = terminalId;
    }

    public String getBankIdAcquirerId() {
        return bankIdAcquirerId;
    }

    public void setBankIdAcquirerId(String bankIdAcquirerId) {
        this.bankIdAcquirerId = bankIdAcquirerId;
    }

    public String getAcquirerBin() {
        return acquirerBin;
    }

    public void setAcquirerBin(String acquirerBin) {
        this.acquirerBin = acquirerBin;
    }

    public String getAgentBank() {
        return agentBank;
    }

    public void setAgentBank(String agentBank) {
        this.agentBank = agentBank;
    }

    public String getAgentChain() {
        return agentChain;
    }

    public void setAgentChain(String agentChain) {
        this.agentChain = agentChain;
    }

    public String getStoreNumber() {
        return storeNumber;
    }

    public void setStoreNumber(String storeNumber) {
        this.storeNumber = storeNumber;
    }

    public String getTimeZoneDiff() {
        return timeZoneDiff;
    }

    public void setTimeZoneDiff(String timeZoneDiff) {
        this.timeZoneDiff = timeZoneDiff;
    }

    public String getVNumber() {
        return vNumber;
    }

    public void setVNumber(String vNumber) {
        this.vNumber = vNumber;
    }

    public String getTaxId() {
        return taxId;
    }

    public void setTaxId(String taxId) {
        this.taxId = taxId;
    }

    public String getMisc1() {
        return misc1;
    }

    public void setMisc1(String misc1) {
        this.misc1 = misc1;
    }

    public String getMisc2() {
        return misc2;
    }

    public void setMisc2(String misc2) {
        this.misc2 = misc2;
    }

    public String getMisc3() {
        return misc3;
    }

    public void setMisc3(String misc3) {
        this.misc3 = misc3;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTidFormat() {
        return tidFormat;
    }

    public void setTidFormat(String tidFormat) {
        this.tidFormat = tidFormat;
    }

    public String getAutoReconciliationTime() {
        return autoReconciliationTime;
    }

    public void setAutoReconciliationTime(String autoReconciliationTime) {
        this.autoReconciliationTime = autoReconciliationTime;
    }

    public String getSourceId() {
        return sourceId;
    }

    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }

    public Date getSourceTs() {
        return sourceTs;
    }

    public void setSourceTs(Date sourceTs) {
        this.sourceTs = sourceTs;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
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
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof VpAcquirer)) {
            return false;
        }
        VpAcquirer other = (VpAcquirer) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.VpAcquirer[ id=" + id + " ]";
    }

}
