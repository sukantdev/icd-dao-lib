package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "DATA_INTEG_LOC", catalog = "", schema = "DBO")
public class DataIntegLoc implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "REQ_ID")
    private Integer reqId;
    @Basic(optional = false)
    @Column(name = "INTEG_ID")
    private String integId;
    @Basic(optional = false)
    @Column(name = "ACCT_NBR")
    private String acctNbr;
    @Basic(optional = false)
    @Column(name = "CNTCT_NM")
    private String cntctNm;
    @Basic(optional = false)
    @Column(name = "CNTCT_PH")
    private String cntctPh;
    @Basic(optional = false)
    @Column(name = "USR_ID")
    private String usrId;
    @Basic(optional = false)
    @Column(name = "LOC_DESC")
    private String locDesc;
    @Basic(optional = false)
    @Column(name = "LOC_ADDR")
    private String locAddr;
    @Basic(optional = false)
    @Column(name = "LOC_CTY")
    private String locCty;
    @Basic(optional = false)
    @Column(name = "LOC_ST")
    private String locSt;
    @Basic(optional = false)
    @Column(name = "LOC_POST_CD")
    private String locPostCd;
    @Basic(optional = false)
    @Column(name = "LOC_PH_NBR")
    private String locPhNbr;
    @Basic(optional = false)
    @Column(name = "LOC_ACPTS_MC_FLG")
    private Character locAcptsMcFlg;
    @Basic(optional = false)
    @Column(name = "LOC_MTHLY_XTNS")
    private String locMthlyXtns;
    @Basic(optional = false)
    @Column(name = "MTHLY_GALLONS")
    private String mthlyGallons;
    @Basic(optional = false)
    @Column(name = "CRD_NBR")
    private String crdNbr;
    @Basic(optional = false)
    @Column(name = "TRNS_DT")
    @Temporal(TemporalType.DATE)
    private Date trnsDt;
    @Basic(optional = false)
    @Column(name = "TRNS_TM")
    @Temporal(TemporalType.TIME)
    private Date trnsTm;
    @Basic(optional = false)
    @Column(name = "LOC_MSG")
    private String locMsg;
    @Basic(optional = false)
    @Column(name = "LOC_CMNTS")
    private String locCmnts;
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

    public DataIntegLoc() {
    }

    public DataIntegLoc(Integer reqId) {
        this.reqId = reqId;
    }

    public DataIntegLoc(Integer reqId, String integId, String acctNbr, String cntctNm, String cntctPh, String usrId, String locDesc, String locAddr, String locCty, String locSt, String locPostCd, String locPhNbr, Character locAcptsMcFlg, String locMthlyXtns, String mthlyGallons, String crdNbr, Date trnsDt, Date trnsTm, String locMsg, String locCmnts, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.reqId = reqId;
        this.integId = integId;
        this.acctNbr = acctNbr;
        this.cntctNm = cntctNm;
        this.cntctPh = cntctPh;
        this.usrId = usrId;
        this.locDesc = locDesc;
        this.locAddr = locAddr;
        this.locCty = locCty;
        this.locSt = locSt;
        this.locPostCd = locPostCd;
        this.locPhNbr = locPhNbr;
        this.locAcptsMcFlg = locAcptsMcFlg;
        this.locMthlyXtns = locMthlyXtns;
        this.mthlyGallons = mthlyGallons;
        this.crdNbr = crdNbr;
        this.trnsDt = trnsDt;
        this.trnsTm = trnsTm;
        this.locMsg = locMsg;
        this.locCmnts = locCmnts;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public Integer getReqId() {
        return reqId;
    }

    public void setReqId(Integer reqId) {
        this.reqId = reqId;
    }

    public String getIntegId() {
        return integId;
    }

    public void setIntegId(String integId) {
        this.integId = integId;
    }

    public String getAcctNbr() {
        return acctNbr;
    }

    public void setAcctNbr(String acctNbr) {
        this.acctNbr = acctNbr;
    }

    public String getCntctNm() {
        return cntctNm;
    }

    public void setCntctNm(String cntctNm) {
        this.cntctNm = cntctNm;
    }

    public String getCntctPh() {
        return cntctPh;
    }

    public void setCntctPh(String cntctPh) {
        this.cntctPh = cntctPh;
    }

    public String getUsrId() {
        return usrId;
    }

    public void setUsrId(String usrId) {
        this.usrId = usrId;
    }

    public String getLocDesc() {
        return locDesc;
    }

    public void setLocDesc(String locDesc) {
        this.locDesc = locDesc;
    }

    public String getLocAddr() {
        return locAddr;
    }

    public void setLocAddr(String locAddr) {
        this.locAddr = locAddr;
    }

    public String getLocCty() {
        return locCty;
    }

    public void setLocCty(String locCty) {
        this.locCty = locCty;
    }

    public String getLocSt() {
        return locSt;
    }

    public void setLocSt(String locSt) {
        this.locSt = locSt;
    }

    public String getLocPostCd() {
        return locPostCd;
    }

    public void setLocPostCd(String locPostCd) {
        this.locPostCd = locPostCd;
    }

    public String getLocPhNbr() {
        return locPhNbr;
    }

    public void setLocPhNbr(String locPhNbr) {
        this.locPhNbr = locPhNbr;
    }

    public Character getLocAcptsMcFlg() {
        return locAcptsMcFlg;
    }

    public void setLocAcptsMcFlg(Character locAcptsMcFlg) {
        this.locAcptsMcFlg = locAcptsMcFlg;
    }

    public String getLocMthlyXtns() {
        return locMthlyXtns;
    }

    public void setLocMthlyXtns(String locMthlyXtns) {
        this.locMthlyXtns = locMthlyXtns;
    }

    public String getMthlyGallons() {
        return mthlyGallons;
    }

    public void setMthlyGallons(String mthlyGallons) {
        this.mthlyGallons = mthlyGallons;
    }

    public String getCrdNbr() {
        return crdNbr;
    }

    public void setCrdNbr(String crdNbr) {
        this.crdNbr = crdNbr;
    }

    public Date getTrnsDt() {
        return trnsDt;
    }

    public void setTrnsDt(Date trnsDt) {
        this.trnsDt = trnsDt;
    }

    public Date getTrnsTm() {
        return trnsTm;
    }

    public void setTrnsTm(Date trnsTm) {
        this.trnsTm = trnsTm;
    }

    public String getLocMsg() {
        return locMsg;
    }

    public void setLocMsg(String locMsg) {
        this.locMsg = locMsg;
    }

    public String getLocCmnts() {
        return locCmnts;
    }

    public void setLocCmnts(String locCmnts) {
        this.locCmnts = locCmnts;
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
        hash += (reqId != null ? reqId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof DataIntegLoc)) {
            return false;
        }
        DataIntegLoc other = (DataIntegLoc) object;
        if ((this.reqId == null && other.reqId != null) || (this.reqId != null && !this.reqId.equals(other.reqId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.DataIntegLoc[ reqId=" + reqId + " ]";
    }

}
