package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class AreaCodesPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "AREA_CODE")
    private short areaCode;
    @Basic(optional = false)
    @Column(name = "EXCHANGE")
    private short exchange;
    @Basic(optional = false)
    @Column(name = "EXTENSION")
    private String extension;

    public AreaCodesPK() {
    }

    public AreaCodesPK(short areaCode, short exchange, String extension) {
        this.areaCode = areaCode;
        this.exchange = exchange;
        this.extension = extension;
    }

    public short getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(short areaCode) {
        this.areaCode = areaCode;
    }

    public short getExchange() {
        return exchange;
    }

    public void setExchange(short exchange) {
        this.exchange = exchange;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) areaCode;
        hash += (int) exchange;
        hash += (extension != null ? extension.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof AreaCodesPK)) {
            return false;
        }
        AreaCodesPK other = (AreaCodesPK) object;
        if (this.areaCode != other.areaCode) {
            return false;
        }
        if (this.exchange != other.exchange) {
            return false;
        }
        if ((this.extension == null && other.extension != null) || (this.extension != null && !this.extension.equals(other.extension))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.AreaCodesPK[ areaCode=" + areaCode + ", exchange=" + exchange + ", extension=" + extension + " ]";
    }

}
