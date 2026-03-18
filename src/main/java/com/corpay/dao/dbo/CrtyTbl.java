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
@Table(name = "CRTY_TBL", catalog = "", schema = "DBO")
public class CrtyTbl implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CRTY_CD_3_X")
    private String crtyCd3X;
    @Basic(optional = false)
    @Column(name = "CRTY_CD_3_N")
    private short crtyCd3N;
    @Basic(optional = false)
    @Column(name = "CRTY_CD_2_X")
    private String crtyCd2X;
    @Basic(optional = false)
    @Column(name = "CRTY_CD_2_N")
    private short crtyCd2N;
    @Basic(optional = false)
    @Column(name = "CRTY_PSTL_CD_FMT")
    private short crtyPstlCdFmt;
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

    public CrtyTbl() {
    }

    public CrtyTbl(String crtyCd3X) {
        this.crtyCd3X = crtyCd3X;
    }

    public CrtyTbl(String crtyCd3X, short crtyCd3N, String crtyCd2X, short crtyCd2N, short crtyPstlCdFmt, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.crtyCd3X = crtyCd3X;
        this.crtyCd3N = crtyCd3N;
        this.crtyCd2X = crtyCd2X;
        this.crtyCd2N = crtyCd2N;
        this.crtyPstlCdFmt = crtyPstlCdFmt;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public String getCrtyCd3X() {
        return crtyCd3X;
    }

    public void setCrtyCd3X(String crtyCd3X) {
        this.crtyCd3X = crtyCd3X;
    }

    public short getCrtyCd3N() {
        return crtyCd3N;
    }

    public void setCrtyCd3N(short crtyCd3N) {
        this.crtyCd3N = crtyCd3N;
    }

    public String getCrtyCd2X() {
        return crtyCd2X;
    }

    public void setCrtyCd2X(String crtyCd2X) {
        this.crtyCd2X = crtyCd2X;
    }

    public short getCrtyCd2N() {
        return crtyCd2N;
    }

    public void setCrtyCd2N(short crtyCd2N) {
        this.crtyCd2N = crtyCd2N;
    }

    public short getCrtyPstlCdFmt() {
        return crtyPstlCdFmt;
    }

    public void setCrtyPstlCdFmt(short crtyPstlCdFmt) {
        this.crtyPstlCdFmt = crtyPstlCdFmt;
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
        hash += (crtyCd3X != null ? crtyCd3X.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof CrtyTbl)) {
            return false;
        }
        CrtyTbl other = (CrtyTbl) object;
        if ((this.crtyCd3X == null && other.crtyCd3X != null) || (this.crtyCd3X != null && !this.crtyCd3X.equals(other.crtyCd3X))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.CrtyTbl[ crtyCd3X=" + crtyCd3X + " ]";
    }

}
