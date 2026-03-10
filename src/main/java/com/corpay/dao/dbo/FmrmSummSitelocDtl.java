/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Sukant.Tiwari
 */
@Entity
@Table(name = "FMRM_SUMM_SITELOC_DTL", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "FmrmSummSitelocDtl.findAll", query = "SELECT f FROM FmrmSummSitelocDtl f")})
public class FmrmSummSitelocDtl implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected FmrmSummSitelocDtlPK fmrmSummSitelocDtlPK;
    @Basic(optional = false)
    @Column(name = "LMTD_NETW_FLG")
    private Character lmtdNetwFlg;
    @Basic(optional = false)
    @Column(name = "LOC_RECOMD_FLG")
    private Character locRecomdFlg;
    @Basic(optional = false)
    @Column(name = "CRT_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date crtTs;

    public FmrmSummSitelocDtl() {
    }

    public FmrmSummSitelocDtl(FmrmSummSitelocDtlPK fmrmSummSitelocDtlPK) {
        this.fmrmSummSitelocDtlPK = fmrmSummSitelocDtlPK;
    }

    public FmrmSummSitelocDtl(FmrmSummSitelocDtlPK fmrmSummSitelocDtlPK, Character lmtdNetwFlg, Character locRecomdFlg, Date crtTs) {
        this.fmrmSummSitelocDtlPK = fmrmSummSitelocDtlPK;
        this.lmtdNetwFlg = lmtdNetwFlg;
        this.locRecomdFlg = locRecomdFlg;
        this.crtTs = crtTs;
    }

    public FmrmSummSitelocDtl(String custId, String locCd) {
        this.fmrmSummSitelocDtlPK = new FmrmSummSitelocDtlPK(custId, locCd);
    }

    public FmrmSummSitelocDtlPK getFmrmSummSitelocDtlPK() {
        return fmrmSummSitelocDtlPK;
    }

    public void setFmrmSummSitelocDtlPK(FmrmSummSitelocDtlPK fmrmSummSitelocDtlPK) {
        this.fmrmSummSitelocDtlPK = fmrmSummSitelocDtlPK;
    }

    public Character getLmtdNetwFlg() {
        return lmtdNetwFlg;
    }

    public void setLmtdNetwFlg(Character lmtdNetwFlg) {
        this.lmtdNetwFlg = lmtdNetwFlg;
    }

    public Character getLocRecomdFlg() {
        return locRecomdFlg;
    }

    public void setLocRecomdFlg(Character locRecomdFlg) {
        this.locRecomdFlg = locRecomdFlg;
    }

    public Date getCrtTs() {
        return crtTs;
    }

    public void setCrtTs(Date crtTs) {
        this.crtTs = crtTs;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (fmrmSummSitelocDtlPK != null ? fmrmSummSitelocDtlPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FmrmSummSitelocDtl)) {
            return false;
        }
        FmrmSummSitelocDtl other = (FmrmSummSitelocDtl) object;
        if ((this.fmrmSummSitelocDtlPK == null && other.fmrmSummSitelocDtlPK != null) || (this.fmrmSummSitelocDtlPK != null && !this.fmrmSummSitelocDtlPK.equals(other.fmrmSummSitelocDtlPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.FmrmSummSitelocDtl[ fmrmSummSitelocDtlPK=" + fmrmSummSitelocDtlPK + " ]";
    }
    
}
