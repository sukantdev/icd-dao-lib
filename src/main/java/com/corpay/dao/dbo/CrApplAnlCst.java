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
@Table(name = "CR_APPL_ANL_CST", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "CrApplAnlCst.findAll", query = "SELECT c FROM CrApplAnlCst c")})
public class CrApplAnlCst implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CrApplAnlCstPK crApplAnlCstPK;
    @Basic(optional = false)
    @Column(name = "FLG")
    private Character flg;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "AMT")
    private BigDecimal amt;
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

    public CrApplAnlCst() {
    }

    public CrApplAnlCst(CrApplAnlCstPK crApplAnlCstPK) {
        this.crApplAnlCstPK = crApplAnlCstPK;
    }

    public CrApplAnlCst(CrApplAnlCstPK crApplAnlCstPK, Character flg, BigDecimal amt, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.crApplAnlCstPK = crApplAnlCstPK;
        this.flg = flg;
        this.amt = amt;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public CrApplAnlCst(String applNbr, String childTyp, Character cstTyp) {
        this.crApplAnlCstPK = new CrApplAnlCstPK(applNbr, childTyp, cstTyp);
    }

    public CrApplAnlCstPK getCrApplAnlCstPK() {
        return crApplAnlCstPK;
    }

    public void setCrApplAnlCstPK(CrApplAnlCstPK crApplAnlCstPK) {
        this.crApplAnlCstPK = crApplAnlCstPK;
    }

    public Character getFlg() {
        return flg;
    }

    public void setFlg(Character flg) {
        this.flg = flg;
    }

    public BigDecimal getAmt() {
        return amt;
    }

    public void setAmt(BigDecimal amt) {
        this.amt = amt;
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
        hash += (crApplAnlCstPK != null ? crApplAnlCstPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CrApplAnlCst)) {
            return false;
        }
        CrApplAnlCst other = (CrApplAnlCst) object;
        if ((this.crApplAnlCstPK == null && other.crApplAnlCstPK != null) || (this.crApplAnlCstPK != null && !this.crApplAnlCstPK.equals(other.crApplAnlCstPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.CrApplAnlCst[ crApplAnlCstPK=" + crApplAnlCstPK + " ]";
    }
    
}
