package com.corpay.dao.cxxcow;

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
@Table(name = "DPT_TYP", catalog = "", schema = "CXXCOW")
public class DptTyp implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "DPT_TYP")
    private String dptTyp;
    @Basic(optional = false)
    @Column(name = "TYP_DESC")
    private String typDesc;
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

    public DptTyp() {
    }

    public DptTyp(String dptTyp) {
        this.dptTyp = dptTyp;
    }

    public DptTyp(String dptTyp, String typDesc, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.dptTyp = dptTyp;
        this.typDesc = typDesc;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public String getDptTyp() {
        return dptTyp;
    }

    public void setDptTyp(String dptTyp) {
        this.dptTyp = dptTyp;
    }

    public String getTypDesc() {
        return typDesc;
    }

    public void setTypDesc(String typDesc) {
        this.typDesc = typDesc;
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
        hash += (dptTyp != null ? dptTyp.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof DptTyp)) {
            return false;
        }
        DptTyp other = (DptTyp) object;
        if ((this.dptTyp == null && other.dptTyp != null) || (this.dptTyp != null && !this.dptTyp.equals(other.dptTyp))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.cxxcow.DptTyp[ dptTyp=" + dptTyp + " ]";
    }

}
