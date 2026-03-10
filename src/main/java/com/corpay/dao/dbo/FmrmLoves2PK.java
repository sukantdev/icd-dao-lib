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
public class FmrmLoves2PK implements Serializable {

    @Basic(optional = false)
    @Column(name = "ACCT_NBR")
    private String acctNbr;
    @Basic(optional = false)
    @Column(name = "LOC_CD")
    private String locCd;
    @Basic(optional = false)
    @Column(name = "CUST_ID")
    private String custId;
    @Basic(optional = false)
    @Column(name = "PRD_CD")
    private String prdCd;
    @Basic(optional = false)
    @Column(name = "EFFCTV_DT_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date effctvDtTs;
    @Basic(optional = false)
    @Column(name = "PFID_CD")
    private String pfidCd;
    @Basic(optional = false)
    @Column(name = "NET_PRD_GRP")
    private String netPrdGrp;
    @Basic(optional = false)
    @Column(name = "FNDNG_RLTNSHP_CD")
    private Character fndngRltnshpCd;

    public FmrmLoves2PK() {
    }

    public FmrmLoves2PK(String acctNbr, String locCd, String custId, String prdCd, Date effctvDtTs, String pfidCd, String netPrdGrp, Character fndngRltnshpCd) {
        this.acctNbr = acctNbr;
        this.locCd = locCd;
        this.custId = custId;
        this.prdCd = prdCd;
        this.effctvDtTs = effctvDtTs;
        this.pfidCd = pfidCd;
        this.netPrdGrp = netPrdGrp;
        this.fndngRltnshpCd = fndngRltnshpCd;
    }

    public String getAcctNbr() {
        return acctNbr;
    }

    public void setAcctNbr(String acctNbr) {
        this.acctNbr = acctNbr;
    }

    public String getLocCd() {
        return locCd;
    }

    public void setLocCd(String locCd) {
        this.locCd = locCd;
    }

    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId;
    }

    public String getPrdCd() {
        return prdCd;
    }

    public void setPrdCd(String prdCd) {
        this.prdCd = prdCd;
    }

    public Date getEffctvDtTs() {
        return effctvDtTs;
    }

    public void setEffctvDtTs(Date effctvDtTs) {
        this.effctvDtTs = effctvDtTs;
    }

    public String getPfidCd() {
        return pfidCd;
    }

    public void setPfidCd(String pfidCd) {
        this.pfidCd = pfidCd;
    }

    public String getNetPrdGrp() {
        return netPrdGrp;
    }

    public void setNetPrdGrp(String netPrdGrp) {
        this.netPrdGrp = netPrdGrp;
    }

    public Character getFndngRltnshpCd() {
        return fndngRltnshpCd;
    }

    public void setFndngRltnshpCd(Character fndngRltnshpCd) {
        this.fndngRltnshpCd = fndngRltnshpCd;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (acctNbr != null ? acctNbr.hashCode() : 0);
        hash += (locCd != null ? locCd.hashCode() : 0);
        hash += (custId != null ? custId.hashCode() : 0);
        hash += (prdCd != null ? prdCd.hashCode() : 0);
        hash += (effctvDtTs != null ? effctvDtTs.hashCode() : 0);
        hash += (pfidCd != null ? pfidCd.hashCode() : 0);
        hash += (netPrdGrp != null ? netPrdGrp.hashCode() : 0);
        hash += (fndngRltnshpCd != null ? fndngRltnshpCd.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FmrmLoves2PK)) {
            return false;
        }
        FmrmLoves2PK other = (FmrmLoves2PK) object;
        if ((this.acctNbr == null && other.acctNbr != null) || (this.acctNbr != null && !this.acctNbr.equals(other.acctNbr))) {
            return false;
        }
        if ((this.locCd == null && other.locCd != null) || (this.locCd != null && !this.locCd.equals(other.locCd))) {
            return false;
        }
        if ((this.custId == null && other.custId != null) || (this.custId != null && !this.custId.equals(other.custId))) {
            return false;
        }
        if ((this.prdCd == null && other.prdCd != null) || (this.prdCd != null && !this.prdCd.equals(other.prdCd))) {
            return false;
        }
        if ((this.effctvDtTs == null && other.effctvDtTs != null) || (this.effctvDtTs != null && !this.effctvDtTs.equals(other.effctvDtTs))) {
            return false;
        }
        if ((this.pfidCd == null && other.pfidCd != null) || (this.pfidCd != null && !this.pfidCd.equals(other.pfidCd))) {
            return false;
        }
        if ((this.netPrdGrp == null && other.netPrdGrp != null) || (this.netPrdGrp != null && !this.netPrdGrp.equals(other.netPrdGrp))) {
            return false;
        }
        if ((this.fndngRltnshpCd == null && other.fndngRltnshpCd != null) || (this.fndngRltnshpCd != null && !this.fndngRltnshpCd.equals(other.fndngRltnshpCd))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.FmrmLoves2PK[ acctNbr=" + acctNbr + ", locCd=" + locCd + ", custId=" + custId + ", prdCd=" + prdCd + ", effctvDtTs=" + effctvDtTs + ", pfidCd=" + pfidCd + ", netPrdGrp=" + netPrdGrp + ", fndngRltnshpCd=" + fndngRltnshpCd + " ]";
    }
    
}
