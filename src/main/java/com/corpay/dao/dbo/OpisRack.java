package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "OPIS_RACK", catalog = "", schema = "DBO")
public class OpisRack implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected OpisRackPK opisRackPK;
    @Basic(optional = false)
    @Column(name = "PADD")
    private Character padd;
    @Basic(optional = false)
    @Column(name = "SUB_PADD")
    private Character subPadd;
    @Basic(optional = false)
    @Column(name = "PRD_CD")
    private Character prdCd;
    @Basic(optional = false)
    @Column(name = "PRD_TYP_CD")
    private Character prdTypCd;
    @Basic(optional = false)
    @Column(name = "GRADE_CD")
    private String gradeCd;
    @Basic(optional = false)
    @Column(name = "SUPL_NM")
    private String suplNm;
    @Basic(optional = false)
    @Column(name = "CTY_NM")
    private String ctyNm;
    @Basic(optional = false)
    @Column(name = "ST_CD")
    private String stCd;

    @Basic(optional = false)
    @Column(name = "PRICE_AMT")
    private BigDecimal priceAmt;
    @Basic(optional = false)
    @Column(name = "CHANGE_AMT")
    private BigDecimal changeAmt;
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

    public OpisRack() {
    }

    public OpisRack(OpisRackPK opisRackPK) {
        this.opisRackPK = opisRackPK;
    }

    public OpisRack(OpisRackPK opisRackPK, Character padd, Character subPadd, Character prdCd, Character prdTypCd, String gradeCd, String suplNm, String ctyNm, String stCd, BigDecimal priceAmt, BigDecimal changeAmt, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.opisRackPK = opisRackPK;
        this.padd = padd;
        this.subPadd = subPadd;
        this.prdCd = prdCd;
        this.prdTypCd = prdTypCd;
        this.gradeCd = gradeCd;
        this.suplNm = suplNm;
        this.ctyNm = ctyNm;
        this.stCd = stCd;
        this.priceAmt = priceAmt;
        this.changeAmt = changeAmt;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public OpisRack(Date efctvTs, long opisNbr, String suplId) {
        this.opisRackPK = new OpisRackPK(efctvTs, opisNbr, suplId);
    }

    public OpisRackPK getOpisRackPK() {
        return opisRackPK;
    }

    public void setOpisRackPK(OpisRackPK opisRackPK) {
        this.opisRackPK = opisRackPK;
    }

    public Character getPadd() {
        return padd;
    }

    public void setPadd(Character padd) {
        this.padd = padd;
    }

    public Character getSubPadd() {
        return subPadd;
    }

    public void setSubPadd(Character subPadd) {
        this.subPadd = subPadd;
    }

    public Character getPrdCd() {
        return prdCd;
    }

    public void setPrdCd(Character prdCd) {
        this.prdCd = prdCd;
    }

    public Character getPrdTypCd() {
        return prdTypCd;
    }

    public void setPrdTypCd(Character prdTypCd) {
        this.prdTypCd = prdTypCd;
    }

    public String getGradeCd() {
        return gradeCd;
    }

    public void setGradeCd(String gradeCd) {
        this.gradeCd = gradeCd;
    }

    public String getSuplNm() {
        return suplNm;
    }

    public void setSuplNm(String suplNm) {
        this.suplNm = suplNm;
    }

    public String getCtyNm() {
        return ctyNm;
    }

    public void setCtyNm(String ctyNm) {
        this.ctyNm = ctyNm;
    }

    public String getStCd() {
        return stCd;
    }

    public void setStCd(String stCd) {
        this.stCd = stCd;
    }

    public BigDecimal getPriceAmt() {
        return priceAmt;
    }

    public void setPriceAmt(BigDecimal priceAmt) {
        this.priceAmt = priceAmt;
    }

    public BigDecimal getChangeAmt() {
        return changeAmt;
    }

    public void setChangeAmt(BigDecimal changeAmt) {
        this.changeAmt = changeAmt;
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
        hash += (opisRackPK != null ? opisRackPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof OpisRack)) {
            return false;
        }
        OpisRack other = (OpisRack) object;
        if ((this.opisRackPK == null && other.opisRackPK != null) || (this.opisRackPK != null && !this.opisRackPK.equals(other.opisRackPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.OpisRack[ opisRackPK=" + opisRackPK + " ]";
    }

}
