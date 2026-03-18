package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class GcmsLocatPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "ACPTR_ID")
    private String acptrId;
    @Basic(optional = false)
    @Column(name = "FWD_ID")
    private String fwdId;
    @Basic(optional = false)
    @Column(name = "MKTR_ID")
    private String mktrId;

    public GcmsLocatPK() {
    }

    public GcmsLocatPK(String acptrId, String fwdId, String mktrId) {
        this.acptrId = acptrId;
        this.fwdId = fwdId;
        this.mktrId = mktrId;
    }

    public String getAcptrId() {
        return acptrId;
    }

    public void setAcptrId(String acptrId) {
        this.acptrId = acptrId;
    }

    public String getFwdId() {
        return fwdId;
    }

    public void setFwdId(String fwdId) {
        this.fwdId = fwdId;
    }

    public String getMktrId() {
        return mktrId;
    }

    public void setMktrId(String mktrId) {
        this.mktrId = mktrId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (acptrId != null ? acptrId.hashCode() : 0);
        hash += (fwdId != null ? fwdId.hashCode() : 0);
        hash += (mktrId != null ? mktrId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof GcmsLocatPK)) {
            return false;
        }
        GcmsLocatPK other = (GcmsLocatPK) object;
        if ((this.acptrId == null && other.acptrId != null) || (this.acptrId != null && !this.acptrId.equals(other.acptrId))) {
            return false;
        }
        if ((this.fwdId == null && other.fwdId != null) || (this.fwdId != null && !this.fwdId.equals(other.fwdId))) {
            return false;
        }
        if ((this.mktrId == null && other.mktrId != null) || (this.mktrId != null && !this.mktrId.equals(other.mktrId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.GcmsLocatPK[ acptrId=" + acptrId + ", fwdId=" + fwdId + ", mktrId=" + mktrId + " ]";
    }

}
