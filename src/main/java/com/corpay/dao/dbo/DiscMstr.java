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
@Table(name = "DISC_MSTR", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "DiscMstr.findAll", query = "SELECT d FROM DiscMstr d")})
public class DiscMstr implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DiscMstrPK discMstrPK;
    @Basic(optional = false)
    @Column(name = "MSTR_CD")
    private String mstrCd;
    @Basic(optional = false)
    @Column(name = "MSTR_SW_CD")
    private Character mstrSwCd;
    @Basic(optional = false)
    @Column(name = "UPDATE_FLG")
    private Character updateFlg;
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

    public DiscMstr() {
    }

    public DiscMstr(DiscMstrPK discMstrPK) {
        this.discMstrPK = discMstrPK;
    }

    public DiscMstr(DiscMstrPK discMstrPK, String mstrCd, Character mstrSwCd, Character updateFlg, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.discMstrPK = discMstrPK;
        this.mstrCd = mstrCd;
        this.mstrSwCd = mstrSwCd;
        this.updateFlg = updateFlg;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public DiscMstr(String acctNbr, String custId) {
        this.discMstrPK = new DiscMstrPK(acctNbr, custId);
    }

    public DiscMstrPK getDiscMstrPK() {
        return discMstrPK;
    }

    public void setDiscMstrPK(DiscMstrPK discMstrPK) {
        this.discMstrPK = discMstrPK;
    }

    public String getMstrCd() {
        return mstrCd;
    }

    public void setMstrCd(String mstrCd) {
        this.mstrCd = mstrCd;
    }

    public Character getMstrSwCd() {
        return mstrSwCd;
    }

    public void setMstrSwCd(Character mstrSwCd) {
        this.mstrSwCd = mstrSwCd;
    }

    public Character getUpdateFlg() {
        return updateFlg;
    }

    public void setUpdateFlg(Character updateFlg) {
        this.updateFlg = updateFlg;
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
        hash += (discMstrPK != null ? discMstrPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DiscMstr)) {
            return false;
        }
        DiscMstr other = (DiscMstr) object;
        if ((this.discMstrPK == null && other.discMstrPK != null) || (this.discMstrPK != null && !this.discMstrPK.equals(other.discMstrPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.DiscMstr[ discMstrPK=" + discMstrPK + " ]";
    }
    
}
