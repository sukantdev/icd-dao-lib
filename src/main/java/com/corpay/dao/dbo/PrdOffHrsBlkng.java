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
import java.util.Date;

/**
 *
 * @author Sukant.Tiwari
 */
@Entity
@Table(name = "PRD_OFF_HRS_BLKNG", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "PrdOffHrsBlkng.findAll", query = "SELECT p FROM PrdOffHrsBlkng p")})
public class PrdOffHrsBlkng implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PrdOffHrsBlkngPK prdOffHrsBlkngPK;
    @Basic(optional = false)
    @Column(name = "FLG")
    private Character flg;
    @Basic(optional = false)
    @Column(name = "STA_TM")
    private String staTm;
    @Basic(optional = false)
    @Column(name = "END_TM")
    private String endTm;
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

    public PrdOffHrsBlkng() {
    }

    public PrdOffHrsBlkng(PrdOffHrsBlkngPK prdOffHrsBlkngPK) {
        this.prdOffHrsBlkngPK = prdOffHrsBlkngPK;
    }

    public PrdOffHrsBlkng(PrdOffHrsBlkngPK prdOffHrsBlkngPK, Character flg, String staTm, String endTm, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.prdOffHrsBlkngPK = prdOffHrsBlkngPK;
        this.flg = flg;
        this.staTm = staTm;
        this.endTm = endTm;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public PrdOffHrsBlkng(String applNbr, String childTyp, short dy) {
        this.prdOffHrsBlkngPK = new PrdOffHrsBlkngPK(applNbr, childTyp, dy);
    }

    public PrdOffHrsBlkngPK getPrdOffHrsBlkngPK() {
        return prdOffHrsBlkngPK;
    }

    public void setPrdOffHrsBlkngPK(PrdOffHrsBlkngPK prdOffHrsBlkngPK) {
        this.prdOffHrsBlkngPK = prdOffHrsBlkngPK;
    }

    public Character getFlg() {
        return flg;
    }

    public void setFlg(Character flg) {
        this.flg = flg;
    }

    public String getStaTm() {
        return staTm;
    }

    public void setStaTm(String staTm) {
        this.staTm = staTm;
    }

    public String getEndTm() {
        return endTm;
    }

    public void setEndTm(String endTm) {
        this.endTm = endTm;
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
        hash += (prdOffHrsBlkngPK != null ? prdOffHrsBlkngPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PrdOffHrsBlkng)) {
            return false;
        }
        PrdOffHrsBlkng other = (PrdOffHrsBlkng) object;
        if ((this.prdOffHrsBlkngPK == null && other.prdOffHrsBlkngPK != null) || (this.prdOffHrsBlkngPK != null && !this.prdOffHrsBlkngPK.equals(other.prdOffHrsBlkngPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.PrdOffHrsBlkng[ prdOffHrsBlkngPK=" + prdOffHrsBlkngPK + " ]";
    }
    
}
