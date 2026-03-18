package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

@Embeddable
public class McaPurchaseDetailPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "SERVICE_CENTER_CD")
    private String serviceCenterCd;
    @Basic(optional = false)
    @Column(name = "MCA_PURCHASE_NUM")
    private short mcaPurchaseNum;
    @Basic(optional = false)
    @Column(name = "MCA_DETAIL_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date mcaDetailTs;

    public McaPurchaseDetailPK() {
    }

    public McaPurchaseDetailPK(String serviceCenterCd, short mcaPurchaseNum, Date mcaDetailTs) {
        this.serviceCenterCd = serviceCenterCd;
        this.mcaPurchaseNum = mcaPurchaseNum;
        this.mcaDetailTs = mcaDetailTs;
    }

    public String getServiceCenterCd() {
        return serviceCenterCd;
    }

    public void setServiceCenterCd(String serviceCenterCd) {
        this.serviceCenterCd = serviceCenterCd;
    }

    public short getMcaPurchaseNum() {
        return mcaPurchaseNum;
    }

    public void setMcaPurchaseNum(short mcaPurchaseNum) {
        this.mcaPurchaseNum = mcaPurchaseNum;
    }

    public Date getMcaDetailTs() {
        return mcaDetailTs;
    }

    public void setMcaDetailTs(Date mcaDetailTs) {
        this.mcaDetailTs = mcaDetailTs;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (serviceCenterCd != null ? serviceCenterCd.hashCode() : 0);
        hash += (int) mcaPurchaseNum;
        hash += (mcaDetailTs != null ? mcaDetailTs.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof McaPurchaseDetailPK)) {
            return false;
        }
        McaPurchaseDetailPK other = (McaPurchaseDetailPK) object;
        if ((this.serviceCenterCd == null && other.serviceCenterCd != null) || (this.serviceCenterCd != null && !this.serviceCenterCd.equals(other.serviceCenterCd))) {
            return false;
        }
        if (this.mcaPurchaseNum != other.mcaPurchaseNum) {
            return false;
        }
        if ((this.mcaDetailTs == null && other.mcaDetailTs != null) || (this.mcaDetailTs != null && !this.mcaDetailTs.equals(other.mcaDetailTs))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.McaPurchaseDetailPK[ serviceCenterCd=" + serviceCenterCd + ", mcaPurchaseNum=" + mcaPurchaseNum + ", mcaDetailTs=" + mcaDetailTs + " ]";
    }

}
