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
@Table(name = "CR_APPL_ADDR", catalog = "", schema = "DBO")
public class CrApplAddr implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CrApplAddrPK crApplAddrPK;
    @Basic(optional = false)
    @Column(name = "ATTN")
    private String attn;
    @Basic(optional = false)
    @Column(name = "PO_BOX")
    private String poBox;
    @Basic(optional = false)
    @Column(name = "STREET")
    private String street;
    @Basic(optional = false)
    @Column(name = "STREET2")
    private String street2;
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
    @Column(name = "CRTY")
    private String crty;
    @Basic(optional = false)
    @Column(name = "PH")
    private String ph;
    @Basic(optional = false)
    @Column(name = "FAX")
    private String fax;
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

    public CrApplAddr() {
    }

    public CrApplAddr(CrApplAddrPK crApplAddrPK) {
        this.crApplAddrPK = crApplAddrPK;
    }

    public CrApplAddr(CrApplAddrPK crApplAddrPK, String attn, String poBox, String street, String street2, String cty, String st, String zip, String crty, String ph, String fax, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.crApplAddrPK = crApplAddrPK;
        this.attn = attn;
        this.poBox = poBox;
        this.street = street;
        this.street2 = street2;
        this.cty = cty;
        this.st = st;
        this.zip = zip;
        this.crty = crty;
        this.ph = ph;
        this.fax = fax;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public CrApplAddr(String applNbr, String childTyp, String addrTyp) {
        this.crApplAddrPK = new CrApplAddrPK(applNbr, childTyp, addrTyp);
    }

    public CrApplAddrPK getCrApplAddrPK() {
        return crApplAddrPK;
    }

    public void setCrApplAddrPK(CrApplAddrPK crApplAddrPK) {
        this.crApplAddrPK = crApplAddrPK;
    }

    public String getAttn() {
        return attn;
    }

    public void setAttn(String attn) {
        this.attn = attn;
    }

    public String getPoBox() {
        return poBox;
    }

    public void setPoBox(String poBox) {
        this.poBox = poBox;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getStreet2() {
        return street2;
    }

    public void setStreet2(String street2) {
        this.street2 = street2;
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

    public String getCrty() {
        return crty;
    }

    public void setCrty(String crty) {
        this.crty = crty;
    }

    public String getPh() {
        return ph;
    }

    public void setPh(String ph) {
        this.ph = ph;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
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
        hash += (crApplAddrPK != null ? crApplAddrPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof CrApplAddr)) {
            return false;
        }
        CrApplAddr other = (CrApplAddr) object;
        if ((this.crApplAddrPK == null && other.crApplAddrPK != null) || (this.crApplAddrPK != null && !this.crApplAddrPK.equals(other.crApplAddrPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.CrApplAddr[ crApplAddrPK=" + crApplAddrPK + " ]";
    }

}
