package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

@Embeddable
public class FnPostProdPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "TRNS_DT")
    @Temporal(TemporalType.DATE)
    private Date trnsDt;
    @Basic(optional = false)
    @Column(name = "CTL_NBR")
    private int ctlNbr;
    @Basic(optional = false)
    @Column(name = "PROD_SEQ")
    private short prodSeq;

    public FnPostProdPK() {
    }

    public FnPostProdPK(Date trnsDt, int ctlNbr, short prodSeq) {
        this.trnsDt = trnsDt;
        this.ctlNbr = ctlNbr;
        this.prodSeq = prodSeq;
    }

    public Date getTrnsDt() {
        return trnsDt;
    }

    public void setTrnsDt(Date trnsDt) {
        this.trnsDt = trnsDt;
    }

    public int getCtlNbr() {
        return ctlNbr;
    }

    public void setCtlNbr(int ctlNbr) {
        this.ctlNbr = ctlNbr;
    }

    public short getProdSeq() {
        return prodSeq;
    }

    public void setProdSeq(short prodSeq) {
        this.prodSeq = prodSeq;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (trnsDt != null ? trnsDt.hashCode() : 0);
        hash += (int) ctlNbr;
        hash += (int) prodSeq;
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof FnPostProdPK)) {
            return false;
        }
        FnPostProdPK other = (FnPostProdPK) object;
        if ((this.trnsDt == null && other.trnsDt != null) || (this.trnsDt != null && !this.trnsDt.equals(other.trnsDt))) {
            return false;
        }
        if (this.ctlNbr != other.ctlNbr) {
            return false;
        }
        if (this.prodSeq != other.prodSeq) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.FnPostProdPK[ trnsDt=" + trnsDt + ", ctlNbr=" + ctlNbr + ", prodSeq=" + prodSeq + " ]";
    }

}
