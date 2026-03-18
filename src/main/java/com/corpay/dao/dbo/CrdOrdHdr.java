package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "CRD_ORD_HDR", catalog = "", schema = "DBO")
public class CrdOrdHdr implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CrdOrdHdrPK crdOrdHdrPK;
    @Basic(optional = false)
    @Column(name = "CRD_ORD_STAT_CD")
    private Character crdOrdStatCd;
    @Basic(optional = false)
    @Column(name = "CRD_REQ_DT")
    @Temporal(TemporalType.DATE)
    private Date crdReqDt;
    @Basic(optional = false)
    @Column(name = "CRD_ACCT_NBR")
    private String crdAcctNbr;
    @Basic(optional = false)
    @Column(name = "CRD_ORD_QTY")
    private int crdOrdQty;
    @Basic(optional = false)
    @Column(name = "CRD_ORD_PROC_QTY")
    private int crdOrdProcQty;
    @Basic(optional = false)
    @Column(name = "CRD_CLATRL_QTY")
    private int crdClatrlQty;
    @Basic(optional = false)
    @Column(name = "CRD_CLATRL_CD")
    private short crdClatrlCd;
    @Basic(optional = false)
    @Column(name = "NM_TO_APPR_ON_CRD")
    private String nmToApprOnCrd;
    @Basic(optional = false)
    @Column(name = "CUST_NM")
    private String custNm;
    @Basic(optional = false)
    @Column(name = "CUST_CTY")
    private String custCty;
    @Basic(optional = false)
    @Column(name = "CUST_ST")
    private String custSt;
    @Basic(optional = false)
    @Column(name = "CRD_EXP_DT")
    @Temporal(TemporalType.DATE)
    private Date crdExpDt;
    @Basic(optional = false)
    @Column(name = "SHIP_TO_NM")
    private String shipToNm;
    @Basic(optional = false)
    @Column(name = "ADDR1")
    private String addr1;
    @Basic(optional = false)
    @Column(name = "ADDR2")
    private String addr2;
    @Basic(optional = false)
    @Column(name = "CITY")
    private String city;
    @Basic(optional = false)
    @Column(name = "STATE_CD")
    private String stateCd;
    @Basic(optional = false)
    @Column(name = "ZIP")
    private String zip;
    @Basic(optional = false)
    @Column(name = "CRD_ORD_CNTRY_CD")
    private String crdOrdCntryCd;
    @Basic(optional = false)
    @Column(name = "ATTN")
    private String attn;
    @Basic(optional = false)
    @Column(name = "DELV_METH_CD")
    private short delvMethCd;
    @Basic(optional = false)
    @Column(name = "CRD_FDIS_FLEET_CD")
    private String crdFdisFleetCd;
    @Basic(optional = false)
    @Column(name = "CRD_FDIS_BRANCH_CD")
    private Character crdFdisBranchCd;
    @Basic(optional = false)
    @Column(name = "CRD_DL_VERIFY")
    private Character crdDlVerify;
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
    @Column(name = "CDN_ASSOC_EMAIL_ADDR")
    private String cdnAssocEmailAddr;

    public CrdOrdHdr() {
    }

    public CrdOrdHdr(CrdOrdHdrPK crdOrdHdrPK) {
        this.crdOrdHdrPK = crdOrdHdrPK;
    }

    public CrdOrdHdr(CrdOrdHdrPK crdOrdHdrPK, Character crdOrdStatCd, Date crdReqDt, String crdAcctNbr, int crdOrdQty, int crdOrdProcQty, int crdClatrlQty, short crdClatrlCd, String nmToApprOnCrd, String custNm, String custCty, String custSt, Date crdExpDt, String shipToNm, String addr1, String addr2, String city, String stateCd, String zip, String crdOrdCntryCd, String attn, short delvMethCd, String crdFdisFleetCd, Character crdFdisBranchCd, Character crdDlVerify, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr, String cdnAssocEmailAddr) {
        this.crdOrdHdrPK = crdOrdHdrPK;
        this.crdOrdStatCd = crdOrdStatCd;
        this.crdReqDt = crdReqDt;
        this.crdAcctNbr = crdAcctNbr;
        this.crdOrdQty = crdOrdQty;
        this.crdOrdProcQty = crdOrdProcQty;
        this.crdClatrlQty = crdClatrlQty;
        this.crdClatrlCd = crdClatrlCd;
        this.nmToApprOnCrd = nmToApprOnCrd;
        this.custNm = custNm;
        this.custCty = custCty;
        this.custSt = custSt;
        this.crdExpDt = crdExpDt;
        this.shipToNm = shipToNm;
        this.addr1 = addr1;
        this.addr2 = addr2;
        this.city = city;
        this.stateCd = stateCd;
        this.zip = zip;
        this.crdOrdCntryCd = crdOrdCntryCd;
        this.attn = attn;
        this.delvMethCd = delvMethCd;
        this.crdFdisFleetCd = crdFdisFleetCd;
        this.crdFdisBranchCd = crdFdisBranchCd;
        this.crdDlVerify = crdDlVerify;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
        this.cdnAssocEmailAddr = cdnAssocEmailAddr;
    }

    public CrdOrdHdr(String custId, String crdTypCd, String crdStyleCd, Date crdReqTs) {
        this.crdOrdHdrPK = new CrdOrdHdrPK(custId, crdTypCd, crdStyleCd, crdReqTs);
    }

    public CrdOrdHdrPK getCrdOrdHdrPK() {
        return crdOrdHdrPK;
    }

    public void setCrdOrdHdrPK(CrdOrdHdrPK crdOrdHdrPK) {
        this.crdOrdHdrPK = crdOrdHdrPK;
    }

    public Character getCrdOrdStatCd() {
        return crdOrdStatCd;
    }

    public void setCrdOrdStatCd(Character crdOrdStatCd) {
        this.crdOrdStatCd = crdOrdStatCd;
    }

    public Date getCrdReqDt() {
        return crdReqDt;
    }

    public void setCrdReqDt(Date crdReqDt) {
        this.crdReqDt = crdReqDt;
    }

    public String getCrdAcctNbr() {
        return crdAcctNbr;
    }

    public void setCrdAcctNbr(String crdAcctNbr) {
        this.crdAcctNbr = crdAcctNbr;
    }

    public int getCrdOrdQty() {
        return crdOrdQty;
    }

    public void setCrdOrdQty(int crdOrdQty) {
        this.crdOrdQty = crdOrdQty;
    }

    public int getCrdOrdProcQty() {
        return crdOrdProcQty;
    }

    public void setCrdOrdProcQty(int crdOrdProcQty) {
        this.crdOrdProcQty = crdOrdProcQty;
    }

    public int getCrdClatrlQty() {
        return crdClatrlQty;
    }

    public void setCrdClatrlQty(int crdClatrlQty) {
        this.crdClatrlQty = crdClatrlQty;
    }

    public short getCrdClatrlCd() {
        return crdClatrlCd;
    }

    public void setCrdClatrlCd(short crdClatrlCd) {
        this.crdClatrlCd = crdClatrlCd;
    }

    public String getNmToApprOnCrd() {
        return nmToApprOnCrd;
    }

    public void setNmToApprOnCrd(String nmToApprOnCrd) {
        this.nmToApprOnCrd = nmToApprOnCrd;
    }

    public String getCustNm() {
        return custNm;
    }

    public void setCustNm(String custNm) {
        this.custNm = custNm;
    }

    public String getCustCty() {
        return custCty;
    }

    public void setCustCty(String custCty) {
        this.custCty = custCty;
    }

    public String getCustSt() {
        return custSt;
    }

    public void setCustSt(String custSt) {
        this.custSt = custSt;
    }

    public Date getCrdExpDt() {
        return crdExpDt;
    }

    public void setCrdExpDt(Date crdExpDt) {
        this.crdExpDt = crdExpDt;
    }

    public String getShipToNm() {
        return shipToNm;
    }

    public void setShipToNm(String shipToNm) {
        this.shipToNm = shipToNm;
    }

    public String getAddr1() {
        return addr1;
    }

    public void setAddr1(String addr1) {
        this.addr1 = addr1;
    }

    public String getAddr2() {
        return addr2;
    }

    public void setAddr2(String addr2) {
        this.addr2 = addr2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStateCd() {
        return stateCd;
    }

    public void setStateCd(String stateCd) {
        this.stateCd = stateCd;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getCrdOrdCntryCd() {
        return crdOrdCntryCd;
    }

    public void setCrdOrdCntryCd(String crdOrdCntryCd) {
        this.crdOrdCntryCd = crdOrdCntryCd;
    }

    public String getAttn() {
        return attn;
    }

    public void setAttn(String attn) {
        this.attn = attn;
    }

    public short getDelvMethCd() {
        return delvMethCd;
    }

    public void setDelvMethCd(short delvMethCd) {
        this.delvMethCd = delvMethCd;
    }

    public String getCrdFdisFleetCd() {
        return crdFdisFleetCd;
    }

    public void setCrdFdisFleetCd(String crdFdisFleetCd) {
        this.crdFdisFleetCd = crdFdisFleetCd;
    }

    public Character getCrdFdisBranchCd() {
        return crdFdisBranchCd;
    }

    public void setCrdFdisBranchCd(Character crdFdisBranchCd) {
        this.crdFdisBranchCd = crdFdisBranchCd;
    }

    public Character getCrdDlVerify() {
        return crdDlVerify;
    }

    public void setCrdDlVerify(Character crdDlVerify) {
        this.crdDlVerify = crdDlVerify;
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

    public String getCdnAssocEmailAddr() {
        return cdnAssocEmailAddr;
    }

    public void setCdnAssocEmailAddr(String cdnAssocEmailAddr) {
        this.cdnAssocEmailAddr = cdnAssocEmailAddr;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (crdOrdHdrPK != null ? crdOrdHdrPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof CrdOrdHdr)) {
            return false;
        }
        CrdOrdHdr other = (CrdOrdHdr) object;
        if ((this.crdOrdHdrPK == null && other.crdOrdHdrPK != null) || (this.crdOrdHdrPK != null && !this.crdOrdHdrPK.equals(other.crdOrdHdrPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.CrdOrdHdr[ crdOrdHdrPK=" + crdOrdHdrPK + " ]";
    }

}
