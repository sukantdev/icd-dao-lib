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
@Table(name = "PLSD_USR_ACCT_REL", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "PlsdUsrAcctRel.findAll", query = "SELECT p FROM PlsdUsrAcctRel p")})
public class PlsdUsrAcctRel implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PlsdUsrAcctRelPK plsdUsrAcctRelPK;
    @Basic(optional = false)
    @Column(name = "PLSD_DFLT_ACCT")
    private Character plsdDfltAcct;
    @Basic(optional = false)
    @Column(name = "PLSD_APPL_TYP_CD")
    private String plsdApplTypCd;
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
    @Column(name = "CRT_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date crtTs;

    public PlsdUsrAcctRel() {
    }

    public PlsdUsrAcctRel(PlsdUsrAcctRelPK plsdUsrAcctRelPK) {
        this.plsdUsrAcctRelPK = plsdUsrAcctRelPK;
    }

    public PlsdUsrAcctRel(PlsdUsrAcctRelPK plsdUsrAcctRelPK, Character plsdDfltAcct, String plsdApplTypCd, String crtUsr, Date mdyTs, String mdyUsr, Date crtTs) {
        this.plsdUsrAcctRelPK = plsdUsrAcctRelPK;
        this.plsdDfltAcct = plsdDfltAcct;
        this.plsdApplTypCd = plsdApplTypCd;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
        this.crtTs = crtTs;
    }

    public PlsdUsrAcctRel(String usrId, String plsdAcctNbr) {
        this.plsdUsrAcctRelPK = new PlsdUsrAcctRelPK(usrId, plsdAcctNbr);
    }

    public PlsdUsrAcctRelPK getPlsdUsrAcctRelPK() {
        return plsdUsrAcctRelPK;
    }

    public void setPlsdUsrAcctRelPK(PlsdUsrAcctRelPK plsdUsrAcctRelPK) {
        this.plsdUsrAcctRelPK = plsdUsrAcctRelPK;
    }

    public Character getPlsdDfltAcct() {
        return plsdDfltAcct;
    }

    public void setPlsdDfltAcct(Character plsdDfltAcct) {
        this.plsdDfltAcct = plsdDfltAcct;
    }

    public String getPlsdApplTypCd() {
        return plsdApplTypCd;
    }

    public void setPlsdApplTypCd(String plsdApplTypCd) {
        this.plsdApplTypCd = plsdApplTypCd;
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

    public Date getCrtTs() {
        return crtTs;
    }

    public void setCrtTs(Date crtTs) {
        this.crtTs = crtTs;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (plsdUsrAcctRelPK != null ? plsdUsrAcctRelPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PlsdUsrAcctRel)) {
            return false;
        }
        PlsdUsrAcctRel other = (PlsdUsrAcctRel) object;
        if ((this.plsdUsrAcctRelPK == null && other.plsdUsrAcctRelPK != null) || (this.plsdUsrAcctRelPK != null && !this.plsdUsrAcctRelPK.equals(other.plsdUsrAcctRelPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.PlsdUsrAcctRel[ plsdUsrAcctRelPK=" + plsdUsrAcctRelPK + " ]";
    }
    
}
