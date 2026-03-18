package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class CrdVinPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "CRD_TKN_NBR")
    private String crdTknNbr;
    @Basic(optional = false)
    @Column(name = "VIN")
    private String vin;

    public CrdVinPK() {
    }

    public CrdVinPK(String crdTknNbr, String vin) {
        this.crdTknNbr = crdTknNbr;
        this.vin = vin;
    }

    public String getCrdTknNbr() {
        return crdTknNbr;
    }

    public void setCrdTknNbr(String crdTknNbr) {
        this.crdTknNbr = crdTknNbr;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (crdTknNbr != null ? crdTknNbr.hashCode() : 0);
        hash += (vin != null ? vin.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof CrdVinPK)) {
            return false;
        }
        CrdVinPK other = (CrdVinPK) object;
        if ((this.crdTknNbr == null && other.crdTknNbr != null) || (this.crdTknNbr != null && !this.crdTknNbr.equals(other.crdTknNbr))) {
            return false;
        }
        if ((this.vin == null && other.vin != null) || (this.vin != null && !this.vin.equals(other.vin))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.CrdVinPK[ crdTknNbr=" + crdTknNbr + ", vin=" + vin + " ]";
    }

}
