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
@Table(name = "FN_HEADER", catalog = "", schema = "DBO")
public class FnHeader implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected FnHeaderPK fnHeaderPK;
    @Basic(optional = false)
    @Column(name = "PROC_FLG")
    private Character procFlg;
    @Basic(optional = false)
    @Column(name = "PROC_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date procTs;
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

    public FnHeader() {
    }

    public FnHeader(FnHeaderPK fnHeaderPK) {
        this.fnHeaderPK = fnHeaderPK;
    }

    public FnHeader(FnHeaderPK fnHeaderPK, Character procFlg, Date procTs, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.fnHeaderPK = fnHeaderPK;
        this.procFlg = procFlg;
        this.procTs = procTs;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public FnHeader(Date fileDt, short fileSeq) {
        this.fnHeaderPK = new FnHeaderPK(fileDt, fileSeq);
    }

    public FnHeaderPK getFnHeaderPK() {
        return fnHeaderPK;
    }

    public void setFnHeaderPK(FnHeaderPK fnHeaderPK) {
        this.fnHeaderPK = fnHeaderPK;
    }

    public Character getProcFlg() {
        return procFlg;
    }

    public void setProcFlg(Character procFlg) {
        this.procFlg = procFlg;
    }

    public Date getProcTs() {
        return procTs;
    }

    public void setProcTs(Date procTs) {
        this.procTs = procTs;
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
        hash += (fnHeaderPK != null ? fnHeaderPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof FnHeader)) {
            return false;
        }
        FnHeader other = (FnHeader) object;
        if ((this.fnHeaderPK == null && other.fnHeaderPK != null) || (this.fnHeaderPK != null && !this.fnHeaderPK.equals(other.fnHeaderPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.FnHeader[ fnHeaderPK=" + fnHeaderPK + " ]";
    }

}
