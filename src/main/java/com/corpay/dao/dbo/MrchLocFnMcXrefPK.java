package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class MrchLocFnMcXrefPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "LOC_ID")
    private String locId;
    @Basic(optional = false)
    @Column(name = "SITE_ID")
    private String siteId;

    public MrchLocFnMcXrefPK() {
    }

    public MrchLocFnMcXrefPK(String locId, String siteId) {
        this.locId = locId;
        this.siteId = siteId;
    }

    public String getLocId() {
        return locId;
    }

    public void setLocId(String locId) {
        this.locId = locId;
    }

    public String getSiteId() {
        return siteId;
    }

    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (locId != null ? locId.hashCode() : 0);
        hash += (siteId != null ? siteId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof MrchLocFnMcXrefPK)) {
            return false;
        }
        MrchLocFnMcXrefPK other = (MrchLocFnMcXrefPK) object;
        if ((this.locId == null && other.locId != null) || (this.locId != null && !this.locId.equals(other.locId))) {
            return false;
        }
        if ((this.siteId == null && other.siteId != null) || (this.siteId != null && !this.siteId.equals(other.siteId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.MrchLocFnMcXrefPK[ locId=" + locId + ", siteId=" + siteId + " ]";
    }

}
