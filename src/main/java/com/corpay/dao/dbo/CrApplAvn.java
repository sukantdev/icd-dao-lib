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
@Table(name = "CR_APPL_AVN", catalog = "", schema = "DBO")
public class CrApplAvn implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "APPL_NBR")
    private String applNbr;
    @Basic(optional = false)
    @Column(name = "PARENT_AFLAT_COMP")
    private String parentAflatComp;
    @Basic(optional = false)
    @Column(name = "NBR_ARCFT")
    private int nbrArcft;
    @Basic(optional = false)
    @Column(name = "NBR_PILOTS")
    private int nbrPilots;
    @Basic(optional = false)
    @Column(name = "MDY_USR")
    private String mdyUsr;
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

    public CrApplAvn() {
    }

    public CrApplAvn(String applNbr) {
        this.applNbr = applNbr;
    }

    public CrApplAvn(String applNbr, String parentAflatComp, int nbrArcft, int nbrPilots, String mdyUsr, Date crtTs, String crtUsr, Date mdyTs) {
        this.applNbr = applNbr;
        this.parentAflatComp = parentAflatComp;
        this.nbrArcft = nbrArcft;
        this.nbrPilots = nbrPilots;
        this.mdyUsr = mdyUsr;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
    }

    public String getApplNbr() {
        return applNbr;
    }

    public void setApplNbr(String applNbr) {
        this.applNbr = applNbr;
    }

    public String getParentAflatComp() {
        return parentAflatComp;
    }

    public void setParentAflatComp(String parentAflatComp) {
        this.parentAflatComp = parentAflatComp;
    }

    public int getNbrArcft() {
        return nbrArcft;
    }

    public void setNbrArcft(int nbrArcft) {
        this.nbrArcft = nbrArcft;
    }

    public int getNbrPilots() {
        return nbrPilots;
    }

    public void setNbrPilots(int nbrPilots) {
        this.nbrPilots = nbrPilots;
    }

    public String getMdyUsr() {
        return mdyUsr;
    }

    public void setMdyUsr(String mdyUsr) {
        this.mdyUsr = mdyUsr;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (applNbr != null ? applNbr.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof CrApplAvn)) {
            return false;
        }
        CrApplAvn other = (CrApplAvn) object;
        if ((this.applNbr == null && other.applNbr != null) || (this.applNbr != null && !this.applNbr.equals(other.applNbr))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.CrApplAvn[ applNbr=" + applNbr + " ]";
    }

}
