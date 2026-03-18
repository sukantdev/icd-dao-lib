package com.corpay.dao.cxxcow;

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
@Table(name = "MCC_EXCEPTION", catalog = "", schema = "CXXCOW")
public class MccException implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "MCE_LOC_NM")
    private String mceLocNm;
    @Basic(optional = false)
    @Column(name = "MCE_ALLOW_CONV_FLG")
    private Character mceAllowConvFlg;
    @Basic(optional = false)
    @Column(name = "MCE_MCC")
    private String mceMcc;
    @Basic(optional = false)
    @Column(name = "MCE_DT_ENTERED")
    @Temporal(TemporalType.DATE)
    private Date mceDtEntered;
    @Basic(optional = false)
    @Column(name = "MCE_DT_ACTIVATED")
    @Temporal(TemporalType.DATE)
    private Date mceDtActivated;
    @Basic(optional = false)
    @Column(name = "MCE_ACTIVATED_BY")
    private String mceActivatedBy;
    @Basic(optional = false)
    @Column(name = "MCE_LAST_TRAN_DT")
    @Temporal(TemporalType.DATE)
    private Date mceLastTranDt;

    public MccException() {
    }

    public MccException(String mceLocNm) {
        this.mceLocNm = mceLocNm;
    }

    public MccException(String mceLocNm, Character mceAllowConvFlg, String mceMcc, Date mceDtEntered, Date mceDtActivated, String mceActivatedBy, Date mceLastTranDt) {
        this.mceLocNm = mceLocNm;
        this.mceAllowConvFlg = mceAllowConvFlg;
        this.mceMcc = mceMcc;
        this.mceDtEntered = mceDtEntered;
        this.mceDtActivated = mceDtActivated;
        this.mceActivatedBy = mceActivatedBy;
        this.mceLastTranDt = mceLastTranDt;
    }

    public String getMceLocNm() {
        return mceLocNm;
    }

    public void setMceLocNm(String mceLocNm) {
        this.mceLocNm = mceLocNm;
    }

    public Character getMceAllowConvFlg() {
        return mceAllowConvFlg;
    }

    public void setMceAllowConvFlg(Character mceAllowConvFlg) {
        this.mceAllowConvFlg = mceAllowConvFlg;
    }

    public String getMceMcc() {
        return mceMcc;
    }

    public void setMceMcc(String mceMcc) {
        this.mceMcc = mceMcc;
    }

    public Date getMceDtEntered() {
        return mceDtEntered;
    }

    public void setMceDtEntered(Date mceDtEntered) {
        this.mceDtEntered = mceDtEntered;
    }

    public Date getMceDtActivated() {
        return mceDtActivated;
    }

    public void setMceDtActivated(Date mceDtActivated) {
        this.mceDtActivated = mceDtActivated;
    }

    public String getMceActivatedBy() {
        return mceActivatedBy;
    }

    public void setMceActivatedBy(String mceActivatedBy) {
        this.mceActivatedBy = mceActivatedBy;
    }

    public Date getMceLastTranDt() {
        return mceLastTranDt;
    }

    public void setMceLastTranDt(Date mceLastTranDt) {
        this.mceLastTranDt = mceLastTranDt;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mceLocNm != null ? mceLocNm.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof MccException)) {
            return false;
        }
        MccException other = (MccException) object;
        if ((this.mceLocNm == null && other.mceLocNm != null) || (this.mceLocNm != null && !this.mceLocNm.equals(other.mceLocNm))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.cxxcow.MccException[ mceLocNm=" + mceLocNm + " ]";
    }

}
