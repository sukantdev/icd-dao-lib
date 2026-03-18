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
@Table(name = "VIRT_CRD_ADD", catalog = "", schema = "DBO")
public class VirtCrdAdd implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CARD_REF_NBR")
    private String cardRefNbr;
    @Basic(optional = false)
    @Column(name = "CRD_NBR")
    private String crdNbr;
    @Basic(optional = false)
    @Column(name = "REQ_UID")
    private String reqUid;
    @Basic(optional = false)
    @Column(name = "CRD_TKN_TXT")
    private String crdTknTxt;
    @Basic(optional = false)
    @Column(name = "CRD_STAT_CD")
    private String crdStatCd;
    @Basic(optional = false)
    @Column(name = "EXPR_DT")
    private String exprDt;
    @Basic(optional = false)
    @Column(name = "RESP_CD")
    private String respCd;
    @Basic(optional = false)
    @Column(name = "RESP_MSG_TXT")
    private String respMsgTxt;
    @Basic(optional = false)
    @Column(name = "ACCT_CD")
    private String acctCd;
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

    public VirtCrdAdd() {
    }

    public VirtCrdAdd(String cardRefNbr) {
        this.cardRefNbr = cardRefNbr;
    }

    public VirtCrdAdd(String cardRefNbr, String crdNbr, String reqUid, String crdTknTxt, String crdStatCd, String exprDt, String respCd, String respMsgTxt, String acctCd, String custId, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.cardRefNbr = cardRefNbr;
        this.crdNbr = crdNbr;
        this.reqUid = reqUid;
        this.crdTknTxt = crdTknTxt;
        this.crdStatCd = crdStatCd;
        this.exprDt = exprDt;
        this.respCd = respCd;
        this.respMsgTxt = respMsgTxt;
        this.acctCd = acctCd;
        this.custId = custId;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public String getCardRefNbr() {
        return cardRefNbr;
    }

    public void setCardRefNbr(String cardRefNbr) {
        this.cardRefNbr = cardRefNbr;
    }

    public String getCrdNbr() {
        return crdNbr;
    }

    public void setCrdNbr(String crdNbr) {
        this.crdNbr = crdNbr;
    }

    public String getReqUid() {
        return reqUid;
    }

    public void setReqUid(String reqUid) {
        this.reqUid = reqUid;
    }

    public String getCrdTknTxt() {
        return crdTknTxt;
    }

    public void setCrdTknTxt(String crdTknTxt) {
        this.crdTknTxt = crdTknTxt;
    }

    public String getCrdStatCd() {
        return crdStatCd;
    }

    public void setCrdStatCd(String crdStatCd) {
        this.crdStatCd = crdStatCd;
    }

    public String getExprDt() {
        return exprDt;
    }

    public void setExprDt(String exprDt) {
        this.exprDt = exprDt;
    }

    public String getRespCd() {
        return respCd;
    }

    public void setRespCd(String respCd) {
        this.respCd = respCd;
    }

    public String getRespMsgTxt() {
        return respMsgTxt;
    }

    public void setRespMsgTxt(String respMsgTxt) {
        this.respMsgTxt = respMsgTxt;
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
        hash += (cardRefNbr != null ? cardRefNbr.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof VirtCrdAdd)) {
            return false;
        }
        VirtCrdAdd other = (VirtCrdAdd) object;
        if ((this.cardRefNbr == null && other.cardRefNbr != null) || (this.cardRefNbr != null && !this.cardRefNbr.equals(other.cardRefNbr))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.VirtCrdAdd[ cardRefNbr=" + cardRefNbr + " ]";
    }

}
