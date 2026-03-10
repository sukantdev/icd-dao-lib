/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.corpay.dao.cxxcow;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinColumns;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;
import java.io.Serializable;

/**
 *
 * @author Sukant.Tiwari
 */
@Entity
@Table(name = "USER_RESRCAPPL", catalog = "", schema = "CXXCOW")
@NamedQueries({
    @NamedQuery(name = "UserResrcappl.findAll", query = "SELECT u FROM UserResrcappl u"),
    @NamedQuery(name = "UserResrcappl.findByApresId", query = "SELECT u FROM UserResrcappl u WHERE u.userResrcapplPK.apresId = :apresId"),
    @NamedQuery(name = "UserResrcappl.findByRsrcId", query = "SELECT u FROM UserResrcappl u WHERE u.userResrcapplPK.rsrcId = :rsrcId"),
    @NamedQuery(name = "UserResrcappl.findByUserId", query = "SELECT u FROM UserResrcappl u WHERE u.userResrcapplPK.userId = :userId"),
    @NamedQuery(name = "UserResrcappl.findByUserrsraValue", query = "SELECT u FROM UserResrcappl u WHERE u.userrsraValue = :userrsraValue")})
public class UserResrcappl implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected UserResrcapplPK userResrcapplPK;
    @Basic(optional = false)
    @Column(name = "USERRSRA_VALUE")
    private String userrsraValue;
    @JoinColumns({
        @JoinColumn(name = "APRES_ID", referencedColumnName = "APRES_ID", insertable = false, updatable = false),
        @JoinColumn(name = "RSRC_ID", referencedColumnName = "RSRC_ID", insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private ResourceAppl resourceAppl;

    public UserResrcappl() {
    }

    public UserResrcappl(UserResrcapplPK userResrcapplPK) {
        this.userResrcapplPK = userResrcapplPK;
    }

    public UserResrcappl(UserResrcapplPK userResrcapplPK, String userrsraValue) {
        this.userResrcapplPK = userResrcapplPK;
        this.userrsraValue = userrsraValue;
    }

    public UserResrcappl(String apresId, String rsrcId, String userId) {
        this.userResrcapplPK = new UserResrcapplPK(apresId, rsrcId, userId);
    }

    public UserResrcapplPK getUserResrcapplPK() {
        return userResrcapplPK;
    }

    public void setUserResrcapplPK(UserResrcapplPK userResrcapplPK) {
        this.userResrcapplPK = userResrcapplPK;
    }

    public String getUserrsraValue() {
        return userrsraValue;
    }

    public void setUserrsraValue(String userrsraValue) {
        this.userrsraValue = userrsraValue;
    }

    public ResourceAppl getResourceAppl() {
        return resourceAppl;
    }

    public void setResourceAppl(ResourceAppl resourceAppl) {
        this.resourceAppl = resourceAppl;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (userResrcapplPK != null ? userResrcapplPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UserResrcappl)) {
            return false;
        }
        UserResrcappl other = (UserResrcappl) object;
        if ((this.userResrcapplPK == null && other.userResrcapplPK != null) || (this.userResrcapplPK != null && !this.userResrcapplPK.equals(other.userResrcapplPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.cxxcow.UserResrcappl[ userResrcapplPK=" + userResrcapplPK + " ]";
    }
    
}
