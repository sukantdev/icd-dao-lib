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
@Table(name = "CM_LEGAL_ENTITY_INFO", catalog = "", schema = "DBO")
public class CmLegalEntityInfo implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CmLegalEntityInfoPK cmLegalEntityInfoPK;
    @Basic(optional = false)
    @Column(name = "USR_ID")
    private String usrId;
    @Basic(optional = false)
    @Column(name = "FST_NM")
    private String fstNm;
    @Basic(optional = false)
    @Column(name = "LST_NM")
    private String lstNm;
    @Basic(optional = false)
    @Column(name = "STREET_ADDR")
    private String streetAddr;
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
    @Column(name = "US_CTZN_IND")
    private Character usCtznInd;
    @Basic(optional = false)
    @Column(name = "TAX_ID")
    private String taxId;
    @Basic(optional = false)
    @Column(name = "PSPRT_NBR")
    private String psprtNbr;
    @Basic(optional = false)
    @Column(name = "PSPRT_ISU_CNTRY_CD")
    private String psprtIsuCntryCd;
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
    @Column(name = "CNTRY_CD")
    private String cntryCd;
    @Basic(optional = false)
    @Column(name = "STREET_ADDR2")
    private String streetAddr2;
    @Basic(optional = false)
    @Column(name = "DOB")
    private String dob;
    @Basic(optional = false)
    @Column(name = "APPL_JOB_TTL")
    private String applJobTtl;
    @Basic(optional = false)
    @Column(name = "ID_TYP_TXT")
    private String idTypTxt;
    @Basic(optional = false)
    @Column(name = "ID_VAL")
    private String idVal;
    @Basic(optional = false)
    @Column(name = "ISSUANCE_CNTRY_CD")
    private String issuanceCntryCd;
    @Basic(optional = false)
    @Column(name = "BO_OWNERSHIP_PCT")
    private short boOwnershipPct;
    @Basic(optional = false)
    @Column(name = "APPL_CCH_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date applCchTs;
    @Basic(optional = false)
    @Column(name = "ID_VAL_LAST_FOUR")
    private String idValLastFour;

    public CmLegalEntityInfo() {
    }

    public CmLegalEntityInfo(CmLegalEntityInfoPK cmLegalEntityInfoPK) {
        this.cmLegalEntityInfoPK = cmLegalEntityInfoPK;
    }

    public CmLegalEntityInfo(CmLegalEntityInfoPK cmLegalEntityInfoPK, String usrId, String fstNm, String lstNm, String streetAddr, String cityNm, String stNm, String zipCd, Character usCtznInd, String taxId, String psprtNbr, String psprtIsuCntryCd, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr, String cntryCd, String streetAddr2, String dob, String applJobTtl, String idTypTxt, String idVal, String issuanceCntryCd, short boOwnershipPct, Date applCchTs, String idValLastFour) {
        this.cmLegalEntityInfoPK = cmLegalEntityInfoPK;
        this.usrId = usrId;
        this.fstNm = fstNm;
        this.lstNm = lstNm;
        this.streetAddr = streetAddr;
        this.cityNm = cityNm;
        this.stNm = stNm;
        this.zipCd = zipCd;
        this.usCtznInd = usCtznInd;
        this.taxId = taxId;
        this.psprtNbr = psprtNbr;
        this.psprtIsuCntryCd = psprtIsuCntryCd;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
        this.cntryCd = cntryCd;
        this.streetAddr2 = streetAddr2;
        this.dob = dob;
        this.applJobTtl = applJobTtl;
        this.idTypTxt = idTypTxt;
        this.idVal = idVal;
        this.issuanceCntryCd = issuanceCntryCd;
        this.boOwnershipPct = boOwnershipPct;
        this.applCchTs = applCchTs;
        this.idValLastFour = idValLastFour;
    }

    public CmLegalEntityInfo(Date cchTs, int lglEntTypCd) {
        this.cmLegalEntityInfoPK = new CmLegalEntityInfoPK(cchTs, lglEntTypCd);
    }

    public CmLegalEntityInfoPK getCmLegalEntityInfoPK() {
        return cmLegalEntityInfoPK;
    }

    public void setCmLegalEntityInfoPK(CmLegalEntityInfoPK cmLegalEntityInfoPK) {
        this.cmLegalEntityInfoPK = cmLegalEntityInfoPK;
    }

    public String getUsrId() {
        return usrId;
    }

    public void setUsrId(String usrId) {
        this.usrId = usrId;
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

    public String getStreetAddr() {
        return streetAddr;
    }

    public void setStreetAddr(String streetAddr) {
        this.streetAddr = streetAddr;
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

    public Character getUsCtznInd() {
        return usCtznInd;
    }

    public void setUsCtznInd(Character usCtznInd) {
        this.usCtznInd = usCtznInd;
    }

    public String getTaxId() {
        return taxId;
    }

    public void setTaxId(String taxId) {
        this.taxId = taxId;
    }

    public String getPsprtNbr() {
        return psprtNbr;
    }

    public void setPsprtNbr(String psprtNbr) {
        this.psprtNbr = psprtNbr;
    }

    public String getPsprtIsuCntryCd() {
        return psprtIsuCntryCd;
    }

    public void setPsprtIsuCntryCd(String psprtIsuCntryCd) {
        this.psprtIsuCntryCd = psprtIsuCntryCd;
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

    public String getCntryCd() {
        return cntryCd;
    }

    public void setCntryCd(String cntryCd) {
        this.cntryCd = cntryCd;
    }

    public String getStreetAddr2() {
        return streetAddr2;
    }

    public void setStreetAddr2(String streetAddr2) {
        this.streetAddr2 = streetAddr2;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getApplJobTtl() {
        return applJobTtl;
    }

    public void setApplJobTtl(String applJobTtl) {
        this.applJobTtl = applJobTtl;
    }

    public String getIdTypTxt() {
        return idTypTxt;
    }

    public void setIdTypTxt(String idTypTxt) {
        this.idTypTxt = idTypTxt;
    }

    public String getIdVal() {
        return idVal;
    }

    public void setIdVal(String idVal) {
        this.idVal = idVal;
    }

    public String getIssuanceCntryCd() {
        return issuanceCntryCd;
    }

    public void setIssuanceCntryCd(String issuanceCntryCd) {
        this.issuanceCntryCd = issuanceCntryCd;
    }

    public short getBoOwnershipPct() {
        return boOwnershipPct;
    }

    public void setBoOwnershipPct(short boOwnershipPct) {
        this.boOwnershipPct = boOwnershipPct;
    }

    public Date getApplCchTs() {
        return applCchTs;
    }

    public void setApplCchTs(Date applCchTs) {
        this.applCchTs = applCchTs;
    }

    public String getIdValLastFour() {
        return idValLastFour;
    }

    public void setIdValLastFour(String idValLastFour) {
        this.idValLastFour = idValLastFour;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cmLegalEntityInfoPK != null ? cmLegalEntityInfoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof CmLegalEntityInfo)) {
            return false;
        }
        CmLegalEntityInfo other = (CmLegalEntityInfo) object;
        if ((this.cmLegalEntityInfoPK == null && other.cmLegalEntityInfoPK != null) || (this.cmLegalEntityInfoPK != null && !this.cmLegalEntityInfoPK.equals(other.cmLegalEntityInfoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.CmLegalEntityInfo[ cmLegalEntityInfoPK=" + cmLegalEntityInfoPK + " ]";
    }

}
