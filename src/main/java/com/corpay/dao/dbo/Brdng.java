/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
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
@Table(name = "BRDNG", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "Brdng.findAll", query = "SELECT b FROM Brdng b")})
public class Brdng implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "BRDNG_CD")
    private String brdngCd;
    @Basic(optional = false)
    @Column(name = "BRDNG_DESC")
    private String brdngDesc;
    @Basic(optional = false)
    @Column(name = "BRDNG_DATA_ROWID")
    private Serializable brdngDataRowid;
    @Basic(optional = false)
    @Lob
    @Column(name = "BRDNG_RPT_HDR_IMG")
    private Serializable brdngRptHdrImg;
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
    @Column(name = "FORMAL_COMP_NM")
    private String formalCompNm;
    @Basic(optional = false)
    @Column(name = "PHN_NBR")
    private String phnNbr;

    public Brdng() {
    }

    public Brdng(String brdngCd) {
        this.brdngCd = brdngCd;
    }

    public Brdng(String brdngCd, String brdngDesc, Serializable brdngDataRowid, Serializable brdngRptHdrImg, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr, String formalCompNm, String phnNbr) {
        this.brdngCd = brdngCd;
        this.brdngDesc = brdngDesc;
        this.brdngDataRowid = brdngDataRowid;
        this.brdngRptHdrImg = brdngRptHdrImg;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
        this.formalCompNm = formalCompNm;
        this.phnNbr = phnNbr;
    }

    public String getBrdngCd() {
        return brdngCd;
    }

    public void setBrdngCd(String brdngCd) {
        this.brdngCd = brdngCd;
    }

    public String getBrdngDesc() {
        return brdngDesc;
    }

    public void setBrdngDesc(String brdngDesc) {
        this.brdngDesc = brdngDesc;
    }

    public Serializable getBrdngDataRowid() {
        return brdngDataRowid;
    }

    public void setBrdngDataRowid(Serializable brdngDataRowid) {
        this.brdngDataRowid = brdngDataRowid;
    }

    public Serializable getBrdngRptHdrImg() {
        return brdngRptHdrImg;
    }

    public void setBrdngRptHdrImg(Serializable brdngRptHdrImg) {
        this.brdngRptHdrImg = brdngRptHdrImg;
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

    public String getFormalCompNm() {
        return formalCompNm;
    }

    public void setFormalCompNm(String formalCompNm) {
        this.formalCompNm = formalCompNm;
    }

    public String getPhnNbr() {
        return phnNbr;
    }

    public void setPhnNbr(String phnNbr) {
        this.phnNbr = phnNbr;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (brdngCd != null ? brdngCd.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Brdng)) {
            return false;
        }
        Brdng other = (Brdng) object;
        if ((this.brdngCd == null && other.brdngCd != null) || (this.brdngCd != null && !this.brdngCd.equals(other.brdngCd))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.Brdng[ brdngCd=" + brdngCd + " ]";
    }
    
}
