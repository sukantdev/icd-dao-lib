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
@Table(name = "AVN_TRNS_AUTH_RESP", catalog = "", schema = "DBO")
public class AvnTrnsAuthResp implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected AvnTrnsAuthRespPK avnTrnsAuthRespPK;
    @Basic(optional = false)
    @Column(name = "AUTH_RESP")
    private String authResp;
    @Basic(optional = false)
    @Column(name = "AUTH_RESP_MSG")
    private String authRespMsg;
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

    public AvnTrnsAuthResp() {
    }

    public AvnTrnsAuthResp(AvnTrnsAuthRespPK avnTrnsAuthRespPK) {
        this.avnTrnsAuthRespPK = avnTrnsAuthRespPK;
    }

    public AvnTrnsAuthResp(AvnTrnsAuthRespPK avnTrnsAuthRespPK, String authResp, String authRespMsg, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.avnTrnsAuthRespPK = avnTrnsAuthRespPK;
        this.authResp = authResp;
        this.authRespMsg = authRespMsg;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public AvnTrnsAuthResp(int trnsTrkgNbr, String ctlNbr) {
        this.avnTrnsAuthRespPK = new AvnTrnsAuthRespPK(trnsTrkgNbr, ctlNbr);
    }

    public AvnTrnsAuthRespPK getAvnTrnsAuthRespPK() {
        return avnTrnsAuthRespPK;
    }

    public void setAvnTrnsAuthRespPK(AvnTrnsAuthRespPK avnTrnsAuthRespPK) {
        this.avnTrnsAuthRespPK = avnTrnsAuthRespPK;
    }

    public String getAuthResp() {
        return authResp;
    }

    public void setAuthResp(String authResp) {
        this.authResp = authResp;
    }

    public String getAuthRespMsg() {
        return authRespMsg;
    }

    public void setAuthRespMsg(String authRespMsg) {
        this.authRespMsg = authRespMsg;
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
        hash += (avnTrnsAuthRespPK != null ? avnTrnsAuthRespPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof AvnTrnsAuthResp)) {
            return false;
        }
        AvnTrnsAuthResp other = (AvnTrnsAuthResp) object;
        if ((this.avnTrnsAuthRespPK == null && other.avnTrnsAuthRespPK != null) || (this.avnTrnsAuthRespPK != null && !this.avnTrnsAuthRespPK.equals(other.avnTrnsAuthRespPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.AvnTrnsAuthResp[ avnTrnsAuthRespPK=" + avnTrnsAuthRespPK + " ]";
    }

}
