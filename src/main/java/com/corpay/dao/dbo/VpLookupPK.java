package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class VpLookupPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "LOOKUP_TYP")
    private String lookupTyp;
    @Basic(optional = false)
    @Column(name = "LOOKUP_ID")
    private int lookupId;

    public VpLookupPK() {
    }

    public VpLookupPK(String lookupTyp, int lookupId) {
        this.lookupTyp = lookupTyp;
        this.lookupId = lookupId;
    }

    public String getLookupTyp() {
        return lookupTyp;
    }

    public void setLookupTyp(String lookupTyp) {
        this.lookupTyp = lookupTyp;
    }

    public int getLookupId() {
        return lookupId;
    }

    public void setLookupId(int lookupId) {
        this.lookupId = lookupId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lookupTyp != null ? lookupTyp.hashCode() : 0);
        hash += (int) lookupId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof VpLookupPK)) {
            return false;
        }
        VpLookupPK other = (VpLookupPK) object;
        if ((this.lookupTyp == null && other.lookupTyp != null) || (this.lookupTyp != null && !this.lookupTyp.equals(other.lookupTyp))) {
            return false;
        }
        if (this.lookupId != other.lookupId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.VpLookupPK[ lookupTyp=" + lookupTyp + ", lookupId=" + lookupId + " ]";
    }

}
