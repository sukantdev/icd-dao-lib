/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.corpay.dao.cxxcow;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;
import java.io.Serializable;

/**
 *
 * @author Sukant.Tiwari
 */
@Entity
@Table(name = "DEPT_MEMBER", catalog = "", schema = "CXXCOW")
@NamedQueries({
    @NamedQuery(name = "DeptMember.findAll", query = "SELECT d FROM DeptMember d"),
    @NamedQuery(name = "DeptMember.findByDmName", query = "SELECT d FROM DeptMember d WHERE d.deptMemberPK.dmName = :dmName"),
    @NamedQuery(name = "DeptMember.findByDeptCode", query = "SELECT d FROM DeptMember d WHERE d.deptMemberPK.deptCode = :deptCode"),
    @NamedQuery(name = "DeptMember.findByDmEmail", query = "SELECT d FROM DeptMember d WHERE d.dmEmail = :dmEmail")})
public class DeptMember implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DeptMemberPK deptMemberPK;
    @Basic(optional = false)
    @Column(name = "DM_EMAIL")
    private String dmEmail;

    public DeptMember() {
    }

    public DeptMember(DeptMemberPK deptMemberPK) {
        this.deptMemberPK = deptMemberPK;
    }

    public DeptMember(DeptMemberPK deptMemberPK, String dmEmail) {
        this.deptMemberPK = deptMemberPK;
        this.dmEmail = dmEmail;
    }

    public DeptMember(String dmName, String deptCode) {
        this.deptMemberPK = new DeptMemberPK(dmName, deptCode);
    }

    public DeptMemberPK getDeptMemberPK() {
        return deptMemberPK;
    }

    public void setDeptMemberPK(DeptMemberPK deptMemberPK) {
        this.deptMemberPK = deptMemberPK;
    }

    public String getDmEmail() {
        return dmEmail;
    }

    public void setDmEmail(String dmEmail) {
        this.dmEmail = dmEmail;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (deptMemberPK != null ? deptMemberPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DeptMember)) {
            return false;
        }
        DeptMember other = (DeptMember) object;
        if ((this.deptMemberPK == null && other.deptMemberPK != null) || (this.deptMemberPK != null && !this.deptMemberPK.equals(other.deptMemberPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.cxxcow.DeptMember[ deptMemberPK=" + deptMemberPK + " ]";
    }
    
}
