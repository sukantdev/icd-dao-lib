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
@Table(name = "USR_CRD_ORD", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "UsrCrdOrd.findAll", query = "SELECT u FROM UsrCrdOrd u")})
public class UsrCrdOrd implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CRD_NBR")
    private String crdNbr;
    @Basic(optional = false)
    @Column(name = "USR_ID")
    private String usrId;
    @Column(name = "ORD_RCVD_DT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ordRcvdDt;
    @Basic(optional = false)
    @Column(name = "TRKG_NBR")
    private String trkgNbr;
    @Basic(optional = false)
    @Column(name = "CARR_ID")
    private short carrId;
    @Basic(optional = false)
    @Column(name = "EMAIL_FLG")
    private Character emailFlg;
    @Column(name = "SHP_DT")
    @Temporal(TemporalType.DATE)
    private Date shpDt;
    @Basic(optional = false)
    @Column(name = "ORD_STAT")
    private String ordStat;
    @Basic(optional = false)
    @Column(name = "EXC")
    private String exc;
    @Basic(optional = false)
    @Column(name = "CUST_ID")
    private String custId;
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

    public UsrCrdOrd() {
    }

    public UsrCrdOrd(String crdNbr) {
        this.crdNbr = crdNbr;
    }

    public UsrCrdOrd(String crdNbr, String usrId, String trkgNbr, short carrId, Character emailFlg, String ordStat, String exc, String custId, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.crdNbr = crdNbr;
        this.usrId = usrId;
        this.trkgNbr = trkgNbr;
        this.carrId = carrId;
        this.emailFlg = emailFlg;
        this.ordStat = ordStat;
        this.exc = exc;
        this.custId = custId;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public String getCrdNbr() {
        return crdNbr;
    }

    public void setCrdNbr(String crdNbr) {
        this.crdNbr = crdNbr;
    }

    public String getUsrId() {
        return usrId;
    }

    public void setUsrId(String usrId) {
        this.usrId = usrId;
    }

    public Date getOrdRcvdDt() {
        return ordRcvdDt;
    }

    public void setOrdRcvdDt(Date ordRcvdDt) {
        this.ordRcvdDt = ordRcvdDt;
    }

    public String getTrkgNbr() {
        return trkgNbr;
    }

    public void setTrkgNbr(String trkgNbr) {
        this.trkgNbr = trkgNbr;
    }

    public short getCarrId() {
        return carrId;
    }

    public void setCarrId(short carrId) {
        this.carrId = carrId;
    }

    public Character getEmailFlg() {
        return emailFlg;
    }

    public void setEmailFlg(Character emailFlg) {
        this.emailFlg = emailFlg;
    }

    public Date getShpDt() {
        return shpDt;
    }

    public void setShpDt(Date shpDt) {
        this.shpDt = shpDt;
    }

    public String getOrdStat() {
        return ordStat;
    }

    public void setOrdStat(String ordStat) {
        this.ordStat = ordStat;
    }

    public String getExc() {
        return exc;
    }

    public void setExc(String exc) {
        this.exc = exc;
    }

    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId;
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
        hash += (crdNbr != null ? crdNbr.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UsrCrdOrd)) {
            return false;
        }
        UsrCrdOrd other = (UsrCrdOrd) object;
        if ((this.crdNbr == null && other.crdNbr != null) || (this.crdNbr != null && !this.crdNbr.equals(other.crdNbr))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.UsrCrdOrd[ crdNbr=" + crdNbr + " ]";
    }
    
}
