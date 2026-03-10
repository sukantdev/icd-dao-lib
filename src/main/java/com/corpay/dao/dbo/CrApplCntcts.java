/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
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
@Table(name = "CR_APPL_CNTCTS", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "CrApplCntcts.findAll", query = "SELECT c FROM CrApplCntcts c")})
public class CrApplCntcts implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CrApplCntctsPK crApplCntctsPK;
    @Basic(optional = false)
    @Column(name = "FULL_NM")
    private String fullNm;
    @Basic(optional = false)
    @Column(name = "FST_NM")
    private String fstNm;
    @Basic(optional = false)
    @Column(name = "LST_NM")
    private String lstNm;
    @Basic(optional = false)
    @Column(name = "COMP_NM")
    private String compNm;
    @Basic(optional = false)
    @Column(name = "TITLE")
    private String title;
    @Basic(optional = false)
    @Column(name = "PH")
    private String ph;
    @Basic(optional = false)
    @Column(name = "EMAIL_ADDR")
    private String emailAddr;
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

    public CrApplCntcts() {
    }

    public CrApplCntcts(CrApplCntctsPK crApplCntctsPK) {
        this.crApplCntctsPK = crApplCntctsPK;
    }

    public CrApplCntcts(CrApplCntctsPK crApplCntctsPK, String fullNm, String fstNm, String lstNm, String compNm, String title, String ph, String emailAddr, String fax, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.crApplCntctsPK = crApplCntctsPK;
        this.fullNm = fullNm;
        this.fstNm = fstNm;
        this.lstNm = lstNm;
        this.compNm = compNm;
        this.title = title;
        this.ph = ph;
        this.emailAddr = emailAddr;
        this.fax = fax;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public CrApplCntcts(String applNbr, String childTyp, short seqNbr, String cntctTyp) {
        this.crApplCntctsPK = new CrApplCntctsPK(applNbr, childTyp, seqNbr, cntctTyp);
    }

    public CrApplCntctsPK getCrApplCntctsPK() {
        return crApplCntctsPK;
    }

    public void setCrApplCntctsPK(CrApplCntctsPK crApplCntctsPK) {
        this.crApplCntctsPK = crApplCntctsPK;
    }

    public String getFullNm() {
        return fullNm;
    }

    public void setFullNm(String fullNm) {
        this.fullNm = fullNm;
    }

    public String getFstNm() {
        return fstNm;
    }

    public void setFstNm(String fstNm) {
        this.fstNm = fstNm;
    }

    public String getLstNm() {
        return lstNm;
    }

    public void setLstNm(String lstNm) {
        this.lstNm = lstNm;
    }

    public String getCompNm() {
        return compNm;
    }

    public void setCompNm(String compNm) {
        this.compNm = compNm;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPh() {
        return ph;
    }

    public void setPh(String ph) {
        this.ph = ph;
    }

    public String getEmailAddr() {
        return emailAddr;
    }

    public void setEmailAddr(String emailAddr) {
        this.emailAddr = emailAddr;
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
        hash += (crApplCntctsPK != null ? crApplCntctsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CrApplCntcts)) {
            return false;
        }
        CrApplCntcts other = (CrApplCntcts) object;
        if ((this.crApplCntctsPK == null && other.crApplCntctsPK != null) || (this.crApplCntctsPK != null && !this.crApplCntctsPK.equals(other.crApplCntctsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.CrApplCntcts[ crApplCntctsPK=" + crApplCntctsPK + " ]";
    }
    
}
