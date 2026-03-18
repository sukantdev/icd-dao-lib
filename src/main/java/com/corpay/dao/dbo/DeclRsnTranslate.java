package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "DECL_RSN_TRANSLATE", catalog = "", schema = "DBO")
public class DeclRsnTranslate implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "MSG_NBR")
    private Integer msgNbr;
    @Basic(optional = false)
    @Column(name = "MOBILE_MSG_TXT")
    private String mobileMsgTxt;
    @Basic(optional = false)
    @Column(name = "MOBILE_ACTN_TXT")
    private String mobileActnTxt;
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

    public DeclRsnTranslate() {
    }

    public DeclRsnTranslate(Integer msgNbr) {
        this.msgNbr = msgNbr;
    }

    public DeclRsnTranslate(Integer msgNbr, String mobileMsgTxt, String mobileActnTxt, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.msgNbr = msgNbr;
        this.mobileMsgTxt = mobileMsgTxt;
        this.mobileActnTxt = mobileActnTxt;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public Integer getMsgNbr() {
        return msgNbr;
    }

    public void setMsgNbr(Integer msgNbr) {
        this.msgNbr = msgNbr;
    }

    public String getMobileMsgTxt() {
        return mobileMsgTxt;
    }

    public void setMobileMsgTxt(String mobileMsgTxt) {
        this.mobileMsgTxt = mobileMsgTxt;
    }

    public String getMobileActnTxt() {
        return mobileActnTxt;
    }

    public void setMobileActnTxt(String mobileActnTxt) {
        this.mobileActnTxt = mobileActnTxt;
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
        hash += (msgNbr != null ? msgNbr.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof DeclRsnTranslate)) {
            return false;
        }
        DeclRsnTranslate other = (DeclRsnTranslate) object;
        if ((this.msgNbr == null && other.msgNbr != null) || (this.msgNbr != null && !this.msgNbr.equals(other.msgNbr))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.DeclRsnTranslate[ msgNbr=" + msgNbr + " ]";
    }

}
