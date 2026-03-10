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
public class RetMinusDiscPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "CUST_ID")
    private String custId;
    @Basic(optional = false)
    @Column(name = "LOC_CD")
    private String locCd;
    @Basic(optional = false)
    @Column(name = "DISC_PRD_CD")
    private String discPrdCd;
    @Basic(optional = false)
    @Column(name = "DISC_EFFCTV_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date discEffctvTs;
    @Basic(optional = false)
    @Column(name = "DISC_PRD_GRP_CD")
    private String discPrdGrpCd;
    @Basic(optional = false)
    @Column(name = "DIRECTBILL_FUNDED_FLG")
    private Character directbillFundedFlg;
    @Basic(optional = false)
    @Column(name = "DISC_SRC_CD")
    private Character discSrcCd;

    public RetMinusDiscPK() {
    }

    public RetMinusDiscPK(String custId, String locCd, String discPrdCd, Date discEffctvTs, String discPrdGrpCd, Character directbillFundedFlg, Character discSrcCd) {
        this.custId = custId;
        this.locCd = locCd;
        this.discPrdCd = discPrdCd;
        this.discEffctvTs = discEffctvTs;
        this.discPrdGrpCd = discPrdGrpCd;
        this.directbillFundedFlg = directbillFundedFlg;
        this.discSrcCd = discSrcCd;
    }

    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId;
    }

    public String getLocCd() {
        return locCd;
    }

    public void setLocCd(String locCd) {
        this.locCd = locCd;
    }

    public String getDiscPrdCd() {
        return discPrdCd;
    }

    public void setDiscPrdCd(String discPrdCd) {
        this.discPrdCd = discPrdCd;
    }

    public Date getDiscEffctvTs() {
        return discEffctvTs;
    }

    public void setDiscEffctvTs(Date discEffctvTs) {
        this.discEffctvTs = discEffctvTs;
    }

    public String getDiscPrdGrpCd() {
        return discPrdGrpCd;
    }

    public void setDiscPrdGrpCd(String discPrdGrpCd) {
        this.discPrdGrpCd = discPrdGrpCd;
    }

    public Character getDirectbillFundedFlg() {
        return directbillFundedFlg;
    }

    public void setDirectbillFundedFlg(Character directbillFundedFlg) {
        this.directbillFundedFlg = directbillFundedFlg;
    }

    public Character getDiscSrcCd() {
        return discSrcCd;
    }

    public void setDiscSrcCd(Character discSrcCd) {
        this.discSrcCd = discSrcCd;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (custId != null ? custId.hashCode() : 0);
        hash += (locCd != null ? locCd.hashCode() : 0);
        hash += (discPrdCd != null ? discPrdCd.hashCode() : 0);
        hash += (discEffctvTs != null ? discEffctvTs.hashCode() : 0);
        hash += (discPrdGrpCd != null ? discPrdGrpCd.hashCode() : 0);
        hash += (directbillFundedFlg != null ? directbillFundedFlg.hashCode() : 0);
        hash += (discSrcCd != null ? discSrcCd.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RetMinusDiscPK)) {
            return false;
        }
        RetMinusDiscPK other = (RetMinusDiscPK) object;
        if ((this.custId == null && other.custId != null) || (this.custId != null && !this.custId.equals(other.custId))) {
            return false;
        }
        if ((this.locCd == null && other.locCd != null) || (this.locCd != null && !this.locCd.equals(other.locCd))) {
            return false;
        }
        if ((this.discPrdCd == null && other.discPrdCd != null) || (this.discPrdCd != null && !this.discPrdCd.equals(other.discPrdCd))) {
            return false;
        }
        if ((this.discEffctvTs == null && other.discEffctvTs != null) || (this.discEffctvTs != null && !this.discEffctvTs.equals(other.discEffctvTs))) {
            return false;
        }
        if ((this.discPrdGrpCd == null && other.discPrdGrpCd != null) || (this.discPrdGrpCd != null && !this.discPrdGrpCd.equals(other.discPrdGrpCd))) {
            return false;
        }
        if ((this.directbillFundedFlg == null && other.directbillFundedFlg != null) || (this.directbillFundedFlg != null && !this.directbillFundedFlg.equals(other.directbillFundedFlg))) {
            return false;
        }
        if ((this.discSrcCd == null && other.discSrcCd != null) || (this.discSrcCd != null && !this.discSrcCd.equals(other.discSrcCd))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.RetMinusDiscPK[ custId=" + custId + ", locCd=" + locCd + ", discPrdCd=" + discPrdCd + ", discEffctvTs=" + discEffctvTs + ", discPrdGrpCd=" + discPrdGrpCd + ", directbillFundedFlg=" + directbillFundedFlg + ", discSrcCd=" + discSrcCd + " ]";
    }
    
}
