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
public class UsrChaincdXrefPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "USR_ID")
    private String usrId;
    @Basic(optional = false)
    @Column(name = "CHAIN_CD")
    private String chainCd;

    public UsrChaincdXrefPK() {
    }

    public UsrChaincdXrefPK(String usrId, String chainCd) {
        this.usrId = usrId;
        this.chainCd = chainCd;
    }

    public String getUsrId() {
        return usrId;
    }

    public void setUsrId(String usrId) {
        this.usrId = usrId;
    }

    public String getChainCd() {
        return chainCd;
    }

    public void setChainCd(String chainCd) {
        this.chainCd = chainCd;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (usrId != null ? usrId.hashCode() : 0);
        hash += (chainCd != null ? chainCd.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UsrChaincdXrefPK)) {
            return false;
        }
        UsrChaincdXrefPK other = (UsrChaincdXrefPK) object;
        if ((this.usrId == null && other.usrId != null) || (this.usrId != null && !this.usrId.equals(other.usrId))) {
            return false;
        }
        if ((this.chainCd == null && other.chainCd != null) || (this.chainCd != null && !this.chainCd.equals(other.chainCd))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.UsrChaincdXrefPK[ usrId=" + usrId + ", chainCd=" + chainCd + " ]";
    }
    
}
