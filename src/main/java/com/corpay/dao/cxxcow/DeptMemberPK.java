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
public class DeptMemberPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "DM_NAME")
    private String dmName;
    @Basic(optional = false)
    @Column(name = "DEPT_CODE")
    private String deptCode;

    public DeptMemberPK() {
    }

    public DeptMemberPK(String dmName, String deptCode) {
        this.dmName = dmName;
        this.deptCode = deptCode;
    }

    public String getDmName() {
        return dmName;
    }

    public void setDmName(String dmName) {
        this.dmName = dmName;
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (dmName != null ? dmName.hashCode() : 0);
        hash += (deptCode != null ? deptCode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DeptMemberPK)) {
            return false;
        }
        DeptMemberPK other = (DeptMemberPK) object;
        if ((this.dmName == null && other.dmName != null) || (this.dmName != null && !this.dmName.equals(other.dmName))) {
            return false;
        }
        if ((this.deptCode == null && other.deptCode != null) || (this.deptCode != null && !this.deptCode.equals(other.deptCode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.cxxcow.DeptMemberPK[ dmName=" + dmName + ", deptCode=" + deptCode + " ]";
    }
    
}
