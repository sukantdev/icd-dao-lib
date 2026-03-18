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
@Table(name = "GEN_CVC", catalog = "", schema = "DBO")
public class GenCvc implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected GenCvcPK genCvcPK;
    @Basic(optional = false)
    @Column(name = "CRD_END")
    private long crdEnd;
    @Basic(optional = false)
    @Column(name = "CRD_TYPE")
    private String crdType;
    @Basic(optional = false)
    @Column(name = "CRD_FRMT")
    private String crdFrmt;
    @Basic(optional = false)
    @Column(name = "CRD_CVK1")
    private String crdCvk1;
    @Basic(optional = false)
    @Column(name = "CRD_CVK2")
    private String crdCvk2;
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

    public GenCvc() {
    }

    public GenCvc(GenCvcPK genCvcPK) {
        this.genCvcPK = genCvcPK;
    }

    public GenCvc(GenCvcPK genCvcPK, long crdEnd, String crdType, String crdFrmt, String crdCvk1, String crdCvk2, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.genCvcPK = genCvcPK;
        this.crdEnd = crdEnd;
        this.crdType = crdType;
        this.crdFrmt = crdFrmt;
        this.crdCvk1 = crdCvk1;
        this.crdCvk2 = crdCvk2;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public GenCvc(int crdBin, long crdSta) {
        this.genCvcPK = new GenCvcPK(crdBin, crdSta);
    }

    public GenCvcPK getGenCvcPK() {
        return genCvcPK;
    }

    public void setGenCvcPK(GenCvcPK genCvcPK) {
        this.genCvcPK = genCvcPK;
    }

    public long getCrdEnd() {
        return crdEnd;
    }

    public void setCrdEnd(long crdEnd) {
        this.crdEnd = crdEnd;
    }

    public String getCrdType() {
        return crdType;
    }

    public void setCrdType(String crdType) {
        this.crdType = crdType;
    }

    public String getCrdFrmt() {
        return crdFrmt;
    }

    public void setCrdFrmt(String crdFrmt) {
        this.crdFrmt = crdFrmt;
    }

    public String getCrdCvk1() {
        return crdCvk1;
    }

    public void setCrdCvk1(String crdCvk1) {
        this.crdCvk1 = crdCvk1;
    }

    public String getCrdCvk2() {
        return crdCvk2;
    }

    public void setCrdCvk2(String crdCvk2) {
        this.crdCvk2 = crdCvk2;
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
        hash += (genCvcPK != null ? genCvcPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof GenCvc)) {
            return false;
        }
        GenCvc other = (GenCvc) object;
        if ((this.genCvcPK == null && other.genCvcPK != null) || (this.genCvcPK != null && !this.genCvcPK.equals(other.genCvcPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.GenCvc[ genCvcPK=" + genCvcPK + " ]";
    }

}
