/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.corpay.dao.cxxcow;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;

/**
 *
 * @author Sukant.Tiwari
 */
@Embeddable
public class UserLoginPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "USER_ID")
    private String userId;
    @Basic(optional = false)
    @Column(name = "LOGIN_TYP_CD")
    private String loginTypCd;

    public UserLoginPK() {
    }

    public UserLoginPK(String userId, String loginTypCd) {
        this.userId = userId;
        this.loginTypCd = loginTypCd;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getLoginTypCd() {
        return loginTypCd;
    }

    public void setLoginTypCd(String loginTypCd) {
        this.loginTypCd = loginTypCd;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (userId != null ? userId.hashCode() : 0);
        hash += (loginTypCd != null ? loginTypCd.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UserLoginPK)) {
            return false;
        }
        UserLoginPK other = (UserLoginPK) object;
        if ((this.userId == null && other.userId != null) || (this.userId != null && !this.userId.equals(other.userId))) {
            return false;
        }
        if ((this.loginTypCd == null && other.loginTypCd != null) || (this.loginTypCd != null && !this.loginTypCd.equals(other.loginTypCd))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.cxxcow.UserLoginPK[ userId=" + userId + ", loginTypCd=" + loginTypCd + " ]";
    }
    
}
