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
import java.io.Serializable;
import java.math.BigDecimal;

/**
 *
 * @author Sukant.Tiwari
 */
@Entity
@Table(name = "CDREPRT2_REPORTS", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "Cdreprt2Reports.findAll", query = "SELECT c FROM Cdreprt2Reports c")})
public class Cdreprt2Reports implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected Cdreprt2ReportsPK cdreprt2ReportsPK;
    @Basic(optional = false)
    @Column(name = "REPORT_DAY")
    private String reportDay;
    @Basic(optional = false)
    @Column(name = "REPORT_MEDIUM")
    private Character reportMedium;
    @Basic(optional = false)
    @Column(name = "TAPE_DISK_SIZE")
    private Character tapeDiskSize;
    @Basic(optional = false)
    @Column(name = "STYLE")
    private String style;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "REPORT_CHARGE")
    private BigDecimal reportCharge;
    @Basic(optional = false)
    @Column(name = "BILLING_CYCLE")
    private Character billingCycle;
    @Basic(optional = false)
    @Column(name = "ITP_DELIVERY_OPEN_TIME")
    private int itpDeliveryOpenTime;
    @Basic(optional = false)
    @Column(name = "ITP_DELIVERY_CLOSE_TIME")
    private int itpDeliveryCloseTime;
    @Basic(optional = false)
    @Column(name = "ITP_AUTO_OUT_BOUND_AVAIL")
    private Character itpAutoOutBoundAvail;
    @Basic(optional = false)
    @Column(name = "ITP_DELIVERY_DELAY_CODE")
    private String itpDeliveryDelayCode;
    @Basic(optional = false)
    @Column(name = "REPORT_MEDIUM_2")
    private Character reportMedium2;
    @Basic(optional = false)
    @Column(name = "TAPE_DISK_SIZE_2")
    private Character tapeDiskSize2;
    @Basic(optional = false)
    @Column(name = "REPORT_MEDIUM_3")
    private Character reportMedium3;
    @Basic(optional = false)
    @Column(name = "TAPE_DISK_SIZE_3")
    private Character tapeDiskSize3;
    @Basic(optional = false)
    @Column(name = "MSGS_KEY")
    private Character msgsKey;
    @Basic(optional = false)
    @Column(name = "REALTIME_TERM_ID")
    private String realtimeTermId;
    @Basic(optional = false)
    @Column(name = "DOWNLOAD_METHODS")
    private Character downloadMethods;
    @Basic(optional = false)
    @Column(name = "SPECIFIED_DOWNLOAD_TIME01")
    private short specifiedDownloadTime01;
    @Basic(optional = false)
    @Column(name = "SPECIFIED_DOWNLOAD_TIME02")
    private short specifiedDownloadTime02;
    @Basic(optional = false)
    @Column(name = "SPECIFIED_DOWNLOAD_TIME03")
    private short specifiedDownloadTime03;
    @Basic(optional = false)
    @Column(name = "SPECIFIED_DOWNLOAD_TIME04")
    private short specifiedDownloadTime04;
    @Basic(optional = false)
    @Column(name = "SPECIFIED_DOWNLOAD_TIME05")
    private short specifiedDownloadTime05;
    @Basic(optional = false)
    @Column(name = "SPECIFIED_DOWNLOAD_TIME06")
    private short specifiedDownloadTime06;
    @Basic(optional = false)
    @Column(name = "SPECIFIED_DOWNLOAD_TIME07")
    private short specifiedDownloadTime07;
    @Basic(optional = false)
    @Column(name = "SPECIFIED_DOWNLOAD_TIME08")
    private short specifiedDownloadTime08;
    @Basic(optional = false)
    @Column(name = "SPECIFIED_DOWNLOAD_TIME09")
    private short specifiedDownloadTime09;
    @Basic(optional = false)
    @Column(name = "SPECIFIED_DOWNLOAD_TIME10")
    private short specifiedDownloadTime10;
    @Basic(optional = false)
    @Column(name = "SPECIFIED_DOWNLOAD_TIME11")
    private short specifiedDownloadTime11;
    @Basic(optional = false)
    @Column(name = "SPECIFIED_DOWNLOAD_TIME12")
    private short specifiedDownloadTime12;
    @Basic(optional = false)
    @Column(name = "SUPERTRACS_REC_LEN")
    private short supertracsRecLen;
    @Basic(optional = false)
    @Column(name = "SUPERTRACS_ID")
    private String supertracsId;
    @Basic(optional = false)
    @Column(name = "PHYSICAL_RECORD_LEN")
    private int physicalRecordLen;
    @Basic(optional = false)
    @Column(name = "LOGICAL_RECORD_LEN")
    private int logicalRecordLen;
    @Basic(optional = false)
    @Column(name = "BLOCKS_PER_RECORD")
    private int blocksPerRecord;
    @Basic(optional = false)
    @Column(name = "CR_LF_AFTER_DATA_FLAG")
    private Character crLfAfterDataFlag;
    @Basic(optional = false)
    @Column(name = "PRINT_SIMP_DUPL")
    private Character printSimpDupl;
    @Basic(optional = false)
    @Column(name = "NO_OF_COPIES")
    private Character noOfCopies;
    @Basic(optional = false)
    @Column(name = "PRINT_HUB_READ")
    private Character printHubRead;
    @Basic(optional = false)
    @Column(name = "PRINT_TRIP_INVOICE")
    private Character printTripInvoice;
    @Basic(optional = false)
    @Column(name = "BREAK_ON_FUEL")
    private Character breakOnFuel;
    @Basic(optional = false)
    @Column(name = "BREAK_ON_UNIT")
    private Character breakOnUnit;
    @Basic(optional = false)
    @Column(name = "PRINT_TS_ADDR")
    private Character printTsAddr;
    @Basic(optional = false)
    @Column(name = "FUEL_OR_ALLIANCE_FLAG")
    private Character fuelOrAllianceFlag;
    @Basic(optional = false)
    @Column(name = "FUEL_TAX_ATTN_LINE")
    private String fuelTaxAttnLine;
    @Basic(optional = false)
    @Column(name = "FUEL_REPORT_FLAG")
    private Character fuelReportFlag;
    @Basic(optional = false)
    @Column(name = "FUEL_CONSI_CODE")
    private String fuelConsiCode;
    @Basic(optional = false)
    @Column(name = "FUEL_CUST_FICHE")
    private Character fuelCustFiche;
    @Basic(optional = false)
    @Column(name = "LU62_RECORD_FORMAT")
    private Character lu62RecordFormat;
    @Basic(optional = false)
    @Column(name = "LU62_NUMBER_OF_SESSIONS")
    private Character lu62NumberOfSessions;
    @Basic(optional = false)
    @Column(name = "FTP_GROUP1")
    private String ftpGroup1;
    @Basic(optional = false)
    @Column(name = "FTP_GROUP2")
    private String ftpGroup2;
    @Basic(optional = false)
    @Column(name = "FTP_GROUP3")
    private String ftpGroup3;
    @Basic(optional = false)
    @Column(name = "FTP_GROUP4")
    private String ftpGroup4;
    @Basic(optional = false)
    @Column(name = "TCP_TIMEOUT")
    private String tcpTimeout;
    @Basic(optional = false)
    @Column(name = "CODE_SET")
    private String codeSet;

    public Cdreprt2Reports() {
    }

    public Cdreprt2Reports(Cdreprt2ReportsPK cdreprt2ReportsPK) {
        this.cdreprt2ReportsPK = cdreprt2ReportsPK;
    }

    public Cdreprt2Reports(Cdreprt2ReportsPK cdreprt2ReportsPK, String reportDay, Character reportMedium, Character tapeDiskSize, String style, BigDecimal reportCharge, Character billingCycle, int itpDeliveryOpenTime, int itpDeliveryCloseTime, Character itpAutoOutBoundAvail, String itpDeliveryDelayCode, Character reportMedium2, Character tapeDiskSize2, Character reportMedium3, Character tapeDiskSize3, Character msgsKey, String realtimeTermId, Character downloadMethods, short specifiedDownloadTime01, short specifiedDownloadTime02, short specifiedDownloadTime03, short specifiedDownloadTime04, short specifiedDownloadTime05, short specifiedDownloadTime06, short specifiedDownloadTime07, short specifiedDownloadTime08, short specifiedDownloadTime09, short specifiedDownloadTime10, short specifiedDownloadTime11, short specifiedDownloadTime12, short supertracsRecLen, String supertracsId, int physicalRecordLen, int logicalRecordLen, int blocksPerRecord, Character crLfAfterDataFlag, Character printSimpDupl, Character noOfCopies, Character printHubRead, Character printTripInvoice, Character breakOnFuel, Character breakOnUnit, Character printTsAddr, Character fuelOrAllianceFlag, String fuelTaxAttnLine, Character fuelReportFlag, String fuelConsiCode, Character fuelCustFiche, Character lu62RecordFormat, Character lu62NumberOfSessions, String ftpGroup1, String ftpGroup2, String ftpGroup3, String ftpGroup4, String tcpTimeout, String codeSet) {
        this.cdreprt2ReportsPK = cdreprt2ReportsPK;
        this.reportDay = reportDay;
        this.reportMedium = reportMedium;
        this.tapeDiskSize = tapeDiskSize;
        this.style = style;
        this.reportCharge = reportCharge;
        this.billingCycle = billingCycle;
        this.itpDeliveryOpenTime = itpDeliveryOpenTime;
        this.itpDeliveryCloseTime = itpDeliveryCloseTime;
        this.itpAutoOutBoundAvail = itpAutoOutBoundAvail;
        this.itpDeliveryDelayCode = itpDeliveryDelayCode;
        this.reportMedium2 = reportMedium2;
        this.tapeDiskSize2 = tapeDiskSize2;
        this.reportMedium3 = reportMedium3;
        this.tapeDiskSize3 = tapeDiskSize3;
        this.msgsKey = msgsKey;
        this.realtimeTermId = realtimeTermId;
        this.downloadMethods = downloadMethods;
        this.specifiedDownloadTime01 = specifiedDownloadTime01;
        this.specifiedDownloadTime02 = specifiedDownloadTime02;
        this.specifiedDownloadTime03 = specifiedDownloadTime03;
        this.specifiedDownloadTime04 = specifiedDownloadTime04;
        this.specifiedDownloadTime05 = specifiedDownloadTime05;
        this.specifiedDownloadTime06 = specifiedDownloadTime06;
        this.specifiedDownloadTime07 = specifiedDownloadTime07;
        this.specifiedDownloadTime08 = specifiedDownloadTime08;
        this.specifiedDownloadTime09 = specifiedDownloadTime09;
        this.specifiedDownloadTime10 = specifiedDownloadTime10;
        this.specifiedDownloadTime11 = specifiedDownloadTime11;
        this.specifiedDownloadTime12 = specifiedDownloadTime12;
        this.supertracsRecLen = supertracsRecLen;
        this.supertracsId = supertracsId;
        this.physicalRecordLen = physicalRecordLen;
        this.logicalRecordLen = logicalRecordLen;
        this.blocksPerRecord = blocksPerRecord;
        this.crLfAfterDataFlag = crLfAfterDataFlag;
        this.printSimpDupl = printSimpDupl;
        this.noOfCopies = noOfCopies;
        this.printHubRead = printHubRead;
        this.printTripInvoice = printTripInvoice;
        this.breakOnFuel = breakOnFuel;
        this.breakOnUnit = breakOnUnit;
        this.printTsAddr = printTsAddr;
        this.fuelOrAllianceFlag = fuelOrAllianceFlag;
        this.fuelTaxAttnLine = fuelTaxAttnLine;
        this.fuelReportFlag = fuelReportFlag;
        this.fuelConsiCode = fuelConsiCode;
        this.fuelCustFiche = fuelCustFiche;
        this.lu62RecordFormat = lu62RecordFormat;
        this.lu62NumberOfSessions = lu62NumberOfSessions;
        this.ftpGroup1 = ftpGroup1;
        this.ftpGroup2 = ftpGroup2;
        this.ftpGroup3 = ftpGroup3;
        this.ftpGroup4 = ftpGroup4;
        this.tcpTimeout = tcpTimeout;
        this.codeSet = codeSet;
    }

    public Cdreprt2Reports(String customerType, String customerId, String systemId, int reportCode, Character reportFrequency, String recvCustomerType, String recvCustomerId, String recvSubId, Character ctlByte) {
        this.cdreprt2ReportsPK = new Cdreprt2ReportsPK(customerType, customerId, systemId, reportCode, reportFrequency, recvCustomerType, recvCustomerId, recvSubId, ctlByte);
    }

    public Cdreprt2ReportsPK getCdreprt2ReportsPK() {
        return cdreprt2ReportsPK;
    }

    public void setCdreprt2ReportsPK(Cdreprt2ReportsPK cdreprt2ReportsPK) {
        this.cdreprt2ReportsPK = cdreprt2ReportsPK;
    }

    public String getReportDay() {
        return reportDay;
    }

    public void setReportDay(String reportDay) {
        this.reportDay = reportDay;
    }

    public Character getReportMedium() {
        return reportMedium;
    }

    public void setReportMedium(Character reportMedium) {
        this.reportMedium = reportMedium;
    }

    public Character getTapeDiskSize() {
        return tapeDiskSize;
    }

    public void setTapeDiskSize(Character tapeDiskSize) {
        this.tapeDiskSize = tapeDiskSize;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public BigDecimal getReportCharge() {
        return reportCharge;
    }

    public void setReportCharge(BigDecimal reportCharge) {
        this.reportCharge = reportCharge;
    }

    public Character getBillingCycle() {
        return billingCycle;
    }

    public void setBillingCycle(Character billingCycle) {
        this.billingCycle = billingCycle;
    }

    public int getItpDeliveryOpenTime() {
        return itpDeliveryOpenTime;
    }

    public void setItpDeliveryOpenTime(int itpDeliveryOpenTime) {
        this.itpDeliveryOpenTime = itpDeliveryOpenTime;
    }

    public int getItpDeliveryCloseTime() {
        return itpDeliveryCloseTime;
    }

    public void setItpDeliveryCloseTime(int itpDeliveryCloseTime) {
        this.itpDeliveryCloseTime = itpDeliveryCloseTime;
    }

    public Character getItpAutoOutBoundAvail() {
        return itpAutoOutBoundAvail;
    }

    public void setItpAutoOutBoundAvail(Character itpAutoOutBoundAvail) {
        this.itpAutoOutBoundAvail = itpAutoOutBoundAvail;
    }

    public String getItpDeliveryDelayCode() {
        return itpDeliveryDelayCode;
    }

    public void setItpDeliveryDelayCode(String itpDeliveryDelayCode) {
        this.itpDeliveryDelayCode = itpDeliveryDelayCode;
    }

    public Character getReportMedium2() {
        return reportMedium2;
    }

    public void setReportMedium2(Character reportMedium2) {
        this.reportMedium2 = reportMedium2;
    }

    public Character getTapeDiskSize2() {
        return tapeDiskSize2;
    }

    public void setTapeDiskSize2(Character tapeDiskSize2) {
        this.tapeDiskSize2 = tapeDiskSize2;
    }

    public Character getReportMedium3() {
        return reportMedium3;
    }

    public void setReportMedium3(Character reportMedium3) {
        this.reportMedium3 = reportMedium3;
    }

    public Character getTapeDiskSize3() {
        return tapeDiskSize3;
    }

    public void setTapeDiskSize3(Character tapeDiskSize3) {
        this.tapeDiskSize3 = tapeDiskSize3;
    }

    public Character getMsgsKey() {
        return msgsKey;
    }

    public void setMsgsKey(Character msgsKey) {
        this.msgsKey = msgsKey;
    }

    public String getRealtimeTermId() {
        return realtimeTermId;
    }

    public void setRealtimeTermId(String realtimeTermId) {
        this.realtimeTermId = realtimeTermId;
    }

    public Character getDownloadMethods() {
        return downloadMethods;
    }

    public void setDownloadMethods(Character downloadMethods) {
        this.downloadMethods = downloadMethods;
    }

    public short getSpecifiedDownloadTime01() {
        return specifiedDownloadTime01;
    }

    public void setSpecifiedDownloadTime01(short specifiedDownloadTime01) {
        this.specifiedDownloadTime01 = specifiedDownloadTime01;
    }

    public short getSpecifiedDownloadTime02() {
        return specifiedDownloadTime02;
    }

    public void setSpecifiedDownloadTime02(short specifiedDownloadTime02) {
        this.specifiedDownloadTime02 = specifiedDownloadTime02;
    }

    public short getSpecifiedDownloadTime03() {
        return specifiedDownloadTime03;
    }

    public void setSpecifiedDownloadTime03(short specifiedDownloadTime03) {
        this.specifiedDownloadTime03 = specifiedDownloadTime03;
    }

    public short getSpecifiedDownloadTime04() {
        return specifiedDownloadTime04;
    }

    public void setSpecifiedDownloadTime04(short specifiedDownloadTime04) {
        this.specifiedDownloadTime04 = specifiedDownloadTime04;
    }

    public short getSpecifiedDownloadTime05() {
        return specifiedDownloadTime05;
    }

    public void setSpecifiedDownloadTime05(short specifiedDownloadTime05) {
        this.specifiedDownloadTime05 = specifiedDownloadTime05;
    }

    public short getSpecifiedDownloadTime06() {
        return specifiedDownloadTime06;
    }

    public void setSpecifiedDownloadTime06(short specifiedDownloadTime06) {
        this.specifiedDownloadTime06 = specifiedDownloadTime06;
    }

    public short getSpecifiedDownloadTime07() {
        return specifiedDownloadTime07;
    }

    public void setSpecifiedDownloadTime07(short specifiedDownloadTime07) {
        this.specifiedDownloadTime07 = specifiedDownloadTime07;
    }

    public short getSpecifiedDownloadTime08() {
        return specifiedDownloadTime08;
    }

    public void setSpecifiedDownloadTime08(short specifiedDownloadTime08) {
        this.specifiedDownloadTime08 = specifiedDownloadTime08;
    }

    public short getSpecifiedDownloadTime09() {
        return specifiedDownloadTime09;
    }

    public void setSpecifiedDownloadTime09(short specifiedDownloadTime09) {
        this.specifiedDownloadTime09 = specifiedDownloadTime09;
    }

    public short getSpecifiedDownloadTime10() {
        return specifiedDownloadTime10;
    }

    public void setSpecifiedDownloadTime10(short specifiedDownloadTime10) {
        this.specifiedDownloadTime10 = specifiedDownloadTime10;
    }

    public short getSpecifiedDownloadTime11() {
        return specifiedDownloadTime11;
    }

    public void setSpecifiedDownloadTime11(short specifiedDownloadTime11) {
        this.specifiedDownloadTime11 = specifiedDownloadTime11;
    }

    public short getSpecifiedDownloadTime12() {
        return specifiedDownloadTime12;
    }

    public void setSpecifiedDownloadTime12(short specifiedDownloadTime12) {
        this.specifiedDownloadTime12 = specifiedDownloadTime12;
    }

    public short getSupertracsRecLen() {
        return supertracsRecLen;
    }

    public void setSupertracsRecLen(short supertracsRecLen) {
        this.supertracsRecLen = supertracsRecLen;
    }

    public String getSupertracsId() {
        return supertracsId;
    }

    public void setSupertracsId(String supertracsId) {
        this.supertracsId = supertracsId;
    }

    public int getPhysicalRecordLen() {
        return physicalRecordLen;
    }

    public void setPhysicalRecordLen(int physicalRecordLen) {
        this.physicalRecordLen = physicalRecordLen;
    }

    public int getLogicalRecordLen() {
        return logicalRecordLen;
    }

    public void setLogicalRecordLen(int logicalRecordLen) {
        this.logicalRecordLen = logicalRecordLen;
    }

    public int getBlocksPerRecord() {
        return blocksPerRecord;
    }

    public void setBlocksPerRecord(int blocksPerRecord) {
        this.blocksPerRecord = blocksPerRecord;
    }

    public Character getCrLfAfterDataFlag() {
        return crLfAfterDataFlag;
    }

    public void setCrLfAfterDataFlag(Character crLfAfterDataFlag) {
        this.crLfAfterDataFlag = crLfAfterDataFlag;
    }

    public Character getPrintSimpDupl() {
        return printSimpDupl;
    }

    public void setPrintSimpDupl(Character printSimpDupl) {
        this.printSimpDupl = printSimpDupl;
    }

    public Character getNoOfCopies() {
        return noOfCopies;
    }

    public void setNoOfCopies(Character noOfCopies) {
        this.noOfCopies = noOfCopies;
    }

    public Character getPrintHubRead() {
        return printHubRead;
    }

    public void setPrintHubRead(Character printHubRead) {
        this.printHubRead = printHubRead;
    }

    public Character getPrintTripInvoice() {
        return printTripInvoice;
    }

    public void setPrintTripInvoice(Character printTripInvoice) {
        this.printTripInvoice = printTripInvoice;
    }

    public Character getBreakOnFuel() {
        return breakOnFuel;
    }

    public void setBreakOnFuel(Character breakOnFuel) {
        this.breakOnFuel = breakOnFuel;
    }

    public Character getBreakOnUnit() {
        return breakOnUnit;
    }

    public void setBreakOnUnit(Character breakOnUnit) {
        this.breakOnUnit = breakOnUnit;
    }

    public Character getPrintTsAddr() {
        return printTsAddr;
    }

    public void setPrintTsAddr(Character printTsAddr) {
        this.printTsAddr = printTsAddr;
    }

    public Character getFuelOrAllianceFlag() {
        return fuelOrAllianceFlag;
    }

    public void setFuelOrAllianceFlag(Character fuelOrAllianceFlag) {
        this.fuelOrAllianceFlag = fuelOrAllianceFlag;
    }

    public String getFuelTaxAttnLine() {
        return fuelTaxAttnLine;
    }

    public void setFuelTaxAttnLine(String fuelTaxAttnLine) {
        this.fuelTaxAttnLine = fuelTaxAttnLine;
    }

    public Character getFuelReportFlag() {
        return fuelReportFlag;
    }

    public void setFuelReportFlag(Character fuelReportFlag) {
        this.fuelReportFlag = fuelReportFlag;
    }

    public String getFuelConsiCode() {
        return fuelConsiCode;
    }

    public void setFuelConsiCode(String fuelConsiCode) {
        this.fuelConsiCode = fuelConsiCode;
    }

    public Character getFuelCustFiche() {
        return fuelCustFiche;
    }

    public void setFuelCustFiche(Character fuelCustFiche) {
        this.fuelCustFiche = fuelCustFiche;
    }

    public Character getLu62RecordFormat() {
        return lu62RecordFormat;
    }

    public void setLu62RecordFormat(Character lu62RecordFormat) {
        this.lu62RecordFormat = lu62RecordFormat;
    }

    public Character getLu62NumberOfSessions() {
        return lu62NumberOfSessions;
    }

    public void setLu62NumberOfSessions(Character lu62NumberOfSessions) {
        this.lu62NumberOfSessions = lu62NumberOfSessions;
    }

    public String getFtpGroup1() {
        return ftpGroup1;
    }

    public void setFtpGroup1(String ftpGroup1) {
        this.ftpGroup1 = ftpGroup1;
    }

    public String getFtpGroup2() {
        return ftpGroup2;
    }

    public void setFtpGroup2(String ftpGroup2) {
        this.ftpGroup2 = ftpGroup2;
    }

    public String getFtpGroup3() {
        return ftpGroup3;
    }

    public void setFtpGroup3(String ftpGroup3) {
        this.ftpGroup3 = ftpGroup3;
    }

    public String getFtpGroup4() {
        return ftpGroup4;
    }

    public void setFtpGroup4(String ftpGroup4) {
        this.ftpGroup4 = ftpGroup4;
    }

    public String getTcpTimeout() {
        return tcpTimeout;
    }

    public void setTcpTimeout(String tcpTimeout) {
        this.tcpTimeout = tcpTimeout;
    }

    public String getCodeSet() {
        return codeSet;
    }

    public void setCodeSet(String codeSet) {
        this.codeSet = codeSet;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cdreprt2ReportsPK != null ? cdreprt2ReportsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cdreprt2Reports)) {
            return false;
        }
        Cdreprt2Reports other = (Cdreprt2Reports) object;
        if ((this.cdreprt2ReportsPK == null && other.cdreprt2ReportsPK != null) || (this.cdreprt2ReportsPK != null && !this.cdreprt2ReportsPK.equals(other.cdreprt2ReportsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.Cdreprt2Reports[ cdreprt2ReportsPK=" + cdreprt2ReportsPK + " ]";
    }
    
}
