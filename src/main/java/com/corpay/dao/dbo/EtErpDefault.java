/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

/**
 *
 * @author Sukant.Tiwari
 */
@Entity
@Table(name = "ET_ERP_DEFAULT", catalog = "", schema = "DBO")
@NamedQueries({
    @NamedQuery(name = "EtErpDefault.findAll", query = "SELECT e FROM EtErpDefault e")})
public class EtErpDefault implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ERP_NM")
    private String erpNm;
    @Basic(optional = false)
    @Lob
    @Column(name = "CONFIGURATION_FILE")
    private String configurationFile;
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "etErpDefault", fetch = FetchType.LAZY)
    private Set<EtTenantErp> etTenantErpSet;

    public EtErpDefault() {
    }

    public EtErpDefault(String erpNm) {
        this.erpNm = erpNm;
    }

    public EtErpDefault(String erpNm, String configurationFile, Date crtTs, String crtUsr, Date mdyTs, String mdyUsr, Serializable db2GeneratedRowidForLobs) {
        this.erpNm = erpNm;
        this.configurationFile = configurationFile;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.mdyTs = mdyTs;
        this.mdyUsr = mdyUsr;
        this.db2GeneratedRowidForLobs = db2GeneratedRowidForLobs;
    }

    public String getErpNm() {
        return erpNm;
    }

    public void setErpNm(String erpNm) {
        this.erpNm = erpNm;
    }

    public String getConfigurationFile() {
        return configurationFile;
    }

    public void setConfigurationFile(String configurationFile) {
        this.configurationFile = configurationFile;
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

    public Set<EtTenantErp> getEtTenantErpSet() {
        return etTenantErpSet;
    }

    public void setEtTenantErpSet(Set<EtTenantErp> etTenantErpSet) {
        this.etTenantErpSet = etTenantErpSet;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (erpNm != null ? erpNm.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EtErpDefault)) {
            return false;
        }
        EtErpDefault other = (EtErpDefault) object;
        if ((this.erpNm == null && other.erpNm != null) || (this.erpNm != null && !this.erpNm.equals(other.erpNm))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.EtErpDefault[ erpNm=" + erpNm + " ]";
    }
    
}
