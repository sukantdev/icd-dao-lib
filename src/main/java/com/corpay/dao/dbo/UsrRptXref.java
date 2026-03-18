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
@Table(name = "USR_RPT_XREF", catalog = "", schema = "DBO")
public class UsrRptXref implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected UsrRptXrefPK usrRptXrefPK;
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
    @Column(name = "IS_DFLT")
    private Character isDflt;
    @Basic(optional = false)
    @Column(name = "REBATE_IND")
    private Character rebateInd;
    @Basic(optional = false)
    @Column(name = "LINK_RPT_ID")
    private int linkRptId;
    @Basic(optional = false)
    @Column(name = "DISCOUNTS_IND")
    private Character discountsInd;

    public UsrRptXref() {
    }

    public UsrRptXref(UsrRptXrefPK usrRptXrefPK) {
        this.usrRptXrefPK = usrRptXrefPK;
    }

    public UsrRptXref(UsrRptXrefPK usrRptXrefPK, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr, Character isDflt, Character rebateInd, int linkRptId, Character discountsInd) {
        this.usrRptXrefPK = usrRptXrefPK;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
        this.isDflt = isDflt;
        this.rebateInd = rebateInd;
        this.linkRptId = linkRptId;
        this.discountsInd = discountsInd;
    }

    public UsrRptXref(String usrId, int rptNbr) {
        this.usrRptXrefPK = new UsrRptXrefPK(usrId, rptNbr);
    }

    public UsrRptXrefPK getUsrRptXrefPK() {
        return usrRptXrefPK;
    }

    public void setUsrRptXrefPK(UsrRptXrefPK usrRptXrefPK) {
        this.usrRptXrefPK = usrRptXrefPK;
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

    public Character getIsDflt() {
        return isDflt;
    }

    public void setIsDflt(Character isDflt) {
        this.isDflt = isDflt;
    }

    public Character getRebateInd() {
        return rebateInd;
    }

    public void setRebateInd(Character rebateInd) {
        this.rebateInd = rebateInd;
    }

    public int getLinkRptId() {
        return linkRptId;
    }

    public void setLinkRptId(int linkRptId) {
        this.linkRptId = linkRptId;
    }

    public Character getDiscountsInd() {
        return discountsInd;
    }

    public void setDiscountsInd(Character discountsInd) {
        this.discountsInd = discountsInd;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (usrRptXrefPK != null ? usrRptXrefPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof UsrRptXref)) {
            return false;
        }
        UsrRptXref other = (UsrRptXref) object;
        if ((this.usrRptXrefPK == null && other.usrRptXrefPK != null) || (this.usrRptXrefPK != null && !this.usrRptXrefPK.equals(other.usrRptXrefPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.UsrRptXref[ usrRptXrefPK=" + usrRptXrefPK + " ]";
    }

}
