package com.corpay.dao.cxxcow;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "MC_MERCH_SLOC", catalog = "", schema = "CXXCOW")
public class McMerchSloc implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected McMerchSlocPK mcMerchSlocPK;
    @Basic(optional = false)
    @Column(name = "MC_MERCH_ID_SLOC")
    @Temporal(TemporalType.TIMESTAMP)
    private Date mcMerchIdSloc;
    @Basic(optional = false)
    @Column(name = "MC_MID_SLOC_LAST_USED")
    @Temporal(TemporalType.DATE)
    private Date mcMidSlocLastUsed;

    @Basic(optional = false)
    @Column(name = "MC_SLOC_LAT_NBR")
    private BigDecimal mcSlocLatNbr;
    @Basic(optional = false)
    @Column(name = "MC_SLOC_LONG_NBR")
    private BigDecimal mcSlocLongNbr;

    public McMerchSloc() {
    }

    public McMerchSloc(McMerchSlocPK mcMerchSlocPK) {
        this.mcMerchSlocPK = mcMerchSlocPK;
    }

    public McMerchSloc(McMerchSlocPK mcMerchSlocPK, Date mcMerchIdSloc, Date mcMidSlocLastUsed, BigDecimal mcSlocLatNbr, BigDecimal mcSlocLongNbr) {
        this.mcMerchSlocPK = mcMerchSlocPK;
        this.mcMerchIdSloc = mcMerchIdSloc;
        this.mcMidSlocLastUsed = mcMidSlocLastUsed;
        this.mcSlocLatNbr = mcSlocLatNbr;
        this.mcSlocLongNbr = mcSlocLongNbr;
    }

    public McMerchSloc(Date mcMerchId, String p0216S0001SlocCtyNm, String p0216S0002SlocCtrySubCd, String p0216S0003SlocCtryCd, String p0216S0004SlocPstlCd, String p0216S0006SlocGeoCord) {
        this.mcMerchSlocPK = new McMerchSlocPK(mcMerchId, p0216S0001SlocCtyNm, p0216S0002SlocCtrySubCd, p0216S0003SlocCtryCd, p0216S0004SlocPstlCd, p0216S0006SlocGeoCord);
    }

    public McMerchSlocPK getMcMerchSlocPK() {
        return mcMerchSlocPK;
    }

    public void setMcMerchSlocPK(McMerchSlocPK mcMerchSlocPK) {
        this.mcMerchSlocPK = mcMerchSlocPK;
    }

    public Date getMcMerchIdSloc() {
        return mcMerchIdSloc;
    }

    public void setMcMerchIdSloc(Date mcMerchIdSloc) {
        this.mcMerchIdSloc = mcMerchIdSloc;
    }

    public Date getMcMidSlocLastUsed() {
        return mcMidSlocLastUsed;
    }

    public void setMcMidSlocLastUsed(Date mcMidSlocLastUsed) {
        this.mcMidSlocLastUsed = mcMidSlocLastUsed;
    }

    public BigDecimal getMcSlocLatNbr() {
        return mcSlocLatNbr;
    }

    public void setMcSlocLatNbr(BigDecimal mcSlocLatNbr) {
        this.mcSlocLatNbr = mcSlocLatNbr;
    }

    public BigDecimal getMcSlocLongNbr() {
        return mcSlocLongNbr;
    }

    public void setMcSlocLongNbr(BigDecimal mcSlocLongNbr) {
        this.mcSlocLongNbr = mcSlocLongNbr;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mcMerchSlocPK != null ? mcMerchSlocPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof McMerchSloc)) {
            return false;
        }
        McMerchSloc other = (McMerchSloc) object;
        if ((this.mcMerchSlocPK == null && other.mcMerchSlocPK != null) || (this.mcMerchSlocPK != null && !this.mcMerchSlocPK.equals(other.mcMerchSlocPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.cxxcow.McMerchSloc[ mcMerchSlocPK=" + mcMerchSlocPK + " ]";
    }

}
