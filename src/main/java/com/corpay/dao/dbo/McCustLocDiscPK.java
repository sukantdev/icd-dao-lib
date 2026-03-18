package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class McCustLocDiscPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "CUST_ID")
    private String custId;
    @Basic(optional = false)
    @Column(name = "ACQ_INST_ID_CD")
    private long acqInstIdCd;
    @Basic(optional = false)
    @Column(name = "ACPT_ID")
    private String acptId;
    @Basic(optional = false)
    @Column(name = "PROD_CD")
    private String prodCd;

    public McCustLocDiscPK() {
    }

    public McCustLocDiscPK(String custId, long acqInstIdCd, String acptId, String prodCd) {
        this.custId = custId;
        this.acqInstIdCd = acqInstIdCd;
        this.acptId = acptId;
        this.prodCd = prodCd;
    }

    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId;
    }

    public long getAcqInstIdCd() {
        return acqInstIdCd;
    }

    public void setAcqInstIdCd(long acqInstIdCd) {
        this.acqInstIdCd = acqInstIdCd;
    }

    public String getAcptId() {
        return acptId;
    }

    public void setAcptId(String acptId) {
        this.acptId = acptId;
    }

    public String getProdCd() {
        return prodCd;
    }

    public void setProdCd(String prodCd) {
        this.prodCd = prodCd;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (custId != null ? custId.hashCode() : 0);
        hash += (int) acqInstIdCd;
        hash += (acptId != null ? acptId.hashCode() : 0);
        hash += (prodCd != null ? prodCd.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof McCustLocDiscPK)) {
            return false;
        }
        McCustLocDiscPK other = (McCustLocDiscPK) object;
        if ((this.custId == null && other.custId != null) || (this.custId != null && !this.custId.equals(other.custId))) {
            return false;
        }
        if (this.acqInstIdCd != other.acqInstIdCd) {
            return false;
        }
        if ((this.acptId == null && other.acptId != null) || (this.acptId != null && !this.acptId.equals(other.acptId))) {
            return false;
        }
        if ((this.prodCd == null && other.prodCd != null) || (this.prodCd != null && !this.prodCd.equals(other.prodCd))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.McCustLocDiscPK[ custId=" + custId + ", acqInstIdCd=" + acqInstIdCd + ", acptId=" + acptId + ", prodCd=" + prodCd + " ]";
    }

}
