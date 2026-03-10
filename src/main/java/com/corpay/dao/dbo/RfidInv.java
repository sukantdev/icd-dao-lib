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
@Table(name = "RFID_INV", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "RfidInv.findAll", query = "SELECT r FROM RfidInv r")})
public class RfidInv implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "RFID_UNIT_TRLR_NBR")
    private String rfidUnitTrlrNbr;
    @Basic(optional = false)
    @Column(name = "RFID_NBR")
    private String rfidNbr;
    @Basic(optional = false)
    @Column(name = "RFID_ACCT_CD")
    private String rfidAcctCd;
    @Basic(optional = false)
    @Column(name = "RFID_CRT_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date rfidCrtTs;
    @Basic(optional = false)
    @Column(name = "RFID_CRT_USR")
    private String rfidCrtUsr;
    @Basic(optional = false)
    @Column(name = "RFID_STAT_CD")
    private Character rfidStatCd;
    @Basic(optional = false)
    @Column(name = "RFID_TAG_TYP_CD")
    private Character rfidTagTypCd;
    @Basic(optional = false)
    @Column(name = "RFID_TAG_TYP_VER_CD")
    private Character rfidTagTypVerCd;
    @Basic(optional = false)
    @Column(name = "RFID_BTCH_ID")
    private String rfidBtchId;
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

    public RfidInv() {
    }

    public RfidInv(String rfidUnitTrlrNbr) {
        this.rfidUnitTrlrNbr = rfidUnitTrlrNbr;
    }

    public RfidInv(String rfidUnitTrlrNbr, String rfidNbr, String rfidAcctCd, Date rfidCrtTs, String rfidCrtUsr, Character rfidStatCd, Character rfidTagTypCd, Character rfidTagTypVerCd, String rfidBtchId, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.rfidUnitTrlrNbr = rfidUnitTrlrNbr;
        this.rfidNbr = rfidNbr;
        this.rfidAcctCd = rfidAcctCd;
        this.rfidCrtTs = rfidCrtTs;
        this.rfidCrtUsr = rfidCrtUsr;
        this.rfidStatCd = rfidStatCd;
        this.rfidTagTypCd = rfidTagTypCd;
        this.rfidTagTypVerCd = rfidTagTypVerCd;
        this.rfidBtchId = rfidBtchId;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public String getRfidUnitTrlrNbr() {
        return rfidUnitTrlrNbr;
    }

    public void setRfidUnitTrlrNbr(String rfidUnitTrlrNbr) {
        this.rfidUnitTrlrNbr = rfidUnitTrlrNbr;
    }

    public String getRfidNbr() {
        return rfidNbr;
    }

    public void setRfidNbr(String rfidNbr) {
        this.rfidNbr = rfidNbr;
    }

    public String getRfidAcctCd() {
        return rfidAcctCd;
    }

    public void setRfidAcctCd(String rfidAcctCd) {
        this.rfidAcctCd = rfidAcctCd;
    }

    public Date getRfidCrtTs() {
        return rfidCrtTs;
    }

    public void setRfidCrtTs(Date rfidCrtTs) {
        this.rfidCrtTs = rfidCrtTs;
    }

    public String getRfidCrtUsr() {
        return rfidCrtUsr;
    }

    public void setRfidCrtUsr(String rfidCrtUsr) {
        this.rfidCrtUsr = rfidCrtUsr;
    }

    public Character getRfidStatCd() {
        return rfidStatCd;
    }

    public void setRfidStatCd(Character rfidStatCd) {
        this.rfidStatCd = rfidStatCd;
    }

    public Character getRfidTagTypCd() {
        return rfidTagTypCd;
    }

    public void setRfidTagTypCd(Character rfidTagTypCd) {
        this.rfidTagTypCd = rfidTagTypCd;
    }

    public Character getRfidTagTypVerCd() {
        return rfidTagTypVerCd;
    }

    public void setRfidTagTypVerCd(Character rfidTagTypVerCd) {
        this.rfidTagTypVerCd = rfidTagTypVerCd;
    }

    public String getRfidBtchId() {
        return rfidBtchId;
    }

    public void setRfidBtchId(String rfidBtchId) {
        this.rfidBtchId = rfidBtchId;
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
        hash += (rfidUnitTrlrNbr != null ? rfidUnitTrlrNbr.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RfidInv)) {
            return false;
        }
        RfidInv other = (RfidInv) object;
        if ((this.rfidUnitTrlrNbr == null && other.rfidUnitTrlrNbr != null) || (this.rfidUnitTrlrNbr != null && !this.rfidUnitTrlrNbr.equals(other.rfidUnitTrlrNbr))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.RfidInv[ rfidUnitTrlrNbr=" + rfidUnitTrlrNbr + " ]";
    }
    
}
