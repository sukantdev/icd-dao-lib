package com.corpay.dao.cxxcow;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class ResourceApplPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "APRES_ID")
    private String apresId;
    @Basic(optional = false)
    @Column(name = "RSRC_ID")
    private String rsrcId;

    public ResourceApplPK() {
    }

    public ResourceApplPK(String apresId, String rsrcId) {
        this.apresId = apresId;
        this.rsrcId = rsrcId;
    }

    public String getApresId() {
        return apresId;
    }

    public void setApresId(String apresId) {
        this.apresId = apresId;
    }

    public String getRsrcId() {
        return rsrcId;
    }

    public void setRsrcId(String rsrcId) {
        this.rsrcId = rsrcId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (apresId != null ? apresId.hashCode() : 0);
        hash += (rsrcId != null ? rsrcId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof ResourceApplPK)) {
            return false;
        }
        ResourceApplPK other = (ResourceApplPK) object;
        if ((this.apresId == null && other.apresId != null) || (this.apresId != null && !this.apresId.equals(other.apresId))) {
            return false;
        }
        if ((this.rsrcId == null && other.rsrcId != null) || (this.rsrcId != null && !this.rsrcId.equals(other.rsrcId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.cxxcow.ResourceApplPK[ apresId=" + apresId + ", rsrcId=" + rsrcId + " ]";
    }

}
