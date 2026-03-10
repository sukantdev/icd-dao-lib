/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.corpay.dao.cxxcow;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author Sukant.Tiwari
 */
@Entity
@Table(name = "MC_MERCH_SLOC", catalog = "", schema = "CXXCOW")
@NamedQueries({
    @NamedQuery(name = "McMerchSloc.findAll", query = "SELECT m FROM McMerchSloc m"),
    @NamedQuery(name = "McMerchSloc.findByMcMerchId", query = "SELECT m FROM McMerchSloc m WHERE m.mcMerchSlocPK.mcMerchId = :mcMerchId"),
    @NamedQuery(name = "McMerchSloc.findByP0216S0001SlocCtyNm", query = "SELECT m FROM McMerchSloc m WHERE m.mcMerchSlocPK.p0216S0001SlocCtyNm = :p0216S0001SlocCtyNm"),
    @NamedQuery(name = "McMerchSloc.findByP0216S0002SlocCtrySubCd", query = "SELECT m FROM McMerchSloc m WHERE m.mcMerchSlocPK.p0216S0002SlocCtrySubCd = :p0216S0002SlocCtrySubCd"),
    @NamedQuery(name = "McMerchSloc.findByP0216S0003SlocCtryCd", query = "SELECT m FROM McMerchSloc m WHERE m.mcMerchSlocPK.p0216S0003SlocCtryCd = :p0216S0003SlocCtryCd"),
    @NamedQuery(name = "McMerchSloc.findByP0216S0004SlocPstlCd", query = "SELECT m FROM McMerchSloc m WHERE m.mcMerchSlocPK.p0216S0004SlocPstlCd = :p0216S0004SlocPstlCd"),
    @NamedQuery(name = "McMerchSloc.findByP0216S0006SlocGeoCord", query = "SELECT m FROM McMerchSloc m WHERE m.mcMerchSlocPK.p0216S0006SlocGeoCord = :p0216S0006SlocGeoCord"),
    @NamedQuery(name = "McMerchSloc.findByMcMerchIdSloc", query = "SELECT m FROM McMerchSloc m WHERE m.mcMerchIdSloc = :mcMerchIdSloc"),
    @NamedQuery(name = "McMerchSloc.findByMcMidSlocLastUsed", query = "SELECT m FROM McMerchSloc m WHERE m.mcMidSlocLastUsed = :mcMidSlocLastUsed"),
    @NamedQuery(name = "McMerchSloc.findByMcSlocLatNbr", query = "SELECT m FROM McMerchSloc m WHERE m.mcSlocLatNbr = :mcSlocLatNbr"),
    @NamedQuery(name = "McMerchSloc.findByMcSlocLongNbr", query = "SELECT m FROM McMerchSloc m WHERE m.mcSlocLongNbr = :mcSlocLongNbr")})
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
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
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
        // TODO: Warning - this method won't work in the case the id fields are not set
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
