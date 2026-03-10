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
import java.math.BigInteger;
import java.util.Date;

/**
 *
 * @author Sukant.Tiwari
 */
@Entity
@Table(name = "ET_SYNC_LOG", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "EtSyncLog.findAll", query = "SELECT e FROM EtSyncLog e")})
public class EtSyncLog implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @Basic(optional = false)
    @Column(name = "CUST_ID")
    private String custId;
    @Basic(optional = false)
    @Column(name = "ACCT_CD")
    private String acctCd;
    @Basic(optional = false)
    @Column(name = "SYNC_TAB_CD")
    private Character syncTabCd;
    @Column(name = "SYNC_TOOL_RESPONSE")
    private Serializable syncToolResponse;
    @Basic(optional = false)
    @Column(name = "CRT_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date crtTs;
    @Basic(optional = false)
    @Column(name = "CRT_USR")
    private String crtUsr;
    @Column(name = "DB2_GENERATED_DOCID_FOR_XML")
    private BigInteger db2GeneratedDocidForXml;

    public EtSyncLog() {
    }

    public EtSyncLog(Long id) {
        this.id = id;
    }

    public EtSyncLog(Long id, String custId, String acctCd, Character syncTabCd, Date crtTs, String crtUsr) {
        this.id = id;
        this.custId = custId;
        this.acctCd = acctCd;
        this.syncTabCd = syncTabCd;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId;
    }

    public String getAcctCd() {
        return acctCd;
    }

    public void setAcctCd(String acctCd) {
        this.acctCd = acctCd;
    }

    public Character getSyncTabCd() {
        return syncTabCd;
    }

    public void setSyncTabCd(Character syncTabCd) {
        this.syncTabCd = syncTabCd;
    }

    public Serializable getSyncToolResponse() {
        return syncToolResponse;
    }

    public void setSyncToolResponse(Serializable syncToolResponse) {
        this.syncToolResponse = syncToolResponse;
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

    public BigInteger getDb2GeneratedDocidForXml() {
        return db2GeneratedDocidForXml;
    }

    public void setDb2GeneratedDocidForXml(BigInteger db2GeneratedDocidForXml) {
        this.db2GeneratedDocidForXml = db2GeneratedDocidForXml;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EtSyncLog)) {
            return false;
        }
        EtSyncLog other = (EtSyncLog) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.EtSyncLog[ id=" + id + " ]";
    }
    
}
