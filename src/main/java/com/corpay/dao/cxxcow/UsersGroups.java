package com.corpay.dao.cxxcow;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "USERS_GROUPS", catalog = "", schema = "CXXCOW")
public class UsersGroups implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected UsersGroupsPK usersGroupsPK;
    @Basic(optional = false)
    @Column(name = "USRGP_UPT_DTE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date usrgpUptDte;
    @Basic(optional = false)
    @Column(name = "USRGP_UPT_USR")
    private String usrgpUptUsr;
    @JoinColumn(name = "GROUP_ID", referencedColumnName = "GROUP_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Groups groups;

    public UsersGroups() {
    }

    public UsersGroups(UsersGroupsPK usersGroupsPK) {
        this.usersGroupsPK = usersGroupsPK;
    }

    public UsersGroups(UsersGroupsPK usersGroupsPK, Date usrgpUptDte, String usrgpUptUsr) {
        this.usersGroupsPK = usersGroupsPK;
        this.usrgpUptDte = usrgpUptDte;
        this.usrgpUptUsr = usrgpUptUsr;
    }

    public UsersGroups(String groupId, String userId) {
        this.usersGroupsPK = new UsersGroupsPK(groupId, userId);
    }

    public UsersGroupsPK getUsersGroupsPK() {
        return usersGroupsPK;
    }

    public void setUsersGroupsPK(UsersGroupsPK usersGroupsPK) {
        this.usersGroupsPK = usersGroupsPK;
    }

    public Date getUsrgpUptDte() {
        return usrgpUptDte;
    }

    public void setUsrgpUptDte(Date usrgpUptDte) {
        this.usrgpUptDte = usrgpUptDte;
    }

    public String getUsrgpUptUsr() {
        return usrgpUptUsr;
    }

    public void setUsrgpUptUsr(String usrgpUptUsr) {
        this.usrgpUptUsr = usrgpUptUsr;
    }

    public Groups getGroups() {
        return groups;
    }

    public void setGroups(Groups groups) {
        this.groups = groups;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (usersGroupsPK != null ? usersGroupsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof UsersGroups)) {
            return false;
        }
        UsersGroups other = (UsersGroups) object;
        if ((this.usersGroupsPK == null && other.usersGroupsPK != null) || (this.usersGroupsPK != null && !this.usersGroupsPK.equals(other.usersGroupsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.cxxcow.UsersGroups[ usersGroupsPK=" + usersGroupsPK + " ]";
    }

}
