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
@Table(name = "PROMPT_DEF", catalog = "", schema = "DBO")
public class PromptDef implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "PROMPT_ID")
    private String promptId;
    @Basic(optional = false)
    @Column(name = "PROMPT_DESC")
    private String promptDesc;
    @Basic(optional = false)
    @Column(name = "DEF_FRMT_CD")
    private Character defFrmtCd;
    @Basic(optional = false)
    @Column(name = "DEF_MANDATORY_CD")
    private Character defMandatoryCd;
    @Basic(optional = false)
    @Column(name = "DEF_MANUAL_CD")
    private Character defManualCd;
    @Basic(optional = false)
    @Column(name = "DEF_ENTRY_CD")
    private Character defEntryCd;
    @Basic(optional = false)
    @Column(name = "DEF_VALIDATION_CD")
    private Character defValidationCd;
    @Basic(optional = false)
    @Column(name = "VALID_GROUP_CD")
    private Character validGroupCd;
    @Basic(optional = false)
    @Column(name = "VALID_CARD_CD")
    private Character validCardCd;
    @Basic(optional = false)
    @Column(name = "VALID_UNIT_CD")
    private Character validUnitCd;
    @Basic(optional = false)
    @Column(name = "VALID_OTHR_CD")
    private Character validOthrCd;
    @Basic(optional = false)
    @Column(name = "MOBILE_MC_FLG")
    private Character mobileMcFlg;
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

    public PromptDef() {
    }

    public PromptDef(String promptId) {
        this.promptId = promptId;
    }

    public PromptDef(String promptId, String promptDesc, Character defFrmtCd, Character defMandatoryCd, Character defManualCd, Character defEntryCd, Character defValidationCd, Character validGroupCd, Character validCardCd, Character validUnitCd, Character validOthrCd, Character mobileMcFlg, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.promptId = promptId;
        this.promptDesc = promptDesc;
        this.defFrmtCd = defFrmtCd;
        this.defMandatoryCd = defMandatoryCd;
        this.defManualCd = defManualCd;
        this.defEntryCd = defEntryCd;
        this.defValidationCd = defValidationCd;
        this.validGroupCd = validGroupCd;
        this.validCardCd = validCardCd;
        this.validUnitCd = validUnitCd;
        this.validOthrCd = validOthrCd;
        this.mobileMcFlg = mobileMcFlg;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public String getPromptId() {
        return promptId;
    }

    public void setPromptId(String promptId) {
        this.promptId = promptId;
    }

    public String getPromptDesc() {
        return promptDesc;
    }

    public void setPromptDesc(String promptDesc) {
        this.promptDesc = promptDesc;
    }

    public Character getDefFrmtCd() {
        return defFrmtCd;
    }

    public void setDefFrmtCd(Character defFrmtCd) {
        this.defFrmtCd = defFrmtCd;
    }

    public Character getDefMandatoryCd() {
        return defMandatoryCd;
    }

    public void setDefMandatoryCd(Character defMandatoryCd) {
        this.defMandatoryCd = defMandatoryCd;
    }

    public Character getDefManualCd() {
        return defManualCd;
    }

    public void setDefManualCd(Character defManualCd) {
        this.defManualCd = defManualCd;
    }

    public Character getDefEntryCd() {
        return defEntryCd;
    }

    public void setDefEntryCd(Character defEntryCd) {
        this.defEntryCd = defEntryCd;
    }

    public Character getDefValidationCd() {
        return defValidationCd;
    }

    public void setDefValidationCd(Character defValidationCd) {
        this.defValidationCd = defValidationCd;
    }

    public Character getValidGroupCd() {
        return validGroupCd;
    }

    public void setValidGroupCd(Character validGroupCd) {
        this.validGroupCd = validGroupCd;
    }

    public Character getValidCardCd() {
        return validCardCd;
    }

    public void setValidCardCd(Character validCardCd) {
        this.validCardCd = validCardCd;
    }

    public Character getValidUnitCd() {
        return validUnitCd;
    }

    public void setValidUnitCd(Character validUnitCd) {
        this.validUnitCd = validUnitCd;
    }

    public Character getValidOthrCd() {
        return validOthrCd;
    }

    public void setValidOthrCd(Character validOthrCd) {
        this.validOthrCd = validOthrCd;
    }

    public Character getMobileMcFlg() {
        return mobileMcFlg;
    }

    public void setMobileMcFlg(Character mobileMcFlg) {
        this.mobileMcFlg = mobileMcFlg;
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
        hash += (promptId != null ? promptId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof PromptDef)) {
            return false;
        }
        PromptDef other = (PromptDef) object;
        if ((this.promptId == null && other.promptId != null) || (this.promptId != null && !this.promptId.equals(other.promptId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.PromptDef[ promptId=" + promptId + " ]";
    }

}
