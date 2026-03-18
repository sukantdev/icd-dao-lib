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
@Table(name = "INV_TRNS_IND", catalog = "", schema = "DBO")
public class InvTrnsInd implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected InvTrnsIndPK invTrnsIndPK;
    @Basic(optional = false)
    @Column(name = "RVWD_FLG")
    private Character rvwdFlg;
    @Basic(optional = false)
    @Column(name = "TAX_PAID_FLG")
    private Character taxPaidFlg;
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

    public InvTrnsInd() {
    }

    public InvTrnsInd(InvTrnsIndPK invTrnsIndPK) {
        this.invTrnsIndPK = invTrnsIndPK;
    }

    public InvTrnsInd(InvTrnsIndPK invTrnsIndPK, Character rvwdFlg, Character taxPaidFlg, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.invTrnsIndPK = invTrnsIndPK;
        this.rvwdFlg = rvwdFlg;
        this.taxPaidFlg = taxPaidFlg;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public InvTrnsInd(Date pstdDt, int trnsId) {
        this.invTrnsIndPK = new InvTrnsIndPK(pstdDt, trnsId);
    }

    public InvTrnsIndPK getInvTrnsIndPK() {
        return invTrnsIndPK;
    }

    public void setInvTrnsIndPK(InvTrnsIndPK invTrnsIndPK) {
        this.invTrnsIndPK = invTrnsIndPK;
    }

    public Character getRvwdFlg() {
        return rvwdFlg;
    }

    public void setRvwdFlg(Character rvwdFlg) {
        this.rvwdFlg = rvwdFlg;
    }

    public Character getTaxPaidFlg() {
        return taxPaidFlg;
    }

    public void setTaxPaidFlg(Character taxPaidFlg) {
        this.taxPaidFlg = taxPaidFlg;
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
        hash += (invTrnsIndPK != null ? invTrnsIndPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof InvTrnsInd)) {
            return false;
        }
        InvTrnsInd other = (InvTrnsInd) object;
        if ((this.invTrnsIndPK == null && other.invTrnsIndPK != null) || (this.invTrnsIndPK != null && !this.invTrnsIndPK.equals(other.invTrnsIndPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.InvTrnsInd[ invTrnsIndPK=" + invTrnsIndPK + " ]";
    }

}
