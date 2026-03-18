package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "DSPT_TRANS_SUM", catalog = "", schema = "DBO")
public class DsptTransSum implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "DSPT_ID")
    private String dsptId;
    @Basic(optional = false)
    @Column(name = "ACCT_NBR")
    private String acctNbr;
    @Basic(optional = false)
    @Column(name = "CUST_ID")
    private String custId;
    @Basic(optional = false)
    @Column(name = "USER_ID")
    private String userId;
    @Basic(optional = false)
    @Column(name = "COMPANY_NM")
    private String companyNm;
    @Basic(optional = false)
    @Column(name = "ADDR_LN_1")
    private String addrLn1;
    @Basic(optional = false)
    @Column(name = "CITY_NM")
    private String cityNm;
    @Basic(optional = false)
    @Column(name = "ST_NM")
    private String stNm;
    @Basic(optional = false)
    @Column(name = "ZIP_CD")
    private String zipCd;
    @Basic(optional = false)
    @Column(name = "PHONE_NBR")
    private String phoneNbr;
    @Basic(optional = false)
    @Column(name = "FAX_NBR")
    private String faxNbr;
    @Basic(optional = false)
    @Column(name = "EMAIL_ID")
    private String emailId;
    @Basic(optional = false)
    @Column(name = "RSN_CD")
    private int rsnCd;
    @Basic(optional = false)
    @Column(name = "PBAM_CMNT")
    private String pbamCmnt;
    @Basic(optional = false)
    @Column(name = "MC_CNTCT_DT")
    @Temporal(TemporalType.DATE)
    private Date mcCntctDt;
    @Basic(optional = false)
    @Column(name = "MC_CNTCT_CMNT")
    private String mcCntctCmnt;
    @Basic(optional = false)
    @Column(name = "CRD_HLDR_FLG")
    private Character crdHldrFlg;
    @Basic(optional = false)
    @Column(name = "ITM_NOT_RECV_CMNT")
    private String itmNotRecvCmnt;
    @Basic(optional = false)
    @Column(name = "LST_EXPECTED_DT")
    @Temporal(TemporalType.DATE)
    private Date lstExpectedDt;

    @Basic(optional = false)
    @Column(name = "ACTUAL_TRANS_AMT")
    private BigDecimal actualTransAmt;
    @Basic(optional = false)
    @Column(name = "CREDIT_ISSUE_EXPECTED_DT")
    @Temporal(TemporalType.DATE)
    private Date creditIssueExpectedDt;
    @Basic(optional = false)
    @Column(name = "CANCELLATION_NBR")
    private String cancellationNbr;
    @Basic(optional = false)
    @Column(name = "FACE_TO_FACE_FLG")
    private Character faceToFaceFlg;
    @Basic(optional = false)
    @Column(name = "DAMAGE_CMNT")
    private String damageCmnt;
    @Basic(optional = false)
    @Column(name = "ATMPT_TO_RSLV_CMNT")
    private String atmptToRslvCmnt;
    @Basic(optional = false)
    @Column(name = "ATMPT_TO_RTRN_CMNT")
    private String atmptToRtrnCmnt;
    @Basic(optional = false)
    @Column(name = "LOST_STOLEN_FLG")
    private Character lostStolenFlg;
    @Basic(optional = false)
    @Column(name = "MY_POSSESSION_FLG")
    private Character myPossessionFlg;
    @Basic(optional = false)
    @Column(name = "EMPLOYEE_MISUSED_FLG")
    private Character employeeMisusedFlg;
    @Basic(optional = false)
    @Column(name = "CARD_STOLEN_DT")
    @Temporal(TemporalType.DATE)
    private Date cardStolenDt;
    @Basic(optional = false)
    @Column(name = "LAST_PARTICIPATION_DT")
    @Temporal(TemporalType.DATE)
    private Date lastParticipationDt;
    @Basic(optional = false)
    @Column(name = "POLICE_NOTIFIED_FLG")
    private Character policeNotifiedFlg;
    @Basic(optional = false)
    @Column(name = "POLICE_NOTIFIED_DT")
    @Temporal(TemporalType.DATE)
    private Date policeNotifiedDt;
    @Basic(optional = false)
    @Column(name = "CIRCUMSTANCES_CMNT")
    private String circumstancesCmnt;
    @Basic(optional = false)
    @Column(name = "STOLEN_PERSON_DTL_CMNT")
    private String stolenPersonDtlCmnt;
    @Basic(optional = false)
    @Column(name = "CARD_USAGE_BY_ME_FLG")
    private Character cardUsageByMeFlg;
    @Basic(optional = false)
    @Column(name = "CARD_HOLDER_TYPE_CD")
    private String cardHolderTypeCd;
    @Basic(optional = false)
    @Column(name = "EMP_TERMINATION_FLG")
    private Character empTerminationFlg;
    @Basic(optional = false)
    @Column(name = "EMP_TERMINATION_DT")
    @Temporal(TemporalType.DATE)
    private Date empTerminationDt;
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

    public DsptTransSum() {
    }

    public DsptTransSum(String dsptId) {
        this.dsptId = dsptId;
    }

    public DsptTransSum(String dsptId, String acctNbr, String custId, String userId, String companyNm, String addrLn1, String cityNm, String stNm, String zipCd, String phoneNbr, String faxNbr, String emailId, int rsnCd, String pbamCmnt, Date mcCntctDt, String mcCntctCmnt, Character crdHldrFlg, String itmNotRecvCmnt, Date lstExpectedDt, BigDecimal actualTransAmt, Date creditIssueExpectedDt, String cancellationNbr, Character faceToFaceFlg, String damageCmnt, String atmptToRslvCmnt, String atmptToRtrnCmnt, Character lostStolenFlg, Character myPossessionFlg, Character employeeMisusedFlg, Date cardStolenDt, Date lastParticipationDt, Character policeNotifiedFlg, Date policeNotifiedDt, String circumstancesCmnt, String stolenPersonDtlCmnt, Character cardUsageByMeFlg, String cardHolderTypeCd, Character empTerminationFlg, Date empTerminationDt, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.dsptId = dsptId;
        this.acctNbr = acctNbr;
        this.custId = custId;
        this.userId = userId;
        this.companyNm = companyNm;
        this.addrLn1 = addrLn1;
        this.cityNm = cityNm;
        this.stNm = stNm;
        this.zipCd = zipCd;
        this.phoneNbr = phoneNbr;
        this.faxNbr = faxNbr;
        this.emailId = emailId;
        this.rsnCd = rsnCd;
        this.pbamCmnt = pbamCmnt;
        this.mcCntctDt = mcCntctDt;
        this.mcCntctCmnt = mcCntctCmnt;
        this.crdHldrFlg = crdHldrFlg;
        this.itmNotRecvCmnt = itmNotRecvCmnt;
        this.lstExpectedDt = lstExpectedDt;
        this.actualTransAmt = actualTransAmt;
        this.creditIssueExpectedDt = creditIssueExpectedDt;
        this.cancellationNbr = cancellationNbr;
        this.faceToFaceFlg = faceToFaceFlg;
        this.damageCmnt = damageCmnt;
        this.atmptToRslvCmnt = atmptToRslvCmnt;
        this.atmptToRtrnCmnt = atmptToRtrnCmnt;
        this.lostStolenFlg = lostStolenFlg;
        this.myPossessionFlg = myPossessionFlg;
        this.employeeMisusedFlg = employeeMisusedFlg;
        this.cardStolenDt = cardStolenDt;
        this.lastParticipationDt = lastParticipationDt;
        this.policeNotifiedFlg = policeNotifiedFlg;
        this.policeNotifiedDt = policeNotifiedDt;
        this.circumstancesCmnt = circumstancesCmnt;
        this.stolenPersonDtlCmnt = stolenPersonDtlCmnt;
        this.cardUsageByMeFlg = cardUsageByMeFlg;
        this.cardHolderTypeCd = cardHolderTypeCd;
        this.empTerminationFlg = empTerminationFlg;
        this.empTerminationDt = empTerminationDt;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public String getDsptId() {
        return dsptId;
    }

    public void setDsptId(String dsptId) {
        this.dsptId = dsptId;
    }

    public String getAcctNbr() {
        return acctNbr;
    }

    public void setAcctNbr(String acctNbr) {
        this.acctNbr = acctNbr;
    }

    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getCompanyNm() {
        return companyNm;
    }

    public void setCompanyNm(String companyNm) {
        this.companyNm = companyNm;
    }

    public String getAddrLn1() {
        return addrLn1;
    }

    public void setAddrLn1(String addrLn1) {
        this.addrLn1 = addrLn1;
    }

    public String getCityNm() {
        return cityNm;
    }

    public void setCityNm(String cityNm) {
        this.cityNm = cityNm;
    }

    public String getStNm() {
        return stNm;
    }

    public void setStNm(String stNm) {
        this.stNm = stNm;
    }

    public String getZipCd() {
        return zipCd;
    }

    public void setZipCd(String zipCd) {
        this.zipCd = zipCd;
    }

    public String getPhoneNbr() {
        return phoneNbr;
    }

    public void setPhoneNbr(String phoneNbr) {
        this.phoneNbr = phoneNbr;
    }

    public String getFaxNbr() {
        return faxNbr;
    }

    public void setFaxNbr(String faxNbr) {
        this.faxNbr = faxNbr;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public int getRsnCd() {
        return rsnCd;
    }

    public void setRsnCd(int rsnCd) {
        this.rsnCd = rsnCd;
    }

    public String getPbamCmnt() {
        return pbamCmnt;
    }

    public void setPbamCmnt(String pbamCmnt) {
        this.pbamCmnt = pbamCmnt;
    }

    public Date getMcCntctDt() {
        return mcCntctDt;
    }

    public void setMcCntctDt(Date mcCntctDt) {
        this.mcCntctDt = mcCntctDt;
    }

    public String getMcCntctCmnt() {
        return mcCntctCmnt;
    }

    public void setMcCntctCmnt(String mcCntctCmnt) {
        this.mcCntctCmnt = mcCntctCmnt;
    }

    public Character getCrdHldrFlg() {
        return crdHldrFlg;
    }

    public void setCrdHldrFlg(Character crdHldrFlg) {
        this.crdHldrFlg = crdHldrFlg;
    }

    public String getItmNotRecvCmnt() {
        return itmNotRecvCmnt;
    }

    public void setItmNotRecvCmnt(String itmNotRecvCmnt) {
        this.itmNotRecvCmnt = itmNotRecvCmnt;
    }

    public Date getLstExpectedDt() {
        return lstExpectedDt;
    }

    public void setLstExpectedDt(Date lstExpectedDt) {
        this.lstExpectedDt = lstExpectedDt;
    }

    public BigDecimal getActualTransAmt() {
        return actualTransAmt;
    }

    public void setActualTransAmt(BigDecimal actualTransAmt) {
        this.actualTransAmt = actualTransAmt;
    }

    public Date getCreditIssueExpectedDt() {
        return creditIssueExpectedDt;
    }

    public void setCreditIssueExpectedDt(Date creditIssueExpectedDt) {
        this.creditIssueExpectedDt = creditIssueExpectedDt;
    }

    public String getCancellationNbr() {
        return cancellationNbr;
    }

    public void setCancellationNbr(String cancellationNbr) {
        this.cancellationNbr = cancellationNbr;
    }

    public Character getFaceToFaceFlg() {
        return faceToFaceFlg;
    }

    public void setFaceToFaceFlg(Character faceToFaceFlg) {
        this.faceToFaceFlg = faceToFaceFlg;
    }

    public String getDamageCmnt() {
        return damageCmnt;
    }

    public void setDamageCmnt(String damageCmnt) {
        this.damageCmnt = damageCmnt;
    }

    public String getAtmptToRslvCmnt() {
        return atmptToRslvCmnt;
    }

    public void setAtmptToRslvCmnt(String atmptToRslvCmnt) {
        this.atmptToRslvCmnt = atmptToRslvCmnt;
    }

    public String getAtmptToRtrnCmnt() {
        return atmptToRtrnCmnt;
    }

    public void setAtmptToRtrnCmnt(String atmptToRtrnCmnt) {
        this.atmptToRtrnCmnt = atmptToRtrnCmnt;
    }

    public Character getLostStolenFlg() {
        return lostStolenFlg;
    }

    public void setLostStolenFlg(Character lostStolenFlg) {
        this.lostStolenFlg = lostStolenFlg;
    }

    public Character getMyPossessionFlg() {
        return myPossessionFlg;
    }

    public void setMyPossessionFlg(Character myPossessionFlg) {
        this.myPossessionFlg = myPossessionFlg;
    }

    public Character getEmployeeMisusedFlg() {
        return employeeMisusedFlg;
    }

    public void setEmployeeMisusedFlg(Character employeeMisusedFlg) {
        this.employeeMisusedFlg = employeeMisusedFlg;
    }

    public Date getCardStolenDt() {
        return cardStolenDt;
    }

    public void setCardStolenDt(Date cardStolenDt) {
        this.cardStolenDt = cardStolenDt;
    }

    public Date getLastParticipationDt() {
        return lastParticipationDt;
    }

    public void setLastParticipationDt(Date lastParticipationDt) {
        this.lastParticipationDt = lastParticipationDt;
    }

    public Character getPoliceNotifiedFlg() {
        return policeNotifiedFlg;
    }

    public void setPoliceNotifiedFlg(Character policeNotifiedFlg) {
        this.policeNotifiedFlg = policeNotifiedFlg;
    }

    public Date getPoliceNotifiedDt() {
        return policeNotifiedDt;
    }

    public void setPoliceNotifiedDt(Date policeNotifiedDt) {
        this.policeNotifiedDt = policeNotifiedDt;
    }

    public String getCircumstancesCmnt() {
        return circumstancesCmnt;
    }

    public void setCircumstancesCmnt(String circumstancesCmnt) {
        this.circumstancesCmnt = circumstancesCmnt;
    }

    public String getStolenPersonDtlCmnt() {
        return stolenPersonDtlCmnt;
    }

    public void setStolenPersonDtlCmnt(String stolenPersonDtlCmnt) {
        this.stolenPersonDtlCmnt = stolenPersonDtlCmnt;
    }

    public Character getCardUsageByMeFlg() {
        return cardUsageByMeFlg;
    }

    public void setCardUsageByMeFlg(Character cardUsageByMeFlg) {
        this.cardUsageByMeFlg = cardUsageByMeFlg;
    }

    public String getCardHolderTypeCd() {
        return cardHolderTypeCd;
    }

    public void setCardHolderTypeCd(String cardHolderTypeCd) {
        this.cardHolderTypeCd = cardHolderTypeCd;
    }

    public Character getEmpTerminationFlg() {
        return empTerminationFlg;
    }

    public void setEmpTerminationFlg(Character empTerminationFlg) {
        this.empTerminationFlg = empTerminationFlg;
    }

    public Date getEmpTerminationDt() {
        return empTerminationDt;
    }

    public void setEmpTerminationDt(Date empTerminationDt) {
        this.empTerminationDt = empTerminationDt;
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
        hash += (dsptId != null ? dsptId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof DsptTransSum)) {
            return false;
        }
        DsptTransSum other = (DsptTransSum) object;
        if ((this.dsptId == null && other.dsptId != null) || (this.dsptId != null && !this.dsptId.equals(other.dsptId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.DsptTransSum[ dsptId=" + dsptId + " ]";
    }

}
