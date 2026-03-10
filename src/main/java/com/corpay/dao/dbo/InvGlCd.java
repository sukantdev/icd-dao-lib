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
@Table(name = "INV_GL_CD", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "InvGlCd.findAll", query = "SELECT i FROM InvGlCd i")})
public class InvGlCd implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected InvGlCdPK invGlCdPK;
    @Basic(optional = false)
    @Column(name = "GL_CD_DESC")
    private String glCdDesc;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "GL_CST")
    private BigDecimal glCst;
    @Basic(optional = false)
    @Column(name = "GL_CUST_DET1")
    private String glCustDet1;
    @Basic(optional = false)
    @Column(name = "GL_CUST_DET2")
    private String glCustDet2;
    @Basic(optional = false)
    @Column(name = "GL_DFLT_USED")
    private Character glDfltUsed;
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
    @Column(name = "CR_OR_DB")
    private Character crOrDb;

    public InvGlCd() {
    }

    public InvGlCd(InvGlCdPK invGlCdPK) {
        this.invGlCdPK = invGlCdPK;
    }

    public InvGlCd(InvGlCdPK invGlCdPK, String glCdDesc, BigDecimal glCst, String glCustDet1, String glCustDet2, Character glDfltUsed, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr, Character crOrDb) {
        this.invGlCdPK = invGlCdPK;
        this.glCdDesc = glCdDesc;
        this.glCst = glCst;
        this.glCustDet1 = glCustDet1;
        this.glCustDet2 = glCustDet2;
        this.glDfltUsed = glDfltUsed;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
        this.crOrDb = crOrDb;
    }

    public InvGlCd(Date pstdDt, int trnsId, String glCd, short glTrnsSeqNbr) {
        this.invGlCdPK = new InvGlCdPK(pstdDt, trnsId, glCd, glTrnsSeqNbr);
    }

    public InvGlCdPK getInvGlCdPK() {
        return invGlCdPK;
    }

    public void setInvGlCdPK(InvGlCdPK invGlCdPK) {
        this.invGlCdPK = invGlCdPK;
    }

    public String getGlCdDesc() {
        return glCdDesc;
    }

    public void setGlCdDesc(String glCdDesc) {
        this.glCdDesc = glCdDesc;
    }

    public BigDecimal getGlCst() {
        return glCst;
    }

    public void setGlCst(BigDecimal glCst) {
        this.glCst = glCst;
    }

    public String getGlCustDet1() {
        return glCustDet1;
    }

    public void setGlCustDet1(String glCustDet1) {
        this.glCustDet1 = glCustDet1;
    }

    public String getGlCustDet2() {
        return glCustDet2;
    }

    public void setGlCustDet2(String glCustDet2) {
        this.glCustDet2 = glCustDet2;
    }

    public Character getGlDfltUsed() {
        return glDfltUsed;
    }

    public void setGlDfltUsed(Character glDfltUsed) {
        this.glDfltUsed = glDfltUsed;
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

    public Character getCrOrDb() {
        return crOrDb;
    }

    public void setCrOrDb(Character crOrDb) {
        this.crOrDb = crOrDb;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (invGlCdPK != null ? invGlCdPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InvGlCd)) {
            return false;
        }
        InvGlCd other = (InvGlCd) object;
        if ((this.invGlCdPK == null && other.invGlCdPK != null) || (this.invGlCdPK != null && !this.invGlCdPK.equals(other.invGlCdPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.InvGlCd[ invGlCdPK=" + invGlCdPK + " ]";
    }
    
}
