package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "PRD_TRNSLNK_CRD", catalog = "", schema = "DBO")
public class PrdTrnslnkCrd implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PrdTrnslnkCrdPK prdTrnslnkCrdPK;
    @Basic(optional = false)
    @Column(name = "CRD_FLG")
    private Character crdFlg;

    @Basic(optional = false)
    @Column(name = "AMT")
    private BigDecimal amt;
    @Basic(optional = false)
    @Column(name = "NBR_CARDS")
    private int nbrCards;
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

    public PrdTrnslnkCrd() {
    }

    public PrdTrnslnkCrd(PrdTrnslnkCrdPK prdTrnslnkCrdPK) {
        this.prdTrnslnkCrdPK = prdTrnslnkCrdPK;
    }

    public PrdTrnslnkCrd(PrdTrnslnkCrdPK prdTrnslnkCrdPK, Character crdFlg, BigDecimal amt, int nbrCards, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.prdTrnslnkCrdPK = prdTrnslnkCrdPK;
        this.crdFlg = crdFlg;
        this.amt = amt;
        this.nbrCards = nbrCards;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public PrdTrnslnkCrd(String applNbr, String childTyp, String crdTyp) {
        this.prdTrnslnkCrdPK = new PrdTrnslnkCrdPK(applNbr, childTyp, crdTyp);
    }

    public PrdTrnslnkCrdPK getPrdTrnslnkCrdPK() {
        return prdTrnslnkCrdPK;
    }

    public void setPrdTrnslnkCrdPK(PrdTrnslnkCrdPK prdTrnslnkCrdPK) {
        this.prdTrnslnkCrdPK = prdTrnslnkCrdPK;
    }

    public Character getCrdFlg() {
        return crdFlg;
    }

    public void setCrdFlg(Character crdFlg) {
        this.crdFlg = crdFlg;
    }

    public BigDecimal getAmt() {
        return amt;
    }

    public void setAmt(BigDecimal amt) {
        this.amt = amt;
    }

    public int getNbrCards() {
        return nbrCards;
    }

    public void setNbrCards(int nbrCards) {
        this.nbrCards = nbrCards;
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
        hash += (prdTrnslnkCrdPK != null ? prdTrnslnkCrdPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof PrdTrnslnkCrd)) {
            return false;
        }
        PrdTrnslnkCrd other = (PrdTrnslnkCrd) object;
        if ((this.prdTrnslnkCrdPK == null && other.prdTrnslnkCrdPK != null) || (this.prdTrnslnkCrdPK != null && !this.prdTrnslnkCrdPK.equals(other.prdTrnslnkCrdPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.PrdTrnslnkCrd[ prdTrnslnkCrdPK=" + prdTrnslnkCrdPK + " ]";
    }

}
