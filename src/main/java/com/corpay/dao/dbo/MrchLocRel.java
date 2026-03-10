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
@Table(name = "MRCH_LOC_REL", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "MrchLocRel.findAll", query = "SELECT m FROM MrchLocRel m")})
public class MrchLocRel implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected MrchLocRelPK mrchLocRelPK;
    @Basic(optional = false)
    @Column(name = "NETW_FLG")
    private Character netwFlg;
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

    public MrchLocRel() {
    }

    public MrchLocRel(MrchLocRelPK mrchLocRelPK) {
        this.mrchLocRelPK = mrchLocRelPK;
    }

    public MrchLocRel(MrchLocRelPK mrchLocRelPK, Character netwFlg, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.mrchLocRelPK = mrchLocRelPK;
        this.netwFlg = netwFlg;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public MrchLocRel(String custId, String marketerCd) {
        this.mrchLocRelPK = new MrchLocRelPK(custId, marketerCd);
    }

    public MrchLocRelPK getMrchLocRelPK() {
        return mrchLocRelPK;
    }

    public void setMrchLocRelPK(MrchLocRelPK mrchLocRelPK) {
        this.mrchLocRelPK = mrchLocRelPK;
    }

    public Character getNetwFlg() {
        return netwFlg;
    }

    public void setNetwFlg(Character netwFlg) {
        this.netwFlg = netwFlg;
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
        hash += (mrchLocRelPK != null ? mrchLocRelPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MrchLocRel)) {
            return false;
        }
        MrchLocRel other = (MrchLocRel) object;
        if ((this.mrchLocRelPK == null && other.mrchLocRelPK != null) || (this.mrchLocRelPK != null && !this.mrchLocRelPK.equals(other.mrchLocRelPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.MrchLocRel[ mrchLocRelPK=" + mrchLocRelPK + " ]";
    }
    
}
