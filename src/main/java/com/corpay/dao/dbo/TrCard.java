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
@Table(name = "TR_CARD", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "TrCard.findAll", query = "SELECT t FROM TrCard t")})
public class TrCard implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CD_CARD_NUMBER")
    private String cdCardNumber;
    @Basic(optional = false)
    @Column(name = "CD_ACCOUNT_CODE")
    private String cdAccountCode;
    @Basic(optional = false)
    @Column(name = "CD_CUSTOMER_ID")
    private String cdCustomerId;
    @Basic(optional = false)
    @Column(name = "CD_STATUS")
    private Character cdStatus;
    @Basic(optional = false)
    @Column(name = "CD_FIRST_NAME")
    private String cdFirstName;
    @Basic(optional = false)
    @Column(name = "CD_LAST_NAME")
    private String cdLastName;
    @Basic(optional = false)
    @Column(name = "CD_EMPLOYEE_ID")
    private String cdEmployeeId;
    @Basic(optional = false)
    @Column(name = "CD_UNIT_NUMBER")
    private String cdUnitNumber;
    @Basic(optional = false)
    @Column(name = "CD_FUEL_CARD")
    private Character cdFuelCard;
    @Basic(optional = false)
    @Column(name = "CD_ADHERE_TO_STANDARDS")
    private Character cdAdhereToStandards;
    @Basic(optional = false)
    @Column(name = "CD_COMPANY_STANDARD_ID")
    private short cdCompanyStandardId;
    @Basic(optional = false)
    @Column(name = "CD_PRIMARY_CARD_NUMBER")
    private String cdPrimaryCardNumber;
    @Basic(optional = false)
    @Column(name = "CD_OVERRIDE_LIM_COUNT")
    private short cdOverrideLimCount;
    @Basic(optional = false)
    @Column(name = "CD_TRAILER_NUMBER")
    private String cdTrailerNumber;
    @Basic(optional = false)
    @Column(name = "CD_DRIVER_TRIP_NUMBER")
    private String cdDriverTripNumber;
    @Basic(optional = false)
    @Column(name = "CD_DRIVERS_LICENSE")
    private String cdDriversLicense;
    @Basic(optional = false)
    @Column(name = "CD_DRIVERS_STATE")
    private String cdDriversState;
    @Basic(optional = false)
    @Column(name = "CD_LIMIT_NETWORK_BY_CARD")
    private Character cdLimitNetworkByCard;
    @Basic(optional = false)
    @Column(name = "CD_SUB_NETWORK_GROUP")
    private String cdSubNetworkGroup;
    @Basic(optional = false)
    @Column(name = "CD_POS_NETWORK")
    private Character cdPosNetwork;
    @Basic(optional = false)
    @Column(name = "CD_ATM_ACCESS")
    private Character cdAtmAccess;
    @Basic(optional = false)
    @Column(name = "CD_PIN_DATA")
    private String cdPinData;
    @Basic(optional = false)
    @Column(name = "CD_EXPRESS_CASH_ACCT")
    private Character cdExpressCashAcct;
    @Basic(optional = false)
    @Column(name = "CD_DRIVER_GROUP_ID")
    private String cdDriverGroupId;
    @Basic(optional = false)
    @Column(name = "CD_EXACT_AMT")
    private Character cdExactAmt;
    @Basic(optional = false)
    @Column(name = "CD_LAST_CRC")
    private long cdLastCrc;
    @Basic(optional = false)
    @Column(name = "CD_UPDATE_TSTAMP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date cdUpdateTstamp;
    @Basic(optional = false)
    @Column(name = "CD_PIN_UPDATE_TSTAMP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date cdPinUpdateTstamp;
    @Basic(optional = false)
    @Column(name = "CD_COMPANY_STANDARD_ID_NUM")
    private String cdCompanyStandardIdNum;
    @Basic(optional = false)
    @Column(name = "CD_ONE_TIME_CSTAND_FLAG")
    private Character cdOneTimeCstandFlag;
    @Basic(optional = false)
    @Column(name = "CD_ONE_TIME_CSTAND_ID")
    private String cdOneTimeCstandId;
    @Basic(optional = false)
    @Column(name = "CD_HIERARCHY_ID")
    private String cdHierarchyId;
    @Basic(optional = false)
    @Column(name = "CD_NODE_ID")
    private String cdNodeId;
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

    public TrCard() {
    }

    public TrCard(String cdCardNumber) {
        this.cdCardNumber = cdCardNumber;
    }

    public TrCard(String cdCardNumber, String cdAccountCode, String cdCustomerId, Character cdStatus, String cdFirstName, String cdLastName, String cdEmployeeId, String cdUnitNumber, Character cdFuelCard, Character cdAdhereToStandards, short cdCompanyStandardId, String cdPrimaryCardNumber, short cdOverrideLimCount, String cdTrailerNumber, String cdDriverTripNumber, String cdDriversLicense, String cdDriversState, Character cdLimitNetworkByCard, String cdSubNetworkGroup, Character cdPosNetwork, Character cdAtmAccess, String cdPinData, Character cdExpressCashAcct, String cdDriverGroupId, Character cdExactAmt, long cdLastCrc, Date cdUpdateTstamp, Date cdPinUpdateTstamp, String cdCompanyStandardIdNum, Character cdOneTimeCstandFlag, String cdOneTimeCstandId, String cdHierarchyId, String cdNodeId, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.cdCardNumber = cdCardNumber;
        this.cdAccountCode = cdAccountCode;
        this.cdCustomerId = cdCustomerId;
        this.cdStatus = cdStatus;
        this.cdFirstName = cdFirstName;
        this.cdLastName = cdLastName;
        this.cdEmployeeId = cdEmployeeId;
        this.cdUnitNumber = cdUnitNumber;
        this.cdFuelCard = cdFuelCard;
        this.cdAdhereToStandards = cdAdhereToStandards;
        this.cdCompanyStandardId = cdCompanyStandardId;
        this.cdPrimaryCardNumber = cdPrimaryCardNumber;
        this.cdOverrideLimCount = cdOverrideLimCount;
        this.cdTrailerNumber = cdTrailerNumber;
        this.cdDriverTripNumber = cdDriverTripNumber;
        this.cdDriversLicense = cdDriversLicense;
        this.cdDriversState = cdDriversState;
        this.cdLimitNetworkByCard = cdLimitNetworkByCard;
        this.cdSubNetworkGroup = cdSubNetworkGroup;
        this.cdPosNetwork = cdPosNetwork;
        this.cdAtmAccess = cdAtmAccess;
        this.cdPinData = cdPinData;
        this.cdExpressCashAcct = cdExpressCashAcct;
        this.cdDriverGroupId = cdDriverGroupId;
        this.cdExactAmt = cdExactAmt;
        this.cdLastCrc = cdLastCrc;
        this.cdUpdateTstamp = cdUpdateTstamp;
        this.cdPinUpdateTstamp = cdPinUpdateTstamp;
        this.cdCompanyStandardIdNum = cdCompanyStandardIdNum;
        this.cdOneTimeCstandFlag = cdOneTimeCstandFlag;
        this.cdOneTimeCstandId = cdOneTimeCstandId;
        this.cdHierarchyId = cdHierarchyId;
        this.cdNodeId = cdNodeId;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public String getCdCardNumber() {
        return cdCardNumber;
    }

    public void setCdCardNumber(String cdCardNumber) {
        this.cdCardNumber = cdCardNumber;
    }

    public String getCdAccountCode() {
        return cdAccountCode;
    }

    public void setCdAccountCode(String cdAccountCode) {
        this.cdAccountCode = cdAccountCode;
    }

    public String getCdCustomerId() {
        return cdCustomerId;
    }

    public void setCdCustomerId(String cdCustomerId) {
        this.cdCustomerId = cdCustomerId;
    }

    public Character getCdStatus() {
        return cdStatus;
    }

    public void setCdStatus(Character cdStatus) {
        this.cdStatus = cdStatus;
    }

    public String getCdFirstName() {
        return cdFirstName;
    }

    public void setCdFirstName(String cdFirstName) {
        this.cdFirstName = cdFirstName;
    }

    public String getCdLastName() {
        return cdLastName;
    }

    public void setCdLastName(String cdLastName) {
        this.cdLastName = cdLastName;
    }

    public String getCdEmployeeId() {
        return cdEmployeeId;
    }

    public void setCdEmployeeId(String cdEmployeeId) {
        this.cdEmployeeId = cdEmployeeId;
    }

    public String getCdUnitNumber() {
        return cdUnitNumber;
    }

    public void setCdUnitNumber(String cdUnitNumber) {
        this.cdUnitNumber = cdUnitNumber;
    }

    public Character getCdFuelCard() {
        return cdFuelCard;
    }

    public void setCdFuelCard(Character cdFuelCard) {
        this.cdFuelCard = cdFuelCard;
    }

    public Character getCdAdhereToStandards() {
        return cdAdhereToStandards;
    }

    public void setCdAdhereToStandards(Character cdAdhereToStandards) {
        this.cdAdhereToStandards = cdAdhereToStandards;
    }

    public short getCdCompanyStandardId() {
        return cdCompanyStandardId;
    }

    public void setCdCompanyStandardId(short cdCompanyStandardId) {
        this.cdCompanyStandardId = cdCompanyStandardId;
    }

    public String getCdPrimaryCardNumber() {
        return cdPrimaryCardNumber;
    }

    public void setCdPrimaryCardNumber(String cdPrimaryCardNumber) {
        this.cdPrimaryCardNumber = cdPrimaryCardNumber;
    }

    public short getCdOverrideLimCount() {
        return cdOverrideLimCount;
    }

    public void setCdOverrideLimCount(short cdOverrideLimCount) {
        this.cdOverrideLimCount = cdOverrideLimCount;
    }

    public String getCdTrailerNumber() {
        return cdTrailerNumber;
    }

    public void setCdTrailerNumber(String cdTrailerNumber) {
        this.cdTrailerNumber = cdTrailerNumber;
    }

    public String getCdDriverTripNumber() {
        return cdDriverTripNumber;
    }

    public void setCdDriverTripNumber(String cdDriverTripNumber) {
        this.cdDriverTripNumber = cdDriverTripNumber;
    }

    public String getCdDriversLicense() {
        return cdDriversLicense;
    }

    public void setCdDriversLicense(String cdDriversLicense) {
        this.cdDriversLicense = cdDriversLicense;
    }

    public String getCdDriversState() {
        return cdDriversState;
    }

    public void setCdDriversState(String cdDriversState) {
        this.cdDriversState = cdDriversState;
    }

    public Character getCdLimitNetworkByCard() {
        return cdLimitNetworkByCard;
    }

    public void setCdLimitNetworkByCard(Character cdLimitNetworkByCard) {
        this.cdLimitNetworkByCard = cdLimitNetworkByCard;
    }

    public String getCdSubNetworkGroup() {
        return cdSubNetworkGroup;
    }

    public void setCdSubNetworkGroup(String cdSubNetworkGroup) {
        this.cdSubNetworkGroup = cdSubNetworkGroup;
    }

    public Character getCdPosNetwork() {
        return cdPosNetwork;
    }

    public void setCdPosNetwork(Character cdPosNetwork) {
        this.cdPosNetwork = cdPosNetwork;
    }

    public Character getCdAtmAccess() {
        return cdAtmAccess;
    }

    public void setCdAtmAccess(Character cdAtmAccess) {
        this.cdAtmAccess = cdAtmAccess;
    }

    public String getCdPinData() {
        return cdPinData;
    }

    public void setCdPinData(String cdPinData) {
        this.cdPinData = cdPinData;
    }

    public Character getCdExpressCashAcct() {
        return cdExpressCashAcct;
    }

    public void setCdExpressCashAcct(Character cdExpressCashAcct) {
        this.cdExpressCashAcct = cdExpressCashAcct;
    }

    public String getCdDriverGroupId() {
        return cdDriverGroupId;
    }

    public void setCdDriverGroupId(String cdDriverGroupId) {
        this.cdDriverGroupId = cdDriverGroupId;
    }

    public Character getCdExactAmt() {
        return cdExactAmt;
    }

    public void setCdExactAmt(Character cdExactAmt) {
        this.cdExactAmt = cdExactAmt;
    }

    public long getCdLastCrc() {
        return cdLastCrc;
    }

    public void setCdLastCrc(long cdLastCrc) {
        this.cdLastCrc = cdLastCrc;
    }

    public Date getCdUpdateTstamp() {
        return cdUpdateTstamp;
    }

    public void setCdUpdateTstamp(Date cdUpdateTstamp) {
        this.cdUpdateTstamp = cdUpdateTstamp;
    }

    public Date getCdPinUpdateTstamp() {
        return cdPinUpdateTstamp;
    }

    public void setCdPinUpdateTstamp(Date cdPinUpdateTstamp) {
        this.cdPinUpdateTstamp = cdPinUpdateTstamp;
    }

    public String getCdCompanyStandardIdNum() {
        return cdCompanyStandardIdNum;
    }

    public void setCdCompanyStandardIdNum(String cdCompanyStandardIdNum) {
        this.cdCompanyStandardIdNum = cdCompanyStandardIdNum;
    }

    public Character getCdOneTimeCstandFlag() {
        return cdOneTimeCstandFlag;
    }

    public void setCdOneTimeCstandFlag(Character cdOneTimeCstandFlag) {
        this.cdOneTimeCstandFlag = cdOneTimeCstandFlag;
    }

    public String getCdOneTimeCstandId() {
        return cdOneTimeCstandId;
    }

    public void setCdOneTimeCstandId(String cdOneTimeCstandId) {
        this.cdOneTimeCstandId = cdOneTimeCstandId;
    }

    public String getCdHierarchyId() {
        return cdHierarchyId;
    }

    public void setCdHierarchyId(String cdHierarchyId) {
        this.cdHierarchyId = cdHierarchyId;
    }

    public String getCdNodeId() {
        return cdNodeId;
    }

    public void setCdNodeId(String cdNodeId) {
        this.cdNodeId = cdNodeId;
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
        hash += (cdCardNumber != null ? cdCardNumber.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TrCard)) {
            return false;
        }
        TrCard other = (TrCard) object;
        if ((this.cdCardNumber == null && other.cdCardNumber != null) || (this.cdCardNumber != null && !this.cdCardNumber.equals(other.cdCardNumber))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.TrCard[ cdCardNumber=" + cdCardNumber + " ]";
    }
    
}
