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
@Table(name = "INV_PPNE_DCMNT", catalog = "", schema = "DBO")
public class InvPpneDcmnt implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected InvPpneDcmntPK invPpneDcmntPK;
    @Basic(optional = false)
    @Column(name = "ORGL_DCMNT_NBR")
    private String orglDcmntNbr;
    @Basic(optional = false)
    @Column(name = "NEW_DCMNT_NBR")
    private String newDcmntNbr;
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

    public InvPpneDcmnt() {
    }

    public InvPpneDcmnt(InvPpneDcmntPK invPpneDcmntPK) {
        this.invPpneDcmntPK = invPpneDcmntPK;
    }

    public InvPpneDcmnt(InvPpneDcmntPK invPpneDcmntPK, String orglDcmntNbr, String newDcmntNbr, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.invPpneDcmntPK = invPpneDcmntPK;
        this.orglDcmntNbr = orglDcmntNbr;
        this.newDcmntNbr = newDcmntNbr;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public InvPpneDcmnt(Date pstdDt, int trnsId) {
        this.invPpneDcmntPK = new InvPpneDcmntPK(pstdDt, trnsId);
    }

    public InvPpneDcmntPK getInvPpneDcmntPK() {
        return invPpneDcmntPK;
    }

    public void setInvPpneDcmntPK(InvPpneDcmntPK invPpneDcmntPK) {
        this.invPpneDcmntPK = invPpneDcmntPK;
    }

    public String getOrglDcmntNbr() {
        return orglDcmntNbr;
    }

    public void setOrglDcmntNbr(String orglDcmntNbr) {
        this.orglDcmntNbr = orglDcmntNbr;
    }

    public String getNewDcmntNbr() {
        return newDcmntNbr;
    }

    public void setNewDcmntNbr(String newDcmntNbr) {
        this.newDcmntNbr = newDcmntNbr;
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
        hash += (invPpneDcmntPK != null ? invPpneDcmntPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof InvPpneDcmnt)) {
            return false;
        }
        InvPpneDcmnt other = (InvPpneDcmnt) object;
        if ((this.invPpneDcmntPK == null && other.invPpneDcmntPK != null) || (this.invPpneDcmntPK != null && !this.invPpneDcmntPK.equals(other.invPpneDcmntPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.InvPpneDcmnt[ invPpneDcmntPK=" + invPpneDcmntPK + " ]";
    }

}
