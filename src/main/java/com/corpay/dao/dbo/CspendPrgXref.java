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
@Table(name = "CSPEND_PRG_XREF", catalog = "", schema = "DBO")
public class CspendPrgXref implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CspendPrgXrefPK cspendPrgXrefPK;
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

    public CspendPrgXref() {
    }

    public CspendPrgXref(CspendPrgXrefPK cspendPrgXrefPK) {
        this.cspendPrgXrefPK = cspendPrgXrefPK;
    }

    public CspendPrgXref(CspendPrgXrefPK cspendPrgXrefPK, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.cspendPrgXrefPK = cspendPrgXrefPK;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public CspendPrgXref(String xrefTableNm, Date xrefTs, short xrefSeqNbr, int xrefPstdDtYyyym) {
        this.cspendPrgXrefPK = new CspendPrgXrefPK(xrefTableNm, xrefTs, xrefSeqNbr, xrefPstdDtYyyym);
    }

    public CspendPrgXrefPK getCspendPrgXrefPK() {
        return cspendPrgXrefPK;
    }

    public void setCspendPrgXrefPK(CspendPrgXrefPK cspendPrgXrefPK) {
        this.cspendPrgXrefPK = cspendPrgXrefPK;
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
        hash += (cspendPrgXrefPK != null ? cspendPrgXrefPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof CspendPrgXref)) {
            return false;
        }
        CspendPrgXref other = (CspendPrgXref) object;
        if ((this.cspendPrgXrefPK == null && other.cspendPrgXrefPK != null) || (this.cspendPrgXrefPK != null && !this.cspendPrgXrefPK.equals(other.cspendPrgXrefPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.CspendPrgXref[ cspendPrgXrefPK=" + cspendPrgXrefPK + " ]";
    }

}
