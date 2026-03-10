/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.corpay.dao.cxxcow;

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
import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author Sukant.Tiwari
 */
@Entity
@Table(name = "THRD_PAC", catalog = "", schema = "CXXCOW")
@NamedQueries({
    @NamedQuery(name = "ThrdPac.findAll", query = "SELECT t FROM ThrdPac t"),
    @NamedQuery(name = "ThrdPac.findByThrdPacId", query = "SELECT t FROM ThrdPac t WHERE t.thrdPacPK.thrdPacId = :thrdPacId"),
    @NamedQuery(name = "ThrdPac.findByThrdPacXrefNbr", query = "SELECT t FROM ThrdPac t WHERE t.thrdPacPK.thrdPacXrefNbr = :thrdPacXrefNbr"),
    @NamedQuery(name = "ThrdPac.findByAcctCd", query = "SELECT t FROM ThrdPac t WHERE t.acctCd = :acctCd"),
    @NamedQuery(name = "ThrdPac.findByCustId", query = "SELECT t FROM ThrdPac t WHERE t.custId = :custId"),
    @NamedQuery(name = "ThrdPac.findByCrdTknNbr", query = "SELECT t FROM ThrdPac t WHERE t.crdTknNbr = :crdTknNbr"),
    @NamedQuery(name = "ThrdPac.findByUnitNbr", query = "SELECT t FROM ThrdPac t WHERE t.unitNbr = :unitNbr"),
    @NamedQuery(name = "ThrdPac.findByVinNbr", query = "SELECT t FROM ThrdPac t WHERE t.vinNbr = :vinNbr"),
    @NamedQuery(name = "ThrdPac.findByMrchId", query = "SELECT t FROM ThrdPac t WHERE t.mrchId = :mrchId"),
    @NamedQuery(name = "ThrdPac.findByLatNbr", query = "SELECT t FROM ThrdPac t WHERE t.latNbr = :latNbr"),
    @NamedQuery(name = "ThrdPac.findByLongNbr", query = "SELECT t FROM ThrdPac t WHERE t.longNbr = :longNbr"),
    @NamedQuery(name = "ThrdPac.findByLimFuelQty", query = "SELECT t FROM ThrdPac t WHERE t.limFuelQty = :limFuelQty"),
    @NamedQuery(name = "ThrdPac.findByApprFlg", query = "SELECT t FROM ThrdPac t WHERE t.apprFlg = :apprFlg"),
    @NamedQuery(name = "ThrdPac.findByRejRsn", query = "SELECT t FROM ThrdPac t WHERE t.rejRsn = :rejRsn"),
    @NamedQuery(name = "ThrdPac.findByTimeOutFlg", query = "SELECT t FROM ThrdPac t WHERE t.timeOutFlg = :timeOutFlg"),
    @NamedQuery(name = "ThrdPac.findByReqTs", query = "SELECT t FROM ThrdPac t WHERE t.reqTs = :reqTs"),
    @NamedQuery(name = "ThrdPac.findByRespTs", query = "SELECT t FROM ThrdPac t WHERE t.respTs = :respTs"),
    @NamedQuery(name = "ThrdPac.findByCrdLockExpTs", query = "SELECT t FROM ThrdPac t WHERE t.crdLockExpTs = :crdLockExpTs"),
    @NamedQuery(name = "ThrdPac.findByCrtTs", query = "SELECT t FROM ThrdPac t WHERE t.crtTs = :crtTs"),
    @NamedQuery(name = "ThrdPac.findByCrtUsr", query = "SELECT t FROM ThrdPac t WHERE t.crtUsr = :crtUsr"),
    @NamedQuery(name = "ThrdPac.findByMdyTs", query = "SELECT t FROM ThrdPac t WHERE t.mdyTs = :mdyTs"),
    @NamedQuery(name = "ThrdPac.findByMdyUsr", query = "SELECT t FROM ThrdPac t WHERE t.mdyUsr = :mdyUsr")})
