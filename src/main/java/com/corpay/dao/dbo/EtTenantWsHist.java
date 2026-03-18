package com.corpay.dao.dbo;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "ET_TENANT_WS_HIST", catalog = "", schema = "DBO")
public class EtTenantWsHist implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private Long id;
    @Basic(optional = false)
    @Column(name = "TENANT_ID")
    private String tenantId;
    @Basic(optional = false)
    @Column(name = "TABLE_NM")
    private String tableNm;
    @Basic(optional = false)
    @Lob
    @Column(name = "PAYLOAD")
    private String payload;
    @Basic(optional = false)
    @Column(name = "PAYLOAD_UPLOAD_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date payloadUploadTs;
    @Basic(optional = false)
    @Column(name = "CRT_TS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date crtTs;
    @Basic(optional = false)
    @Column(name = "CRT_USR")
    private String crtUsr;
    @Basic(optional = false)
    @Column(name = "DB2_GENERATED_ROWID_FOR_LOBS")
    private Serializable db2GeneratedRowidForLobs;

    public EtTenantWsHist() {
    }

    public EtTenantWsHist(Long id) {
        this.id = id;
    }

    public EtTenantWsHist(Long id, String tenantId, String tableNm, String payload, Date payloadUploadTs, Date crtTs, String crtUsr, Serializable db2GeneratedRowidForLobs) {
        this.id = id;
        this.tenantId = tenantId;
        this.tableNm = tableNm;
        this.payload = payload;
        this.payloadUploadTs = payloadUploadTs;
        this.crtTs = crtTs;
        this.crtUsr = crtUsr;
        this.db2GeneratedRowidForLobs = db2GeneratedRowidForLobs;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public String getTableNm() {
        return tableNm;
    }

    public void setTableNm(String tableNm) {
        this.tableNm = tableNm;
    }

    public String getPayload() {
        return payload;
    }

    public void setPayload(String payload) {
        this.payload = payload;
    }

    public Date getPayloadUploadTs() {
        return payloadUploadTs;
    }

    public void setPayloadUploadTs(Date payloadUploadTs) {
        this.payloadUploadTs = payloadUploadTs;
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

    public Serializable getDb2GeneratedRowidForLobs() {
        return db2GeneratedRowidForLobs;
    }

    public void setDb2GeneratedRowidForLobs(Serializable db2GeneratedRowidForLobs) {
        this.db2GeneratedRowidForLobs = db2GeneratedRowidForLobs;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof EtTenantWsHist)) {
            return false;
        }
        EtTenantWsHist other = (EtTenantWsHist) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.corpay.dao.dbo.EtTenantWsHist[ id=" + id + " ]";
    }

}
