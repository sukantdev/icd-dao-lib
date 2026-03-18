package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

@Embeddable
public class AuthCodeXrefPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "AUTH_APPROV_CD")
    private int authApprovCd;
    @Basic(optional = false)
    @Column(name = "AUTH_DT")
    @Temporal(TemporalType.DATE)
    private Date authDt;

    public AuthCodeXrefPK() {
    }

    public AuthCodeXrefPK(int authApprovCd, Date authDt) {
        this.authApprovCd = authApprovCd;
        this.authDt = authDt;
    }

    public int getAuthApprovCd() {
        return authApprovCd;
    }

    public void setAuthApprovCd(int authApprovCd) {
        this.authApprovCd = authApprovCd;
    }

    public Date getAuthDt() {
        return authDt;
    }

    public void setAuthDt(Date authDt) {
        this.authDt = authDt;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) authApprovCd;
        hash += (authDt != null ? authDt.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof AuthCodeXrefPK)) {
            return false;
        }
        AuthCodeXrefPK other = (AuthCodeXrefPK) object;
        if (this.authApprovCd != other.authApprovCd) {
            return false;
        }
        if ((this.authDt == null && other.authDt != null) || (this.authDt != null && !this.authDt.equals(other.authDt))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.AuthCodeXrefPK[ authApprovCd=" + authApprovCd + ", authDt=" + authDt + " ]";
    }

}
