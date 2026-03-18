package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "BLNG_TYP_DESC", catalog = "", schema = "DBO")
public class BlngTypDesc implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "BLNG_TRNS_ID")
    private Integer blngTrnsId;
    @Basic(optional = false)
    @Column(name = "BLNG_TRNS_DESC")
    private String blngTrnsDesc;
    @Basic(optional = false)
    @Column(name = "BLNG_TRNS_CATG")
    private String blngTrnsCatg;
    @Basic(optional = false)
    @Column(name = "BLNG_TRNS_AMT_SIGN")
    private short blngTrnsAmtSign;
    @Basic(optional = false)
    @Column(name = "BLNG_TRNS_SORT")
    private int blngTrnsSort;
    @Basic(optional = false)
    @Column(name = "CRT_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date crtTs;
    @Basic(optional = false)
    @Column(name = "CRT_USR")
    private String crtUsr;
    @Basic(optional = false)
    @Column(name = "MDY_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date mdyTs;
    @Basic(optional = false)
    @Column(name = "MDY_USR")
    private String mdyUsr;

    public BlngTypDesc() {
    }

    public BlngTypDesc(Integer blngTrnsId) {
        this.blngTrnsId = blngTrnsId;
    }

    public BlngTypDesc(Integer blngTrnsId, String blngTrnsDesc, String blngTrnsCatg, short blngTrnsAmtSign, int blngTrnsSort, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.blngTrnsId = blngTrnsId;
        this.blngTrnsDesc = blngTrnsDesc;
        this.blngTrnsCatg = blngTrnsCatg;
        this.blngTrnsAmtSign = blngTrnsAmtSign;
        this.blngTrnsSort = blngTrnsSort;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public Integer getBlngTrnsId() {
        return blngTrnsId;
    }

    public void setBlngTrnsId(Integer blngTrnsId) {
        this.blngTrnsId = blngTrnsId;
    }

    public String getBlngTrnsDesc() {
        return blngTrnsDesc;
    }

    public void setBlngTrnsDesc(String blngTrnsDesc) {
        this.blngTrnsDesc = blngTrnsDesc;
    }

    public String getBlngTrnsCatg() {
        return blngTrnsCatg;
    }

    public void setBlngTrnsCatg(String blngTrnsCatg) {
        this.blngTrnsCatg = blngTrnsCatg;
    }

    public short getBlngTrnsAmtSign() {
        return blngTrnsAmtSign;
    }

    public void setBlngTrnsAmtSign(short blngTrnsAmtSign) {
        this.blngTrnsAmtSign = blngTrnsAmtSign;
    }

    public int getBlngTrnsSort() {
        return blngTrnsSort;
    }

    public void setBlngTrnsSort(int blngTrnsSort) {
        this.blngTrnsSort = blngTrnsSort;
    }

    public Date getCrtTs() {
        return crtTs;
    }

    public void setCrtTs(Date crtTs) {
        this.crtTs = crtTs;
    }

    public String getCrtUsr() {
        return crtUsr;
    }

    public void setCrtUsr(String crtUsr) {
        this.crtUsr = crtUsr;
    }

    public Date getMdyTs() {
        return mdyTs;
    }

    public void setMdyTs(Date mdyTs) {
        this.mdyTs = mdyTs;
    }

    public String getMdyUsr() {
        return mdyUsr;
    }

    public void setMdyUsr(String mdyUsr) {
        this.mdyUsr = mdyUsr;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (blngTrnsId != null ? blngTrnsId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof BlngTypDesc)) {
            return false;
        }
        BlngTypDesc other = (BlngTypDesc) object;
        if ((this.blngTrnsId == null && other.blngTrnsId != null) || (this.blngTrnsId != null && !this.blngTrnsId.equals(other.blngTrnsId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.BlngTypDesc[ blngTrnsId=" + blngTrnsId + " ]";
    }

}
