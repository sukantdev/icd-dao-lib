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
@Table(name = "HIER_MKTR", catalog = "", schema = "DBO")
public class HierMktr implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected HierMktrPK hierMktrPK;
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
    @Basic(optional = false)
    @Column(name = "NETW_FLG")
    private Character netwFlg;

    public HierMktr() {
    }

    public HierMktr(HierMktrPK hierMktrPK) {
        this.hierMktrPK = hierMktrPK;
    }

    public HierMktr(HierMktrPK hierMktrPK, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr, Character netwFlg) {
        this.hierMktrPK = hierMktrPK;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
        this.netwFlg = netwFlg;
    }

    public HierMktr(String hierId, String nodeId, String mktr) {
        this.hierMktrPK = new HierMktrPK(hierId, nodeId, mktr);
    }

    public HierMktrPK getHierMktrPK() {
        return hierMktrPK;
    }

    public void setHierMktrPK(HierMktrPK hierMktrPK) {
        this.hierMktrPK = hierMktrPK;
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

    public Character getNetwFlg() {
        return netwFlg;
    }

    public void setNetwFlg(Character netwFlg) {
        this.netwFlg = netwFlg;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (hierMktrPK != null ? hierMktrPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof HierMktr)) {
            return false;
        }
        HierMktr other = (HierMktr) object;
        if ((this.hierMktrPK == null && other.hierMktrPK != null) || (this.hierMktrPK != null && !this.hierMktrPK.equals(other.hierMktrPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.HierMktr[ hierMktrPK=" + hierMktrPK + " ]";
    }

}
