package com.corpay.dao.cxxcow;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

@Embeddable
public class McAuthRevPK implements Serializable {

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
    @Basic(optional = false)
    @Column(name = "REV_OCC")
    private short revOcc;

    public McAuthRevPK() {
    }

    public McAuthRevPK(String authPan, Date authUtDt, int authApprovCd, Date authLocalTs, short revOcc) {
        this.authPan = authPan;
        this.authUtDt = authUtDt;
        this.authApprovCd = authApprovCd;
        this.authLocalTs = authLocalTs;
        this.revOcc = revOcc;
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

    public short getRevOcc() {
        return revOcc;
    }

    public void setRevOcc(short revOcc) {
        this.revOcc = revOcc;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (authPan != null ? authPan.hashCode() : 0);
        hash += (authUtDt != null ? authUtDt.hashCode() : 0);
        hash += (int) authApprovCd;
        hash += (authLocalTs != null ? authLocalTs.hashCode() : 0);
        hash += (int) revOcc;
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof McAuthRevPK)) {
            return false;
        }
        McAuthRevPK other = (McAuthRevPK) object;
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
        if (this.revOcc != other.revOcc) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.cxxcow.McAuthRevPK[ authPan=" + authPan + ", authUtDt=" + authUtDt + ", authApprovCd=" + authApprovCd + ", authLocalTs=" + authLocalTs + ", revOcc=" + revOcc + " ]";
    }

}
