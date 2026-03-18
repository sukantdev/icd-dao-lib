package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class ApplicationServiceCountersPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "APPLICATION_DESC")
    private String applicationDesc;
    @Basic(optional = false)
    @Column(name = "LIMIT_TYPE_DESC")
    private String limitTypeDesc;
    @Basic(optional = false)
    @Column(name = "IDENTIFIER_TYPE_CD")
    private String identifierTypeCd;
    @Basic(optional = false)
    @Column(name = "IDENTIFIER_VALUE")
    private String identifierValue;

    public ApplicationServiceCountersPK() {
    }

    public ApplicationServiceCountersPK(String applicationDesc, String limitTypeDesc, String identifierTypeCd, String identifierValue) {
        this.applicationDesc = applicationDesc;
        this.limitTypeDesc = limitTypeDesc;
        this.identifierTypeCd = identifierTypeCd;
        this.identifierValue = identifierValue;
    }

    public String getApplicationDesc() {
        return applicationDesc;
    }

    public void setApplicationDesc(String applicationDesc) {
        this.applicationDesc = applicationDesc;
    }

    public String getLimitTypeDesc() {
        return limitTypeDesc;
    }

    public void setLimitTypeDesc(String limitTypeDesc) {
        this.limitTypeDesc = limitTypeDesc;
    }

    public String getIdentifierTypeCd() {
        return identifierTypeCd;
    }

    public void setIdentifierTypeCd(String identifierTypeCd) {
        this.identifierTypeCd = identifierTypeCd;
    }

    public String getIdentifierValue() {
        return identifierValue;
    }

    public void setIdentifierValue(String identifierValue) {
        this.identifierValue = identifierValue;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (applicationDesc != null ? applicationDesc.hashCode() : 0);
        hash += (limitTypeDesc != null ? limitTypeDesc.hashCode() : 0);
        hash += (identifierTypeCd != null ? identifierTypeCd.hashCode() : 0);
        hash += (identifierValue != null ? identifierValue.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof ApplicationServiceCountersPK)) {
            return false;
        }
        ApplicationServiceCountersPK other = (ApplicationServiceCountersPK) object;
        if ((this.applicationDesc == null && other.applicationDesc != null) || (this.applicationDesc != null && !this.applicationDesc.equals(other.applicationDesc))) {
            return false;
        }
        if ((this.limitTypeDesc == null && other.limitTypeDesc != null) || (this.limitTypeDesc != null && !this.limitTypeDesc.equals(other.limitTypeDesc))) {
            return false;
        }
        if ((this.identifierTypeCd == null && other.identifierTypeCd != null) || (this.identifierTypeCd != null && !this.identifierTypeCd.equals(other.identifierTypeCd))) {
            return false;
        }
        if ((this.identifierValue == null && other.identifierValue != null) || (this.identifierValue != null && !this.identifierValue.equals(other.identifierValue))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.ApplicationServiceCountersPK[ applicationDesc=" + applicationDesc + ", limitTypeDesc=" + limitTypeDesc + ", identifierTypeCd=" + identifierTypeCd + ", identifierValue=" + identifierValue + " ]";
    }

}
