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
@Table(name = "INTEG_REQ_TYP", catalog = "", schema = "DBO")
public class IntegReqTyp implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "INTEG_ID")
    private String integId;
    @Basic(optional = false)
    @Column(name = "REQ_TYP")
    private String reqTyp;
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

    public IntegReqTyp() {
    }

    public IntegReqTyp(String integId) {
        this.integId = integId;
    }

    public IntegReqTyp(String integId, String reqTyp, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.integId = integId;
        this.reqTyp = reqTyp;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public String getIntegId() {
        return integId;
    }

    public void setIntegId(String integId) {
        this.integId = integId;
    }

    public String getReqTyp() {
        return reqTyp;
    }

    public void setReqTyp(String reqTyp) {
        this.reqTyp = reqTyp;
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
        hash += (integId != null ? integId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof IntegReqTyp)) {
            return false;
        }
        IntegReqTyp other = (IntegReqTyp) object;
        if ((this.integId == null && other.integId != null) || (this.integId != null && !this.integId.equals(other.integId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.IntegReqTyp[ integId=" + integId + " ]";
    }

}
