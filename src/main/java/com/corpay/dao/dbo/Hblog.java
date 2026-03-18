package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "HBLOG", catalog = "", schema = "DBO")
public class Hblog implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected HblogPK hblogPK;
    @Basic(optional = false)
    @Column(name = "CICS_USR_ID")
    private String cicsUsrId;
    @Basic(optional = false)
    @Column(name = "CICS_REGION_ID")
    private String cicsRegionId;
    @Basic(optional = false)
    @Column(name = "API_SVC_NM")
    private String apiSvcNm;
    @Basic(optional = false)
    @Lob
    @Column(name = "DATA_IN_TXT")
    private String dataInTxt;
    @Basic(optional = false)
    @Lob
    @Column(name = "DATA_OUT_TXT")
    private String dataOutTxt;
    @Basic(optional = false)
    @Column(name = "STAT_CD")
    private String statCd;
    @Basic(optional = false)
    @Column(name = "CMPLTN_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date cmpltnTs;

    @Basic(optional = false)
    @Column(name = "ELAP_SECONDS")
    private BigDecimal elapSeconds;
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
    @Column(name = "DB2_GENERATED_ROWID_FOR_LOBS")
    private Serializable db2GeneratedRowidForLobs;

    public Hblog() {
    }

    public Hblog(HblogPK hblogPK) {
        this.hblogPK = hblogPK;
    }

    public Hblog(HblogPK hblogPK, String cicsUsrId, String cicsRegionId, String apiSvcNm, String dataInTxt, String dataOutTxt, String statCd, Date cmpltnTs, BigDecimal elapSeconds, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr, Serializable db2GeneratedRowidForLobs) {
        this.hblogPK = hblogPK;
        this.cicsUsrId = cicsUsrId;
        this.cicsRegionId = cicsRegionId;
        this.apiSvcNm = apiSvcNm;
        this.dataInTxt = dataInTxt;
        this.dataOutTxt = dataOutTxt;
        this.statCd = statCd;
        this.cmpltnTs = cmpltnTs;
        this.elapSeconds = elapSeconds;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
        this.db2GeneratedRowidForLobs = db2GeneratedRowidForLobs;
    }

    public Hblog(Date staTs, int cicsEibtasknNbr) {
        this.hblogPK = new HblogPK(staTs, cicsEibtasknNbr);
    }

    public HblogPK getHblogPK() {
        return hblogPK;
    }

    public void setHblogPK(HblogPK hblogPK) {
        this.hblogPK = hblogPK;
    }

    public String getCicsUsrId() {
        return cicsUsrId;
    }

    public void setCicsUsrId(String cicsUsrId) {
        this.cicsUsrId = cicsUsrId;
    }

    public String getCicsRegionId() {
        return cicsRegionId;
    }

    public void setCicsRegionId(String cicsRegionId) {
        this.cicsRegionId = cicsRegionId;
    }

    public String getApiSvcNm() {
        return apiSvcNm;
    }

    public void setApiSvcNm(String apiSvcNm) {
        this.apiSvcNm = apiSvcNm;
    }

    public String getDataInTxt() {
        return dataInTxt;
    }

    public void setDataInTxt(String dataInTxt) {
        this.dataInTxt = dataInTxt;
    }

    public String getDataOutTxt() {
        return dataOutTxt;
    }

    public void setDataOutTxt(String dataOutTxt) {
        this.dataOutTxt = dataOutTxt;
    }

    public String getStatCd() {
        return statCd;
    }

    public void setStatCd(String statCd) {
        this.statCd = statCd;
    }

    public Date getCmpltnTs() {
        return cmpltnTs;
    }

    public void setCmpltnTs(Date cmpltnTs) {
        this.cmpltnTs = cmpltnTs;
    }

    public BigDecimal getElapSeconds() {
        return elapSeconds;
    }

    public void setElapSeconds(BigDecimal elapSeconds) {
        this.elapSeconds = elapSeconds;
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

    public Serializable getDb2GeneratedRowidForLobs() {
        return db2GeneratedRowidForLobs;
    }

    public void setDb2GeneratedRowidForLobs(Serializable db2GeneratedRowidForLobs) {
        this.db2GeneratedRowidForLobs = db2GeneratedRowidForLobs;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (hblogPK != null ? hblogPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof Hblog)) {
            return false;
        }
        Hblog other = (Hblog) object;
        if ((this.hblogPK == null && other.hblogPK != null) || (this.hblogPK != null && !this.hblogPK.equals(other.hblogPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.Hblog[ hblogPK=" + hblogPK + " ]";
    }

}
