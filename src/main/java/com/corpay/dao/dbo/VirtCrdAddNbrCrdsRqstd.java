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
@Table(name = "VIRT_CRD_ADD_NBR_CRDS_RQSTD", catalog = "", schema = "DBO")
public class VirtCrdAddNbrCrdsRqstd implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "REQ_UID")
    private String reqUid;
    @Basic(optional = false)
    @Column(name = "NUM_CRDS_RQSTD")
    private int numCrdsRqstd;
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

    public VirtCrdAddNbrCrdsRqstd() {
    }

    public VirtCrdAddNbrCrdsRqstd(String reqUid) {
        this.reqUid = reqUid;
    }

    public VirtCrdAddNbrCrdsRqstd(String reqUid, int numCrdsRqstd, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.reqUid = reqUid;
        this.numCrdsRqstd = numCrdsRqstd;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public String getReqUid() {
        return reqUid;
    }

    public void setReqUid(String reqUid) {
        this.reqUid = reqUid;
    }

    public int getNumCrdsRqstd() {
        return numCrdsRqstd;
    }

    public void setNumCrdsRqstd(int numCrdsRqstd) {
        this.numCrdsRqstd = numCrdsRqstd;
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
        hash += (reqUid != null ? reqUid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof VirtCrdAddNbrCrdsRqstd)) {
            return false;
        }
        VirtCrdAddNbrCrdsRqstd other = (VirtCrdAddNbrCrdsRqstd) object;
        if ((this.reqUid == null && other.reqUid != null) || (this.reqUid != null && !this.reqUid.equals(other.reqUid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.VirtCrdAddNbrCrdsRqstd[ reqUid=" + reqUid + " ]";
    }

}
