/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Sukant.Tiwari
 */
@Entity
@Table(name = "CIP_NTNL_ID_TYP", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "CipNtnlIdTyp.findAll", query = "SELECT c FROM CipNtnlIdTyp c")})
public class CipNtnlIdTyp implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "NTNL_ID_CD")
    private String ntnlIdCd;
    @Basic(optional = false)
    @Column(name = "NTNL_ID_DESC")
    private String ntnlIdDesc;
    @Basic(optional = false)
    @Column(name = "FIELD_TYP")
    private String fieldTyp;
    @Basic(optional = false)
    @Column(name = "MAX_LEN")
    private int maxLen;
    @Basic(optional = false)
    @Column(name = "EXAMPLE_TXT")
    private String exampleTxt;
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
    @JoinColumn(name = "COUNTRY_CD", referencedColumnName = "COUNTRY_CD")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private CipCountryCdLst countryCd;

    public CipNtnlIdTyp() {
    }

    public CipNtnlIdTyp(String ntnlIdCd) {
        this.ntnlIdCd = ntnlIdCd;
    }

    public CipNtnlIdTyp(String ntnlIdCd, String ntnlIdDesc, String fieldTyp, int maxLen, String exampleTxt, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.ntnlIdCd = ntnlIdCd;
        this.ntnlIdDesc = ntnlIdDesc;
        this.fieldTyp = fieldTyp;
        this.maxLen = maxLen;
        this.exampleTxt = exampleTxt;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public String getNtnlIdCd() {
        return ntnlIdCd;
    }

    public void setNtnlIdCd(String ntnlIdCd) {
        this.ntnlIdCd = ntnlIdCd;
    }

    public String getNtnlIdDesc() {
        return ntnlIdDesc;
    }

    public void setNtnlIdDesc(String ntnlIdDesc) {
        this.ntnlIdDesc = ntnlIdDesc;
    }

    public String getFieldTyp() {
        return fieldTyp;
    }

    public void setFieldTyp(String fieldTyp) {
        this.fieldTyp = fieldTyp;
    }

    public int getMaxLen() {
        return maxLen;
    }

    public void setMaxLen(int maxLen) {
        this.maxLen = maxLen;
    }

    public String getExampleTxt() {
        return exampleTxt;
    }

    public void setExampleTxt(String exampleTxt) {
        this.exampleTxt = exampleTxt;
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

    public CipCountryCdLst getCountryCd() {
        return countryCd;
    }

    public void setCountryCd(CipCountryCdLst countryCd) {
        this.countryCd = countryCd;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ntnlIdCd != null ? ntnlIdCd.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CipNtnlIdTyp)) {
            return false;
        }
        CipNtnlIdTyp other = (CipNtnlIdTyp) object;
        if ((this.ntnlIdCd == null && other.ntnlIdCd != null) || (this.ntnlIdCd != null && !this.ntnlIdCd.equals(other.ntnlIdCd))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.CipNtnlIdTyp[ ntnlIdCd=" + ntnlIdCd + " ]";
    }
    
}
