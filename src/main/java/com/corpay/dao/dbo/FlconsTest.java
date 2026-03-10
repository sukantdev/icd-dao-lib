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
@Table(name = "FLCONS_TEST", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "FlconsTest.findAll", query = "SELECT f FROM FlconsTest f")})
public class FlconsTest implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected FlconsTestPK flconsTestPK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "PRC")
    private BigDecimal prc;
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
    @Column(name = "TEST_COLUMN")
    private String testColumn;

    public FlconsTest() {
    }

    public FlconsTest(FlconsTestPK flconsTestPK) {
        this.flconsTestPK = flconsTestPK;
    }

    public FlconsTest(FlconsTestPK flconsTestPK, BigDecimal prc, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr, String testColumn) {
        this.flconsTestPK = flconsTestPK;
        this.prc = prc;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
        this.testColumn = testColumn;
    }

    public FlconsTest(String fboMrchCd, String fcMrchCd, int tier) {
        this.flconsTestPK = new FlconsTestPK(fboMrchCd, fcMrchCd, tier);
    }

    public FlconsTestPK getFlconsTestPK() {
        return flconsTestPK;
    }

    public void setFlconsTestPK(FlconsTestPK flconsTestPK) {
        this.flconsTestPK = flconsTestPK;
    }

    public BigDecimal getPrc() {
        return prc;
    }

    public void setPrc(BigDecimal prc) {
        this.prc = prc;
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

    public String getTestColumn() {
        return testColumn;
    }

    public void setTestColumn(String testColumn) {
        this.testColumn = testColumn;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (flconsTestPK != null ? flconsTestPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FlconsTest)) {
            return false;
        }
        FlconsTest other = (FlconsTest) object;
        if ((this.flconsTestPK == null && other.flconsTestPK != null) || (this.flconsTestPK != null && !this.flconsTestPK.equals(other.flconsTestPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.FlconsTest[ flconsTestPK=" + flconsTestPK + " ]";
    }
    
}
