/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.corpay.dao.cxxcow;

import jakarta.persistence.Basic;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

/**
 *
 * @author Sukant.Tiwari
 */
@Entity
@Table(name = "CUST_DRIVER", catalog = "", schema = "CXXCOW")
@NamedQueries({
    @NamedQuery(name = "CustDriver.findAll", query = "SELECT c FROM CustDriver c"),
    @NamedQuery(name = "CustDriver.findByDrvrCustId", query = "SELECT c FROM CustDriver c WHERE c.custDriverPK.drvrCustId = :drvrCustId"),
    @NamedQuery(name = "CustDriver.findByDrvrId", query = "SELECT c FROM CustDriver c WHERE c.custDriverPK.drvrId = :drvrId"),
    @NamedQuery(name = "CustDriver.findByDrvrLastNm", query = "SELECT c FROM CustDriver c WHERE c.drvrLastNm = :drvrLastNm"),
    @NamedQuery(name = "CustDriver.findByDrvrFirstNm", query = "SELECT c FROM CustDriver c WHERE c.drvrFirstNm = :drvrFirstNm"),
    @NamedQuery(name = "CustDriver.findByDrvrLicNbr", query = "SELECT c FROM CustDriver c WHERE c.drvrLicNbr = :drvrLicNbr"),
    @NamedQuery(name = "CustDriver.findByDrvrStateCd", query = "SELECT c FROM CustDriver c WHERE c.drvrStateCd = :drvrStateCd"),
    @NamedQuery(name = "CustDriver.findByDrvrUpdateTs", query = "SELECT c FROM CustDriver c WHERE c.drvrUpdateTs = :drvrUpdateTs"),
    @NamedQuery(name = "CustDriver.findByIdMisc1", query = "SELECT c FROM CustDriver c WHERE c.idMisc1 = :idMisc1"),
    @NamedQuery(name = "CustDriver.findByIdMisc2", query = "SELECT c FROM CustDriver c WHERE c.idMisc2 = :idMisc2"),
    @NamedQuery(name = "CustDriver.findByDrvrIdOnHoldFlg", query = "SELECT c FROM CustDriver c WHERE c.drvrIdOnHoldFlg = :drvrIdOnHoldFlg"),
    @NamedQuery(name = "CustDriver.findByDrvrIdHoldRelDt", query = "SELECT c FROM CustDriver c WHERE c.drvrIdHoldRelDt = :drvrIdHoldRelDt"),
    @NamedQuery(name = "CustDriver.findByDrvrIdHoldRelTm", query = "SELECT c FROM CustDriver c WHERE c.drvrIdHoldRelTm = :drvrIdHoldRelTm"),
    @NamedQuery(name = "CustDriver.findByDrvrEmailAddr", query = "SELECT c FROM CustDriver c WHERE c.drvrEmailAddr = :drvrEmailAddr"),
    @NamedQuery(name = "CustDriver.findByDrvrPhoneNbr", query = "SELECT c FROM CustDriver c WHERE c.drvrPhoneNbr = :drvrPhoneNbr"),
    @NamedQuery(name = "CustDriver.findByRowChgTs", query = "SELECT c FROM CustDriver c WHERE c.rowChgTs = :rowChgTs")})
