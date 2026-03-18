package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

@Embeddable
public class ScProductPriceHstPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "STATION_CD")
    private String stationCd;
    @Basic(optional = false)
    @Column(name = "PROD_CD")
    private String prodCd;
    @Basic(optional = false)
    @Column(name = "TRNS_DT")
    @Temporal(TemporalType.DATE)
    private Date trnsDt;
    @Basic(optional = false)
    @Column(name = "TRNS_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date trnsTs;

    public ScProductPriceHstPK() {
    }

    public ScProductPriceHstPK(String stationCd, String prodCd, Date trnsDt, Date trnsTs) {
        this.stationCd = stationCd;
        this.prodCd = prodCd;
        this.trnsDt = trnsDt;
        this.trnsTs = trnsTs;
    }

    public String getStationCd() {
        return stationCd;
    }

    public void setStationCd(String stationCd) {
        this.stationCd = stationCd;
    }

    public String getProdCd() {
        return prodCd;
    }

    public void setProdCd(String prodCd) {
        this.prodCd = prodCd;
    }

    public Date getTrnsDt() {
        return trnsDt;
    }

    public void setTrnsDt(Date trnsDt) {
        this.trnsDt = trnsDt;
    }

    public Date getTrnsTs() {
        return trnsTs;
    }

    public void setTrnsTs(Date trnsTs) {
        this.trnsTs = trnsTs;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (stationCd != null ? stationCd.hashCode() : 0);
        hash += (prodCd != null ? prodCd.hashCode() : 0);
        hash += (trnsDt != null ? trnsDt.hashCode() : 0);
        hash += (trnsTs != null ? trnsTs.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof ScProductPriceHstPK)) {
            return false;
        }
        ScProductPriceHstPK other = (ScProductPriceHstPK) object;
        if ((this.stationCd == null && other.stationCd != null) || (this.stationCd != null && !this.stationCd.equals(other.stationCd))) {
            return false;
        }
        if ((this.prodCd == null && other.prodCd != null) || (this.prodCd != null && !this.prodCd.equals(other.prodCd))) {
            return false;
        }
        if ((this.trnsDt == null && other.trnsDt != null) || (this.trnsDt != null && !this.trnsDt.equals(other.trnsDt))) {
            return false;
        }
        if ((this.trnsTs == null && other.trnsTs != null) || (this.trnsTs != null && !this.trnsTs.equals(other.trnsTs))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.ScProductPriceHstPK[ stationCd=" + stationCd + ", prodCd=" + prodCd + ", trnsDt=" + trnsDt + ", trnsTs=" + trnsTs + " ]";
    }

}
