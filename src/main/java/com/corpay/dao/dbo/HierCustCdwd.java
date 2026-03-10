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
@Table(name = "HIER_CUST_CDWD", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "HierCustCdwd.findAll", query = "SELECT h FROM HierCustCdwd h")})
public class HierCustCdwd implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected HierCustCdwdPK hierCustCdwdPK;
    @Basic(optional = false)
    @Column(name = "CITY_NM")
    private String cityNm;
    @Basic(optional = false)
    @Column(name = "STATE_NM")
    private String stateNm;
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
    @Column(name = "EMAIL_ADDR")
    private String emailAddr;
    @Basic(optional = false)
    @Column(name = "FST_NM")
    private String fstNm;
    @Basic(optional = false)
    @Column(name = "LST_NM")
    private String lstNm;
    @Basic(optional = false)
    @Column(name = "M_I")
    private Character mI;
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
    @Column(name = "TMP_CDWD_EXP_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date tmpCdwdExpTs;

    public HierCustCdwd() {
    }

    public HierCustCdwd(HierCustCdwdPK hierCustCdwdPK) {
        this.hierCustCdwdPK = hierCustCdwdPK;
    }

    public HierCustCdwd(HierCustCdwdPK hierCustCdwdPK, String cityNm, String stateNm, long offcPhNbr, long hmPhNbr, long carPhNbr, long bprPhNbr, String emailAddr, String fstNm, String lstNm, Character mI, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr, Date tmpCdwdExpTs) {
        this.hierCustCdwdPK = hierCustCdwdPK;
        this.cityNm = cityNm;
        this.stateNm = stateNm;
        this.offcPhNbr = offcPhNbr;
        this.hmPhNbr = hmPhNbr;
        this.carPhNbr = carPhNbr;
        this.bprPhNbr = bprPhNbr;
        this.emailAddr = emailAddr;
        this.fstNm = fstNm;
        this.lstNm = lstNm;
        this.mI = mI;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
        this.tmpCdwdExpTs = tmpCdwdExpTs;
    }

    public HierCustCdwd(String custId, String cdWord) {
        this.hierCustCdwdPK = new HierCustCdwdPK(custId, cdWord);
    }

    public HierCustCdwdPK getHierCustCdwdPK() {
        return hierCustCdwdPK;
    }

    public void setHierCustCdwdPK(HierCustCdwdPK hierCustCdwdPK) {
        this.hierCustCdwdPK = hierCustCdwdPK;
    }

    public String getCityNm() {
        return cityNm;
    }

    public void setCityNm(String cityNm) {
        this.cityNm = cityNm;
    }

    public String getStateNm() {
        return stateNm;
    }

    public void setStateNm(String stateNm) {
        this.stateNm = stateNm;
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

    public String getEmailAddr() {
        return emailAddr;
    }

    public void setEmailAddr(String emailAddr) {
        this.emailAddr = emailAddr;
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

    public Character getMI() {
        return mI;
    }

    public void setMI(Character mI) {
        this.mI = mI;
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

    public Date getTmpCdwdExpTs() {
        return tmpCdwdExpTs;
    }

    public void setTmpCdwdExpTs(Date tmpCdwdExpTs) {
        this.tmpCdwdExpTs = tmpCdwdExpTs;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (hierCustCdwdPK != null ? hierCustCdwdPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof HierCustCdwd)) {
            return false;
        }
        HierCustCdwd other = (HierCustCdwd) object;
        if ((this.hierCustCdwdPK == null && other.hierCustCdwdPK != null) || (this.hierCustCdwdPK != null && !this.hierCustCdwdPK.equals(other.hierCustCdwdPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.HierCustCdwd[ hierCustCdwdPK=" + hierCustCdwdPK + " ]";
    }
    
}
