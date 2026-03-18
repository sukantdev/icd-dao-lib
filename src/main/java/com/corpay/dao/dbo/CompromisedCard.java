package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "COMPROMISED_CARD", catalog = "", schema = "DBO")
public class CompromisedCard implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "NEW_CRD_NBR")
    private Long newCrdNbr;
    @Basic(optional = false)
    @Column(name = "OLD_CRD_NBR")
    private long oldCrdNbr;
    @Basic(optional = false)
    @Column(name = "NEW_CRD_ACTV_DT")
    @Temporal(TemporalType.DATE)
    private Date newCrdActvDt;
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

    public CompromisedCard() {
    }

    public CompromisedCard(Long newCrdNbr) {
        this.newCrdNbr = newCrdNbr;
    }

    public CompromisedCard(Long newCrdNbr, long oldCrdNbr, Date newCrdActvDt, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.newCrdNbr = newCrdNbr;
        this.oldCrdNbr = oldCrdNbr;
        this.newCrdActvDt = newCrdActvDt;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public Long getNewCrdNbr() {
        return newCrdNbr;
    }

    public void setNewCrdNbr(Long newCrdNbr) {
        this.newCrdNbr = newCrdNbr;
    }

    public long getOldCrdNbr() {
        return oldCrdNbr;
    }

    public void setOldCrdNbr(long oldCrdNbr) {
        this.oldCrdNbr = oldCrdNbr;
    }

    public Date getNewCrdActvDt() {
        return newCrdActvDt;
    }

    public void setNewCrdActvDt(Date newCrdActvDt) {
        this.newCrdActvDt = newCrdActvDt;
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
        hash += (newCrdNbr != null ? newCrdNbr.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof CompromisedCard)) {
            return false;
        }
        CompromisedCard other = (CompromisedCard) object;
        if ((this.newCrdNbr == null && other.newCrdNbr != null) || (this.newCrdNbr != null && !this.newCrdNbr.equals(other.newCrdNbr))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.CompromisedCard[ newCrdNbr=" + newCrdNbr + " ]";
    }

}
