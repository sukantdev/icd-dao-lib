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
@Table(name = "CRD_INV", catalog = "", schema = "DBO")
public class CrdInv implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CrdInvPK crdInvPK;
    @Basic(optional = false)
    @Column(name = "CRD_NBR")
    private int crdNbr;
    @Basic(optional = false)
    @Column(name = "BIN_CD")
    private int binCd;
    @Basic(optional = false)
    @Column(name = "CRD_STAT_IND")
    private Character crdStatInd;
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

    public CrdInv() {
    }

    public CrdInv(CrdInvPK crdInvPK) {
        this.crdInvPK = crdInvPK;
    }

    public CrdInv(CrdInvPK crdInvPK, int crdNbr, int binCd, Character crdStatInd, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.crdInvPK = crdInvPK;
        this.crdNbr = crdNbr;
        this.binCd = binCd;
        this.crdStatInd = crdStatInd;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public CrdInv(String crdTypCd, String crdFrmtCd, int seqNbr) {
        this.crdInvPK = new CrdInvPK(crdTypCd, crdFrmtCd, seqNbr);
    }

    public CrdInvPK getCrdInvPK() {
        return crdInvPK;
    }

    public void setCrdInvPK(CrdInvPK crdInvPK) {
        this.crdInvPK = crdInvPK;
    }

    public int getCrdNbr() {
        return crdNbr;
    }

    public void setCrdNbr(int crdNbr) {
        this.crdNbr = crdNbr;
    }

    public int getBinCd() {
        return binCd;
    }

    public void setBinCd(int binCd) {
        this.binCd = binCd;
    }

    public Character getCrdStatInd() {
        return crdStatInd;
    }

    public void setCrdStatInd(Character crdStatInd) {
        this.crdStatInd = crdStatInd;
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
        hash += (crdInvPK != null ? crdInvPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof CrdInv)) {
            return false;
        }
        CrdInv other = (CrdInv) object;
        if ((this.crdInvPK == null && other.crdInvPK != null) || (this.crdInvPK != null && !this.crdInvPK.equals(other.crdInvPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.CrdInv[ crdInvPK=" + crdInvPK + " ]";
    }

}
