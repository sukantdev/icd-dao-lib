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
@Table(name = "CR_APPL_USR_HIST", catalog = "", schema = "DBO")
public class CrApplUsrHist implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CrApplUsrHistPK crApplUsrHistPK;
    @Basic(optional = false)
    @Column(name = "COMP_NM")
    private String compNm;
    @Basic(optional = false)
    @Column(name = "SCRN_TITLE")
    private String scrnTitle;
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

    public CrApplUsrHist() {
    }

    public CrApplUsrHist(CrApplUsrHistPK crApplUsrHistPK) {
        this.crApplUsrHistPK = crApplUsrHistPK;
    }

    public CrApplUsrHist(CrApplUsrHistPK crApplUsrHistPK, String compNm, String scrnTitle, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.crApplUsrHistPK = crApplUsrHistPK;
        this.compNm = compNm;
        this.scrnTitle = scrnTitle;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public CrApplUsrHist(String usrId, String applNbr, Date savedDt) {
        this.crApplUsrHistPK = new CrApplUsrHistPK(usrId, applNbr, savedDt);
    }

    public CrApplUsrHistPK getCrApplUsrHistPK() {
        return crApplUsrHistPK;
    }

    public void setCrApplUsrHistPK(CrApplUsrHistPK crApplUsrHistPK) {
        this.crApplUsrHistPK = crApplUsrHistPK;
    }

    public String getCompNm() {
        return compNm;
    }

    public void setCompNm(String compNm) {
        this.compNm = compNm;
    }

    public String getScrnTitle() {
        return scrnTitle;
    }

    public void setScrnTitle(String scrnTitle) {
        this.scrnTitle = scrnTitle;
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
        hash += (crApplUsrHistPK != null ? crApplUsrHistPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof CrApplUsrHist)) {
            return false;
        }
        CrApplUsrHist other = (CrApplUsrHist) object;
        if ((this.crApplUsrHistPK == null && other.crApplUsrHistPK != null) || (this.crApplUsrHistPK != null && !this.crApplUsrHistPK.equals(other.crApplUsrHistPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.CrApplUsrHist[ crApplUsrHistPK=" + crApplUsrHistPK + " ]";
    }

}
