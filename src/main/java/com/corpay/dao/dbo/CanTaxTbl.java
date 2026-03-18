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
@Table(name = "CAN_TAX_TBL", catalog = "", schema = "DBO")
public class CanTaxTbl implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CanTaxTblPK canTaxTblPK;
    @Basic(optional = false)
    @Column(name = "CAN_TAX_TYP_CD")
    private String canTaxTypCd;
    @Basic(optional = false)
    @Column(name = "CAN_TAX_ID")
    private String canTaxId;

    @Basic(optional = false)
    @Column(name = "CAN_TAX_RT_AMT")
    private BigDecimal canTaxRtAmt;
    @Basic(optional = false)
    @Column(name = "CAN_TAX_PRTY_CD")
    private Character canTaxPrtyCd;
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

    public CanTaxTbl() {
    }

    public CanTaxTbl(CanTaxTblPK canTaxTblPK) {
        this.canTaxTblPK = canTaxTblPK;
    }

    public CanTaxTbl(CanTaxTblPK canTaxTblPK, String canTaxTypCd, String canTaxId, BigDecimal canTaxRtAmt, Character canTaxPrtyCd, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.canTaxTblPK = canTaxTblPK;
        this.canTaxTypCd = canTaxTypCd;
        this.canTaxId = canTaxId;
        this.canTaxRtAmt = canTaxRtAmt;
        this.canTaxPrtyCd = canTaxPrtyCd;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public CanTaxTbl(Date canEfctvDt, String canTaxPrvncCd, String canTaxPrdCd, String canTaxMccGrpCd, Character canTaxRtCd) {
        this.canTaxTblPK = new CanTaxTblPK(canEfctvDt, canTaxPrvncCd, canTaxPrdCd, canTaxMccGrpCd, canTaxRtCd);
    }

    public CanTaxTblPK getCanTaxTblPK() {
        return canTaxTblPK;
    }

    public void setCanTaxTblPK(CanTaxTblPK canTaxTblPK) {
        this.canTaxTblPK = canTaxTblPK;
    }

    public String getCanTaxTypCd() {
        return canTaxTypCd;
    }

    public void setCanTaxTypCd(String canTaxTypCd) {
        this.canTaxTypCd = canTaxTypCd;
    }

    public String getCanTaxId() {
        return canTaxId;
    }

    public void setCanTaxId(String canTaxId) {
        this.canTaxId = canTaxId;
    }

    public BigDecimal getCanTaxRtAmt() {
        return canTaxRtAmt;
    }

    public void setCanTaxRtAmt(BigDecimal canTaxRtAmt) {
        this.canTaxRtAmt = canTaxRtAmt;
    }

    public Character getCanTaxPrtyCd() {
        return canTaxPrtyCd;
    }

    public void setCanTaxPrtyCd(Character canTaxPrtyCd) {
        this.canTaxPrtyCd = canTaxPrtyCd;
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
        hash += (canTaxTblPK != null ? canTaxTblPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof CanTaxTbl)) {
            return false;
        }
        CanTaxTbl other = (CanTaxTbl) object;
        if ((this.canTaxTblPK == null && other.canTaxTblPK != null) || (this.canTaxTblPK != null && !this.canTaxTblPK.equals(other.canTaxTblPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.CanTaxTbl[ canTaxTblPK=" + canTaxTblPK + " ]";
    }

}
