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
@Table(name = "NTWK_ID_DESC", catalog = "", schema = "DBO")
public class NtwkIdDesc implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "NTWK_ID")
    private String ntwkId;
    @Basic(optional = false)
    @Column(name = "DESC")
    private String desc;
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

    public NtwkIdDesc() {
    }

    public NtwkIdDesc(String ntwkId) {
        this.ntwkId = ntwkId;
    }

    public NtwkIdDesc(String ntwkId, String desc, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.ntwkId = ntwkId;
        this.desc = desc;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public String getNtwkId() {
        return ntwkId;
    }

    public void setNtwkId(String ntwkId) {
        this.ntwkId = ntwkId;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
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
        hash += (ntwkId != null ? ntwkId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof NtwkIdDesc)) {
            return false;
        }
        NtwkIdDesc other = (NtwkIdDesc) object;
        if ((this.ntwkId == null && other.ntwkId != null) || (this.ntwkId != null && !this.ntwkId.equals(other.ntwkId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.NtwkIdDesc[ ntwkId=" + ntwkId + " ]";
    }

}
