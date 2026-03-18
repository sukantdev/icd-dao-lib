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
@Table(name = "CR_APPL_REF", catalog = "", schema = "DBO")
public class CrApplRef implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CrApplRefPK crApplRefPK;
    @Basic(optional = false)
    @Column(name = "REF_NM")
    private String refNm;
    @Basic(optional = false)
    @Column(name = "ADDR1")
    private String addr1;
    @Basic(optional = false)
    @Column(name = "CTY")
    private String cty;
    @Basic(optional = false)
    @Column(name = "ST")
    private String st;
    @Basic(optional = false)
    @Column(name = "POST_CD")
    private String postCd;
    @Basic(optional = false)
    @Column(name = "CRTY")
    private String crty;
    @Basic(optional = false)
    @Column(name = "PH")
    private String ph;
    @Basic(optional = false)
    @Column(name = "FAX")
    private String fax;
    @Basic(optional = false)
    @Column(name = "CNTCT_FST_NM")
    private String cntctFstNm;
    @Basic(optional = false)
    @Column(name = "CNTCT_LST_NM")
    private String cntctLstNm;
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

    public CrApplRef() {
    }

    public CrApplRef(CrApplRefPK crApplRefPK) {
        this.crApplRefPK = crApplRefPK;
    }

    public CrApplRef(CrApplRefPK crApplRefPK, String refNm, String addr1, String cty, String st, String postCd, String crty, String ph, String fax, String cntctFstNm, String cntctLstNm, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.crApplRefPK = crApplRefPK;
        this.refNm = refNm;
        this.addr1 = addr1;
        this.cty = cty;
        this.st = st;
        this.postCd = postCd;
        this.crty = crty;
        this.ph = ph;
        this.fax = fax;
        this.cntctFstNm = cntctFstNm;
        this.cntctLstNm = cntctLstNm;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public CrApplRef(String applNbr, short seqNbr) {
        this.crApplRefPK = new CrApplRefPK(applNbr, seqNbr);
    }

    public CrApplRefPK getCrApplRefPK() {
        return crApplRefPK;
    }

    public void setCrApplRefPK(CrApplRefPK crApplRefPK) {
        this.crApplRefPK = crApplRefPK;
    }

    public String getRefNm() {
        return refNm;
    }

    public void setRefNm(String refNm) {
        this.refNm = refNm;
    }

    public String getAddr1() {
        return addr1;
    }

    public void setAddr1(String addr1) {
        this.addr1 = addr1;
    }

    public String getCty() {
        return cty;
    }

    public void setCty(String cty) {
        this.cty = cty;
    }

    public String getSt() {
        return st;
    }

    public void setSt(String st) {
        this.st = st;
    }

    public String getPostCd() {
        return postCd;
    }

    public void setPostCd(String postCd) {
        this.postCd = postCd;
    }

    public String getCrty() {
        return crty;
    }

    public void setCrty(String crty) {
        this.crty = crty;
    }

    public String getPh() {
        return ph;
    }

    public void setPh(String ph) {
        this.ph = ph;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getCntctFstNm() {
        return cntctFstNm;
    }

    public void setCntctFstNm(String cntctFstNm) {
        this.cntctFstNm = cntctFstNm;
    }

    public String getCntctLstNm() {
        return cntctLstNm;
    }

    public void setCntctLstNm(String cntctLstNm) {
        this.cntctLstNm = cntctLstNm;
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
        hash += (crApplRefPK != null ? crApplRefPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof CrApplRef)) {
            return false;
        }
        CrApplRef other = (CrApplRef) object;
        if ((this.crApplRefPK == null && other.crApplRefPK != null) || (this.crApplRefPK != null && !this.crApplRefPK.equals(other.crApplRefPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.CrApplRef[ crApplRefPK=" + crApplRefPK + " ]";
    }

}
