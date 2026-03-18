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
@Table(name = "CRD_BLK_RSN_CD", catalog = "", schema = "DBO")
public class CrdBlkRsnCd implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "BLK_RSN_CD")
    private Short blkRsnCd;
    @Basic(optional = false)
    @Column(name = "RSN_CD_TYP")
    private Character rsnCdTyp;
    @Basic(optional = false)
    @Column(name = "RSN_CD_DESC")
    private String rsnCdDesc;
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

    public CrdBlkRsnCd() {
    }

    public CrdBlkRsnCd(Short blkRsnCd) {
        this.blkRsnCd = blkRsnCd;
    }

    public CrdBlkRsnCd(Short blkRsnCd, Character rsnCdTyp, String rsnCdDesc, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.blkRsnCd = blkRsnCd;
        this.rsnCdTyp = rsnCdTyp;
        this.rsnCdDesc = rsnCdDesc;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public Short getBlkRsnCd() {
        return blkRsnCd;
    }

    public void setBlkRsnCd(Short blkRsnCd) {
        this.blkRsnCd = blkRsnCd;
    }

    public Character getRsnCdTyp() {
        return rsnCdTyp;
    }

    public void setRsnCdTyp(Character rsnCdTyp) {
        this.rsnCdTyp = rsnCdTyp;
    }

    public String getRsnCdDesc() {
        return rsnCdDesc;
    }

    public void setRsnCdDesc(String rsnCdDesc) {
        this.rsnCdDesc = rsnCdDesc;
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
        hash += (blkRsnCd != null ? blkRsnCd.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof CrdBlkRsnCd)) {
            return false;
        }
        CrdBlkRsnCd other = (CrdBlkRsnCd) object;
        if ((this.blkRsnCd == null && other.blkRsnCd != null) || (this.blkRsnCd != null && !this.blkRsnCd.equals(other.blkRsnCd))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.CrdBlkRsnCd[ blkRsnCd=" + blkRsnCd + " ]";
    }

}
