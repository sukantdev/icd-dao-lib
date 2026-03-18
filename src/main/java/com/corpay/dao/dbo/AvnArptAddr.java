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
@Table(name = "AVN_ARPT_ADDR", catalog = "", schema = "DBO")
public class AvnArptAddr implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ARPT_CD")
    private String arptCd;
    @Basic(optional = false)
    @Column(name = "ARPT_NM")
    private String arptNm;
    @Basic(optional = false)
    @Column(name = "CTY")
    private String cty;
    @Basic(optional = false)
    @Column(name = "ST")
    private String st;
    @Basic(optional = false)
    @Column(name = "ZIP")
    private String zip;
    @Basic(optional = false)
    @Column(name = "CRTY_CD")
    private String crtyCd;
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

    public AvnArptAddr() {
    }

    public AvnArptAddr(String arptCd) {
        this.arptCd = arptCd;
    }

    public AvnArptAddr(String arptCd, String arptNm, String cty, String st, String zip, String crtyCd, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.arptCd = arptCd;
        this.arptNm = arptNm;
        this.cty = cty;
        this.st = st;
        this.zip = zip;
        this.crtyCd = crtyCd;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public String getArptCd() {
        return arptCd;
    }

    public void setArptCd(String arptCd) {
        this.arptCd = arptCd;
    }

    public String getArptNm() {
        return arptNm;
    }

    public void setArptNm(String arptNm) {
        this.arptNm = arptNm;
    }

    public String getCty() {
        return cty;
    }

    public void setCty(String cty) {
        this.cty = cty;
    }

    public String getSt() {
        return st;
    }

    public void setSt(String st) {
        this.st = st;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getCrtyCd() {
        return crtyCd;
    }

    public void setCrtyCd(String crtyCd) {
        this.crtyCd = crtyCd;
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
        hash += (arptCd != null ? arptCd.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof AvnArptAddr)) {
            return false;
        }
        AvnArptAddr other = (AvnArptAddr) object;
        if ((this.arptCd == null && other.arptCd != null) || (this.arptCd != null && !this.arptCd.equals(other.arptCd))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.AvnArptAddr[ arptCd=" + arptCd + " ]";
    }

}
