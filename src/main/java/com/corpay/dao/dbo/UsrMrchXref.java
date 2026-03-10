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
@Table(name = "USR_MRCH_XREF", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "UsrMrchXref.findAll", query = "SELECT u FROM UsrMrchXref u")})
public class UsrMrchXref implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected UsrMrchXrefPK usrMrchXrefPK;
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
    @Column(name = "CHAIN_FLG")
    private Character chainFlg;

    public UsrMrchXref() {
    }

    public UsrMrchXref(UsrMrchXrefPK usrMrchXrefPK) {
        this.usrMrchXrefPK = usrMrchXrefPK;
    }

    public UsrMrchXref(UsrMrchXrefPK usrMrchXrefPK, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr, Character chainFlg) {
        this.usrMrchXrefPK = usrMrchXrefPK;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
        this.chainFlg = chainFlg;
    }

    public UsrMrchXref(String usrId, String mrchCd) {
        this.usrMrchXrefPK = new UsrMrchXrefPK(usrId, mrchCd);
    }

    public UsrMrchXrefPK getUsrMrchXrefPK() {
        return usrMrchXrefPK;
    }

    public void setUsrMrchXrefPK(UsrMrchXrefPK usrMrchXrefPK) {
        this.usrMrchXrefPK = usrMrchXrefPK;
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

    public Character getChainFlg() {
        return chainFlg;
    }

    public void setChainFlg(Character chainFlg) {
        this.chainFlg = chainFlg;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (usrMrchXrefPK != null ? usrMrchXrefPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UsrMrchXref)) {
            return false;
        }
        UsrMrchXref other = (UsrMrchXref) object;
        if ((this.usrMrchXrefPK == null && other.usrMrchXrefPK != null) || (this.usrMrchXrefPK != null && !this.usrMrchXrefPK.equals(other.usrMrchXrefPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.UsrMrchXref[ usrMrchXrefPK=" + usrMrchXrefPK + " ]";
    }
    
}
