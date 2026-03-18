package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "CIP_COUNTRY_CD_LST", catalog = "", schema = "DBO")
public class CipCountryCdLst implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "COUNTRY_CD")
    private String countryCd;
    @Basic(optional = false)
    @Column(name = "COUNTRY_NM")
    private String countryNm;
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "countryCd", fetch = FetchType.LAZY)
    private Set<CipNtnlIdTyp> cipNtnlIdTypSet;

    public CipCountryCdLst() {
    }

    public CipCountryCdLst(String countryCd) {
        this.countryCd = countryCd;
    }

    public CipCountryCdLst(String countryCd, String countryNm, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.countryCd = countryCd;
        this.countryNm = countryNm;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public String getCountryCd() {
        return countryCd;
    }

    public void setCountryCd(String countryCd) {
        this.countryCd = countryCd;
    }

    public String getCountryNm() {
        return countryNm;
    }

    public void setCountryNm(String countryNm) {
        this.countryNm = countryNm;
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

    public Set<CipNtnlIdTyp> getCipNtnlIdTypSet() {
        return cipNtnlIdTypSet;
    }

    public void setCipNtnlIdTypSet(Set<CipNtnlIdTyp> cipNtnlIdTypSet) {
        this.cipNtnlIdTypSet = cipNtnlIdTypSet;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (countryCd != null ? countryCd.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof CipCountryCdLst)) {
            return false;
        }
        CipCountryCdLst other = (CipCountryCdLst) object;
        if ((this.countryCd == null && other.countryCd != null) || (this.countryCd != null && !this.countryCd.equals(other.countryCd))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.CipCountryCdLst[ countryCd=" + countryCd + " ]";
    }

}
