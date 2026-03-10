/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;

/**
 *
 * @author Sukant.Tiwari
 */
@Embeddable
public class PsCdnLocXrefPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "PS_SITE_ID")
    private String psSiteId;
    @Basic(optional = false)
    @Column(name = "CMD_SITE_ID")
    private String cmdSiteId;

    public PsCdnLocXrefPK() {
    }

    public PsCdnLocXrefPK(String psSiteId, String cmdSiteId) {
        this.psSiteId = psSiteId;
        this.cmdSiteId = cmdSiteId;
    }

    public String getPsSiteId() {
        return psSiteId;
    }

    public void setPsSiteId(String psSiteId) {
        this.psSiteId = psSiteId;
    }

    public String getCmdSiteId() {
        return cmdSiteId;
    }

    public void setCmdSiteId(String cmdSiteId) {
        this.cmdSiteId = cmdSiteId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (psSiteId != null ? psSiteId.hashCode() : 0);
        hash += (cmdSiteId != null ? cmdSiteId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PsCdnLocXrefPK)) {
            return false;
        }
        PsCdnLocXrefPK other = (PsCdnLocXrefPK) object;
        if ((this.psSiteId == null && other.psSiteId != null) || (this.psSiteId != null && !this.psSiteId.equals(other.psSiteId))) {
            return false;
        }
        if ((this.cmdSiteId == null && other.cmdSiteId != null) || (this.cmdSiteId != null && !this.cmdSiteId.equals(other.cmdSiteId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.PsCdnLocXrefPK[ psSiteId=" + psSiteId + ", cmdSiteId=" + cmdSiteId + " ]";
    }
    
}
