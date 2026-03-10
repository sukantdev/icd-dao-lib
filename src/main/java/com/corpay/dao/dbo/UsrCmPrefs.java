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
@Table(name = "USR_CM_PREFS", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "UsrCmPrefs.findAll", query = "SELECT u FROM UsrCmPrefs u")})
public class UsrCmPrefs implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "USR_ID")
    private String usrId;
    @Basic(optional = false)
    @Column(name = "EMAIL_PREF_FLG")
    private Character emailPrefFlg;
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
    @Column(name = "EXP_CD_SNGL_ENTRY_FLG")
    private Character expCdSnglEntryFlg;

    public UsrCmPrefs() {
    }

    public UsrCmPrefs(String usrId) {
        this.usrId = usrId;
    }

    public UsrCmPrefs(String usrId, Character emailPrefFlg, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr, Character expCdSnglEntryFlg) {
        this.usrId = usrId;
        this.emailPrefFlg = emailPrefFlg;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
        this.expCdSnglEntryFlg = expCdSnglEntryFlg;
    }

    public String getUsrId() {
        return usrId;
    }

    public void setUsrId(String usrId) {
        this.usrId = usrId;
    }

    public Character getEmailPrefFlg() {
        return emailPrefFlg;
    }

    public void setEmailPrefFlg(Character emailPrefFlg) {
        this.emailPrefFlg = emailPrefFlg;
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

    public Character getExpCdSnglEntryFlg() {
        return expCdSnglEntryFlg;
    }

    public void setExpCdSnglEntryFlg(Character expCdSnglEntryFlg) {
        this.expCdSnglEntryFlg = expCdSnglEntryFlg;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (usrId != null ? usrId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UsrCmPrefs)) {
            return false;
        }
        UsrCmPrefs other = (UsrCmPrefs) object;
        if ((this.usrId == null && other.usrId != null) || (this.usrId != null && !this.usrId.equals(other.usrId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.UsrCmPrefs[ usrId=" + usrId + " ]";
    }
    
}
