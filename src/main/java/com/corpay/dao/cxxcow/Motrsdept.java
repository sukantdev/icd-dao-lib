package com.corpay.dao.cxxcow;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "MOTRSDEPT", catalog = "", schema = "CXXCOW")
public class Motrsdept implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "DEPT_CODE")
    private String deptCode;
    @Basic(optional = false)
    @Column(name = "DEPT_DESC")
    private String deptDesc;

    public Motrsdept() {
    }

    public Motrsdept(String deptCode) {
        this.deptCode = deptCode;
    }

    public Motrsdept(String deptCode, String deptDesc) {
        this.deptCode = deptCode;
        this.deptDesc = deptDesc;
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public String getDeptDesc() {
        return deptDesc;
    }

    public void setDeptDesc(String deptDesc) {
        this.deptDesc = deptDesc;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (deptCode != null ? deptCode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof Motrsdept)) {
            return false;
        }
        Motrsdept other = (Motrsdept) object;
        if ((this.deptCode == null && other.deptCode != null) || (this.deptCode != null && !this.deptCode.equals(other.deptCode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.cxxcow.Motrsdept[ deptCode=" + deptCode + " ]";
    }

}
