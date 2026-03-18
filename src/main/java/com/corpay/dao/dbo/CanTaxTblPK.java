package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

@Embeddable
public class CanTaxTblPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "CAN_EFCTV_DT")
    @Temporal(TemporalType.DATE)
    private Date canEfctvDt;
    @Basic(optional = false)
    @Column(name = "CAN_TAX_PRVNC_CD")
    private String canTaxPrvncCd;
    @Basic(optional = false)
    @Column(name = "CAN_TAX_PRD_CD")
    private String canTaxPrdCd;
    @Basic(optional = false)
    @Column(name = "CAN_TAX_MCC_GRP_CD")
    private String canTaxMccGrpCd;
    @Basic(optional = false)
    @Column(name = "CAN_TAX_RT_CD")
    private Character canTaxRtCd;

    public CanTaxTblPK() {
    }

    public CanTaxTblPK(Date canEfctvDt, String canTaxPrvncCd, String canTaxPrdCd, String canTaxMccGrpCd, Character canTaxRtCd) {
        this.canEfctvDt = canEfctvDt;
        this.canTaxPrvncCd = canTaxPrvncCd;
        this.canTaxPrdCd = canTaxPrdCd;
        this.canTaxMccGrpCd = canTaxMccGrpCd;
        this.canTaxRtCd = canTaxRtCd;
    }

    public Date getCanEfctvDt() {
        return canEfctvDt;
    }

    public void setCanEfctvDt(Date canEfctvDt) {
        this.canEfctvDt = canEfctvDt;
    }

    public String getCanTaxPrvncCd() {
        return canTaxPrvncCd;
    }

    public void setCanTaxPrvncCd(String canTaxPrvncCd) {
        this.canTaxPrvncCd = canTaxPrvncCd;
    }

    public String getCanTaxPrdCd() {
        return canTaxPrdCd;
    }

    public void setCanTaxPrdCd(String canTaxPrdCd) {
        this.canTaxPrdCd = canTaxPrdCd;
    }

    public String getCanTaxMccGrpCd() {
        return canTaxMccGrpCd;
    }

    public void setCanTaxMccGrpCd(String canTaxMccGrpCd) {
        this.canTaxMccGrpCd = canTaxMccGrpCd;
    }

    public Character getCanTaxRtCd() {
        return canTaxRtCd;
    }

    public void setCanTaxRtCd(Character canTaxRtCd) {
        this.canTaxRtCd = canTaxRtCd;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (canEfctvDt != null ? canEfctvDt.hashCode() : 0);
        hash += (canTaxPrvncCd != null ? canTaxPrvncCd.hashCode() : 0);
        hash += (canTaxPrdCd != null ? canTaxPrdCd.hashCode() : 0);
        hash += (canTaxMccGrpCd != null ? canTaxMccGrpCd.hashCode() : 0);
        hash += (canTaxRtCd != null ? canTaxRtCd.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof CanTaxTblPK)) {
            return false;
        }
        CanTaxTblPK other = (CanTaxTblPK) object;
        if ((this.canEfctvDt == null && other.canEfctvDt != null) || (this.canEfctvDt != null && !this.canEfctvDt.equals(other.canEfctvDt))) {
            return false;
        }
        if ((this.canTaxPrvncCd == null && other.canTaxPrvncCd != null) || (this.canTaxPrvncCd != null && !this.canTaxPrvncCd.equals(other.canTaxPrvncCd))) {
            return false;
        }
        if ((this.canTaxPrdCd == null && other.canTaxPrdCd != null) || (this.canTaxPrdCd != null && !this.canTaxPrdCd.equals(other.canTaxPrdCd))) {
            return false;
        }
        if ((this.canTaxMccGrpCd == null && other.canTaxMccGrpCd != null) || (this.canTaxMccGrpCd != null && !this.canTaxMccGrpCd.equals(other.canTaxMccGrpCd))) {
            return false;
        }
        if ((this.canTaxRtCd == null && other.canTaxRtCd != null) || (this.canTaxRtCd != null && !this.canTaxRtCd.equals(other.canTaxRtCd))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.CanTaxTblPK[ canEfctvDt=" + canEfctvDt + ", canTaxPrvncCd=" + canTaxPrvncCd + ", canTaxPrdCd=" + canTaxPrdCd + ", canTaxMccGrpCd=" + canTaxMccGrpCd + ", canTaxRtCd=" + canTaxRtCd + " ]";
    }

}
