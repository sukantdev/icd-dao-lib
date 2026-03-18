package com.corpay.dao.cxxcow;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

@Embeddable
public class McMerchSlocPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "MC_MERCH_ID")
    @Temporal(TemporalType.TIMESTAMP)
    private Date mcMerchId;
    @Basic(optional = false)
    @Column(name = "P0216_S0001_SLOC_CTY_NM")
    private String p0216S0001SlocCtyNm;
    @Basic(optional = false)
    @Column(name = "P0216_S0002_SLOC_CTRY_SUB_CD")
    private String p0216S0002SlocCtrySubCd;
    @Basic(optional = false)
    @Column(name = "P0216_S0003_SLOC_CTRY_CD")
    private String p0216S0003SlocCtryCd;
    @Basic(optional = false)
    @Column(name = "P0216_S0004_SLOC_PSTL_CD")
    private String p0216S0004SlocPstlCd;
    @Basic(optional = false)
    @Column(name = "P0216_S0006_SLOC_GEO_CORD")
    private String p0216S0006SlocGeoCord;

    public McMerchSlocPK() {
    }

    public McMerchSlocPK(Date mcMerchId, String p0216S0001SlocCtyNm, String p0216S0002SlocCtrySubCd, String p0216S0003SlocCtryCd, String p0216S0004SlocPstlCd, String p0216S0006SlocGeoCord) {
        this.mcMerchId = mcMerchId;
        this.p0216S0001SlocCtyNm = p0216S0001SlocCtyNm;
        this.p0216S0002SlocCtrySubCd = p0216S0002SlocCtrySubCd;
        this.p0216S0003SlocCtryCd = p0216S0003SlocCtryCd;
        this.p0216S0004SlocPstlCd = p0216S0004SlocPstlCd;
        this.p0216S0006SlocGeoCord = p0216S0006SlocGeoCord;
    }

    public Date getMcMerchId() {
        return mcMerchId;
    }

    public void setMcMerchId(Date mcMerchId) {
        this.mcMerchId = mcMerchId;
    }

    public String getP0216S0001SlocCtyNm() {
        return p0216S0001SlocCtyNm;
    }

    public void setP0216S0001SlocCtyNm(String p0216S0001SlocCtyNm) {
        this.p0216S0001SlocCtyNm = p0216S0001SlocCtyNm;
    }

    public String getP0216S0002SlocCtrySubCd() {
        return p0216S0002SlocCtrySubCd;
    }

    public void setP0216S0002SlocCtrySubCd(String p0216S0002SlocCtrySubCd) {
        this.p0216S0002SlocCtrySubCd = p0216S0002SlocCtrySubCd;
    }

    public String getP0216S0003SlocCtryCd() {
        return p0216S0003SlocCtryCd;
    }

    public void setP0216S0003SlocCtryCd(String p0216S0003SlocCtryCd) {
        this.p0216S0003SlocCtryCd = p0216S0003SlocCtryCd;
    }

    public String getP0216S0004SlocPstlCd() {
        return p0216S0004SlocPstlCd;
    }

    public void setP0216S0004SlocPstlCd(String p0216S0004SlocPstlCd) {
        this.p0216S0004SlocPstlCd = p0216S0004SlocPstlCd;
    }

    public String getP0216S0006SlocGeoCord() {
        return p0216S0006SlocGeoCord;
    }

    public void setP0216S0006SlocGeoCord(String p0216S0006SlocGeoCord) {
        this.p0216S0006SlocGeoCord = p0216S0006SlocGeoCord;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mcMerchId != null ? mcMerchId.hashCode() : 0);
        hash += (p0216S0001SlocCtyNm != null ? p0216S0001SlocCtyNm.hashCode() : 0);
        hash += (p0216S0002SlocCtrySubCd != null ? p0216S0002SlocCtrySubCd.hashCode() : 0);
        hash += (p0216S0003SlocCtryCd != null ? p0216S0003SlocCtryCd.hashCode() : 0);
        hash += (p0216S0004SlocPstlCd != null ? p0216S0004SlocPstlCd.hashCode() : 0);
        hash += (p0216S0006SlocGeoCord != null ? p0216S0006SlocGeoCord.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof McMerchSlocPK)) {
            return false;
        }
        McMerchSlocPK other = (McMerchSlocPK) object;
        if ((this.mcMerchId == null && other.mcMerchId != null) || (this.mcMerchId != null && !this.mcMerchId.equals(other.mcMerchId))) {
            return false;
        }
        if ((this.p0216S0001SlocCtyNm == null && other.p0216S0001SlocCtyNm != null) || (this.p0216S0001SlocCtyNm != null && !this.p0216S0001SlocCtyNm.equals(other.p0216S0001SlocCtyNm))) {
            return false;
        }
        if ((this.p0216S0002SlocCtrySubCd == null && other.p0216S0002SlocCtrySubCd != null) || (this.p0216S0002SlocCtrySubCd != null && !this.p0216S0002SlocCtrySubCd.equals(other.p0216S0002SlocCtrySubCd))) {
            return false;
        }
        if ((this.p0216S0003SlocCtryCd == null && other.p0216S0003SlocCtryCd != null) || (this.p0216S0003SlocCtryCd != null && !this.p0216S0003SlocCtryCd.equals(other.p0216S0003SlocCtryCd))) {
            return false;
        }
        if ((this.p0216S0004SlocPstlCd == null && other.p0216S0004SlocPstlCd != null) || (this.p0216S0004SlocPstlCd != null && !this.p0216S0004SlocPstlCd.equals(other.p0216S0004SlocPstlCd))) {
            return false;
        }
        if ((this.p0216S0006SlocGeoCord == null && other.p0216S0006SlocGeoCord != null) || (this.p0216S0006SlocGeoCord != null && !this.p0216S0006SlocGeoCord.equals(other.p0216S0006SlocGeoCord))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.cxxcow.McMerchSlocPK[ mcMerchId=" + mcMerchId + ", p0216S0001SlocCtyNm=" + p0216S0001SlocCtyNm + ", p0216S0002SlocCtrySubCd=" + p0216S0002SlocCtrySubCd + ", p0216S0003SlocCtryCd=" + p0216S0003SlocCtryCd + ", p0216S0004SlocPstlCd=" + p0216S0004SlocPstlCd + ", p0216S0006SlocGeoCord=" + p0216S0006SlocGeoCord + " ]";
    }

}
