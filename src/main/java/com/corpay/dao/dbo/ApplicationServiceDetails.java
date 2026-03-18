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
@Table(name = "APPLICATION_SERVICE_DETAILS", catalog = "", schema = "DBO")
public class ApplicationServiceDetails implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ApplicationServiceDetailsPK applicationServiceDetailsPK;
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

    public ApplicationServiceDetails() {
    }

    public ApplicationServiceDetails(ApplicationServiceDetailsPK applicationServiceDetailsPK) {
        this.applicationServiceDetailsPK = applicationServiceDetailsPK;
    }

    public ApplicationServiceDetails(ApplicationServiceDetailsPK applicationServiceDetailsPK, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.applicationServiceDetailsPK = applicationServiceDetailsPK;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public ApplicationServiceDetails(String applicationDesc, String limitTypeDesc, String identifierTypeCd, String identifierValue, Date transTs) {
        this.applicationServiceDetailsPK = new ApplicationServiceDetailsPK(applicationDesc, limitTypeDesc, identifierTypeCd, identifierValue, transTs);
    }

    public ApplicationServiceDetailsPK getApplicationServiceDetailsPK() {
        return applicationServiceDetailsPK;
    }

    public void setApplicationServiceDetailsPK(ApplicationServiceDetailsPK applicationServiceDetailsPK) {
        this.applicationServiceDetailsPK = applicationServiceDetailsPK;
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
        hash += (applicationServiceDetailsPK != null ? applicationServiceDetailsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof ApplicationServiceDetails)) {
            return false;
        }
        ApplicationServiceDetails other = (ApplicationServiceDetails) object;
        if ((this.applicationServiceDetailsPK == null && other.applicationServiceDetailsPK != null) || (this.applicationServiceDetailsPK != null && !this.applicationServiceDetailsPK.equals(other.applicationServiceDetailsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.ApplicationServiceDetails[ applicationServiceDetailsPK=" + applicationServiceDetailsPK + " ]";
    }

}
