package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class PrdCmstSysInfoPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "APPL_NBR")
    private String applNbr;
    @Basic(optional = false)
    @Column(name = "CHILD_TYP")
    private String childTyp;
    @Basic(optional = false)
    @Column(name = "SYS_DESC")
    private String sysDesc;

    public PrdCmstSysInfoPK() {
    }

    public PrdCmstSysInfoPK(String applNbr, String childTyp, String sysDesc) {
        this.applNbr = applNbr;
        this.childTyp = childTyp;
        this.sysDesc = sysDesc;
    }

    public String getApplNbr() {
        return applNbr;
    }

    public void setApplNbr(String applNbr) {
        this.applNbr = applNbr;
    }

    public String getChildTyp() {
        return childTyp;
    }

    public void setChildTyp(String childTyp) {
        this.childTyp = childTyp;
    }

    public String getSysDesc() {
        return sysDesc;
    }

    public void setSysDesc(String sysDesc) {
        this.sysDesc = sysDesc;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (applNbr != null ? applNbr.hashCode() : 0);
        hash += (childTyp != null ? childTyp.hashCode() : 0);
        hash += (sysDesc != null ? sysDesc.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof PrdCmstSysInfoPK)) {
            return false;
        }
        PrdCmstSysInfoPK other = (PrdCmstSysInfoPK) object;
        if ((this.applNbr == null && other.applNbr != null) || (this.applNbr != null && !this.applNbr.equals(other.applNbr))) {
            return false;
        }
        if ((this.childTyp == null && other.childTyp != null) || (this.childTyp != null && !this.childTyp.equals(other.childTyp))) {
            return false;
        }
        if ((this.sysDesc == null && other.sysDesc != null) || (this.sysDesc != null && !this.sysDesc.equals(other.sysDesc))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.PrdCmstSysInfoPK[ applNbr=" + applNbr + ", childTyp=" + childTyp + ", sysDesc=" + sysDesc + " ]";
    }

}
