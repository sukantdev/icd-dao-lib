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
@Table(name = "MC_LOCATION", catalog = "", schema = "CXXCOW")
public class McLocation implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "LC_LOC_ID")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lcLocId;
    @Basic(optional = false)
    @Column(name = "LC_DESC")
    private String lcDesc;
    @Basic(optional = false)
    @Column(name = "LC_ADDR")
    private String lcAddr;
    @Basic(optional = false)
    @Column(name = "LC_CITY")
    private String lcCity;
    @Basic(optional = false)
    @Column(name = "LC_STATE")
    private String lcState;
    @Basic(optional = false)
    @Column(name = "LC_POST_CD")
    private String lcPostCd;
    @Basic(optional = false)
    @Column(name = "LC_CNTRY_CD")
    private short lcCntryCd;
    @Basic(optional = false)
    @Column(name = "LC_PH_NO")
    private String lcPhNo;
    @Basic(optional = false)
    @Column(name = "LC_OIL_CO_BRAND")
    private String lcOilCoBrand;
    @Basic(optional = false)
    @Column(name = "LC_ACQ_INST_ID")
    private String lcAcqInstId;
    @Basic(optional = false)
    @Column(name = "LC_ACCEPT_ID")
    private String lcAcceptId;
    @Basic(optional = false)
    @Column(name = "LC_PROMPT_OUT")
    private Character lcPromptOut;
    @Basic(optional = false)
    @Column(name = "LC_PROMPT_IN")
    private Character lcPromptIn;
    @Basic(optional = false)
    @Column(name = "LC_DTL_LEVEL")
    private short lcDtlLevel;
    @Basic(optional = false)
    @Column(name = "LC_LAST_UPDT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lcLastUpdt;

    public McLocation() {
    }

    public McLocation(Date lcLocId) {
        this.lcLocId = lcLocId;
    }

    public McLocation(Date lcLocId, String lcDesc, String lcAddr, String lcCity, String lcState, String lcPostCd, short lcCntryCd, String lcPhNo, String lcOilCoBrand, String lcAcqInstId, String lcAcceptId, Character lcPromptOut, Character lcPromptIn, short lcDtlLevel, Date lcLastUpdt) {
        this.lcLocId = lcLocId;
        this.lcDesc = lcDesc;
        this.lcAddr = lcAddr;
        this.lcCity = lcCity;
        this.lcState = lcState;
        this.lcPostCd = lcPostCd;
        this.lcCntryCd = lcCntryCd;
        this.lcPhNo = lcPhNo;
        this.lcOilCoBrand = lcOilCoBrand;
        this.lcAcqInstId = lcAcqInstId;
        this.lcAcceptId = lcAcceptId;
        this.lcPromptOut = lcPromptOut;
        this.lcPromptIn = lcPromptIn;
        this.lcDtlLevel = lcDtlLevel;
        this.lcLastUpdt = lcLastUpdt;
    }

    public Date getLcLocId() {
        return lcLocId;
    }

    public void setLcLocId(Date lcLocId) {
        this.lcLocId = lcLocId;
    }

    public String getLcDesc() {
        return lcDesc;
    }

    public void setLcDesc(String lcDesc) {
        this.lcDesc = lcDesc;
    }

    public String getLcAddr() {
        return lcAddr;
    }

    public void setLcAddr(String lcAddr) {
        this.lcAddr = lcAddr;
    }

    public String getLcCity() {
        return lcCity;
    }

    public void setLcCity(String lcCity) {
        this.lcCity = lcCity;
    }

    public String getLcState() {
        return lcState;
    }

    public void setLcState(String lcState) {
        this.lcState = lcState;
    }

    public String getLcPostCd() {
        return lcPostCd;
    }

    public void setLcPostCd(String lcPostCd) {
        this.lcPostCd = lcPostCd;
    }

    public short getLcCntryCd() {
        return lcCntryCd;
    }

    public void setLcCntryCd(short lcCntryCd) {
        this.lcCntryCd = lcCntryCd;
    }

    public String getLcPhNo() {
        return lcPhNo;
    }

    public void setLcPhNo(String lcPhNo) {
        this.lcPhNo = lcPhNo;
    }

    public String getLcOilCoBrand() {
        return lcOilCoBrand;
    }

    public void setLcOilCoBrand(String lcOilCoBrand) {
        this.lcOilCoBrand = lcOilCoBrand;
    }

    public String getLcAcqInstId() {
        return lcAcqInstId;
    }

    public void setLcAcqInstId(String lcAcqInstId) {
        this.lcAcqInstId = lcAcqInstId;
    }

    public String getLcAcceptId() {
        return lcAcceptId;
    }

    public void setLcAcceptId(String lcAcceptId) {
        this.lcAcceptId = lcAcceptId;
    }

    public Character getLcPromptOut() {
        return lcPromptOut;
    }

    public void setLcPromptOut(Character lcPromptOut) {
        this.lcPromptOut = lcPromptOut;
    }

    public Character getLcPromptIn() {
        return lcPromptIn;
    }

    public void setLcPromptIn(Character lcPromptIn) {
        this.lcPromptIn = lcPromptIn;
    }

    public short getLcDtlLevel() {
        return lcDtlLevel;
    }

    public void setLcDtlLevel(short lcDtlLevel) {
        this.lcDtlLevel = lcDtlLevel;
    }

    public Date getLcLastUpdt() {
        return lcLastUpdt;
    }

    public void setLcLastUpdt(Date lcLastUpdt) {
        this.lcLastUpdt = lcLastUpdt;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lcLocId != null ? lcLocId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof McLocation)) {
            return false;
        }
        McLocation other = (McLocation) object;
        if ((this.lcLocId == null && other.lcLocId != null) || (this.lcLocId != null && !this.lcLocId.equals(other.lcLocId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.cxxcow.McLocation[ lcLocId=" + lcLocId + " ]";
    }

}
