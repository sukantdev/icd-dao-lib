/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Sukant.Tiwari
 */
@Embeddable
public class TeleNotiPingXrefPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "ACCT_CD")
    private String acctCd;
    @Basic(optional = false)
    @Column(name = "CUST_ID")
    private String custId;
    @Basic(optional = false)
    @Column(name = "TRANS_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date transTs;
    @Basic(optional = false)
    @Column(name = "UNIT_NBR")
    private String unitNbr;
    @Basic(optional = false)
    @Column(name = "CDN_RECV_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date cdnRecvTs;

    public TeleNotiPingXrefPK() {
    }

    public TeleNotiPingXrefPK(String acctCd, String custId, Date transTs, String unitNbr, Date cdnRecvTs) {
        this.acctCd = acctCd;
        this.custId = custId;
        this.transTs = transTs;
        this.unitNbr = unitNbr;
        this.cdnRecvTs = cdnRecvTs;
    }

    public String getAcctCd() {
        return acctCd;
    }

    public void setAcctCd(String acctCd) {
        this.acctCd = acctCd;
    }

    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId;
    }

    public Date getTransTs() {
        return transTs;
    }

    public void setTransTs(Date transTs) {
        this.transTs = transTs;
    }

    public String getUnitNbr() {
        return unitNbr;
    }

    public void setUnitNbr(String unitNbr) {
        this.unitNbr = unitNbr;
    }

    public Date getCdnRecvTs() {
        return cdnRecvTs;
    }

    public void setCdnRecvTs(Date cdnRecvTs) {
        this.cdnRecvTs = cdnRecvTs;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (acctCd != null ? acctCd.hashCode() : 0);
        hash += (custId != null ? custId.hashCode() : 0);
        hash += (transTs != null ? transTs.hashCode() : 0);
        hash += (unitNbr != null ? unitNbr.hashCode() : 0);
        hash += (cdnRecvTs != null ? cdnRecvTs.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TeleNotiPingXrefPK)) {
            return false;
        }
        TeleNotiPingXrefPK other = (TeleNotiPingXrefPK) object;
        if ((this.acctCd == null && other.acctCd != null) || (this.acctCd != null && !this.acctCd.equals(other.acctCd))) {
            return false;
        }
        if ((this.custId == null && other.custId != null) || (this.custId != null && !this.custId.equals(other.custId))) {
            return false;
        }
        if ((this.transTs == null && other.transTs != null) || (this.transTs != null && !this.transTs.equals(other.transTs))) {
            return false;
        }
        if ((this.unitNbr == null && other.unitNbr != null) || (this.unitNbr != null && !this.unitNbr.equals(other.unitNbr))) {
            return false;
        }
        if ((this.cdnRecvTs == null && other.cdnRecvTs != null) || (this.cdnRecvTs != null && !this.cdnRecvTs.equals(other.cdnRecvTs))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.TeleNotiPingXrefPK[ acctCd=" + acctCd + ", custId=" + custId + ", transTs=" + transTs + ", unitNbr=" + unitNbr + ", cdnRecvTs=" + cdnRecvTs + " ]";
    }
    
}
