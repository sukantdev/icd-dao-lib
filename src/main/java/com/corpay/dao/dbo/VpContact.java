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
@Table(name = "VP_CONTACT", catalog = "", schema = "DBO")
public class VpContact implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CONTACT_MAST_ID")
    private String contactMastId;
    @Basic(optional = false)
    @Column(name = "CUST_VEND")
    private String custVend;
    @Basic(optional = false)
    @Column(name = "MAST_ID")
    private String mastId;
    @Basic(optional = false)
    @Column(name = "EMAIL_ADDR")
    private String emailAddr;
    @Basic(optional = false)
    @Column(name = "STAT_CD")
    private Character statCd;
    @Basic(optional = false)
    @Column(name = "TTL")
    private String ttl;
    @Basic(optional = false)
    @Column(name = "PREFIX")
    private String prefix;
    @Basic(optional = false)
    @Column(name = "FNAME")
    private String fname;
    @Basic(optional = false)
    @Column(name = "LNAME")
    private String lname;
    @Basic(optional = false)
    @Column(name = "SUFFIX")
    private String suffix;
    @Basic(optional = false)
    @Column(name = "PHONE_NBR")
    private String phoneNbr;
    @Basic(optional = false)
    @Column(name = "MDY_USR")
    private String mdyUsr;
    @Basic(optional = false)
    @Column(name = "MDY_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date mdyTs;
    @Basic(optional = false)
    @Column(name = "CRT_USR")
    private String crtUsr;
    @Basic(optional = false)
    @Column(name = "CRT_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date crtTs;

    public VpContact() {
    }

    public VpContact(String contactMastId) {
        this.contactMastId = contactMastId;
    }

    public VpContact(String contactMastId, String custVend, String mastId, String emailAddr, Character statCd, String ttl, String prefix, String fname, String lname, String suffix, String phoneNbr, String mdyUsr, Date mdyTs, String crtUsr, Date crtTs) {
        this.contactMastId = contactMastId;
        this.custVend = custVend;
        this.mastId = mastId;
        this.emailAddr = emailAddr;
        this.statCd = statCd;
        this.ttl = ttl;
        this.prefix = prefix;
        this.fname = fname;
        this.lname = lname;
        this.suffix = suffix;
        this.phoneNbr = phoneNbr;
        this.mdyUsr = mdyUsr;
        this.mdyTs = mdyTs;
        this.crtUsr = crtUsr;
        this.crtTs = crtTs;
    }

    public String getContactMastId() {
        return contactMastId;
    }

    public void setContactMastId(String contactMastId) {
        this.contactMastId = contactMastId;
    }

    public String getCustVend() {
        return custVend;
    }

    public void setCustVend(String custVend) {
        this.custVend = custVend;
    }

    public String getMastId() {
        return mastId;
    }

    public void setMastId(String mastId) {
        this.mastId = mastId;
    }

    public String getEmailAddr() {
        return emailAddr;
    }

    public void setEmailAddr(String emailAddr) {
        this.emailAddr = emailAddr;
    }

    public Character getStatCd() {
        return statCd;
    }

    public void setStatCd(Character statCd) {
        this.statCd = statCd;
    }

    public String getTtl() {
        return ttl;
    }

    public void setTtl(String ttl) {
        this.ttl = ttl;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public String getPhoneNbr() {
        return phoneNbr;
    }

    public void setPhoneNbr(String phoneNbr) {
        this.phoneNbr = phoneNbr;
    }

    public String getMdyUsr() {
        return mdyUsr;
    }

    public void setMdyUsr(String mdyUsr) {
        this.mdyUsr = mdyUsr;
    }

    public Date getMdyTs() {
        return mdyTs;
    }

    public void setMdyTs(Date mdyTs) {
        this.mdyTs = mdyTs;
    }

    public String getCrtUsr() {
        return crtUsr;
    }

    public void setCrtUsr(String crtUsr) {
        this.crtUsr = crtUsr;
    }

    public Date getCrtTs() {
        return crtTs;
    }

    public void setCrtTs(Date crtTs) {
        this.crtTs = crtTs;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (contactMastId != null ? contactMastId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof VpContact)) {
            return false;
        }
        VpContact other = (VpContact) object;
        if ((this.contactMastId == null && other.contactMastId != null) || (this.contactMastId != null && !this.contactMastId.equals(other.contactMastId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.VpContact[ contactMastId=" + contactMastId + " ]";
    }

}
