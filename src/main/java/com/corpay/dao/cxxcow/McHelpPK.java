package com.corpay.dao.cxxcow;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class McHelpPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "U0000_FIELD_NR")
    private int u0000FieldNr;
    @Basic(optional = false)
    @Column(name = "U0001_FIELD_TYPE")
    private Character u0001FieldType;
    @Basic(optional = false)
    @Column(name = "U0002_FIELD_DESC")
    private String u0002FieldDesc;

    public McHelpPK() {
    }

    public McHelpPK(int u0000FieldNr, Character u0001FieldType, String u0002FieldDesc) {
        this.u0000FieldNr = u0000FieldNr;
        this.u0001FieldType = u0001FieldType;
        this.u0002FieldDesc = u0002FieldDesc;
    }

    public int getU0000FieldNr() {
        return u0000FieldNr;
    }

    public void setU0000FieldNr(int u0000FieldNr) {
        this.u0000FieldNr = u0000FieldNr;
    }

    public Character getU0001FieldType() {
        return u0001FieldType;
    }

    public void setU0001FieldType(Character u0001FieldType) {
        this.u0001FieldType = u0001FieldType;
    }

    public String getU0002FieldDesc() {
        return u0002FieldDesc;
    }

    public void setU0002FieldDesc(String u0002FieldDesc) {
        this.u0002FieldDesc = u0002FieldDesc;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) u0000FieldNr;
        hash += (u0001FieldType != null ? u0001FieldType.hashCode() : 0);
        hash += (u0002FieldDesc != null ? u0002FieldDesc.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof McHelpPK)) {
            return false;
        }
        McHelpPK other = (McHelpPK) object;
        if (this.u0000FieldNr != other.u0000FieldNr) {
            return false;
        }
        if ((this.u0001FieldType == null && other.u0001FieldType != null) || (this.u0001FieldType != null && !this.u0001FieldType.equals(other.u0001FieldType))) {
            return false;
        }
        if ((this.u0002FieldDesc == null && other.u0002FieldDesc != null) || (this.u0002FieldDesc != null && !this.u0002FieldDesc.equals(other.u0002FieldDesc))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.cxxcow.McHelpPK[ u0000FieldNr=" + u0000FieldNr + ", u0001FieldType=" + u0001FieldType + ", u0002FieldDesc=" + u0002FieldDesc + " ]";
    }

}
