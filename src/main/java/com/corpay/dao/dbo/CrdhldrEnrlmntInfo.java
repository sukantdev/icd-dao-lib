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
@Table(name = "CRDHLDR_ENRLMNT_INFO", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "CrdhldrEnrlmntInfo.findAll", query = "SELECT c FROM CrdhldrEnrlmntInfo c")})
public class CrdhldrEnrlmntInfo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "USR_ID")
    private String usrId;
    @Basic(optional = false)
    @Column(name = "MBL_NBR")
    private String mblNbr;
    @Basic(optional = false)
    @Column(name = "TAC_CD")
    private Character tacCd;
    @Basic(optional = false)
    @Column(name = "DCTV_CD")
    private Character dctvCd;
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

    public CrdhldrEnrlmntInfo() {
    }

    public CrdhldrEnrlmntInfo(String usrId) {
        this.usrId = usrId;
    }

    public CrdhldrEnrlmntInfo(String usrId, String mblNbr, Character tacCd, Character dctvCd, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.usrId = usrId;
        this.mblNbr = mblNbr;
        this.tacCd = tacCd;
        this.dctvCd = dctvCd;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public String getUsrId() {
        return usrId;
    }

    public void setUsrId(String usrId) {
        this.usrId = usrId;
    }

    public String getMblNbr() {
        return mblNbr;
    }

    public void setMblNbr(String mblNbr) {
        this.mblNbr = mblNbr;
    }

    public Character getTacCd() {
        return tacCd;
    }

    public void setTacCd(Character tacCd) {
        this.tacCd = tacCd;
    }

    public Character getDctvCd() {
        return dctvCd;
    }

    public void setDctvCd(Character dctvCd) {
        this.dctvCd = dctvCd;
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
        hash += (usrId != null ? usrId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CrdhldrEnrlmntInfo)) {
            return false;
        }
        CrdhldrEnrlmntInfo other = (CrdhldrEnrlmntInfo) object;
        if ((this.usrId == null && other.usrId != null) || (this.usrId != null && !this.usrId.equals(other.usrId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.CrdhldrEnrlmntInfo[ usrId=" + usrId + " ]";
    }
    
}
