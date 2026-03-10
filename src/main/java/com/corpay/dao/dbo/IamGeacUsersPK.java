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
public class IamGeacUsersPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "USR_ID")
    private int usrId;
    @Basic(optional = false)
    @Column(name = "ROLE_CD")
    private String roleCd;

    public IamGeacUsersPK() {
    }

    public IamGeacUsersPK(int usrId, String roleCd) {
        this.usrId = usrId;
        this.roleCd = roleCd;
    }

    public int getUsrId() {
        return usrId;
    }

    public void setUsrId(int usrId) {
        this.usrId = usrId;
    }

    public String getRoleCd() {
        return roleCd;
    }

    public void setRoleCd(String roleCd) {
        this.roleCd = roleCd;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) usrId;
        hash += (roleCd != null ? roleCd.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof IamGeacUsersPK)) {
            return false;
        }
        IamGeacUsersPK other = (IamGeacUsersPK) object;
        if (this.usrId != other.usrId) {
            return false;
        }
        if ((this.roleCd == null && other.roleCd != null) || (this.roleCd != null && !this.roleCd.equals(other.roleCd))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.IamGeacUsersPK[ usrId=" + usrId + ", roleCd=" + roleCd + " ]";
    }
    
}
