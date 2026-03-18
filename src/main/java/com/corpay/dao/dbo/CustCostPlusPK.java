package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

@Embeddable
public class CustCostPlusPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "CUST_TYP")
    private String custTyp;
    @Basic(optional = false)
    @Column(name = "CUST_ID")
    private String custId;
    @Basic(optional = false)
    @Column(name = "LOC_TYP")
    private String locTyp;
    @Basic(optional = false)
    @Column(name = "LOC_CD")
    private String locCd;
    @Basic(optional = false)
    @Column(name = "CUST_PRD")
    private String custPrd;
    @Basic(optional = false)
    @Column(name = "CUST_EFFCTV_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date custEffctvTs;
    @Basic(optional = false)
    @Column(name = "CUST_PRD_GRP")
    private String custPrdGrp;
    @Basic(optional = false)
    @Column(name = "DIRECTBILL_FUNDED_FLG")
    private Character directbillFundedFlg;
    @Basic(optional = false)
    @Column(name = "CUST_SRC")
    private Character custSrc;

    public CustCostPlusPK() {
    }

    public CustCostPlusPK(String custTyp, String custId, String locTyp, String locCd, String custPrd, Date custEffctvTs, String custPrdGrp, Character directbillFundedFlg, Character custSrc) {
        this.custTyp = custTyp;
        this.custId = custId;
        this.locTyp = locTyp;
        this.locCd = locCd;
        this.custPrd = custPrd;
        this.custEffctvTs = custEffctvTs;
        this.custPrdGrp = custPrdGrp;
        this.directbillFundedFlg = directbillFundedFlg;
        this.custSrc = custSrc;
    }

    public String getCustTyp() {
        return custTyp;
    }

    public void setCustTyp(String custTyp) {
        this.custTyp = custTyp;
    }

    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId;
    }

    public String getLocTyp() {
        return locTyp;
    }

    public void setLocTyp(String locTyp) {
        this.locTyp = locTyp;
    }

    public String getLocCd() {
        return locCd;
    }

    public void setLocCd(String locCd) {
        this.locCd = locCd;
    }

    public String getCustPrd() {
        return custPrd;
    }

    public void setCustPrd(String custPrd) {
        this.custPrd = custPrd;
    }

    public Date getCustEffctvTs() {
        return custEffctvTs;
    }

    public void setCustEffctvTs(Date custEffctvTs) {
        this.custEffctvTs = custEffctvTs;
    }

    public String getCustPrdGrp() {
        return custPrdGrp;
    }

    public void setCustPrdGrp(String custPrdGrp) {
        this.custPrdGrp = custPrdGrp;
    }

    public Character getDirectbillFundedFlg() {
        return directbillFundedFlg;
    }

    public void setDirectbillFundedFlg(Character directbillFundedFlg) {
        this.directbillFundedFlg = directbillFundedFlg;
    }

    public Character getCustSrc() {
        return custSrc;
    }

    public void setCustSrc(Character custSrc) {
        this.custSrc = custSrc;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (custTyp != null ? custTyp.hashCode() : 0);
        hash += (custId != null ? custId.hashCode() : 0);
        hash += (locTyp != null ? locTyp.hashCode() : 0);
        hash += (locCd != null ? locCd.hashCode() : 0);
        hash += (custPrd != null ? custPrd.hashCode() : 0);
        hash += (custEffctvTs != null ? custEffctvTs.hashCode() : 0);
        hash += (custPrdGrp != null ? custPrdGrp.hashCode() : 0);
        hash += (directbillFundedFlg != null ? directbillFundedFlg.hashCode() : 0);
        hash += (custSrc != null ? custSrc.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof CustCostPlusPK)) {
            return false;
        }
        CustCostPlusPK other = (CustCostPlusPK) object;
        if ((this.custTyp == null && other.custTyp != null) || (this.custTyp != null && !this.custTyp.equals(other.custTyp))) {
            return false;
        }
        if ((this.custId == null && other.custId != null) || (this.custId != null && !this.custId.equals(other.custId))) {
            return false;
        }
        if ((this.locTyp == null && other.locTyp != null) || (this.locTyp != null && !this.locTyp.equals(other.locTyp))) {
            return false;
        }
        if ((this.locCd == null && other.locCd != null) || (this.locCd != null && !this.locCd.equals(other.locCd))) {
            return false;
        }
        if ((this.custPrd == null && other.custPrd != null) || (this.custPrd != null && !this.custPrd.equals(other.custPrd))) {
            return false;
        }
        if ((this.custEffctvTs == null && other.custEffctvTs != null) || (this.custEffctvTs != null && !this.custEffctvTs.equals(other.custEffctvTs))) {
            return false;
        }
        if ((this.custPrdGrp == null && other.custPrdGrp != null) || (this.custPrdGrp != null && !this.custPrdGrp.equals(other.custPrdGrp))) {
            return false;
        }
        if ((this.directbillFundedFlg == null && other.directbillFundedFlg != null) || (this.directbillFundedFlg != null && !this.directbillFundedFlg.equals(other.directbillFundedFlg))) {
            return false;
        }
        if ((this.custSrc == null && other.custSrc != null) || (this.custSrc != null && !this.custSrc.equals(other.custSrc))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.CustCostPlusPK[ custTyp=" + custTyp + ", custId=" + custId + ", locTyp=" + locTyp + ", locCd=" + locCd + ", custPrd=" + custPrd + ", custEffctvTs=" + custEffctvTs + ", custPrdGrp=" + custPrdGrp + ", directbillFundedFlg=" + directbillFundedFlg + ", custSrc=" + custSrc + " ]";
    }

}
