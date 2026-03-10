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
@Table(name = "MRCH_LOC_MARKETER", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "MrchLocMarketer.findAll", query = "SELECT m FROM MrchLocMarketer m")})
public class MrchLocMarketer implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "MARKETER_CD")
    private String marketerCd;
    @Basic(optional = false)
    @Column(name = "MARKETER_NM")
    private String marketerNm;
    @Basic(optional = false)
    @Column(name = "TYPE_CD")
    private Character typeCd;
    @Basic(optional = false)
    @Column(name = "BILLING_CD")
    private String billingCd;
    @Basic(optional = false)
    @Column(name = "CUST_ID")
    private String custId;
    @Basic(optional = false)
    @Column(name = "SEQ_NBR")
    private short seqNbr;
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

    public MrchLocMarketer() {
    }

    public MrchLocMarketer(String marketerCd) {
        this.marketerCd = marketerCd;
    }

    public MrchLocMarketer(String marketerCd, String marketerNm, Character typeCd, String billingCd, String custId, short seqNbr, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.marketerCd = marketerCd;
        this.marketerNm = marketerNm;
        this.typeCd = typeCd;
        this.billingCd = billingCd;
        this.custId = custId;
        this.seqNbr = seqNbr;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public String getMarketerCd() {
        return marketerCd;
    }

    public void setMarketerCd(String marketerCd) {
        this.marketerCd = marketerCd;
    }

    public String getMarketerNm() {
        return marketerNm;
    }

    public void setMarketerNm(String marketerNm) {
        this.marketerNm = marketerNm;
    }

    public Character getTypeCd() {
        return typeCd;
    }

    public void setTypeCd(Character typeCd) {
        this.typeCd = typeCd;
    }

    public String getBillingCd() {
        return billingCd;
    }

    public void setBillingCd(String billingCd) {
        this.billingCd = billingCd;
    }

    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId;
    }

    public short getSeqNbr() {
        return seqNbr;
    }

    public void setSeqNbr(short seqNbr) {
        this.seqNbr = seqNbr;
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
        hash += (marketerCd != null ? marketerCd.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MrchLocMarketer)) {
            return false;
        }
        MrchLocMarketer other = (MrchLocMarketer) object;
        if ((this.marketerCd == null && other.marketerCd != null) || (this.marketerCd != null && !this.marketerCd.equals(other.marketerCd))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.MrchLocMarketer[ marketerCd=" + marketerCd + " ]";
    }
    
}
