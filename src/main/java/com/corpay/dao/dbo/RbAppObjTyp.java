package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "RB_APP_OBJ_TYP", catalog = "", schema = "DBO")
public class RbAppObjTyp implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "OBJ_TYP_ID")
    private Long objTypId;
    @Basic(optional = false)
    @Column(name = "OBJ_TYP_NM")
    private String objTypNm;
    @Basic(optional = false)
    @Column(name = "HAS_NPI")
    private Character hasNpi;
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
    @Column(name = "OBJ_TYP_CD")
    private String objTypCd;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "objTypId", fetch = FetchType.LAZY)
    private Set<RbAppObj> rbAppObjSet;

    public RbAppObjTyp() {
    }

    public RbAppObjTyp(Long objTypId) {
        this.objTypId = objTypId;
    }

    public RbAppObjTyp(Long objTypId, String objTypNm, Character hasNpi, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr, String objTypCd) {
        this.objTypId = objTypId;
        this.objTypNm = objTypNm;
        this.hasNpi = hasNpi;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
        this.objTypCd = objTypCd;
    }

    public Long getObjTypId() {
        return objTypId;
    }

    public void setObjTypId(Long objTypId) {
        this.objTypId = objTypId;
    }

    public String getObjTypNm() {
        return objTypNm;
    }

    public void setObjTypNm(String objTypNm) {
        this.objTypNm = objTypNm;
    }

    public Character getHasNpi() {
        return hasNpi;
    }

    public void setHasNpi(Character hasNpi) {
        this.hasNpi = hasNpi;
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

    public String getObjTypCd() {
        return objTypCd;
    }

    public void setObjTypCd(String objTypCd) {
        this.objTypCd = objTypCd;
    }

    public Set<RbAppObj> getRbAppObjSet() {
        return rbAppObjSet;
    }

    public void setRbAppObjSet(Set<RbAppObj> rbAppObjSet) {
        this.rbAppObjSet = rbAppObjSet;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (objTypId != null ? objTypId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof RbAppObjTyp)) {
            return false;
        }
        RbAppObjTyp other = (RbAppObjTyp) object;
        if ((this.objTypId == null && other.objTypId != null) || (this.objTypId != null && !this.objTypId.equals(other.objTypId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.RbAppObjTyp[ objTypId=" + objTypId + " ]";
    }

}
