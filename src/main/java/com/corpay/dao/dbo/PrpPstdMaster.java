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
@Table(name = "PRP_PSTD_MASTER", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "PrpPstdMaster.findAll", query = "SELECT p FROM PrpPstdMaster p")})
public class PrpPstdMaster implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "XTN_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date xtnTs;
    @Basic(optional = false)
    @Column(name = "ACCT_NBR")
    private String acctNbr;
    @Basic(optional = false)
    @Column(name = "CUST_ID")
    private String custId;
    @Basic(optional = false)
    @Column(name = "TRNS_DT")
    @Temporal(TemporalType.DATE)
    private Date trnsDt;
    @Basic(optional = false)
    @Column(name = "TRNS_TM")
    private int trnsTm;
    @Basic(optional = false)
    @Column(name = "CTL_NBR")
    private int ctlNbr;
    @Basic(optional = false)
    @Column(name = "TRNS_TYP")
    private Character trnsTyp;
    @Basic(optional = false)
    @Column(name = "CRD_NBR")
    private String crdNbr;
    @Basic(optional = false)
    @Column(name = "UNIT_NBR")
    private String unitNbr;
    @Basic(optional = false)
    @Column(name = "EMP_NBR")
    private String empNbr;
    @Basic(optional = false)
    @Column(name = "TRIP_NBR")
    private String tripNbr;
    @Basic(optional = false)
    @Column(name = "TRLR_NBR")
    private String trlrNbr;
    @Basic(optional = false)
    @Column(name = "SC_CD")
    private String scCd;
    @Basic(optional = false)
    @Column(name = "RETURN_CD")
    private int returnCd;
    @Basic(optional = false)
    @Column(name = "RETURN_MSG_TXT")
    private String returnMsgTxt;
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

    public PrpPstdMaster() {
    }

    public PrpPstdMaster(Date xtnTs) {
        this.xtnTs = xtnTs;
    }

    public PrpPstdMaster(Date xtnTs, String acctNbr, String custId, Date trnsDt, int trnsTm, int ctlNbr, Character trnsTyp, String crdNbr, String unitNbr, String empNbr, String tripNbr, String trlrNbr, String scCd, int returnCd, String returnMsgTxt, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.xtnTs = xtnTs;
        this.acctNbr = acctNbr;
        this.custId = custId;
        this.trnsDt = trnsDt;
        this.trnsTm = trnsTm;
        this.ctlNbr = ctlNbr;
        this.trnsTyp = trnsTyp;
        this.crdNbr = crdNbr;
        this.unitNbr = unitNbr;
        this.empNbr = empNbr;
        this.tripNbr = tripNbr;
        this.trlrNbr = trlrNbr;
        this.scCd = scCd;
        this.returnCd = returnCd;
        this.returnMsgTxt = returnMsgTxt;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public Date getXtnTs() {
        return xtnTs;
    }

    public void setXtnTs(Date xtnTs) {
        this.xtnTs = xtnTs;
    }

    public String getAcctNbr() {
        return acctNbr;
    }

    public void setAcctNbr(String acctNbr) {
        this.acctNbr = acctNbr;
    }

    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId;
    }

    public Date getTrnsDt() {
        return trnsDt;
    }

    public void setTrnsDt(Date trnsDt) {
        this.trnsDt = trnsDt;
    }

    public int getTrnsTm() {
        return trnsTm;
    }

    public void setTrnsTm(int trnsTm) {
        this.trnsTm = trnsTm;
    }

    public int getCtlNbr() {
        return ctlNbr;
    }

    public void setCtlNbr(int ctlNbr) {
        this.ctlNbr = ctlNbr;
    }

    public Character getTrnsTyp() {
        return trnsTyp;
    }

    public void setTrnsTyp(Character trnsTyp) {
        this.trnsTyp = trnsTyp;
    }

    public String getCrdNbr() {
        return crdNbr;
    }

    public void setCrdNbr(String crdNbr) {
        this.crdNbr = crdNbr;
    }

    public String getUnitNbr() {
        return unitNbr;
    }

    public void setUnitNbr(String unitNbr) {
        this.unitNbr = unitNbr;
    }

    public String getEmpNbr() {
        return empNbr;
    }

    public void setEmpNbr(String empNbr) {
        this.empNbr = empNbr;
    }

    public String getTripNbr() {
        return tripNbr;
    }

    public void setTripNbr(String tripNbr) {
        this.tripNbr = tripNbr;
    }

    public String getTrlrNbr() {
        return trlrNbr;
    }

    public void setTrlrNbr(String trlrNbr) {
        this.trlrNbr = trlrNbr;
    }

    public String getScCd() {
        return scCd;
    }

    public void setScCd(String scCd) {
        this.scCd = scCd;
    }

    public int getReturnCd() {
        return returnCd;
    }

    public void setReturnCd(int returnCd) {
        this.returnCd = returnCd;
    }

    public String getReturnMsgTxt() {
        return returnMsgTxt;
    }

    public void setReturnMsgTxt(String returnMsgTxt) {
        this.returnMsgTxt = returnMsgTxt;
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
        hash += (xtnTs != null ? xtnTs.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PrpPstdMaster)) {
            return false;
        }
        PrpPstdMaster other = (PrpPstdMaster) object;
        if ((this.xtnTs == null && other.xtnTs != null) || (this.xtnTs != null && !this.xtnTs.equals(other.xtnTs))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.PrpPstdMaster[ xtnTs=" + xtnTs + " ]";
    }
    
}
