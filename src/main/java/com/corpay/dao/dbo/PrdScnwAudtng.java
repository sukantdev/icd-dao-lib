package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "PRD_SCNW_AUDTNG", catalog = "", schema = "DBO")
public class PrdScnwAudtng implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "APPL_NBR")
    private String applNbr;
    @Basic(optional = false)
    @Column(name = "LOG_ACCT_CD")
    private String logAcctCd;
    @Basic(optional = false)
    @Column(name = "NBR_DRIVERS")
    private int nbrDrivers;

    @Basic(optional = false)
    @Column(name = "RT_PER_DRV")
    private BigDecimal rtPerDrv;
    @Basic(optional = false)
    @Column(name = "LOG_AUDTNG_ONLY")
    private Character logAudtngOnly;
    @Basic(optional = false)
    @Column(name = "LOG_AUDTNG_FL")
    private Character logAudtngFl;
    @Basic(optional = false)
    @Column(name = "EFCTV_SRV_DT")
    @Temporal(TemporalType.DATE)
    private Date efctvSrvDt;
    @Basic(optional = false)
    @Column(name = "FL_ACQR_CHOICE")
    private Character flAcqrChoice;
    @Basic(optional = false)
    @Column(name = "FL_ACQR_OTH_DESC")
    private String flAcqrOthDesc;
    @Basic(optional = false)
    @Column(name = "ASGN_CHOICE")
    private Character asgnChoice;
    @Basic(optional = false)
    @Column(name = "ASGN_OTH_DESC")
    private String asgnOthDesc;
    @Basic(optional = false)
    @Column(name = "COMP_CHOICE")
    private Character compChoice;
    @Basic(optional = false)
    @Column(name = "COMP_OTH_DESC")
    private String compOthDesc;
    @Basic(optional = false)
    @Column(name = "ADTL_SRVS_FLG")
    private short adtlSrvsFlg;
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

    public PrdScnwAudtng() {
    }

    public PrdScnwAudtng(String applNbr) {
        this.applNbr = applNbr;
    }

    public PrdScnwAudtng(String applNbr, String logAcctCd, int nbrDrivers, BigDecimal rtPerDrv, Character logAudtngOnly, Character logAudtngFl, Date efctvSrvDt, Character flAcqrChoice, String flAcqrOthDesc, Character asgnChoice, String asgnOthDesc, Character compChoice, String compOthDesc, short adtlSrvsFlg, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.applNbr = applNbr;
        this.logAcctCd = logAcctCd;
        this.nbrDrivers = nbrDrivers;
        this.rtPerDrv = rtPerDrv;
        this.logAudtngOnly = logAudtngOnly;
        this.logAudtngFl = logAudtngFl;
        this.efctvSrvDt = efctvSrvDt;
        this.flAcqrChoice = flAcqrChoice;
        this.flAcqrOthDesc = flAcqrOthDesc;
        this.asgnChoice = asgnChoice;
        this.asgnOthDesc = asgnOthDesc;
        this.compChoice = compChoice;
        this.compOthDesc = compOthDesc;
        this.adtlSrvsFlg = adtlSrvsFlg;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public String getApplNbr() {
        return applNbr;
    }

    public void setApplNbr(String applNbr) {
        this.applNbr = applNbr;
    }

    public String getLogAcctCd() {
        return logAcctCd;
    }

    public void setLogAcctCd(String logAcctCd) {
        this.logAcctCd = logAcctCd;
    }

    public int getNbrDrivers() {
        return nbrDrivers;
    }

    public void setNbrDrivers(int nbrDrivers) {
        this.nbrDrivers = nbrDrivers;
    }

    public BigDecimal getRtPerDrv() {
        return rtPerDrv;
    }

    public void setRtPerDrv(BigDecimal rtPerDrv) {
        this.rtPerDrv = rtPerDrv;
    }

    public Character getLogAudtngOnly() {
        return logAudtngOnly;
    }

    public void setLogAudtngOnly(Character logAudtngOnly) {
        this.logAudtngOnly = logAudtngOnly;
    }

    public Character getLogAudtngFl() {
        return logAudtngFl;
    }

    public void setLogAudtngFl(Character logAudtngFl) {
        this.logAudtngFl = logAudtngFl;
    }

    public Date getEfctvSrvDt() {
        return efctvSrvDt;
    }

    public void setEfctvSrvDt(Date efctvSrvDt) {
        this.efctvSrvDt = efctvSrvDt;
    }

    public Character getFlAcqrChoice() {
        return flAcqrChoice;
    }

    public void setFlAcqrChoice(Character flAcqrChoice) {
        this.flAcqrChoice = flAcqrChoice;
    }

    public String getFlAcqrOthDesc() {
        return flAcqrOthDesc;
    }

    public void setFlAcqrOthDesc(String flAcqrOthDesc) {
        this.flAcqrOthDesc = flAcqrOthDesc;
    }

    public Character getAsgnChoice() {
        return asgnChoice;
    }

    public void setAsgnChoice(Character asgnChoice) {
        this.asgnChoice = asgnChoice;
    }

    public String getAsgnOthDesc() {
        return asgnOthDesc;
    }

    public void setAsgnOthDesc(String asgnOthDesc) {
        this.asgnOthDesc = asgnOthDesc;
    }

    public Character getCompChoice() {
        return compChoice;
    }

    public void setCompChoice(Character compChoice) {
        this.compChoice = compChoice;
    }

    public String getCompOthDesc() {
        return compOthDesc;
    }

    public void setCompOthDesc(String compOthDesc) {
        this.compOthDesc = compOthDesc;
    }

    public short getAdtlSrvsFlg() {
        return adtlSrvsFlg;
    }

    public void setAdtlSrvsFlg(short adtlSrvsFlg) {
        this.adtlSrvsFlg = adtlSrvsFlg;
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
        hash += (applNbr != null ? applNbr.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof PrdScnwAudtng)) {
            return false;
        }
        PrdScnwAudtng other = (PrdScnwAudtng) object;
        if ((this.applNbr == null && other.applNbr != null) || (this.applNbr != null && !this.applNbr.equals(other.applNbr))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.PrdScnwAudtng[ applNbr=" + applNbr + " ]";
    }

}
