package com.corpay.dao.cxxcow;

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
@Table(name = "PREPAID_WEBSERVICE_MST", catalog = "", schema = "CXXCOW")
public class PrepaidWebserviceMst implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "WEB_SVC_ID")
    private Integer webSvcId;
    @Basic(optional = false)
    @Column(name = "WEB_SVC_NM")
    private String webSvcNm;
    @Column(name = "WEB_SVC_DESC")
    private String webSvcDesc;
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

    public PrepaidWebserviceMst() {
    }

    public PrepaidWebserviceMst(Integer webSvcId) {
        this.webSvcId = webSvcId;
    }

    public PrepaidWebserviceMst(Integer webSvcId, String webSvcNm, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.webSvcId = webSvcId;
        this.webSvcNm = webSvcNm;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public Integer getWebSvcId() {
        return webSvcId;
    }

    public void setWebSvcId(Integer webSvcId) {
        this.webSvcId = webSvcId;
    }

    public String getWebSvcNm() {
        return webSvcNm;
    }

    public void setWebSvcNm(String webSvcNm) {
        this.webSvcNm = webSvcNm;
    }

    public String getWebSvcDesc() {
        return webSvcDesc;
    }

    public void setWebSvcDesc(String webSvcDesc) {
        this.webSvcDesc = webSvcDesc;
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
        hash += (webSvcId != null ? webSvcId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof PrepaidWebserviceMst)) {
            return false;
        }
        PrepaidWebserviceMst other = (PrepaidWebserviceMst) object;
        if ((this.webSvcId == null && other.webSvcId != null) || (this.webSvcId != null && !this.webSvcId.equals(other.webSvcId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.cxxcow.PrepaidWebserviceMst[ webSvcId=" + webSvcId + " ]";
    }

}
