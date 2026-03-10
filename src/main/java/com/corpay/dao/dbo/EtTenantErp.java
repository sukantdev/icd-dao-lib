/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
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
@Table(name = "ET_TENANT_ERP", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "EtTenantErp.findAll", query = "SELECT e FROM EtTenantErp e")})
public class EtTenantErp implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected EtTenantErpPK etTenantErpPK;
    @Basic(optional = false)
    @Lob
    @Column(name = "OVRD_FILE")
    private String ovrdFile;
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
    @Column(name = "DB2_GENERATED_ROWID_FOR_LOBS")
    private Serializable db2GeneratedRowidForLobs;
    @JoinColumn(name = "ERP_NM", referencedColumnName = "ERP_NM", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private EtErpDefault etErpDefault;

    public EtTenantErp() {
    }

    public EtTenantErp(EtTenantErpPK etTenantErpPK) {
        this.etTenantErpPK = etTenantErpPK;
    }

    public EtTenantErp(EtTenantErpPK etTenantErpPK, String ovrdFile, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr, Serializable db2GeneratedRowidForLobs) {
        this.etTenantErpPK = etTenantErpPK;
        this.ovrdFile = ovrdFile;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
        this.db2GeneratedRowidForLobs = db2GeneratedRowidForLobs;
    }

    public EtTenantErp(String tenantId, String erpNm, String ovrdNm) {
        this.etTenantErpPK = new EtTenantErpPK(tenantId, erpNm, ovrdNm);
    }

    public EtTenantErpPK getEtTenantErpPK() {
        return etTenantErpPK;
    }

    public void setEtTenantErpPK(EtTenantErpPK etTenantErpPK) {
        this.etTenantErpPK = etTenantErpPK;
    }

    public String getOvrdFile() {
        return ovrdFile;
    }

    public void setOvrdFile(String ovrdFile) {
        this.ovrdFile = ovrdFile;
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

    public Serializable getDb2GeneratedRowidForLobs() {
        return db2GeneratedRowidForLobs;
    }

    public void setDb2GeneratedRowidForLobs(Serializable db2GeneratedRowidForLobs) {
        this.db2GeneratedRowidForLobs = db2GeneratedRowidForLobs;
    }

    public EtErpDefault getEtErpDefault() {
        return etErpDefault;
    }

    public void setEtErpDefault(EtErpDefault etErpDefault) {
        this.etErpDefault = etErpDefault;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (etTenantErpPK != null ? etTenantErpPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EtTenantErp)) {
            return false;
        }
        EtTenantErp other = (EtTenantErp) object;
        if ((this.etTenantErpPK == null && other.etTenantErpPK != null) || (this.etTenantErpPK != null && !this.etTenantErpPK.equals(other.etTenantErpPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.EtTenantErp[ etTenantErpPK=" + etTenantErpPK + " ]";
    }
    
}
