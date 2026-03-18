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
@Table(name = "VP_CV_MAST_HIST", catalog = "", schema = "DBO")
public class VpCvMastHist implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected VpCvMastHistPK vpCvMastHistPK;
    @Basic(optional = false)
    @Column(name = "VEND_NM")
    private String vendNm;
    @Basic(optional = false)
    @Column(name = "CDN_PAY_METH")
    private String cdnPayMeth;
    @Basic(optional = false)
    @Column(name = "VEND_ENROLL_STAT")
    private Character vendEnrollStat;
    @Basic(optional = false)
    @Column(name = "WELCOME_LTR_STAT")
    private Character welcomeLtrStat;
    @Basic(optional = false)
    @Column(name = "PROJ_ANN_SPND")
    private long projAnnSpnd;
    @Basic(optional = false)
    @Column(name = "REMIT_EMAIL")
    private String remitEmail;
    @Basic(optional = false)
    @Column(name = "SRV_CENTER_CD")
    private String srvCenterCd;
    @Basic(optional = false)
    @Column(name = "MATCH_CD")
    private Character matchCd;
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
    @Column(name = "REMIT_INSTRUCTIONS")
    private String remitInstructions;

    public VpCvMastHist() {
    }

    public VpCvMastHist(VpCvMastHistPK vpCvMastHistPK) {
        this.vpCvMastHistPK = vpCvMastHistPK;
    }

    public VpCvMastHist(VpCvMastHistPK vpCvMastHistPK, String vendNm, String cdnPayMeth, Character vendEnrollStat, Character welcomeLtrStat, long projAnnSpnd, String remitEmail, String srvCenterCd, Character matchCd, String mdyUsr, Date mdyTs, String crtUsr, String remitInstructions) {
        this.vpCvMastHistPK = vpCvMastHistPK;
        this.vendNm = vendNm;
        this.cdnPayMeth = cdnPayMeth;
        this.vendEnrollStat = vendEnrollStat;
        this.welcomeLtrStat = welcomeLtrStat;
        this.projAnnSpnd = projAnnSpnd;
        this.remitEmail = remitEmail;
        this.srvCenterCd = srvCenterCd;
        this.matchCd = matchCd;
        this.mdyUsr = mdyUsr;
        this.mdyTs = mdyTs;
        this.crtUsr = crtUsr;
        this.remitInstructions = remitInstructions;
    }

    public VpCvMastHist(String cvMastId, Date crtTs) {
        this.vpCvMastHistPK = new VpCvMastHistPK(cvMastId, crtTs);
    }

    public VpCvMastHistPK getVpCvMastHistPK() {
        return vpCvMastHistPK;
    }

    public void setVpCvMastHistPK(VpCvMastHistPK vpCvMastHistPK) {
        this.vpCvMastHistPK = vpCvMastHistPK;
    }

    public String getVendNm() {
        return vendNm;
    }

    public void setVendNm(String vendNm) {
        this.vendNm = vendNm;
    }

    public String getCdnPayMeth() {
        return cdnPayMeth;
    }

    public void setCdnPayMeth(String cdnPayMeth) {
        this.cdnPayMeth = cdnPayMeth;
    }

    public Character getVendEnrollStat() {
        return vendEnrollStat;
    }

    public void setVendEnrollStat(Character vendEnrollStat) {
        this.vendEnrollStat = vendEnrollStat;
    }

    public Character getWelcomeLtrStat() {
        return welcomeLtrStat;
    }

    public void setWelcomeLtrStat(Character welcomeLtrStat) {
        this.welcomeLtrStat = welcomeLtrStat;
    }

    public long getProjAnnSpnd() {
        return projAnnSpnd;
    }

    public void setProjAnnSpnd(long projAnnSpnd) {
        this.projAnnSpnd = projAnnSpnd;
    }

    public String getRemitEmail() {
        return remitEmail;
    }

    public void setRemitEmail(String remitEmail) {
        this.remitEmail = remitEmail;
    }

    public String getSrvCenterCd() {
        return srvCenterCd;
    }

    public void setSrvCenterCd(String srvCenterCd) {
        this.srvCenterCd = srvCenterCd;
    }

    public Character getMatchCd() {
        return matchCd;
    }

    public void setMatchCd(Character matchCd) {
        this.matchCd = matchCd;
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

    public String getRemitInstructions() {
        return remitInstructions;
    }

    public void setRemitInstructions(String remitInstructions) {
        this.remitInstructions = remitInstructions;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (vpCvMastHistPK != null ? vpCvMastHistPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof VpCvMastHist)) {
            return false;
        }
        VpCvMastHist other = (VpCvMastHist) object;
        if ((this.vpCvMastHistPK == null && other.vpCvMastHistPK != null) || (this.vpCvMastHistPK != null && !this.vpCvMastHistPK.equals(other.vpCvMastHistPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.VpCvMastHist[ vpCvMastHistPK=" + vpCvMastHistPK + " ]";
    }

}
