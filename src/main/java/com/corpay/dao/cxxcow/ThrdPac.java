package com.corpay.dao.cxxcow;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "THRD_PAC", catalog = "", schema = "CXXCOW")
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
