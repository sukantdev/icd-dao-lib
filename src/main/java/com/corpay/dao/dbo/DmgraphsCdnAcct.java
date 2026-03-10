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
@Table(name = "DMGRAPHS_CDN_ACCT", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "DmgraphsCdnAcct.findAll", query = "SELECT d FROM DmgraphsCdnAcct d")})
public class DmgraphsCdnAcct implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DmgraphsCdnAcctPK dmgraphsCdnAcctPK;
    @Basic(optional = false)
    @Column(name = "CDN_ACCT")
    private String cdnAcct;
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

    public DmgraphsCdnAcct() {
    }

    public DmgraphsCdnAcct(DmgraphsCdnAcctPK dmgraphsCdnAcctPK) {
        this.dmgraphsCdnAcctPK = dmgraphsCdnAcctPK;
    }

    public DmgraphsCdnAcct(DmgraphsCdnAcctPK dmgraphsCdnAcctPK, String cdnAcct, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.dmgraphsCdnAcctPK = dmgraphsCdnAcctPK;
        this.cdnAcct = cdnAcct;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public DmgraphsCdnAcct(String mmsNbr, short seqNbr) {
        this.dmgraphsCdnAcctPK = new DmgraphsCdnAcctPK(mmsNbr, seqNbr);
    }

    public DmgraphsCdnAcctPK getDmgraphsCdnAcctPK() {
        return dmgraphsCdnAcctPK;
    }

    public void setDmgraphsCdnAcctPK(DmgraphsCdnAcctPK dmgraphsCdnAcctPK) {
        this.dmgraphsCdnAcctPK = dmgraphsCdnAcctPK;
    }

    public String getCdnAcct() {
        return cdnAcct;
    }

    public void setCdnAcct(String cdnAcct) {
        this.cdnAcct = cdnAcct;
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
        hash += (dmgraphsCdnAcctPK != null ? dmgraphsCdnAcctPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DmgraphsCdnAcct)) {
            return false;
        }
        DmgraphsCdnAcct other = (DmgraphsCdnAcct) object;
        if ((this.dmgraphsCdnAcctPK == null && other.dmgraphsCdnAcctPK != null) || (this.dmgraphsCdnAcctPK != null && !this.dmgraphsCdnAcctPK.equals(other.dmgraphsCdnAcctPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.DmgraphsCdnAcct[ dmgraphsCdnAcctPK=" + dmgraphsCdnAcctPK + " ]";
    }
    
}
