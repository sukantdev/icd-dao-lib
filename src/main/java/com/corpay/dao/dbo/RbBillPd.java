/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.corpay.dao.dbo;

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
@Table(name = "RB_BILL_PD", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "RbBillPd.findAll", query = "SELECT r FROM RbBillPd r")})
public class RbBillPd implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "BILL_PD_ID")
    private Long billPdId;
    @Basic(optional = false)
    @Column(name = "BILL_PD_NM")
    private String billPdNm;
    @Basic(optional = false)
    @Column(name = "COMM")
    private String comm;
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
    @Basic(optional = false)
    @Column(name = "BILL_PD_CD")
    private String billPdCd;

    public RbBillPd() {
    }

    public RbBillPd(Long billPdId) {
        this.billPdId = billPdId;
    }

    public RbBillPd(Long billPdId, String billPdNm, String comm, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr, String billPdCd) {
        this.billPdId = billPdId;
        this.billPdNm = billPdNm;
        this.comm = comm;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
        this.billPdCd = billPdCd;
    }

    public Long getBillPdId() {
        return billPdId;
    }

    public void setBillPdId(Long billPdId) {
        this.billPdId = billPdId;
    }

    public String getBillPdNm() {
        return billPdNm;
    }

    public void setBillPdNm(String billPdNm) {
        this.billPdNm = billPdNm;
    }

    public String getComm() {
        return comm;
    }

    public void setComm(String comm) {
        this.comm = comm;
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

    public String getBillPdCd() {
        return billPdCd;
    }

    public void setBillPdCd(String billPdCd) {
        this.billPdCd = billPdCd;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (billPdId != null ? billPdId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RbBillPd)) {
            return false;
        }
        RbBillPd other = (RbBillPd) object;
        if ((this.billPdId == null && other.billPdId != null) || (this.billPdId != null && !this.billPdId.equals(other.billPdId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.RbBillPd[ billPdId=" + billPdId + " ]";
    }
    
}
