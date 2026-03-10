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
@Table(name = "INV_MISC", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "InvMisc.findAll", query = "SELECT i FROM InvMisc i")})
public class InvMisc implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected InvMiscPK invMiscPK;
    @Basic(optional = false)
    @Column(name = "MISC1")
    private String misc1;
    @Basic(optional = false)
    @Column(name = "MISC2")
    private String misc2;
    @Basic(optional = false)
    @Column(name = "MISC3")
    private String misc3;
    @Basic(optional = false)
    @Column(name = "MISC4")
    private String misc4;
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

    public InvMisc() {
    }

    public InvMisc(InvMiscPK invMiscPK) {
        this.invMiscPK = invMiscPK;
    }

    public InvMisc(InvMiscPK invMiscPK, String misc1, String misc2, String misc3, String misc4, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.invMiscPK = invMiscPK;
        this.misc1 = misc1;
        this.misc2 = misc2;
        this.misc3 = misc3;
        this.misc4 = misc4;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public InvMisc(Date miscTs, short miscSeqNbr) {
        this.invMiscPK = new InvMiscPK(miscTs, miscSeqNbr);
    }

    public InvMiscPK getInvMiscPK() {
        return invMiscPK;
    }

    public void setInvMiscPK(InvMiscPK invMiscPK) {
        this.invMiscPK = invMiscPK;
    }

    public String getMisc1() {
        return misc1;
    }

    public void setMisc1(String misc1) {
        this.misc1 = misc1;
    }

    public String getMisc2() {
        return misc2;
    }

    public void setMisc2(String misc2) {
        this.misc2 = misc2;
    }

    public String getMisc3() {
        return misc3;
    }

    public void setMisc3(String misc3) {
        this.misc3 = misc3;
    }

    public String getMisc4() {
        return misc4;
    }

    public void setMisc4(String misc4) {
        this.misc4 = misc4;
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
        hash += (invMiscPK != null ? invMiscPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InvMisc)) {
            return false;
        }
        InvMisc other = (InvMisc) object;
        if ((this.invMiscPK == null && other.invMiscPK != null) || (this.invMiscPK != null && !this.invMiscPK.equals(other.invMiscPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.InvMisc[ invMiscPK=" + invMiscPK + " ]";
    }
    
}
