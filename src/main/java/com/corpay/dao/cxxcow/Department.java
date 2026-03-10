/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.corpay.dao.cxxcow;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Sukant.Tiwari
 */
@Entity
@Table(name = "DEPARTMENT", catalog = "", schema = "CXXCOW")
@NamedQueries({
    @NamedQuery(name = "Department.findAll", query = "SELECT d FROM Department d"),
    @NamedQuery(name = "Department.findByDptId", query = "SELECT d FROM Department d WHERE d.dptId = :dptId"),
    @NamedQuery(name = "Department.findByDptTyp", query = "SELECT d FROM Department d WHERE d.dptTyp = :dptTyp"),
    @NamedQuery(name = "Department.findByCompNbr", query = "SELECT d FROM Department d WHERE d.compNbr = :compNbr"),
    @NamedQuery(name = "Department.findByDptNbr", query = "SELECT d FROM Department d WHERE d.dptNbr = :dptNbr"),
    @NamedQuery(name = "Department.findByDptDesc", query = "SELECT d FROM Department d WHERE d.dptDesc = :dptDesc"),
    @NamedQuery(name = "Department.findByActFlg", query = "SELECT d FROM Department d WHERE d.actFlg = :actFlg"),
    @NamedQuery(name = "Department.findByDptOrderBy", query = "SELECT d FROM Department d WHERE d.dptOrderBy = :dptOrderBy"),
    @NamedQuery(name = "Department.findByCrtTs", query = "SELECT d FROM Department d WHERE d.crtTs = :crtTs"),
    @NamedQuery(name = "Department.findByCrtUsr", query = "SELECT d FROM Department d WHERE d.crtUsr = :crtUsr"),
    @NamedQuery(name = "Department.findByMdyTs", query = "SELECT d FROM Department d WHERE d.mdyTs = :mdyTs"),
    @NamedQuery(name = "Department.findByMdyUsr", query = "SELECT d FROM Department d WHERE d.mdyUsr = :mdyUsr")})
public class Department implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "DPT_ID")
    private String dptId;
    @Basic(optional = false)
    @Column(name = "DPT_TYP")
    private String dptTyp;
    @Basic(optional = false)
    @Column(name = "COMP_NBR")
    private String compNbr;
    @Basic(optional = false)
    @Column(name = "DPT_NBR")
    private String dptNbr;
    @Basic(optional = false)
    @Column(name = "DPT_DESC")
    private String dptDesc;
    @Basic(optional = false)
    @Column(name = "ACT_FLG")
    private Character actFlg;
    @Basic(optional = false)
    @Column(name = "DPT_ORDER_BY")
    private short dptOrderBy;
    @Basic(optional = false)
    @Column(name = "CRT_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date crtTs;
    @Basic(optional = false)
    @Column(name = "CRT_USR")
    private String crtUsr;
    @Basic(optional = false)
    @Column(name = "MDY_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date mdyTs;
    @Basic(optional = false)
    @Column(name = "MDY_USR")
    private String mdyUsr;

    public Department() {
    }

    public Department(String dptId) {
        this.dptId = dptId;
    }

    public Department(String dptId, String dptTyp, String compNbr, String dptNbr, String dptDesc, Character actFlg, short dptOrderBy, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.dptId = dptId;
        this.dptTyp = dptTyp;
        this.compNbr = compNbr;
        this.dptNbr = dptNbr;
        this.dptDesc = dptDesc;
        this.actFlg = actFlg;
        this.dptOrderBy = dptOrderBy;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public String getDptId() {
        return dptId;
    }

    public void setDptId(String dptId) {
        this.dptId = dptId;
    }

    public String getDptTyp() {
        return dptTyp;
    }

    public void setDptTyp(String dptTyp) {
        this.dptTyp = dptTyp;
    }

    public String getCompNbr() {
        return compNbr;
    }

    public void setCompNbr(String compNbr) {
        this.compNbr = compNbr;
    }

    public String getDptNbr() {
        return dptNbr;
    }

    public void setDptNbr(String dptNbr) {
        this.dptNbr = dptNbr;
    }

    public String getDptDesc() {
        return dptDesc;
    }

    public void setDptDesc(String dptDesc) {
        this.dptDesc = dptDesc;
    }

    public Character getActFlg() {
        return actFlg;
    }

    public void setActFlg(Character actFlg) {
        this.actFlg = actFlg;
    }

    public short getDptOrderBy() {
        return dptOrderBy;
    }

    public void setDptOrderBy(short dptOrderBy) {
        this.dptOrderBy = dptOrderBy;
    }

    public Date getCrtTs() {
        return crtTs;
    }

    public void setCrtTs(Date crtTs) {
        this.crtTs = crtTs;
    }

    public String getCrtUsr() {
        return crtUsr;
    }

    public void setCrtUsr(String crtUsr) {
        this.crtUsr = crtUsr;
    }

    public Date getMdyTs() {
        return mdyTs;
    }

    public void setMdyTs(Date mdyTs) {
        this.mdyTs = mdyTs;
    }

    public String getMdyUsr() {
        return mdyUsr;
    }

    public void setMdyUsr(String mdyUsr) {
        this.mdyUsr = mdyUsr;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (dptId != null ? dptId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Department)) {
            return false;
        }
        Department other = (Department) object;
        if ((this.dptId == null && other.dptId != null) || (this.dptId != null && !this.dptId.equals(other.dptId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.cxxcow.Department[ dptId=" + dptId + " ]";
    }
    
}
