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
@Table(name = "VP_EMAIL_TMPLT_OPTIONS", catalog = "", schema = "DBO")
public class VpEmailTmpltOptions implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected VpEmailTmpltOptionsPK vpEmailTmpltOptionsPK;
    @Basic(optional = false)
    @Column(name = "TMPLT_STAT_CD")
    private Character tmpltStatCd;
    @Basic(optional = false)
    @Column(name = "EMAIL_TYP")
    private String emailTyp;
    @Basic(optional = false)
    @Column(name = "INV_COLMNS")
    private String invColmns;
    @Basic(optional = false)
    @Column(name = "CRD_COLMNS")
    private String crdColmns;
    @Basic(optional = false)
    @Column(name = "LOGO_URL")
    private String logoUrl;
    @Basic(optional = false)
    @Column(name = "EMAIL_CMNT")
    private String emailCmnt;
    @Basic(optional = false)
    @Column(name = "FOOTER")
    private String footer;
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
    @Column(name = "CRD_FRNT_IMG_URL")
    private String crdFrntImgUrl;
    @Basic(optional = false)
    @Column(name = "CRD_BCK_IMG_URL")
    private String crdBckImgUrl;
    @Basic(optional = false)
    @Column(name = "DISCR1_DSPLY_NM")
    private String discr1DsplyNm;
    @Basic(optional = false)
    @Column(name = "DISCR2_DSPLY_NM")
    private String discr2DsplyNm;
    @Basic(optional = false)
    @Column(name = "DISCR3_DSPLY_NM")
    private String discr3DsplyNm;
    @Basic(optional = false)
    @Column(name = "GLACT_DSPLY_NM")
    private String glactDsplyNm;

    public VpEmailTmpltOptions() {
    }

    public VpEmailTmpltOptions(VpEmailTmpltOptionsPK vpEmailTmpltOptionsPK) {
        this.vpEmailTmpltOptionsPK = vpEmailTmpltOptionsPK;
    }

    public VpEmailTmpltOptions(VpEmailTmpltOptionsPK vpEmailTmpltOptionsPK, Character tmpltStatCd, String emailTyp, String invColmns, String crdColmns, String logoUrl, String emailCmnt, String footer, String mdyUsr, Date mdyTs, String crtUsr, Date crtTs, String crdFrntImgUrl, String crdBckImgUrl, String discr1DsplyNm, String discr2DsplyNm, String discr3DsplyNm, String glactDsplyNm) {
        this.vpEmailTmpltOptionsPK = vpEmailTmpltOptionsPK;
        this.tmpltStatCd = tmpltStatCd;
        this.emailTyp = emailTyp;
        this.invColmns = invColmns;
        this.crdColmns = crdColmns;
        this.logoUrl = logoUrl;
        this.emailCmnt = emailCmnt;
        this.footer = footer;
        this.mdyUsr = mdyUsr;
        this.mdyTs = mdyTs;
        this.crtUsr = crtUsr;
        this.crtTs = crtTs;
        this.crdFrntImgUrl = crdFrntImgUrl;
        this.crdBckImgUrl = crdBckImgUrl;
        this.discr1DsplyNm = discr1DsplyNm;
        this.discr2DsplyNm = discr2DsplyNm;
        this.discr3DsplyNm = discr3DsplyNm;
        this.glactDsplyNm = glactDsplyNm;
    }

    public VpEmailTmpltOptions(String custId, String acctNbr, String tmpltId) {
        this.vpEmailTmpltOptionsPK = new VpEmailTmpltOptionsPK(custId, acctNbr, tmpltId);
    }

    public VpEmailTmpltOptionsPK getVpEmailTmpltOptionsPK() {
        return vpEmailTmpltOptionsPK;
    }

    public void setVpEmailTmpltOptionsPK(VpEmailTmpltOptionsPK vpEmailTmpltOptionsPK) {
        this.vpEmailTmpltOptionsPK = vpEmailTmpltOptionsPK;
    }

    public Character getTmpltStatCd() {
        return tmpltStatCd;
    }

    public void setTmpltStatCd(Character tmpltStatCd) {
        this.tmpltStatCd = tmpltStatCd;
    }

    public String getEmailTyp() {
        return emailTyp;
    }

    public void setEmailTyp(String emailTyp) {
        this.emailTyp = emailTyp;
    }

    public String getInvColmns() {
        return invColmns;
    }

    public void setInvColmns(String invColmns) {
        this.invColmns = invColmns;
    }

    public String getCrdColmns() {
        return crdColmns;
    }

    public void setCrdColmns(String crdColmns) {
        this.crdColmns = crdColmns;
    }

    public String getLogoUrl() {
        return logoUrl;
    }

    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
    }

    public String getEmailCmnt() {
        return emailCmnt;
    }

    public void setEmailCmnt(String emailCmnt) {
        this.emailCmnt = emailCmnt;
    }

    public String getFooter() {
        return footer;
    }

    public void setFooter(String footer) {
        this.footer = footer;
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

    public String getCrdFrntImgUrl() {
        return crdFrntImgUrl;
    }

    public void setCrdFrntImgUrl(String crdFrntImgUrl) {
        this.crdFrntImgUrl = crdFrntImgUrl;
    }

    public String getCrdBckImgUrl() {
        return crdBckImgUrl;
    }

    public void setCrdBckImgUrl(String crdBckImgUrl) {
        this.crdBckImgUrl = crdBckImgUrl;
    }

    public String getDiscr1DsplyNm() {
        return discr1DsplyNm;
    }

    public void setDiscr1DsplyNm(String discr1DsplyNm) {
        this.discr1DsplyNm = discr1DsplyNm;
    }

    public String getDiscr2DsplyNm() {
        return discr2DsplyNm;
    }

    public void setDiscr2DsplyNm(String discr2DsplyNm) {
        this.discr2DsplyNm = discr2DsplyNm;
    }

    public String getDiscr3DsplyNm() {
        return discr3DsplyNm;
    }

    public void setDiscr3DsplyNm(String discr3DsplyNm) {
        this.discr3DsplyNm = discr3DsplyNm;
    }

    public String getGlactDsplyNm() {
        return glactDsplyNm;
    }

    public void setGlactDsplyNm(String glactDsplyNm) {
        this.glactDsplyNm = glactDsplyNm;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (vpEmailTmpltOptionsPK != null ? vpEmailTmpltOptionsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof VpEmailTmpltOptions)) {
            return false;
        }
        VpEmailTmpltOptions other = (VpEmailTmpltOptions) object;
        if ((this.vpEmailTmpltOptionsPK == null && other.vpEmailTmpltOptionsPK != null) || (this.vpEmailTmpltOptionsPK != null && !this.vpEmailTmpltOptionsPK.equals(other.vpEmailTmpltOptionsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.VpEmailTmpltOptions[ vpEmailTmpltOptionsPK=" + vpEmailTmpltOptionsPK + " ]";
    }

}
