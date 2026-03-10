/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.corpay.dao.cxxcow;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Sukant.Tiwari
 */
@Entity
@Table(name = "USER_DOWNLOAD", catalog = "", schema = "CXXCOW")
@NamedQueries({
    @NamedQuery(name = "UserDownload.findAll", query = "SELECT u FROM UserDownload u"),
    @NamedQuery(name = "UserDownload.findByUserId", query = "SELECT u FROM UserDownload u WHERE u.userDownloadPK.userId = :userId"),
    @NamedQuery(name = "UserDownload.findByRsrcId", query = "SELECT u FROM UserDownload u WHERE u.userDownloadPK.rsrcId = :rsrcId"),
    @NamedQuery(name = "UserDownload.findByUdUptDate", query = "SELECT u FROM UserDownload u WHERE u.userDownloadPK.udUptDate = :udUptDate")})
public class UserDownload implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected UserDownloadPK userDownloadPK;

    public UserDownload() {
    }

    public UserDownload(UserDownloadPK userDownloadPK) {
        this.userDownloadPK = userDownloadPK;
    }

    public UserDownload(String userId, String rsrcId, Date udUptDate) {
        this.userDownloadPK = new UserDownloadPK(userId, rsrcId, udUptDate);
    }

    public UserDownloadPK getUserDownloadPK() {
        return userDownloadPK;
    }

    public void setUserDownloadPK(UserDownloadPK userDownloadPK) {
        this.userDownloadPK = userDownloadPK;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (userDownloadPK != null ? userDownloadPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UserDownload)) {
            return false;
        }
        UserDownload other = (UserDownload) object;
        if ((this.userDownloadPK == null && other.userDownloadPK != null) || (this.userDownloadPK != null && !this.userDownloadPK.equals(other.userDownloadPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.cxxcow.UserDownload[ userDownloadPK=" + userDownloadPK + " ]";
    }
    
}
