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
@Table(name = "EXC_TRKG_HIST", catalog = "", schema = "DBO")
public class ExcTrkgHist implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ExcTrkgHistPK excTrkgHistPK;
    @Basic(optional = false)
    @Column(name = "TYP")
    private Character typ;
    @Basic(optional = false)
    @Column(name = "EXC_TRKG_HIST_DT")
    @Temporal(TemporalType.DATE)
    private Date excTrkgHistDt;
    @Basic(optional = false)
    @Column(name = "EXC_TRKG_HIST_TM")
    @Temporal(TemporalType.TIME)
    private Date excTrkgHistTm;
    @Basic(optional = false)
    @Column(name = "USERID")
    private String userid;
    @Basic(optional = false)
    @Column(name = "CUST_ACTN")
    private String custActn;
    @Basic(optional = false)
    @Column(name = "CDN_ACTN")
    private String cdnActn;
    @Basic(optional = false)
    @Column(name = "INT_ACTN")
    private String intActn;
    @Basic(optional = false)
    @Column(name = "CUST_STAT")
    private String custStat;
    @Basic(optional = false)
    @Column(name = "CDN_STAT")
    private String cdnStat;
    @Basic(optional = false)
    @Column(name = "CMNT")
    private String cmnt;
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

    public ExcTrkgHist() {
    }

    public ExcTrkgHist(ExcTrkgHistPK excTrkgHistPK) {
        this.excTrkgHistPK = excTrkgHistPK;
    }

    public ExcTrkgHist(ExcTrkgHistPK excTrkgHistPK, Character typ, Date excTrkgHistDt, Date excTrkgHistTm, String userid, String custActn, String cdnActn, String intActn, String custStat, String cdnStat, String cmnt, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.excTrkgHistPK = excTrkgHistPK;
        this.typ = typ;
        this.excTrkgHistDt = excTrkgHistDt;
        this.excTrkgHistTm = excTrkgHistTm;
        this.userid = userid;
        this.custActn = custActn;
        this.cdnActn = cdnActn;
        this.intActn = intActn;
        this.custStat = custStat;
        this.cdnStat = cdnStat;
        this.cmnt = cmnt;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public ExcTrkgHist(Date pstdDt, int trnsId, short seqNbr) {
        this.excTrkgHistPK = new ExcTrkgHistPK(pstdDt, trnsId, seqNbr);
    }

    public ExcTrkgHistPK getExcTrkgHistPK() {
        return excTrkgHistPK;
    }

    public void setExcTrkgHistPK(ExcTrkgHistPK excTrkgHistPK) {
        this.excTrkgHistPK = excTrkgHistPK;
    }

    public Character getTyp() {
        return typ;
    }

    public void setTyp(Character typ) {
        this.typ = typ;
    }

    public Date getExcTrkgHistDt() {
        return excTrkgHistDt;
    }

    public void setExcTrkgHistDt(Date excTrkgHistDt) {
        this.excTrkgHistDt = excTrkgHistDt;
    }

    public Date getExcTrkgHistTm() {
        return excTrkgHistTm;
    }

    public void setExcTrkgHistTm(Date excTrkgHistTm) {
        this.excTrkgHistTm = excTrkgHistTm;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getCustActn() {
        return custActn;
    }

    public void setCustActn(String custActn) {
        this.custActn = custActn;
    }

    public String getCdnActn() {
        return cdnActn;
    }

    public void setCdnActn(String cdnActn) {
        this.cdnActn = cdnActn;
    }

    public String getIntActn() {
        return intActn;
    }

    public void setIntActn(String intActn) {
        this.intActn = intActn;
    }

    public String getCustStat() {
        return custStat;
    }

    public void setCustStat(String custStat) {
        this.custStat = custStat;
    }

    public String getCdnStat() {
        return cdnStat;
    }

    public void setCdnStat(String cdnStat) {
        this.cdnStat = cdnStat;
    }

    public String getCmnt() {
        return cmnt;
    }

    public void setCmnt(String cmnt) {
        this.cmnt = cmnt;
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
        hash += (excTrkgHistPK != null ? excTrkgHistPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof ExcTrkgHist)) {
            return false;
        }
        ExcTrkgHist other = (ExcTrkgHist) object;
        if ((this.excTrkgHistPK == null && other.excTrkgHistPK != null) || (this.excTrkgHistPK != null && !this.excTrkgHistPK.equals(other.excTrkgHistPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.ExcTrkgHist[ excTrkgHistPK=" + excTrkgHistPK + " ]";
    }

}
