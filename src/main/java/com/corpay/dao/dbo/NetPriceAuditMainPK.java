package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

@Embeddable
public class NetPriceAuditMainPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "ACCT_NBR")
    private String acctNbr;
    @Basic(optional = false)
    @Column(name = "EFFCTV_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date effctvTs;
    @Basic(optional = false)
    @Column(name = "PFID_CD")
    private String pfidCd;
    @Basic(optional = false)
    @Column(name = "LOC_CD")
    private String locCd;
    @Basic(optional = false)
    @Column(name = "PRD_CD")
    private String prdCd;
    @Basic(optional = false)
    @Column(name = "CUST_ID")
    private String custId;
    @Basic(optional = false)
    @Column(name = "NET_PRD_GRP")
    private String netPrdGrp;
    @Basic(optional = false)
    @Column(name = "FNDNG_RLTNSHP_CD")
    private Character fndngRltnshpCd;

    public NetPriceAuditMainPK() {
    }

    public NetPriceAuditMainPK(String acctNbr, Date effctvTs, String pfidCd, String locCd, String prdCd, String custId, String netPrdGrp, Character fndngRltnshpCd) {
        this.acctNbr = acctNbr;
        this.effctvTs = effctvTs;
        this.pfidCd = pfidCd;
        this.locCd = locCd;
        this.prdCd = prdCd;
        this.custId = custId;
        this.netPrdGrp = netPrdGrp;
        this.fndngRltnshpCd = fndngRltnshpCd;
    }

    public String getAcctNbr() {
        return acctNbr;
    }

    public void setAcctNbr(String acctNbr) {
        this.acctNbr = acctNbr;
    }

    public Date getEffctvTs() {
        return effctvTs;
    }

    public void setEffctvTs(Date effctvTs) {
        this.effctvTs = effctvTs;
    }

    public String getPfidCd() {
        return pfidCd;
    }

    public void setPfidCd(String pfidCd) {
        this.pfidCd = pfidCd;
    }

    public String getLocCd() {
        return locCd;
    }

    public void setLocCd(String locCd) {
        this.locCd = locCd;
    }

    public String getPrdCd() {
        return prdCd;
    }

    public void setPrdCd(String prdCd) {
        this.prdCd = prdCd;
    }

    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId;
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
        hash += (effctvTs != null ? effctvTs.hashCode() : 0);
        hash += (pfidCd != null ? pfidCd.hashCode() : 0);
        hash += (locCd != null ? locCd.hashCode() : 0);
        hash += (prdCd != null ? prdCd.hashCode() : 0);
        hash += (custId != null ? custId.hashCode() : 0);
        hash += (netPrdGrp != null ? netPrdGrp.hashCode() : 0);
        hash += (fndngRltnshpCd != null ? fndngRltnshpCd.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof NetPriceAuditMainPK)) {
            return false;
        }
        NetPriceAuditMainPK other = (NetPriceAuditMainPK) object;
        if ((this.acctNbr == null && other.acctNbr != null) || (this.acctNbr != null && !this.acctNbr.equals(other.acctNbr))) {
            return false;
        }
        if ((this.effctvTs == null && other.effctvTs != null) || (this.effctvTs != null && !this.effctvTs.equals(other.effctvTs))) {
            return false;
        }
        if ((this.pfidCd == null && other.pfidCd != null) || (this.pfidCd != null && !this.pfidCd.equals(other.pfidCd))) {
            return false;
        }
        if ((this.locCd == null && other.locCd != null) || (this.locCd != null && !this.locCd.equals(other.locCd))) {
            return false;
        }
        if ((this.prdCd == null && other.prdCd != null) || (this.prdCd != null && !this.prdCd.equals(other.prdCd))) {
            return false;
        }
        if ((this.custId == null && other.custId != null) || (this.custId != null && !this.custId.equals(other.custId))) {
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
        return "com.corpay.dao.dbo.NetPriceAuditMainPK[ acctNbr=" + acctNbr + ", effctvTs=" + effctvTs + ", pfidCd=" + pfidCd + ", locCd=" + locCd + ", prdCd=" + prdCd + ", custId=" + custId + ", netPrdGrp=" + netPrdGrp + ", fndngRltnshpCd=" + fndngRltnshpCd + " ]";
    }

}
