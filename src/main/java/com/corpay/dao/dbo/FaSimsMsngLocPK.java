/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;

/**
 *
 * @author Sukant.Tiwari
 */
@Embeddable
public class FaSimsMsngLocPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "TRANS_ID")
    private long transId;
    @Basic(optional = false)
    @Column(name = "TRANS_DT")
    private long transDt;

    public FaSimsMsngLocPK() {
    }

    public FaSimsMsngLocPK(long transId, long transDt) {
        this.transId = transId;
        this.transDt = transDt;
    }

    public long getTransId() {
        return transId;
    }

    public void setTransId(long transId) {
        this.transId = transId;
    }

    public long getTransDt() {
        return transDt;
    }

    public void setTransDt(long transDt) {
        this.transDt = transDt;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) transId;
        hash += (int) transDt;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FaSimsMsngLocPK)) {
            return false;
        }
        FaSimsMsngLocPK other = (FaSimsMsngLocPK) object;
        if (this.transId != other.transId) {
            return false;
        }
        if (this.transDt != other.transDt) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.FaSimsMsngLocPK[ transId=" + transId + ", transDt=" + transDt + " ]";
    }
    
}
