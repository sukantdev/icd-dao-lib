package com.corpay.dao.cxxcow;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinColumns;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "USER_RESRCAPPL", catalog = "", schema = "CXXCOW")
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
