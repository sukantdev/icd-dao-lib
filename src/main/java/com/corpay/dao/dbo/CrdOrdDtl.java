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
@Table(name = "CRD_ORD_DTL", catalog = "", schema = "DBO")
public class CrdOrdDtl implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CrdOrdDtlPK crdOrdDtlPK;
    @Basic(optional = false)
    @Column(name = "CRD_ORD_STAT_CD")
    private Character crdOrdStatCd;
    @Basic(optional = false)
    @Column(name = "CRD_REQ_DT")
    @Temporal(TemporalType.DATE)
    private Date crdReqDt;
    @Basic(optional = false)
    @Column(name = "CRD_PNCH_DT")
    @Temporal(TemporalType.DATE)
    private Date crdPnchDt;
    @Basic(optional = false)
    @Column(name = "CRD_UNIT_NBR")
    private String crdUnitNbr;
    @Basic(optional = false)
    @Column(name = "FST_NM")
    private String fstNm;
    @Basic(optional = false)
    @Column(name = "LST_NM")
    private String lstNm;
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

    public CrdOrdDtl() {
    }

    public CrdOrdDtl(CrdOrdDtlPK crdOrdDtlPK) {
        this.crdOrdDtlPK = crdOrdDtlPK;
    }

    public CrdOrdDtl(CrdOrdDtlPK crdOrdDtlPK, Character crdOrdStatCd, Date crdReqDt, Date crdPnchDt, String crdUnitNbr, String fstNm, String lstNm, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.crdOrdDtlPK = crdOrdDtlPK;
        this.crdOrdStatCd = crdOrdStatCd;
        this.crdReqDt = crdReqDt;
        this.crdPnchDt = crdPnchDt;
        this.crdUnitNbr = crdUnitNbr;
        this.fstNm = fstNm;
        this.lstNm = lstNm;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public CrdOrdDtl(String custId, String crdTypCd, String crdStyleCd, Date crdReqTs, String crdNbr) {
        this.crdOrdDtlPK = new CrdOrdDtlPK(custId, crdTypCd, crdStyleCd, crdReqTs, crdNbr);
    }

    public CrdOrdDtlPK getCrdOrdDtlPK() {
        return crdOrdDtlPK;
    }

    public void setCrdOrdDtlPK(CrdOrdDtlPK crdOrdDtlPK) {
        this.crdOrdDtlPK = crdOrdDtlPK;
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

    public Date getCrdPnchDt() {
        return crdPnchDt;
    }

    public void setCrdPnchDt(Date crdPnchDt) {
        this.crdPnchDt = crdPnchDt;
    }

    public String getCrdUnitNbr() {
        return crdUnitNbr;
    }

    public void setCrdUnitNbr(String crdUnitNbr) {
        this.crdUnitNbr = crdUnitNbr;
    }

    public String getFstNm() {
        return fstNm;
    }

    public void setFstNm(String fstNm) {
        this.fstNm = fstNm;
    }

    public String getLstNm() {
        return lstNm;
    }

    public void setLstNm(String lstNm) {
        this.lstNm = lstNm;
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
        hash += (crdOrdDtlPK != null ? crdOrdDtlPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof CrdOrdDtl)) {
            return false;
        }
        CrdOrdDtl other = (CrdOrdDtl) object;
        if ((this.crdOrdDtlPK == null && other.crdOrdDtlPK != null) || (this.crdOrdDtlPK != null && !this.crdOrdDtlPK.equals(other.crdOrdDtlPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.CrdOrdDtl[ crdOrdDtlPK=" + crdOrdDtlPK + " ]";
    }

}
