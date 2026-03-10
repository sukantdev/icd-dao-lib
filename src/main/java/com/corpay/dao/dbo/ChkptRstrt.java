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
@Table(name = "CHKPT_RSTRT", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "ChkptRstrt.findAll", query = "SELECT c FROM ChkptRstrt c")})
public class ChkptRstrt implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CHKPT_KEY")
    private String chkptKey;
    @Basic(optional = false)
    @Column(name = "CHKPT_NBR")
    private int chkptNbr;
    @Basic(optional = false)
    @Column(name = "CHKPT_RSTRT_KEY")
    private String chkptRstrtKey;
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

    public ChkptRstrt() {
    }

    public ChkptRstrt(String chkptKey) {
        this.chkptKey = chkptKey;
    }

    public ChkptRstrt(String chkptKey, int chkptNbr, String chkptRstrtKey, String crtUsr, Date mdyTs, String mdyUsr, Date crtTs) {
        this.chkptKey = chkptKey;
        this.chkptNbr = chkptNbr;
        this.chkptRstrtKey = chkptRstrtKey;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
        this.crtTs = crtTs;
    }

    public String getChkptKey() {
        return chkptKey;
    }

    public void setChkptKey(String chkptKey) {
        this.chkptKey = chkptKey;
    }

    public int getChkptNbr() {
        return chkptNbr;
    }

    public void setChkptNbr(int chkptNbr) {
        this.chkptNbr = chkptNbr;
    }

    public String getChkptRstrtKey() {
        return chkptRstrtKey;
    }

    public void setChkptRstrtKey(String chkptRstrtKey) {
        this.chkptRstrtKey = chkptRstrtKey;
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
        hash += (chkptKey != null ? chkptKey.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ChkptRstrt)) {
            return false;
        }
        ChkptRstrt other = (ChkptRstrt) object;
        if ((this.chkptKey == null && other.chkptKey != null) || (this.chkptKey != null && !this.chkptKey.equals(other.chkptKey))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.ChkptRstrt[ chkptKey=" + chkptKey + " ]";
    }
    
}
