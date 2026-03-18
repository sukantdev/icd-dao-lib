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
@Table(name = "WD_NOTE", catalog = "", schema = "DBO")
public class WdNote implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected WdNotePK wdNotePK;
    @Basic(optional = false)
    @Column(name = "WD_NOTE_TXT")
    private String wdNoteTxt;
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

    public WdNote() {
    }

    public WdNote(WdNotePK wdNotePK) {
        this.wdNotePK = wdNotePK;
    }

    public WdNote(WdNotePK wdNotePK, String wdNoteTxt, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.wdNotePK = wdNotePK;
        this.wdNoteTxt = wdNoteTxt;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public WdNote(int btPmtNbr, Date btTrnsDt, String wdTypCd, int wdSeqNbr) {
        this.wdNotePK = new WdNotePK(btPmtNbr, btTrnsDt, wdTypCd, wdSeqNbr);
    }

    public WdNotePK getWdNotePK() {
        return wdNotePK;
    }

    public void setWdNotePK(WdNotePK wdNotePK) {
        this.wdNotePK = wdNotePK;
    }

    public String getWdNoteTxt() {
        return wdNoteTxt;
    }

    public void setWdNoteTxt(String wdNoteTxt) {
        this.wdNoteTxt = wdNoteTxt;
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
        hash += (wdNotePK != null ? wdNotePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof WdNote)) {
            return false;
        }
        WdNote other = (WdNote) object;
        if ((this.wdNotePK == null && other.wdNotePK != null) || (this.wdNotePK != null && !this.wdNotePK.equals(other.wdNotePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.WdNote[ wdNotePK=" + wdNotePK + " ]";
    }

}
