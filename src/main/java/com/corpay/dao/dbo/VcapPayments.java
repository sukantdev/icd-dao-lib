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
@Table(name = "VCAP_PAYMENTS", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "VcapPayments.findAll", query = "SELECT v FROM VcapPayments v")})
public class VcapPayments implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected VcapPaymentsPK vcapPaymentsPK;
    @Basic(optional = false)
    @Column(name = "FUNDS_RCVD_FLG")
    private Character fundsRcvdFlg;
    @Basic(optional = false)
    @Column(name = "RQST_TYP")
    private String rqstTyp;
    @Basic(optional = false)
    @Column(name = "MDY_USR")
    private String mdyUsr;
    @Basic(optional = false)
    @Column(name = "MDY_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date mdyTs;
    @Basic(optional = false)
    @Column(name = "CRT_USR")
    private String crtUsr;
    @Basic(optional = false)
    @Column(name = "CRT_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date crtTs;

    public VcapPayments() {
    }

    public VcapPayments(VcapPaymentsPK vcapPaymentsPK) {
        this.vcapPaymentsPK = vcapPaymentsPK;
    }

    public VcapPayments(VcapPaymentsPK vcapPaymentsPK, Character fundsRcvdFlg, String rqstTyp, String mdyUsr, Date mdyTs, String crtUsr, Date crtTs) {
        this.vcapPaymentsPK = vcapPaymentsPK;
        this.fundsRcvdFlg = fundsRcvdFlg;
        this.rqstTyp = rqstTyp;
        this.mdyUsr = mdyUsr;
        this.mdyTs = mdyTs;
        this.crtUsr = crtUsr;
        this.crtTs = crtTs;
    }

    public VcapPayments(String batchId, long fileNbr, String custId, String acctNbr) {
        this.vcapPaymentsPK = new VcapPaymentsPK(batchId, fileNbr, custId, acctNbr);
    }

    public VcapPaymentsPK getVcapPaymentsPK() {
        return vcapPaymentsPK;
    }

    public void setVcapPaymentsPK(VcapPaymentsPK vcapPaymentsPK) {
        this.vcapPaymentsPK = vcapPaymentsPK;
    }

    public Character getFundsRcvdFlg() {
        return fundsRcvdFlg;
    }

    public void setFundsRcvdFlg(Character fundsRcvdFlg) {
        this.fundsRcvdFlg = fundsRcvdFlg;
    }

    public String getRqstTyp() {
        return rqstTyp;
    }

    public void setRqstTyp(String rqstTyp) {
        this.rqstTyp = rqstTyp;
    }

    public String getMdyUsr() {
        return mdyUsr;
    }

    public void setMdyUsr(String mdyUsr) {
        this.mdyUsr = mdyUsr;
    }

    public Date getMdyTs() {
        return mdyTs;
    }

    public void setMdyTs(Date mdyTs) {
        this.mdyTs = mdyTs;
    }

    public String getCrtUsr() {
        return crtUsr;
    }

    public void setCrtUsr(String crtUsr) {
        this.crtUsr = crtUsr;
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
        hash += (vcapPaymentsPK != null ? vcapPaymentsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof VcapPayments)) {
            return false;
        }
        VcapPayments other = (VcapPayments) object;
        if ((this.vcapPaymentsPK == null && other.vcapPaymentsPK != null) || (this.vcapPaymentsPK != null && !this.vcapPaymentsPK.equals(other.vcapPaymentsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.VcapPayments[ vcapPaymentsPK=" + vcapPaymentsPK + " ]";
    }
    
}
