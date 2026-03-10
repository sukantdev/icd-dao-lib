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
@Table(name = "USR_PRSNL_INFO", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "UsrPrsnlInfo.findAll", query = "SELECT u FROM UsrPrsnlInfo u")})
public class UsrPrsnlInfo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "USR_ID")
    private String usrId;
    @Basic(optional = false)
    @Column(name = "CTY_NM")
    private String ctyNm;
    @Basic(optional = false)
    @Column(name = "ST_NM")
    private String stNm;
    @Basic(optional = false)
    @Column(name = "OFFC_PH_NBR")
    private long offcPhNbr;
    @Basic(optional = false)
    @Column(name = "HM_PH_NBR")
    private long hmPhNbr;
    @Basic(optional = false)
    @Column(name = "CAR_PH_NBR")
    private long carPhNbr;
    @Basic(optional = false)
    @Column(name = "BPR_PH_NBR")
    private long bprPhNbr;
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

    public UsrPrsnlInfo() {
    }

    public UsrPrsnlInfo(String usrId) {
        this.usrId = usrId;
    }

    public UsrPrsnlInfo(String usrId, String ctyNm, String stNm, long offcPhNbr, long hmPhNbr, long carPhNbr, long bprPhNbr, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.usrId = usrId;
        this.ctyNm = ctyNm;
        this.stNm = stNm;
        this.offcPhNbr = offcPhNbr;
        this.hmPhNbr = hmPhNbr;
        this.carPhNbr = carPhNbr;
        this.bprPhNbr = bprPhNbr;
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

    public String getCtyNm() {
        return ctyNm;
    }

    public void setCtyNm(String ctyNm) {
        this.ctyNm = ctyNm;
    }

    public String getStNm() {
        return stNm;
    }

    public void setStNm(String stNm) {
        this.stNm = stNm;
    }

    public long getOffcPhNbr() {
        return offcPhNbr;
    }

    public void setOffcPhNbr(long offcPhNbr) {
        this.offcPhNbr = offcPhNbr;
    }

    public long getHmPhNbr() {
        return hmPhNbr;
    }

    public void setHmPhNbr(long hmPhNbr) {
        this.hmPhNbr = hmPhNbr;
    }

    public long getCarPhNbr() {
        return carPhNbr;
    }

    public void setCarPhNbr(long carPhNbr) {
        this.carPhNbr = carPhNbr;
    }

    public long getBprPhNbr() {
        return bprPhNbr;
    }

    public void setBprPhNbr(long bprPhNbr) {
        this.bprPhNbr = bprPhNbr;
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
        if (!(object instanceof UsrPrsnlInfo)) {
            return false;
        }
        UsrPrsnlInfo other = (UsrPrsnlInfo) object;
        if ((this.usrId == null && other.usrId != null) || (this.usrId != null && !this.usrId.equals(other.usrId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.UsrPrsnlInfo[ usrId=" + usrId + " ]";
    }
    
}
