package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "IAM_GEAC_USERS", catalog = "", schema = "DBO")
public class IamGeacUsers implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected IamGeacUsersPK iamGeacUsersPK;
    @Basic(optional = false)
    @Column(name = "USR_NM")
    private String usrNm;
    @Basic(optional = false)
    @Column(name = "USR_STAT_FLG")
    private Character usrStatFlg;
    @Basic(optional = false)
    @Column(name = "ROLE_NM")
    private String roleNm;
    @Basic(optional = false)
    @Column(name = "AR_CO_RNG_01_BEG")
    private String arCoRng01Beg;
    @Basic(optional = false)
    @Column(name = "AR_CO_RNG_01_END")
    private String arCoRng01End;
    @Basic(optional = false)
    @Column(name = "AR_CO_RNG_02_BEG")
    private String arCoRng02Beg;
    @Basic(optional = false)
    @Column(name = "AR_CO_RNG_02_END")
    private String arCoRng02End;
    @Basic(optional = false)
    @Column(name = "AR_CO_RNG_03_BEG")
    private String arCoRng03Beg;
    @Basic(optional = false)
    @Column(name = "AR_CO_RNG_03_END")
    private String arCoRng03End;
    @Basic(optional = false)
    @Column(name = "AR_CO_RNG_04_BEG")
    private String arCoRng04Beg;
    @Basic(optional = false)
    @Column(name = "AR_CO_RNG_04_END")
    private String arCoRng04End;
    @Basic(optional = false)
    @Column(name = "AR_CO_RNG_05_BEG")
    private String arCoRng05Beg;
    @Basic(optional = false)
    @Column(name = "AR_CO_RNG_05_END")
    private String arCoRng05End;
    @Basic(optional = false)
    @Column(name = "AR_CO_RNG_06_BEG")
    private String arCoRng06Beg;
    @Basic(optional = false)
    @Column(name = "AR_CO_RNG_06_END")
    private String arCoRng06End;
    @Basic(optional = false)
    @Column(name = "AR_CO_RNG_07_BEG")
    private String arCoRng07Beg;
    @Basic(optional = false)
    @Column(name = "AR_CO_RNG_07_END")
    private String arCoRng07End;
    @Basic(optional = false)
    @Column(name = "AR_CO_RNG_08_BEG")
    private String arCoRng08Beg;
    @Basic(optional = false)
    @Column(name = "AR_CO_RNG_08_END")
    private String arCoRng08End;
    @Basic(optional = false)
    @Column(name = "AR_CO_RNG_09_BEG")
    private String arCoRng09Beg;
    @Basic(optional = false)
    @Column(name = "AR_CO_RNG_09_END")
    private String arCoRng09End;
    @Basic(optional = false)
    @Column(name = "AR_CO_RNG_10_BEG")
    private String arCoRng10Beg;
    @Basic(optional = false)
    @Column(name = "AR_CO_RNG_10_END")
    private String arCoRng10End;
    @Basic(optional = false)
    @Column(name = "AR_CO_RNG_11_BEG")
    private String arCoRng11Beg;
    @Basic(optional = false)
    @Column(name = "AR_CO_RNG_11_END")
    private String arCoRng11End;
    @Basic(optional = false)
    @Column(name = "AR_CO_RNG_12_BEG")
    private String arCoRng12Beg;
    @Basic(optional = false)
    @Column(name = "AR_CO_RNG_12_END")
    private String arCoRng12End;
    @Basic(optional = false)
    @Column(name = "AR_CO_RNG_13_BEG")
    private String arCoRng13Beg;
    @Basic(optional = false)
    @Column(name = "AR_CO_RNG_13_END")
    private String arCoRng13End;
    @Basic(optional = false)
    @Column(name = "AR_CO_RNG_14_BEG")
    private String arCoRng14Beg;
    @Basic(optional = false)
    @Column(name = "AR_CO_RNG_14_END")
    private String arCoRng14End;
    @Basic(optional = false)
    @Column(name = "AR_CO_RNG_15_BEG")
    private String arCoRng15Beg;
    @Basic(optional = false)
    @Column(name = "AR_CO_RNG_15_END")
    private String arCoRng15End;
    @Basic(optional = false)
    @Column(name = "AR_CO_RNG_16_BEG")
    private String arCoRng16Beg;
    @Basic(optional = false)
    @Column(name = "AR_CO_RNG_16_END")
    private String arCoRng16End;
    @Basic(optional = false)
    @Column(name = "AR_CO_RNG_17_BEG")
    private String arCoRng17Beg;
    @Basic(optional = false)
    @Column(name = "AR_CO_RNG_17_END")
    private String arCoRng17End;
    @Basic(optional = false)
    @Column(name = "AR_CO_RNG_18_BEG")
    private String arCoRng18Beg;
    @Basic(optional = false)
    @Column(name = "AR_CO_RNG_18_END")
    private String arCoRng18End;
    @Basic(optional = false)
    @Column(name = "AR_CO_RNG_19_BEG")
    private String arCoRng19Beg;
    @Basic(optional = false)
    @Column(name = "AR_CO_RNG_19_END")
    private String arCoRng19End;
    @Basic(optional = false)
    @Column(name = "AR_CO_RNG_20_BEG")
    private String arCoRng20Beg;
    @Basic(optional = false)
    @Column(name = "AR_CO_RNG_20_END")
    private String arCoRng20End;
    @Basic(optional = false)
    @Column(name = "AR_CO_RNG_21_BEG")
    private String arCoRng21Beg;
    @Basic(optional = false)
    @Column(name = "AR_CO_RNG_21_END")
    private String arCoRng21End;
    @Basic(optional = false)
    @Column(name = "AR_CO_RNG_22_BEG")
    private String arCoRng22Beg;
    @Basic(optional = false)
    @Column(name = "AR_CO_RNG_22_END")
    private String arCoRng22End;
    @Basic(optional = false)
    @Column(name = "AR_CO_RNG_23_BEG")
    private String arCoRng23Beg;
    @Basic(optional = false)
    @Column(name = "AR_CO_RNG_23_END")
    private String arCoRng23End;
    @Basic(optional = false)
    @Column(name = "AR_CO_RNG_24_BEG")
    private String arCoRng24Beg;
    @Basic(optional = false)
    @Column(name = "AR_CO_RNG_24_END")
    private String arCoRng24End;
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
    @Column(name = "ROLE_CD_NM")
    private String roleCdNm;

    public IamGeacUsers() {
    }

    public IamGeacUsers(IamGeacUsersPK iamGeacUsersPK) {
        this.iamGeacUsersPK = iamGeacUsersPK;
    }

    public IamGeacUsers(IamGeacUsersPK iamGeacUsersPK, String usrNm, Character usrStatFlg, String roleNm, String arCoRng01Beg, String arCoRng01End, String arCoRng02Beg, String arCoRng02End, String arCoRng03Beg, String arCoRng03End, String arCoRng04Beg, String arCoRng04End, String arCoRng05Beg, String arCoRng05End, String arCoRng06Beg, String arCoRng06End, String arCoRng07Beg, String arCoRng07End, String arCoRng08Beg, String arCoRng08End, String arCoRng09Beg, String arCoRng09End, String arCoRng10Beg, String arCoRng10End, String arCoRng11Beg, String arCoRng11End, String arCoRng12Beg, String arCoRng12End, String arCoRng13Beg, String arCoRng13End, String arCoRng14Beg, String arCoRng14End, String arCoRng15Beg, String arCoRng15End, String arCoRng16Beg, String arCoRng16End, String arCoRng17Beg, String arCoRng17End, String arCoRng18Beg, String arCoRng18End, String arCoRng19Beg, String arCoRng19End, String arCoRng20Beg, String arCoRng20End, String arCoRng21Beg, String arCoRng21End, String arCoRng22Beg, String arCoRng22End, String arCoRng23Beg, String arCoRng23End, String arCoRng24Beg, String arCoRng24End, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr, String roleCdNm) {
        this.iamGeacUsersPK = iamGeacUsersPK;
        this.usrNm = usrNm;
        this.usrStatFlg = usrStatFlg;
        this.roleNm = roleNm;
        this.arCoRng01Beg = arCoRng01Beg;
        this.arCoRng01End = arCoRng01End;
        this.arCoRng02Beg = arCoRng02Beg;
        this.arCoRng02End = arCoRng02End;
        this.arCoRng03Beg = arCoRng03Beg;
        this.arCoRng03End = arCoRng03End;
        this.arCoRng04Beg = arCoRng04Beg;
        this.arCoRng04End = arCoRng04End;
        this.arCoRng05Beg = arCoRng05Beg;
        this.arCoRng05End = arCoRng05End;
        this.arCoRng06Beg = arCoRng06Beg;
        this.arCoRng06End = arCoRng06End;
        this.arCoRng07Beg = arCoRng07Beg;
        this.arCoRng07End = arCoRng07End;
        this.arCoRng08Beg = arCoRng08Beg;
        this.arCoRng08End = arCoRng08End;
        this.arCoRng09Beg = arCoRng09Beg;
        this.arCoRng09End = arCoRng09End;
        this.arCoRng10Beg = arCoRng10Beg;
        this.arCoRng10End = arCoRng10End;
        this.arCoRng11Beg = arCoRng11Beg;
        this.arCoRng11End = arCoRng11End;
        this.arCoRng12Beg = arCoRng12Beg;
        this.arCoRng12End = arCoRng12End;
        this.arCoRng13Beg = arCoRng13Beg;
        this.arCoRng13End = arCoRng13End;
        this.arCoRng14Beg = arCoRng14Beg;
        this.arCoRng14End = arCoRng14End;
        this.arCoRng15Beg = arCoRng15Beg;
        this.arCoRng15End = arCoRng15End;
        this.arCoRng16Beg = arCoRng16Beg;
        this.arCoRng16End = arCoRng16End;
        this.arCoRng17Beg = arCoRng17Beg;
        this.arCoRng17End = arCoRng17End;
        this.arCoRng18Beg = arCoRng18Beg;
        this.arCoRng18End = arCoRng18End;
        this.arCoRng19Beg = arCoRng19Beg;
        this.arCoRng19End = arCoRng19End;
        this.arCoRng20Beg = arCoRng20Beg;
        this.arCoRng20End = arCoRng20End;
        this.arCoRng21Beg = arCoRng21Beg;
        this.arCoRng21End = arCoRng21End;
        this.arCoRng22Beg = arCoRng22Beg;
        this.arCoRng22End = arCoRng22End;
        this.arCoRng23Beg = arCoRng23Beg;
        this.arCoRng23End = arCoRng23End;
        this.arCoRng24Beg = arCoRng24Beg;
        this.arCoRng24End = arCoRng24End;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
        this.roleCdNm = roleCdNm;
    }

    public IamGeacUsers(int usrId, String roleCd) {
        this.iamGeacUsersPK = new IamGeacUsersPK(usrId, roleCd);
    }

    public IamGeacUsersPK getIamGeacUsersPK() {
        return iamGeacUsersPK;
    }

    public void setIamGeacUsersPK(IamGeacUsersPK iamGeacUsersPK) {
        this.iamGeacUsersPK = iamGeacUsersPK;
    }

    public String getUsrNm() {
        return usrNm;
    }

    public void setUsrNm(String usrNm) {
        this.usrNm = usrNm;
    }

    public Character getUsrStatFlg() {
        return usrStatFlg;
    }

    public void setUsrStatFlg(Character usrStatFlg) {
        this.usrStatFlg = usrStatFlg;
    }

    public String getRoleNm() {
        return roleNm;
    }

    public void setRoleNm(String roleNm) {
        this.roleNm = roleNm;
    }

    public String getArCoRng01Beg() {
        return arCoRng01Beg;
    }

    public void setArCoRng01Beg(String arCoRng01Beg) {
        this.arCoRng01Beg = arCoRng01Beg;
    }

    public String getArCoRng01End() {
        return arCoRng01End;
    }

    public void setArCoRng01End(String arCoRng01End) {
        this.arCoRng01End = arCoRng01End;
    }

    public String getArCoRng02Beg() {
        return arCoRng02Beg;
    }

    public void setArCoRng02Beg(String arCoRng02Beg) {
        this.arCoRng02Beg = arCoRng02Beg;
    }

    public String getArCoRng02End() {
        return arCoRng02End;
    }

    public void setArCoRng02End(String arCoRng02End) {
        this.arCoRng02End = arCoRng02End;
    }

    public String getArCoRng03Beg() {
        return arCoRng03Beg;
    }

    public void setArCoRng03Beg(String arCoRng03Beg) {
        this.arCoRng03Beg = arCoRng03Beg;
    }

    public String getArCoRng03End() {
        return arCoRng03End;
    }

    public void setArCoRng03End(String arCoRng03End) {
        this.arCoRng03End = arCoRng03End;
    }

    public String getArCoRng04Beg() {
        return arCoRng04Beg;
    }

    public void setArCoRng04Beg(String arCoRng04Beg) {
        this.arCoRng04Beg = arCoRng04Beg;
    }

    public String getArCoRng04End() {
        return arCoRng04End;
    }

    public void setArCoRng04End(String arCoRng04End) {
        this.arCoRng04End = arCoRng04End;
    }

    public String getArCoRng05Beg() {
        return arCoRng05Beg;
    }

    public void setArCoRng05Beg(String arCoRng05Beg) {
        this.arCoRng05Beg = arCoRng05Beg;
    }

    public String getArCoRng05End() {
        return arCoRng05End;
    }

    public void setArCoRng05End(String arCoRng05End) {
        this.arCoRng05End = arCoRng05End;
    }

    public String getArCoRng06Beg() {
        return arCoRng06Beg;
    }

    public void setArCoRng06Beg(String arCoRng06Beg) {
        this.arCoRng06Beg = arCoRng06Beg;
    }

    public String getArCoRng06End() {
        return arCoRng06End;
    }

    public void setArCoRng06End(String arCoRng06End) {
        this.arCoRng06End = arCoRng06End;
    }

    public String getArCoRng07Beg() {
        return arCoRng07Beg;
    }

    public void setArCoRng07Beg(String arCoRng07Beg) {
        this.arCoRng07Beg = arCoRng07Beg;
    }

    public String getArCoRng07End() {
        return arCoRng07End;
    }

    public void setArCoRng07End(String arCoRng07End) {
        this.arCoRng07End = arCoRng07End;
    }

    public String getArCoRng08Beg() {
        return arCoRng08Beg;
    }

    public void setArCoRng08Beg(String arCoRng08Beg) {
        this.arCoRng08Beg = arCoRng08Beg;
    }

    public String getArCoRng08End() {
        return arCoRng08End;
    }

    public void setArCoRng08End(String arCoRng08End) {
        this.arCoRng08End = arCoRng08End;
    }

    public String getArCoRng09Beg() {
        return arCoRng09Beg;
    }

    public void setArCoRng09Beg(String arCoRng09Beg) {
        this.arCoRng09Beg = arCoRng09Beg;
    }

    public String getArCoRng09End() {
        return arCoRng09End;
    }

    public void setArCoRng09End(String arCoRng09End) {
        this.arCoRng09End = arCoRng09End;
    }

    public String getArCoRng10Beg() {
        return arCoRng10Beg;
    }

    public void setArCoRng10Beg(String arCoRng10Beg) {
        this.arCoRng10Beg = arCoRng10Beg;
    }

    public String getArCoRng10End() {
        return arCoRng10End;
    }

    public void setArCoRng10End(String arCoRng10End) {
        this.arCoRng10End = arCoRng10End;
    }

    public String getArCoRng11Beg() {
        return arCoRng11Beg;
    }

    public void setArCoRng11Beg(String arCoRng11Beg) {
        this.arCoRng11Beg = arCoRng11Beg;
    }

    public String getArCoRng11End() {
        return arCoRng11End;
    }

    public void setArCoRng11End(String arCoRng11End) {
        this.arCoRng11End = arCoRng11End;
    }

    public String getArCoRng12Beg() {
        return arCoRng12Beg;
    }

    public void setArCoRng12Beg(String arCoRng12Beg) {
        this.arCoRng12Beg = arCoRng12Beg;
    }

    public String getArCoRng12End() {
        return arCoRng12End;
    }

    public void setArCoRng12End(String arCoRng12End) {
        this.arCoRng12End = arCoRng12End;
    }

    public String getArCoRng13Beg() {
        return arCoRng13Beg;
    }

    public void setArCoRng13Beg(String arCoRng13Beg) {
        this.arCoRng13Beg = arCoRng13Beg;
    }

    public String getArCoRng13End() {
        return arCoRng13End;
    }

    public void setArCoRng13End(String arCoRng13End) {
        this.arCoRng13End = arCoRng13End;
    }

    public String getArCoRng14Beg() {
        return arCoRng14Beg;
    }

    public void setArCoRng14Beg(String arCoRng14Beg) {
        this.arCoRng14Beg = arCoRng14Beg;
    }

    public String getArCoRng14End() {
        return arCoRng14End;
    }

    public void setArCoRng14End(String arCoRng14End) {
        this.arCoRng14End = arCoRng14End;
    }

    public String getArCoRng15Beg() {
        return arCoRng15Beg;
    }

    public void setArCoRng15Beg(String arCoRng15Beg) {
        this.arCoRng15Beg = arCoRng15Beg;
    }

    public String getArCoRng15End() {
        return arCoRng15End;
    }

    public void setArCoRng15End(String arCoRng15End) {
        this.arCoRng15End = arCoRng15End;
    }

    public String getArCoRng16Beg() {
        return arCoRng16Beg;
    }

    public void setArCoRng16Beg(String arCoRng16Beg) {
        this.arCoRng16Beg = arCoRng16Beg;
    }

    public String getArCoRng16End() {
        return arCoRng16End;
    }

    public void setArCoRng16End(String arCoRng16End) {
        this.arCoRng16End = arCoRng16End;
    }

    public String getArCoRng17Beg() {
        return arCoRng17Beg;
    }

    public void setArCoRng17Beg(String arCoRng17Beg) {
        this.arCoRng17Beg = arCoRng17Beg;
    }

    public String getArCoRng17End() {
        return arCoRng17End;
    }

    public void setArCoRng17End(String arCoRng17End) {
        this.arCoRng17End = arCoRng17End;
    }

    public String getArCoRng18Beg() {
        return arCoRng18Beg;
    }

    public void setArCoRng18Beg(String arCoRng18Beg) {
        this.arCoRng18Beg = arCoRng18Beg;
    }

    public String getArCoRng18End() {
        return arCoRng18End;
    }

    public void setArCoRng18End(String arCoRng18End) {
        this.arCoRng18End = arCoRng18End;
    }

    public String getArCoRng19Beg() {
        return arCoRng19Beg;
    }

    public void setArCoRng19Beg(String arCoRng19Beg) {
        this.arCoRng19Beg = arCoRng19Beg;
    }

    public String getArCoRng19End() {
        return arCoRng19End;
    }

    public void setArCoRng19End(String arCoRng19End) {
        this.arCoRng19End = arCoRng19End;
    }

    public String getArCoRng20Beg() {
        return arCoRng20Beg;
    }

    public void setArCoRng20Beg(String arCoRng20Beg) {
        this.arCoRng20Beg = arCoRng20Beg;
    }

    public String getArCoRng20End() {
        return arCoRng20End;
    }

    public void setArCoRng20End(String arCoRng20End) {
        this.arCoRng20End = arCoRng20End;
    }

    public String getArCoRng21Beg() {
        return arCoRng21Beg;
    }

    public void setArCoRng21Beg(String arCoRng21Beg) {
        this.arCoRng21Beg = arCoRng21Beg;
    }

    public String getArCoRng21End() {
        return arCoRng21End;
    }

    public void setArCoRng21End(String arCoRng21End) {
        this.arCoRng21End = arCoRng21End;
    }

    public String getArCoRng22Beg() {
        return arCoRng22Beg;
    }

    public void setArCoRng22Beg(String arCoRng22Beg) {
        this.arCoRng22Beg = arCoRng22Beg;
    }

    public String getArCoRng22End() {
        return arCoRng22End;
    }

    public void setArCoRng22End(String arCoRng22End) {
        this.arCoRng22End = arCoRng22End;
    }

    public String getArCoRng23Beg() {
        return arCoRng23Beg;
    }

    public void setArCoRng23Beg(String arCoRng23Beg) {
        this.arCoRng23Beg = arCoRng23Beg;
    }

    public String getArCoRng23End() {
        return arCoRng23End;
    }

    public void setArCoRng23End(String arCoRng23End) {
        this.arCoRng23End = arCoRng23End;
    }

    public String getArCoRng24Beg() {
        return arCoRng24Beg;
    }

    public void setArCoRng24Beg(String arCoRng24Beg) {
        this.arCoRng24Beg = arCoRng24Beg;
    }

    public String getArCoRng24End() {
        return arCoRng24End;
    }

    public void setArCoRng24End(String arCoRng24End) {
        this.arCoRng24End = arCoRng24End;
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

    public String getRoleCdNm() {
        return roleCdNm;
    }

    public void setRoleCdNm(String roleCdNm) {
        this.roleCdNm = roleCdNm;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iamGeacUsersPK != null ? iamGeacUsersPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof IamGeacUsers)) {
            return false;
        }
        IamGeacUsers other = (IamGeacUsers) object;
        if ((this.iamGeacUsersPK == null && other.iamGeacUsersPK != null) || (this.iamGeacUsersPK != null && !this.iamGeacUsersPK.equals(other.iamGeacUsersPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.IamGeacUsers[ iamGeacUsersPK=" + iamGeacUsersPK + " ]";
    }

}
