/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.corpay.dao.cxxcow;

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
@Table(name = "CONTACTS", catalog = "", schema = "CXXCOW")
@NamedQueries({
    @NamedQuery(name = "Contacts.findAll", query = "SELECT c FROM Contacts c"),
    @NamedQuery(name = "Contacts.findByCcUniqueId", query = "SELECT c FROM Contacts c WHERE c.ccUniqueId = :ccUniqueId"),
    @NamedQuery(name = "Contacts.findByDeptCode", query = "SELECT c FROM Contacts c WHERE c.deptCode = :deptCode"),
    @NamedQuery(name = "Contacts.findByCcName", query = "SELECT c FROM Contacts c WHERE c.ccName = :ccName"),
    @NamedQuery(name = "Contacts.findByCcPhoneNbr", query = "SELECT c FROM Contacts c WHERE c.ccPhoneNbr = :ccPhoneNbr"),
    @NamedQuery(name = "Contacts.findByCcCompanyName", query = "SELECT c FROM Contacts c WHERE c.ccCompanyName = :ccCompanyName"),
    @NamedQuery(name = "Contacts.findByCcNarrative", query = "SELECT c FROM Contacts c WHERE c.ccNarrative = :ccNarrative"),
    @NamedQuery(name = "Contacts.findByCcUptDate", query = "SELECT c FROM Contacts c WHERE c.ccUptDate = :ccUptDate"),
    @NamedQuery(name = "Contacts.findByCcStatusCode", query = "SELECT c FROM Contacts c WHERE c.ccStatusCode = :ccStatusCode"),
    @NamedQuery(name = "Contacts.findByCcEmail", query = "SELECT c FROM Contacts c WHERE c.ccEmail = :ccEmail"),
    @NamedQuery(name = "Contacts.findByCcPhnExt", query = "SELECT c FROM Contacts c WHERE c.ccPhnExt = :ccPhnExt"),
    @NamedQuery(name = "Contacts.findByCcNbrTrucks", query = "SELECT c FROM Contacts c WHERE c.ccNbrTrucks = :ccNbrTrucks"),
    @NamedQuery(name = "Contacts.findByCcPlatform", query = "SELECT c FROM Contacts c WHERE c.ccPlatform = :ccPlatform"),
    @NamedQuery(name = "Contacts.findByCcSubject", query = "SELECT c FROM Contacts c WHERE c.ccSubject = :ccSubject")})
public class Contacts implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CC_UNIQUE_ID")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ccUniqueId;
    @Basic(optional = false)
    @Column(name = "DEPT_CODE")
    private String deptCode;
    @Basic(optional = false)
    @Column(name = "CC_NAME")
    private String ccName;
    @Column(name = "CC_PHONE_NBR")
    private String ccPhoneNbr;
    @Column(name = "CC_COMPANY_NAME")
    private String ccCompanyName;
    @Basic(optional = false)
    @Column(name = "CC_NARRATIVE")
    private String ccNarrative;
    @Basic(optional = false)
    @Column(name = "CC_UPT_DATE")
    @Temporal(TemporalType.DATE)
    private Date ccUptDate;
    @Basic(optional = false)
    @Column(name = "CC_STATUS_CODE")
    private Character ccStatusCode;
    @Basic(optional = false)
    @Column(name = "CC_EMAIL")
    private String ccEmail;
    @Column(name = "CC_PHN_EXT")
    private String ccPhnExt;
    @Column(name = "CC_NBR_TRUCKS")
    private String ccNbrTrucks;
    @Column(name = "CC_PLATFORM")
    private String ccPlatform;
    @Column(name = "CC_SUBJECT")
    private String ccSubject;

    public Contacts() {
    }

    public Contacts(Date ccUniqueId) {
        this.ccUniqueId = ccUniqueId;
    }

    public Contacts(Date ccUniqueId, String deptCode, String ccName, String ccNarrative, Date ccUptDate, Character ccStatusCode, String ccEmail) {
        this.ccUniqueId = ccUniqueId;
        this.deptCode = deptCode;
        this.ccName = ccName;
        this.ccNarrative = ccNarrative;
        this.ccUptDate = ccUptDate;
        this.ccStatusCode = ccStatusCode;
        this.ccEmail = ccEmail;
    }

    public Date getCcUniqueId() {
        return ccUniqueId;
    }

    public void setCcUniqueId(Date ccUniqueId) {
        this.ccUniqueId = ccUniqueId;
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public String getCcName() {
        return ccName;
    }

    public void setCcName(String ccName) {
        this.ccName = ccName;
    }

    public String getCcPhoneNbr() {
        return ccPhoneNbr;
    }

    public void setCcPhoneNbr(String ccPhoneNbr) {
        this.ccPhoneNbr = ccPhoneNbr;
    }

    public String getCcCompanyName() {
        return ccCompanyName;
    }

    public void setCcCompanyName(String ccCompanyName) {
        this.ccCompanyName = ccCompanyName;
    }

    public String getCcNarrative() {
        return ccNarrative;
    }

    public void setCcNarrative(String ccNarrative) {
        this.ccNarrative = ccNarrative;
    }

    public Date getCcUptDate() {
        return ccUptDate;
    }

    public void setCcUptDate(Date ccUptDate) {
        this.ccUptDate = ccUptDate;
    }

    public Character getCcStatusCode() {
        return ccStatusCode;
    }

    public void setCcStatusCode(Character ccStatusCode) {
        this.ccStatusCode = ccStatusCode;
    }

    public String getCcEmail() {
        return ccEmail;
    }

    public void setCcEmail(String ccEmail) {
        this.ccEmail = ccEmail;
    }

    public String getCcPhnExt() {
        return ccPhnExt;
    }

    public void setCcPhnExt(String ccPhnExt) {
        this.ccPhnExt = ccPhnExt;
    }

    public String getCcNbrTrucks() {
        return ccNbrTrucks;
    }

    public void setCcNbrTrucks(String ccNbrTrucks) {
        this.ccNbrTrucks = ccNbrTrucks;
    }

    public String getCcPlatform() {
        return ccPlatform;
    }

    public void setCcPlatform(String ccPlatform) {
        this.ccPlatform = ccPlatform;
    }

    public String getCcSubject() {
        return ccSubject;
    }

    public void setCcSubject(String ccSubject) {
        this.ccSubject = ccSubject;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ccUniqueId != null ? ccUniqueId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Contacts)) {
            return false;
        }
        Contacts other = (Contacts) object;
        if ((this.ccUniqueId == null && other.ccUniqueId != null) || (this.ccUniqueId != null && !this.ccUniqueId.equals(other.ccUniqueId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.cxxcow.Contacts[ ccUniqueId=" + ccUniqueId + " ]";
    }
    
}
