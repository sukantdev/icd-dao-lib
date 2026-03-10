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
@Table(name = "TELE_NOTI_PING_XREF", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "TeleNotiPingXref.findAll", query = "SELECT t FROM TeleNotiPingXref t")})
public class TeleNotiPingXref implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected TeleNotiPingXrefPK teleNotiPingXrefPK;
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

    public TeleNotiPingXref() {
    }

    public TeleNotiPingXref(TeleNotiPingXrefPK teleNotiPingXrefPK) {
        this.teleNotiPingXrefPK = teleNotiPingXrefPK;
    }

    public TeleNotiPingXref(TeleNotiPingXrefPK teleNotiPingXrefPK, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.teleNotiPingXrefPK = teleNotiPingXrefPK;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public TeleNotiPingXref(String acctCd, String custId, Date transTs, String unitNbr, Date cdnRecvTs) {
        this.teleNotiPingXrefPK = new TeleNotiPingXrefPK(acctCd, custId, transTs, unitNbr, cdnRecvTs);
    }

    public TeleNotiPingXrefPK getTeleNotiPingXrefPK() {
        return teleNotiPingXrefPK;
    }

    public void setTeleNotiPingXrefPK(TeleNotiPingXrefPK teleNotiPingXrefPK) {
        this.teleNotiPingXrefPK = teleNotiPingXrefPK;
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
        hash += (teleNotiPingXrefPK != null ? teleNotiPingXrefPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TeleNotiPingXref)) {
            return false;
        }
        TeleNotiPingXref other = (TeleNotiPingXref) object;
        if ((this.teleNotiPingXrefPK == null && other.teleNotiPingXrefPK != null) || (this.teleNotiPingXrefPK != null && !this.teleNotiPingXrefPK.equals(other.teleNotiPingXrefPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.TeleNotiPingXref[ teleNotiPingXrefPK=" + teleNotiPingXrefPK + " ]";
    }
    
}
