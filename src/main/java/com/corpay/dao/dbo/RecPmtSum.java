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
@Table(name = "REC_PMT_SUM", catalog = "", schema = "DBO")
public class RecPmtSum implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private String id;
    @Basic(optional = false)
    @Column(name = "ACCT_NBR")
    private String acctNbr;
    @Basic(optional = false)
    @Column(name = "CUST_ID")
    private String custId;
    @Basic(optional = false)
    @Column(name = "VEND_NBR")
    private String vendNbr;
    @Basic(optional = false)
    @Column(name = "LOC_CD")
    private String locCd;
    @Basic(optional = false)
    @Column(name = "INIT_DT")
    @Temporal(TemporalType.DATE)
    private Date initDt;
    @Basic(optional = false)
    @Column(name = "END_DT")
    @Temporal(TemporalType.DATE)
    private Date endDt;
    @Basic(optional = false)
    @Column(name = "STAT_CD")
    private Character statCd;
    @Basic(optional = false)
    @Column(name = "FREQ_CD")
    private String freqCd;
    @Basic(optional = false)
    @Column(name = "TYPE_CD")
    private String typeCd;
    @Basic(optional = false)
    @Column(name = "MAX_PMTS")
    private int maxPmts;
    @Basic(optional = false)
    @Column(name = "PROCD_PMTS")
    private int procdPmts;
    @Basic(optional = false)
    @Column(name = "NEXT_PMT_DT")
    @Temporal(TemporalType.DATE)
    private Date nextPmtDt;
    @Basic(optional = false)
    @Column(name = "RJCT_RSN_TXT")
    private String rjctRsnTxt;
    @Basic(optional = false)
    @Column(name = "MDY_USR")
    private String mdyUsr;
    @Basic(optional = false)
    @Column(name = "MDY_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date mdyTs;
    @Basic(optional = false)
    @Column(name = "CRT_USR")
    private String crtUsr;
    @Basic(optional = false)
    @Column(name = "CRT_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date crtTs;
    @Basic(optional = false)
    @Column(name = "NTFY_TS_FLG")
    private Character ntfyTsFlg;
    @Basic(optional = false)
    @Column(name = "VEND_NM")
    private String vendNm;

    public RecPmtSum() {
    }

    public RecPmtSum(String id) {
        this.id = id;
    }

    public RecPmtSum(String id, String acctNbr, String custId, String vendNbr, String locCd, Date initDt, Date endDt, Character statCd, String freqCd, String typeCd, int maxPmts, int procdPmts, Date nextPmtDt, String rjctRsnTxt, String mdyUsr, Date mdyTs, String crtUsr, Date crtTs, Character ntfyTsFlg, String vendNm) {
        this.id = id;
        this.acctNbr = acctNbr;
        this.custId = custId;
        this.vendNbr = vendNbr;
        this.locCd = locCd;
        this.initDt = initDt;
        this.endDt = endDt;
        this.statCd = statCd;
        this.freqCd = freqCd;
        this.typeCd = typeCd;
        this.maxPmts = maxPmts;
        this.procdPmts = procdPmts;
        this.nextPmtDt = nextPmtDt;
        this.rjctRsnTxt = rjctRsnTxt;
        this.mdyUsr = mdyUsr;
        this.mdyTs = mdyTs;
        this.crtUsr = crtUsr;
        this.crtTs = crtTs;
        this.ntfyTsFlg = ntfyTsFlg;
        this.vendNm = vendNm;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getVendNbr() {
        return vendNbr;
    }

    public void setVendNbr(String vendNbr) {
        this.vendNbr = vendNbr;
    }

    public String getLocCd() {
        return locCd;
    }

    public void setLocCd(String locCd) {
        this.locCd = locCd;
    }

    public Date getInitDt() {
        return initDt;
    }

    public void setInitDt(Date initDt) {
        this.initDt = initDt;
    }

    public Date getEndDt() {
        return endDt;
    }

    public void setEndDt(Date endDt) {
        this.endDt = endDt;
    }

    public Character getStatCd() {
        return statCd;
    }

    public void setStatCd(Character statCd) {
        this.statCd = statCd;
    }

    public String getFreqCd() {
        return freqCd;
    }

    public void setFreqCd(String freqCd) {
        this.freqCd = freqCd;
    }

    public String getTypeCd() {
        return typeCd;
    }

    public void setTypeCd(String typeCd) {
        this.typeCd = typeCd;
    }

    public int getMaxPmts() {
        return maxPmts;
    }

    public void setMaxPmts(int maxPmts) {
        this.maxPmts = maxPmts;
    }

    public int getProcdPmts() {
        return procdPmts;
    }

    public void setProcdPmts(int procdPmts) {
        this.procdPmts = procdPmts;
    }

    public Date getNextPmtDt() {
        return nextPmtDt;
    }

    public void setNextPmtDt(Date nextPmtDt) {
        this.nextPmtDt = nextPmtDt;
    }

    public String getRjctRsnTxt() {
        return rjctRsnTxt;
    }

    public void setRjctRsnTxt(String rjctRsnTxt) {
        this.rjctRsnTxt = rjctRsnTxt;
    }

    public String getMdyUsr() {
        return mdyUsr;
    }

    public void setMdyUsr(String mdyUsr) {
        this.mdyUsr = mdyUsr;
    }

    public Date getMdyTs() {
        return mdyTs;
    }

    public void setMdyTs(Date mdyTs) {
        this.mdyTs = mdyTs;
    }

    public String getCrtUsr() {
        return crtUsr;
    }

    public void setCrtUsr(String crtUsr) {
        this.crtUsr = crtUsr;
    }

    public Date getCrtTs() {
        return crtTs;
    }

    public void setCrtTs(Date crtTs) {
        this.crtTs = crtTs;
    }

    public Character getNtfyTsFlg() {
        return ntfyTsFlg;
    }

    public void setNtfyTsFlg(Character ntfyTsFlg) {
        this.ntfyTsFlg = ntfyTsFlg;
    }

    public String getVendNm() {
        return vendNm;
    }

    public void setVendNm(String vendNm) {
        this.vendNm = vendNm;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof RecPmtSum)) {
            return false;
        }
        RecPmtSum other = (RecPmtSum) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.RecPmtSum[ id=" + id + " ]";
    }

}
