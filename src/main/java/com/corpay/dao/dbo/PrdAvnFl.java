/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
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
@Table(name = "PRD_AVN_FL", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "PrdAvnFl.findAll", query = "SELECT p FROM PrdAvnFl p")})
public class PrdAvnFl implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "APPL_NBR")
    private String applNbr;
    @Basic(optional = false)
    @Column(name = "DLY_TRNS_CNT")
    private long dlyTrnsCnt;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "DLY_PCHS_LMT")
    private BigDecimal dlyPchsLmt;
    @Basic(optional = false)
    @Column(name = "CRD_SELCTN_FLGS")
    private short crdSelctnFlgs;
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

    public PrdAvnFl() {
    }

    public PrdAvnFl(String applNbr) {
        this.applNbr = applNbr;
    }

    public PrdAvnFl(String applNbr, long dlyTrnsCnt, BigDecimal dlyPchsLmt, short crdSelctnFlgs, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.applNbr = applNbr;
        this.dlyTrnsCnt = dlyTrnsCnt;
        this.dlyPchsLmt = dlyPchsLmt;
        this.crdSelctnFlgs = crdSelctnFlgs;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public String getApplNbr() {
        return applNbr;
    }

    public void setApplNbr(String applNbr) {
        this.applNbr = applNbr;
    }

    public long getDlyTrnsCnt() {
        return dlyTrnsCnt;
    }

    public void setDlyTrnsCnt(long dlyTrnsCnt) {
        this.dlyTrnsCnt = dlyTrnsCnt;
    }

    public BigDecimal getDlyPchsLmt() {
        return dlyPchsLmt;
    }

    public void setDlyPchsLmt(BigDecimal dlyPchsLmt) {
        this.dlyPchsLmt = dlyPchsLmt;
    }

    public short getCrdSelctnFlgs() {
        return crdSelctnFlgs;
    }

    public void setCrdSelctnFlgs(short crdSelctnFlgs) {
        this.crdSelctnFlgs = crdSelctnFlgs;
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
        hash += (applNbr != null ? applNbr.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PrdAvnFl)) {
            return false;
        }
        PrdAvnFl other = (PrdAvnFl) object;
        if ((this.applNbr == null && other.applNbr != null) || (this.applNbr != null && !this.applNbr.equals(other.applNbr))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.PrdAvnFl[ applNbr=" + applNbr + " ]";
    }
    
}
