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
@Table(name = "VP_STP_EXCEPTION", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "VpStpException.findAll", query = "SELECT v FROM VpStpException v")})
public class VpStpException implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "STP_EXC_ID")
    private String stpExcId;
    @Basic(optional = false)
    @Column(name = "PMT_SRC_ID")
    private String pmtSrcId;
    @Basic(optional = false)
    @Column(name = "VNDR_ID")
    private String vndrId;
    @Basic(optional = false)
    @Column(name = "CRD_NBR")
    private String crdNbr;
    @Basic(optional = false)
    @Column(name = "PMT_STAT_HREF_ADDR")
    private String pmtStatHrefAddr;
    @Basic(optional = false)
    @Column(name = "MSG")
    private String msg;
    @Basic(optional = false)
    @Column(name = "LOGREF_ADDR")
    private String logrefAddr;
    @Basic(optional = false)
    @Column(name = "PATH_TXT")
    private String pathTxt;
    @Basic(optional = false)
    @Column(name = "HELP_HREF_ADDR")
    private String helpHrefAddr;
    @Basic(optional = false)
    @Column(name = "ABOUT_HREF_ADDR")
    private String aboutHrefAddr;
    @Basic(optional = false)
    @Column(name = "DSCRBS_HREF_ADDR")
    private String dscrbsHrefAddr;
    @Basic(optional = false)
    @Column(name = "LN_MSG_ADDR")
    private String lnMsgAddr;
    @Basic(optional = false)
    @Column(name = "LN_LOGHREF_ADDR")
    private String lnLoghrefAddr;
    @Basic(optional = false)
    @Column(name = "LN_HELP_HREF_ADDR")
    private String lnHelpHrefAddr;
    @Basic(optional = false)
    @Column(name = "LN_ABOUT_HREF_ADDR")
    private String lnAboutHrefAddr;
    @Basic(optional = false)
    @Column(name = "LN_DSCRBS_HREF_ADDR")
    private String lnDscrbsHrefAddr;
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
    @Basic(optional = false)
    @Column(name = "STP_SUPL_ID")
    private String stpSuplId;
    @Basic(optional = false)
    @Column(name = "PAYMENT_ID")
    private String paymentId;

    public VpStpException() {
    }

    public VpStpException(String stpExcId) {
        this.stpExcId = stpExcId;
    }

    public VpStpException(String stpExcId, String pmtSrcId, String vndrId, String crdNbr, String pmtStatHrefAddr, String msg, String logrefAddr, String pathTxt, String helpHrefAddr, String aboutHrefAddr, String dscrbsHrefAddr, String lnMsgAddr, String lnLoghrefAddr, String lnHelpHrefAddr, String lnAboutHrefAddr, String lnDscrbsHrefAddr, String mdyUsr, Date mdyTs, String crtUsr, Date crtTs, String stpSuplId, String paymentId) {
        this.stpExcId = stpExcId;
        this.pmtSrcId = pmtSrcId;
        this.vndrId = vndrId;
        this.crdNbr = crdNbr;
        this.pmtStatHrefAddr = pmtStatHrefAddr;
        this.msg = msg;
        this.logrefAddr = logrefAddr;
        this.pathTxt = pathTxt;
        this.helpHrefAddr = helpHrefAddr;
        this.aboutHrefAddr = aboutHrefAddr;
        this.dscrbsHrefAddr = dscrbsHrefAddr;
        this.lnMsgAddr = lnMsgAddr;
        this.lnLoghrefAddr = lnLoghrefAddr;
        this.lnHelpHrefAddr = lnHelpHrefAddr;
        this.lnAboutHrefAddr = lnAboutHrefAddr;
        this.lnDscrbsHrefAddr = lnDscrbsHrefAddr;
        this.mdyUsr = mdyUsr;
        this.mdyTs = mdyTs;
        this.crtUsr = crtUsr;
        this.crtTs = crtTs;
        this.stpSuplId = stpSuplId;
        this.paymentId = paymentId;
    }

    public String getStpExcId() {
        return stpExcId;
    }

    public void setStpExcId(String stpExcId) {
        this.stpExcId = stpExcId;
    }

    public String getPmtSrcId() {
        return pmtSrcId;
    }

    public void setPmtSrcId(String pmtSrcId) {
        this.pmtSrcId = pmtSrcId;
    }

    public String getVndrId() {
        return vndrId;
    }

    public void setVndrId(String vndrId) {
        this.vndrId = vndrId;
    }

    public String getCrdNbr() {
        return crdNbr;
    }

    public void setCrdNbr(String crdNbr) {
        this.crdNbr = crdNbr;
    }

    public String getPmtStatHrefAddr() {
        return pmtStatHrefAddr;
    }

    public void setPmtStatHrefAddr(String pmtStatHrefAddr) {
        this.pmtStatHrefAddr = pmtStatHrefAddr;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getLogrefAddr() {
        return logrefAddr;
    }

    public void setLogrefAddr(String logrefAddr) {
        this.logrefAddr = logrefAddr;
    }

    public String getPathTxt() {
        return pathTxt;
    }

    public void setPathTxt(String pathTxt) {
        this.pathTxt = pathTxt;
    }

    public String getHelpHrefAddr() {
        return helpHrefAddr;
    }

    public void setHelpHrefAddr(String helpHrefAddr) {
        this.helpHrefAddr = helpHrefAddr;
    }

    public String getAboutHrefAddr() {
        return aboutHrefAddr;
    }

    public void setAboutHrefAddr(String aboutHrefAddr) {
        this.aboutHrefAddr = aboutHrefAddr;
    }

    public String getDscrbsHrefAddr() {
        return dscrbsHrefAddr;
    }

    public void setDscrbsHrefAddr(String dscrbsHrefAddr) {
        this.dscrbsHrefAddr = dscrbsHrefAddr;
    }

    public String getLnMsgAddr() {
        return lnMsgAddr;
    }

    public void setLnMsgAddr(String lnMsgAddr) {
        this.lnMsgAddr = lnMsgAddr;
    }

    public String getLnLoghrefAddr() {
        return lnLoghrefAddr;
    }

    public void setLnLoghrefAddr(String lnLoghrefAddr) {
        this.lnLoghrefAddr = lnLoghrefAddr;
    }

    public String getLnHelpHrefAddr() {
        return lnHelpHrefAddr;
    }

    public void setLnHelpHrefAddr(String lnHelpHrefAddr) {
        this.lnHelpHrefAddr = lnHelpHrefAddr;
    }

    public String getLnAboutHrefAddr() {
        return lnAboutHrefAddr;
    }

    public void setLnAboutHrefAddr(String lnAboutHrefAddr) {
        this.lnAboutHrefAddr = lnAboutHrefAddr;
    }

    public String getLnDscrbsHrefAddr() {
        return lnDscrbsHrefAddr;
    }

    public void setLnDscrbsHrefAddr(String lnDscrbsHrefAddr) {
        this.lnDscrbsHrefAddr = lnDscrbsHrefAddr;
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

    public String getStpSuplId() {
        return stpSuplId;
    }

    public void setStpSuplId(String stpSuplId) {
        this.stpSuplId = stpSuplId;
    }

    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (stpExcId != null ? stpExcId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof VpStpException)) {
            return false;
        }
        VpStpException other = (VpStpException) object;
        if ((this.stpExcId == null && other.stpExcId != null) || (this.stpExcId != null && !this.stpExcId.equals(other.stpExcId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.VpStpException[ stpExcId=" + stpExcId + " ]";
    }
    
}
