package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class AvnTrnsAuthRespPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "TRNS_TRKG_NBR")
    private int trnsTrkgNbr;
    @Basic(optional = false)
    @Column(name = "CTL_NBR")
    private String ctlNbr;

    public AvnTrnsAuthRespPK() {
    }

    public AvnTrnsAuthRespPK(int trnsTrkgNbr, String ctlNbr) {
        this.trnsTrkgNbr = trnsTrkgNbr;
        this.ctlNbr = ctlNbr;
    }

    public int getTrnsTrkgNbr() {
        return trnsTrkgNbr;
    }

    public void setTrnsTrkgNbr(int trnsTrkgNbr) {
        this.trnsTrkgNbr = trnsTrkgNbr;
    }

    public String getCtlNbr() {
        return ctlNbr;
    }

    public void setCtlNbr(String ctlNbr) {
        this.ctlNbr = ctlNbr;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) trnsTrkgNbr;
        hash += (ctlNbr != null ? ctlNbr.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof AvnTrnsAuthRespPK)) {
            return false;
        }
        AvnTrnsAuthRespPK other = (AvnTrnsAuthRespPK) object;
        if (this.trnsTrkgNbr != other.trnsTrkgNbr) {
            return false;
        }
        if ((this.ctlNbr == null && other.ctlNbr != null) || (this.ctlNbr != null && !this.ctlNbr.equals(other.ctlNbr))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.AvnTrnsAuthRespPK[ trnsTrkgNbr=" + trnsTrkgNbr + ", ctlNbr=" + ctlNbr + " ]";
    }

}
