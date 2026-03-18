package com.corpay.dao.cxxcow;

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
@Table(name = "USERS", catalog = "", schema = "CXXCOW")
public class Users implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "USER_ID")
    private String userId;
    @Basic(optional = false)
    @Column(name = "DPT_ID")
    private String dptId;
    @Basic(optional = false)
    @Column(name = "USER_FIRST_NAME")
    private String userFirstName;
    @Basic(optional = false)
    @Column(name = "USER_LAST_NAME")
    private String userLastName;
    @Basic(optional = false)
    @Column(name = "USER_UPT_USER")
    private String userUptUser;
    @Basic(optional = false)
    @Column(name = "USER_UPT_DTE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date userUptDte;
    @Basic(optional = false)
    @Column(name = "USER_PASSWORD_DTE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date userPasswordDte;
    @Basic(optional = false)
    @Column(name = "USER_STATUS_FLAG")
    private Character userStatusFlag;
    @Basic(optional = false)
    @Column(name = "USER_PASSWORD")
    private String userPassword;
    @Basic(optional = false)
    @Column(name = "USER_RACF_ID")
    private String userRacfId;
    @Basic(optional = false)
    @Column(name = "USER_ACCESS_DTE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date userAccessDte;
    @Basic(optional = false)
    @Column(name = "USER_ACCESS_USR")
    private String userAccessUsr;
    @Basic(optional = false)
    @Column(name = "USER_EXTRL_CUST_FG")
    private Character userExtrlCustFg;
    @Basic(optional = false)
    @Column(name = "USER_NBR_LOGINS")
    private short userNbrLogins;
    @Basic(optional = false)
    @Column(name = "USER_PW_EXP_FLG")
    private Character userPwExpFlg;
    @Basic(optional = false)
    @Column(name = "USER_EXP_FLG")
    private Character userExpFlg;
    @Basic(optional = false)
    @Column(name = "USER_EXPIRE_DTE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date userExpireDte;
    @Basic(optional = false)
    @Column(name = "USER_DFLT_CUST_ID")
    private String userDfltCustId;
    @Basic(optional = false)
    @Column(name = "USER_MIDL_INITIAL")
    private Character userMidlInitial;
    @Basic(optional = false)
    @Column(name = "QUESTION_ID")
    private int questionId;
    @Basic(optional = false)
    @Column(name = "USER_ANSWER")
    private String userAnswer;
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
    @Column(name = "CUST_ID_SORT")
    private Character custIdSort;
    @Basic(optional = false)
    @Column(name = "ACCT_CD_SORT")
    private Character acctCdSort;
    @Basic(optional = false)
    @Column(name = "PSWD")
    private String pswd;
    @Basic(optional = false)
    @Column(name = "HIER_ID")
    private String hierId;
    @Basic(optional = false)
    @Column(name = "SCY_TYP_CD")
    private Character scyTypCd;
    @Basic(optional = false)
    @Column(name = "NAV_TYP_CD")
    private Character navTypCd;
    @Basic(optional = false)
    @Column(name = "VEH_GRP_SCY_FLG")
    private Character vehGrpScyFlg;
    @Basic(optional = false)
    @Column(name = "PRF_SCY_FLG")
    private Character prfScyFlg;
    @Basic(optional = false)
    @Column(name = "DRV_GRP_SCY_FLG")
    private Character drvGrpScyFlg;
    @Basic(optional = false)
    @Column(name = "DFLT_NODE_ID")
    private String dfltNodeId;
    @Basic(optional = false)
    @Column(name = "WS_USR_FLG")
    private Character wsUsrFlg;
    @Basic(optional = false)
    @Column(name = "LOCALE_PREF")
    private String localePref;
    @Basic(optional = false)
    @Column(name = "BIRSTONELOOKUSERNAME")
    private String birstonelookusername;
    @Basic(optional = false)
    @Column(name = "OKTA_MFA_MIGR_TEXT")
    private String oktaMfaMigrText;
    @Column(name = "IAM_ID")
    private String iamId;
    @Column(name = "USER_HARD_DEL_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date userHardDelTs;
    @Basic(optional = false)
    @Column(name = "ALLOW_COPY_DEL_FLG")
    private Character allowCopyDelFlg;
    @Basic(optional = false)
    @Column(name = "EMP_ID")
    private String empId;
    @Column(name = "PERMISSION_TYPE")
    private Character permissionType;
    @Column(name = "USER_TYPE")
    private Character userType;

    public Users() {
    }

    public Users(String userId) {
        this.userId = userId;
    }

    public Users(String userId, String dptId, String userFirstName, String userLastName, String userUptUser, Date userUptDte, Date userPasswordDte, Character userStatusFlag, String userPassword, String userRacfId, Date userAccessDte, String userAccessUsr, Character userExtrlCustFg, short userNbrLogins, Character userPwExpFlg, Character userExpFlg, Date userExpireDte, String userDfltCustId, Character userMidlInitial, int questionId, String userAnswer, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr, Character custIdSort, Character acctCdSort, String pswd, String hierId, Character scyTypCd, Character navTypCd, Character vehGrpScyFlg, Character prfScyFlg, Character drvGrpScyFlg, String dfltNodeId, Character wsUsrFlg, String localePref, String birstonelookusername, String oktaMfaMigrText, Character allowCopyDelFlg, String empId) {
        this.userId = userId;
        this.dptId = dptId;
        this.userFirstName = userFirstName;
        this.userLastName = userLastName;
        this.userUptUser = userUptUser;
        this.userUptDte = userUptDte;
        this.userPasswordDte = userPasswordDte;
        this.userStatusFlag = userStatusFlag;
        this.userPassword = userPassword;
        this.userRacfId = userRacfId;
        this.userAccessDte = userAccessDte;
        this.userAccessUsr = userAccessUsr;
        this.userExtrlCustFg = userExtrlCustFg;
        this.userNbrLogins = userNbrLogins;
        this.userPwExpFlg = userPwExpFlg;
        this.userExpFlg = userExpFlg;
        this.userExpireDte = userExpireDte;
        this.userDfltCustId = userDfltCustId;
        this.userMidlInitial = userMidlInitial;
        this.questionId = questionId;
        this.userAnswer = userAnswer;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
        this.custIdSort = custIdSort;
        this.acctCdSort = acctCdSort;
        this.pswd = pswd;
        this.hierId = hierId;
        this.scyTypCd = scyTypCd;
        this.navTypCd = navTypCd;
        this.vehGrpScyFlg = vehGrpScyFlg;
        this.prfScyFlg = prfScyFlg;
        this.drvGrpScyFlg = drvGrpScyFlg;
        this.dfltNodeId = dfltNodeId;
        this.wsUsrFlg = wsUsrFlg;
        this.localePref = localePref;
        this.birstonelookusername = birstonelookusername;
        this.oktaMfaMigrText = oktaMfaMigrText;
        this.allowCopyDelFlg = allowCopyDelFlg;
        this.empId = empId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getDptId() {
        return dptId;
    }

    public void setDptId(String dptId) {
        this.dptId = dptId;
    }

    public String getUserFirstName() {
        return userFirstName;
    }

    public void setUserFirstName(String userFirstName) {
        this.userFirstName = userFirstName;
    }

    public String getUserLastName() {
        return userLastName;
    }

    public void setUserLastName(String userLastName) {
        this.userLastName = userLastName;
    }

    public String getUserUptUser() {
        return userUptUser;
    }

    public void setUserUptUser(String userUptUser) {
        this.userUptUser = userUptUser;
    }

    public Date getUserUptDte() {
        return userUptDte;
    }

    public void setUserUptDte(Date userUptDte) {
        this.userUptDte = userUptDte;
    }

    public Date getUserPasswordDte() {
        return userPasswordDte;
    }

    public void setUserPasswordDte(Date userPasswordDte) {
        this.userPasswordDte = userPasswordDte;
    }

    public Character getUserStatusFlag() {
        return userStatusFlag;
    }

    public void setUserStatusFlag(Character userStatusFlag) {
        this.userStatusFlag = userStatusFlag;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserRacfId() {
        return userRacfId;
    }

    public void setUserRacfId(String userRacfId) {
        this.userRacfId = userRacfId;
    }

    public Date getUserAccessDte() {
        return userAccessDte;
    }

    public void setUserAccessDte(Date userAccessDte) {
        this.userAccessDte = userAccessDte;
    }

    public String getUserAccessUsr() {
        return userAccessUsr;
    }

    public void setUserAccessUsr(String userAccessUsr) {
        this.userAccessUsr = userAccessUsr;
    }

    public Character getUserExtrlCustFg() {
        return userExtrlCustFg;
    }

    public void setUserExtrlCustFg(Character userExtrlCustFg) {
        this.userExtrlCustFg = userExtrlCustFg;
    }

    public short getUserNbrLogins() {
        return userNbrLogins;
    }

    public void setUserNbrLogins(short userNbrLogins) {
        this.userNbrLogins = userNbrLogins;
    }

    public Character getUserPwExpFlg() {
        return userPwExpFlg;
    }

    public void setUserPwExpFlg(Character userPwExpFlg) {
        this.userPwExpFlg = userPwExpFlg;
    }

    public Character getUserExpFlg() {
        return userExpFlg;
    }

    public void setUserExpFlg(Character userExpFlg) {
        this.userExpFlg = userExpFlg;
    }

    public Date getUserExpireDte() {
        return userExpireDte;
    }

    public void setUserExpireDte(Date userExpireDte) {
        this.userExpireDte = userExpireDte;
    }

    public String getUserDfltCustId() {
        return userDfltCustId;
    }

    public void setUserDfltCustId(String userDfltCustId) {
        this.userDfltCustId = userDfltCustId;
    }

    public Character getUserMidlInitial() {
        return userMidlInitial;
    }

    public void setUserMidlInitial(Character userMidlInitial) {
        this.userMidlInitial = userMidlInitial;
    }

    public int getQuestionId() {
        return questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public String getUserAnswer() {
        return userAnswer;
    }

    public void setUserAnswer(String userAnswer) {
        this.userAnswer = userAnswer;
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

    public Character getCustIdSort() {
        return custIdSort;
    }

    public void setCustIdSort(Character custIdSort) {
        this.custIdSort = custIdSort;
    }

    public Character getAcctCdSort() {
        return acctCdSort;
    }

    public void setAcctCdSort(Character acctCdSort) {
        this.acctCdSort = acctCdSort;
    }

    public String getPswd() {
        return pswd;
    }

    public void setPswd(String pswd) {
        this.pswd = pswd;
    }

    public String getHierId() {
        return hierId;
    }

    public void setHierId(String hierId) {
        this.hierId = hierId;
    }

    public Character getScyTypCd() {
        return scyTypCd;
    }

    public void setScyTypCd(Character scyTypCd) {
        this.scyTypCd = scyTypCd;
    }

    public Character getNavTypCd() {
        return navTypCd;
    }

    public void setNavTypCd(Character navTypCd) {
        this.navTypCd = navTypCd;
    }

    public Character getVehGrpScyFlg() {
        return vehGrpScyFlg;
    }

    public void setVehGrpScyFlg(Character vehGrpScyFlg) {
        this.vehGrpScyFlg = vehGrpScyFlg;
    }

    public Character getPrfScyFlg() {
        return prfScyFlg;
    }

    public void setPrfScyFlg(Character prfScyFlg) {
        this.prfScyFlg = prfScyFlg;
    }

    public Character getDrvGrpScyFlg() {
        return drvGrpScyFlg;
    }

    public void setDrvGrpScyFlg(Character drvGrpScyFlg) {
        this.drvGrpScyFlg = drvGrpScyFlg;
    }

    public String getDfltNodeId() {
        return dfltNodeId;
    }

    public void setDfltNodeId(String dfltNodeId) {
        this.dfltNodeId = dfltNodeId;
    }

    public Character getWsUsrFlg() {
        return wsUsrFlg;
    }

    public void setWsUsrFlg(Character wsUsrFlg) {
        this.wsUsrFlg = wsUsrFlg;
    }

    public String getLocalePref() {
        return localePref;
    }

    public void setLocalePref(String localePref) {
        this.localePref = localePref;
    }

    public String getBirstonelookusername() {
        return birstonelookusername;
    }

    public void setBirstonelookusername(String birstonelookusername) {
        this.birstonelookusername = birstonelookusername;
    }

    public String getOktaMfaMigrText() {
        return oktaMfaMigrText;
    }

    public void setOktaMfaMigrText(String oktaMfaMigrText) {
        this.oktaMfaMigrText = oktaMfaMigrText;
    }

    public String getIamId() {
        return iamId;
    }

    public void setIamId(String iamId) {
        this.iamId = iamId;
    }

    public Date getUserHardDelTs() {
        return userHardDelTs;
    }

    public void setUserHardDelTs(Date userHardDelTs) {
        this.userHardDelTs = userHardDelTs;
    }

    public Character getAllowCopyDelFlg() {
        return allowCopyDelFlg;
    }

    public void setAllowCopyDelFlg(Character allowCopyDelFlg) {
        this.allowCopyDelFlg = allowCopyDelFlg;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public Character getPermissionType() {
        return permissionType;
    }

    public void setPermissionType(Character permissionType) {
        this.permissionType = permissionType;
    }

    public Character getUserType() {
        return userType;
    }

    public void setUserType(Character userType) {
        this.userType = userType;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (userId != null ? userId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof Users)) {
            return false;
        }
        Users other = (Users) object;
        if ((this.userId == null && other.userId != null) || (this.userId != null && !this.userId.equals(other.userId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.cxxcow.Users[ userId=" + userId + " ]";
    }

}