public class ThrdPac implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ThrdPacPK thrdPacPK;
    @Basic(optional = false)
    @Column(name = "ACCT_CD")
    private String acctCd;
    @Basic(optional = false)
    @Column(name = "CUST_ID")
    private String custId;
    @Basic(optional = false)
    @Column(name = "CRD_TKN_NBR")
    private String crdTknNbr;
    @Basic(optional = false)
    @Column(name = "UNIT_NBR")
    private String unitNbr;
    @Basic(optional = false)
    @Column(name = "VIN_NBR")
    private String vinNbr;
    @Basic(optional = false)
    @Column(name = "MRCH_ID")
    private String mrchId;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "LAT_NBR")
    private BigDecimal latNbr;
    @Basic(optional = false)
    @Column(name = "LONG_NBR")
    private BigDecimal longNbr;
    @Basic(optional = false)
    @Column(name = "LIM_FUEL_QTY")
    private BigDecimal limFuelQty;
    @Basic(optional = false)
    @Column(name = "APPR_FLG")
    private Character apprFlg;
    @Basic(optional = false)
    @Column(name = "REJ_RSN")
    private String rejRsn;
    @Basic(optional = false)
    @Column(name = "TIME_OUT_FLG")
    private Character timeOutFlg;
    @Basic(optional = false)
    @Column(name = "REQ_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date reqTs;
    @Basic(optional = false)
    @Column(name = "RESP_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date respTs;
    @Basic(optional = false)
    @Column(name = "CRD_LOCK_EXP_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date crdLockExpTs;
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

    public ThrdPac() {
    }

    public ThrdPac(ThrdPacPK thrdPacPK) {
        this.thrdPacPK = thrdPacPK;
    }

    public ThrdPac(ThrdPacPK thrdPacPK, String acctCd, String custId, String crdTknNbr, String unitNbr, String vinNbr, String mrchId, BigDecimal latNbr, BigDecimal longNbr, BigDecimal limFuelQty, Character apprFlg, String rejRsn, Character timeOutFlg, Date reqTs, Date respTs, Date crdLockExpTs, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.thrdPacPK = thrdPacPK;
        this.acctCd = acctCd;
        this.custId = custId;
        this.crdTknNbr = crdTknNbr;
        this.unitNbr = unitNbr;
        this.vinNbr = vinNbr;
        this.mrchId = mrchId;
        this.latNbr = latNbr;
        this.longNbr = longNbr;
        this.limFuelQty = limFuelQty;
        this.apprFlg = apprFlg;
        this.rejRsn = rejRsn;
        this.timeOutFlg = timeOutFlg;
        this.reqTs = reqTs;
        this.respTs = respTs;
        this.crdLockExpTs = crdLockExpTs;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public ThrdPac(String thrdPacId, String thrdPacXrefNbr) {
        this.thrdPacPK = new ThrdPacPK(thrdPacId, thrdPacXrefNbr);
    }

    public ThrdPacPK getThrdPacPK() {
        return thrdPacPK;
    }

    public void setThrdPacPK(ThrdPacPK thrdPacPK) {
        this.thrdPacPK = thrdPacPK;
    }

    public String getAcctCd() {
        return acctCd;
    }

    public void setAcctCd(String acctCd) {
        this.acctCd = acctCd;
    }

    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId;
    }

    public String getCrdTknNbr() {
        return crdTknNbr;
    }

    public void setCrdTknNbr(String crdTknNbr) {
        this.crdTknNbr = crdTknNbr;
    }

    public String getUnitNbr() {
        return unitNbr;
    }

    public void setUnitNbr(String unitNbr) {
        this.unitNbr = unitNbr;
    }

    public String getVinNbr() {
        return vinNbr;
    }

    public void setVinNbr(String vinNbr) {
        this.vinNbr = vinNbr;
    }

    public String getMrchId() {
        return mrchId;
    }

    public void setMrchId(String mrchId) {
        this.mrchId = mrchId;
    }

    public BigDecimal getLatNbr() {
        return latNbr;
    }

    public void setLatNbr(BigDecimal latNbr) {
        this.latNbr = latNbr;
    }

    public BigDecimal getLongNbr() {
        return longNbr;
    }

    public void setLongNbr(BigDecimal longNbr) {
        this.longNbr = longNbr;
    }

    public BigDecimal getLimFuelQty() {
        return limFuelQty;
    }

    public void setLimFuelQty(BigDecimal limFuelQty) {
        this.limFuelQty = limFuelQty;
    }

    public Character getApprFlg() {
        return apprFlg;
    }

    public void setApprFlg(Character apprFlg) {
        this.apprFlg = apprFlg;
    }

    public String getRejRsn() {
        return rejRsn;
    }

    public void setRejRsn(String rejRsn) {
        this.rejRsn = rejRsn;
    }

    public Character getTimeOutFlg() {
        return timeOutFlg;
    }

    public void setTimeOutFlg(Character timeOutFlg) {
        this.timeOutFlg = timeOutFlg;
    }

    public Date getReqTs() {
        return reqTs;
    }

    public void setReqTs(Date reqTs) {
        this.reqTs = reqTs;
    }

    public Date getRespTs() {
        return respTs;
    }

    public void setRespTs(Date respTs) {
        this.respTs = respTs;
    }

    public Date getCrdLockExpTs() {
        return crdLockExpTs;
    }

    public void setCrdLockExpTs(Date crdLockExpTs) {
        this.crdLockExpTs = crdLockExpTs;
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
        hash += (thrdPacPK != null ? thrdPacPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ThrdPac)) {
            return false;
        }
        ThrdPac other = (ThrdPac) object;
        if ((this.thrdPacPK == null && other.thrdPacPK != null) || (this.thrdPacPK != null && !this.thrdPacPK.equals(other.thrdPacPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.cxxcow.ThrdPac[ thrdPacPK=" + thrdPacPK + " ]";
    }
    
}
