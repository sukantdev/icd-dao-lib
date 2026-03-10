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
import java.util.Date;

/**
 *
 * @author Sukant.Tiwari
 */
@Entity
@Table(name = "CR_APPL_GIFT_CRD", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "CrApplGiftCrd.findAll", query = "SELECT c FROM CrApplGiftCrd c")})
public class CrApplGiftCrd implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "APPL_NBR")
    private String applNbr;
    @Basic(optional = false)
    @Column(name = "ANTICIP_NBR_CARDS")
    private int anticipNbrCards;
    @Basic(optional = false)
    @Column(name = "SRV_INCLS_CARDS")
    private Character srvInclsCards;
    @Basic(optional = false)
    @Column(name = "SRV_INCLS_CARRIERS")
    private Character srvInclsCarriers;
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

    public CrApplGiftCrd() {
    }

    public CrApplGiftCrd(String applNbr) {
        this.applNbr = applNbr;
    }

    public CrApplGiftCrd(String applNbr, int anticipNbrCards, Character srvInclsCards, Character srvInclsCarriers, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.applNbr = applNbr;
        this.anticipNbrCards = anticipNbrCards;
        this.srvInclsCards = srvInclsCards;
        this.srvInclsCarriers = srvInclsCarriers;
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

    public int getAnticipNbrCards() {
        return anticipNbrCards;
    }

    public void setAnticipNbrCards(int anticipNbrCards) {
        this.anticipNbrCards = anticipNbrCards;
    }

    public Character getSrvInclsCards() {
        return srvInclsCards;
    }

    public void setSrvInclsCards(Character srvInclsCards) {
        this.srvInclsCards = srvInclsCards;
    }

    public Character getSrvInclsCarriers() {
        return srvInclsCarriers;
    }

    public void setSrvInclsCarriers(Character srvInclsCarriers) {
        this.srvInclsCarriers = srvInclsCarriers;
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
        if (!(object instanceof CrApplGiftCrd)) {
            return false;
        }
        CrApplGiftCrd other = (CrApplGiftCrd) object;
        if ((this.applNbr == null && other.applNbr != null) || (this.applNbr != null && !this.applNbr.equals(other.applNbr))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.CrApplGiftCrd[ applNbr=" + applNbr + " ]";
    }
    
}
