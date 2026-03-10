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
@Table(name = "LPP_PRVDR_DISC", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "LppPrvdrDisc.findAll", query = "SELECT l FROM LppPrvdrDisc l")})
public class LppPrvdrDisc implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected LppPrvdrDiscPK lppPrvdrDiscPK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "LPP_CARR_PP_PCT")
    private BigDecimal lppCarrPpPct;
    @Basic(optional = false)
    @Column(name = "LPP_CARR_FNDD_PCT")
    private BigDecimal lppCarrFnddPct;
    @Basic(optional = false)
    @Column(name = "LPP_SHPR_PP_PCT")
    private BigDecimal lppShprPpPct;
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

    public LppPrvdrDisc() {
    }

    public LppPrvdrDisc(LppPrvdrDiscPK lppPrvdrDiscPK) {
        this.lppPrvdrDiscPK = lppPrvdrDiscPK;
    }

    public LppPrvdrDisc(LppPrvdrDiscPK lppPrvdrDiscPK, BigDecimal lppCarrPpPct, BigDecimal lppCarrFnddPct, BigDecimal lppShprPpPct, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.lppPrvdrDiscPK = lppPrvdrDiscPK;
        this.lppCarrPpPct = lppCarrPpPct;
        this.lppCarrFnddPct = lppCarrFnddPct;
        this.lppShprPpPct = lppShprPpPct;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public LppPrvdrDisc(String lppAbbrvNm, short lppPrvdrPrd) {
        this.lppPrvdrDiscPK = new LppPrvdrDiscPK(lppAbbrvNm, lppPrvdrPrd);
    }

    public LppPrvdrDiscPK getLppPrvdrDiscPK() {
        return lppPrvdrDiscPK;
    }

    public void setLppPrvdrDiscPK(LppPrvdrDiscPK lppPrvdrDiscPK) {
        this.lppPrvdrDiscPK = lppPrvdrDiscPK;
    }

    public BigDecimal getLppCarrPpPct() {
        return lppCarrPpPct;
    }

    public void setLppCarrPpPct(BigDecimal lppCarrPpPct) {
        this.lppCarrPpPct = lppCarrPpPct;
    }

    public BigDecimal getLppCarrFnddPct() {
        return lppCarrFnddPct;
    }

    public void setLppCarrFnddPct(BigDecimal lppCarrFnddPct) {
        this.lppCarrFnddPct = lppCarrFnddPct;
    }

    public BigDecimal getLppShprPpPct() {
        return lppShprPpPct;
    }

    public void setLppShprPpPct(BigDecimal lppShprPpPct) {
        this.lppShprPpPct = lppShprPpPct;
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
        hash += (lppPrvdrDiscPK != null ? lppPrvdrDiscPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LppPrvdrDisc)) {
            return false;
        }
        LppPrvdrDisc other = (LppPrvdrDisc) object;
        if ((this.lppPrvdrDiscPK == null && other.lppPrvdrDiscPK != null) || (this.lppPrvdrDiscPK != null && !this.lppPrvdrDiscPK.equals(other.lppPrvdrDiscPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.LppPrvdrDisc[ lppPrvdrDiscPK=" + lppPrvdrDiscPK + " ]";
    }
    
}
