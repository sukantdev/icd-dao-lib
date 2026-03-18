package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class MrchLocFnXrefTmpPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "SITE_ID")
    private String siteId;
    @Basic(optional = false)
    @Column(name = "LOC_ID")
    private String locId;

    public MrchLocFnXrefTmpPK() {
    }

    public MrchLocFnXrefTmpPK(String siteId, String locId) {
        this.siteId = siteId;
        this.locId = locId;
    }

    public String getSiteId() {
        return siteId;
    }

    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

    public String getLocId() {
        return locId;
    }

    public void setLocId(String locId) {
        this.locId = locId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (siteId != null ? siteId.hashCode() : 0);
        hash += (locId != null ? locId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof MrchLocFnXrefTmpPK)) {
            return false;
        }
        MrchLocFnXrefTmpPK other = (MrchLocFnXrefTmpPK) object;
        if ((this.siteId == null && other.siteId != null) || (this.siteId != null && !this.siteId.equals(other.siteId))) {
            return false;
        }
        if ((this.locId == null && other.locId != null) || (this.locId != null && !this.locId.equals(other.locId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.MrchLocFnXrefTmpPK[ siteId=" + siteId + ", locId=" + locId + " ]";
    }

}
