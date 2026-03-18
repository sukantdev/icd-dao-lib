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
@Table(name = "GROUP_RESRCAPPL", catalog = "", schema = "CXXCOW")
public class GroupResrcappl implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected GroupResrcapplPK groupResrcapplPK;
    @Basic(optional = false)
    @Column(name = "GRPRSCA_VALUE")
    private String grprscaValue;
    @JoinColumn(name = "GROUP_ID", referencedColumnName = "GROUP_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Groups groups;
    @JoinColumns({
        @JoinColumn(name = "APRES_ID", referencedColumnName = "APRES_ID", insertable = false, updatable = false),
        @JoinColumn(name = "RSRC_ID", referencedColumnName = "RSRC_ID", insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private ResourceAppl resourceAppl;

    public GroupResrcappl() {
    }

    public GroupResrcappl(GroupResrcapplPK groupResrcapplPK) {
        this.groupResrcapplPK = groupResrcapplPK;
    }

    public GroupResrcappl(GroupResrcapplPK groupResrcapplPK, String grprscaValue) {
        this.groupResrcapplPK = groupResrcapplPK;
        this.grprscaValue = grprscaValue;
    }

    public GroupResrcappl(String apresId, String rsrcId, String groupId) {
        this.groupResrcapplPK = new GroupResrcapplPK(apresId, rsrcId, groupId);
    }

    public GroupResrcapplPK getGroupResrcapplPK() {
        return groupResrcapplPK;
    }

    public void setGroupResrcapplPK(GroupResrcapplPK groupResrcapplPK) {
        this.groupResrcapplPK = groupResrcapplPK;
    }

    public String getGrprscaValue() {
        return grprscaValue;
    }

    public void setGrprscaValue(String grprscaValue) {
        this.grprscaValue = grprscaValue;
    }

    public Groups getGroups() {
        return groups;
    }

    public void setGroups(Groups groups) {
        this.groups = groups;
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
        hash += (groupResrcapplPK != null ? groupResrcapplPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof GroupResrcappl)) {
            return false;
        }
        GroupResrcappl other = (GroupResrcappl) object;
        if ((this.groupResrcapplPK == null && other.groupResrcapplPK != null) || (this.groupResrcapplPK != null && !this.groupResrcapplPK.equals(other.groupResrcapplPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.cxxcow.GroupResrcappl[ groupResrcapplPK=" + groupResrcapplPK + " ]";
    }

}
