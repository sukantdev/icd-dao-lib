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
@Table(name = "PRD_CRD_BLNG", catalog = "", schema = "DBO")
public class PrdCrdBlng implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PrdCrdBlngPK prdCrdBlngPK;
    @Basic(optional = false)
    @Column(name = "CRD_NM")
    private String crdNm;
    @Basic(optional = false)
    @Column(name = "CRD_CTY")
    private String crdCty;
    @Basic(optional = false)
    @Column(name = "CRD_ST")
    private String crdSt;
    @Basic(optional = false)
    @Column(name = "NBR_CUST_ID")
    private int nbrCustId;
    @Basic(optional = false)
    @Column(name = "BLNG_CYC")
    private Character blngCyc;
    @Basic(optional = false)
    @Column(name = "BLNG_CYC_RESET")
    private String blngCycReset;
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

    public PrdCrdBlng() {
    }

    public PrdCrdBlng(PrdCrdBlngPK prdCrdBlngPK) {
        this.prdCrdBlngPK = prdCrdBlngPK;
    }

    public PrdCrdBlng(PrdCrdBlngPK prdCrdBlngPK, String crdNm, String crdCty, String crdSt, int nbrCustId, Character blngCyc, String blngCycReset, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.prdCrdBlngPK = prdCrdBlngPK;
        this.crdNm = crdNm;
        this.crdCty = crdCty;
        this.crdSt = crdSt;
        this.nbrCustId = nbrCustId;
        this.blngCyc = blngCyc;
        this.blngCycReset = blngCycReset;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public PrdCrdBlng(String applNbr, String childTyp) {
        this.prdCrdBlngPK = new PrdCrdBlngPK(applNbr, childTyp);
    }

    public PrdCrdBlngPK getPrdCrdBlngPK() {
        return prdCrdBlngPK;
    }

    public void setPrdCrdBlngPK(PrdCrdBlngPK prdCrdBlngPK) {
        this.prdCrdBlngPK = prdCrdBlngPK;
    }

    public String getCrdNm() {
        return crdNm;
    }

    public void setCrdNm(String crdNm) {
        this.crdNm = crdNm;
    }

    public String getCrdCty() {
        return crdCty;
    }

    public void setCrdCty(String crdCty) {
        this.crdCty = crdCty;
    }

    public String getCrdSt() {
        return crdSt;
    }

    public void setCrdSt(String crdSt) {
        this.crdSt = crdSt;
    }

    public int getNbrCustId() {
        return nbrCustId;
    }

    public void setNbrCustId(int nbrCustId) {
        this.nbrCustId = nbrCustId;
    }

    public Character getBlngCyc() {
        return blngCyc;
    }

    public void setBlngCyc(Character blngCyc) {
        this.blngCyc = blngCyc;
    }

    public String getBlngCycReset() {
        return blngCycReset;
    }

    public void setBlngCycReset(String blngCycReset) {
        this.blngCycReset = blngCycReset;
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
        hash += (prdCrdBlngPK != null ? prdCrdBlngPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof PrdCrdBlng)) {
            return false;
        }
        PrdCrdBlng other = (PrdCrdBlng) object;
        if ((this.prdCrdBlngPK == null && other.prdCrdBlngPK != null) || (this.prdCrdBlngPK != null && !this.prdCrdBlngPK.equals(other.prdCrdBlngPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.PrdCrdBlng[ prdCrdBlngPK=" + prdCrdBlngPK + " ]";
    }

}
