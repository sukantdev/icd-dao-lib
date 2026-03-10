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
@Table(name = "CRD_CONTACTS", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "CrdContacts.findAll", query = "SELECT c FROM CrdContacts c")})
public class CrdContacts implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CRD_CONTACT_ID")
    private String crdContactId;
    @Basic(optional = false)
    @Column(name = "TYPE_FLG")
    private Character typeFlg;
    @Basic(optional = false)
    @Column(name = "CONTACT_INFO_TXT")
    private String contactInfoTxt;
    @Basic(optional = false)
    @Column(name = "STAT_CD")
    private Character statCd;
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

    public CrdContacts() {
    }

    public CrdContacts(String crdContactId) {
        this.crdContactId = crdContactId;
    }

    public CrdContacts(String crdContactId, Character typeFlg, String contactInfoTxt, Character statCd, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.crdContactId = crdContactId;
        this.typeFlg = typeFlg;
        this.contactInfoTxt = contactInfoTxt;
        this.statCd = statCd;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public String getCrdContactId() {
        return crdContactId;
    }

    public void setCrdContactId(String crdContactId) {
        this.crdContactId = crdContactId;
    }

    public Character getTypeFlg() {
        return typeFlg;
    }

    public void setTypeFlg(Character typeFlg) {
        this.typeFlg = typeFlg;
    }

    public String getContactInfoTxt() {
        return contactInfoTxt;
    }

    public void setContactInfoTxt(String contactInfoTxt) {
        this.contactInfoTxt = contactInfoTxt;
    }

    public Character getStatCd() {
        return statCd;
    }

    public void setStatCd(Character statCd) {
        this.statCd = statCd;
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
        hash += (crdContactId != null ? crdContactId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CrdContacts)) {
            return false;
        }
        CrdContacts other = (CrdContacts) object;
        if ((this.crdContactId == null && other.crdContactId != null) || (this.crdContactId != null && !this.crdContactId.equals(other.crdContactId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.CrdContacts[ crdContactId=" + crdContactId + " ]";
    }
    
}
