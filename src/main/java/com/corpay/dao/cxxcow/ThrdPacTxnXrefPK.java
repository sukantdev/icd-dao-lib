/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.corpay.dao.cxxcow;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Sukant.Tiwari
 */
@Embeddable
public class ThrdPacTxnXrefPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "AUTH_PAN")
    private String authPan;
    @Basic(optional = false)
    @Column(name = "AUTH_UT_DT")
    @Temporal(TemporalType.DATE)
    private Date authUtDt;
    @Basic(optional = false)
    @Column(name = "AUTH_APPROV_CD")
    private int authApprovCd;
    @Basic(optional = false)
    @Column(name = "AUTH_LOCAL_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date authLocalTs;

    public ThrdPacTxnXrefPK() {
    }

    public ThrdPacTxnXrefPK(String authPan, Date authUtDt, int authApprovCd, Date authLocalTs) {
        this.authPan = authPan;
        this.authUtDt = authUtDt;
        this.authApprovCd = authApprovCd;
        this.authLocalTs = authLocalTs;
    }

    public String getAuthPan() {
        return authPan;
    }

    public void setAuthPan(String authPan) {
        this.authPan = authPan;
    }

    public Date getAuthUtDt() {
        return authUtDt;
    }

    public void setAuthUtDt(Date authUtDt) {
        this.authUtDt = authUtDt;
    }

    public int getAuthApprovCd() {
        return authApprovCd;
    }

    public void setAuthApprovCd(int authApprovCd) {
        this.authApprovCd = authApprovCd;
    }

    public Date getAuthLocalTs() {
        return authLocalTs;
    }

    public void setAuthLocalTs(Date authLocalTs) {
        this.authLocalTs = authLocalTs;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (authPan != null ? authPan.hashCode() : 0);
        hash += (authUtDt != null ? authUtDt.hashCode() : 0);
        hash += (int) authApprovCd;
        hash += (authLocalTs != null ? authLocalTs.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ThrdPacTxnXrefPK)) {
            return false;
        }
        ThrdPacTxnXrefPK other = (ThrdPacTxnXrefPK) object;
        if ((this.authPan == null && other.authPan != null) || (this.authPan != null && !this.authPan.equals(other.authPan))) {
            return false;
        }
        if ((this.authUtDt == null && other.authUtDt != null) || (this.authUtDt != null && !this.authUtDt.equals(other.authUtDt))) {
            return false;
        }
        if (this.authApprovCd != other.authApprovCd) {
            return false;
        }
        if ((this.authLocalTs == null && other.authLocalTs != null) || (this.authLocalTs != null && !this.authLocalTs.equals(other.authLocalTs))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.cxxcow.ThrdPacTxnXrefPK[ authPan=" + authPan + ", authUtDt=" + authUtDt + ", authApprovCd=" + authApprovCd + ", authLocalTs=" + authLocalTs + " ]";
    }
    
}
