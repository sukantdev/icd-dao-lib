package com.corpay.dao.dbo;

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
@Table(name = "MNL_ADJ_LOG", catalog = "", schema = "DBO")
public class MnlAdjLog implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected MnlAdjLogPK mnlAdjLogPK;
    @Basic(optional = false)
    @Column(name = "ACCT_NBR")
    private String acctNbr;
    @Basic(optional = false)
    @Column(name = "CUST_NBR")
    private String custNbr;
    @Basic(optional = false)
    @Column(name = "DIV")
    private String div;
    @Basic(optional = false)
    @Column(name = "TRNS_TYP")
    private String trnsTyp;
    @Basic(optional = false)
    @Column(name = "DEB_CR_IND")
    private Character debCrInd;

    @Basic(optional = false)
    @Column(name = "AMT")
    private BigDecimal amt;
    @Basic(optional = false)
    @Column(name = "ITM_REF")
    private String itmRef;
    @Basic(optional = false)
    @Column(name = "PO_NBR")
    private String poNbr;
    @Basic(optional = false)
    @Column(name = "CDN_NOTES")
    private String cdnNotes;
    @Basic(optional = false)
    @Column(name = "MNL_DESC")
    private String mnlDesc;
    @Basic(optional = false)
    @Column(name = "GEAC_FLG")
    private Character geacFlg;
    @Basic(optional = false)
    @Column(name = "PSTD_FLG")
    private Character pstdFlg;
    @Basic(optional = false)
    @Column(name = "PSTD_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date pstdTs;
    @Basic(optional = false)
    @Column(name = "USR_ID")
    private String usrId;
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

    public MnlAdjLog() {
    }

    public MnlAdjLog(MnlAdjLogPK mnlAdjLogPK) {
        this.mnlAdjLogPK = mnlAdjLogPK;
    }

    public MnlAdjLog(MnlAdjLogPK mnlAdjLogPK, String acctNbr, String custNbr, String div, String trnsTyp, Character debCrInd, BigDecimal amt, String itmRef, String poNbr, String cdnNotes, String mnlDesc, Character geacFlg, Character pstdFlg, Date pstdTs, String usrId, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.mnlAdjLogPK = mnlAdjLogPK;
        this.acctNbr = acctNbr;
        this.custNbr = custNbr;
        this.div = div;
        this.trnsTyp = trnsTyp;
        this.debCrInd = debCrInd;
        this.amt = amt;
        this.itmRef = itmRef;
        this.poNbr = poNbr;
        this.cdnNotes = cdnNotes;
        this.mnlDesc = mnlDesc;
        this.geacFlg = geacFlg;
        this.pstdFlg = pstdFlg;
        this.pstdTs = pstdTs;
        this.usrId = usrId;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public MnlAdjLog(String crdNbr, Date entryTs) {
        this.mnlAdjLogPK = new MnlAdjLogPK(crdNbr, entryTs);
    }

    public MnlAdjLogPK getMnlAdjLogPK() {
        return mnlAdjLogPK;
    }

    public void setMnlAdjLogPK(MnlAdjLogPK mnlAdjLogPK) {
        this.mnlAdjLogPK = mnlAdjLogPK;
    }

    public String getAcctNbr() {
        return acctNbr;
    }

    public void setAcctNbr(String acctNbr) {
        this.acctNbr = acctNbr;
    }

    public String getCustNbr() {
        return custNbr;
    }

    public void setCustNbr(String custNbr) {
        this.custNbr = custNbr;
    }

    public String getDiv() {
        return div;
    }

    public void setDiv(String div) {
        this.div = div;
    }

    public String getTrnsTyp() {
        return trnsTyp;
    }

    public void setTrnsTyp(String trnsTyp) {
        this.trnsTyp = trnsTyp;
    }

    public Character getDebCrInd() {
        return debCrInd;
    }

    public void setDebCrInd(Character debCrInd) {
        this.debCrInd = debCrInd;
    }

    public BigDecimal getAmt() {
        return amt;
    }

    public void setAmt(BigDecimal amt) {
        this.amt = amt;
    }

    public String getItmRef() {
        return itmRef;
    }

    public void setItmRef(String itmRef) {
        this.itmRef = itmRef;
    }

    public String getPoNbr() {
        return poNbr;
    }

    public void setPoNbr(String poNbr) {
        this.poNbr = poNbr;
    }

    public String getCdnNotes() {
        return cdnNotes;
    }

    public void setCdnNotes(String cdnNotes) {
        this.cdnNotes = cdnNotes;
    }

    public String getMnlDesc() {
        return mnlDesc;
    }

    public void setMnlDesc(String mnlDesc) {
        this.mnlDesc = mnlDesc;
    }

    public Character getGeacFlg() {
        return geacFlg;
    }

    public void setGeacFlg(Character geacFlg) {
        this.geacFlg = geacFlg;
    }

    public Character getPstdFlg() {
        return pstdFlg;
    }

    public void setPstdFlg(Character pstdFlg) {
        this.pstdFlg = pstdFlg;
    }

    public Date getPstdTs() {
        return pstdTs;
    }

    public void setPstdTs(Date pstdTs) {
        this.pstdTs = pstdTs;
    }

    public String getUsrId() {
        return usrId;
    }

    public void setUsrId(String usrId) {
        this.usrId = usrId;
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
        hash += (mnlAdjLogPK != null ? mnlAdjLogPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof MnlAdjLog)) {
            return false;
        }
        MnlAdjLog other = (MnlAdjLog) object;
        if ((this.mnlAdjLogPK == null && other.mnlAdjLogPK != null) || (this.mnlAdjLogPK != null && !this.mnlAdjLogPK.equals(other.mnlAdjLogPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.MnlAdjLog[ mnlAdjLogPK=" + mnlAdjLogPK + " ]";
    }

}
