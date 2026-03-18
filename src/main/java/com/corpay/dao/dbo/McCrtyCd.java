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
@Table(name = "MC_CRTY_CD", catalog = "", schema = "DBO")
public class McCrtyCd implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CRTY_CD")
    private Integer crtyCd;
    @Basic(optional = false)
    @Column(name = "CRTY_NM")
    private String crtyNm;
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

    public McCrtyCd() {
    }

    public McCrtyCd(Integer crtyCd) {
        this.crtyCd = crtyCd;
    }

    public McCrtyCd(Integer crtyCd, String crtyNm, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.crtyCd = crtyCd;
        this.crtyNm = crtyNm;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public Integer getCrtyCd() {
        return crtyCd;
    }

    public void setCrtyCd(Integer crtyCd) {
        this.crtyCd = crtyCd;
    }

    public String getCrtyNm() {
        return crtyNm;
    }

    public void setCrtyNm(String crtyNm) {
        this.crtyNm = crtyNm;
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
        hash += (crtyCd != null ? crtyCd.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof McCrtyCd)) {
            return false;
        }
        McCrtyCd other = (McCrtyCd) object;
        if ((this.crtyCd == null && other.crtyCd != null) || (this.crtyCd != null && !this.crtyCd.equals(other.crtyCd))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.McCrtyCd[ crtyCd=" + crtyCd + " ]";
    }

}
