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
import java.io.Serializable;

/**
 *
 * @author Sukant.Tiwari
 */
@Entity
@Table(name = "ON_US_MERCH_XREF", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "OnUsMerchXref.findAll", query = "SELECT o FROM OnUsMerchXref o")})
public class OnUsMerchXref implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected OnUsMerchXrefPK onUsMerchXrefPK;
    @Basic(optional = false)
    @Column(name = "CRD_ACP_NM")
    private String crdAcpNm;
    @Basic(optional = false)
    @Column(name = "CRD_ACP_STR")
    private String crdAcpStr;
    @Basic(optional = false)
    @Column(name = "CRD_ACP_CTY")
    private String crdAcpCty;
    @Basic(optional = false)
    @Column(name = "CRD_ACP_ZIP")
    private String crdAcpZip;
    @Basic(optional = false)
    @Column(name = "CRD_ACP_ST")
    private String crdAcpSt;
    @Basic(optional = false)
    @Column(name = "CRD_ACP_CTRY")
    private String crdAcpCtry;

    public OnUsMerchXref() {
    }

    public OnUsMerchXref(OnUsMerchXrefPK onUsMerchXrefPK) {
        this.onUsMerchXrefPK = onUsMerchXrefPK;
    }

    public OnUsMerchXref(OnUsMerchXrefPK onUsMerchXrefPK, String crdAcpNm, String crdAcpStr, String crdAcpCty, String crdAcpZip, String crdAcpSt, String crdAcpCtry) {
        this.onUsMerchXrefPK = onUsMerchXrefPK;
        this.crdAcpNm = crdAcpNm;
        this.crdAcpStr = crdAcpStr;
        this.crdAcpCty = crdAcpCty;
        this.crdAcpZip = crdAcpZip;
        this.crdAcpSt = crdAcpSt;
        this.crdAcpCtry = crdAcpCtry;
    }

    public OnUsMerchXref(short oilCoBnm, String acqInstIdCd, String crdAcprId) {
        this.onUsMerchXrefPK = new OnUsMerchXrefPK(oilCoBnm, acqInstIdCd, crdAcprId);
    }

    public OnUsMerchXrefPK getOnUsMerchXrefPK() {
        return onUsMerchXrefPK;
    }

    public void setOnUsMerchXrefPK(OnUsMerchXrefPK onUsMerchXrefPK) {
        this.onUsMerchXrefPK = onUsMerchXrefPK;
    }

    public String getCrdAcpNm() {
        return crdAcpNm;
    }

    public void setCrdAcpNm(String crdAcpNm) {
        this.crdAcpNm = crdAcpNm;
    }

    public String getCrdAcpStr() {
        return crdAcpStr;
    }

    public void setCrdAcpStr(String crdAcpStr) {
        this.crdAcpStr = crdAcpStr;
    }

    public String getCrdAcpCty() {
        return crdAcpCty;
    }

    public void setCrdAcpCty(String crdAcpCty) {
        this.crdAcpCty = crdAcpCty;
    }

    public String getCrdAcpZip() {
        return crdAcpZip;
    }

    public void setCrdAcpZip(String crdAcpZip) {
        this.crdAcpZip = crdAcpZip;
    }

    public String getCrdAcpSt() {
        return crdAcpSt;
    }

    public void setCrdAcpSt(String crdAcpSt) {
        this.crdAcpSt = crdAcpSt;
    }

    public String getCrdAcpCtry() {
        return crdAcpCtry;
    }

    public void setCrdAcpCtry(String crdAcpCtry) {
        this.crdAcpCtry = crdAcpCtry;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (onUsMerchXrefPK != null ? onUsMerchXrefPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OnUsMerchXref)) {
            return false;
        }
        OnUsMerchXref other = (OnUsMerchXref) object;
        if ((this.onUsMerchXrefPK == null && other.onUsMerchXrefPK != null) || (this.onUsMerchXrefPK != null && !this.onUsMerchXrefPK.equals(other.onUsMerchXrefPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.OnUsMerchXref[ onUsMerchXrefPK=" + onUsMerchXrefPK + " ]";
    }
    
}
