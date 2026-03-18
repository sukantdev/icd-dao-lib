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
@Table(name = "GEAC_PURGED_CREDIT_NOTES", catalog = "", schema = "DBO")
public class GeacPurgedCreditNotes implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected GeacPurgedCreditNotesPK geacPurgedCreditNotesPK;
    @Basic(optional = false)
    @Column(name = "GEAC_INFO_TXT")
    private String geacInfoTxt;
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

    public GeacPurgedCreditNotes() {
    }

    public GeacPurgedCreditNotes(GeacPurgedCreditNotesPK geacPurgedCreditNotesPK) {
        this.geacPurgedCreditNotesPK = geacPurgedCreditNotesPK;
    }

    public GeacPurgedCreditNotes(GeacPurgedCreditNotesPK geacPurgedCreditNotesPK, String geacInfoTxt, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.geacPurgedCreditNotesPK = geacPurgedCreditNotesPK;
        this.geacInfoTxt = geacInfoTxt;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public GeacPurgedCreditNotes(Date purgeDt, String geacAcctNbr, String geacCmpyCd, String geacPageNbr, String geacLineNbr, Date geacPageDt) {
        this.geacPurgedCreditNotesPK = new GeacPurgedCreditNotesPK(purgeDt, geacAcctNbr, geacCmpyCd, geacPageNbr, geacLineNbr, geacPageDt);
    }

    public GeacPurgedCreditNotesPK getGeacPurgedCreditNotesPK() {
        return geacPurgedCreditNotesPK;
    }

    public void setGeacPurgedCreditNotesPK(GeacPurgedCreditNotesPK geacPurgedCreditNotesPK) {
        this.geacPurgedCreditNotesPK = geacPurgedCreditNotesPK;
    }

    public String getGeacInfoTxt() {
        return geacInfoTxt;
    }

    public void setGeacInfoTxt(String geacInfoTxt) {
        this.geacInfoTxt = geacInfoTxt;
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
        hash += (geacPurgedCreditNotesPK != null ? geacPurgedCreditNotesPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof GeacPurgedCreditNotes)) {
            return false;
        }
        GeacPurgedCreditNotes other = (GeacPurgedCreditNotes) object;
        if ((this.geacPurgedCreditNotesPK == null && other.geacPurgedCreditNotesPK != null) || (this.geacPurgedCreditNotesPK != null && !this.geacPurgedCreditNotesPK.equals(other.geacPurgedCreditNotesPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.GeacPurgedCreditNotes[ geacPurgedCreditNotesPK=" + geacPurgedCreditNotesPK + " ]";
    }

}
