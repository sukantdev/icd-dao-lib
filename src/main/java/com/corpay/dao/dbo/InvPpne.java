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
@Table(name = "INV_PPNE", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "InvPpne.findAll", query = "SELECT i FROM InvPpne i")})
public class InvPpne implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected InvPpnePK invPpnePK;
    @Basic(optional = false)
    @Column(name = "CUST_NM")
    private String custNm;
    @Basic(optional = false)
    @Column(name = "CUST_ACCT_NBR")
    private String custAcctNbr;
    @Basic(optional = false)
    @Column(name = "DSTRC_NBR")
    private String dstrcNbr;
    @Basic(optional = false)
    @Column(name = "TERM_NBR")
    private String termNbr;
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

    public InvPpne() {
    }

    public InvPpne(InvPpnePK invPpnePK) {
        this.invPpnePK = invPpnePK;
    }

    public InvPpne(InvPpnePK invPpnePK, String custNm, String custAcctNbr, String dstrcNbr, String termNbr, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.invPpnePK = invPpnePK;
        this.custNm = custNm;
        this.custAcctNbr = custAcctNbr;
        this.dstrcNbr = dstrcNbr;
        this.termNbr = termNbr;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public InvPpne(Date ppneTs, short ppneSeqNbr) {
        this.invPpnePK = new InvPpnePK(ppneTs, ppneSeqNbr);
    }

    public InvPpnePK getInvPpnePK() {
        return invPpnePK;
    }

    public void setInvPpnePK(InvPpnePK invPpnePK) {
        this.invPpnePK = invPpnePK;
    }

    public String getCustNm() {
        return custNm;
    }

    public void setCustNm(String custNm) {
        this.custNm = custNm;
    }

    public String getCustAcctNbr() {
        return custAcctNbr;
    }

    public void setCustAcctNbr(String custAcctNbr) {
        this.custAcctNbr = custAcctNbr;
    }

    public String getDstrcNbr() {
        return dstrcNbr;
    }

    public void setDstrcNbr(String dstrcNbr) {
        this.dstrcNbr = dstrcNbr;
    }

    public String getTermNbr() {
        return termNbr;
    }

    public void setTermNbr(String termNbr) {
        this.termNbr = termNbr;
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
        hash += (invPpnePK != null ? invPpnePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InvPpne)) {
            return false;
        }
        InvPpne other = (InvPpne) object;
        if ((this.invPpnePK == null && other.invPpnePK != null) || (this.invPpnePK != null && !this.invPpnePK.equals(other.invPpnePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.InvPpne[ invPpnePK=" + invPpnePK + " ]";
    }
    
}
