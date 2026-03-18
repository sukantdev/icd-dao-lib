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
@Table(name = "GEAC_PURGED_CUSTOMER_NOTES", catalog = "", schema = "DBO")
public class GeacPurgedCustomerNotes implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected GeacPurgedCustomerNotesPK geacPurgedCustomerNotesPK;
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

    public GeacPurgedCustomerNotes() {
    }

    public GeacPurgedCustomerNotes(GeacPurgedCustomerNotesPK geacPurgedCustomerNotesPK) {
        this.geacPurgedCustomerNotesPK = geacPurgedCustomerNotesPK;
    }

    public GeacPurgedCustomerNotes(GeacPurgedCustomerNotesPK geacPurgedCustomerNotesPK, String geacInfoTxt, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.geacPurgedCustomerNotesPK = geacPurgedCustomerNotesPK;
        this.geacInfoTxt = geacInfoTxt;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public GeacPurgedCustomerNotes(Date purgeDt, String geacAcctNbr, String geacCmpyCd, String geacPageNbr, String geacLineNbr, Date geacPageDt) {
        this.geacPurgedCustomerNotesPK = new GeacPurgedCustomerNotesPK(purgeDt, geacAcctNbr, geacCmpyCd, geacPageNbr, geacLineNbr, geacPageDt);
    }

    public GeacPurgedCustomerNotesPK getGeacPurgedCustomerNotesPK() {
        return geacPurgedCustomerNotesPK;
    }

    public void setGeacPurgedCustomerNotesPK(GeacPurgedCustomerNotesPK geacPurgedCustomerNotesPK) {
        this.geacPurgedCustomerNotesPK = geacPurgedCustomerNotesPK;
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
        hash += (geacPurgedCustomerNotesPK != null ? geacPurgedCustomerNotesPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof GeacPurgedCustomerNotes)) {
            return false;
        }
        GeacPurgedCustomerNotes other = (GeacPurgedCustomerNotes) object;
        if ((this.geacPurgedCustomerNotesPK == null && other.geacPurgedCustomerNotesPK != null) || (this.geacPurgedCustomerNotesPK != null && !this.geacPurgedCustomerNotesPK.equals(other.geacPurgedCustomerNotesPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.GeacPurgedCustomerNotes[ geacPurgedCustomerNotesPK=" + geacPurgedCustomerNotesPK + " ]";
    }

}
