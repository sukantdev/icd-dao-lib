package com.corpay.dao.cxxcow;

import jakarta.persistence.Basic;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.io.Serializable;
import java.util.Collection;

@Entity
@Table(name = "RESOURCE_APPL", catalog = "", schema = "CXXCOW")
public class ResourceAppl implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ResourceApplPK resourceApplPK;
    @Basic(optional = false)
    @Column(name = "RESAP_DESC")
    private String resapDesc;
    @JoinColumn(name = "RSRC_ID", referencedColumnName = "RSRC_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Resources resources;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "resourceAppl")
    private Collection<UserResrcappl> userResrcapplCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "resourceAppl")
    private Collection<GroupResrcappl> groupResrcapplCollection;

    public ResourceAppl() {
    }

    public ResourceAppl(ResourceApplPK resourceApplPK) {
        this.resourceApplPK = resourceApplPK;
    }

    public ResourceAppl(ResourceApplPK resourceApplPK, String resapDesc) {
        this.resourceApplPK = resourceApplPK;
        this.resapDesc = resapDesc;
    }

    public ResourceAppl(String apresId, String rsrcId) {
        this.resourceApplPK = new ResourceApplPK(apresId, rsrcId);
    }

    public ResourceApplPK getResourceApplPK() {
        return resourceApplPK;
    }

    public void setResourceApplPK(ResourceApplPK resourceApplPK) {
        this.resourceApplPK = resourceApplPK;
    }

    public String getResapDesc() {
        return resapDesc;
    }

    public void setResapDesc(String resapDesc) {
        this.resapDesc = resapDesc;
    }

    public Resources getResources() {
        return resources;
    }

    public void setResources(Resources resources) {
        this.resources = resources;
    }

    public Collection<UserResrcappl> getUserResrcapplCollection() {
        return userResrcapplCollection;
    }

    public void setUserResrcapplCollection(Collection<UserResrcappl> userResrcapplCollection) {
        this.userResrcapplCollection = userResrcapplCollection;
    }

    public Collection<GroupResrcappl> getGroupResrcapplCollection() {
        return groupResrcapplCollection;
    }

    public void setGroupResrcapplCollection(Collection<GroupResrcappl> groupResrcapplCollection) {
        this.groupResrcapplCollection = groupResrcapplCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (resourceApplPK != null ? resourceApplPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof ResourceAppl)) {
            return false;
        }
        ResourceAppl other = (ResourceAppl) object;
        if ((this.resourceApplPK == null && other.resourceApplPK != null) || (this.resourceApplPK != null && !this.resourceApplPK.equals(other.resourceApplPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.cxxcow.ResourceAppl[ resourceApplPK=" + resourceApplPK + " ]";
    }

}
