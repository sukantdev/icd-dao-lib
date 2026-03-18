package com.corpay.dao.cxxcow;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class CusttypeWsResourcesMappingTxnPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "CUST_TYPE_ID")
    private int custTypeId;
    @Basic(optional = false)
    @Column(name = "WEB_SVC_ID")
    private int webSvcId;

    public CusttypeWsResourcesMappingTxnPK() {
    }

    public CusttypeWsResourcesMappingTxnPK(int custTypeId, int webSvcId) {
        this.custTypeId = custTypeId;
        this.webSvcId = webSvcId;
    }

    public int getCustTypeId() {
        return custTypeId;
    }

    public void setCustTypeId(int custTypeId) {
        this.custTypeId = custTypeId;
    }

    public int getWebSvcId() {
        return webSvcId;
    }

    public void setWebSvcId(int webSvcId) {
        this.webSvcId = webSvcId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) custTypeId;
        hash += (int) webSvcId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof CusttypeWsResourcesMappingTxnPK)) {
            return false;
        }
        CusttypeWsResourcesMappingTxnPK other = (CusttypeWsResourcesMappingTxnPK) object;
        if (this.custTypeId != other.custTypeId) {
            return false;
        }
        if (this.webSvcId != other.webSvcId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.cxxcow.CusttypeWsResourcesMappingTxnPK[ custTypeId=" + custTypeId + ", webSvcId=" + webSvcId + " ]";
    }

}
