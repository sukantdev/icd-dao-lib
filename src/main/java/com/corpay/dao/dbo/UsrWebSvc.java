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
@Table(name = "USR_WEB_SVC", catalog = "", schema = "DBO")
public class UsrWebSvc implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected UsrWebSvcPK usrWebSvcPK;
    @Basic(optional = false)
    @Column(name = "CNTR")
    private int cntr;
    @Basic(optional = false)
    @Column(name = "LMT")
    private int lmt;
    @Basic(optional = false)
    @Column(name = "RESET_DT")
    @Temporal(TemporalType.DATE)
    private Date resetDt;
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

    public UsrWebSvc() {
    }

    public UsrWebSvc(UsrWebSvcPK usrWebSvcPK) {
        this.usrWebSvcPK = usrWebSvcPK;
    }

    public UsrWebSvc(UsrWebSvcPK usrWebSvcPK, int cntr, int lmt, Date resetDt, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.usrWebSvcPK = usrWebSvcPK;
        this.cntr = cntr;
        this.lmt = lmt;
        this.resetDt = resetDt;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public UsrWebSvc(String usrId, String webSvcId) {
        this.usrWebSvcPK = new UsrWebSvcPK(usrId, webSvcId);
    }

    public UsrWebSvcPK getUsrWebSvcPK() {
        return usrWebSvcPK;
    }

    public void setUsrWebSvcPK(UsrWebSvcPK usrWebSvcPK) {
        this.usrWebSvcPK = usrWebSvcPK;
    }

    public int getCntr() {
        return cntr;
    }

    public void setCntr(int cntr) {
        this.cntr = cntr;
    }

    public int getLmt() {
        return lmt;
    }

    public void setLmt(int lmt) {
        this.lmt = lmt;
    }

    public Date getResetDt() {
        return resetDt;
    }

    public void setResetDt(Date resetDt) {
        this.resetDt = resetDt;
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
        hash += (usrWebSvcPK != null ? usrWebSvcPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof UsrWebSvc)) {
            return false;
        }
        UsrWebSvc other = (UsrWebSvc) object;
        if ((this.usrWebSvcPK == null && other.usrWebSvcPK != null) || (this.usrWebSvcPK != null && !this.usrWebSvcPK.equals(other.usrWebSvcPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.UsrWebSvc[ usrWebSvcPK=" + usrWebSvcPK + " ]";
    }

}
