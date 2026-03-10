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
import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author Sukant.Tiwari
 */
@Entity
@Table(name = "CUST_PREFS", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "CustPrefs.findAll", query = "SELECT c FROM CustPrefs c")})
public class CustPrefs implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CUST_ID")
    private String custId;
    @Basic(optional = false)
    @Column(name = "ALERT_FLG")
    private Character alertFlg;
    @Basic(optional = false)
    @Column(name = "NOTIFICATION_FLG")
    private Character notificationFlg;
    @Basic(optional = false)
    @Column(name = "COMP_SM_NM")
    private String compSmNm;
    @Basic(optional = false)
    @Column(name = "ALERT_EMAIL_ADDR")
    private String alertEmailAddr;
    @Basic(optional = false)
    @Column(name = "ALERT_EMAIL_FLG")
    private Character alertEmailFlg;
    @Basic(optional = false)
    @Column(name = "CODEWORD")
    private String codeword;
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
    @Basic(optional = false)
    @Column(name = "AUTH_DECLN_FLG")
    private Character authDeclnFlg;
    @Basic(optional = false)
    @Column(name = "AUTH_DECLN_EMAIL_FLG")
    private Character authDeclnEmailFlg;
    @Basic(optional = false)
    @Column(name = "CRD_ACTV_FLG")
    private Character crdActvFlg;
    @Basic(optional = false)
    @Column(name = "CRD_ACTV_EMAIL_FLG")
    private Character crdActvEmailFlg;
    @Basic(optional = false)
    @Column(name = "TXN_NOTIFICATION_OVER_CUST_FLG")
    private Character txnNotificationOverCustFlg;
    @Basic(optional = false)
    @Column(name = "TXN_NOTIFICATION_OVER_ADMN_FLG")
    private Character txnNotificationOverAdmnFlg;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "TXN_NOTIFICATION_OVER_AMT")
    private BigDecimal txnNotificationOverAmt;
    @Basic(optional = false)
    @Column(name = "TXN_NOTIFICATION_UNDR_CUST_FLG")
    private Character txnNotificationUndrCustFlg;
    @Basic(optional = false)
    @Column(name = "TXN_NOTIFICATION_UNDR_ADMN_FLG")
    private Character txnNotificationUndrAdmnFlg;
    @Basic(optional = false)
    @Column(name = "TXN_NOTIFICATION_UNDR_AMT")
    private BigDecimal txnNotificationUndrAmt;

    public CustPrefs() {
    }

    public CustPrefs(String custId) {
        this.custId = custId;
    }

    public CustPrefs(String custId, Character alertFlg, Character notificationFlg, String compSmNm, String alertEmailAddr, Character alertEmailFlg, String codeword, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr, Character authDeclnFlg, Character authDeclnEmailFlg, Character crdActvFlg, Character crdActvEmailFlg, Character txnNotificationOverCustFlg, Character txnNotificationOverAdmnFlg, BigDecimal txnNotificationOverAmt, Character txnNotificationUndrCustFlg, Character txnNotificationUndrAdmnFlg, BigDecimal txnNotificationUndrAmt) {
        this.custId = custId;
        this.alertFlg = alertFlg;
        this.notificationFlg = notificationFlg;
        this.compSmNm = compSmNm;
        this.alertEmailAddr = alertEmailAddr;
        this.alertEmailFlg = alertEmailFlg;
        this.codeword = codeword;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
        this.authDeclnFlg = authDeclnFlg;
        this.authDeclnEmailFlg = authDeclnEmailFlg;
        this.crdActvFlg = crdActvFlg;
        this.crdActvEmailFlg = crdActvEmailFlg;
        this.txnNotificationOverCustFlg = txnNotificationOverCustFlg;
        this.txnNotificationOverAdmnFlg = txnNotificationOverAdmnFlg;
        this.txnNotificationOverAmt = txnNotificationOverAmt;
        this.txnNotificationUndrCustFlg = txnNotificationUndrCustFlg;
        this.txnNotificationUndrAdmnFlg = txnNotificationUndrAdmnFlg;
        this.txnNotificationUndrAmt = txnNotificationUndrAmt;
    }

    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId;
    }

    public Character getAlertFlg() {
        return alertFlg;
    }

    public void setAlertFlg(Character alertFlg) {
        this.alertFlg = alertFlg;
    }

    public Character getNotificationFlg() {
        return notificationFlg;
    }

    public void setNotificationFlg(Character notificationFlg) {
        this.notificationFlg = notificationFlg;
    }

    public String getCompSmNm() {
        return compSmNm;
    }

    public void setCompSmNm(String compSmNm) {
        this.compSmNm = compSmNm;
    }

    public String getAlertEmailAddr() {
        return alertEmailAddr;
    }

    public void setAlertEmailAddr(String alertEmailAddr) {
        this.alertEmailAddr = alertEmailAddr;
    }

    public Character getAlertEmailFlg() {
        return alertEmailFlg;
    }

    public void setAlertEmailFlg(Character alertEmailFlg) {
        this.alertEmailFlg = alertEmailFlg;
    }

    public String getCodeword() {
        return codeword;
    }

    public void setCodeword(String codeword) {
        this.codeword = codeword;
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

    public Character getAuthDeclnFlg() {
        return authDeclnFlg;
    }

    public void setAuthDeclnFlg(Character authDeclnFlg) {
        this.authDeclnFlg = authDeclnFlg;
    }

    public Character getAuthDeclnEmailFlg() {
        return authDeclnEmailFlg;
    }

    public void setAuthDeclnEmailFlg(Character authDeclnEmailFlg) {
        this.authDeclnEmailFlg = authDeclnEmailFlg;
    }

    public Character getCrdActvFlg() {
        return crdActvFlg;
    }

    public void setCrdActvFlg(Character crdActvFlg) {
        this.crdActvFlg = crdActvFlg;
    }

    public Character getCrdActvEmailFlg() {
        return crdActvEmailFlg;
    }

    public void setCrdActvEmailFlg(Character crdActvEmailFlg) {
        this.crdActvEmailFlg = crdActvEmailFlg;
    }

    public Character getTxnNotificationOverCustFlg() {
        return txnNotificationOverCustFlg;
    }

    public void setTxnNotificationOverCustFlg(Character txnNotificationOverCustFlg) {
        this.txnNotificationOverCustFlg = txnNotificationOverCustFlg;
    }

    public Character getTxnNotificationOverAdmnFlg() {
        return txnNotificationOverAdmnFlg;
    }

    public void setTxnNotificationOverAdmnFlg(Character txnNotificationOverAdmnFlg) {
        this.txnNotificationOverAdmnFlg = txnNotificationOverAdmnFlg;
    }

    public BigDecimal getTxnNotificationOverAmt() {
        return txnNotificationOverAmt;
    }

    public void setTxnNotificationOverAmt(BigDecimal txnNotificationOverAmt) {
        this.txnNotificationOverAmt = txnNotificationOverAmt;
    }

    public Character getTxnNotificationUndrCustFlg() {
        return txnNotificationUndrCustFlg;
    }

    public void setTxnNotificationUndrCustFlg(Character txnNotificationUndrCustFlg) {
        this.txnNotificationUndrCustFlg = txnNotificationUndrCustFlg;
    }

    public Character getTxnNotificationUndrAdmnFlg() {
        return txnNotificationUndrAdmnFlg;
    }

    public void setTxnNotificationUndrAdmnFlg(Character txnNotificationUndrAdmnFlg) {
        this.txnNotificationUndrAdmnFlg = txnNotificationUndrAdmnFlg;
    }

    public BigDecimal getTxnNotificationUndrAmt() {
        return txnNotificationUndrAmt;
    }

    public void setTxnNotificationUndrAmt(BigDecimal txnNotificationUndrAmt) {
        this.txnNotificationUndrAmt = txnNotificationUndrAmt;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (custId != null ? custId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CustPrefs)) {
            return false;
        }
        CustPrefs other = (CustPrefs) object;
        if ((this.custId == null && other.custId != null) || (this.custId != null && !this.custId.equals(other.custId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.CustPrefs[ custId=" + custId + " ]";
    }
    
}