public class CustDriver implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CustDriverPK custDriverPK;
    @Basic(optional = false)
    @Column(name = "DRVR_LAST_NM")
    private String drvrLastNm;
    @Basic(optional = false)
    @Column(name = "DRVR_FIRST_NM")
    private String drvrFirstNm;
    @Basic(optional = false)
    @Column(name = "DRVR_LIC_NBR")
    private String drvrLicNbr;
    @Basic(optional = false)
    @Column(name = "DRVR_STATE_CD")
    private String drvrStateCd;
    @Basic(optional = false)
    @Column(name = "DRVR_UPDATE_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date drvrUpdateTs;
    @Basic(optional = false)
    @Column(name = "ID_MISC1")
    private String idMisc1;
    @Basic(optional = false)
    @Column(name = "ID_MISC2")
    private String idMisc2;
    @Basic(optional = false)
    @Column(name = "DRVR_ID_ON_HOLD_FLG")
    private Character drvrIdOnHoldFlg;
    @Basic(optional = false)
    @Column(name = "DRVR_ID_HOLD_REL_DT")
    @Temporal(TemporalType.DATE)
    private Date drvrIdHoldRelDt;
    @Basic(optional = false)
    @Column(name = "DRVR_ID_HOLD_REL_TM")
    private short drvrIdHoldRelTm;
    @Basic(optional = false)
    @Column(name = "DRVR_EMAIL_ADDR")
    private String drvrEmailAddr;
    @Basic(optional = false)
    @Column(name = "DRVR_PHONE_NBR")
    private String drvrPhoneNbr;
    @Basic(optional = false)
    @Column(name = "ROW_CHG_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date rowChgTs;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "custDriver")
    private Collection<CustDrvrGrps> custDrvrGrpsCollection;

    public CustDriver() {
    }

    public CustDriver(CustDriverPK custDriverPK) {
        this.custDriverPK = custDriverPK;
    }

    public CustDriver(CustDriverPK custDriverPK, String drvrLastNm, String drvrFirstNm, String drvrLicNbr, String drvrStateCd, Date drvrUpdateTs, String idMisc1, String idMisc2, Character drvrIdOnHoldFlg, Date drvrIdHoldRelDt, short drvrIdHoldRelTm, String drvrEmailAddr, String drvrPhoneNbr, Date rowChgTs) {
        this.custDriverPK = custDriverPK;
        this.drvrLastNm = drvrLastNm;
        this.drvrFirstNm = drvrFirstNm;
        this.drvrLicNbr = drvrLicNbr;
        this.drvrStateCd = drvrStateCd;
        this.drvrUpdateTs = drvrUpdateTs;
        this.idMisc1 = idMisc1;
        this.idMisc2 = idMisc2;
        this.drvrIdOnHoldFlg = drvrIdOnHoldFlg;
        this.drvrIdHoldRelDt = drvrIdHoldRelDt;
        this.drvrIdHoldRelTm = drvrIdHoldRelTm;
        this.drvrEmailAddr = drvrEmailAddr;
        this.drvrPhoneNbr = drvrPhoneNbr;
        this.rowChgTs = rowChgTs;
    }

    public CustDriver(String drvrCustId, String drvrId) {
        this.custDriverPK = new CustDriverPK(drvrCustId, drvrId);
    }

    public CustDriverPK getCustDriverPK() {
        return custDriverPK;
    }

    public void setCustDriverPK(CustDriverPK custDriverPK) {
        this.custDriverPK = custDriverPK;
    }

    public String getDrvrLastNm() {
        return drvrLastNm;
    }

    public void setDrvrLastNm(String drvrLastNm) {
        this.drvrLastNm = drvrLastNm;
    }

    public String getDrvrFirstNm() {
        return drvrFirstNm;
    }

    public void setDrvrFirstNm(String drvrFirstNm) {
        this.drvrFirstNm = drvrFirstNm;
    }

    public String getDrvrLicNbr() {
        return drvrLicNbr;
    }

    public void setDrvrLicNbr(String drvrLicNbr) {
        this.drvrLicNbr = drvrLicNbr;
    }

    public String getDrvrStateCd() {
        return drvrStateCd;
    }

    public void setDrvrStateCd(String drvrStateCd) {
        this.drvrStateCd = drvrStateCd;
    }

    public Date getDrvrUpdateTs() {
        return drvrUpdateTs;
    }

    public void setDrvrUpdateTs(Date drvrUpdateTs) {
        this.drvrUpdateTs = drvrUpdateTs;
    }

    public String getIdMisc1() {
        return idMisc1;
    }

    public void setIdMisc1(String idMisc1) {
        this.idMisc1 = idMisc1;
    }

    public String getIdMisc2() {
        return idMisc2;
    }

    public void setIdMisc2(String idMisc2) {
        this.idMisc2 = idMisc2;
    }

    public Character getDrvrIdOnHoldFlg() {
        return drvrIdOnHoldFlg;
    }

    public void setDrvrIdOnHoldFlg(Character drvrIdOnHoldFlg) {
        this.drvrIdOnHoldFlg = drvrIdOnHoldFlg;
    }

    public Date getDrvrIdHoldRelDt() {
        return drvrIdHoldRelDt;
    }

    public void setDrvrIdHoldRelDt(Date drvrIdHoldRelDt) {
        this.drvrIdHoldRelDt = drvrIdHoldRelDt;
    }

    public short getDrvrIdHoldRelTm() {
        return drvrIdHoldRelTm;
    }

    public void setDrvrIdHoldRelTm(short drvrIdHoldRelTm) {
        this.drvrIdHoldRelTm = drvrIdHoldRelTm;
    }

    public String getDrvrEmailAddr() {
        return drvrEmailAddr;
    }

    public void setDrvrEmailAddr(String drvrEmailAddr) {
        this.drvrEmailAddr = drvrEmailAddr;
    }

    public String getDrvrPhoneNbr() {
        return drvrPhoneNbr;
    }

    public void setDrvrPhoneNbr(String drvrPhoneNbr) {
        this.drvrPhoneNbr = drvrPhoneNbr;
    }

    public Date getRowChgTs() {
        return rowChgTs;
    }

    public void setRowChgTs(Date rowChgTs) {
        this.rowChgTs = rowChgTs;
    }

    public Collection<CustDrvrGrps> getCustDrvrGrpsCollection() {
        return custDrvrGrpsCollection;
    }

    public void setCustDrvrGrpsCollection(Collection<CustDrvrGrps> custDrvrGrpsCollection) {
        this.custDrvrGrpsCollection = custDrvrGrpsCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (custDriverPK != null ? custDriverPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CustDriver)) {
            return false;
        }
        CustDriver other = (CustDriver) object;
        if ((this.custDriverPK == null && other.custDriverPK != null) || (this.custDriverPK != null && !this.custDriverPK.equals(other.custDriverPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.cxxcow.CustDriver[ custDriverPK=" + custDriverPK + " ]";
    }
    
}
