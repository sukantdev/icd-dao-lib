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
@Table(name = "CR_APPL_TERM_INFO", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "CrApplTermInfo.findAll", query = "SELECT c FROM CrApplTermInfo c")})
public class CrApplTermInfo implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CrApplTermInfoPK crApplTermInfoPK;
    @Basic(optional = false)
    @Column(name = "TERM_SFTWR_TYP")
    private String termSftwrTyp;
    @Basic(optional = false)
    @Column(name = "DELV_METHOD")
    private String delvMethod;
    @Basic(optional = false)
    @Column(name = "DID_DNLD")
    private Character didDnld;
    @Basic(optional = false)
    @Column(name = "DID_DPLMNT")
    private Character didDplmnt;
    @Basic(optional = false)
    @Column(name = "TERM_SHIPEE")
    private Character termShipee;
    @Basic(optional = false)
    @Column(name = "DIAL_PREFIX")
    private Character dialPrefix;
    @Basic(optional = false)
    @Column(name = "AUTH_CNTR")
    private Character authCntr;
    @Basic(optional = false)
    @Column(name = "NOTES")
    private String notes;
    @Basic(optional = false)
    @Column(name = "MDY_USR")
    private String mdyUsr;
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

    public CrApplTermInfo() {
    }

    public CrApplTermInfo(CrApplTermInfoPK crApplTermInfoPK) {
        this.crApplTermInfoPK = crApplTermInfoPK;
    }

    public CrApplTermInfo(CrApplTermInfoPK crApplTermInfoPK, String termSftwrTyp, String delvMethod, Character didDnld, Character didDplmnt, Character termShipee, Character dialPrefix, Character authCntr, String notes, String mdyUsr, Date crtTs, String crtUsr, Date mdyTs) {
        this.crApplTermInfoPK = crApplTermInfoPK;
        this.termSftwrTyp = termSftwrTyp;
        this.delvMethod = delvMethod;
        this.didDnld = didDnld;
        this.didDplmnt = didDplmnt;
        this.termShipee = termShipee;
        this.dialPrefix = dialPrefix;
        this.authCntr = authCntr;
        this.notes = notes;
        this.mdyUsr = mdyUsr;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
    }

    public CrApplTermInfo(String applNbr, short seqNbr) {
        this.crApplTermInfoPK = new CrApplTermInfoPK(applNbr, seqNbr);
    }

    public CrApplTermInfoPK getCrApplTermInfoPK() {
        return crApplTermInfoPK;
    }

    public void setCrApplTermInfoPK(CrApplTermInfoPK crApplTermInfoPK) {
        this.crApplTermInfoPK = crApplTermInfoPK;
    }

    public String getTermSftwrTyp() {
        return termSftwrTyp;
    }

    public void setTermSftwrTyp(String termSftwrTyp) {
        this.termSftwrTyp = termSftwrTyp;
    }

    public String getDelvMethod() {
        return delvMethod;
    }

    public void setDelvMethod(String delvMethod) {
        this.delvMethod = delvMethod;
    }

    public Character getDidDnld() {
        return didDnld;
    }

    public void setDidDnld(Character didDnld) {
        this.didDnld = didDnld;
    }

    public Character getDidDplmnt() {
        return didDplmnt;
    }

    public void setDidDplmnt(Character didDplmnt) {
        this.didDplmnt = didDplmnt;
    }

    public Character getTermShipee() {
        return termShipee;
    }

    public void setTermShipee(Character termShipee) {
        this.termShipee = termShipee;
    }

    public Character getDialPrefix() {
        return dialPrefix;
    }

    public void setDialPrefix(Character dialPrefix) {
        this.dialPrefix = dialPrefix;
    }

    public Character getAuthCntr() {
        return authCntr;
    }

    public void setAuthCntr(Character authCntr) {
        this.authCntr = authCntr;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getMdyUsr() {
        return mdyUsr;
    }

    public void setMdyUsr(String mdyUsr) {
        this.mdyUsr = mdyUsr;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (crApplTermInfoPK != null ? crApplTermInfoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CrApplTermInfo)) {
            return false;
        }
        CrApplTermInfo other = (CrApplTermInfo) object;
        if ((this.crApplTermInfoPK == null && other.crApplTermInfoPK != null) || (this.crApplTermInfoPK != null && !this.crApplTermInfoPK.equals(other.crApplTermInfoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.CrApplTermInfo[ crApplTermInfoPK=" + crApplTermInfoPK + " ]";
    }
    
}
