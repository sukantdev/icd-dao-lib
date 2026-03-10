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
@Table(name = "PREWS_CUSTTYPE_MST", catalog = "", schema = "CXXCOW")
@NamedQueries({
    @NamedQuery(name = "PrewsCusttypeMst.findAll", query = "SELECT p FROM PrewsCusttypeMst p"),
    @NamedQuery(name = "PrewsCusttypeMst.findByCustTypeId", query = "SELECT p FROM PrewsCusttypeMst p WHERE p.custTypeId = :custTypeId"),
    @NamedQuery(name = "PrewsCusttypeMst.findByCustTypeNm", query = "SELECT p FROM PrewsCusttypeMst p WHERE p.custTypeNm = :custTypeNm"),
    @NamedQuery(name = "PrewsCusttypeMst.findByCustTypeDesc", query = "SELECT p FROM PrewsCusttypeMst p WHERE p.custTypeDesc = :custTypeDesc"),
    @NamedQuery(name = "PrewsCusttypeMst.findByCustTypeFlag", query = "SELECT p FROM PrewsCusttypeMst p WHERE p.custTypeFlag = :custTypeFlag"),
    @NamedQuery(name = "PrewsCusttypeMst.findByCrtTs", query = "SELECT p FROM PrewsCusttypeMst p WHERE p.crtTs = :crtTs"),
    @NamedQuery(name = "PrewsCusttypeMst.findByCrtUsr", query = "SELECT p FROM PrewsCusttypeMst p WHERE p.crtUsr = :crtUsr"),
    @NamedQuery(name = "PrewsCusttypeMst.findByMdyTs", query = "SELECT p FROM PrewsCusttypeMst p WHERE p.mdyTs = :mdyTs"),
    @NamedQuery(name = "PrewsCusttypeMst.findByMdyUsr", query = "SELECT p FROM PrewsCusttypeMst p WHERE p.mdyUsr = :mdyUsr")})
public class PrewsCusttypeMst implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CUST_TYPE_ID")
    private Integer custTypeId;
    @Basic(optional = false)
    @Column(name = "CUST_TYPE_NM")
    private String custTypeNm;
    @Column(name = "CUST_TYPE_DESC")
    private String custTypeDesc;
    @Basic(optional = false)
    @Column(name = "CUST_TYPE_FLAG")
    private int custTypeFlag;
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

    public PrewsCusttypeMst() {
    }

    public PrewsCusttypeMst(Integer custTypeId) {
        this.custTypeId = custTypeId;
    }

    public PrewsCusttypeMst(Integer custTypeId, String custTypeNm, int custTypeFlag, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr) {
        this.custTypeId = custTypeId;
        this.custTypeNm = custTypeNm;
        this.custTypeFlag = custTypeFlag;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
    }

    public Integer getCustTypeId() {
        return custTypeId;
    }

    public void setCustTypeId(Integer custTypeId) {
        this.custTypeId = custTypeId;
    }

    public String getCustTypeNm() {
        return custTypeNm;
    }

    public void setCustTypeNm(String custTypeNm) {
        this.custTypeNm = custTypeNm;
    }

    public String getCustTypeDesc() {
        return custTypeDesc;
    }

    public void setCustTypeDesc(String custTypeDesc) {
        this.custTypeDesc = custTypeDesc;
    }

    public int getCustTypeFlag() {
        return custTypeFlag;
    }

    public void setCustTypeFlag(int custTypeFlag) {
        this.custTypeFlag = custTypeFlag;
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
        hash += (custTypeId != null ? custTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PrewsCusttypeMst)) {
            return false;
        }
        PrewsCusttypeMst other = (PrewsCusttypeMst) object;
        if ((this.custTypeId == null && other.custTypeId != null) || (this.custTypeId != null && !this.custTypeId.equals(other.custTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.cxxcow.PrewsCusttypeMst[ custTypeId=" + custTypeId + " ]";
    }
    
}
