/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
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
@Table(name = "USR_ADDR", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "UsrAddr.findAll", query = "SELECT u FROM UsrAddr u")})
public class UsrAddr implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "USR_ID")
    private String usrId;
    @Basic(optional = false)
    @Column(name = "USR_COMP_ID")
    private int usrCompId;
    @Basic(optional = false)
    @Column(name = "ADDR1")
    private String addr1;
    @Basic(optional = false)
    @Column(name = "ADDR2")
    private String addr2;
    @Basic(optional = false)
    @Column(name = "ADDR3")
    private String addr3;
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
    private int crtyCd;
    @Basic(optional = false)
    @Column(name = "PH")
    private String ph;
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
    @Basic(optional = false)
    @Column(name = "ADDR4")
    private String addr4;
    @Basic(optional = false)
    @Column(name = "FAX")
    private String fax;
    @Basic(optional = false)
    @Column(name = "TITLE")
    private String title;
    @Basic(optional = false)
    @Column(name = "BI_COMP_NM")
    private String biCompNm;
    @Basic(optional = false)
    @Column(name = "MOBILE")
    private String mobile;

    public UsrAddr() {
    }

    public UsrAddr(String usrId) {
        this.usrId = usrId;
    }

    public UsrAddr(String usrId, int usrCompId, String addr1, String addr2, String addr3, String cty, String st, String zip, int crtyCd, String ph, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr, String addr4, String fax, String title, String biCompNm, String mobile) {
        this.usrId = usrId;
        this.usrCompId = usrCompId;
        this.addr1 = addr1;
        this.addr2 = addr2;
        this.addr3 = addr3;
        this.cty = cty;
        this.st = st;
        this.zip = zip;
        this.crtyCd = crtyCd;
        this.ph = ph;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
        this.addr4 = addr4;
        this.fax = fax;
        this.title = title;
        this.biCompNm = biCompNm;
        this.mobile = mobile;
    }

    public String getUsrId() {
        return usrId;
    }

    public void setUsrId(String usrId) {
        this.usrId = usrId;
    }

    public int getUsrCompId() {
        return usrCompId;
    }

    public void setUsrCompId(int usrCompId) {
        this.usrCompId = usrCompId;
    }

    public String getAddr1() {
        return addr1;
    }

    public void setAddr1(String addr1) {
        this.addr1 = addr1;
    }

    public String getAddr2() {
        return addr2;
    }

    public void setAddr2(String addr2) {
        this.addr2 = addr2;
    }

    public String getAddr3() {
        return addr3;
    }

    public void setAddr3(String addr3) {
        this.addr3 = addr3;
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

    public int getCrtyCd() {
        return crtyCd;
    }

    public void setCrtyCd(int crtyCd) {
        this.crtyCd = crtyCd;
    }

    public String getPh() {
        return ph;
    }

    public void setPh(String ph) {
        this.ph = ph;
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

    public String getAddr4() {
        return addr4;
    }

    public void setAddr4(String addr4) {
        this.addr4 = addr4;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBiCompNm() {
        return biCompNm;
    }

    public void setBiCompNm(String biCompNm) {
        this.biCompNm = biCompNm;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (usrId != null ? usrId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UsrAddr)) {
            return false;
        }
        UsrAddr other = (UsrAddr) object;
        if ((this.usrId == null && other.usrId != null) || (this.usrId != null && !this.usrId.equals(other.usrId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.UsrAddr[ usrId=" + usrId + " ]";
    }
    
}
