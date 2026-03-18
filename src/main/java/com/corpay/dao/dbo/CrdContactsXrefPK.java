package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class CrdContactsXrefPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "CRD_CONTACT_ID")
    private String crdContactId;
    @Basic(optional = false)
    @Column(name = "CRD_PREF_ID")
    private String crdPrefId;

    public CrdContactsXrefPK() {
    }

    public CrdContactsXrefPK(String crdContactId, String crdPrefId) {
        this.crdContactId = crdContactId;
        this.crdPrefId = crdPrefId;
    }

    public String getCrdContactId() {
        return crdContactId;
    }

    public void setCrdContactId(String crdContactId) {
        this.crdContactId = crdContactId;
    }

    public String getCrdPrefId() {
        return crdPrefId;
    }

    public void setCrdPrefId(String crdPrefId) {
        this.crdPrefId = crdPrefId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (crdContactId != null ? crdContactId.hashCode() : 0);
        hash += (crdPrefId != null ? crdPrefId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof CrdContactsXrefPK)) {
            return false;
        }
        CrdContactsXrefPK other = (CrdContactsXrefPK) object;
        if ((this.crdContactId == null && other.crdContactId != null) || (this.crdContactId != null && !this.crdContactId.equals(other.crdContactId))) {
            return false;
        }
        if ((this.crdPrefId == null && other.crdPrefId != null) || (this.crdPrefId != null && !this.crdPrefId.equals(other.crdPrefId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.CrdContactsXrefPK[ crdContactId=" + crdContactId + ", crdPrefId=" + crdPrefId + " ]";
    }

}
